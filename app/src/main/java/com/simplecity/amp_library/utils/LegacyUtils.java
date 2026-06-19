package com.simplecity.amp_library.utils;

import android.os.Environment;
import android.support.annotation.NonNull;
import com.simplecity.amp_library.ShuttleApplication;
import io.reactivex.Completable;
import java.io.File;

public class LegacyUtils {

    private static final String TAG = "LegacyUtils";

    private LegacyUtils() {

    }

    @NonNull
    public static Completable deleteOldResources(ShuttleApplication application) {
        return Completable.fromAction(() -> {
            //Delete albumthumbs/artists directory
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                File file = new File(Environment.getExternalStorageDirectory() + "/albumthumbs/artists/");
                if (file.exists() && file.isDirectory()) {
                    File[] files = file.listFiles();
                    if (files != null) {
                        for (File child : files) {
                            deleteFile(child);
                        }
                    }
                    deleteFile(file);
                }
            }

            //Delete old http cache
            File oldHttpCache = application.getDiskCacheDir("http");
            if (oldHttpCache != null && oldHttpCache.exists()) {
                deleteFile(oldHttpCache);
            }

            //Delete old thumbs cache
            File oldThumbsCache = application.getDiskCacheDir("thumbs");
            if (oldThumbsCache != null && oldThumbsCache.exists()) {
                deleteFile(oldThumbsCache);
            }
        });
    }

    private static void deleteFile(File file) {
        if (!file.delete()) {
            LogUtils.log(TAG, "Failed to delete legacy file: " + file.getAbsolutePath());
        }
    }
}

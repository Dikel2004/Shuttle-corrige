package com.simplecity.amp_library.ui.views

import com.simplecity.amp_library.model.Playlist
import com.simplecity.amp_library.model.Song
import com.simplecity.amp_library.ui.screens.nowplaying.PlayerView

abstract class PlayerViewAdapter : PlayerView {

    override fun setSeekProgress(progress: Int) {
        // Optional hook for views that expose seek progress.
    }

    override fun currentTimeVisibilityChanged(visible: Boolean) {
        // Optional hook for views that expose the current time.
    }

    override fun currentTimeChanged(seconds: Long) {
        // Optional hook for views that expose the current time.
    }

    override fun totalTimeChanged(seconds: Long) {
        // Optional hook for views that expose the total time.
    }

    override fun queueChanged(queuePosition: Int, queueLength: Int) {
        // Optional hook for views that expose queue position.
    }

    override fun playbackChanged(isPlaying: Boolean) {
        // Optional hook for views that expose playback state.
    }

    override fun shuffleChanged(shuffleMode: Int) {
        // Optional hook for views that expose shuffle state.
    }

    override fun repeatChanged(repeatMode: Int) {
        // Optional hook for views that expose repeat state.
    }

    override fun favoriteChanged(isFavorite: Boolean) {
        // Optional hook for views that expose favorite state.
    }

    override fun trackInfoChanged(song: Song?) {
        // Optional hook for views that expose track metadata.
    }

    override fun showLyricsDialog() {
        // Optional hook for views that support lyrics.
    }

    override fun showUpgradeDialog() {
        // Optional hook for views that expose upgrade prompts.
    }

    override fun presentCreatePlaylistDialog(songs: List<Song>) {
        // Optional hook for views that support playlist creation.
    }

    override fun presentSongInfoDialog(song: Song) {
        // Optional hook for views that support song details.
    }

    override fun onSongsAddedToPlaylist(playlist: Playlist, numSongs: Int) {
        // Optional hook for views that show playlist updates.
    }

    override fun onSongsAddedToQueue(numSongs: Int) {
        // Optional hook for views that show queue updates.
    }

    override fun presentTagEditorDialog(song: Song) {
        // Optional hook for views that support tag editing.
    }

    override fun presentDeleteDialog(songs: List<Song>) {
        // Optional hook for views that support deletion.
    }

    override fun shareSong(song: Song) {
        // Optional hook for views that support sharing.
    }

    override fun presentRingtonePermissionDialog() {
        // Optional hook for views that support ringtone actions.
    }

    override fun showRingtoneSetMessage() {
        // Optional hook for views that show ringtone status.
    }
}

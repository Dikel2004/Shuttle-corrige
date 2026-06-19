package com.simplecityapps.recycler_adapter.adapter;

public class CompletionListUpdateCallbackAdapter implements CompletionListUpdateCallback {

    @Override
    public void onInserted(int position, int count) {
        // Optional callback.
    }

    @Override
    public void onRemoved(int position, int count) {
        // Optional callback.
    }

    @Override
    public void onMoved(int fromPosition, int toPosition) {
        // Optional callback.
    }

    @Override
    public void onChanged(int position, int count, Object payload) {
        // Optional callback.
    }

    public void onComplete() {
        // Optional callback.
    }
}

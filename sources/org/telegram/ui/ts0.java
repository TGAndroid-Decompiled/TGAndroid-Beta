package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class ts0 implements Runnable {
    public final PhotoViewer f40851a;

    public ts0(PhotoViewer photoViewer) {
        this.f40851a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f40851a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}

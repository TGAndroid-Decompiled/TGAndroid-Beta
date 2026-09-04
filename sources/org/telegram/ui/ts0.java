package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class ts0 implements Runnable {
    public final PhotoViewer f40824a;

    public ts0(PhotoViewer photoViewer) {
        this.f40824a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f40824a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}

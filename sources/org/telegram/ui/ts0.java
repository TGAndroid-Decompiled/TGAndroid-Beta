package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class ts0 implements Runnable {
    public final PhotoViewer f42292a;

    public ts0(PhotoViewer photoViewer) {
        this.f42292a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f42292a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}

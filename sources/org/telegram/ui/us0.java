package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class us0 implements Runnable {
    public final PhotoViewer f38157a;

    public us0(PhotoViewer photoViewer) {
        this.f38157a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f38157a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}

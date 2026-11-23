package org.telegram.ui;
public final class vo0 implements org.telegram.ui.Components.y20 {
    public final PhotoViewer f52842a;

    public vo0(PhotoViewer photoViewer) {
        this.f52842a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.f52842a;
        photoViewer.P4 = -1;
        org.telegram.messenger.ic icVar = photoViewer.f43256j5;
        if (icVar != null) {
            icVar.a();
            photoViewer.f43256j5 = null;
        }
        photoViewer.f43273l5 = true;
        photoViewer.z2(i7);
        photoViewer.f43273l5 = false;
    }
}

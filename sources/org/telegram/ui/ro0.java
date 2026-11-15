package org.telegram.ui;
public final class ro0 implements org.telegram.ui.Components.n20 {
    public final PhotoViewer f50988a;

    public ro0(PhotoViewer photoViewer) {
        this.f50988a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.f50988a;
        photoViewer.P4 = -1;
        org.telegram.messenger.ic icVar = photoViewer.f42801j5;
        if (icVar != null) {
            icVar.a();
            photoViewer.f42801j5 = null;
        }
        photoViewer.f42818l5 = true;
        photoViewer.z2(i7);
        photoViewer.f42818l5 = false;
    }
}

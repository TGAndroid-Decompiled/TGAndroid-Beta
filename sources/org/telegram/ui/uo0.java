package org.telegram.ui;
public final class uo0 implements org.telegram.ui.Components.y20 {
    public final PhotoViewer f52615a;

    public uo0(PhotoViewer photoViewer) {
        this.f52615a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.f52615a;
        photoViewer.P4 = -1;
        org.telegram.messenger.ic icVar = photoViewer.f43291j5;
        if (icVar != null) {
            icVar.a();
            photoViewer.f43291j5 = null;
        }
        photoViewer.f43308l5 = true;
        photoViewer.z2(i7);
        photoViewer.f43308l5 = false;
    }
}

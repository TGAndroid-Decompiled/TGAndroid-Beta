package org.telegram.ui;
public final class uo0 implements org.telegram.ui.Components.y20 {
    public final PhotoViewer f52611a;

    public uo0(PhotoViewer photoViewer) {
        this.f52611a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.f52611a;
        photoViewer.P4 = -1;
        org.telegram.messenger.hc hcVar = photoViewer.f43287j5;
        if (hcVar != null) {
            hcVar.a();
            photoViewer.f43287j5 = null;
        }
        photoViewer.f43304l5 = true;
        photoViewer.z2(i7);
        photoViewer.f43304l5 = false;
    }
}

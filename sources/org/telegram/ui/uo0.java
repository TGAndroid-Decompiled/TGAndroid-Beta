package org.telegram.ui;
public final class uo0 implements org.telegram.ui.Components.v20 {
    public final PhotoViewer f52594a;

    public uo0(PhotoViewer photoViewer) {
        this.f52594a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.f52594a;
        photoViewer.P4 = -1;
        org.telegram.messenger.hc hcVar = photoViewer.f43246j5;
        if (hcVar != null) {
            hcVar.a();
            photoViewer.f43246j5 = null;
        }
        photoViewer.f43263l5 = true;
        photoViewer.z2(i7);
        photoViewer.f43263l5 = false;
    }
}

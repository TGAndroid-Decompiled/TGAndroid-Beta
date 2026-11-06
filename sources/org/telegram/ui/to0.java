package org.telegram.ui;
public final class to0 implements org.telegram.ui.Components.k20 {
    public final PhotoViewer f50114a;

    public to0(PhotoViewer photoViewer) {
        this.f50114a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.f50114a;
        photoViewer.O4 = -1;
        org.telegram.messenger.jc jcVar = photoViewer.f41421i5;
        if (jcVar != null) {
            jcVar.a();
            photoViewer.f41421i5 = null;
        }
        photoViewer.f41437k5 = true;
        photoViewer.y2(i7);
        photoViewer.f41437k5 = false;
    }
}

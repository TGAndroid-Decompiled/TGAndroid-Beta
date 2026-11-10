package org.telegram.ui;
public final class wo0 implements org.telegram.ui.Components.k20 {
    public final PhotoViewer f51413a;

    public wo0(PhotoViewer photoViewer) {
        this.f51413a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.f51413a;
        photoViewer.O4 = -1;
        org.telegram.messenger.jc jcVar = photoViewer.f41423i5;
        if (jcVar != null) {
            jcVar.a();
            photoViewer.f41423i5 = null;
        }
        photoViewer.f41439k5 = true;
        photoViewer.y2(i7);
        photoViewer.f41439k5 = false;
    }
}

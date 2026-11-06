package org.telegram.ui;
public final class to0 implements org.telegram.ui.Components.k20 {
    public final PhotoViewer f50115a;

    public to0(PhotoViewer photoViewer) {
        this.f50115a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.f50115a;
        photoViewer.O4 = -1;
        org.telegram.messenger.jc jcVar = photoViewer.f41422i5;
        if (jcVar != null) {
            jcVar.a();
            photoViewer.f41422i5 = null;
        }
        photoViewer.f41438k5 = true;
        photoViewer.y2(i7);
        photoViewer.f41438k5 = false;
    }
}

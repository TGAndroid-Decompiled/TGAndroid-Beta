package org.telegram.ui;
public final class so0 implements org.telegram.ui.Components.k20 {
    public final PhotoViewer f49787a;

    public so0(PhotoViewer photoViewer) {
        this.f49787a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.f49787a;
        photoViewer.O4 = -1;
        org.telegram.messenger.jc jcVar = photoViewer.f41397i5;
        if (jcVar != null) {
            jcVar.a();
            photoViewer.f41397i5 = null;
        }
        photoViewer.f41413k5 = true;
        photoViewer.y2(i7);
        photoViewer.f41413k5 = false;
    }
}

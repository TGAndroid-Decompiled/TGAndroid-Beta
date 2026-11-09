package org.telegram.ui;
public final class vo0 implements org.telegram.ui.Components.l20 {
    public final PhotoViewer f50739a;

    public vo0(PhotoViewer photoViewer) {
        this.f50739a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.f50739a;
        photoViewer.O4 = -1;
        org.telegram.messenger.jc jcVar = photoViewer.f41432i5;
        if (jcVar != null) {
            jcVar.a();
            photoViewer.f41432i5 = null;
        }
        photoViewer.f41448k5 = true;
        photoViewer.y2(i7);
        photoViewer.f41448k5 = false;
    }
}

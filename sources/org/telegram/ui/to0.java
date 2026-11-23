package org.telegram.ui;
public final class to0 implements org.telegram.ui.Components.v20 {
    public final PhotoViewer f52439a;

    public to0(PhotoViewer photoViewer) {
        this.f52439a = photoViewer;
    }

    public final void a(int i7) {
        PhotoViewer photoViewer = this.f52439a;
        photoViewer.P4 = -1;
        org.telegram.messenger.hc hcVar = photoViewer.f43372j5;
        if (hcVar != null) {
            hcVar.a();
            photoViewer.f43372j5 = null;
        }
        photoViewer.f43389l5 = true;
        photoViewer.A2(i7);
        photoViewer.f43389l5 = false;
    }
}

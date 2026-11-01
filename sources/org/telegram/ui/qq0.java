package org.telegram.ui;
public final class qq0 extends org.telegram.ui.Components.a00 {
    public final zp0 e;
    public final PhotoViewer f40884f;

    public qq0(PhotoViewer photoViewer, zp0 zp0Var) {
        super(false);
        this.f40884f = photoViewer;
        this.e = zp0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f40884f;
        int[] iArr = photoViewer.f33548m3;
        sb2.append(org.telegram.messenger.dd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.dd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f33558n3;
        sb4.append(org.telegram.messenger.dd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.dd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.dd.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f40884f.f33584q3.c();
    }

    @Override
    public final void l(float f7) {
        this.e.c(f7);
        PhotoViewer photoViewer = this.f40884f;
        photoViewer.f33584q3.h(false, f7);
        photoViewer.f33593r3.invalidate();
    }
}

package org.telegram.ui;
public final class sq0 extends org.telegram.ui.Components.a00 {
    public final bq0 e;
    public final PhotoViewer f41634f;

    public sq0(PhotoViewer photoViewer, bq0 bq0Var) {
        super(false);
        this.f41634f = photoViewer;
        this.e = bq0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f41634f;
        int[] iArr = photoViewer.f33541m3;
        sb2.append(org.telegram.messenger.cd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.cd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f33551n3;
        sb4.append(org.telegram.messenger.cd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.cd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.cd.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f41634f.f33577q3.c();
    }

    @Override
    public final void l(float f7) {
        this.e.c(f7);
        PhotoViewer photoViewer = this.f41634f;
        photoViewer.f33577q3.h(false, f7);
        photoViewer.f33586r3.invalidate();
    }
}

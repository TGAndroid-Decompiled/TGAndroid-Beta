package org.telegram.ui;
public final class zo0 extends org.telegram.ui.Components.jz {
    public final io0 f52722e;
    public final PhotoViewer f52723f;

    public zo0(PhotoViewer photoViewer, io0 io0Var) {
        super(false);
        this.f52723f = photoViewer;
        this.f52722e = io0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f52723f;
        int[] iArr = photoViewer.f41490n3;
        sb2.append(org.telegram.messenger.bd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.bd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f41498o3;
        sb4.append(org.telegram.messenger.bd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.bd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.bd.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f52723f.f41526r3.c();
    }

    @Override
    public final void l(float f10) {
        this.f52722e.c(f10);
        PhotoViewer photoViewer = this.f52723f;
        photoViewer.f41526r3.h(false, f10);
        photoViewer.f41535s3.invalidate();
    }
}

package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qs0 extends org.telegram.ui.Components.u00 {
    public final xr0 e;
    public final PhotoViewer f37837f;

    public qs0(PhotoViewer photoViewer, xr0 xr0Var) {
        super(false);
        this.f37837f = photoViewer;
        this.e = xr0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        PhotoViewer photoViewer = this.f37837f;
        int[] iArr = photoViewer.f31780j3;
        sb.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb.append(' ');
        sb.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        int[] iArr2 = photoViewer.f31789k3;
        sb3.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb3.append(' ');
        sb3.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2, sb3.toString());
    }

    @Override
    public final float k() {
        return this.f37837f.f31815n3.c();
    }

    @Override
    public final void l(float f10) {
        this.e.b(f10);
        PhotoViewer photoViewer = this.f37837f;
        photoViewer.f31815n3.h(f10, false);
        photoViewer.f31824o3.invalidate();
    }
}

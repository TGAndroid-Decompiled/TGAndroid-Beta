package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ys0 extends org.telegram.ui.Components.d10 {
    public final gs0 e;
    public final PhotoViewer f46104f;

    public ys0(PhotoViewer photoViewer, gs0 gs0Var) {
        super(false);
        this.f46104f = photoViewer;
        this.e = gs0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f46104f;
        int[] iArr = photoViewer.f35717m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f35727n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f46104f.f35754q3.c();
    }

    @Override
    public final void l(float f7) {
        this.e.c(f7);
        PhotoViewer photoViewer = this.f46104f;
        photoViewer.f35754q3.h(f7, false);
        photoViewer.f35763r3.invalidate();
    }
}

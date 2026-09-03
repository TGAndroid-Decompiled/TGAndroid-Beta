package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xs0 extends org.telegram.ui.Components.v00 {
    public final es0 e;
    public final PhotoViewer f40063f;

    public xs0(PhotoViewer photoViewer, es0 es0Var) {
        super(false);
        this.f40063f = photoViewer;
        this.e = es0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        PhotoViewer photoViewer = this.f40063f;
        int[] iArr = photoViewer.f31754j3;
        sb.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb.append(' ');
        sb.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        int[] iArr2 = photoViewer.f31763k3;
        sb3.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb3.append(' ');
        sb3.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2, sb3.toString());
    }

    @Override
    public final float k() {
        return this.f40063f.f31789n3.c();
    }

    @Override
    public final void l(float f10) {
        this.e.b(f10);
        PhotoViewer photoViewer = this.f40063f;
        photoViewer.f31789n3.h(f10, false);
        photoViewer.f31798o3.invalidate();
    }
}

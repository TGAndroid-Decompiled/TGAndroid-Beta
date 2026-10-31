package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
public final class xo0 implements org.telegram.messenger.j20 {
    public final int f43612a;
    public final PhotoViewer f43613b;

    public xo0(PhotoViewer photoViewer, int i10) {
        this.f43612a = i10;
        this.f43613b = photoViewer;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f43612a;
        PhotoViewer photoViewer = this.f43613b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.a2((ClickableSpan) obj, (TextView) obj2);
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.E0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                return;
        }
    }
}

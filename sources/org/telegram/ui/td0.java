package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
public final class td0 implements ViewSwitcher.ViewFactory {
    public final int f49785a;
    public final Object f49786b;

    public td0(Object obj, int i3) {
        this.f49785a = i3;
        this.f49786b = obj;
    }

    @Override
    public final View makeView() {
        int i3;
        int i10 = this.f49785a;
        Object obj = this.f49786b;
        switch (i10) {
            case 0:
                TextView textView = new TextView((Context) obj);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                org.telegram.ui.ActionBar.r6.E(textView, org.telegram.ui.ActionBar.k6.H6, null);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (org.telegram.messenger.bd.f21784a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                textView.setGravity(i3 | 1);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.D6, null);
                textView2.setGravity(1);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setTextSize(1, 15.0f);
                return textView2;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.V8;
                return new bq0(photoViewer.F, photoViewer.U1, photoViewer.R, new fn0(photoViewer, 0), new qd0(photoViewer, 1));
        }
    }
}

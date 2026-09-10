package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class sg0 implements ViewSwitcher.ViewFactory {
    public final int f36677a;
    public final Object f36678b;

    public sg0(Object obj, int i10) {
        this.f36677a = i10;
        this.f36678b = obj;
    }

    @Override
    public final View makeView() {
        int i10;
        int i11 = this.f36677a;
        Object obj = this.f36678b;
        switch (i11) {
            case 0:
                TextView textView = new TextView((Context) obj);
                textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                textView.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 1);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.D6, null, false, textView2, 1);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setTextSize(1, 15.0f);
                return textView2;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                return new qu0(photoViewer.E, photoViewer.T1, photoViewer.Q, new pr0(photoViewer, 0), new og0(photoViewer, 1));
        }
    }
}

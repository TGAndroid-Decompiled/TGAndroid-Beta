package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class ut extends org.telegram.ui.Cells.h5 {
    public final int e;
    public final org.telegram.ui.Cells.i9 f44527f;
    public final org.telegram.ui.Cells.a9[] h;
    public final AnimatorSet[] f44528n;
    public final DataAutoDownloadActivity f44529r;

    public ut(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i10, org.telegram.ui.Cells.i9 i9Var, org.telegram.ui.Cells.a9[] a9VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        int i11;
        int i12;
        int i13;
        this.f44529r = dataAutoDownloadActivity;
        this.e = i10;
        this.f44527f = i9Var;
        this.h = a9VarArr;
        this.f44528n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.f24192a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, null);
        org.telegram.messenger.vh.r(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(textView, org.telegram.ui.Components.gb1.h(-1, -1.0f, i12 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f24193b = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23537n5, null);
        org.telegram.messenger.vh.r(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        textView2.setGravity(i13 | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, org.telegram.ui.Components.gb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.i0 i0Var = new org.telegram.ui.Cells.i0(activity);
        this.f24194c = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new org.telegram.ui.Cells.g5(this));
        i0Var.setImportantForAccessibility(2);
        addView(i0Var, org.telegram.ui.Components.gb1.h(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(i0Var.getSeekBarAccessibilityDelegate());
    }
}

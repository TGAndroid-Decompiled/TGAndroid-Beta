package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class tt extends org.telegram.ui.Cells.c5 {
    public final int e;
    public final org.telegram.ui.Cells.d9 f41739f;
    public final org.telegram.ui.Cells.v8[] h;
    public final AnimatorSet[] f41740n;
    public final DataAutoDownloadActivity f41741r;

    public tt(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i10, org.telegram.ui.Cells.d9 d9Var, org.telegram.ui.Cells.v8[] v8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        int i11;
        int i12;
        int i13;
        this.f41741r = dataAutoDownloadActivity;
        this.e = i10;
        this.f41739f = d9Var;
        this.h = v8VarArr;
        this.f41740n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.f22085a = textView;
        org.telegram.messenger.kk.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21093j5, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
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
        addView(textView, w7.z5.d(-1, -1.0f, i12 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f22086b = textView2;
        org.telegram.messenger.kk.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21169n5, false), 1, 16.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        textView2.setGravity(i13 | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.j0 j0Var = new org.telegram.ui.Cells.j0(activity);
        this.f22087c = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new org.telegram.ui.Cells.b5(this));
        j0Var.setImportantForAccessibility(2);
        addView(j0Var, w7.z5.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(j0Var.getSeekBarAccessibilityDelegate());
    }
}

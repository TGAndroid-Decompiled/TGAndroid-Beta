package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class ys extends org.telegram.ui.Cells.c5 {
    public final int f54420e;
    public final org.telegram.ui.Cells.z8 f54421f;
    public final org.telegram.ui.Cells.r8[] h;
    public final AnimatorSet[] f54422n;
    public final DataAutoDownloadActivity f54423r;

    public ys(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i7, org.telegram.ui.Cells.z8 z8Var, org.telegram.ui.Cells.r8[] r8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        int i10;
        int i11;
        int i12;
        this.f54423r = dataAutoDownloadActivity;
        this.f54420e = i7;
        this.f54421f = z8Var;
        this.h = r8VarArr;
        this.f54422n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.f30559a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, null);
        org.telegram.messenger.m10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, c8.na.d(-1, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f30560b = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29632n5, null);
        org.telegram.messenger.m10.q(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.gd.f24314a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        textView2.setGravity(i12 | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, c8.na.d(-2, -1.0f, (org.telegram.messenger.gd.f24314a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.i0 i0Var = new org.telegram.ui.Cells.i0(activity);
        this.f30561c = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new org.telegram.ui.ActionBar.i5(this));
        i0Var.setImportantForAccessibility(2);
        addView(i0Var, c8.na.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(i0Var.getSeekBarAccessibilityDelegate());
    }
}

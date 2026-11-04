package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class ts extends org.telegram.ui.Cells.b5 {
    public final int f49877e;
    public final org.telegram.ui.Cells.y8 f49878f;
    public final org.telegram.ui.Cells.q8[] h;
    public final AnimatorSet[] f49879n;
    public final DataAutoDownloadActivity f49880r;

    public ts(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i3, org.telegram.ui.Cells.y8 y8Var, org.telegram.ui.Cells.q8[] q8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        int i10;
        int i11;
        int i12;
        this.f49880r = dataAutoDownloadActivity;
        this.f49877e = i3;
        this.f49878f = y8Var;
        this.h = q8VarArr;
        this.f49879n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.f28989a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, b8.mf.d(-1, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f28990b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28061n5, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.bd.f21784a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        textView2.setGravity(i12 | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, b8.mf.d(-2, -1.0f, (org.telegram.messenger.bd.f21784a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.h0 h0Var = new org.telegram.ui.Cells.h0(activity);
        this.f28991c = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new gi.w5(this, 28));
        h0Var.setImportantForAccessibility(2);
        addView(h0Var, b8.mf.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(h0Var.getSeekBarAccessibilityDelegate());
    }
}

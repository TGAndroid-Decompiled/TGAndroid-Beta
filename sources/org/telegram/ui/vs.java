package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class vs extends org.telegram.ui.Cells.b5 {
    public final int f50818e;
    public final org.telegram.ui.Cells.z8 f50819f;
    public final org.telegram.ui.Cells.r8[] h;
    public final AnimatorSet[] f50820n;
    public final DataAutoDownloadActivity f50821r;

    public vs(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i7, org.telegram.ui.Cells.z8 z8Var, org.telegram.ui.Cells.r8[] r8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        int i10;
        int i11;
        int i12;
        this.f50821r = dataAutoDownloadActivity;
        this.f50818e = i7;
        this.f50819f = z8Var;
        this.h = r8VarArr;
        this.f50820n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.f28930a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27957j5, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.hd.f22878a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        if (org.telegram.messenger.hd.f22878a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, c8.ha.d(-1, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f28931b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28030n5, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.hd.f22878a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        textView2.setGravity(i12 | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, c8.ha.d(-2, -1.0f, (org.telegram.messenger.hd.f22878a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.h0 h0Var = new org.telegram.ui.Cells.h0(activity);
        this.f28932c = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new g6.d0(this, 29));
        h0Var.setImportantForAccessibility(2);
        addView(h0Var, c8.ha.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(h0Var.getSeekBarAccessibilityDelegate());
    }
}

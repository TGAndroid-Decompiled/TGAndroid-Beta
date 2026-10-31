package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class yt extends org.telegram.ui.Cells.f5 {
    public final int e;
    public final org.telegram.ui.Cells.b9 f43888f;
    public final org.telegram.ui.Cells.t8[] h;
    public final AnimatorSet[] f43889n;
    public final DataAutoDownloadActivity f43890r;

    public yt(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i10, org.telegram.ui.Cells.b9 b9Var, org.telegram.ui.Cells.t8[] t8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        int i11;
        int i12;
        int i13;
        this.f43890r = dataAutoDownloadActivity;
        this.e = i10;
        this.f43888f = b9Var;
        this.h = t8VarArr;
        this.f43889n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.f21894a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, null);
        org.telegram.messenger.z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        if (org.telegram.messenger.cd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(textView, w7.b6.d(-1, -1.0f, i12 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f21895b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21114n5, null);
        org.telegram.messenger.z20.o(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.cd.X) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        textView2.setGravity(i13 | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, w7.b6.d(-2, -1.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.h0 h0Var = new org.telegram.ui.Cells.h0(activity);
        this.f21896c = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new l2.f(this, 13));
        h0Var.setImportantForAccessibility(2);
        addView(h0Var, w7.b6.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(h0Var.getSeekBarAccessibilityDelegate());
    }
}

package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;

public final class yt extends org.telegram.ui.Cells.a5 {

    public final int f44894e;

    public final org.telegram.ui.Cells.x8 f44895f;
    public final org.telegram.ui.Cells.p8[] h;

    public final AnimatorSet[] f44896n;

    public final DataAutoDownloadActivity f44897r;

    public yt(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i10, org.telegram.ui.Cells.x8 x8Var, org.telegram.ui.Cells.p8[] p8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        this.f44897r = dataAutoDownloadActivity;
        this.f44894e = i10;
        this.f44895f = x8Var;
        this.h = p8VarArr;
        this.f44896n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.f24060a = textView;
        org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, h7.z5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f24061b = textView2;
        org.telegram.messenger.rl.p(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23233n5, false), 1, 16.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.j0 j0Var = new org.telegram.ui.Cells.j0(activity);
        this.f24062c = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new org.telegram.ui.Cells.z4(this));
        j0Var.setImportantForAccessibility(2);
        addView(j0Var, h7.z5.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(j0Var.getSeekBarAccessibilityDelegate());
    }
}

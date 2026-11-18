package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class t10 extends org.telegram.ui.Components.b8 {
    public final Activity E;
    public final f40 F;

    public t10(f40 f40Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.F = f40Var;
        this.E = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.E);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.Yg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.c31(20, this, textView));
        return textView;
    }
}

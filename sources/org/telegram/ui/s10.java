package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class s10 extends org.telegram.ui.Components.z7 {
    public final Activity E;
    public final e40 F;

    public s10(e40 e40Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.F = e40Var;
        this.E = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.E);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.Yg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.p31(18, this, textView));
        return textView;
    }
}

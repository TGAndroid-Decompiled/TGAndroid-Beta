package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class t10 extends org.telegram.ui.Components.w7 {
    public final Activity D;
    public final e40 E;

    public t10(e40 e40Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = e40Var;
        this.D = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.D);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.l6.Vg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.u41(16, this, textView));
        return textView;
    }
}

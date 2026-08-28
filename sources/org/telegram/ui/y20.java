package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y20 extends org.telegram.ui.Components.w7 {
    public final o50 A;
    public final Activity f44690y;

    public y20(o50 o50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.A = o50Var;
        this.f44690y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f44690y);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23083hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.vh0(26, this, textView));
        return textView;
    }
}

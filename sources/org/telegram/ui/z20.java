package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class z20 extends org.telegram.ui.Components.e8 {
    public final q50 E;
    public final Activity f43618y;

    public z20(q50 q50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = q50Var;
        this.f43618y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f43618y);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21069hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.i51(19, this, textView));
        return textView;
    }
}

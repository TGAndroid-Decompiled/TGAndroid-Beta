package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w30 extends org.telegram.ui.Components.g8 {
    public final n60 E;
    public final Activity f40854y;

    public w30(n60 n60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = n60Var;
        this.f40854y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f40854y);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19680hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new xv(9, this, textView));
        return textView;
    }
}

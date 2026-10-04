package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s30 extends org.telegram.ui.Components.d8 {
    public final h60 E;
    public final Activity f40343y;

    public s30(h60 h60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = h60Var;
        this.f40343y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f40343y);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20898hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new tv(9, this, textView));
        return textView;
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s30 extends org.telegram.ui.Components.e8 {
    public final j60 E;
    public final Activity f40322y;

    public s30(j60 j60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = j60Var;
        this.f40322y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f40322y);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20770hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new tv(9, this, textView));
        return textView;
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t30 extends org.telegram.ui.Components.d8 {
    public final j60 E;
    public final Activity f36829y;

    public t30(j60 j60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = j60Var;
        this.f36829y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f36829y);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18007hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new ow(6, this, textView));
        return textView;
    }
}

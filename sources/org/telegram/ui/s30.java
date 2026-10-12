package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s30 extends org.telegram.ui.Components.f8 {
    public final i60 E;
    public final Activity f41795y;

    public s30(i60 i60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = i60Var;
        this.f41795y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f41795y);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20641hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new uv(9, this, textView));
        return textView;
    }
}

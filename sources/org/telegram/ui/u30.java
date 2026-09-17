package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u30 extends org.telegram.ui.Components.b8 {
    public final k60 E;
    public final Activity f37929y;

    public u30(k60 k60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = k60Var;
        this.f37929y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f37929y);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18942hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new uv(9, this, textView));
        return textView;
    }
}

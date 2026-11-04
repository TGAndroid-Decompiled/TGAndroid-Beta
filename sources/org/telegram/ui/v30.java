package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class v30 extends LinearLayout {
    public final org.telegram.ui.Components.h6 f50371a;
    public float f50372b;
    public final x30 f50373c;

    public v30(x30 x30Var, Context context) {
        super(context);
        this.f50373c = x30Var;
        this.f50372b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, false, false);
        this.f50371a = h6Var;
        h6Var.setTextColor(-1);
        h6Var.setTextSize(org.telegram.messenger.g0.L(46.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.bd.M0(2131743456, null));
        addView(h6Var, b8.mf.o(-1, 46));
        addView(textView, b8.mf.o(-2, -2));
    }

    public void setWatchersCount(int i3) {
        String E = org.telegram.messenger.bd.E(i3, ',');
        org.telegram.ui.Components.h6 h6Var = this.f50371a;
        float measureText = h6Var.getPaint().measureText((CharSequence) E, 0, E.length());
        if (this.f50372b != measureText) {
            int i10 = org.telegram.ui.ActionBar.k6.zk;
            x30 x30Var = this.f50373c;
            h6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{org.telegram.ui.ActionBar.k6.w0(i10, x30Var.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bk, x30Var.J0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f50372b = measureText;
        }
        h6Var.setText(E);
    }
}

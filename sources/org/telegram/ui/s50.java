package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s50 extends LinearLayout {
    public final org.telegram.ui.Components.o6 f41299a;
    public float f41300b;
    public final u50 f41301c;

    public s50(u50 u50Var, Context context) {
        super(context);
        this.f41301c = u50Var;
        this.f41300b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
        this.f41299a = o6Var;
        o6Var.setTextColor(-1);
        o6Var.setTextSize(AndroidUtilities.dp(46.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(o6Var, w7.z5.n(-1, 46));
        addView(textView, w7.z5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.o6 o6Var = this.f41299a;
        float measureText = o6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f41300b != measureText) {
            int i11 = org.telegram.ui.ActionBar.k6.Lj;
            u50 u50Var = this.f41301c;
            o6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{u50Var.getThemedColor(i11), u50Var.getThemedColor(org.telegram.ui.ActionBar.k6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f41300b = measureText;
        }
        o6Var.setText(formatNumber);
    }
}

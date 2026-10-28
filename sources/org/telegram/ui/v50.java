package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v50 extends LinearLayout {
    public final org.telegram.ui.Components.s6 f44186a;
    public float f44187b;
    public final x50 f44188c;

    public v50(x50 x50Var, Context context) {
        super(context);
        this.f44188c = x50Var;
        this.f44187b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, false, false);
        this.f44186a = s6Var;
        s6Var.setTextColor(-1);
        s6Var.setTextSize(AndroidUtilities.dp(46.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        ic.a.o(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(s6Var, org.telegram.ui.Components.kb1.r(-1, 46));
        addView(textView, org.telegram.ui.Components.kb1.r(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.s6 s6Var = this.f44186a;
        float measureText = s6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f44187b != measureText) {
            int i11 = org.telegram.ui.ActionBar.y6.Lj;
            x50 x50Var = this.f44188c;
            s6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{x50Var.getThemedColor(i11), x50Var.getThemedColor(org.telegram.ui.ActionBar.y6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f44187b = measureText;
        }
        s6Var.setText(formatNumber);
    }
}

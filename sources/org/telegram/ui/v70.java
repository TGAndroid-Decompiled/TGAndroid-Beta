package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v70 extends LinearLayout {
    public final org.telegram.ui.Components.nu f40600a;
    public boolean f40601b;
    public int f40602c;
    public d20 d;
    public String e;
    public final u70 f40603f;
    public final y70 h;

    public v70(y70 y70Var, Context context) {
        super(context);
        this.h = y70Var;
        this.f40603f = new u70(this);
        TextView f7 = org.telegram.messenger.g0.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.nu nuVar = new org.telegram.ui.Components.nu(context, null);
        this.f40600a = nuVar;
        nuVar.setLines(1);
        nuVar.setSingleLine(true);
        nuVar.setInputType(16384);
        nuVar.setTextSize(1, 16.0f);
        nuVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ud, false));
        nuVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hc, false));
        nuVar.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19924uf, false));
        int i10 = org.telegram.ui.ActionBar.g6.Vd;
        nuVar.setHintColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        nuVar.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        nuVar.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Wd, false));
        nuVar.setHandlesColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19942vf, false));
        nuVar.setBackground(null);
        nuVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(nuVar, w7.z5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40601b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.f19722k0);
        }
    }
}

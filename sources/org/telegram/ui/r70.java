package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r70 extends LinearLayout {
    public final org.telegram.ui.Components.uu f41519a;
    public boolean f41520b;
    public int f41521c;
    public org.telegram.ui.Components.voip.y d;
    public String f41522e;
    public final q70 f41523f;
    public final v70 h;

    public r70(v70 v70Var, Context context) {
        super(context);
        this.h = v70Var;
        this.f41523f = new q70(this);
        TextView g10 = org.telegram.messenger.v0.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20667j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.uu uuVar = new org.telegram.ui.Components.uu(context, null);
        this.f41519a = uuVar;
        uuVar.setLines(1);
        uuVar.setSingleLine(true);
        uuVar.setInputType(16384);
        uuVar.setTextSize(1, 16.0f);
        uuVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ud, false));
        uuVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20636hc, false));
        uuVar.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20883uf, false));
        int i10 = org.telegram.ui.ActionBar.h6.Vd;
        uuVar.setHintColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        uuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        uuVar.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Wd, false));
        uuVar.setHandlesColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20900vf, false));
        uuVar.setBackground(null);
        uuVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.w5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(uuVar, w7.w5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41520b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f20681k0);
        }
    }
}

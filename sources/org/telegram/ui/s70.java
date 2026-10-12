package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s70 extends LinearLayout {
    public final org.telegram.ui.Components.uu f41826a;
    public boolean f41827b;
    public int f41828c;
    public org.telegram.ui.Components.voip.p d;
    public String f41829e;
    public final r70 f41830f;
    public final v70 h;

    public s70(v70 v70Var, Context context) {
        super(context);
        this.h = v70Var;
        this.f41830f = new r70(this);
        TextView g10 = org.telegram.messenger.v0.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20668j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.uu uuVar = new org.telegram.ui.Components.uu(context, null);
        this.f41826a = uuVar;
        uuVar.setLines(1);
        uuVar.setSingleLine(true);
        uuVar.setInputType(16384);
        uuVar.setTextSize(1, 16.0f);
        uuVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ud, false));
        uuVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20637hc, false));
        uuVar.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20884uf, false));
        int i10 = org.telegram.ui.ActionBar.h6.Vd;
        uuVar.setHintColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        uuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        uuVar.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Wd, false));
        uuVar.setHandlesColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20901vf, false));
        uuVar.setBackground(null);
        uuVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.w5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(uuVar, w7.w5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41827b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f20682k0);
        }
    }
}

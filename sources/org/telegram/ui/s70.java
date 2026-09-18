package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s70 extends LinearLayout {
    public final org.telegram.ui.Components.bu f37402a;
    public boolean f37403b;
    public int f37404c;
    public mw d;
    public String e;
    public final r70 f37405f;
    public final v70 h;

    public s70(v70 v70Var, Context context) {
        super(context);
        this.h = v70Var;
        this.f37405f = new r70(this);
        TextView g10 = org.telegram.messenger.w1.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18970j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.bu buVar = new org.telegram.ui.Components.bu(context, null);
        this.f37402a = buVar;
        buVar.setLines(1);
        buVar.setSingleLine(true);
        buVar.setInputType(16384);
        buVar.setTextSize(1, 16.0f);
        buVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ud, false));
        buVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18940hc, false));
        buVar.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19184uf, false));
        int i10 = org.telegram.ui.ActionBar.j6.Vd;
        buVar.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        buVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        buVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wd, false));
        buVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19201vf, false));
        buVar.setBackground(null);
        buVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.x5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(buVar, w7.x5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37403b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.f18985k0);
        }
    }
}

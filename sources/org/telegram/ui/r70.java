package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r70 extends LinearLayout {
    public final org.telegram.ui.Components.zt f40084a;
    public boolean f40085b;
    public int f40086c;
    public yt d;
    public String f40087e;
    public final q70 f40088f;
    public final u70 h;

    public r70(u70 u70Var, Context context) {
        super(context);
        this.h = u70Var;
        this.f40088f = new q70(this);
        TextView g10 = org.telegram.messenger.w1.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20770j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.zt ztVar = new org.telegram.ui.Components.zt(context, null);
        this.f40084a = ztVar;
        ztVar.setLines(1);
        ztVar.setSingleLine(true);
        ztVar.setInputType(16384);
        ztVar.setTextSize(1, 16.0f);
        ztVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ud, false));
        ztVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20740hc, false));
        ztVar.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20981uf, false));
        int i10 = org.telegram.ui.ActionBar.j6.Vd;
        ztVar.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ztVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ztVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wd, false));
        ztVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20998vf, false));
        ztVar.setBackground(null);
        ztVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.x5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ztVar, w7.x5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40085b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.f20785k0);
        }
    }
}

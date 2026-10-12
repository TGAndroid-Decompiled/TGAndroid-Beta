package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v70 extends LinearLayout {
    public final org.telegram.ui.Components.nu f40913a;
    public boolean f40914b;
    public int f40915c;
    public o00 d;
    public String e;
    public final u70 f40916f;
    public final y70 h;

    public v70(y70 y70Var, Context context) {
        super(context);
        this.h = y70Var;
        this.f40916f = new u70(this);
        TextView g10 = org.telegram.messenger.q.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20007j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.nu nuVar = new org.telegram.ui.Components.nu(context, null);
        this.f40913a = nuVar;
        nuVar.setLines(1);
        nuVar.setSingleLine(true);
        nuVar.setInputType(16384);
        nuVar.setTextSize(1, 16.0f);
        nuVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ud, false));
        nuVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hc, false));
        nuVar.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20224uf, false));
        int i10 = org.telegram.ui.ActionBar.g6.Vd;
        nuVar.setHintColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        nuVar.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        nuVar.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Wd, false));
        nuVar.setHandlesColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20242vf, false));
        nuVar.setBackground(null);
        nuVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.a6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(nuVar, w7.a6.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40914b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.f20022k0);
        }
    }
}

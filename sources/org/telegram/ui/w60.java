package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w60 extends LinearLayout {
    public final org.telegram.ui.Components.mt f43680a;
    public boolean f43681b;
    public int f43682c;
    public x20 d;
    public String f43683e;
    public final v60 f43684f;
    public final z60 h;

    public w60(z60 z60Var, Context context) {
        super(context);
        this.h = z60Var;
        this.f43684f = new v60(this);
        TextView g10 = org.telegram.messenger.l0.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.mt mtVar = new org.telegram.ui.Components.mt(context, null);
        this.f43680a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        mtVar.setInputType(16384);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ud, false));
        mtVar.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23079hc, false));
        mtVar.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23312uf, false));
        int i9 = org.telegram.ui.ActionBar.f6.Vd;
        mtVar.setHintColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        mtVar.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        mtVar.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Wd, false));
        mtVar.setHandlesColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23325vf, false));
        mtVar.setBackground(null);
        mtVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, g7.e6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(mtVar, g7.e6.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43681b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }
}

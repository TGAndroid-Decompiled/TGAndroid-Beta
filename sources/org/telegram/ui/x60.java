package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x60 extends LinearLayout {
    public final org.telegram.ui.Components.iu f43102a;
    public boolean f43103b;
    public int f43104c;
    public lt d;
    public String e;
    public final w60 f43105f;
    public final a70 h;

    public x60(a70 a70Var, Context context) {
        super(context);
        this.h = a70Var;
        this.f43105f = new w60(this);
        TextView f7 = org.telegram.messenger.g0.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21093j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.iu iuVar = new org.telegram.ui.Components.iu(context, null);
        this.f43102a = iuVar;
        iuVar.setLines(1);
        iuVar.setSingleLine(true);
        iuVar.setInputType(16384);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ud, false));
        iuVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hc, false));
        iuVar.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21311uf, false));
        int i10 = org.telegram.ui.ActionBar.h6.Vd;
        iuVar.setHintColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        iuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        iuVar.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Wd, false));
        iuVar.setHandlesColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21329vf, false));
        iuVar.setBackground(null);
        iuVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(iuVar, w7.z5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43103b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f21108k0);
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z60 extends LinearLayout {
    public final org.telegram.ui.Components.st f45088a;
    public boolean f45089b;
    public int f45090c;
    public org.telegram.ui.Components.voip.o d;
    public String f45091e;
    public final y60 f45092f;
    public final c70 h;

    public z60(c70 c70Var, Context context) {
        super(context);
        this.h = c70Var;
        this.f45092f = new y60(this);
        TextView h = org.telegram.messenger.x3.h(context, 1, 16.0f);
        h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
        h.setText("t.me/addemoji/");
        org.telegram.ui.Components.st stVar = new org.telegram.ui.Components.st(context, null);
        this.f45088a = stVar;
        stVar.setLines(1);
        stVar.setSingleLine(true);
        stVar.setInputType(16384);
        stVar.setTextSize(1, 16.0f);
        stVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ud, false));
        stVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hc, false));
        stVar.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23374uf, false));
        int i10 = org.telegram.ui.ActionBar.g6.Vd;
        stVar.setHintColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        stVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        stVar.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wd, false));
        stVar.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23392vf, false));
        stVar.setBackground(null);
        stVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(h, i7.f6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(stVar, i7.f6.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f45089b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }
}

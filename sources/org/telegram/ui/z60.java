package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class z60 extends LinearLayout {

    public final org.telegram.ui.Components.lt f45054a;

    public boolean f45055b;

    public int f45056c;
    public a30 d;

    public String f45057e;

    public final y60 f45058f;
    public final c70 h;

    public z60(c70 c70Var, Context context) {
        super(context);
        this.h = c70Var;
        this.f45058f = new y60(this);
        TextView textViewH = org.telegram.messenger.y1.h(context, 1, 16.0f);
        textViewH.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        textViewH.setText("t.me/addemoji/");
        org.telegram.ui.Components.lt ltVar = new org.telegram.ui.Components.lt(context, null);
        this.f45054a = ltVar;
        ltVar.setLines(1);
        ltVar.setSingleLine(true);
        ltVar.setInputType(16384);
        ltVar.setTextSize(1, 16.0f);
        ltVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ud, false));
        ltVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23131hc, false));
        ltVar.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23366uf, false));
        int i10 = org.telegram.ui.ActionBar.g6.Vd;
        ltVar.setHintColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ltVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ltVar.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wd, false));
        ltVar.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23382vf, false));
        ltVar.setBackground(null);
        ltVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(textViewH, h7.z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ltVar, h7.z5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f45055b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }
}

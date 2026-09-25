package xh;

import ai.o5;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.r61;
import w7.c6;
import w7.y5;
import yh.k5;
import yh.s5;
public final class r2 extends org.telegram.ui.ActionBar.e3 {
    public long f46388b;

    public r2(Context context, long j3, TL_stars.SavedStarGift savedStarGift, d6 d6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, d6Var, false);
        this.f46388b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = c6.b(context, 20.0f, h6.G6, true, d6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, y5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = c6.b(context, 14.0f, h6.f19443y6, false, d6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, y5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        k5 G = s5.y(this.currentAccount, false).G(j3, true);
        r61 r61Var = new r61(context, this.currentAccount, 0, false, new ai.m0(22, this, G), new s5.e(14, this, dVar), null, d6Var);
        r61Var.setSpanCount(3);
        r61Var.setOverScrollMode(2);
        r61Var.setScrollEnabled(false);
        linearLayout.addView(r61Var, y5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, y5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new o5(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}

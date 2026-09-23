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
import org.telegram.ui.Components.d61;
import w7.b6;
import w7.x5;
import yh.l5;
import yh.t5;
public final class r2 extends org.telegram.ui.ActionBar.f3 {
    public long f46059b;

    public r2(Context context, long j3, TL_stars.SavedStarGift savedStarGift, d6 d6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, d6Var, false);
        this.f46059b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = b6.b(context, 20.0f, h6.G6, true, d6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, x5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = b6.b(context, 14.0f, h6.f19170y6, false, d6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, x5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        l5 G = t5.y(this.currentAccount, false).G(j3, true);
        d61 d61Var = new d61(context, this.currentAccount, 0, false, new ai.m0(22, this, G), new tg.d(13, this, dVar), null, d6Var);
        d61Var.setSpanCount(3);
        d61Var.setOverScrollMode(2);
        d61Var.setScrollEnabled(false);
        linearLayout.addView(d61Var, x5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, x5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new o5(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}

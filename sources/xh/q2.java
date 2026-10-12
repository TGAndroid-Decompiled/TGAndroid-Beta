package xh;

import ai.p5;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.p71;
import w7.a6;
import w7.w5;
import yh.f5;
import yh.n5;
public final class q2 extends org.telegram.ui.ActionBar.e3 {
    public long f51708b;

    public q2(Context context, long j3, TL_stars.SavedStarGift savedStarGift, c6 c6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, c6Var, false);
        this.f51708b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = a6.b(context, 20.0f, h6.G6, true, c6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, w5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = a6.b(context, 14.0f, h6.f20945y6, false, c6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, w5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        ci.d dVar = new ci.d(context, c6Var, true);
        f5 G = n5.y(this.currentAccount, false).G(j3, true);
        p71 p71Var = new p71(context, this.currentAccount, 0, false, new qh.r(2, this, G), new qg.x1(19, this, dVar), null, c6Var);
        p71Var.setSpanCount(3);
        p71Var.setOverScrollMode(2);
        p71Var.setScrollEnabled(false);
        linearLayout.addView(p71Var, w5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, w5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new p5(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}

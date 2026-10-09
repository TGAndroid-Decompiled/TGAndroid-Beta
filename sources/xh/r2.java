package xh;

import ai.p5;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.k71;
import w7.b6;
import w7.x5;
import yh.e5;
import yh.m5;
public final class r2 extends org.telegram.ui.ActionBar.f3 {
    public long f51497b;

    public r2(Context context, long j3, TL_stars.SavedStarGift savedStarGift, e6 e6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, e6Var, false);
        this.f51497b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = b6.b(context, 20.0f, i6.G6, true, e6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, x5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = b6.b(context, 14.0f, i6.f21181y6, false, e6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, x5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        ci.d dVar = new ci.d(context, e6Var, true);
        e5 G = m5.y(this.currentAccount, false).G(j3, true);
        k71 k71Var = new k71(context, this.currentAccount, 0, false, new qh.r(2, this, G), new qg.x1(18, this, dVar), null, e6Var);
        k71Var.setSpanCount(3);
        k71Var.setOverScrollMode(2);
        k71Var.setScrollEnabled(false);
        linearLayout.addView(k71Var, x5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, x5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new p5(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}

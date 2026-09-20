package xh;

import ai.p5;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.s61;
import w7.d6;
import w7.y5;
import yh.l5;
import yh.u5;
public final class r2 extends org.telegram.ui.ActionBar.f3 {
    public long f46407b;

    public r2(Context context, long j3, TL_stars.SavedStarGift savedStarGift, f6 f6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, f6Var, false);
        this.f46407b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = d6.b(context, 20.0f, j6.G6, true, f6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, y5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = d6.b(context, 14.0f, j6.f19477y6, false, f6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, y5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        ci.d dVar = new ci.d(context, f6Var, true);
        l5 G = u5.y(this.currentAccount, false).G(j3, true);
        s61 s61Var = new s61(context, this.currentAccount, 0, false, new ai.m0(22, this, G), new s5.e(13, this, dVar), null, f6Var);
        s61Var.setSpanCount(3);
        s61Var.setOverScrollMode(2);
        s61Var.setScrollEnabled(false);
        linearLayout.addView(s61Var, y5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, y5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new p5(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}

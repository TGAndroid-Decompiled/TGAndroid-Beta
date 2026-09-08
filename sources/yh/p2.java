package yh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.z4;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import w7.b6;
import w7.x5;
import zh.j5;
import zh.s5;
public final class p2 extends org.telegram.ui.ActionBar.f3 {
    public long f50532b;

    public p2(Context context, long j3, TL_stars.SavedStarGift savedStarGift, f6 f6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, f6Var, false);
        this.f50532b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = b6.b(context, 20.0f, j6.G6, true, f6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, x5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = b6.b(context, 14.0f, j6.f21069y6, false, f6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, x5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        di.d dVar = new di.d(context, f6Var, true);
        j5 G = s5.y(this.currentAccount, false).G(j3, true);
        d61 d61Var = new d61(context, this.currentAccount, 0, false, new bi.f0(22, this, G), new sg.x(13, this, dVar), null, f6Var);
        d61Var.setSpanCount(3);
        d61Var.setOverScrollMode(2);
        d61Var.setScrollEnabled(false);
        linearLayout.addView(d61Var, x5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, x5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new z4(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}

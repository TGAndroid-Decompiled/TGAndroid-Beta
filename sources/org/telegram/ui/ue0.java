package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class ue0 extends org.telegram.ui.Components.bx0 {
    public int E;
    public int F;
    public final ig0 G;
    public final org.telegram.ui.Components.bk0 f43998a;
    public final TextView f43999b;
    public final TextView f44000c;
    public final TextView d;
    public final TextView e;
    public final TextView f44001f;
    public y5 h;
    public Bundle f44002n;
    public String f44003r;
    public String f44004s;
    public String v;
    public int f44005w;
    public int f44006x;
    public Boolean f44007y;

    public ue0(ig0 ig0Var, Context context) {
        super(context);
        int i10;
        this.G = ig0Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f43998a = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.sandclock, 120, 120, null);
        frameLayout.addView((View) imageView, org.telegram.ui.Components.kb1.i(120, 120, 1));
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y && !AndroidUtilities.isTablet()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        frameLayout.setVisibility(i10);
        linearLayout.addView(frameLayout, org.telegram.ui.Components.kb1.i(-1, -2, 1));
        TextView textView = new TextView(context);
        this.f43999b = textView;
        ic.a.o(18.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ResetAccount));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f44000c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView2, org.telegram.ui.Components.kb1.x(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, org.telegram.ui.Components.kb1.p(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f44001f = textView3;
        textView3.setGravity(1);
        textView3.setText(LocaleController.getString("ResetAccountStatus", R.string.ResetAccountStatus));
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, org.telegram.ui.Components.kb1.x(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView4, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(LocaleController.getString(R.string.ResetAccount));
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, org.telegram.ui.Components.kb1.x(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new z50(this, 8));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.G.p1(true, true);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.h = null;
        this.f44002n = null;
        return true;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("ResetAccount", R.string.ResetAccount);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.f44002n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.f44002n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f44002n = bundle;
        this.f44003r = bundle.getString("phoneFormated");
        this.f44004s = bundle.getString("phoneHash");
        this.v = bundle.getString("code");
        this.f44005w = bundle.getInt("startTime");
        this.f44006x = bundle.getInt("waitTime");
        int i10 = R.string.ResetAccountInfo;
        kf.b c10 = kf.b.c();
        this.f44000c.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ResetAccountInfo", i10, LocaleController.addNbsp(c10.b("+" + this.f44003r)))));
        n();
        y5 y5Var = new y5(this, 10);
        this.h = y5Var;
        AndroidUtilities.runOnUIThread(y5Var, 1000L);
    }

    public final void n() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13 = this.f44006x;
        i10 = ((org.telegram.ui.ActionBar.r2) this.G).currentAccount;
        int currentTime = i13 - (ConnectionsManager.getInstance(i10).getCurrentTime() - this.f44005w);
        int i14 = 0;
        int max = Math.max(0, currentTime);
        int i15 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i16 = max / 3600;
        int i17 = (max / 60) % 60;
        int i18 = max % 60;
        TextView textView = this.e;
        if (i15 >= 2) {
            textView.setText(LocaleController.formatPluralString("Days", round, new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18)));
        }
        if (max == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f44007y;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        org.telegram.ui.Components.bk0 bk0Var = this.f43998a;
        if (!z10) {
            bk0Var.setAutoRepeat(true);
            if (!bk0Var.b()) {
                bk0Var.d();
            }
        } else {
            bk0Var.getAnimatedDrawable().K(0);
        }
        if (z10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        if (z10) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        this.f44001f.setVisibility(i12);
        if (!z10) {
            i14 = 4;
        }
        this.d.setVisibility(i14);
        this.f44007y = Boolean.valueOf(z10);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        this.f43999b.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.f44000c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.f44001f.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Wh, false);
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Q9, false);
        TextView textView = this.d;
        if (textView.getBackground() == null) {
            int dp = AndroidUtilities.dp(6.0f);
            textView.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x02, x03, x03));
        } else if (x02 != this.E || x03 != this.F) {
            org.telegram.ui.ActionBar.y6.E1(textView.getBackground(), x02, false);
            org.telegram.ui.ActionBar.y6.E1(textView.getBackground(), x03, true);
        }
        this.E = x02;
        this.F = x03;
    }
}

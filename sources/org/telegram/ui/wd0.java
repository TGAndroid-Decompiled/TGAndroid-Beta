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
import org.telegram.tgnet.ConnectionsManager;
public final class wd0 extends org.telegram.ui.Components.av0 {
    public Boolean D;
    public int E;
    public int F;
    public final gf0 G;
    public final org.telegram.ui.Components.fi0 f42762a;
    public final TextView f42763b;
    public final TextView f42764c;
    public final TextView d;
    public final TextView e;
    public final TextView f42765f;
    public m4 h;
    public Bundle f42766n;
    public String f42767r;
    public String f42768s;
    public String f42769w;
    public int f42770x;
    public int f42771y;

    public wd0(gf0 gf0Var, Context context) {
        super(context);
        int i10;
        this.G = gf0Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f42762a = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624187, 120, 120, null);
        frameLayout.addView((View) imageView, w7.b6.e(120, 120, 1));
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y && !org.telegram.messenger.i0.Q1()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        frameLayout.setVisibility(i10);
        linearLayout.addView(frameLayout, w7.b6.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.f42763b = textView;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(org.telegram.messenger.dd.L0(2131746134, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        linearLayout.addView(textView, w7.b6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f42764c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, w7.b6.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f42765f = textView3;
        org.telegram.messenger.m5.l(textView3, 1, "ResetAccountStatus", 2131746130);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView3, w7.b6.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(org.telegram.messenger.i0.o());
        textView4.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView4, w7.b6.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(org.telegram.messenger.dd.L0(2131746134, null));
        textView5.setTypeface(org.telegram.messenger.i0.o());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView5.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, w7.b6.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new e50(this, 7));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.G.t1(true, true);
        org.telegram.messenger.i0.r(this.h);
        this.h = null;
        this.f42766n = null;
        return true;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.dd.L0(2131746134, "ResetAccount");
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.f42766n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.f42766n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f42766n = bundle;
        this.f42767r = bundle.getString("phoneFormated");
        this.f42768s = bundle.getString("phoneHash");
        this.f42769w = bundle.getString("code");
        this.f42770x = bundle.getInt("startTime");
        this.f42771y = bundle.getInt("waitTime");
        af.b c10 = af.b.c();
        org.telegram.messenger.m5.q("ResetAccountInfo", null, 2131746131, new Object[]{org.telegram.messenger.dd.a(c10.b("+" + this.f42767r))}, this.f42764c);
        n();
        m4 m4Var = new m4(this, 11);
        this.h = m4Var;
        org.telegram.messenger.i0.h3(m4Var, 1000L);
    }

    public final void n() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13 = this.f42771y;
        i10 = ((org.telegram.ui.ActionBar.k2) this.G).currentAccount;
        int currentTime = i13 - (ConnectionsManager.getInstance(i10).getCurrentTime() - this.f42770x);
        int i14 = 0;
        int max = Math.max(0, currentTime);
        int i15 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i16 = max / 3600;
        int i17 = (max / 60) % 60;
        int i18 = max % 60;
        TextView textView = this.e;
        if (i15 >= 2) {
            textView.setText(org.telegram.messenger.dd.G(round, "Days", new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18)));
        }
        if (max == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.D;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        org.telegram.ui.Components.fi0 fi0Var = this.f42762a;
        if (!z10) {
            fi0Var.setAutoRepeat(true);
            if (!fi0Var.b()) {
                fi0Var.d();
            }
        } else {
            fi0Var.getAnimatedDrawable().K(0);
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
        this.f42765f.setVisibility(i12);
        if (!z10) {
            i14 = 4;
        }
        this.d.setVisibility(i14);
        this.D = Boolean.valueOf(z10);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        this.f42763b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f42764c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f42765f.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ki, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Q9, false);
        TextView textView = this.d;
        if (textView.getBackground() == null) {
            int L = org.telegram.messenger.i0.L(6.0f);
            textView.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x02, x03, x03));
        } else if (x02 != this.E || x03 != this.F) {
            org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), x02, false);
            org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), x03, true);
        }
        this.E = x02;
        this.F = x03;
    }
}

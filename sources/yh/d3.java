package yh;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.dt;
public final class d3 {
    public final TL_stars.TL_starGiftUnique f46971a;
    public final Context f46972b;
    public final int f46973c;
    public final long d;
    public final String e;
    public final boolean f46974f;
    public final org.telegram.ui.ActionBar.d6 f46975g;
    public final org.telegram.ui.ActionBar.b2 h;
    public final m40 f46976i;
    public final TextView f46977j;
    public a f46978k;
    public TextView f46979l;
    public FrameLayout f46980m;
    public nf.e f46981n;
    public final HashMap f46982o;
    public final HashSet f46983p;
    public zf.b f46984q;
    public ci.e4 f46985r;

    public d3(Context context, org.telegram.ui.ActionBar.d6 d6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, b3 b3Var, int i10, long j3, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f46982o = hashMap;
        this.f46983p = new HashSet();
        this.f46972b = context;
        this.f46971a = tL_starGiftUnique;
        this.d = j3;
        this.f46973c = i10;
        zf.b bVar = b3Var.f46918a;
        this.f46984q = bVar;
        hashMap.put(bVar, b3Var);
        this.f46975g = d6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f46974f = !z11;
        if (j3 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        }
        LinearLayout f7 = ul.f(context, 1);
        c3 c3Var = new c3(this, context);
        c3Var.addView(f7, w7.x5.c(-2.0f, -1));
        if (!z11) {
            m40 m40Var = new m40(context, d6Var);
            this.f46976i = m40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            m40Var.b(arrayList, new v(this, 2));
            f7.addView(m40Var, w7.x5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f46976i = null;
            TextView textView = new TextView(context);
            ul.o(org.telegram.ui.ActionBar.h6.f19170y6, d6Var, textView, 1, 14.0f);
            ul.l(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f7.addView(textView, w7.x5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f7.addView(new a3(context, tL_starGiftUnique, chat), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f46977j = textView2;
        ul.o(org.telegram.ui.ActionBar.h6.f18895j5, d6Var, textView2, 1, 16.0f);
        f7.addView(textView2, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            oz0 oz0Var = new oz0(context, d6Var);
            y3.q1(oz0Var, t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            y3.q1(oz0Var, t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            y3.q1(oz0Var, t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                oz0Var.c(LocaleController.getString(R.string.GiftValue2), org.telegram.ui.Cells.q3.i("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f7.addView(oz0Var, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.n(c3Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.e2(this, i10, context, d6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f18409a;
    }

    public final void a(boolean z10) {
        float f7;
        boolean z11;
        boolean z12;
        boolean z13;
        String formatString;
        String formatPluralStringComma;
        ci.e4 e4Var;
        int i10;
        zf.b bVar = this.f46984q;
        b3 b3Var = (b3) this.f46982o.get(bVar);
        TextView textView = this.f46977j;
        ViewPropertyAnimator animate = textView.animate();
        if (b3Var != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        animate.alpha(f7).start();
        if (b3Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f46979l;
        if (b3Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        a aVar = this.f46978k;
        if (aVar.e != bVar) {
            aVar.e = bVar;
            aVar.a();
        }
        zf.b bVar2 = zf.b.f48899b;
        m40 m40Var = this.f46976i;
        if (m40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            m40Var.a(i10, z10);
        }
        if (bVar == bVar2 && (e4Var = this.f46985r) != null && e4Var.V) {
            e4Var.e(true);
        }
        a aVar2 = this.f46978k;
        zf.b bVar3 = zf.b.f48898a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 24));
            } else {
                aVar2.setOnClickListener(new ai.e2(20));
            }
        }
        nf.e eVar = this.f46981n;
        if (eVar != null) {
            eVar.a(false);
            this.f46981n = null;
        }
        int i11 = this.f46973c;
        long j3 = this.d;
        if (b3Var != null) {
            zf.b bVar4 = b3Var.f46918a;
            zf.a aVar3 = b3Var.f46920c;
            if (j3 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                this.f46979l.setText(w7.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j3));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f46979l.setText(w7.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
                if (z13) {
                    formatString = LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar3.d(), str);
                } else {
                    formatString = LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar3.d(), str, DialogObject.getShortName(j3));
                }
                textView.setText(AndroidUtilities.replaceTags(formatString));
                return;
            }
            return;
        }
        nf.e g10 = this.h.g(-1, false, false);
        this.f46981n = g10;
        g10.d();
        if (this.f46983p.add(bVar)) {
            t5.x(i11, bVar).H(this.f46971a, j3, null, true, new dt(29, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.b2 b2Var = this.h;
        b2Var.X0 = true;
        b2Var.show();
        this.f46979l = (TextView) b2Var.d(-1);
        this.f46978k = b2Var.Z0;
        FrameLayout frameLayout = b2Var.Y0;
        this.f46980m = frameLayout;
        if (frameLayout != null && this.f46974f) {
            ci.e4 e4Var = new ci.e4(this.f46972b, 3);
            e4Var.p(true);
            e4Var.K = Layout.Alignment.ALIGN_NORMAL;
            e4Var.d = 5000L;
            e4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            e4Var.u();
            this.f46985r = e4Var;
            e4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f46980m.addView(this.f46985r, w7.x5.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}

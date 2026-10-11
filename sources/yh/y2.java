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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.t01;
public final class y2 {
    public final TL_stars.TL_starGiftUnique f53496a;
    public final Context f53497b;
    public final int f53498c;
    public final long d;
    public final String f53499e;
    public final boolean f53500f;
    public final org.telegram.ui.ActionBar.d6 f53501g;
    public final org.telegram.ui.ActionBar.a2 h;
    public final d50 f53502i;
    public final TextView f53503j;
    public a f53504k;
    public TextView f53505l;
    public FrameLayout f53506m;
    public of.e f53507n;
    public final HashMap f53508o;
    public final HashSet f53509p;
    public zf.b f53510q;
    public ci.d4 f53511r;

    public y2(Context context, org.telegram.ui.ActionBar.d6 d6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, w2 w2Var, int i10, long j3, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f53508o = hashMap;
        this.f53509p = new HashSet();
        this.f53497b = context;
        this.f53496a = tL_starGiftUnique;
        this.d = j3;
        this.f53498c = i10;
        zf.b bVar = w2Var.f53415a;
        this.f53510q = bVar;
        hashMap.put(bVar, w2Var);
        this.f53501g = d6Var;
        this.f53499e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f53500f = !z11;
        if (j3 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        }
        LinearLayout e7 = ai.e(context, 1);
        x2 x2Var = new x2(this, context);
        x2Var.addView(e7, w7.x5.d(-2.0f, -1));
        if (!z11) {
            d50 d50Var = new d50(context, d6Var);
            this.f53502i = d50Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            d50Var.b(arrayList, new u(this, 2));
            e7.addView(d50Var, w7.x5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f53502i = null;
            TextView textView = new TextView(context);
            ai.o(org.telegram.ui.ActionBar.h6.f21171y6, d6Var, textView, 1, 14.0f);
            ai.m(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e7.addView(textView, w7.x5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        e7.addView(new v2(context, tL_starGiftUnique, chat), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f53503j = textView2;
        ai.o(org.telegram.ui.ActionBar.h6.f20894j5, d6Var, textView2, 1, 16.0f);
        e7.addView(textView2, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            t01 t01Var = new t01(context, d6Var);
            s3.r1(t01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            s3.r1(t01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            s3.r1(t01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                t01Var.c(LocaleController.getString(R.string.GiftValue2), sc.v.i("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e7.addView(t01Var, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.n(x2Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.f2(this, i10, context, d6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f20368a;
    }

    public final void a(boolean z10) {
        float f7;
        boolean z11;
        boolean z12;
        boolean z13;
        String formatString;
        String formatPluralStringComma;
        ci.d4 d4Var;
        int i10;
        zf.b bVar = this.f53510q;
        w2 w2Var = (w2) this.f53508o.get(bVar);
        TextView textView = this.f53503j;
        ViewPropertyAnimator animate = textView.animate();
        if (w2Var != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        animate.alpha(f7).start();
        if (w2Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f53505l;
        if (w2Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        a aVar = this.f53504k;
        if (aVar.f52324e != bVar) {
            aVar.f52324e = bVar;
            aVar.a();
        }
        zf.b bVar2 = zf.b.f54531b;
        d50 d50Var = this.f53502i;
        if (d50Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            d50Var.a(i10, z10);
        }
        if (bVar == bVar2 && (d4Var = this.f53511r) != null && d4Var.V) {
            d4Var.e(true);
        }
        a aVar2 = this.f53504k;
        zf.b bVar3 = zf.b.f54530a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new org.telegram.ui.Components.voip.p(this, 24));
            } else {
                aVar2.setOnClickListener(new ai.e2(20));
            }
        }
        of.e eVar = this.f53507n;
        if (eVar != null) {
            eVar.a(false);
            this.f53507n = null;
        }
        int i11 = this.f53498c;
        long j3 = this.d;
        if (w2Var != null) {
            zf.b bVar4 = w2Var.f53415a;
            zf.a aVar3 = w2Var.f53417c;
            if (j3 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.f53499e;
            if (bVar4 == bVar3) {
                this.f53505l.setText(p7.R0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j3));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f53505l.setText(p7.T0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
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
        of.e g10 = this.h.g(-1, false, false);
        this.f53507n = g10;
        g10.d();
        if (this.f53509p.add(bVar)) {
            n5.x(i11, bVar).H(this.f53496a, j3, null, true, new org.telegram.ui.Wallet.b7(15, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.a2 a2Var = this.h;
        a2Var.X0 = true;
        a2Var.show();
        this.f53505l = (TextView) a2Var.d(-1);
        this.f53504k = a2Var.Z0;
        FrameLayout frameLayout = a2Var.Y0;
        this.f53506m = frameLayout;
        if (frameLayout != null && this.f53500f) {
            ci.d4 d4Var = new ci.d4(this.f53497b, 3);
            d4Var.p(true);
            d4Var.K = Layout.Alignment.ALIGN_NORMAL;
            d4Var.d = 5000L;
            d4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            d4Var.u();
            this.f53511r = d4Var;
            d4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f53506m.addView(this.f53511r, w7.x5.a(100.0f, 0.0f, 26.0f, 0.0f, 0.0f, -2, 48));
        }
        a(false);
    }
}

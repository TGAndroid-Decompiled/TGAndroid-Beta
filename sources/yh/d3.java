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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.p40;
import org.telegram.ui.ft;
public final class d3 {
    public final TL_stars.TL_starGiftUnique f51212a;
    public final Context f51213b;
    public final int f51214c;
    public final long d;
    public final String f51215e;
    public final boolean f51216f;
    public final org.telegram.ui.ActionBar.d6 f51217g;
    public final org.telegram.ui.ActionBar.b2 h;
    public final p40 f51218i;
    public final TextView f51219j;
    public a f51220k;
    public TextView f51221l;
    public FrameLayout f51222m;
    public nf.e f51223n;
    public final HashMap f51224o;
    public final HashSet f51225p;
    public zf.b f51226q;
    public ci.e4 f51227r;

    public d3(Context context, org.telegram.ui.ActionBar.d6 d6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, b3 b3Var, int i10, long j3, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f51224o = hashMap;
        this.f51225p = new HashSet();
        this.f51213b = context;
        this.f51212a = tL_starGiftUnique;
        this.d = j3;
        this.f51214c = i10;
        zf.b bVar = b3Var.f51144a;
        this.f51226q = bVar;
        hashMap.put(bVar, b3Var);
        this.f51217g = d6Var;
        this.f51215e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f51216f = !z11;
        if (j3 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        }
        LinearLayout e7 = bi.e(context, 1);
        c3 c3Var = new c3(this, context);
        c3Var.addView(e7, w7.z5.c(-2.0f, -1));
        if (!z11) {
            p40 p40Var = new p40(context, d6Var);
            this.f51218i = p40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            p40Var.b(arrayList, new w(this, 2));
            e7.addView(p40Var, w7.z5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f51218i = null;
            TextView textView = new TextView(context);
            bi.m(org.telegram.ui.ActionBar.i6.f21214y6, d6Var, textView, 1, 14.0f);
            bi.k(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e7.addView(textView, w7.z5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        e7.addView(new a3(context, tL_starGiftUnique, chat), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f51219j = textView2;
        bi.m(org.telegram.ui.ActionBar.i6.f20935j5, d6Var, textView2, 1, 16.0f);
        e7.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            l01 l01Var = new l01(context, d6Var);
            y3.q1(l01Var, u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            y3.q1(l01Var, u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            y3.q1(l01Var, u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                l01Var.c(LocaleController.getString(R.string.GiftValue2), sa.e.i("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e7.addView(l01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.n(c3Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.e2(this, i10, context, d6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f20377a;
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
        zf.b bVar = this.f51226q;
        b3 b3Var = (b3) this.f51224o.get(bVar);
        TextView textView = this.f51219j;
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
        TextView textView2 = this.f51221l;
        if (b3Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        a aVar = this.f51220k;
        if (aVar.f51067e != bVar) {
            aVar.f51067e = bVar;
            aVar.a();
        }
        zf.b bVar2 = zf.b.f53324b;
        p40 p40Var = this.f51218i;
        if (p40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            p40Var.a(i10, z10);
        }
        if (bVar == bVar2 && (e4Var = this.f51227r) != null && e4Var.V) {
            e4Var.e(true);
        }
        a aVar2 = this.f51220k;
        zf.b bVar3 = zf.b.f53323a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 24));
            } else {
                aVar2.setOnClickListener(new ai.e2(20));
            }
        }
        nf.e eVar = this.f51223n;
        if (eVar != null) {
            eVar.a(false);
            this.f51223n = null;
        }
        int i11 = this.f51214c;
        long j3 = this.d;
        if (b3Var != null) {
            zf.b bVar4 = b3Var.f51144a;
            zf.a aVar3 = b3Var.f51146c;
            if (j3 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.f51215e;
            if (bVar4 == bVar3) {
                this.f51221l.setText(z7.W0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j3));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f51221l.setText(z7.Y0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
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
        this.f51223n = g10;
        g10.d();
        if (this.f51225p.add(bVar)) {
            u5.x(i11, bVar).H(this.f51212a, j3, null, true, new ft(29, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.b2 b2Var = this.h;
        b2Var.X0 = true;
        b2Var.show();
        this.f51221l = (TextView) b2Var.d(-1);
        this.f51220k = b2Var.Z0;
        FrameLayout frameLayout = b2Var.Y0;
        this.f51222m = frameLayout;
        if (frameLayout != null && this.f51216f) {
            ci.e4 e4Var = new ci.e4(this.f51213b, 3);
            e4Var.p(true);
            e4Var.K = Layout.Alignment.ALIGN_NORMAL;
            e4Var.d = 5000L;
            e4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            e4Var.u();
            this.f51227r = e4Var;
            e4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f51222m.addView(this.f51227r, w7.z5.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}

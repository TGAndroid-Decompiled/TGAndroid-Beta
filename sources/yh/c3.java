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
import org.telegram.messenger.qk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.o40;
import org.telegram.ui.et;
public final class c3 {
    public final TL_stars.TL_starGiftUnique f47305a;
    public final Context f47306b;
    public final int f47307c;
    public final long d;
    public final String e;
    public final boolean f47308f;
    public final org.telegram.ui.ActionBar.e6 f47309g;
    public final org.telegram.ui.ActionBar.c2 h;
    public final o40 f47310i;
    public final TextView f47311j;
    public a f47312k;
    public TextView f47313l;
    public FrameLayout f47314m;
    public nf.e f47315n;
    public final HashMap f47316o;
    public final HashSet f47317p;
    public zf.b f47318q;
    public ci.e4 f47319r;

    public c3(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, a3 a3Var, int i10, long j3, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f47316o = hashMap;
        this.f47317p = new HashSet();
        this.f47306b = context;
        this.f47305a = tL_starGiftUnique;
        this.d = j3;
        this.f47307c = i10;
        zf.b bVar = a3Var.f47248a;
        this.f47318q = bVar;
        hashMap.put(bVar, a3Var);
        this.f47309g = e6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f47308f = !z11;
        if (j3 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        }
        LinearLayout f7 = qk.f(context, 1);
        b3 b3Var = new b3(this, context);
        b3Var.addView(f7, w7.y5.c(-2.0f, -1));
        if (!z11) {
            o40 o40Var = new o40(context, e6Var);
            this.f47310i = o40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            o40Var.b(arrayList, new v(this, 2));
            f7.addView(o40Var, w7.y5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f47310i = null;
            TextView textView = new TextView(context);
            qk.n(org.telegram.ui.ActionBar.i6.f19442y6, e6Var, textView, 1, 14.0f);
            qk.l(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f7.addView(textView, w7.y5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f7.addView(new z2(context, tL_starGiftUnique, chat), w7.y5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f47311j = textView2;
        qk.n(org.telegram.ui.ActionBar.i6.f19164j5, e6Var, textView2, 1, 16.0f);
        f7.addView(textView2, w7.y5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            b01 b01Var = new b01(context, e6Var);
            x3.q1(b01Var, s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            x3.q1(b01Var, s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            x3.q1(b01Var, s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                b01Var.c(LocaleController.getString(R.string.GiftValue2), v7.k0.g("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f7.addView(b01Var, w7.y5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.n(b3Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.e2(this, i10, context, e6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f18655a;
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
        zf.b bVar = this.f47318q;
        a3 a3Var = (a3) this.f47316o.get(bVar);
        TextView textView = this.f47311j;
        ViewPropertyAnimator animate = textView.animate();
        if (a3Var != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        animate.alpha(f7).start();
        if (a3Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f47313l;
        if (a3Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        a aVar = this.f47312k;
        if (aVar.e != bVar) {
            aVar.e = bVar;
            aVar.a();
        }
        zf.b bVar2 = zf.b.f49271b;
        o40 o40Var = this.f47310i;
        if (o40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            o40Var.a(i10, z10);
        }
        if (bVar == bVar2 && (e4Var = this.f47319r) != null && e4Var.V) {
            e4Var.e(true);
        }
        a aVar2 = this.f47312k;
        zf.b bVar3 = zf.b.f49270a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 24));
            } else {
                aVar2.setOnClickListener(new ai.e2(20));
            }
        }
        nf.e eVar = this.f47315n;
        if (eVar != null) {
            eVar.a(false);
            this.f47315n = null;
        }
        int i11 = this.f47307c;
        long j3 = this.d;
        if (a3Var != null) {
            zf.b bVar4 = a3Var.f47248a;
            zf.a aVar3 = a3Var.f47250c;
            if (j3 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                this.f47313l.setText(v7.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j3));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f47313l.setText(v7.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
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
        this.f47315n = g10;
        g10.d();
        if (this.f47317p.add(bVar)) {
            s5.x(i11, bVar).H(this.f47305a, j3, null, true, new et(29, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.c2 c2Var = this.h;
        c2Var.X0 = true;
        c2Var.show();
        this.f47313l = (TextView) c2Var.d(-1);
        this.f47312k = c2Var.Z0;
        FrameLayout frameLayout = c2Var.Y0;
        this.f47314m = frameLayout;
        if (frameLayout != null && this.f47308f) {
            ci.e4 e4Var = new ci.e4(this.f47306b, 3);
            e4Var.p(true);
            e4Var.K = Layout.Alignment.ALIGN_NORMAL;
            e4Var.d = 5000L;
            e4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            e4Var.u();
            this.f47319r = e4Var;
            e4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f47314m.addView(this.f47319r, w7.y5.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}

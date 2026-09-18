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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.l40;
import org.telegram.ui.nj0;
public final class d3 {
    public final TL_stars.TL_starGiftUnique f47281a;
    public final Context f47282b;
    public final int f47283c;
    public final long d;
    public final String e;
    public final boolean f47284f;
    public final org.telegram.ui.ActionBar.e6 f47285g;
    public final org.telegram.ui.ActionBar.b2 h;
    public final l40 f47286i;
    public final TextView f47287j;
    public a f47288k;
    public TextView f47289l;
    public FrameLayout f47290m;
    public nf.e f47291n;
    public final HashMap f47292o;
    public final HashSet f47293p;
    public zf.b f47294q;
    public ci.f4 f47295r;

    public d3(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, b3 b3Var, int i10, long j3, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f47292o = hashMap;
        this.f47293p = new HashSet();
        this.f47282b = context;
        this.f47281a = tL_starGiftUnique;
        this.d = j3;
        this.f47283c = i10;
        zf.b bVar = b3Var.f47224a;
        this.f47294q = bVar;
        hashMap.put(bVar, b3Var);
        this.f47285g = e6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f47284f = !z11;
        if (j3 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        }
        LinearLayout e = wh.e(context, 1);
        c3 c3Var = new c3(this, context);
        c3Var.addView(e, w7.y5.c(-2.0f, -1));
        if (!z11) {
            l40 l40Var = new l40(context, e6Var);
            this.f47286i = l40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            l40Var.b(arrayList, new v(this, 2));
            e.addView(l40Var, w7.y5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f47286i = null;
            TextView textView = new TextView(context);
            wh.m(org.telegram.ui.ActionBar.j6.f19445y6, e6Var, textView, 1, 14.0f);
            wh.k(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e.addView(textView, w7.y5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        e.addView(new a3(context, tL_starGiftUnique, chat), w7.y5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f47287j = textView2;
        wh.m(org.telegram.ui.ActionBar.j6.f19169j5, e6Var, textView2, 1, 16.0f);
        e.addView(textView2, w7.y5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            b01 b01Var = new b01(context, e6Var);
            y3.q1(b01Var, t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            y3.q1(b01Var, t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            y3.q1(b01Var, t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                b01Var.c(LocaleController.getString(R.string.GiftValue2), t8.b.i("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e.addView(b01Var, w7.y5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.n(c3Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.d2(this, i10, context, e6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f18622a;
    }

    public final void a(boolean z10) {
        float f7;
        boolean z11;
        boolean z12;
        boolean z13;
        String formatString;
        String formatPluralStringComma;
        ci.f4 f4Var;
        int i10;
        zf.b bVar = this.f47294q;
        b3 b3Var = (b3) this.f47292o.get(bVar);
        TextView textView = this.f47287j;
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
        TextView textView2 = this.f47289l;
        if (b3Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        a aVar = this.f47288k;
        if (aVar.e != bVar) {
            aVar.e = bVar;
            aVar.a();
        }
        zf.b bVar2 = zf.b.f49209b;
        l40 l40Var = this.f47286i;
        if (l40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            l40Var.a(i10, z10);
        }
        if (bVar == bVar2 && (f4Var = this.f47295r) != null && f4Var.V) {
            f4Var.e(true);
        }
        a aVar2 = this.f47288k;
        zf.b bVar3 = zf.b.f49208a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 24));
            } else {
                aVar2.setOnClickListener(new ai.e2(20));
            }
        }
        nf.e eVar = this.f47291n;
        if (eVar != null) {
            eVar.a(false);
            this.f47291n = null;
        }
        int i11 = this.f47283c;
        long j3 = this.d;
        if (b3Var != null) {
            zf.b bVar4 = b3Var.f47224a;
            zf.a aVar3 = b3Var.f47226c;
            if (j3 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                this.f47289l.setText(v7.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j3));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f47289l.setText(v7.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
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
        this.f47291n = g10;
        g10.d();
        if (this.f47293p.add(bVar)) {
            t5.x(i11, bVar).H(this.f47281a, j3, null, true, new nj0(20, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.b2 b2Var = this.h;
        b2Var.X0 = true;
        b2Var.show();
        this.f47289l = (TextView) b2Var.d(-1);
        this.f47288k = b2Var.Z0;
        FrameLayout frameLayout = b2Var.Y0;
        this.f47290m = frameLayout;
        if (frameLayout != null && this.f47284f) {
            ci.f4 f4Var = new ci.f4(this.f47282b, 3);
            f4Var.p(true);
            f4Var.K = Layout.Alignment.ALIGN_NORMAL;
            f4Var.d = 5000L;
            f4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            f4Var.u();
            this.f47295r = f4Var;
            f4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f47290m.addView(this.f47295r, w7.y5.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}

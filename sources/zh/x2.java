package zh;

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
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.y40;
public final class x2 {
    public final TL_stars.TL_starGiftUnique f51292a;
    public final Context f51293b;
    public final int f51294c;
    public final long d;
    public final String e;
    public final boolean f51295f;
    public final org.telegram.ui.ActionBar.c6 f51296g;
    public final org.telegram.ui.ActionBar.a2 h;
    public final y40 f51297i;
    public final TextView f51298j;
    public a f51299k;
    public TextView f51300l;
    public FrameLayout f51301m;
    public pf.c f51302n;
    public final HashMap f51303o;
    public final HashSet f51304p;
    public ag.b f51305q;
    public di.d4 f51306r;

    public x2(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, v2 v2Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f51303o = hashMap;
        this.f51304p = new HashSet();
        this.f51293b = context;
        this.f51292a = tL_starGiftUnique;
        this.d = j10;
        this.f51294c = i10;
        ag.b bVar = v2Var.f51234a;
        this.f51305q = bVar;
        hashMap.put(bVar, v2Var);
        this.f51296g = c6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f51295f = !z11;
        if (j10 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        }
        LinearLayout e = sk.e(context, 1);
        w2 w2Var = new w2(this, context);
        w2Var.addView(e, w7.z5.d(-2.0f, -1));
        if (!z11) {
            y40 y40Var = new y40(context, c6Var);
            this.f51297i = y40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            y40Var.b(arrayList, new v(this, 2));
            e.addView(y40Var, w7.z5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f51297i = null;
            TextView textView = new TextView(context);
            sk.o(org.telegram.ui.ActionBar.g6.f19988y6, c6Var, textView, 1, 14.0f);
            sk.m(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e.addView(textView, w7.z5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        e.addView(new u2(context, tL_starGiftUnique, chat), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f51298j = textView2;
        sk.o(org.telegram.ui.ActionBar.g6.f19707j5, c6Var, textView2, 1, 16.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            o01 o01Var = new o01(context, c6Var);
            r3.r1(o01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            r3.r1(o01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            r3.r1(o01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                o01Var.c(LocaleController.getString(R.string.GiftValue2), t8.b.h("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e.addView(o01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.n(w2Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.e2(this, i10, context, c6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f19248a;
    }

    public final void a(boolean z10) {
        float f7;
        boolean z11;
        boolean z12;
        boolean z13;
        String formatString;
        String formatPluralStringComma;
        di.d4 d4Var;
        int i10;
        ag.b bVar = this.f51305q;
        v2 v2Var = (v2) this.f51303o.get(bVar);
        TextView textView = this.f51298j;
        ViewPropertyAnimator animate = textView.animate();
        if (v2Var != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        animate.alpha(f7).start();
        if (v2Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f51300l;
        if (v2Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        a aVar = this.f51299k;
        if (aVar.e != bVar) {
            aVar.e = bVar;
            aVar.a();
        }
        ag.b bVar2 = ag.b.f634b;
        y40 y40Var = this.f51297i;
        if (y40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            y40Var.a(i10, z10);
        }
        if (bVar == bVar2 && (d4Var = this.f51306r) != null && d4Var.V) {
            d4Var.e(true);
        }
        a aVar2 = this.f51299k;
        ag.b bVar3 = ag.b.f633a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new ji.o4(this, 25));
            } else {
                aVar2.setOnClickListener(new ah.f(21));
            }
        }
        pf.c cVar = this.f51302n;
        if (cVar != null) {
            cVar.a(false);
            this.f51302n = null;
        }
        int i11 = this.f51294c;
        long j10 = this.d;
        if (v2Var != null) {
            ag.b bVar4 = v2Var.f51234a;
            ag.a aVar3 = v2Var.f51236c;
            if (j10 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                this.f51300l.setText(p7.R0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f51300l.setText(p7.T0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
                if (z13) {
                    formatString = LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar3.d(), str);
                } else {
                    formatString = LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar3.d(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatString));
                return;
            }
            return;
        }
        pf.c g10 = this.h.g(-1, false, false);
        this.f51302n = g10;
        g10.d();
        if (this.f51304p.add(bVar)) {
            n5.x(i11, bVar).H(this.f51292a, j10, null, true, new org.telegram.ui.Wallet.z6(15, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.a2 a2Var = this.h;
        a2Var.X0 = true;
        a2Var.show();
        this.f51300l = (TextView) a2Var.d(-1);
        this.f51299k = a2Var.Z0;
        FrameLayout frameLayout = a2Var.Y0;
        this.f51301m = frameLayout;
        if (frameLayout != null && this.f51295f) {
            di.d4 d4Var = new di.d4(this.f51293b, 3);
            d4Var.p(true);
            d4Var.K = Layout.Alignment.ALIGN_NORMAL;
            d4Var.d = 5000L;
            d4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            d4Var.u();
            this.f51306r = d4Var;
            d4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f51301m.addView(this.f51306r, w7.z5.a(100.0f, 0.0f, 26.0f, 0.0f, 0.0f, -2, 48));
        }
        a(false);
    }
}

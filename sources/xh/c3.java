package xh;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.v40;
import org.telegram.ui.nj0;
public final class c3 {
    public final TL_stars.TL_starGiftUnique f45299a;
    public final Context f45300b;
    public final int f45301c;
    public final long d;
    public final String e;
    public final boolean f45302f;
    public final org.telegram.ui.ActionBar.f6 f45303g;
    public final org.telegram.ui.ActionBar.d2 h;
    public final v40 f45304i;
    public final TextView f45305j;
    public a f45306k;
    public TextView f45307l;
    public FrameLayout f45308m;
    public nf.e f45309n;
    public final HashMap f45310o;
    public final HashSet f45311p;
    public yf.b f45312q;
    public bi.x4 f45313r;

    public c3(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, a3 a3Var, int i10, long j3, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f45310o = hashMap;
        this.f45311p = new HashSet();
        this.f45300b = context;
        this.f45299a = tL_starGiftUnique;
        this.d = j3;
        this.f45301c = i10;
        yf.b bVar = a3Var.f45239a;
        this.f45312q = bVar;
        hashMap.put(bVar, a3Var);
        this.f45303g = f6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f45302f = !z11;
        if (j3 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        }
        LinearLayout f7 = em.f(context, 1);
        b3 b3Var = new b3(this, context);
        b3Var.addView(f7, w7.a6.c(-2.0f, -1));
        if (!z11) {
            v40 v40Var = new v40(context, f6Var);
            this.f45304i = v40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            v40Var.b(arrayList, new v(this, 2));
            f7.addView(v40Var, w7.a6.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f45304i = null;
            TextView textView = new TextView(context);
            em.n(org.telegram.ui.ActionBar.j6.f18306y6, f6Var, textView, 1, 14.0f);
            em.k(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f7.addView(textView, w7.a6.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f7.addView(new z2(context, tL_starGiftUnique, chat), w7.a6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f45305j = textView2;
        em.n(org.telegram.ui.ActionBar.j6.f18034j5, f6Var, textView2, 1, 16.0f);
        f7.addView(textView2, w7.a6.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            b01 b01Var = new b01(context, f6Var);
            x3.q1(b01Var, v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            x3.q1(b01Var, v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            x3.q1(b01Var, v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                b01Var.c(LocaleController.getString(R.string.GiftValue2), org.telegram.ui.Cells.r6.i("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f7.addView(b01Var, w7.a6.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.n(b3Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.f2(this, i10, context, f6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f17528a;
    }

    public final void a(boolean z10) {
        float f7;
        boolean z11;
        boolean z12;
        boolean z13;
        String formatString;
        String formatPluralStringComma;
        bi.x4 x4Var;
        int i10;
        yf.b bVar = this.f45312q;
        a3 a3Var = (a3) this.f45310o.get(bVar);
        TextView textView = this.f45305j;
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
        TextView textView2 = this.f45307l;
        if (a3Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        a aVar = this.f45306k;
        if (aVar.e != bVar) {
            aVar.e = bVar;
            aVar.a();
        }
        yf.b bVar2 = yf.b.f46929b;
        v40 v40Var = this.f45304i;
        if (v40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            v40Var.a(i10, z10);
        }
        if (bVar == bVar2 && (x4Var = this.f45313r) != null && x4Var.V) {
            x4Var.e(true);
        }
        a aVar2 = this.f45306k;
        yf.b bVar3 = yf.b.f46928a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new org.telegram.ui.web.c(this, 19));
            } else {
                aVar2.setOnClickListener(new bi.d5(19));
            }
        }
        nf.e eVar = this.f45309n;
        if (eVar != null) {
            eVar.a(false);
            this.f45309n = null;
        }
        int i11 = this.f45301c;
        long j3 = this.d;
        if (a3Var != null) {
            yf.b bVar4 = a3Var.f45239a;
            yf.a aVar3 = a3Var.f45241c;
            if (j3 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                this.f45307l.setText(z7.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j3));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f45307l.setText(z7.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
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
        this.f45309n = g10;
        g10.d();
        if (this.f45311p.add(bVar)) {
            v5.x(i11, bVar).H(this.f45299a, j3, null, true, new nj0(20, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.d2 d2Var = this.h;
        d2Var.X0 = true;
        d2Var.show();
        this.f45307l = (TextView) d2Var.d(-1);
        this.f45306k = d2Var.Z0;
        FrameLayout frameLayout = d2Var.Y0;
        this.f45308m = frameLayout;
        if (frameLayout != null && this.f45302f) {
            bi.x4 x4Var = new bi.x4(this.f45300b, 3);
            x4Var.p(true);
            x4Var.K = Layout.Alignment.ALIGN_NORMAL;
            x4Var.d = 5000L;
            x4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            x4Var.u();
            this.f45313r = x4Var;
            x4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f45308m.addView(this.f45313r, w7.a6.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}

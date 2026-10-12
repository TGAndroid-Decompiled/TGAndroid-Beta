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
import org.telegram.messenger.am;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.x01;
public final class y2 {
    public final TL_stars.TL_starGiftUnique f53633a;
    public final Context f53634b;
    public final int f53635c;
    public final long d;
    public final String f53636e;
    public final boolean f53637f;
    public final org.telegram.ui.ActionBar.c6 f53638g;
    public final org.telegram.ui.ActionBar.a2 h;
    public final f50 f53639i;
    public final TextView f53640j;
    public a f53641k;
    public TextView f53642l;
    public FrameLayout f53643m;
    public of.e f53644n;
    public final HashMap f53645o;
    public final HashSet f53646p;
    public zf.b f53647q;
    public ci.d4 f53648r;

    public y2(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, w2 w2Var, int i10, long j3, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f53645o = hashMap;
        this.f53646p = new HashSet();
        this.f53634b = context;
        this.f53633a = tL_starGiftUnique;
        this.d = j3;
        this.f53635c = i10;
        zf.b bVar = w2Var.f53552a;
        this.f53647q = bVar;
        hashMap.put(bVar, w2Var);
        this.f53638g = c6Var;
        this.f53636e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f53637f = !z11;
        if (j3 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        }
        LinearLayout e7 = am.e(context, 1);
        x2 x2Var = new x2(this, context);
        x2Var.addView(e7, w7.w5.d(-2.0f, -1));
        if (!z11) {
            f50 f50Var = new f50(context, c6Var);
            this.f53639i = f50Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            f50Var.b(arrayList, new u(this, 2));
            e7.addView(f50Var, w7.w5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f53639i = null;
            TextView textView = new TextView(context);
            am.o(org.telegram.ui.ActionBar.h6.f20945y6, c6Var, textView, 1, 14.0f);
            am.m(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e7.addView(textView, w7.w5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        e7.addView(new v2(context, tL_starGiftUnique, chat), w7.w5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f53640j = textView2;
        am.o(org.telegram.ui.ActionBar.h6.f20667j5, c6Var, textView2, 1, 16.0f);
        e7.addView(textView2, w7.w5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            x01 x01Var = new x01(context, c6Var);
            s3.r1(x01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            s3.r1(x01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            s3.r1(x01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                x01Var.c(LocaleController.getString(R.string.GiftValue2), sc.v.i("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e7.addView(x01Var, w7.w5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.n(x2Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.e2(this, i10, context, c6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f20141a;
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
        zf.b bVar = this.f53647q;
        w2 w2Var = (w2) this.f53645o.get(bVar);
        TextView textView = this.f53640j;
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
        TextView textView2 = this.f53642l;
        if (w2Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        a aVar = this.f53641k;
        if (aVar.f52461e != bVar) {
            aVar.f52461e = bVar;
            aVar.a();
        }
        zf.b bVar2 = zf.b.f54668b;
        f50 f50Var = this.f53639i;
        if (f50Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            f50Var.a(i10, z10);
        }
        if (bVar == bVar2 && (d4Var = this.f53648r) != null && d4Var.V) {
            d4Var.e(true);
        }
        a aVar2 = this.f53641k;
        zf.b bVar3 = zf.b.f54667a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 24));
            } else {
                aVar2.setOnClickListener(new ai.e2(20));
            }
        }
        of.e eVar = this.f53644n;
        if (eVar != null) {
            eVar.a(false);
            this.f53644n = null;
        }
        int i11 = this.f53635c;
        long j3 = this.d;
        if (w2Var != null) {
            zf.b bVar4 = w2Var.f53552a;
            zf.a aVar3 = w2Var.f53554c;
            if (j3 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.f53636e;
            if (bVar4 == bVar3) {
                this.f53642l.setText(p7.R0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j3));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f53642l.setText(p7.T0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
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
        this.f53644n = g10;
        g10.d();
        if (this.f53646p.add(bVar)) {
            n5.x(i11, bVar).H(this.f53633a, j3, null, true, new org.telegram.ui.Wallet.b7(15, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.a2 a2Var = this.h;
        a2Var.X0 = true;
        a2Var.show();
        this.f53642l = (TextView) a2Var.d(-1);
        this.f53641k = a2Var.Z0;
        FrameLayout frameLayout = a2Var.Y0;
        this.f53643m = frameLayout;
        if (frameLayout != null && this.f53637f) {
            ci.d4 d4Var = new ci.d4(this.f53634b, 3);
            d4Var.p(true);
            d4Var.K = Layout.Alignment.ALIGN_NORMAL;
            d4Var.d = 5000L;
            d4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            d4Var.u();
            this.f53648r = d4Var;
            d4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f53643m.addView(this.f53648r, w7.w5.a(100.0f, 0.0f, 26.0f, 0.0f, 0.0f, -2, 48));
        }
        a(false);
    }
}

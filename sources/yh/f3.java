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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.oj0;
public final class f3 {
    public final TL_stars.TL_starGiftUnique f47169a;
    public final Context f47170b;
    public final int f47171c;
    public final long d;
    public final String e;
    public final boolean f47172f;
    public final org.telegram.ui.ActionBar.f6 f47173g;
    public final org.telegram.ui.ActionBar.c2 h;
    public final l40 f47174i;
    public final TextView f47175j;
    public a f47176k;
    public TextView f47177l;
    public FrameLayout f47178m;
    public nf.e f47179n;
    public final HashMap f47180o;
    public final HashSet f47181p;
    public zf.b f47182q;
    public ci.f4 f47183r;

    public f3(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, d3 d3Var, int i10, long j3, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f47180o = hashMap;
        this.f47181p = new HashSet();
        this.f47170b = context;
        this.f47169a = tL_starGiftUnique;
        this.d = j3;
        this.f47171c = i10;
        zf.b bVar = d3Var.f47096a;
        this.f47182q = bVar;
        hashMap.put(bVar, d3Var);
        this.f47173g = f6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f47172f = !z11;
        if (j3 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        }
        LinearLayout f7 = wl.f(context, 1);
        e3 e3Var = new e3(this, context);
        e3Var.addView(f7, w7.x5.c(-2.0f, -1));
        if (!z11) {
            l40 l40Var = new l40(context, f6Var);
            this.f47174i = l40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            l40Var.b(arrayList, new v(this, 2));
            f7.addView(l40Var, w7.x5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f47174i = null;
            TextView textView = new TextView(context);
            wl.n(org.telegram.ui.ActionBar.j6.f19244y6, f6Var, textView, 1, 14.0f);
            wl.k(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f7.addView(textView, w7.x5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f7.addView(new c3(context, tL_starGiftUnique, chat), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f47175j = textView2;
        wl.n(org.telegram.ui.ActionBar.j6.f18969j5, f6Var, textView2, 1, 16.0f);
        f7.addView(textView2, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            qz0 qz0Var = new qz0(context, f6Var);
            a4.q1(qz0Var, v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            a4.q1(qz0Var, v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            a4.q1(qz0Var, v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                qz0Var.c(LocaleController.getString(R.string.GiftValue2), org.telegram.ui.Cells.p6.i("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f7.addView(qz0Var, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.n(e3Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.d2(this, i10, context, f6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f18446a;
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
        zf.b bVar = this.f47182q;
        d3 d3Var = (d3) this.f47180o.get(bVar);
        TextView textView = this.f47175j;
        ViewPropertyAnimator animate = textView.animate();
        if (d3Var != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        animate.alpha(f7).start();
        if (d3Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f47177l;
        if (d3Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        a aVar = this.f47176k;
        if (aVar.e != bVar) {
            aVar.e = bVar;
            aVar.a();
        }
        zf.b bVar2 = zf.b.f48978b;
        l40 l40Var = this.f47174i;
        if (l40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            l40Var.a(i10, z10);
        }
        if (bVar == bVar2 && (f4Var = this.f47183r) != null && f4Var.V) {
            f4Var.e(true);
        }
        a aVar2 = this.f47176k;
        zf.b bVar3 = zf.b.f48977a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 24));
            } else {
                aVar2.setOnClickListener(new ai.e2(20));
            }
        }
        nf.e eVar = this.f47179n;
        if (eVar != null) {
            eVar.a(false);
            this.f47179n = null;
        }
        int i11 = this.f47171c;
        long j3 = this.d;
        if (d3Var != null) {
            zf.b bVar4 = d3Var.f47096a;
            zf.a aVar3 = d3Var.f47098c;
            if (j3 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                this.f47177l.setText(y7.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j3));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f47177l.setText(y7.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
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
        this.f47179n = g10;
        g10.d();
        if (this.f47181p.add(bVar)) {
            v5.x(i11, bVar).H(this.f47169a, j3, null, true, new oj0(20, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.c2 c2Var = this.h;
        c2Var.X0 = true;
        c2Var.show();
        this.f47177l = (TextView) c2Var.d(-1);
        this.f47176k = c2Var.Z0;
        FrameLayout frameLayout = c2Var.Y0;
        this.f47178m = frameLayout;
        if (frameLayout != null && this.f47172f) {
            ci.f4 f4Var = new ci.f4(this.f47170b, 3);
            f4Var.p(true);
            f4Var.K = Layout.Alignment.ALIGN_NORMAL;
            f4Var.d = 5000L;
            f4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            f4Var.u();
            this.f47183r = f4Var;
            f4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f47178m.addView(this.f47183r, w7.x5.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}

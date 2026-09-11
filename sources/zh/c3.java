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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.oj0;
public final class c3 {
    public final TL_stars.TL_starGiftUnique f51735a;
    public final Context f51736b;
    public final int f51737c;
    public final long d;
    public final String f51738e;
    public final boolean f51739f;
    public final org.telegram.ui.ActionBar.f6 f51740g;
    public final org.telegram.ui.ActionBar.b2 h;
    public final l40 f51741i;
    public final TextView f51742j;
    public a f51743k;
    public TextView f51744l;
    public FrameLayout f51745m;
    public of.e f51746n;
    public final HashMap f51747o;
    public final HashSet f51748p;
    public zf.b f51749q;
    public di.f4 f51750r;

    public c3(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, a3 a3Var, int i10, long j3, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f51747o = hashMap;
        this.f51748p = new HashSet();
        this.f51736b = context;
        this.f51735a = tL_starGiftUnique;
        this.d = j3;
        this.f51737c = i10;
        zf.b bVar = a3Var.f51675a;
        this.f51749q = bVar;
        hashMap.put(bVar, a3Var);
        this.f51740g = f6Var;
        this.f51738e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f51739f = !z11;
        if (j3 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        }
        LinearLayout f7 = vl.f(context, 1);
        b3 b3Var = new b3(this, context);
        b3Var.addView(f7, w7.x5.c(-2.0f, -1));
        if (!z11) {
            l40 l40Var = new l40(context, f6Var);
            this.f51741i = l40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            l40Var.b(arrayList, new v(this, 2));
            f7.addView(l40Var, w7.x5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f51741i = null;
            TextView textView = new TextView(context);
            vl.n(org.telegram.ui.ActionBar.j6.f21042y6, f6Var, textView, 1, 14.0f);
            vl.k(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f7.addView(textView, w7.x5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f7.addView(new z2(context, tL_starGiftUnique, chat), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f51742j = textView2;
        vl.n(org.telegram.ui.ActionBar.j6.f20770j5, f6Var, textView2, 1, 16.0f);
        f7.addView(textView2, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            oz0 oz0Var = new oz0(context, f6Var);
            w3.q1(oz0Var, s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            w3.q1(oz0Var, s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            w3.q1(oz0Var, s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                oz0Var.c(LocaleController.getString(R.string.GiftValue2), org.telegram.ui.Cells.p6.i("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f7.addView(oz0Var, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.n(b3Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.e2(this, i10, context, f6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f20198a;
    }

    public final void a(boolean z10) {
        float f7;
        boolean z11;
        boolean z12;
        boolean z13;
        String formatString;
        String formatPluralStringComma;
        di.f4 f4Var;
        int i10;
        zf.b bVar = this.f51749q;
        a3 a3Var = (a3) this.f51747o.get(bVar);
        TextView textView = this.f51742j;
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
        TextView textView2 = this.f51744l;
        if (a3Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        a aVar = this.f51743k;
        if (aVar.f51643e != bVar) {
            aVar.f51643e = bVar;
            aVar.a();
        }
        zf.b bVar2 = zf.b.f51625b;
        l40 l40Var = this.f51741i;
        if (l40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            l40Var.a(i10, z10);
        }
        if (bVar == bVar2 && (f4Var = this.f51750r) != null && f4Var.V) {
            f4Var.e(true);
        }
        a aVar2 = this.f51743k;
        zf.b bVar3 = zf.b.f51624a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new ji.m4(this, 25));
            } else {
                aVar2.setOnClickListener(new ah.f(21));
            }
        }
        of.e eVar = this.f51746n;
        if (eVar != null) {
            eVar.a(false);
            this.f51746n = null;
        }
        int i11 = this.f51737c;
        long j3 = this.d;
        if (a3Var != null) {
            zf.b bVar4 = a3Var.f51675a;
            zf.a aVar3 = a3Var.f51677c;
            if (j3 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.f51738e;
            if (bVar4 == bVar3) {
                this.f51744l.setText(v7.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j3));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f51744l.setText(v7.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
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
        this.f51746n = g10;
        g10.d();
        if (this.f51748p.add(bVar)) {
            s5.x(i11, bVar).H(this.f51735a, j3, null, true, new oj0(20, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.b2 b2Var = this.h;
        b2Var.X0 = true;
        b2Var.show();
        this.f51744l = (TextView) b2Var.d(-1);
        this.f51743k = b2Var.Z0;
        FrameLayout frameLayout = b2Var.Y0;
        this.f51745m = frameLayout;
        if (frameLayout != null && this.f51739f) {
            di.f4 f4Var = new di.f4(this.f51736b, 3);
            f4Var.p(true);
            f4Var.K = Layout.Alignment.ALIGN_NORMAL;
            f4Var.d = 5000L;
            f4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            f4Var.u();
            this.f51750r = f4Var;
            f4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f51745m.addView(this.f51750r, w7.x5.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}

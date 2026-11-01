package rh;

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
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.xy0;
public final class g3 {
    public final TL_stars.TL_starGiftUnique f46952a;
    public final Context f46953b;
    public final int f46954c;
    public final long d;
    public final String e;
    public final boolean f46955f;
    public final org.telegram.ui.ActionBar.p6 f46956g;
    public final org.telegram.ui.ActionBar.x1 h;
    public final t30 f46957i;
    public final TextView f46958j;
    public a f46959k;
    public TextView f46960l;
    public FrameLayout f46961m;
    public gf.e f46962n;
    public final HashMap f46963o;
    public final HashSet f46964p;
    public sf.b f46965q;
    public vh.p2 f46966r;

    public g3(Context context, org.telegram.ui.ActionBar.p6 p6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, e3 e3Var, int i10, long j10, String str, boolean z10, k20 k20Var) {
        TLObject L0;
        HashMap hashMap = new HashMap();
        this.f46963o = hashMap;
        this.f46964p = new HashSet();
        this.f46953b = context;
        this.f46952a = tL_starGiftUnique;
        this.d = j10;
        this.f46954c = i10;
        sf.b bVar = e3Var.f46808a;
        this.f46965q = bVar;
        hashMap.put(bVar, e3Var);
        this.f46956g = p6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f46955f = !z11;
        if (j10 >= 0) {
            L0 = wp.r1(i10).Z1(Long.valueOf(j10));
        } else {
            L0 = wp.r1(i10).L0(Long.valueOf(-j10));
        }
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f3 f3Var = new f3(this, context);
        f3Var.addView(f7, w7.b6.c(-2.0f, -1));
        if (!z11) {
            t30 t30Var = new t30(context, p6Var);
            this.f46957i = t30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(dd.L0(2131750288, null));
            arrayList.add(dd.L0(2131750287, null));
            t30Var.b(arrayList, new x(this, 2));
            f7.addView(t30Var, w7.b6.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f46957i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
            sc.e.u(textView, 1, 14.0f, null, 2131750286);
            textView.setGravity(17);
            f7.addView(textView, w7.b6.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f7.addView(new d3(context, tL_starGiftUnique, L0), w7.b6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f46958j = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21038j5, p6Var);
        textView2.setTextSize(1, 16.0f);
        f7.addView(textView2, w7.b6.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            xy0 xy0Var = new xy0(context, p6Var);
            e4.k1(xy0Var, e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            e4.k1(xy0Var, e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            e4.k1(xy0Var, e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.u1 i11 = org.telegram.messenger.u1.i();
                long j11 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.u1.i().h(tL_starGiftUnique.value_currency);
                i11.getClass();
                xy0Var.c(dd.L0(2131749600, null), sc.e.h("~", org.telegram.messenger.u1.g(str2, h, j11, true)), null, null);
            }
            f7.addView(xy0Var, w7.b6.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        alertDialog$Builder.o(f3Var);
        alertDialog$Builder.k("_", new jg.q2(this, i10, context, p6Var, k20Var, 6));
        alertDialog$Builder.h(dd.L0(2131752589, null), null);
        this.h = alertDialog$Builder.f20135a;
    }

    public final void a(boolean z10) {
        float f7;
        boolean z11;
        boolean z12;
        boolean z13;
        char c10;
        String a02;
        String K;
        vh.p2 p2Var;
        int i10;
        sf.b bVar = this.f46965q;
        e3 e3Var = (e3) this.f46963o.get(bVar);
        TextView textView = this.f46958j;
        ViewPropertyAnimator animate = textView.animate();
        if (e3Var != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        animate.alpha(f7).start();
        if (e3Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f46960l;
        if (e3Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        a aVar = this.f46959k;
        if (aVar.e != bVar) {
            aVar.e = bVar;
            aVar.a();
        }
        sf.b bVar2 = sf.b.f48268b;
        t30 t30Var = this.f46957i;
        if (t30Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            t30Var.a(i10, z10);
        }
        if (bVar == bVar2 && (p2Var = this.f46966r) != null && p2Var.V) {
            p2Var.e(true);
        }
        a aVar2 = this.f46959k;
        sf.b bVar3 = sf.b.f48267a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new s(this, 6));
            } else {
                aVar2.setOnClickListener(new bh.c(17));
            }
        }
        gf.e eVar = this.f46962n;
        if (eVar != null) {
            eVar.a(false);
            this.f46962n = null;
        }
        int i11 = this.f46954c;
        long j10 = this.d;
        if (e3Var != null) {
            sf.b bVar4 = e3Var.f46808a;
            sf.a aVar3 = e3Var.f46810c;
            if (j10 == e20.i(i11).e()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                c10 = 0;
                this.f46960l.setText(h8.T0(dd.H(',', "Gift2BuyDoPrice2", (int) aVar3.a())));
                if (z13) {
                    K = dd.K("Gift2BuyPriceSelfText", (int) aVar3.a(), ',', str);
                } else {
                    K = dd.K("Gift2BuyPriceText", (int) aVar3.a(), ',', str, org.telegram.messenger.o5.t(j10));
                }
                textView.setText(org.telegram.messenger.i0.W2(K));
            } else {
                c10 = 0;
            }
            if (bVar4 == bVar2) {
                TextView textView3 = this.f46960l;
                Object[] objArr = new Object[1];
                objArr[c10] = aVar3.d();
                textView3.setText(h8.V0(dd.a0(null, null, 2131750291, objArr), true));
                if (z13) {
                    String d = aVar3.d();
                    Object[] objArr2 = new Object[2];
                    objArr2[c10] = d;
                    objArr2[1] = str;
                    a02 = dd.a0(null, null, 2131750283, objArr2);
                } else {
                    String d10 = aVar3.d();
                    String t10 = org.telegram.messenger.o5.t(j10);
                    Object[] objArr3 = new Object[3];
                    objArr3[c10] = d10;
                    objArr3[1] = str;
                    objArr3[2] = t10;
                    a02 = dd.a0(null, null, 2131750279, objArr3);
                }
                textView.setText(org.telegram.messenger.i0.W2(a02));
                return;
            }
            return;
        }
        gf.e h = this.h.h(-1, false, false);
        this.f46962n = h;
        h.d();
        if (this.f46964p.add(bVar)) {
            e6.x(i11, bVar).H(this.f46952a, j10, null, true, new q2(1, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.x1 x1Var = this.h;
        x1Var.Z0 = true;
        x1Var.show();
        this.f46960l = (TextView) x1Var.d(-1);
        this.f46959k = x1Var.f21474b1;
        FrameLayout frameLayout = x1Var.f21471a1;
        this.f46961m = frameLayout;
        if (frameLayout != null && this.f46955f) {
            vh.p2 p2Var = new vh.p2(this.f46953b, 3);
            p2Var.p(true);
            p2Var.K = Layout.Alignment.ALIGN_NORMAL;
            p2Var.d = 5000L;
            p2Var.s(dd.L0(2131750285, null));
            p2Var.u();
            this.f46966r = p2Var;
            p2Var.setPadding(org.telegram.messenger.i0.L(7.33f), 0, org.telegram.messenger.i0.L(7.33f), 0);
            this.f46961m.addView(this.f46966r, w7.b6.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}

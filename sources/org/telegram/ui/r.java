package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.ui.Components.RadioButton;
public final class r implements View.OnClickListener {
    public final int f50810a;
    public final g4 f50811b;

    public r(g4 g4Var, int i7) {
        this.f50810a = i7;
        this.f50811b = g4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        int i7 = 0;
        switch (this.f50810a) {
            case 0:
                g4 g4Var = this.f50811b;
                if (g4Var.f47336v0[0].f()) {
                    if (g4Var.f47336v0[0].getWebView() != null) {
                        g4Var.f47336v0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                g4Var.U(g4Var.H - 1);
                return;
            case 1:
                g4 g4Var2 = this.f50811b;
                if (g4Var2.f47336v0[0].f()) {
                    if (g4Var2.f47336v0[0].getWebView() != null) {
                        g4Var2.f47336v0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                g4Var2.U(g4Var2.H + 1);
                return;
            case 2:
                g4 g4Var3 = this.f50811b;
                l0 l0Var = g4Var3.f47324i0;
                if (l0Var.U) {
                    l0Var.h(false);
                    return;
                } else if (l0Var.f52645a0) {
                    l0Var.k(false);
                    return;
                } else {
                    if (g4Var3.H()) {
                        k3 k3Var = g4Var3.f47336v0[0];
                        if (k3Var.f48555s) {
                            if (k3Var.f() && k3Var.getWebView() != null) {
                                k3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (g4Var3.f47320e0.size() > 1) {
                        g4Var3.E();
                        return;
                    }
                    t3 t3Var = g4Var3.L;
                    if (t3Var != null) {
                        t3Var.a(false);
                        return;
                    } else {
                        g4Var3.m(true, true);
                        return;
                    }
                }
            case 3:
                t3 t3Var2 = this.f50811b.L;
                if (t3Var2 != null) {
                    t3Var2.a(true);
                    return;
                }
                return;
            case 4:
                g4 g4Var4 = this.f50811b;
                int intValue = ((Integer) view.getTag()).intValue();
                g4Var4.f49448a = intValue;
                for (int i10 = 0; i10 < 2; i10++) {
                    k0 k0Var = g4Var4.U0[i10];
                    if (i10 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) k0Var.f48534b).a(z10, true);
                }
                o3 o3Var = g4.f47296h1;
                int i11 = g4Var4.f49448a;
                o3Var.getClass();
                org.telegram.messenger.t0.f26600b.getSharedPreferences("articles", 0).edit().putInt("font_type", i11).commit();
                if (i11 == 0) {
                    typeface = Typeface.DEFAULT;
                } else {
                    typeface = Typeface.SERIF;
                }
                Typeface typeface2 = typeface;
                if (i11 == 0) {
                    create = org.telegram.messenger.g0.o1("fonts/ritalic.ttf");
                } else {
                    create = Typeface.create("serif", 2);
                }
                Typeface typeface3 = create;
                if (i11 == 0) {
                    create2 = org.telegram.messenger.g0.o();
                } else {
                    create2 = Typeface.create("serif", 1);
                }
                Typeface typeface4 = create2;
                if (i11 == 0) {
                    create3 = org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf");
                } else {
                    create3 = Typeface.create("serif", 3);
                }
                Typeface typeface5 = create3;
                for (int i12 = 0; i12 < o3Var.f49792t.size(); i12++) {
                    o3.b(o3Var.f49792t.keyAt(i12), (TextPaint) o3Var.f49792t.valueAt(i12), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i13 = 0; i13 < o3Var.f49791s.size(); i13++) {
                    o3.b(o3Var.f49791s.keyAt(i13), (TextPaint) o3Var.f49791s.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < o3Var.f49789q.size(); i14++) {
                    o3.b(o3Var.f49789q.keyAt(i14), (TextPaint) o3Var.f49789q.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < o3Var.f49790r.size(); i15++) {
                    o3.b(o3Var.f49790r.keyAt(i15), (TextPaint) o3Var.f49790r.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < o3Var.f49793u.size(); i16++) {
                    o3.b(o3Var.f49793u.keyAt(i16), (TextPaint) o3Var.f49793u.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < o3Var.f49794w.size(); i17++) {
                    o3.b(o3Var.f49794w.keyAt(i17), (TextPaint) o3Var.f49794w.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < o3Var.f49795x.size(); i18++) {
                    o3.b(o3Var.f49795x.keyAt(i18), (TextPaint) o3Var.f49795x.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < o3Var.f49776b.size(); i19++) {
                    o3.b(o3Var.f49776b.keyAt(i19), (TextPaint) o3Var.f49776b.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < o3Var.f49777c.size(); i20++) {
                    o3.b(o3Var.f49777c.keyAt(i20), (TextPaint) o3Var.f49777c.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < o3Var.f49787o.size(); i21++) {
                    o3.b(o3Var.f49787o.keyAt(i21), (TextPaint) o3Var.f49787o.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < o3Var.f49788p.size(); i22++) {
                    o3.b(o3Var.f49788p.keyAt(i22), (TextPaint) o3Var.f49788p.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < o3Var.v.size(); i23++) {
                    o3.b(o3Var.v.keyAt(i23), (TextPaint) o3Var.v.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < o3Var.f49796y.size(); i24++) {
                    o3.b(o3Var.f49796y.keyAt(i24), (TextPaint) o3Var.f49796y.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < o3Var.f49797z.size(); i25++) {
                    o3.b(o3Var.f49797z.keyAt(i25), (TextPaint) o3Var.f49797z.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < o3Var.A.size(); i26++) {
                    o3.b(o3Var.A.keyAt(i26), (TextPaint) o3Var.A.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    k3[] k3VarArr = g4Var4.f47336v0;
                    if (i7 < k3VarArr.length) {
                        k3VarArr[i7].f48550c.f();
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                g4 g4Var5 = this.f50811b;
                z2 z2Var = g4Var5.d;
                if (z2Var != null) {
                    org.telegram.messenger.g0.g(z2Var.d.getText());
                    if (org.telegram.messenger.g0.H3()) {
                        Toast.makeText(g4Var5.M, org.telegram.messenger.hd.M0(2131744194, null), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = g4Var5.I;
                if (g1Var != null && g1Var.isShowing()) {
                    g4Var5.I.d(true);
                    return;
                }
                return;
        }
    }
}

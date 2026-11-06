package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.ui.Components.RadioButton;
public final class r implements View.OnClickListener {
    public final int f49337a;
    public final g4 f49338b;

    public r(g4 g4Var, int i7) {
        this.f49337a = i7;
        this.f49338b = g4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z9;
        int i7 = 0;
        switch (this.f49337a) {
            case 0:
                g4 g4Var = this.f49338b;
                if (g4Var.f45842u0[0].f()) {
                    if (g4Var.f45842u0[0].getWebView() != null) {
                        g4Var.f45842u0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                g4Var.U(g4Var.G - 1);
                return;
            case 1:
                g4 g4Var2 = this.f49338b;
                if (g4Var2.f45842u0[0].f()) {
                    if (g4Var2.f45842u0[0].getWebView() != null) {
                        g4Var2.f45842u0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                g4Var2.U(g4Var2.G + 1);
                return;
            case 2:
                g4 g4Var3 = this.f49338b;
                l0 l0Var = g4Var3.f45830h0;
                if (l0Var.T) {
                    l0Var.h(false);
                    return;
                } else if (l0Var.W) {
                    l0Var.k(false);
                    return;
                } else {
                    if (g4Var3.H()) {
                        k3 k3Var = g4Var3.f45842u0[0];
                        if (k3Var.f47093s) {
                            if (k3Var.f() && k3Var.getWebView() != null) {
                                k3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (g4Var3.f45826d0.size() > 1) {
                        g4Var3.E();
                        return;
                    }
                    t3 t3Var = g4Var3.K;
                    if (t3Var != null) {
                        t3Var.a(false);
                        return;
                    } else {
                        g4Var3.m(true, true);
                        return;
                    }
                }
            case 3:
                t3 t3Var2 = this.f49338b.K;
                if (t3Var2 != null) {
                    t3Var2.a(true);
                    return;
                }
                return;
            case 4:
                g4 g4Var4 = this.f49338b;
                int intValue = ((Integer) view.getTag()).intValue();
                g4Var4.f48266a = intValue;
                for (int i10 = 0; i10 < 2; i10++) {
                    k0 k0Var = g4Var4.T0[i10];
                    if (i10 == intValue) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ((RadioButton) k0Var.f47070b).a(z9, true);
                }
                o3 o3Var = g4.f45803g1;
                int i11 = g4Var4.f48266a;
                o3Var.getClass();
                org.telegram.messenger.t0.f25563b.getSharedPreferences("articles", 0).edit().putInt("font_type", i11).commit();
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
                for (int i12 = 0; i12 < o3Var.f48241t.size(); i12++) {
                    o3.b(o3Var.f48241t.keyAt(i12), (TextPaint) o3Var.f48241t.valueAt(i12), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i13 = 0; i13 < o3Var.f48240s.size(); i13++) {
                    o3.b(o3Var.f48240s.keyAt(i13), (TextPaint) o3Var.f48240s.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < o3Var.f48238q.size(); i14++) {
                    o3.b(o3Var.f48238q.keyAt(i14), (TextPaint) o3Var.f48238q.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < o3Var.f48239r.size(); i15++) {
                    o3.b(o3Var.f48239r.keyAt(i15), (TextPaint) o3Var.f48239r.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < o3Var.f48242u.size(); i16++) {
                    o3.b(o3Var.f48242u.keyAt(i16), (TextPaint) o3Var.f48242u.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < o3Var.f48243w.size(); i17++) {
                    o3.b(o3Var.f48243w.keyAt(i17), (TextPaint) o3Var.f48243w.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < o3Var.f48244x.size(); i18++) {
                    o3.b(o3Var.f48244x.keyAt(i18), (TextPaint) o3Var.f48244x.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < o3Var.f48225b.size(); i19++) {
                    o3.b(o3Var.f48225b.keyAt(i19), (TextPaint) o3Var.f48225b.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < o3Var.f48226c.size(); i20++) {
                    o3.b(o3Var.f48226c.keyAt(i20), (TextPaint) o3Var.f48226c.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < o3Var.f48236o.size(); i21++) {
                    o3.b(o3Var.f48236o.keyAt(i21), (TextPaint) o3Var.f48236o.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < o3Var.f48237p.size(); i22++) {
                    o3.b(o3Var.f48237p.keyAt(i22), (TextPaint) o3Var.f48237p.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < o3Var.v.size(); i23++) {
                    o3.b(o3Var.v.keyAt(i23), (TextPaint) o3Var.v.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < o3Var.f48245y.size(); i24++) {
                    o3.b(o3Var.f48245y.keyAt(i24), (TextPaint) o3Var.f48245y.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < o3Var.f48246z.size(); i25++) {
                    o3.b(o3Var.f48246z.keyAt(i25), (TextPaint) o3Var.f48246z.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < o3Var.A.size(); i26++) {
                    o3.b(o3Var.A.keyAt(i26), (TextPaint) o3Var.A.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    k3[] k3VarArr = g4Var4.f45842u0;
                    if (i7 < k3VarArr.length) {
                        k3VarArr[i7].f47088c.f();
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                g4 g4Var5 = this.f49338b;
                z2 z2Var = g4Var5.d;
                if (z2Var != null) {
                    org.telegram.messenger.g0.g(z2Var.d.getText());
                    if (org.telegram.messenger.g0.I3()) {
                        Toast.makeText(g4Var5.L, org.telegram.messenger.hd.M0(2131744195, null), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = g4Var5.H;
                if (g1Var != null && g1Var.isShowing()) {
                    g4Var5.H.d(true);
                    return;
                }
                return;
        }
    }
}

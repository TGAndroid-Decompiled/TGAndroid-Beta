package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.ui.Components.RadioButton;
public final class r implements View.OnClickListener {
    public final int f48977a;
    public final i4 f48978b;

    public r(i4 i4Var, int i3) {
        this.f48977a = i3;
        this.f48978b = i4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        int i3 = 0;
        switch (this.f48977a) {
            case 0:
                i4 i4Var = this.f48978b;
                if (i4Var.f46100v0[0].f()) {
                    if (i4Var.f46100v0[0].getWebView() != null) {
                        i4Var.f46100v0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                i4Var.U(i4Var.H - 1);
                return;
            case 1:
                i4 i4Var2 = this.f48978b;
                if (i4Var2.f46100v0[0].f()) {
                    if (i4Var2.f46100v0[0].getWebView() != null) {
                        i4Var2.f46100v0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                i4Var2.U(i4Var2.H + 1);
                return;
            case 2:
                i4 i4Var3 = this.f48978b;
                m0 m0Var = i4Var3.f46088i0;
                if (m0Var.U) {
                    m0Var.h(false);
                    return;
                } else if (m0Var.f50871a0) {
                    m0Var.k(false);
                    return;
                } else {
                    if (i4Var3.H()) {
                        l3 l3Var = i4Var3.f46100v0[0];
                        if (l3Var.f47089s) {
                            if (l3Var.f() && l3Var.getWebView() != null) {
                                l3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (i4Var3.f46084e0.size() > 1) {
                        i4Var3.E();
                        return;
                    }
                    u3 u3Var = i4Var3.L;
                    if (u3Var != null) {
                        u3Var.a(false);
                        return;
                    } else {
                        i4Var3.m(true, true);
                        return;
                    }
                }
            case 3:
                u3 u3Var2 = this.f48978b.L;
                if (u3Var2 != null) {
                    u3Var2.a(true);
                    return;
                }
                return;
            case 4:
                i4 i4Var4 = this.f48978b;
                int intValue = ((Integer) view.getTag()).intValue();
                i4Var4.f46110a = intValue;
                for (int i10 = 0; i10 < 2; i10++) {
                    l0 l0Var = i4Var4.U0[i10];
                    if (i10 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) l0Var.f47060b).a(z10, true);
                }
                p3 p3Var = i4.f46060h1;
                int i11 = i4Var4.f46110a;
                p3Var.getClass();
                org.telegram.messenger.t0.f25457b.getSharedPreferences("articles", 0).edit().putInt("font_type", i11).commit();
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
                for (int i12 = 0; i12 < p3Var.f48447t.size(); i12++) {
                    p3.b(p3Var.f48447t.keyAt(i12), (TextPaint) p3Var.f48447t.valueAt(i12), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i13 = 0; i13 < p3Var.f48446s.size(); i13++) {
                    p3.b(p3Var.f48446s.keyAt(i13), (TextPaint) p3Var.f48446s.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < p3Var.f48444q.size(); i14++) {
                    p3.b(p3Var.f48444q.keyAt(i14), (TextPaint) p3Var.f48444q.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < p3Var.f48445r.size(); i15++) {
                    p3.b(p3Var.f48445r.keyAt(i15), (TextPaint) p3Var.f48445r.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < p3Var.f48448u.size(); i16++) {
                    p3.b(p3Var.f48448u.keyAt(i16), (TextPaint) p3Var.f48448u.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < p3Var.f48449w.size(); i17++) {
                    p3.b(p3Var.f48449w.keyAt(i17), (TextPaint) p3Var.f48449w.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < p3Var.f48450x.size(); i18++) {
                    p3.b(p3Var.f48450x.keyAt(i18), (TextPaint) p3Var.f48450x.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < p3Var.f48431b.size(); i19++) {
                    p3.b(p3Var.f48431b.keyAt(i19), (TextPaint) p3Var.f48431b.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < p3Var.f48432c.size(); i20++) {
                    p3.b(p3Var.f48432c.keyAt(i20), (TextPaint) p3Var.f48432c.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < p3Var.f48442o.size(); i21++) {
                    p3.b(p3Var.f48442o.keyAt(i21), (TextPaint) p3Var.f48442o.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < p3Var.f48443p.size(); i22++) {
                    p3.b(p3Var.f48443p.keyAt(i22), (TextPaint) p3Var.f48443p.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < p3Var.v.size(); i23++) {
                    p3.b(p3Var.v.keyAt(i23), (TextPaint) p3Var.v.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < p3Var.f48451y.size(); i24++) {
                    p3.b(p3Var.f48451y.keyAt(i24), (TextPaint) p3Var.f48451y.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < p3Var.f48452z.size(); i25++) {
                    p3.b(p3Var.f48452z.keyAt(i25), (TextPaint) p3Var.f48452z.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < p3Var.A.size(); i26++) {
                    p3.b(p3Var.A.keyAt(i26), (TextPaint) p3Var.A.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    l3[] l3VarArr = i4Var4.f46100v0;
                    if (i3 < l3VarArr.length) {
                        l3VarArr[i3].f47084c.f();
                        i3++;
                    } else {
                        return;
                    }
                }
            default:
                i4 i4Var5 = this.f48978b;
                a3 a3Var = i4Var5.d;
                if (a3Var != null) {
                    org.telegram.messenger.g0.g(a3Var.d.getText());
                    if (org.telegram.messenger.g0.I3()) {
                        Toast.makeText(i4Var5.M, org.telegram.messenger.bd.M0(2131744204, null), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.f1 f1Var = i4Var5.I;
                if (f1Var != null && f1Var.isShowing()) {
                    i4Var5.I.d(true);
                    return;
                }
                return;
        }
    }
}

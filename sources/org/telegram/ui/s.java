package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;
public final class s implements View.OnClickListener {
    public final int f42516a;
    public final l4 f42517b;

    public s(l4 l4Var, int i9) {
        this.f42516a = i9;
        this.f42517b = l4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        switch (this.f42516a) {
            case 0:
                l4 l4Var = this.f42517b;
                if (l4Var.f40026q0[0].f()) {
                    if (l4Var.f40026q0[0].getWebView() != null) {
                        l4Var.f40026q0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                l4Var.W(l4Var.C - 1);
                return;
            case 1:
                l4 l4Var2 = this.f42517b;
                if (l4Var2.f40026q0[0].f()) {
                    if (l4Var2.f40026q0[0].getWebView() != null) {
                        l4Var2.f40026q0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                l4Var2.W(l4Var2.C + 1);
                return;
            case 2:
                l4 l4Var3 = this.f42517b;
                n0 n0Var = l4Var3.f40014d0;
                if (n0Var.P) {
                    n0Var.h(false);
                    return;
                } else if (n0Var.S) {
                    n0Var.k(false);
                    return;
                } else {
                    if (l4Var3.J()) {
                        p3 p3Var = l4Var3.f40026q0[0];
                        if (p3Var.f41326s) {
                            if (p3Var.f() && p3Var.getWebView() != null) {
                                p3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (l4Var3.Z.size() > 1) {
                        l4Var3.G();
                        return;
                    }
                    y3 y3Var = l4Var3.G;
                    if (y3Var != null) {
                        y3Var.dismiss(false);
                        return;
                    } else {
                        l4Var3.o(true, true);
                        return;
                    }
                }
            case 3:
                y3 y3Var2 = this.f42517b.G;
                if (y3Var2 != null) {
                    y3Var2.dismiss(true);
                    return;
                }
                return;
            case 4:
                l4 l4Var4 = this.f42517b;
                int intValue = ((Integer) view.getTag()).intValue();
                l4Var4.f36373a = intValue;
                int i9 = 0;
                for (int i10 = 0; i10 < 2; i10++) {
                    m0 m0Var = l4Var4.O0[i10];
                    if (i10 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) m0Var.f40272b).a(z10, true);
                }
                t3 t3Var = l4.f39989b1;
                int i11 = l4Var4.f36373a;
                t3Var.getClass();
                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i11).commit();
                if (i11 == 0) {
                    typeface = Typeface.DEFAULT;
                } else {
                    typeface = Typeface.SERIF;
                }
                Typeface typeface2 = typeface;
                if (i11 == 0) {
                    create = AndroidUtilities.getTypeface("fonts/ritalic.ttf");
                } else {
                    create = Typeface.create("serif", 2);
                }
                Typeface typeface3 = create;
                if (i11 == 0) {
                    create2 = AndroidUtilities.bold();
                } else {
                    create2 = Typeface.create("serif", 1);
                }
                Typeface typeface4 = create2;
                if (i11 == 0) {
                    create3 = AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
                } else {
                    create3 = Typeface.create("serif", 3);
                }
                Typeface typeface5 = create3;
                for (int i12 = 0; i12 < t3Var.f42839t.size(); i12++) {
                    t3.b(t3Var.f42839t.keyAt(i12), (TextPaint) t3Var.f42839t.valueAt(i12), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i13 = 0; i13 < t3Var.f42838s.size(); i13++) {
                    t3.b(t3Var.f42838s.keyAt(i13), (TextPaint) t3Var.f42838s.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < t3Var.f42836q.size(); i14++) {
                    t3.b(t3Var.f42836q.keyAt(i14), (TextPaint) t3Var.f42836q.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < t3Var.f42837r.size(); i15++) {
                    t3.b(t3Var.f42837r.keyAt(i15), (TextPaint) t3Var.f42837r.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < t3Var.f42840u.size(); i16++) {
                    t3.b(t3Var.f42840u.keyAt(i16), (TextPaint) t3Var.f42840u.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < t3Var.f42841w.size(); i17++) {
                    t3.b(t3Var.f42841w.keyAt(i17), (TextPaint) t3Var.f42841w.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < t3Var.f42842x.size(); i18++) {
                    t3.b(t3Var.f42842x.keyAt(i18), (TextPaint) t3Var.f42842x.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < t3Var.f42823b.size(); i19++) {
                    t3.b(t3Var.f42823b.keyAt(i19), (TextPaint) t3Var.f42823b.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < t3Var.f42824c.size(); i20++) {
                    t3.b(t3Var.f42824c.keyAt(i20), (TextPaint) t3Var.f42824c.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < t3Var.f42834o.size(); i21++) {
                    t3.b(t3Var.f42834o.keyAt(i21), (TextPaint) t3Var.f42834o.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < t3Var.f42835p.size(); i22++) {
                    t3.b(t3Var.f42835p.keyAt(i22), (TextPaint) t3Var.f42835p.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < t3Var.v.size(); i23++) {
                    t3.b(t3Var.v.keyAt(i23), (TextPaint) t3Var.v.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < t3Var.f42843y.size(); i24++) {
                    t3.b(t3Var.f42843y.keyAt(i24), (TextPaint) t3Var.f42843y.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < t3Var.f42844z.size(); i25++) {
                    t3.b(t3Var.f42844z.keyAt(i25), (TextPaint) t3Var.f42844z.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < t3Var.A.size(); i26++) {
                    t3.b(t3Var.A.keyAt(i26), (TextPaint) t3Var.A.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    p3[] p3VarArr = l4Var4.f40026q0;
                    if (i9 < p3VarArr.length) {
                        p3VarArr[i9].f41321c.l();
                        i9++;
                    } else {
                        return;
                    }
                }
            default:
                l4 l4Var5 = this.f42517b;
                e3 e3Var = l4Var5.d;
                if (e3Var != null) {
                    AndroidUtilities.addToClipboard(e3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(l4Var5.H, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.o1 o1Var = l4Var5.D;
                if (o1Var != null && o1Var.isShowing()) {
                    l4Var5.D.d(true);
                    return;
                }
                return;
        }
    }
}

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
public final class r implements View.OnClickListener {
    public final int f40949a;
    public final k4 f40950b;

    public r(k4 k4Var, int i10) {
        this.f40949a = i10;
        this.f40950b = k4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        switch (this.f40949a) {
            case 0:
                k4 k4Var = this.f40950b;
                if (k4Var.f38805u0[0].f()) {
                    if (k4Var.f38805u0[0].getWebView() != null) {
                        k4Var.f38805u0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                k4Var.W(k4Var.G - 1);
                return;
            case 1:
                k4 k4Var2 = this.f40950b;
                if (k4Var2.f38805u0[0].f()) {
                    if (k4Var2.f38805u0[0].getWebView() != null) {
                        k4Var2.f38805u0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                k4Var2.W(k4Var2.G + 1);
                return;
            case 2:
                k4 k4Var3 = this.f40950b;
                m0 m0Var = k4Var3.f38793h0;
                if (m0Var.T) {
                    m0Var.h(false);
                    return;
                } else if (m0Var.W) {
                    m0Var.k(false);
                    return;
                } else {
                    if (k4Var3.J()) {
                        n3 n3Var = k4Var3.f38805u0[0];
                        if (n3Var.f39757s) {
                            if (n3Var.f() && n3Var.getWebView() != null) {
                                n3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (k4Var3.f38789d0.size() > 1) {
                        k4Var3.G();
                        return;
                    }
                    w3 w3Var = k4Var3.K;
                    if (w3Var != null) {
                        w3Var.dismiss(false);
                        return;
                    } else {
                        k4Var3.o(true, true);
                        return;
                    }
                }
            case 3:
                w3 w3Var2 = this.f40950b.K;
                if (w3Var2 != null) {
                    w3Var2.dismiss(true);
                    return;
                }
                return;
            case 4:
                k4 k4Var4 = this.f40950b;
                int intValue = ((Integer) view.getTag()).intValue();
                k4Var4.f37229a = intValue;
                int i10 = 0;
                for (int i11 = 0; i11 < 2; i11++) {
                    l0 l0Var = k4Var4.T0[i11];
                    if (i11 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) l0Var.f39094b).a(z10, true);
                }
                r3 r3Var = k4.f38765g1;
                int i12 = k4Var4.f37229a;
                r3Var.getClass();
                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i12).commit();
                if (i12 == 0) {
                    typeface = Typeface.DEFAULT;
                } else {
                    typeface = Typeface.SERIF;
                }
                Typeface typeface2 = typeface;
                if (i12 == 0) {
                    create = AndroidUtilities.getTypeface("fonts/ritalic.ttf");
                } else {
                    create = Typeface.create("serif", 2);
                }
                Typeface typeface3 = create;
                if (i12 == 0) {
                    create2 = AndroidUtilities.bold();
                } else {
                    create2 = Typeface.create("serif", 1);
                }
                Typeface typeface4 = create2;
                if (i12 == 0) {
                    create3 = AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
                } else {
                    create3 = Typeface.create("serif", 3);
                }
                Typeface typeface5 = create3;
                for (int i13 = 0; i13 < r3Var.f41002t.size(); i13++) {
                    r3.b(r3Var.f41002t.keyAt(i13), (TextPaint) r3Var.f41002t.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < r3Var.f41001s.size(); i14++) {
                    r3.b(r3Var.f41001s.keyAt(i14), (TextPaint) r3Var.f41001s.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < r3Var.f40999q.size(); i15++) {
                    r3.b(r3Var.f40999q.keyAt(i15), (TextPaint) r3Var.f40999q.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < r3Var.f41000r.size(); i16++) {
                    r3.b(r3Var.f41000r.keyAt(i16), (TextPaint) r3Var.f41000r.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < r3Var.f41003u.size(); i17++) {
                    r3.b(r3Var.f41003u.keyAt(i17), (TextPaint) r3Var.f41003u.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < r3Var.f41004w.size(); i18++) {
                    r3.b(r3Var.f41004w.keyAt(i18), (TextPaint) r3Var.f41004w.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < r3Var.f41005x.size(); i19++) {
                    r3.b(r3Var.f41005x.keyAt(i19), (TextPaint) r3Var.f41005x.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < r3Var.f40987b.size(); i20++) {
                    r3.b(r3Var.f40987b.keyAt(i20), (TextPaint) r3Var.f40987b.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < r3Var.f40988c.size(); i21++) {
                    r3.b(r3Var.f40988c.keyAt(i21), (TextPaint) r3Var.f40988c.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < r3Var.f40997o.size(); i22++) {
                    r3.b(r3Var.f40997o.keyAt(i22), (TextPaint) r3Var.f40997o.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < r3Var.f40998p.size(); i23++) {
                    r3.b(r3Var.f40998p.keyAt(i23), (TextPaint) r3Var.f40998p.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < r3Var.v.size(); i24++) {
                    r3.b(r3Var.v.keyAt(i24), (TextPaint) r3Var.v.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < r3Var.f41006y.size(); i25++) {
                    r3.b(r3Var.f41006y.keyAt(i25), (TextPaint) r3Var.f41006y.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < r3Var.f41007z.size(); i26++) {
                    r3.b(r3Var.f41007z.keyAt(i26), (TextPaint) r3Var.f41007z.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i27 = 0; i27 < r3Var.A.size(); i27++) {
                    r3.b(r3Var.A.keyAt(i27), (TextPaint) r3Var.A.valueAt(i27), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    n3[] n3VarArr = k4Var4.f38805u0;
                    if (i10 < n3VarArr.length) {
                        n3VarArr[i10].f39753c.l();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                k4 k4Var5 = this.f40950b;
                c3 c3Var = k4Var5.d;
                if (c3Var != null) {
                    AndroidUtilities.addToClipboard(c3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(k4Var5.L, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = k4Var5.H;
                if (m1Var != null && m1Var.isShowing()) {
                    k4Var5.H.d(true);
                    return;
                }
                return;
        }
    }
}

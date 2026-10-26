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
    public final int f42960a;
    public final j4 f42961b;

    public r(j4 j4Var, int i10) {
        this.f42960a = i10;
        this.f42961b = j4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        switch (this.f42960a) {
            case 0:
                j4 j4Var = this.f42961b;
                if (j4Var.f40449u0[0].f()) {
                    if (j4Var.f40449u0[0].getWebView() != null) {
                        j4Var.f40449u0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                j4Var.W(j4Var.G - 1);
                return;
            case 1:
                j4 j4Var2 = this.f42961b;
                if (j4Var2.f40449u0[0].f()) {
                    if (j4Var2.f40449u0[0].getWebView() != null) {
                        j4Var2.f40449u0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                j4Var2.W(j4Var2.G + 1);
                return;
            case 2:
                j4 j4Var3 = this.f42961b;
                l0 l0Var = j4Var3.f40437h0;
                if (l0Var.T) {
                    l0Var.h(false);
                    return;
                } else if (l0Var.W) {
                    l0Var.k(false);
                    return;
                } else {
                    if (j4Var3.J()) {
                        m3 m3Var = j4Var3.f40449u0[0];
                        if (m3Var.f41448s) {
                            if (m3Var.f() && m3Var.getWebView() != null) {
                                m3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (j4Var3.f40433d0.size() > 1) {
                        j4Var3.G();
                        return;
                    }
                    v3 v3Var = j4Var3.K;
                    if (v3Var != null) {
                        v3Var.dismiss(false);
                        return;
                    } else {
                        j4Var3.o(true, true);
                        return;
                    }
                }
            case 3:
                v3 v3Var2 = this.f42961b.K;
                if (v3Var2 != null) {
                    v3Var2.dismiss(true);
                    return;
                }
                return;
            case 4:
                j4 j4Var4 = this.f42961b;
                int intValue = ((Integer) view.getTag()).intValue();
                j4Var4.f39919a = intValue;
                int i10 = 0;
                for (int i11 = 0; i11 < 2; i11++) {
                    k0 k0Var = j4Var4.T0[i11];
                    if (i11 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) k0Var.f40772b).a(z10, true);
                }
                q3 q3Var = j4.f40409g1;
                int i12 = j4Var4.f39919a;
                q3Var.getClass();
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
                for (int i13 = 0; i13 < q3Var.f42731t.size(); i13++) {
                    q3.b(q3Var.f42731t.keyAt(i13), (TextPaint) q3Var.f42731t.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < q3Var.f42730s.size(); i14++) {
                    q3.b(q3Var.f42730s.keyAt(i14), (TextPaint) q3Var.f42730s.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < q3Var.f42728q.size(); i15++) {
                    q3.b(q3Var.f42728q.keyAt(i15), (TextPaint) q3Var.f42728q.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < q3Var.f42729r.size(); i16++) {
                    q3.b(q3Var.f42729r.keyAt(i16), (TextPaint) q3Var.f42729r.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < q3Var.f42732u.size(); i17++) {
                    q3.b(q3Var.f42732u.keyAt(i17), (TextPaint) q3Var.f42732u.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < q3Var.f42733w.size(); i18++) {
                    q3.b(q3Var.f42733w.keyAt(i18), (TextPaint) q3Var.f42733w.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < q3Var.f42734x.size(); i19++) {
                    q3.b(q3Var.f42734x.keyAt(i19), (TextPaint) q3Var.f42734x.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < q3Var.f42716b.size(); i20++) {
                    q3.b(q3Var.f42716b.keyAt(i20), (TextPaint) q3Var.f42716b.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < q3Var.f42717c.size(); i21++) {
                    q3.b(q3Var.f42717c.keyAt(i21), (TextPaint) q3Var.f42717c.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < q3Var.f42726o.size(); i22++) {
                    q3.b(q3Var.f42726o.keyAt(i22), (TextPaint) q3Var.f42726o.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < q3Var.f42727p.size(); i23++) {
                    q3.b(q3Var.f42727p.keyAt(i23), (TextPaint) q3Var.f42727p.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < q3Var.v.size(); i24++) {
                    q3.b(q3Var.v.keyAt(i24), (TextPaint) q3Var.v.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < q3Var.f42735y.size(); i25++) {
                    q3.b(q3Var.f42735y.keyAt(i25), (TextPaint) q3Var.f42735y.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < q3Var.f42736z.size(); i26++) {
                    q3.b(q3Var.f42736z.keyAt(i26), (TextPaint) q3Var.f42736z.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i27 = 0; i27 < q3Var.A.size(); i27++) {
                    q3.b(q3Var.A.keyAt(i27), (TextPaint) q3Var.A.valueAt(i27), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    m3[] m3VarArr = j4Var4.f40449u0;
                    if (i10 < m3VarArr.length) {
                        m3VarArr[i10].f41444c.l();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                j4 j4Var5 = this.f42961b;
                a3 a3Var = j4Var5.d;
                if (a3Var != null) {
                    AndroidUtilities.addToClipboard(a3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(j4Var5.L, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.o1 o1Var = j4Var5.H;
                if (o1Var != null && o1Var.isShowing()) {
                    j4Var5.H.d(true);
                    return;
                }
                return;
        }
    }
}

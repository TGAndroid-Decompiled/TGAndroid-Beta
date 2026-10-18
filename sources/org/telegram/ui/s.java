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
    public final int f40823a;
    public final l4 f40824b;

    public s(l4 l4Var, int i10) {
        this.f40823a = i10;
        this.f40824b = l4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        switch (this.f40823a) {
            case 0:
                l4 l4Var = this.f40824b;
                if (l4Var.f38725u0[0].f()) {
                    if (l4Var.f38725u0[0].getWebView() != null) {
                        l4Var.f38725u0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                l4Var.W(l4Var.G - 1);
                return;
            case 1:
                l4 l4Var2 = this.f40824b;
                if (l4Var2.f38725u0[0].f()) {
                    if (l4Var2.f38725u0[0].getWebView() != null) {
                        l4Var2.f38725u0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                l4Var2.W(l4Var2.G + 1);
                return;
            case 2:
                l4 l4Var3 = this.f40824b;
                n0 n0Var = l4Var3.f38713h0;
                if (n0Var.T) {
                    n0Var.h(false);
                    return;
                } else if (n0Var.W) {
                    n0Var.k(false);
                    return;
                } else {
                    if (l4Var3.J()) {
                        o3 o3Var = l4Var3.f38725u0[0];
                        if (o3Var.f39651s) {
                            if (o3Var.f() && o3Var.getWebView() != null) {
                                o3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (l4Var3.f38709d0.size() > 1) {
                        l4Var3.G();
                        return;
                    }
                    x3 x3Var = l4Var3.K;
                    if (x3Var != null) {
                        x3Var.dismiss(false);
                        return;
                    } else {
                        l4Var3.o(true, true);
                        return;
                    }
                }
            case 3:
                x3 x3Var2 = this.f40824b.K;
                if (x3Var2 != null) {
                    x3Var2.dismiss(true);
                    return;
                }
                return;
            case 4:
                l4 l4Var4 = this.f40824b;
                int intValue = ((Integer) view.getTag()).intValue();
                l4Var4.f36077a = intValue;
                int i10 = 0;
                for (int i11 = 0; i11 < 2; i11++) {
                    m0 m0Var = l4Var4.S0[i11];
                    if (i11 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) m0Var.f38950b).a(z10, true);
                }
                s3 s3Var = l4.f38685f1;
                int i12 = l4Var4.f36077a;
                s3Var.getClass();
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
                for (int i13 = 0; i13 < s3Var.f40873t.size(); i13++) {
                    s3.b(s3Var.f40873t.keyAt(i13), (TextPaint) s3Var.f40873t.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < s3Var.f40872s.size(); i14++) {
                    s3.b(s3Var.f40872s.keyAt(i14), (TextPaint) s3Var.f40872s.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < s3Var.f40870q.size(); i15++) {
                    s3.b(s3Var.f40870q.keyAt(i15), (TextPaint) s3Var.f40870q.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < s3Var.f40871r.size(); i16++) {
                    s3.b(s3Var.f40871r.keyAt(i16), (TextPaint) s3Var.f40871r.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < s3Var.f40874u.size(); i17++) {
                    s3.b(s3Var.f40874u.keyAt(i17), (TextPaint) s3Var.f40874u.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < s3Var.f40875w.size(); i18++) {
                    s3.b(s3Var.f40875w.keyAt(i18), (TextPaint) s3Var.f40875w.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < s3Var.f40876x.size(); i19++) {
                    s3.b(s3Var.f40876x.keyAt(i19), (TextPaint) s3Var.f40876x.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < s3Var.f40858b.size(); i20++) {
                    s3.b(s3Var.f40858b.keyAt(i20), (TextPaint) s3Var.f40858b.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < s3Var.f40859c.size(); i21++) {
                    s3.b(s3Var.f40859c.keyAt(i21), (TextPaint) s3Var.f40859c.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < s3Var.f40868o.size(); i22++) {
                    s3.b(s3Var.f40868o.keyAt(i22), (TextPaint) s3Var.f40868o.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < s3Var.f40869p.size(); i23++) {
                    s3.b(s3Var.f40869p.keyAt(i23), (TextPaint) s3Var.f40869p.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < s3Var.v.size(); i24++) {
                    s3.b(s3Var.v.keyAt(i24), (TextPaint) s3Var.v.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < s3Var.f40877y.size(); i25++) {
                    s3.b(s3Var.f40877y.keyAt(i25), (TextPaint) s3Var.f40877y.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < s3Var.f40878z.size(); i26++) {
                    s3.b(s3Var.f40878z.keyAt(i26), (TextPaint) s3Var.f40878z.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i27 = 0; i27 < s3Var.A.size(); i27++) {
                    s3.b(s3Var.A.keyAt(i27), (TextPaint) s3Var.A.valueAt(i27), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    o3[] o3VarArr = l4Var4.f38725u0;
                    if (i10 < o3VarArr.length) {
                        o3VarArr[i10].f39647c.l();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                l4 l4Var5 = this.f40824b;
                d3 d3Var = l4Var5.d;
                if (d3Var != null) {
                    AndroidUtilities.addToClipboard(d3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(l4Var5.L, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = l4Var5.H;
                if (m1Var != null && m1Var.isShowing()) {
                    l4Var5.H.d(true);
                    return;
                }
                return;
        }
    }
}

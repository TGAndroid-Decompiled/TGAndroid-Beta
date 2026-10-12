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
    public final int f39904a;
    public final k4 f39905b;

    public s(k4 k4Var, int i10) {
        this.f39904a = i10;
        this.f39905b = k4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        switch (this.f39904a) {
            case 0:
                k4 k4Var = this.f39905b;
                if (k4Var.f37557u0[0].f()) {
                    if (k4Var.f37557u0[0].getWebView() != null) {
                        k4Var.f37557u0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                k4Var.W(k4Var.G - 1);
                return;
            case 1:
                k4 k4Var2 = this.f39905b;
                if (k4Var2.f37557u0[0].f()) {
                    if (k4Var2.f37557u0[0].getWebView() != null) {
                        k4Var2.f37557u0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                k4Var2.W(k4Var2.G + 1);
                return;
            case 2:
                k4 k4Var3 = this.f39905b;
                m0 m0Var = k4Var3.f37545h0;
                if (m0Var.T) {
                    m0Var.h(false);
                    return;
                } else if (m0Var.W) {
                    m0Var.k(false);
                    return;
                } else {
                    if (k4Var3.J()) {
                        o3 o3Var = k4Var3.f37557u0[0];
                        if (o3Var.f38852s) {
                            if (o3Var.f() && o3Var.getWebView() != null) {
                                o3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (k4Var3.f37541d0.size() > 1) {
                        k4Var3.G();
                        return;
                    }
                    x3 x3Var = k4Var3.K;
                    if (x3Var != null) {
                        x3Var.dismiss(false);
                        return;
                    } else {
                        k4Var3.o(true, true);
                        return;
                    }
                }
            case 3:
                x3 x3Var2 = this.f39905b.K;
                if (x3Var2 != null) {
                    x3Var2.dismiss(true);
                    return;
                }
                return;
            case 4:
                k4 k4Var4 = this.f39905b;
                int intValue = ((Integer) view.getTag()).intValue();
                k4Var4.f42500a = intValue;
                int i10 = 0;
                for (int i11 = 0; i11 < 2; i11++) {
                    l0 l0Var = k4Var4.S0[i11];
                    if (i11 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) l0Var.f37796b).a(z10, true);
                }
                s3 s3Var = k4.f37517f1;
                int i12 = k4Var4.f42500a;
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
                for (int i13 = 0; i13 < s3Var.f39959t.size(); i13++) {
                    s3.b(s3Var.f39959t.keyAt(i13), (TextPaint) s3Var.f39959t.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < s3Var.f39958s.size(); i14++) {
                    s3.b(s3Var.f39958s.keyAt(i14), (TextPaint) s3Var.f39958s.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < s3Var.f39956q.size(); i15++) {
                    s3.b(s3Var.f39956q.keyAt(i15), (TextPaint) s3Var.f39956q.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < s3Var.f39957r.size(); i16++) {
                    s3.b(s3Var.f39957r.keyAt(i16), (TextPaint) s3Var.f39957r.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < s3Var.f39960u.size(); i17++) {
                    s3.b(s3Var.f39960u.keyAt(i17), (TextPaint) s3Var.f39960u.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < s3Var.f39961w.size(); i18++) {
                    s3.b(s3Var.f39961w.keyAt(i18), (TextPaint) s3Var.f39961w.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < s3Var.f39962x.size(); i19++) {
                    s3.b(s3Var.f39962x.keyAt(i19), (TextPaint) s3Var.f39962x.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < s3Var.f39944b.size(); i20++) {
                    s3.b(s3Var.f39944b.keyAt(i20), (TextPaint) s3Var.f39944b.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < s3Var.f39945c.size(); i21++) {
                    s3.b(s3Var.f39945c.keyAt(i21), (TextPaint) s3Var.f39945c.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < s3Var.f39954o.size(); i22++) {
                    s3.b(s3Var.f39954o.keyAt(i22), (TextPaint) s3Var.f39954o.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < s3Var.f39955p.size(); i23++) {
                    s3.b(s3Var.f39955p.keyAt(i23), (TextPaint) s3Var.f39955p.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < s3Var.v.size(); i24++) {
                    s3.b(s3Var.v.keyAt(i24), (TextPaint) s3Var.v.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < s3Var.f39963y.size(); i25++) {
                    s3.b(s3Var.f39963y.keyAt(i25), (TextPaint) s3Var.f39963y.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < s3Var.f39964z.size(); i26++) {
                    s3.b(s3Var.f39964z.keyAt(i26), (TextPaint) s3Var.f39964z.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i27 = 0; i27 < s3Var.A.size(); i27++) {
                    s3.b(s3Var.A.keyAt(i27), (TextPaint) s3Var.A.valueAt(i27), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    o3[] o3VarArr = k4Var4.f37557u0;
                    if (i10 < o3VarArr.length) {
                        o3VarArr[i10].f38848c.l();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                k4 k4Var5 = this.f39905b;
                d3 d3Var = k4Var5.d;
                if (d3Var != null) {
                    AndroidUtilities.addToClipboard(d3Var.d.getText());
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

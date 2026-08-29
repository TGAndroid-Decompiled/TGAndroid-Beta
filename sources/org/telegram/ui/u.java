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
public final class u implements View.OnClickListener {
    public final int f43117a;
    public final m4 f43118b;

    public u(m4 m4Var, int i10) {
        this.f43117a = i10;
        this.f43118b = m4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        switch (this.f43117a) {
            case 0:
                m4 m4Var = this.f43118b;
                if (m4Var.f40404q0[0].f()) {
                    if (m4Var.f40404q0[0].getWebView() != null) {
                        m4Var.f40404q0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                m4Var.W(m4Var.C - 1);
                return;
            case 1:
                m4 m4Var2 = this.f43118b;
                if (m4Var2.f40404q0[0].f()) {
                    if (m4Var2.f40404q0[0].getWebView() != null) {
                        m4Var2.f40404q0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                m4Var2.W(m4Var2.C + 1);
                return;
            case 2:
                m4 m4Var3 = this.f43118b;
                o0 o0Var = m4Var3.f40392d0;
                if (o0Var.P) {
                    o0Var.h(false);
                    return;
                } else if (o0Var.S) {
                    o0Var.k(false);
                    return;
                } else {
                    if (m4Var3.J()) {
                        q3 q3Var = m4Var3.f40404q0[0];
                        if (q3Var.f41519s) {
                            if (q3Var.f() && q3Var.getWebView() != null) {
                                q3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (m4Var3.Z.size() > 1) {
                        m4Var3.G();
                        return;
                    }
                    z3 z3Var = m4Var3.G;
                    if (z3Var != null) {
                        z3Var.dismiss(false);
                        return;
                    } else {
                        m4Var3.o(true, true);
                        return;
                    }
                }
            case 3:
                z3 z3Var2 = this.f43118b.G;
                if (z3Var2 != null) {
                    z3Var2.dismiss(true);
                    return;
                }
                return;
            case 4:
                m4 m4Var4 = this.f43118b;
                int intValue = ((Integer) view.getTag()).intValue();
                m4Var4.f37379a = intValue;
                int i10 = 0;
                for (int i11 = 0; i11 < 2; i11++) {
                    n0 n0Var = m4Var4.O0[i11];
                    if (i11 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) n0Var.f40660b).a(z10, true);
                }
                u3 u3Var = m4.f40367b1;
                int i12 = m4Var4.f37379a;
                u3Var.getClass();
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
                for (int i13 = 0; i13 < u3Var.f43164t.size(); i13++) {
                    u3.b(u3Var.f43164t.keyAt(i13), (TextPaint) u3Var.f43164t.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < u3Var.f43163s.size(); i14++) {
                    u3.b(u3Var.f43163s.keyAt(i14), (TextPaint) u3Var.f43163s.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < u3Var.f43161q.size(); i15++) {
                    u3.b(u3Var.f43161q.keyAt(i15), (TextPaint) u3Var.f43161q.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < u3Var.f43162r.size(); i16++) {
                    u3.b(u3Var.f43162r.keyAt(i16), (TextPaint) u3Var.f43162r.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < u3Var.f43165u.size(); i17++) {
                    u3.b(u3Var.f43165u.keyAt(i17), (TextPaint) u3Var.f43165u.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < u3Var.f43166w.size(); i18++) {
                    u3.b(u3Var.f43166w.keyAt(i18), (TextPaint) u3Var.f43166w.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < u3Var.f43167x.size(); i19++) {
                    u3.b(u3Var.f43167x.keyAt(i19), (TextPaint) u3Var.f43167x.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < u3Var.f43148b.size(); i20++) {
                    u3.b(u3Var.f43148b.keyAt(i20), (TextPaint) u3Var.f43148b.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < u3Var.f43149c.size(); i21++) {
                    u3.b(u3Var.f43149c.keyAt(i21), (TextPaint) u3Var.f43149c.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < u3Var.f43159o.size(); i22++) {
                    u3.b(u3Var.f43159o.keyAt(i22), (TextPaint) u3Var.f43159o.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < u3Var.f43160p.size(); i23++) {
                    u3.b(u3Var.f43160p.keyAt(i23), (TextPaint) u3Var.f43160p.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < u3Var.v.size(); i24++) {
                    u3.b(u3Var.v.keyAt(i24), (TextPaint) u3Var.v.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < u3Var.f43168y.size(); i25++) {
                    u3.b(u3Var.f43168y.keyAt(i25), (TextPaint) u3Var.f43168y.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < u3Var.f43169z.size(); i26++) {
                    u3.b(u3Var.f43169z.keyAt(i26), (TextPaint) u3Var.f43169z.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i27 = 0; i27 < u3Var.A.size(); i27++) {
                    u3.b(u3Var.A.keyAt(i27), (TextPaint) u3Var.A.valueAt(i27), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    q3[] q3VarArr = m4Var4.f40404q0;
                    if (i10 < q3VarArr.length) {
                        q3VarArr[i10].f41514c.l();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                m4 m4Var5 = this.f43118b;
                f3 f3Var = m4Var5.d;
                if (f3Var != null) {
                    AndroidUtilities.addToClipboard(f3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(m4Var5.H, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.o1 o1Var = m4Var5.D;
                if (o1Var != null && o1Var.isShowing()) {
                    m4Var5.D.d(true);
                    return;
                }
                return;
        }
    }
}

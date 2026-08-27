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

public final class t implements View.OnClickListener {

    public final int f42729a;

    public final m4 f42730b;

    public t(m4 m4Var, int i10) {
        this.f42729a = i10;
        this.f42730b = m4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42729a) {
            case 0:
                m4 m4Var = this.f42730b;
                if (!m4Var.f40347q0[0].f()) {
                    m4Var.W(m4Var.C - 1);
                } else if (m4Var.f40347q0[0].getWebView() != null) {
                    m4Var.f40347q0[0].getWebView().findNext(false);
                }
                break;
            case 1:
                m4 m4Var2 = this.f42730b;
                if (!m4Var2.f40347q0[0].f()) {
                    m4Var2.W(m4Var2.C + 1);
                } else if (m4Var2.f40347q0[0].getWebView() != null) {
                    m4Var2.f40347q0[0].getWebView().findNext(true);
                }
                break;
            case 2:
                m4 m4Var3 = this.f42730b;
                o0 o0Var = m4Var3.f40335d0;
                if (o0Var.P) {
                    o0Var.h(false);
                } else if (o0Var.S) {
                    o0Var.k(false);
                } else {
                    if (m4Var3.J()) {
                        q3 q3Var = m4Var3.f40347q0[0];
                        if (q3Var.f41502s) {
                            if (q3Var.f() && q3Var.getWebView() != null) {
                                q3Var.getWebView().goBack();
                                break;
                            }
                        }
                    }
                    if (m4Var3.Z.size() > 1) {
                        m4Var3.G();
                    } else {
                        z3 z3Var = m4Var3.G;
                        if (z3Var != null) {
                            z3Var.dismiss(false);
                        } else {
                            m4Var3.o(true, true);
                        }
                    }
                }
                break;
            case 3:
                z3 z3Var2 = this.f42730b.G;
                if (z3Var2 != null) {
                    z3Var2.dismiss(true);
                }
                break;
            case 4:
                m4 m4Var4 = this.f42730b;
                int iIntValue = ((Integer) view.getTag()).intValue();
                m4Var4.f37284a = iIntValue;
                int i10 = 0;
                int i11 = 0;
                while (i11 < 2) {
                    ((RadioButton) m4Var4.O0[i11].f40617b).a(i11 == iIntValue, true);
                    i11++;
                }
                u3 u3Var = m4.f40310b1;
                int i12 = m4Var4.f37284a;
                u3Var.getClass();
                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i12).commit();
                Typeface typeface = i12 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
                Typeface typeface2 = i12 == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
                Typeface typefaceBold = i12 == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
                Typeface typeface3 = i12 == 0 ? AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf") : Typeface.create("serif", 3);
                for (int i13 = 0; i13 < u3Var.f43097t.size(); i13++) {
                    u3.b(u3Var.f43097t.keyAt(i13), (TextPaint) u3Var.f43097t.valueAt(i13), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i14 = 0; i14 < u3Var.f43096s.size(); i14++) {
                    u3.b(u3Var.f43096s.keyAt(i14), (TextPaint) u3Var.f43096s.valueAt(i14), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i15 = 0; i15 < u3Var.f43094q.size(); i15++) {
                    u3.b(u3Var.f43094q.keyAt(i15), (TextPaint) u3Var.f43094q.valueAt(i15), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i16 = 0; i16 < u3Var.f43095r.size(); i16++) {
                    u3.b(u3Var.f43095r.keyAt(i16), (TextPaint) u3Var.f43095r.valueAt(i16), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i17 = 0; i17 < u3Var.f43098u.size(); i17++) {
                    u3.b(u3Var.f43098u.keyAt(i17), (TextPaint) u3Var.f43098u.valueAt(i17), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i18 = 0; i18 < u3Var.f43099w.size(); i18++) {
                    u3.b(u3Var.f43099w.keyAt(i18), (TextPaint) u3Var.f43099w.valueAt(i18), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i19 = 0; i19 < u3Var.f43100x.size(); i19++) {
                    u3.b(u3Var.f43100x.keyAt(i19), (TextPaint) u3Var.f43100x.valueAt(i19), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i20 = 0; i20 < u3Var.f43081b.size(); i20++) {
                    u3.b(u3Var.f43081b.keyAt(i20), (TextPaint) u3Var.f43081b.valueAt(i20), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i21 = 0; i21 < u3Var.f43082c.size(); i21++) {
                    u3.b(u3Var.f43082c.keyAt(i21), (TextPaint) u3Var.f43082c.valueAt(i21), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i22 = 0; i22 < u3Var.f43092o.size(); i22++) {
                    u3.b(u3Var.f43092o.keyAt(i22), (TextPaint) u3Var.f43092o.valueAt(i22), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i23 = 0; i23 < u3Var.f43093p.size(); i23++) {
                    u3.b(u3Var.f43093p.keyAt(i23), (TextPaint) u3Var.f43093p.valueAt(i23), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i24 = 0; i24 < u3Var.v.size(); i24++) {
                    u3.b(u3Var.v.keyAt(i24), (TextPaint) u3Var.v.valueAt(i24), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i25 = 0; i25 < u3Var.f43101y.size(); i25++) {
                    u3.b(u3Var.f43101y.keyAt(i25), (TextPaint) u3Var.f43101y.valueAt(i25), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i26 = 0; i26 < u3Var.f43102z.size(); i26++) {
                    u3.b(u3Var.f43102z.keyAt(i26), (TextPaint) u3Var.f43102z.valueAt(i26), typeface, typeface3, typefaceBold, typeface2);
                }
                for (int i27 = 0; i27 < u3Var.A.size(); i27++) {
                    u3.b(u3Var.A.keyAt(i27), (TextPaint) u3Var.A.valueAt(i27), typeface, typeface3, typefaceBold, typeface2);
                }
                while (true) {
                    q3[] q3VarArr = m4Var4.f40347q0;
                    if (i10 < q3VarArr.length) {
                        q3VarArr[i10].f41497c.l();
                        i10++;
                    }
                    break;
                }
                break;
            default:
                m4 m4Var5 = this.f42730b;
                f3 f3Var = m4Var5.d;
                if (f3Var != null) {
                    AndroidUtilities.addToClipboard(f3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(m4Var5.H, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = m4Var5.D;
                if (n1Var != null && n1Var.isShowing()) {
                    m4Var5.D.d(true);
                    break;
                }
                break;
        }
    }
}

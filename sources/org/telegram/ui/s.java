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
    public final int f37257a;
    public final h4 f37258b;

    public s(h4 h4Var, int i10) {
        this.f37257a = i10;
        this.f37258b = h4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        switch (this.f37257a) {
            case 0:
                h4 h4Var = this.f37258b;
                if (h4Var.f34114u0[0].f()) {
                    if (h4Var.f34114u0[0].getWebView() != null) {
                        h4Var.f34114u0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                h4Var.W(h4Var.G - 1);
                return;
            case 1:
                h4 h4Var2 = this.f37258b;
                if (h4Var2.f34114u0[0].f()) {
                    if (h4Var2.f34114u0[0].getWebView() != null) {
                        h4Var2.f34114u0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                h4Var2.W(h4Var2.G + 1);
                return;
            case 2:
                h4 h4Var3 = this.f37258b;
                k0 k0Var = h4Var3.f34102h0;
                if (k0Var.T) {
                    k0Var.h(false);
                    return;
                } else if (k0Var.W) {
                    k0Var.k(false);
                    return;
                } else {
                    if (h4Var3.J()) {
                        l3 l3Var = h4Var3.f34114u0[0];
                        if (l3Var.f35292s) {
                            if (l3Var.f() && l3Var.getWebView() != null) {
                                l3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (h4Var3.f34098d0.size() > 1) {
                        h4Var3.G();
                        return;
                    }
                    u3 u3Var = h4Var3.K;
                    if (u3Var != null) {
                        u3Var.dismiss(false);
                        return;
                    } else {
                        h4Var3.o(true, true);
                        return;
                    }
                }
            case 3:
                u3 u3Var2 = this.f37258b.K;
                if (u3Var2 != null) {
                    u3Var2.dismiss(true);
                    return;
                }
                return;
            case 4:
                h4 h4Var4 = this.f37258b;
                int intValue = ((Integer) view.getTag()).intValue();
                h4Var4.f37979a = intValue;
                int i10 = 0;
                for (int i11 = 0; i11 < 2; i11++) {
                    j0 j0Var = h4Var4.S0[i11];
                    if (i11 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) j0Var.f34707b).a(z10, true);
                }
                p3 p3Var = h4.f34074f1;
                int i12 = h4Var4.f37979a;
                p3Var.getClass();
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
                for (int i13 = 0; i13 < p3Var.f36451t.size(); i13++) {
                    p3.b(p3Var.f36451t.keyAt(i13), (TextPaint) p3Var.f36451t.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < p3Var.f36450s.size(); i14++) {
                    p3.b(p3Var.f36450s.keyAt(i14), (TextPaint) p3Var.f36450s.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < p3Var.f36448q.size(); i15++) {
                    p3.b(p3Var.f36448q.keyAt(i15), (TextPaint) p3Var.f36448q.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < p3Var.f36449r.size(); i16++) {
                    p3.b(p3Var.f36449r.keyAt(i16), (TextPaint) p3Var.f36449r.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < p3Var.f36452u.size(); i17++) {
                    p3.b(p3Var.f36452u.keyAt(i17), (TextPaint) p3Var.f36452u.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < p3Var.f36453w.size(); i18++) {
                    p3.b(p3Var.f36453w.keyAt(i18), (TextPaint) p3Var.f36453w.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < p3Var.f36454x.size(); i19++) {
                    p3.b(p3Var.f36454x.keyAt(i19), (TextPaint) p3Var.f36454x.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < p3Var.f36436b.size(); i20++) {
                    p3.b(p3Var.f36436b.keyAt(i20), (TextPaint) p3Var.f36436b.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < p3Var.f36437c.size(); i21++) {
                    p3.b(p3Var.f36437c.keyAt(i21), (TextPaint) p3Var.f36437c.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < p3Var.f36446o.size(); i22++) {
                    p3.b(p3Var.f36446o.keyAt(i22), (TextPaint) p3Var.f36446o.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < p3Var.f36447p.size(); i23++) {
                    p3.b(p3Var.f36447p.keyAt(i23), (TextPaint) p3Var.f36447p.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < p3Var.v.size(); i24++) {
                    p3.b(p3Var.v.keyAt(i24), (TextPaint) p3Var.v.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < p3Var.f36455y.size(); i25++) {
                    p3.b(p3Var.f36455y.keyAt(i25), (TextPaint) p3Var.f36455y.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < p3Var.f36456z.size(); i26++) {
                    p3.b(p3Var.f36456z.keyAt(i26), (TextPaint) p3Var.f36456z.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i27 = 0; i27 < p3Var.A.size(); i27++) {
                    p3.b(p3Var.A.keyAt(i27), (TextPaint) p3Var.A.valueAt(i27), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    l3[] l3VarArr = h4Var4.f34114u0;
                    if (i10 < l3VarArr.length) {
                        l3VarArr[i10].f35288c.l();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                h4 h4Var5 = this.f37258b;
                a3 a3Var = h4Var5.d;
                if (a3Var != null) {
                    AndroidUtilities.addToClipboard(a3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(h4Var5.L, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = h4Var5.H;
                if (n1Var != null && n1Var.isShowing()) {
                    h4Var5.H.d(true);
                    return;
                }
                return;
        }
    }
}

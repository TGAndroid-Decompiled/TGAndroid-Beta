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
    public final int f36799a;
    public final j4 f36800b;

    public t(j4 j4Var, int i10) {
        this.f36799a = i10;
        this.f36800b = j4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        switch (this.f36799a) {
            case 0:
                j4 j4Var = this.f36800b;
                if (j4Var.f33920u0[0].f()) {
                    if (j4Var.f33920u0[0].getWebView() != null) {
                        j4Var.f33920u0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                j4Var.W(j4Var.G - 1);
                return;
            case 1:
                j4 j4Var2 = this.f36800b;
                if (j4Var2.f33920u0[0].f()) {
                    if (j4Var2.f33920u0[0].getWebView() != null) {
                        j4Var2.f33920u0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                j4Var2.W(j4Var2.G + 1);
                return;
            case 2:
                j4 j4Var3 = this.f36800b;
                l0 l0Var = j4Var3.f33908h0;
                if (l0Var.T) {
                    l0Var.h(false);
                    return;
                } else if (l0Var.W) {
                    l0Var.k(false);
                    return;
                } else {
                    if (j4Var3.J()) {
                        n3 n3Var = j4Var3.f33920u0[0];
                        if (n3Var.f35107s) {
                            if (n3Var.f() && n3Var.getWebView() != null) {
                                n3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (j4Var3.f33904d0.size() > 1) {
                        j4Var3.G();
                        return;
                    }
                    w3 w3Var = j4Var3.K;
                    if (w3Var != null) {
                        w3Var.dismiss(false);
                        return;
                    } else {
                        j4Var3.o(true, true);
                        return;
                    }
                }
            case 3:
                w3 w3Var2 = this.f36800b.K;
                if (w3Var2 != null) {
                    w3Var2.dismiss(true);
                    return;
                }
                return;
            case 4:
                j4 j4Var4 = this.f36800b;
                int intValue = ((Integer) view.getTag()).intValue();
                j4Var4.f36854a = intValue;
                int i10 = 0;
                for (int i11 = 0; i11 < 2; i11++) {
                    k0 k0Var = j4Var4.S0[i11];
                    if (i11 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) k0Var.f34181b).a(z10, true);
                }
                r3 r3Var = j4.f33880f1;
                int i12 = j4Var4.f36854a;
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
                for (int i13 = 0; i13 < r3Var.f36196t.size(); i13++) {
                    r3.b(r3Var.f36196t.keyAt(i13), (TextPaint) r3Var.f36196t.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < r3Var.f36195s.size(); i14++) {
                    r3.b(r3Var.f36195s.keyAt(i14), (TextPaint) r3Var.f36195s.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < r3Var.f36193q.size(); i15++) {
                    r3.b(r3Var.f36193q.keyAt(i15), (TextPaint) r3Var.f36193q.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < r3Var.f36194r.size(); i16++) {
                    r3.b(r3Var.f36194r.keyAt(i16), (TextPaint) r3Var.f36194r.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < r3Var.f36197u.size(); i17++) {
                    r3.b(r3Var.f36197u.keyAt(i17), (TextPaint) r3Var.f36197u.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < r3Var.f36198w.size(); i18++) {
                    r3.b(r3Var.f36198w.keyAt(i18), (TextPaint) r3Var.f36198w.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < r3Var.f36199x.size(); i19++) {
                    r3.b(r3Var.f36199x.keyAt(i19), (TextPaint) r3Var.f36199x.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < r3Var.f36181b.size(); i20++) {
                    r3.b(r3Var.f36181b.keyAt(i20), (TextPaint) r3Var.f36181b.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < r3Var.f36182c.size(); i21++) {
                    r3.b(r3Var.f36182c.keyAt(i21), (TextPaint) r3Var.f36182c.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < r3Var.f36191o.size(); i22++) {
                    r3.b(r3Var.f36191o.keyAt(i22), (TextPaint) r3Var.f36191o.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < r3Var.f36192p.size(); i23++) {
                    r3.b(r3Var.f36192p.keyAt(i23), (TextPaint) r3Var.f36192p.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < r3Var.v.size(); i24++) {
                    r3.b(r3Var.v.keyAt(i24), (TextPaint) r3Var.v.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < r3Var.f36200y.size(); i25++) {
                    r3.b(r3Var.f36200y.keyAt(i25), (TextPaint) r3Var.f36200y.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < r3Var.f36201z.size(); i26++) {
                    r3.b(r3Var.f36201z.keyAt(i26), (TextPaint) r3Var.f36201z.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i27 = 0; i27 < r3Var.A.size(); i27++) {
                    r3.b(r3Var.A.keyAt(i27), (TextPaint) r3Var.A.valueAt(i27), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    n3[] n3VarArr = j4Var4.f33920u0;
                    if (i10 < n3VarArr.length) {
                        n3VarArr[i10].f35103c.l();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                j4 j4Var5 = this.f36800b;
                c3 c3Var = j4Var5.d;
                if (c3Var != null) {
                    AndroidUtilities.addToClipboard(c3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(j4Var5.L, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = j4Var5.H;
                if (p1Var != null && p1Var.isShowing()) {
                    j4Var5.H.d(true);
                    return;
                }
                return;
        }
    }
}

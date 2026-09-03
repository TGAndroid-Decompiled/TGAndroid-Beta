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
    public final int f38626a;
    public final n4 f38627b;

    public u(n4 n4Var, int i10) {
        this.f38626a = i10;
        this.f38627b = n4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z4;
        switch (this.f38626a) {
            case 0:
                n4 n4Var = this.f38627b;
                if (n4Var.f36375r0[0].f()) {
                    if (n4Var.f36375r0[0].getWebView() != null) {
                        n4Var.f36375r0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                n4Var.W(n4Var.D - 1);
                return;
            case 1:
                n4 n4Var2 = this.f38627b;
                if (n4Var2.f36375r0[0].f()) {
                    if (n4Var2.f36375r0[0].getWebView() != null) {
                        n4Var2.f36375r0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                n4Var2.W(n4Var2.D + 1);
                return;
            case 2:
                n4 n4Var3 = this.f38627b;
                o0 o0Var = n4Var3.f36363e0;
                if (o0Var.Q) {
                    o0Var.h(false);
                    return;
                } else if (o0Var.T) {
                    o0Var.k(false);
                    return;
                } else {
                    if (n4Var3.J()) {
                        r3 r3Var = n4Var3.f36375r0[0];
                        if (r3Var.f37689s) {
                            if (r3Var.f() && r3Var.getWebView() != null) {
                                r3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (n4Var3.f36359a0.size() > 1) {
                        n4Var3.G();
                        return;
                    }
                    a4 a4Var = n4Var3.H;
                    if (a4Var != null) {
                        a4Var.dismiss(false);
                        return;
                    } else {
                        n4Var3.o(true, true);
                        return;
                    }
                }
            case 3:
                a4 a4Var2 = this.f38627b.H;
                if (a4Var2 != null) {
                    a4Var2.dismiss(true);
                    return;
                }
                return;
            case 4:
                n4 n4Var4 = this.f38627b;
                int intValue = ((Integer) view.getTag()).intValue();
                n4Var4.f36980a = intValue;
                int i10 = 0;
                for (int i11 = 0; i11 < 2; i11++) {
                    n0 n0Var = n4Var4.P0[i11];
                    if (i11 == intValue) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ((RadioButton) n0Var.f36297b).a(z4, true);
                }
                v3 v3Var = n4.f36337c1;
                int i12 = n4Var4.f36980a;
                v3Var.getClass();
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
                for (int i13 = 0; i13 < v3Var.f38983t.size(); i13++) {
                    v3.b(v3Var.f38983t.keyAt(i13), (TextPaint) v3Var.f38983t.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < v3Var.f38982s.size(); i14++) {
                    v3.b(v3Var.f38982s.keyAt(i14), (TextPaint) v3Var.f38982s.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < v3Var.f38980q.size(); i15++) {
                    v3.b(v3Var.f38980q.keyAt(i15), (TextPaint) v3Var.f38980q.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < v3Var.f38981r.size(); i16++) {
                    v3.b(v3Var.f38981r.keyAt(i16), (TextPaint) v3Var.f38981r.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < v3Var.f38984u.size(); i17++) {
                    v3.b(v3Var.f38984u.keyAt(i17), (TextPaint) v3Var.f38984u.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < v3Var.f38985w.size(); i18++) {
                    v3.b(v3Var.f38985w.keyAt(i18), (TextPaint) v3Var.f38985w.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < v3Var.f38986x.size(); i19++) {
                    v3.b(v3Var.f38986x.keyAt(i19), (TextPaint) v3Var.f38986x.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < v3Var.f38968b.size(); i20++) {
                    v3.b(v3Var.f38968b.keyAt(i20), (TextPaint) v3Var.f38968b.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < v3Var.f38969c.size(); i21++) {
                    v3.b(v3Var.f38969c.keyAt(i21), (TextPaint) v3Var.f38969c.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < v3Var.f38978o.size(); i22++) {
                    v3.b(v3Var.f38978o.keyAt(i22), (TextPaint) v3Var.f38978o.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < v3Var.f38979p.size(); i23++) {
                    v3.b(v3Var.f38979p.keyAt(i23), (TextPaint) v3Var.f38979p.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < v3Var.v.size(); i24++) {
                    v3.b(v3Var.v.keyAt(i24), (TextPaint) v3Var.v.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < v3Var.f38987y.size(); i25++) {
                    v3.b(v3Var.f38987y.keyAt(i25), (TextPaint) v3Var.f38987y.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < v3Var.f38988z.size(); i26++) {
                    v3.b(v3Var.f38988z.keyAt(i26), (TextPaint) v3Var.f38988z.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i27 = 0; i27 < v3Var.A.size(); i27++) {
                    v3.b(v3Var.A.keyAt(i27), (TextPaint) v3Var.A.valueAt(i27), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    r3[] r3VarArr = n4Var4.f36375r0;
                    if (i10 < r3VarArr.length) {
                        r3VarArr[i10].f37685c.l();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                n4 n4Var5 = this.f38627b;
                f3 f3Var = n4Var5.d;
                if (f3Var != null) {
                    AndroidUtilities.addToClipboard(f3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(n4Var5.I, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = n4Var5.E;
                if (p1Var != null && p1Var.isShowing()) {
                    n4Var5.E.d(true);
                    return;
                }
                return;
        }
    }
}

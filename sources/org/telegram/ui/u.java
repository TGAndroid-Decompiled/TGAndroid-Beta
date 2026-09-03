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
    public final int f41667a;
    public final l4 f41668b;

    public u(l4 l4Var, int i10) {
        this.f41667a = i10;
        this.f41668b = l4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z4;
        switch (this.f41667a) {
            case 0:
                l4 l4Var = this.f41668b;
                if (l4Var.f38524r0[0].f()) {
                    if (l4Var.f38524r0[0].getWebView() != null) {
                        l4Var.f38524r0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                l4Var.W(l4Var.D - 1);
                return;
            case 1:
                l4 l4Var2 = this.f41668b;
                if (l4Var2.f38524r0[0].f()) {
                    if (l4Var2.f38524r0[0].getWebView() != null) {
                        l4Var2.f38524r0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                l4Var2.W(l4Var2.D + 1);
                return;
            case 2:
                l4 l4Var3 = this.f41668b;
                m0 m0Var = l4Var3.f38512e0;
                if (m0Var.Q) {
                    m0Var.h(false);
                    return;
                } else if (m0Var.T) {
                    m0Var.k(false);
                    return;
                } else {
                    if (l4Var3.J()) {
                        p3 p3Var = l4Var3.f38524r0[0];
                        if (p3Var.f39868s) {
                            if (p3Var.f() && p3Var.getWebView() != null) {
                                p3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (l4Var3.f38508a0.size() > 1) {
                        l4Var3.G();
                        return;
                    }
                    y3 y3Var = l4Var3.H;
                    if (y3Var != null) {
                        y3Var.dismiss(false);
                        return;
                    } else {
                        l4Var3.o(true, true);
                        return;
                    }
                }
            case 3:
                y3 y3Var2 = this.f41668b.H;
                if (y3Var2 != null) {
                    y3Var2.dismiss(true);
                    return;
                }
                return;
            case 4:
                l4 l4Var4 = this.f41668b;
                int intValue = ((Integer) view.getTag()).intValue();
                l4Var4.f39553a = intValue;
                int i10 = 0;
                for (int i11 = 0; i11 < 2; i11++) {
                    l0 l0Var = l4Var4.P0[i11];
                    if (i11 == intValue) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ((RadioButton) l0Var.f38453b).a(z4, true);
                }
                t3 t3Var = l4.f38486c1;
                int i12 = l4Var4.f39553a;
                t3Var.getClass();
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
                for (int i13 = 0; i13 < t3Var.f41417t.size(); i13++) {
                    t3.b(t3Var.f41417t.keyAt(i13), (TextPaint) t3Var.f41417t.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < t3Var.f41416s.size(); i14++) {
                    t3.b(t3Var.f41416s.keyAt(i14), (TextPaint) t3Var.f41416s.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < t3Var.f41414q.size(); i15++) {
                    t3.b(t3Var.f41414q.keyAt(i15), (TextPaint) t3Var.f41414q.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < t3Var.f41415r.size(); i16++) {
                    t3.b(t3Var.f41415r.keyAt(i16), (TextPaint) t3Var.f41415r.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < t3Var.f41418u.size(); i17++) {
                    t3.b(t3Var.f41418u.keyAt(i17), (TextPaint) t3Var.f41418u.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < t3Var.f41419w.size(); i18++) {
                    t3.b(t3Var.f41419w.keyAt(i18), (TextPaint) t3Var.f41419w.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < t3Var.f41420x.size(); i19++) {
                    t3.b(t3Var.f41420x.keyAt(i19), (TextPaint) t3Var.f41420x.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < t3Var.f41401b.size(); i20++) {
                    t3.b(t3Var.f41401b.keyAt(i20), (TextPaint) t3Var.f41401b.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < t3Var.f41402c.size(); i21++) {
                    t3.b(t3Var.f41402c.keyAt(i21), (TextPaint) t3Var.f41402c.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < t3Var.f41412o.size(); i22++) {
                    t3.b(t3Var.f41412o.keyAt(i22), (TextPaint) t3Var.f41412o.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < t3Var.f41413p.size(); i23++) {
                    t3.b(t3Var.f41413p.keyAt(i23), (TextPaint) t3Var.f41413p.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < t3Var.v.size(); i24++) {
                    t3.b(t3Var.v.keyAt(i24), (TextPaint) t3Var.v.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < t3Var.f41421y.size(); i25++) {
                    t3.b(t3Var.f41421y.keyAt(i25), (TextPaint) t3Var.f41421y.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < t3Var.f41422z.size(); i26++) {
                    t3.b(t3Var.f41422z.keyAt(i26), (TextPaint) t3Var.f41422z.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i27 = 0; i27 < t3Var.A.size(); i27++) {
                    t3.b(t3Var.A.keyAt(i27), (TextPaint) t3Var.A.valueAt(i27), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    p3[] p3VarArr = l4Var4.f38524r0;
                    if (i10 < p3VarArr.length) {
                        p3VarArr[i10].f39863c.l();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                l4 l4Var5 = this.f41668b;
                d3 d3Var = l4Var5.d;
                if (d3Var != null) {
                    AndroidUtilities.addToClipboard(d3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(l4Var5.I, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = l4Var5.E;
                if (p1Var != null && p1Var.isShowing()) {
                    l4Var5.E.d(true);
                    return;
                }
                return;
        }
    }
}

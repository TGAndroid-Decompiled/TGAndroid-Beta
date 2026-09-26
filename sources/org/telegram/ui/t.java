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
    public final int f37898a;
    public final i4 f37899b;

    public t(i4 i4Var, int i10) {
        this.f37898a = i10;
        this.f37899b = i4Var;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface create2;
        Typeface create3;
        boolean z10;
        switch (this.f37898a) {
            case 0:
                i4 i4Var = this.f37899b;
                if (i4Var.f34406u0[0].f()) {
                    if (i4Var.f34406u0[0].getWebView() != null) {
                        i4Var.f34406u0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                i4Var.W(i4Var.G - 1);
                return;
            case 1:
                i4 i4Var2 = this.f37899b;
                if (i4Var2.f34406u0[0].f()) {
                    if (i4Var2.f34406u0[0].getWebView() != null) {
                        i4Var2.f34406u0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                i4Var2.W(i4Var2.G + 1);
                return;
            case 2:
                i4 i4Var3 = this.f37899b;
                l0 l0Var = i4Var3.f34394h0;
                if (l0Var.T) {
                    l0Var.h(false);
                    return;
                } else if (l0Var.W) {
                    l0Var.k(false);
                    return;
                } else {
                    if (i4Var3.J()) {
                        m3 m3Var = i4Var3.f34406u0[0];
                        if (m3Var.f35464s) {
                            if (m3Var.f() && m3Var.getWebView() != null) {
                                m3Var.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (i4Var3.f34390d0.size() > 1) {
                        i4Var3.G();
                        return;
                    }
                    v3 v3Var = i4Var3.K;
                    if (v3Var != null) {
                        v3Var.dismiss(false);
                        return;
                    } else {
                        i4Var3.o(true, true);
                        return;
                    }
                }
            case 3:
                v3 v3Var2 = this.f37899b.K;
                if (v3Var2 != null) {
                    v3Var2.dismiss(true);
                    return;
                }
                return;
            case 4:
                i4 i4Var4 = this.f37899b;
                int intValue = ((Integer) view.getTag()).intValue();
                i4Var4.f36418a = intValue;
                int i10 = 0;
                for (int i11 = 0; i11 < 2; i11++) {
                    k0 k0Var = i4Var4.S0[i11];
                    if (i11 == intValue) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) k0Var.f34902b).a(z10, true);
                }
                q3 q3Var = i4.f34366f1;
                int i12 = i4Var4.f36418a;
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
                for (int i13 = 0; i13 < q3Var.f36762t.size(); i13++) {
                    q3.b(q3Var.f36762t.keyAt(i13), (TextPaint) q3Var.f36762t.valueAt(i13), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i14 = 0; i14 < q3Var.f36761s.size(); i14++) {
                    q3.b(q3Var.f36761s.keyAt(i14), (TextPaint) q3Var.f36761s.valueAt(i14), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i15 = 0; i15 < q3Var.f36759q.size(); i15++) {
                    q3.b(q3Var.f36759q.keyAt(i15), (TextPaint) q3Var.f36759q.valueAt(i15), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i16 = 0; i16 < q3Var.f36760r.size(); i16++) {
                    q3.b(q3Var.f36760r.keyAt(i16), (TextPaint) q3Var.f36760r.valueAt(i16), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i17 = 0; i17 < q3Var.f36763u.size(); i17++) {
                    q3.b(q3Var.f36763u.keyAt(i17), (TextPaint) q3Var.f36763u.valueAt(i17), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i18 = 0; i18 < q3Var.f36764w.size(); i18++) {
                    q3.b(q3Var.f36764w.keyAt(i18), (TextPaint) q3Var.f36764w.valueAt(i18), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i19 = 0; i19 < q3Var.f36765x.size(); i19++) {
                    q3.b(q3Var.f36765x.keyAt(i19), (TextPaint) q3Var.f36765x.valueAt(i19), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i20 = 0; i20 < q3Var.f36747b.size(); i20++) {
                    q3.b(q3Var.f36747b.keyAt(i20), (TextPaint) q3Var.f36747b.valueAt(i20), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i21 = 0; i21 < q3Var.f36748c.size(); i21++) {
                    q3.b(q3Var.f36748c.keyAt(i21), (TextPaint) q3Var.f36748c.valueAt(i21), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i22 = 0; i22 < q3Var.f36757o.size(); i22++) {
                    q3.b(q3Var.f36757o.keyAt(i22), (TextPaint) q3Var.f36757o.valueAt(i22), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i23 = 0; i23 < q3Var.f36758p.size(); i23++) {
                    q3.b(q3Var.f36758p.keyAt(i23), (TextPaint) q3Var.f36758p.valueAt(i23), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i24 = 0; i24 < q3Var.v.size(); i24++) {
                    q3.b(q3Var.v.keyAt(i24), (TextPaint) q3Var.v.valueAt(i24), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i25 = 0; i25 < q3Var.f36766y.size(); i25++) {
                    q3.b(q3Var.f36766y.keyAt(i25), (TextPaint) q3Var.f36766y.valueAt(i25), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i26 = 0; i26 < q3Var.f36767z.size(); i26++) {
                    q3.b(q3Var.f36767z.keyAt(i26), (TextPaint) q3Var.f36767z.valueAt(i26), typeface2, typeface5, typeface4, typeface3);
                }
                for (int i27 = 0; i27 < q3Var.A.size(); i27++) {
                    q3.b(q3Var.A.keyAt(i27), (TextPaint) q3Var.A.valueAt(i27), typeface2, typeface5, typeface4, typeface3);
                }
                while (true) {
                    m3[] m3VarArr = i4Var4.f34406u0;
                    if (i10 < m3VarArr.length) {
                        m3VarArr[i10].f35460c.l();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                i4 i4Var5 = this.f37899b;
                b3 b3Var = i4Var5.d;
                if (b3Var != null) {
                    AndroidUtilities.addToClipboard(b3Var.d.getText());
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(i4Var5.L, LocaleController.getString(R.string.TextCopied), 0).show();
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = i4Var5.H;
                if (m1Var != null && m1Var.isShowing()) {
                    i4Var5.H.d(true);
                    return;
                }
                return;
        }
    }
}

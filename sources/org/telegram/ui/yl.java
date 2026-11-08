package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yl implements org.telegram.ui.ActionBar.r1, h2.j {
    public final int f52240a = 2;
    public final boolean f52241b;
    public final Object f52242c;
    public final Object d;
    public final Object f52243e;
    public final Object f52244f;

    public yl(a8.wa waVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z9) {
        this.f52242c = waVar;
        this.d = uVar;
        this.f52243e = c0Var;
        this.f52244f = iOException;
        this.f52241b = z9;
    }

    @Override
    public void accept(Object obj) {
        a8.wa waVar = (a8.wa) this.f52242c;
        ((x2.k0) obj).r(waVar.f700b, (x2.g0) waVar.f701c, (x2.u) this.d, (x2.c0) this.f52243e, (IOException) this.f52244f, this.f52241b);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11 = this.f52240a;
        Object obj = this.f52244f;
        Object obj2 = this.f52243e;
        Object obj3 = this.d;
        Object obj4 = this.f52242c;
        boolean z9 = this.f52241b;
        switch (i11) {
            case 0:
                lm lmVar = (lm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                an anVar = lmVar.f47557a;
                org.telegram.messenger.voip.k kVar = new org.telegram.messenger.voip.k(18, lmVar, (org.telegram.ui.Cells.q1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z9 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        kVar.a(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = anVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new org.telegram.messenger.voip.k(19, lmVar, kVar), anVar.getResourceProvider());
                    return;
                }
                kVar.a(Boolean.FALSE);
                return;
            default:
                org.telegram.ui.Components.hb0 hb0Var = (org.telegram.ui.Components.hb0) obj4;
                org.telegram.ui.Components.hb0 hb0Var2 = (org.telegram.ui.Components.hb0) obj3;
                org.telegram.ui.Components.hb0 hb0Var3 = (org.telegram.ui.Components.hb0) obj2;
                jg.a2 a2Var = (jg.a2) obj;
                if (z9) {
                    org.telegram.ui.Components.v4.d(hb0Var, hb0Var2, hb0Var3);
                }
                int value = hb0Var3.getValue();
                int value2 = hb0Var2.getValue();
                int value3 = hb0Var.getValue();
                bk0 bk0Var = (bk0) a2Var.f16669c;
                int i12 = a2Var.f16668b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) a2Var.d;
                if (i12 == 8) {
                    int[] iArr = bk0Var.f44417y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    bk0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public yl(lm lmVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z9, TL_account.contentSettings contentsettings) {
        this.f52242c = lmVar;
        this.d = q1Var;
        this.f52243e = zArr;
        this.f52241b = z9;
        this.f52244f = contentsettings;
    }

    public yl(boolean z9, org.telegram.ui.Components.hb0 hb0Var, org.telegram.ui.Components.hb0 hb0Var2, org.telegram.ui.Components.hb0 hb0Var3, jg.a2 a2Var) {
        this.f52241b = z9;
        this.f52242c = hb0Var;
        this.d = hb0Var2;
        this.f52243e = hb0Var3;
        this.f52244f = a2Var;
    }
}

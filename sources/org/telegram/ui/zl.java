package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zl implements org.telegram.ui.ActionBar.q1, h2.j {
    public final int f54574a = 2;
    public final boolean f54575b;
    public final Object f54576c;
    public final Object d;
    public final Object f54577e;
    public final Object f54578f;

    public zl(a8.xa xaVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        this.f54576c = xaVar;
        this.d = uVar;
        this.f54577e = c0Var;
        this.f54578f = iOException;
        this.f54575b = z10;
    }

    @Override
    public void accept(Object obj) {
        a8.xa xaVar = (a8.xa) this.f54576c;
        ((x2.k0) obj).r(xaVar.f713b, (x2.g0) xaVar.f714c, (x2.u) this.d, (x2.c0) this.f54577e, (IOException) this.f54578f, this.f54575b);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11 = this.f54574a;
        Object obj = this.f54578f;
        Object obj2 = this.f54577e;
        Object obj3 = this.d;
        Object obj4 = this.f54576c;
        boolean z10 = this.f54575b;
        switch (i11) {
            case 0:
                mm mmVar = (mm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                bn bnVar = mmVar.f49937a;
                li.d dVar = new li.d(22, mmVar, (org.telegram.ui.Cells.r1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        dVar.a(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = bnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new li.d(23, mmVar, dVar), bnVar.getResourceProvider());
                    return;
                }
                dVar.a(Boolean.FALSE);
                return;
            default:
                org.telegram.ui.Components.tb0 tb0Var = (org.telegram.ui.Components.tb0) obj4;
                org.telegram.ui.Components.tb0 tb0Var2 = (org.telegram.ui.Components.tb0) obj3;
                org.telegram.ui.Components.tb0 tb0Var3 = (org.telegram.ui.Components.tb0) obj2;
                ai.t1 t1Var2 = (ai.t1) obj;
                if (z10) {
                    org.telegram.ui.Components.c5.d(tb0Var, tb0Var2, tb0Var3);
                }
                int value = tb0Var3.getValue();
                int value2 = tb0Var2.getValue();
                int value3 = tb0Var.getValue();
                hk0 hk0Var = (hk0) t1Var2.f1520c;
                int i12 = t1Var2.f1519b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) t1Var2.d;
                if (i12 == 8) {
                    int[] iArr = hk0Var.f48467y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    hk0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public zl(mm mmVar, org.telegram.ui.Cells.r1 r1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f54576c = mmVar;
        this.d = r1Var;
        this.f54577e = zArr;
        this.f54575b = z10;
        this.f54578f = contentsettings;
    }

    public zl(boolean z10, org.telegram.ui.Components.tb0 tb0Var, org.telegram.ui.Components.tb0 tb0Var2, org.telegram.ui.Components.tb0 tb0Var3, ai.t1 t1Var) {
        this.f54575b = z10;
        this.f54576c = tb0Var;
        this.d = tb0Var2;
        this.f54577e = tb0Var3;
        this.f54578f = t1Var;
    }
}

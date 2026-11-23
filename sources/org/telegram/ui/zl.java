package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zl implements org.telegram.ui.ActionBar.q1, h2.j {
    public final int f54641a = 2;
    public final boolean f54642b;
    public final Object f54643c;
    public final Object d;
    public final Object f54644e;
    public final Object f54645f;

    public zl(a8.xa xaVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        this.f54643c = xaVar;
        this.d = uVar;
        this.f54644e = c0Var;
        this.f54645f = iOException;
        this.f54642b = z10;
    }

    @Override
    public void accept(Object obj) {
        a8.xa xaVar = (a8.xa) this.f54643c;
        ((x2.k0) obj).r(xaVar.f713b, (x2.g0) xaVar.f714c, (x2.u) this.d, (x2.c0) this.f54644e, (IOException) this.f54645f, this.f54642b);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11 = this.f54641a;
        Object obj = this.f54645f;
        Object obj2 = this.f54644e;
        Object obj3 = this.d;
        Object obj4 = this.f54643c;
        boolean z10 = this.f54642b;
        switch (i11) {
            case 0:
                mm mmVar = (mm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                bn bnVar = mmVar.f50079a;
                ki.n2 n2Var = new ki.n2(23, mmVar, (org.telegram.ui.Cells.r1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        n2Var.a(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = bnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new ki.n2(24, mmVar, n2Var), bnVar.getResourceProvider());
                    return;
                }
                n2Var.a(Boolean.FALSE);
                return;
            default:
                org.telegram.ui.Components.qb0 qb0Var = (org.telegram.ui.Components.qb0) obj4;
                org.telegram.ui.Components.qb0 qb0Var2 = (org.telegram.ui.Components.qb0) obj3;
                org.telegram.ui.Components.qb0 qb0Var3 = (org.telegram.ui.Components.qb0) obj2;
                ai.o1 o1Var = (ai.o1) obj;
                if (z10) {
                    org.telegram.ui.Components.b5.d(qb0Var, qb0Var2, qb0Var3);
                }
                int value = qb0Var3.getValue();
                int value2 = qb0Var2.getValue();
                int value3 = qb0Var.getValue();
                fk0 fk0Var = (fk0) o1Var.f1444c;
                int i12 = o1Var.f1443b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) o1Var.d;
                if (i12 == 8) {
                    int[] iArr = fk0Var.f47906y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    fk0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public zl(mm mmVar, org.telegram.ui.Cells.r1 r1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f54643c = mmVar;
        this.d = r1Var;
        this.f54644e = zArr;
        this.f54642b = z10;
        this.f54645f = contentsettings;
    }

    public zl(boolean z10, org.telegram.ui.Components.qb0 qb0Var, org.telegram.ui.Components.qb0 qb0Var2, org.telegram.ui.Components.qb0 qb0Var3, ai.o1 o1Var) {
        this.f54642b = z10;
        this.f54643c = qb0Var;
        this.d = qb0Var2;
        this.f54644e = qb0Var3;
        this.f54645f = o1Var;
    }
}

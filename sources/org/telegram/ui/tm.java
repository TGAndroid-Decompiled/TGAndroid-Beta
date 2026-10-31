package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tm implements org.telegram.ui.ActionBar.u1, e2.j {
    public final int f41862a = 2;
    public final boolean f41863b;
    public final Object f41864c;
    public final Object d;
    public final Object e;
    public final Object f41865f;

    public tm(a5.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.f41864c = aVar;
        this.d = uVar;
        this.e = c0Var;
        this.f41865f = iOException;
        this.f41863b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f41864c;
        ((u2.k0) obj).B(aVar.f281b, (u2.g0) aVar.f282c, (u2.u) this.d, (u2.c0) this.e, (IOException) this.f41865f, this.f41863b);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        int i12 = this.f41862a;
        Object obj = this.f41865f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f41864c;
        boolean z10 = this.f41863b;
        switch (i12) {
            case 0:
                fn fnVar = (fn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                un unVar = fnVar.f37301a;
                ag.e0 e0Var = new ag.e0(25, fnVar, (org.telegram.ui.Cells.q1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        e0Var.a(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = unVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    ThemeActivity.G0(i11, parentActivity, new ag.e0(26, fnVar, e0Var), unVar.getResourceProvider());
                    return;
                }
                e0Var.a(Boolean.FALSE);
                return;
            default:
                org.telegram.ui.Components.ac0 ac0Var = (org.telegram.ui.Components.ac0) obj4;
                org.telegram.ui.Components.ac0 ac0Var2 = (org.telegram.ui.Components.ac0) obj3;
                org.telegram.ui.Components.ac0 ac0Var3 = (org.telegram.ui.Components.ac0) obj2;
                ag.b0 b0Var = (ag.b0) obj;
                if (z10) {
                    org.telegram.ui.Components.s4.d(ac0Var, ac0Var2, ac0Var3);
                }
                int value = ac0Var3.getValue();
                int value2 = ac0Var2.getValue();
                int value3 = ac0Var.getValue();
                ll0 ll0Var = (ll0) b0Var.f467c;
                int i13 = b0Var.f466b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) b0Var.d;
                if (i13 == 8) {
                    int[] iArr = ll0Var.f39312y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    ll0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public tm(fn fnVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f41864c = fnVar;
        this.d = q1Var;
        this.e = zArr;
        this.f41863b = z10;
        this.f41865f = contentsettings;
    }

    public tm(boolean z10, org.telegram.ui.Components.ac0 ac0Var, org.telegram.ui.Components.ac0 ac0Var2, org.telegram.ui.Components.ac0 ac0Var3, ag.b0 b0Var) {
        this.f41863b = z10;
        this.f41864c = ac0Var;
        this.d = ac0Var2;
        this.e = ac0Var3;
        this.f41865f = b0Var;
    }
}

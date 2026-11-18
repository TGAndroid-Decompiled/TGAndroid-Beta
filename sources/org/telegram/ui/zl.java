package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zl implements org.telegram.ui.ActionBar.r1, h2.j {
    public final int f54526a = 2;
    public final boolean f54527b;
    public final Object f54528c;
    public final Object d;
    public final Object f54529e;
    public final Object f54530f;

    public zl(a8.xa xaVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z10) {
        this.f54528c = xaVar;
        this.d = uVar;
        this.f54529e = c0Var;
        this.f54530f = iOException;
        this.f54527b = z10;
    }

    @Override
    public void accept(Object obj) {
        a8.xa xaVar = (a8.xa) this.f54528c;
        ((x2.k0) obj).r(xaVar.f713b, (x2.g0) xaVar.f714c, (x2.u) this.d, (x2.c0) this.f54529e, (IOException) this.f54530f, this.f54527b);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11 = this.f54526a;
        Object obj = this.f54530f;
        Object obj2 = this.f54529e;
        Object obj3 = this.d;
        Object obj4 = this.f54528c;
        boolean z10 = this.f54527b;
        switch (i11) {
            case 0:
                mm mmVar = (mm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                bn bnVar = mmVar.f49922a;
                li.d dVar = new li.d(22, mmVar, (org.telegram.ui.Cells.q1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        dVar.a(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = bnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new li.d(23, mmVar, dVar), bnVar.getResourceProvider());
                    return;
                }
                dVar.a(Boolean.FALSE);
                return;
            default:
                org.telegram.ui.Components.sb0 sb0Var = (org.telegram.ui.Components.sb0) obj4;
                org.telegram.ui.Components.sb0 sb0Var2 = (org.telegram.ui.Components.sb0) obj3;
                org.telegram.ui.Components.sb0 sb0Var3 = (org.telegram.ui.Components.sb0) obj2;
                ai.r1 r1Var = (ai.r1) obj;
                if (z10) {
                    org.telegram.ui.Components.b5.d(sb0Var, sb0Var2, sb0Var3);
                }
                int value = sb0Var3.getValue();
                int value2 = sb0Var2.getValue();
                int value3 = sb0Var.getValue();
                hk0 hk0Var = (hk0) r1Var.f1487c;
                int i12 = r1Var.f1486b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) r1Var.d;
                if (i12 == 8) {
                    int[] iArr = hk0Var.f48468y;
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

    public zl(mm mmVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f54528c = mmVar;
        this.d = q1Var;
        this.f54529e = zArr;
        this.f54527b = z10;
        this.f54530f = contentsettings;
    }

    public zl(boolean z10, org.telegram.ui.Components.sb0 sb0Var, org.telegram.ui.Components.sb0 sb0Var2, org.telegram.ui.Components.sb0 sb0Var3, ai.r1 r1Var) {
        this.f54527b = z10;
        this.f54528c = sb0Var;
        this.d = sb0Var2;
        this.f54529e = sb0Var3;
        this.f54530f = r1Var;
    }
}

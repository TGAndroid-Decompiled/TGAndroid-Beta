package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ul implements org.telegram.ui.ActionBar.p1, g2.k {
    public final int f50112a = 2;
    public final boolean f50113b;
    public final Object f50114c;
    public final Object d;
    public final Object f50115e;
    public final Object f50116f;

    public ul(b8.kg kgVar, w2.u uVar, w2.c0 c0Var, IOException iOException, boolean z10) {
        this.f50114c = kgVar;
        this.d = uVar;
        this.f50115e = c0Var;
        this.f50116f = iOException;
        this.f50113b = z10;
    }

    @Override
    public void accept(Object obj) {
        b8.kg kgVar = (b8.kg) this.f50114c;
        ((w2.k0) obj).j(kgVar.f2722b, (w2.g0) kgVar.f2723c, (w2.u) this.d, (w2.c0) this.f50115e, (IOException) this.f50116f, this.f50113b);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10;
        int i11 = this.f50112a;
        Object obj = this.f50116f;
        Object obj2 = this.f50115e;
        Object obj3 = this.d;
        Object obj4 = this.f50114c;
        boolean z10 = this.f50113b;
        switch (i11) {
            case 0:
                hm hmVar = (hm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                wm wmVar = hmVar.f45934a;
                mi.f fVar = new mi.f(22, hmVar, (org.telegram.ui.Cells.q1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        fVar.a(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = wmVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new mi.f(23, hmVar, fVar), wmVar.getResourceProvider());
                    return;
                }
                fVar.a(Boolean.FALSE);
                return;
            default:
                org.telegram.ui.Components.cb0 cb0Var = (org.telegram.ui.Components.cb0) obj4;
                org.telegram.ui.Components.cb0 cb0Var2 = (org.telegram.ui.Components.cb0) obj3;
                org.telegram.ui.Components.cb0 cb0Var3 = (org.telegram.ui.Components.cb0) obj2;
                k2.y yVar = (k2.y) obj;
                if (z10) {
                    org.telegram.ui.Components.t4.d(cb0Var, cb0Var2, cb0Var3);
                }
                int value = cb0Var3.getValue();
                int value2 = cb0Var2.getValue();
                int value3 = cb0Var.getValue();
                yj0 yj0Var = (yj0) yVar.f16776c;
                int i12 = yVar.f16775b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) yVar.d;
                if (i12 == 8) {
                    int[] iArr = yj0Var.f52339y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    yj0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public ul(hm hmVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f50114c = hmVar;
        this.d = q1Var;
        this.f50115e = zArr;
        this.f50113b = z10;
        this.f50116f = contentsettings;
    }

    public ul(boolean z10, org.telegram.ui.Components.cb0 cb0Var, org.telegram.ui.Components.cb0 cb0Var2, org.telegram.ui.Components.cb0 cb0Var3, k2.y yVar) {
        this.f50113b = z10;
        this.f50114c = cb0Var;
        this.d = cb0Var2;
        this.f50115e = cb0Var3;
        this.f50116f = yVar;
    }
}

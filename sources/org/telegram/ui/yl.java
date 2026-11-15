package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yl implements org.telegram.ui.ActionBar.q1, h2.j {
    public final int f53536a = 2;
    public final boolean f53537b;
    public final Object f53538c;
    public final Object d;
    public final Object f53539e;
    public final Object f53540f;

    public yl(a8.xa xaVar, x2.t tVar, x2.b0 b0Var, IOException iOException, boolean z10) {
        this.f53538c = xaVar;
        this.d = tVar;
        this.f53539e = b0Var;
        this.f53540f = iOException;
        this.f53537b = z10;
    }

    @Override
    public void accept(Object obj) {
        a8.xa xaVar = (a8.xa) this.f53538c;
        ((x2.j0) obj).r(xaVar.f713b, (x2.f0) xaVar.f714c, (x2.t) this.d, (x2.b0) this.f53539e, (IOException) this.f53540f, this.f53537b);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11 = this.f53536a;
        Object obj = this.f53540f;
        Object obj2 = this.f53539e;
        Object obj3 = this.d;
        Object obj4 = this.f53538c;
        boolean z10 = this.f53537b;
        switch (i11) {
            case 0:
                lm lmVar = (lm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                an anVar = lmVar.f49001a;
                li.v vVar = new li.v(23, lmVar, (org.telegram.ui.Cells.q1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        vVar.a(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = anVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new li.v(24, lmVar, vVar), anVar.getResourceProvider());
                    return;
                }
                vVar.a(Boolean.FALSE);
                return;
            default:
                org.telegram.ui.Components.ib0 ib0Var = (org.telegram.ui.Components.ib0) obj4;
                org.telegram.ui.Components.ib0 ib0Var2 = (org.telegram.ui.Components.ib0) obj3;
                org.telegram.ui.Components.ib0 ib0Var3 = (org.telegram.ui.Components.ib0) obj2;
                ai.r1 r1Var = (ai.r1) obj;
                if (z10) {
                    org.telegram.ui.Components.t4.d(ib0Var, ib0Var2, ib0Var3);
                }
                int value = ib0Var3.getValue();
                int value2 = ib0Var2.getValue();
                int value3 = ib0Var.getValue();
                ek0 ek0Var = (ek0) r1Var.f1498c;
                int i12 = r1Var.f1497b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) r1Var.d;
                if (i12 == 8) {
                    int[] iArr = ek0Var.f46847y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    ek0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public yl(lm lmVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f53538c = lmVar;
        this.d = q1Var;
        this.f53539e = zArr;
        this.f53537b = z10;
        this.f53540f = contentsettings;
    }

    public yl(boolean z10, org.telegram.ui.Components.ib0 ib0Var, org.telegram.ui.Components.ib0 ib0Var2, org.telegram.ui.Components.ib0 ib0Var3, ai.r1 r1Var) {
        this.f53537b = z10;
        this.f53538c = ib0Var;
        this.d = ib0Var2;
        this.f53539e = ib0Var3;
        this.f53540f = r1Var;
    }
}

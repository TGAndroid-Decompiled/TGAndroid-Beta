package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yl implements org.telegram.ui.ActionBar.q1, h2.j {
    public final int f53533a = 2;
    public final boolean f53534b;
    public final Object f53535c;
    public final Object d;
    public final Object f53536e;
    public final Object f53537f;

    public yl(a8.xa xaVar, x2.t tVar, x2.b0 b0Var, IOException iOException, boolean z10) {
        this.f53535c = xaVar;
        this.d = tVar;
        this.f53536e = b0Var;
        this.f53537f = iOException;
        this.f53534b = z10;
    }

    @Override
    public void accept(Object obj) {
        a8.xa xaVar = (a8.xa) this.f53535c;
        ((x2.j0) obj).r(xaVar.f713b, (x2.f0) xaVar.f714c, (x2.t) this.d, (x2.b0) this.f53536e, (IOException) this.f53537f, this.f53534b);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11 = this.f53533a;
        Object obj = this.f53537f;
        Object obj2 = this.f53536e;
        Object obj3 = this.d;
        Object obj4 = this.f53535c;
        boolean z10 = this.f53534b;
        switch (i11) {
            case 0:
                lm lmVar = (lm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                an anVar = lmVar.f49005a;
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
                ai.q1 q1Var = (ai.q1) obj;
                if (z10) {
                    org.telegram.ui.Components.t4.d(ib0Var, ib0Var2, ib0Var3);
                }
                int value = ib0Var3.getValue();
                int value2 = ib0Var2.getValue();
                int value3 = ib0Var.getValue();
                ek0 ek0Var = (ek0) q1Var.f1489c;
                int i12 = q1Var.f1488b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) q1Var.d;
                if (i12 == 8) {
                    int[] iArr = ek0Var.f46857y;
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
        this.f53535c = lmVar;
        this.d = q1Var;
        this.f53536e = zArr;
        this.f53534b = z10;
        this.f53537f = contentsettings;
    }

    public yl(boolean z10, org.telegram.ui.Components.ib0 ib0Var, org.telegram.ui.Components.ib0 ib0Var2, org.telegram.ui.Components.ib0 ib0Var3, ai.q1 q1Var) {
        this.f53534b = z10;
        this.f53535c = ib0Var;
        this.d = ib0Var2;
        this.f53536e = ib0Var3;
        this.f53537f = q1Var;
    }
}

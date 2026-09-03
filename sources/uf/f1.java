package uf;

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.pa;
import ph.z8;
public final class f1 extends org.telegram.ui.ActionBar.j {
    public final m1 f45370a;

    public f1(m1 m1Var) {
        this.f45370a = m1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        f6 f6Var;
        m1 m1Var = this.f45370a;
        ArrayList arrayList = m1Var.f45448b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                m1Var.finishFragment();
            } else {
                m1.X(m1Var);
            }
        } else if (i10 == 1) {
            if (arrayList.size() == 1) {
                int intValue = ((Integer) arrayList.get(0)).intValue();
                i11 = ((p2) m1Var).currentAccount;
                o1 c3 = p1.f(i11).c(intValue);
                if (c3 != null) {
                    Activity parentActivity = m1Var.getParentActivity();
                    i12 = ((p2) m1Var).currentAccount;
                    f6Var = ((p2) m1Var).resourceProvider;
                    m1.d0(parentActivity, i12, null, c3, f6Var, new pa(this, intValue, 3));
                }
            }
        } else if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m1Var.getParentActivity(), 0, m1Var.getResourceProvider());
            alertDialog$Builder.f19478a.O = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.f19478a.Q = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z8(this, 9));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            m1Var.showDialog(alertDialog$Builder.f19478a);
        }
    }
}

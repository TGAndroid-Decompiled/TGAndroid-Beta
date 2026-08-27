package qf;

import java.util.ArrayList;
import lh.o6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n2;

public final class g1 extends org.telegram.ui.ActionBar.j {

    public final n1 f46307a;

    public g1(n1 n1Var) {
        this.f46307a = n1Var;
    }

    @Override
    public final void b(int i10) {
        n1 n1Var = this.f46307a;
        ArrayList arrayList = n1Var.f46394b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                n1Var.finishFragment();
                return;
            } else {
                n1.X(n1Var);
                return;
            }
        }
        if (i10 == 1) {
            if (arrayList.size() != 1) {
                return;
            }
            int iIntValue = ((Integer) arrayList.get(0)).intValue();
            p1 p1VarC = q1.f(((n2) n1Var).currentAccount).c(iIntValue);
            if (p1VarC == null) {
                return;
            }
            n1.d0(n1Var.getParentActivity(), ((n2) n1Var).currentAccount, null, p1VarC, ((n2) n1Var).resourceProvider, new o6(this, iIntValue, 3));
            return;
        }
        if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n1Var.getParentActivity(), 0, n1Var.getResourceProvider());
            alertDialog$Builder.f22702a.N = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new lh.p(this, 18));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            n1Var.showDialog(alertDialog$Builder.f22702a);
        }
    }
}

package vf;

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.qa;
public final class f1 extends org.telegram.ui.ActionBar.j {
    public final m1 f49048a;

    public f1(m1 m1Var) {
        this.f49048a = m1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        g6 g6Var;
        m1 m1Var = this.f49048a;
        ArrayList arrayList = m1Var.f49132b;
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
                    g6Var = ((p2) m1Var).resourceProvider;
                    m1.d0(parentActivity, i12, null, c3, g6Var, new qa(this, intValue, 3));
                }
            }
        } else if (i10 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m1Var.getParentActivity(), 0, m1Var.getResourceProvider());
            alertDialog$Builder.f21166a.O = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.f21166a.Q = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new sf.g(this, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            m1Var.showDialog(alertDialog$Builder.f21166a);
        }
    }
}

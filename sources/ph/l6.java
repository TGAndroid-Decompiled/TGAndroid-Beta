package ph;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class l6 extends f2.z0 {
    public final m6 f41911a;

    public l6(m6 m6Var) {
        this.f41911a = m6Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            m6 m6Var = this.f41911a;
            if (m6Var.f41944f0) {
                m6Var.f41944f0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        m6 m6Var = this.f41911a;
        m6Var.d0();
        m6Var.X();
        if (m6Var.d.H1 && !m6Var.f41944f0) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) m6Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}

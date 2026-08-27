package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

public final class r10 extends f2.c0 {
    public final FiltersSetupActivity d;

    public r10(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        View view = o1Var.f5789a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        return o1Var.f5793f != 2 ? f2.c0.l(0, 0) : f2.c0.l(3, 0);
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (o1Var.f5793f != o1Var2.f5793f) {
            return false;
        }
        o10 o10Var = this.d.f35480b;
        int iB = o1Var.b();
        int iB2 = o1Var2.b();
        FiltersSetupActivity filtersSetupActivity = o10Var.f40974e;
        int i10 = filtersSetupActivity.f35485r;
        ArrayList arrayList = filtersSetupActivity.f35484n;
        if (iB >= i10 && iB2 >= i10) {
            m10 m10Var = (m10) arrayList.get(iB);
            m10 m10Var2 = (m10) arrayList.get(iB2);
            if (m10Var != null && m10Var2 != null && (dialogFilter = m10Var.d) != null && (dialogFilter2 = m10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(iB - filtersSetupActivity.f35485r, m10Var2.d);
                    arrayList2.set(iB2 - filtersSetupActivity.f35485r, m10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.f35482e = true;
                filtersSetupActivity.Z(true);
            }
        }
        return true;
    }

    @Override
    public final void p(f2.o1 o1Var, int i10) {
        if (i10 != 0) {
            this.d.f35479a.I0(false);
            o1Var.f5789a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new r00(this, 4));
            AndroidUtilities.runOnUIThread(new r00(this, 4), 320L);
        }
        if (o1Var != null) {
            o1Var.f5789a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override
    public final void q(f2.o1 o1Var) {
    }
}

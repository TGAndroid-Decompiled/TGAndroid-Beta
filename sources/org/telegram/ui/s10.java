package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class s10 extends s4.v {
    public final fz d = new fz(this, 5);
    public final FiltersSetupActivity e;

    public s10(FiltersSetupActivity filtersSetupActivity) {
        this.e = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.f46343a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
        if (view instanceof l10) {
            ((l10) view).setDragging(false);
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (b1Var.f46346f != 2) {
            return s4.v.l(0, 0);
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (b1Var.f46346f != b1Var2.f46346f) {
            return false;
        }
        p10 p10Var = this.e.f33443b;
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        FiltersSetupActivity filtersSetupActivity = p10Var.e;
        int i10 = filtersSetupActivity.f33447r;
        ArrayList arrayList = filtersSetupActivity.f33446n;
        if (b10 >= i10 && b11 >= i10) {
            n10 n10Var = (n10) arrayList.get(b10);
            n10 n10Var2 = (n10) arrayList.get(b11);
            if (n10Var != null && n10Var2 != null && (dialogFilter = n10Var.d) != null && (dialogFilter2 = n10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f33447r, n10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f33447r, n10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.b0(true);
            }
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        Boolean bool;
        boolean z10 = true;
        if (i10 != 0) {
            this.e.f33442a.I0(false);
            b1Var.f46343a.setPressed(true);
        } else {
            fz fzVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(fzVar);
            AndroidUtilities.runOnUIThread(fzVar, 320L);
        }
        if (b1Var != null) {
            View view = b1Var.f46343a;
            int i11 = R.id.dragging;
            if (i10 == 2) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            view.setTag(i11, bool);
            if (view instanceof l10) {
                l10 l10Var = (l10) view;
                if (i10 != 2) {
                    z10 = false;
                }
                l10Var.setDragging(z10);
            }
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}

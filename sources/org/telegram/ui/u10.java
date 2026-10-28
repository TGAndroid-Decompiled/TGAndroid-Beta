package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class u10 extends s4.w {
    public final r00 d = new r00(this, 4);
    public final FiltersSetupActivity e;

    public u10(FiltersSetupActivity filtersSetupActivity) {
        this.e = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        View view = e1Var.f47773a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
        if (view instanceof n10) {
            ((n10) view).setDragging(false);
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        if (e1Var.f47776f != 2) {
            return s4.w.l(0, 0);
        }
        return s4.w.l(3, 0);
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (e1Var.f47776f != e1Var2.f47776f) {
            return false;
        }
        r10 r10Var = this.e.f35533b;
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        FiltersSetupActivity filtersSetupActivity = r10Var.e;
        int i10 = filtersSetupActivity.f35537r;
        ArrayList arrayList = filtersSetupActivity.f35536n;
        if (b10 >= i10 && b11 >= i10) {
            p10 p10Var = (p10) arrayList.get(b10);
            p10 p10Var2 = (p10) arrayList.get(b11);
            if (p10Var != null && p10Var2 != null && (dialogFilter = p10Var.d) != null && (dialogFilter2 = p10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f35537r, p10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f35537r, p10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.c0(true);
            }
        }
        return true;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        Boolean bool;
        boolean z10 = true;
        if (i10 != 0) {
            this.e.f35532a.I0(false);
            e1Var.f47773a.setPressed(true);
        } else {
            r00 r00Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(r00Var);
            AndroidUtilities.runOnUIThread(r00Var, 320L);
        }
        if (e1Var != null) {
            View view = e1Var.f47773a;
            int i11 = R.id.dragging;
            if (i10 == 2) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            view.setTag(i11, bool);
            if (view instanceof n10) {
                n10 n10Var = (n10) view;
                if (i10 != 2) {
                    z10 = false;
                }
                n10Var.setDragging(z10);
            }
        }
    }

    @Override
    public final void q(s4.e1 e1Var) {
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class r10 extends org.telegram.ui.Components.nl0 {
    public final Context f37675r;
    public final q10 f37676s = new q10(this);
    public final u10 v;

    public r10(u10 u10Var, Context context) {
        this.v = u10Var;
        this.f37675r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.rl0 rl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        u10 u10Var = this.v;
        int i11 = 1;
        if (i10 >= u10Var.f38654n.size()) {
            return 1;
        }
        int size = ((ArrayList) u10Var.f38657r.get(u10Var.f38654n.get(i10))).size();
        if (i10 == 0) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 < this.v.f38654n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        u10 u10Var = this.v;
        ArrayList arrayList = u10Var.f38654n;
        int i10 = 0;
        if (u10Var.f38646f.isEmpty() || (arrayList.isEmpty() && u10Var.J)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !u10Var.K) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.t3(this.f37675r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19899e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        u10 u10Var = this.v;
        if (i10 < u10Var.f38654n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.t3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) u10Var.f38657r.get((String) u10Var.f38654n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.l1 l1Var) {
        return true;
    }

    @Override
    public final void W(int i10, int i11, f2.l1 l1Var) {
        boolean z4;
        u10 u10Var = this.v;
        ArrayList arrayList = u10Var.f38654n;
        int i12 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) u10Var.f38657r.get((String) arrayList.get(i10));
            int i13 = l1Var.f5777f;
            boolean z10 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (i10 != 0) {
                        i11--;
                    }
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                    MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                    if (k7Var.getMessage() != null && k7Var.getMessage().getId() == messageObject.getId()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && u10Var.J)) {
                        z10 = true;
                    }
                    k7Var.f21293y = z10;
                    k7Var.e();
                    k7Var.V = messageObject;
                    k7Var.requestLayout();
                    k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.fk(this, k7Var, messageObject, z4, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.t3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t3 t3Var;
        Context context = this.f37675r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setViewType(5);
                u00Var.setIsSingleCell(true);
                t3Var = u00Var;
            } else {
                org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 1, null);
                k7Var.setDelegate(this.f37676s);
                t3Var = k7Var;
            }
        } else {
            t3Var = new org.telegram.ui.Cells.t3(context, null);
        }
        return ai.n(t3Var, t3Var, -1, -2);
    }
}

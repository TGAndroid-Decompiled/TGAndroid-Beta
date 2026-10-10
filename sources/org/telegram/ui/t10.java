package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class t10 extends org.telegram.ui.Components.nm0 {
    public final Context f41868r;
    public final s10 f41869s = new s10(this);
    public final w10 v;

    public t10(w10 w10Var, Context context) {
        this.v = w10Var;
        this.f41868r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.rm0 rm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        w10 w10Var = this.v;
        int i11 = 1;
        if (i10 >= w10Var.f43103n.size()) {
            return 1;
        }
        int size = ((ArrayList) w10Var.f43108r.get(w10Var.f43103n.get(i10))).size();
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
        if (i10 < this.v.f43103n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        w10 w10Var = this.v;
        ArrayList arrayList = w10Var.f43103n;
        int i10 = 0;
        if (w10Var.f43095f.isEmpty() || (arrayList.isEmpty() && w10Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !w10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f41868r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        w10 w10Var = this.v;
        if (i10 < w10Var.f43103n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) w10Var.f43108r.get((String) w10Var.f43103n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.d1 d1Var) {
        boolean z10;
        w10 w10Var = this.v;
        ArrayList arrayList = w10Var.f43103n;
        int i12 = d1Var.f47706f;
        View view = d1Var.f47702a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) w10Var.f43108r.get((String) arrayList.get(i10));
            int i13 = d1Var.f47706f;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (i10 != 0) {
                        i11--;
                    }
                    org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                    MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                    if (n7Var.getMessage() != null && n7Var.getMessage().getId() == messageObject.getId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && w10Var.M)) {
                        z11 = true;
                    }
                    n7Var.f22550y = z11;
                    n7Var.e();
                    n7Var.f22531b0 = messageObject;
                    n7Var.requestLayout();
                    n7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.qk(this, n7Var, messageObject, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        Context context = this.f41868r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
                k10Var.setViewType(5);
                k10Var.setIsSingleCell(true);
                v3Var = k10Var;
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 1, null);
                n7Var.setDelegate(this.f41869s);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, null);
        }
        return com.google.android.gms.internal.vision.e2.k(v3Var, v3Var, -1, -2);
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class u10 extends org.telegram.ui.Components.ul0 {
    public final Context f37927r;
    public final t10 f37928s = new t10(this);
    public final x10 v;

    public u10(x10 x10Var, Context context) {
        this.v = x10Var;
        this.f37927r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.yl0 yl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        x10 x10Var = this.v;
        int i11 = 1;
        if (i10 >= x10Var.f39332n.size()) {
            return 1;
        }
        int size = ((ArrayList) x10Var.f39337r.get(x10Var.f39332n.get(i10))).size();
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
        if (i10 < this.v.f39332n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        x10 x10Var = this.v;
        ArrayList arrayList = x10Var.f39332n;
        int i10 = 0;
        if (x10Var.f39324f.isEmpty() || (arrayList.isEmpty() && x10Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !x10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.w3(this.f37927r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        x10 x10Var = this.v;
        if (i10 < x10Var.f39332n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.w3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) x10Var.f39337r.get((String) x10Var.f39332n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        boolean z10;
        x10 x10Var = this.v;
        ArrayList arrayList = x10Var.f39332n;
        int i12 = c1Var.f42998f;
        View view = c1Var.f42995a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) x10Var.f39337r.get((String) arrayList.get(i10));
            int i13 = c1Var.f42998f;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (i10 != 0) {
                        i11--;
                    }
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                    MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                    if (o7Var.getMessage() != null && o7Var.getMessage().getId() == messageObject.getId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && x10Var.M)) {
                        z11 = true;
                    }
                    o7Var.f20792y = z11;
                    o7Var.e();
                    o7Var.f20774b0 = messageObject;
                    o7Var.requestLayout();
                    o7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.mk(this, o7Var, messageObject, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.w3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w3 w3Var;
        Context context = this.f37927r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setViewType(5);
                t00Var.setIsSingleCell(true);
                w3Var = t00Var;
            } else {
                org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 1, null);
                o7Var.setDelegate(this.f37928s);
                w3Var = o7Var;
            }
        } else {
            w3Var = new org.telegram.ui.Cells.w3(context, null);
        }
        return com.google.android.gms.internal.vision.e2.k(w3Var, w3Var, -1, -2);
    }
}

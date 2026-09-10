package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class w10 extends org.telegram.ui.Components.rl0 {
    public final Context f37668r;
    public final v10 f37669s = new v10(this);
    public final z10 v;

    public w10(z10 z10Var, Context context) {
        this.v = z10Var;
        this.f37668r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        z10 z10Var = this.v;
        int i11 = 1;
        if (i10 >= z10Var.f39176n.size()) {
            return 1;
        }
        int size = ((ArrayList) z10Var.f39181r.get(z10Var.f39176n.get(i10))).size();
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
        if (i10 < this.v.f39176n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        z10 z10Var = this.v;
        ArrayList arrayList = z10Var.f39176n;
        int i10 = 0;
        if (z10Var.f39168f.isEmpty() || (arrayList.isEmpty() && z10Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !z10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f37668r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        z10 z10Var = this.v;
        if (i10 < z10Var.f39176n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) z10Var.f39181r.get((String) z10Var.f39176n.get(i10))).get(0)).messageOwner.date));
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
        z10 z10Var = this.v;
        ArrayList arrayList = z10Var.f39176n;
        int i12 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) z10Var.f39181r.get((String) arrayList.get(i10));
            int i13 = c1Var.f41613f;
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
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && z10Var.M)) {
                        z11 = true;
                    }
                    o7Var.f19660y = z11;
                    o7Var.e();
                    o7Var.f19642b0 = messageObject;
                    o7Var.requestLayout();
                    o7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.rk(this, o7Var, messageObject, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        Context context = this.f37668r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
                a10Var.setViewType(5);
                a10Var.setIsSingleCell(true);
                u3Var = a10Var;
            } else {
                org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 1, null);
                o7Var.setDelegate(this.f37669s);
                u3Var = o7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        }
        return com.google.android.gms.internal.vision.e2.j(u3Var, u3Var, -1, -2);
    }
}

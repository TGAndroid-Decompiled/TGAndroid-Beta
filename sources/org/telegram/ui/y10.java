package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class y10 extends org.telegram.ui.Components.im0 {
    public final Context f41708r;
    public final x10 f41709s = new x10(this);
    public final b20 v;

    public y10(b20 b20Var, Context context) {
        this.v = b20Var;
        this.f41708r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        b20 b20Var = this.v;
        int i11 = 1;
        if (i10 >= b20Var.f34177n.size()) {
            return 1;
        }
        int size = ((ArrayList) b20Var.f34182r.get(b20Var.f34177n.get(i10))).size();
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
        if (i10 < this.v.f34177n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        b20 b20Var = this.v;
        ArrayList arrayList = b20Var.f34177n;
        int i10 = 0;
        if (b20Var.f34169f.isEmpty() || (arrayList.isEmpty() && b20Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !b20Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f41708r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        b20 b20Var = this.v;
        if (i10 < b20Var.f34177n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) b20Var.f34182r.get((String) b20Var.f34177n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        boolean z10;
        b20 b20Var = this.v;
        ArrayList arrayList = b20Var.f34177n;
        int i12 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) b20Var.f34182r.get((String) arrayList.get(i10));
            int i13 = b1Var.f44841f;
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
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && b20Var.M)) {
                        z11 = true;
                    }
                    n7Var.f21295y = z11;
                    n7Var.e();
                    n7Var.f21277b0 = messageObject;
                    n7Var.requestLayout();
                    n7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.nk(this, n7Var, messageObject, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        Context context = this.f41708r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
                f10Var.setViewType(5);
                f10Var.setIsSingleCell(true);
                v3Var = f10Var;
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 1, null);
                n7Var.setDelegate(this.f41709s);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(v3Var, v3Var, -1, -2);
    }
}

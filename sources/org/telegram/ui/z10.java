package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class z10 extends org.telegram.ui.Components.im0 {
    public final Context f42454r;
    public final y10 f42455s = new y10(this);
    public final c20 v;

    public z10(c20 c20Var, Context context) {
        this.v = c20Var;
        this.f42454r = context;
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
        c20 c20Var = this.v;
        int i11 = 1;
        if (i10 >= c20Var.f34695n.size()) {
            return 1;
        }
        int size = ((ArrayList) c20Var.f34700r.get(c20Var.f34695n.get(i10))).size();
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
        if (i10 < this.v.f34695n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        c20 c20Var = this.v;
        ArrayList arrayList = c20Var.f34695n;
        int i10 = 0;
        if (c20Var.f34687f.isEmpty() || (arrayList.isEmpty() && c20Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !c20Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f42454r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        c20 c20Var = this.v;
        if (i10 < c20Var.f34695n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) c20Var.f34700r.get((String) c20Var.f34695n.get(i10))).get(0)).messageOwner.date));
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
        c20 c20Var = this.v;
        ArrayList arrayList = c20Var.f34695n;
        int i12 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) c20Var.f34700r.get((String) arrayList.get(i10));
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
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && c20Var.M)) {
                        z11 = true;
                    }
                    n7Var.f21588y = z11;
                    n7Var.e();
                    n7Var.f21570b0 = messageObject;
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
        Context context = this.f42454r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
                f10Var.setViewType(5);
                f10Var.setIsSingleCell(true);
                v3Var = f10Var;
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 1, null);
                n7Var.setDelegate(this.f42455s);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(v3Var, v3Var, -1, -2);
    }
}

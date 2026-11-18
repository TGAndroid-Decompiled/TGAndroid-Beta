package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class xz extends org.telegram.ui.Components.xj0 {
    public final Context f53935r;
    public final int f53936s;
    public final c00 f53937w;

    public xz(c00 c00Var, Context context, int i7) {
        this.f53937w = c00Var;
        this.f53935r = context;
        this.f53936s = i7;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.ck0 ck0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        c00 c00Var = this.f53937w;
        int i10 = 1;
        if (i7 >= c00Var.f46337n.size()) {
            return 1;
        }
        int size = ((ArrayList) c00Var.f46342r.get(c00Var.f46337n.get(i7))).size();
        if (i7 == 0) {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override
    public final int P(int i7, int i10) {
        if (i7 >= this.f53937w.f46337n.size()) {
            return 2;
        }
        if (i7 != 0 && i10 == 0) {
            return 0;
        }
        int i11 = this.f53936s;
        if (i11 != 2 && i11 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        c00 c00Var = this.f53937w;
        int i7 = 0;
        if (c00Var.f46337n.isEmpty()) {
            return 0;
        }
        int size = c00Var.f46337n.size();
        if (!c00Var.f46337n.isEmpty() && !c00Var.O) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.y3(this.f53935r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29414e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        c00 c00Var = this.f53937w;
        if (i7 < c00Var.f46337n.size()) {
            view.setAlpha(1.0f);
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            y3Var.setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) ((ArrayList) c00Var.f46342r.get((String) c00Var.f46337n.get(i7))).get(0)).f23965k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i7 != 0 && i10 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i7, int i10, v4.f1 f1Var) {
        boolean z10;
        boolean z11;
        c00 c00Var = this.f53937w;
        ArrayList arrayList = c00Var.f46337n;
        int i11 = f1Var.f59127f;
        View view = f1Var.f59123a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) c00Var.f46342r.get((String) arrayList.get(i7));
            int i12 = f1Var.f59127f;
            boolean z12 = false;
            if (i12 != 0) {
                boolean z13 = true;
                if (i12 != 1) {
                    if (i12 == 3) {
                        if (i7 != 0) {
                            i10--;
                        }
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(i10);
                        if (h7Var.getMessage() != null && h7Var.getMessage().e1() == fjVar.e1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && c00Var.N)) {
                            z12 = true;
                        }
                        h7Var.f(fjVar, z12);
                        h7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ik(this, h7Var, fjVar, z11, 3));
                        return;
                    }
                    return;
                }
                if (i7 != 0) {
                    i10--;
                }
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i10);
                if (i7Var.getMessage() != null && i7Var.getMessage().e1() == fjVar2.e1()) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i10 == arrayList2.size() - 1 && (i7 != arrayList.size() - 1 || !c00Var.N)) {
                    z13 = z10;
                }
                i7Var.c(fjVar2, z13);
                i7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ik(this, i7Var, fjVar2, z12, 2));
                return;
            }
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) arrayList2.get(0)).f23965k.date, false));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f53935r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    frameLayout2 = new org.telegram.ui.Components.cs0(this, context);
                    return i5.c.q(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
                int i10 = this.f53936s;
                if (i10 != 2 && i10 != 4) {
                    wzVar.setViewType(3);
                } else {
                    wzVar.setViewType(4);
                }
                wzVar.setIsSingleCell(true);
                frameLayout = wzVar;
            } else {
                frameLayout = new org.telegram.ui.Cells.i7(2, context, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.y3(context, null);
        }
        frameLayout2 = frameLayout;
        return i5.c.q(frameLayout2, frameLayout2, -1, -2);
    }
}

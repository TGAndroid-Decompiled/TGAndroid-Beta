package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class vz extends org.telegram.ui.Components.lj0 {
    public final Context f50799r;
    public final int f50800s;
    public final a00 f50801w;

    public vz(a00 a00Var, Context context, int i7) {
        this.f50801w = a00Var;
        this.f50799r = context;
        this.f50800s = i7;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.qj0 qj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        a00 a00Var = this.f50801w;
        int i10 = 1;
        if (i7 >= a00Var.f43527n.size()) {
            return 1;
        }
        int size = ((ArrayList) a00Var.f43532r.get(a00Var.f43527n.get(i7))).size();
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
        if (i7 >= this.f50801w.f43527n.size()) {
            return 2;
        }
        if (i7 != 0 && i10 == 0) {
            return 0;
        }
        int i11 = this.f50800s;
        if (i11 != 2 && i11 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        a00 a00Var = this.f50801w;
        int i7 = 0;
        if (a00Var.f43527n.isEmpty()) {
            return 0;
        }
        int size = a00Var.f43527n.size();
        if (!a00Var.f43527n.isEmpty() && !a00Var.N) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.f50799r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27885e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        a00 a00Var = this.f50801w;
        if (i7 < a00Var.f43527n.size()) {
            view.setAlpha(1.0f);
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            x3Var.setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) ((ArrayList) a00Var.f43532r.get((String) a00Var.f43527n.get(i7))).get(0)).f23262k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        if (i7 != 0 && i10 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        boolean z9;
        boolean z10;
        a00 a00Var = this.f50801w;
        ArrayList arrayList = a00Var.f43527n;
        int i11 = d1Var.f57060f;
        View view = d1Var.f57056a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) a00Var.f43532r.get((String) arrayList.get(i7));
            int i12 = d1Var.f57060f;
            boolean z11 = false;
            if (i12 != 0) {
                boolean z12 = true;
                if (i12 != 1) {
                    if (i12 == 3) {
                        if (i7 != 0) {
                            i10--;
                        }
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i10);
                        if (g7Var.getMessage() != null && g7Var.getMessage().e1() == ijVar.e1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && a00Var.M)) {
                            z11 = true;
                        }
                        g7Var.f(ijVar, z11);
                        g7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.tj(this, g7Var, ijVar, z10, 3));
                        return;
                    }
                    return;
                }
                if (i7 != 0) {
                    i10--;
                }
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i10);
                if (h7Var.getMessage() != null && h7Var.getMessage().e1() == ijVar2.e1()) {
                    z9 = false;
                    z11 = true;
                } else {
                    z9 = false;
                }
                if (i10 == arrayList2.size() - 1 && (i7 != arrayList.size() - 1 || !a00Var.M)) {
                    z12 = z9;
                }
                h7Var.c(ijVar2, z12);
                h7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.tj(this, h7Var, ijVar2, z11, 2));
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) arrayList2.get(0)).f23262k.date, false));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f50799r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    frameLayout2 = new org.telegram.ui.Components.vr0(this, context);
                    return jg.g.r(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
                int i10 = this.f50800s;
                if (i10 != 2 && i10 != 4) {
                    mzVar.setViewType(3);
                } else {
                    mzVar.setViewType(4);
                }
                mzVar.setIsSingleCell(true);
                frameLayout = mzVar;
            } else {
                frameLayout = new org.telegram.ui.Cells.h7(2, context, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.x3(context, null);
        }
        frameLayout2 = frameLayout;
        return jg.g.r(frameLayout2, frameLayout2, -1, -2);
    }
}

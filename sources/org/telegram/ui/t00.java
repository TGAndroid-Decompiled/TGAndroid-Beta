package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class t00 extends org.telegram.ui.Components.pk0 {
    public final Context f41500r;
    public final int f41501s;
    public final y00 f41502w;

    public t00(y00 y00Var, Context context, int i10) {
        this.f41502w = y00Var;
        this.f41500r = context;
        this.f41501s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.uk0 uk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        y00 y00Var = this.f41502w;
        int i11 = 1;
        if (i10 >= y00Var.f43512n.size()) {
            return 1;
        }
        int size = ((ArrayList) y00Var.f43517r.get(y00Var.f43512n.get(i10))).size();
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
        if (i10 >= this.f41502w.f43512n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f41501s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        y00 y00Var = this.f41502w;
        int i10 = 0;
        if (y00Var.f43512n.isEmpty()) {
            return 0;
        }
        int size = y00Var.f43512n.size();
        if (!y00Var.f43512n.isEmpty() && !y00Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(this.f41500r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        y00 y00Var = this.f41502w;
        if (i10 < y00Var.f43512n.size()) {
            view.setAlpha(1.0f);
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            z3Var.setText(org.telegram.messenger.dd.e0(((org.telegram.messenger.kj) ((ArrayList) y00Var.f43517r.get((String) y00Var.f43512n.get(i10))).get(0)).f16690k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i11 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        boolean z10;
        boolean z11;
        y00 y00Var = this.f41502w;
        ArrayList arrayList = y00Var.f43512n;
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) y00Var.f43517r.get((String) arrayList.get(i10));
            int i13 = c1Var.f47912f;
            boolean z12 = false;
            if (i13 != 0) {
                boolean z13 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList2.get(i11);
                        if (k7Var.getMessage() != null && k7Var.getMessage().f1() == kjVar.f1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && y00Var.M)) {
                            z12 = true;
                        }
                        k7Var.f(kjVar, z12);
                        k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.vj(this, k7Var, kjVar, z11, 3));
                        return;
                    }
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList2.get(i11);
                if (l7Var.getMessage() != null && l7Var.getMessage().f1() == kjVar2.f1()) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !y00Var.M)) {
                    z13 = z10;
                }
                l7Var.c(kjVar2, z13);
                l7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.vj(this, l7Var, kjVar2, z12, 2));
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.e0(((org.telegram.messenger.kj) arrayList2.get(0)).f16690k.date, false));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f41500r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new org.telegram.ui.Components.us0(this, context);
                    return sc.e.o(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
                int i11 = this.f41501s;
                if (i11 != 2 && i11 != 4) {
                    zzVar.setViewType(3);
                } else {
                    zzVar.setViewType(4);
                }
                zzVar.setIsSingleCell(true);
                frameLayout = zzVar;
            } else {
                frameLayout = new org.telegram.ui.Cells.l7(2, context, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.z3(context, null);
        }
        frameLayout2 = frameLayout;
        return sc.e.o(frameLayout2, frameLayout2, -1, -2);
    }
}

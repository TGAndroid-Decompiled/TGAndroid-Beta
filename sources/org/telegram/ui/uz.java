package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class uz extends org.telegram.ui.Components.pj0 {
    public final Context f52068r;
    public final int f52069s;
    public final zz f52070w;

    public uz(zz zzVar, Context context, int i7) {
        this.f52070w = zzVar;
        this.f52068r = context;
        this.f52069s = i7;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        zz zzVar = this.f52070w;
        int i10 = 1;
        if (i7 >= zzVar.f54090n.size()) {
            return 1;
        }
        int size = ((ArrayList) zzVar.f54095r.get(zzVar.f54090n.get(i7))).size();
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
        if (i7 >= this.f52070w.f54090n.size()) {
            return 2;
        }
        if (i7 != 0 && i10 == 0) {
            return 0;
        }
        int i11 = this.f52069s;
        if (i11 != 2 && i11 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        zz zzVar = this.f52070w;
        int i7 = 0;
        if (zzVar.f54090n.isEmpty()) {
            return 0;
        }
        int size = zzVar.f54090n.size();
        if (!zzVar.f54090n.isEmpty() && !zzVar.O) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.f52068r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28869e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        zz zzVar = this.f52070w;
        if (i7 < zzVar.f54090n.size()) {
            view.setAlpha(1.0f);
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            x3Var.setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) ((ArrayList) zzVar.f54095r.get((String) zzVar.f54090n.get(i7))).get(0)).f23817k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        if (i7 != 0 && i10 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i7, int i10, v4.e1 e1Var) {
        boolean z10;
        boolean z11;
        zz zzVar = this.f52070w;
        ArrayList arrayList = zzVar.f54090n;
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) zzVar.f54095r.get((String) arrayList.get(i7));
            int i12 = e1Var.f58539f;
            boolean z12 = false;
            if (i12 != 0) {
                boolean z13 = true;
                if (i12 != 1) {
                    if (i12 == 3) {
                        if (i7 != 0) {
                            i10--;
                        }
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i10);
                        if (f7Var.getMessage() != null && f7Var.getMessage().e1() == gjVar.e1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && zzVar.N)) {
                            z12 = true;
                        }
                        f7Var.f(gjVar, z12);
                        f7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.bk(this, f7Var, gjVar, z11, 3));
                        return;
                    }
                    return;
                }
                if (i7 != 0) {
                    i10--;
                }
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList2.get(i10);
                if (g7Var.getMessage() != null && g7Var.getMessage().e1() == gjVar2.e1()) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i10 == arrayList2.size() - 1 && (i7 != arrayList.size() - 1 || !zzVar.N)) {
                    z13 = z10;
                }
                g7Var.c(gjVar2, z13);
                g7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.bk(this, g7Var, gjVar2, z12, 2));
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) arrayList2.get(0)).f23817k.date, false));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f52068r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    frameLayout2 = new org.telegram.ui.Components.ur0(this, context);
                    return i5.c.q(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
                int i10 = this.f52069s;
                if (i10 != 2 && i10 != 4) {
                    pzVar.setViewType(3);
                } else {
                    pzVar.setViewType(4);
                }
                pzVar.setIsSingleCell(true);
                frameLayout = pzVar;
            } else {
                frameLayout = new org.telegram.ui.Cells.g7(2, context, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.x3(context, null);
        }
        frameLayout2 = frameLayout;
        return i5.c.q(frameLayout2, frameLayout2, -1, -2);
    }
}

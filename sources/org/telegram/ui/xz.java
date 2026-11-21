package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class xz extends org.telegram.ui.Components.zj0 {
    public final Context f53984r;
    public final int f53985s;
    public final c00 f53986w;

    public xz(c00 c00Var, Context context, int i7) {
        this.f53986w = c00Var;
        this.f53984r = context;
        this.f53985s = i7;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        c00 c00Var = this.f53986w;
        int i10 = 1;
        if (i7 >= c00Var.f46360n.size()) {
            return 1;
        }
        int size = ((ArrayList) c00Var.f46365r.get(c00Var.f46360n.get(i7))).size();
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
        if (i7 >= this.f53986w.f46360n.size()) {
            return 2;
        }
        if (i7 != 0 && i10 == 0) {
            return 0;
        }
        int i11 = this.f53985s;
        if (i11 != 2 && i11 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        c00 c00Var = this.f53986w;
        int i7 = 0;
        if (c00Var.f46360n.isEmpty()) {
            return 0;
        }
        int size = c00Var.f46360n.size();
        if (!c00Var.f46360n.isEmpty() && !c00Var.O) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.y3(this.f53984r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29398e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        c00 c00Var = this.f53986w;
        if (i7 < c00Var.f46360n.size()) {
            view.setAlpha(1.0f);
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            y3Var.setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) ((ArrayList) c00Var.f46365r.get((String) c00Var.f46360n.get(i7))).get(0)).f23993k.date, false));
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
        c00 c00Var = this.f53986w;
        ArrayList arrayList = c00Var.f46360n;
        int i11 = f1Var.f59165f;
        View view = f1Var.f59161a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) c00Var.f46365r.get((String) arrayList.get(i7));
            int i12 = f1Var.f59165f;
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
                        h7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.kk(this, h7Var, fjVar, z11, 3));
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
                i7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.kk(this, i7Var, fjVar2, z12, 2));
                return;
            }
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) arrayList2.get(0)).f23993k.date, false));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f53984r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    frameLayout2 = new org.telegram.ui.Components.fs0(this, context);
                    return i5.c.q(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
                int i10 = this.f53985s;
                if (i10 != 2 && i10 != 4) {
                    yzVar.setViewType(3);
                } else {
                    yzVar.setViewType(4);
                }
                yzVar.setIsSingleCell(true);
                frameLayout = yzVar;
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

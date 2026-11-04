package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class rz extends org.telegram.ui.Components.oj0 {
    public final Context f49307r;
    public final int f49308s;
    public final wz f49309w;

    public rz(wz wzVar, Context context, int i3) {
        this.f49309w = wzVar;
        this.f49307r = context;
        this.f49308s = i3;
    }

    @Override
    public final String F(int i3) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i3) {
        wz wzVar = this.f49309w;
        int i10 = 1;
        if (i3 >= wzVar.f51653n.size()) {
            return 1;
        }
        int size = ((ArrayList) wzVar.f51658r.get(wzVar.f51653n.get(i3))).size();
        if (i3 == 0) {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final Object O(int i3, int i10) {
        return null;
    }

    @Override
    public final int P(int i3, int i10) {
        if (i3 >= this.f49309w.f51653n.size()) {
            return 2;
        }
        if (i3 != 0 && i10 == 0) {
            return 0;
        }
        int i11 = this.f49308s;
        if (i11 != 2 && i11 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        wz wzVar = this.f49309w;
        int i3 = 0;
        if (wzVar.f51653n.isEmpty()) {
            return 0;
        }
        int size = wzVar.f51653n.size();
        if (!wzVar.f51653n.isEmpty() && !wzVar.O) {
            i3 = 1;
        }
        return size + i3;
    }

    @Override
    public final View T(int i3, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.f49307r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27899e7, false) & (-218103809));
        }
        if (i3 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        wz wzVar = this.f49309w;
        if (i3 < wzVar.f51653n.size()) {
            view.setAlpha(1.0f);
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            x3Var.setText(org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) ((ArrayList) wzVar.f51658r.get((String) wzVar.f51653n.get(i3))).get(0)).f26868k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        if (i3 != 0 && i10 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i3, int i10, u4.d1 d1Var) {
        boolean z10;
        boolean z11;
        wz wzVar = this.f49309w;
        ArrayList arrayList = wzVar.f51653n;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) wzVar.f51658r.get((String) arrayList.get(i3));
            int i12 = d1Var.f55544f;
            boolean z12 = false;
            if (i12 != 0) {
                boolean z13 = true;
                if (i12 != 1) {
                    if (i12 == 3) {
                        if (i3 != 0) {
                            i10--;
                        }
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i10);
                        if (f7Var.getMessage() != null && f7Var.getMessage().f1() == ziVar.f1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i10 != arrayList2.size() - 1 || (i3 == arrayList.size() - 1 && wzVar.N)) {
                            z12 = true;
                        }
                        f7Var.f(ziVar, z12);
                        f7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.sj(this, f7Var, ziVar, z11, 3));
                        return;
                    }
                    return;
                }
                if (i3 != 0) {
                    i10--;
                }
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList2.get(i10);
                if (g7Var.getMessage() != null && g7Var.getMessage().f1() == ziVar2.f1()) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i10 == arrayList2.size() - 1 && (i3 != arrayList.size() - 1 || !wzVar.N)) {
                    z13 = z10;
                }
                g7Var.c(ziVar2, z13);
                g7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.sj(this, g7Var, ziVar2, z12, 2));
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) arrayList2.get(0)).f26868k.date, false));
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f49307r;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    frameLayout2 = new org.telegram.ui.Components.sr0(this, context);
                    return k2.p1.p(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
                int i10 = this.f49308s;
                if (i10 != 2 && i10 != 4) {
                    izVar.setViewType(3);
                } else {
                    izVar.setViewType(4);
                }
                izVar.setIsSingleCell(true);
                frameLayout = izVar;
            } else {
                frameLayout = new org.telegram.ui.Cells.g7(2, context, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.x3(context, null);
        }
        frameLayout2 = frameLayout;
        return k2.p1.p(frameLayout2, frameLayout2, -1, -2);
    }
}

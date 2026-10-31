package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
public final class y5 implements fe.e, a70, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.gu0, org.telegram.ui.Components.hk0 {
    public final int f43707a;
    public final y6 f43708b;

    public y5(y6 y6Var, int i10) {
        this.f43707a = i10;
        this.f43708b = y6Var;
    }

    @Override
    public void E(float f7, int i10) {
        int i11 = this.f43707a;
    }

    @Override
    public void a(int i10) {
        org.telegram.messenger.i0.a4(this.f43708b.f43717b);
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        y6 y6Var = this.f43708b;
        ArrayList arrayList = y6Var.f43724f0;
        if (y6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i10);
            int i11 = 0;
            if (u6Var.f7680a == 11 && (view instanceof org.telegram.ui.Cells.c2)) {
                int i12 = u6Var.f42016f;
                if (i12 < 0) {
                    y6Var.L = !y6Var.L;
                    y6Var.z0(true);
                    y6Var.x0();
                    return;
                }
                boolean[] zArr = y6Var.d;
                if (i12 < 0) {
                    y6Var.w0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && y6Var.v0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        org.telegram.messenger.t2.APP_ERROR.a();
                        org.telegram.messenger.i0.F3(-3.0f, view, null);
                        return;
                    }
                }
                int i15 = u6Var.f42016f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                if (u6Var.f42018i) {
                    while (true) {
                        if (i11 >= y6Var.f43717b.getChildCount()) {
                            break;
                        }
                        View childAt = y6Var.f43717b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.c2) {
                            y6Var.f43717b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u6) arrayList.get(R)).f42016f < 0) {
                                ((org.telegram.ui.Cells.c2) childAt).c(y6Var.s0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                y6Var.x0();
            } else if (u6Var.f42015c >= 0) {
                d70 d70Var = new d70(view.getContext(), y6Var);
                org.telegram.ui.ActionBar.k1 P = org.telegram.ui.Components.s4.P(y6Var, d70Var, view, f7, f10);
                int i16 = ((u6) arrayList.get(i10)).f42015c;
                d70Var.f36636c0 = i16;
                FrameLayout frameLayout = d70Var.f36641h0;
                org.telegram.ui.ActionBar.b1 b1Var = d70Var.V;
                org.telegram.ui.ActionBar.b1 b1Var2 = d70Var.W;
                org.telegram.ui.Components.p80 p80Var = d70Var.T;
                c70 c70Var = d70Var.f36635b0;
                if (i16 == 3) {
                    b1Var2.setVisibility(0);
                    b1Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    c70Var.setVisibility(8);
                    p80Var.setVisibility(8);
                } else {
                    b1Var2.setVisibility(8);
                    b1Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    c70Var.setVisibility(0);
                    p80Var.setVisibility(0);
                }
                ArrayList d = d70Var.f36637d0.d(i16);
                d70Var.f36639f0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.k2 k2Var = d70Var.f36640g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.u5 u5Var = c70Var.f36405a;
                    org.telegram.ui.Components.u8 u8Var = c70Var.f36406b;
                    u5Var.l(org.telegram.messenger.cd.L0(2131754475, null), false);
                    c70Var.f36405a.setRightPadding(org.telegram.messenger.i0.L(8.0f));
                    u8Var.b(0, k2Var.getCurrentAccount(), null);
                    u8Var.b(1, k2Var.getCurrentAccount(), null);
                    u8Var.b(2, k2Var.getCurrentAccount(), null);
                    u8Var.a(false);
                } else {
                    int min = Math.min(3, d70Var.f36639f0.size());
                    org.telegram.ui.ActionBar.u5 u5Var2 = c70Var.f36405a;
                    org.telegram.ui.Components.u8 u8Var2 = c70Var.f36406b;
                    u5Var2.setRightPadding(org.telegram.messenger.i0.L((Math.max(0, min - 1) * 12) + 64));
                    c70Var.f36405a.l(org.telegram.messenger.cd.G(d70Var.f36639f0.size(), "ExceptionShort", Integer.valueOf(d70Var.f36639f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        u8Var2.b(i17, k2Var.getCurrentAccount(), k2Var.getMessagesController().d2(((org.telegram.messenger.w2) d70Var.f36639f0.get(i17)).f19043a));
                    }
                    u8Var2.a(false);
                }
                d70Var.U.setVisibility(8);
                p80Var.setVisibility(8);
                d70Var.g();
                d70Var.setParentWindow(P);
                d70Var.setCallback(new y5(y6Var, 1));
            }
        }
    }

    @Override
    public int c() {
        return this.f43708b.R;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        y6 y6Var = this.f43708b;
        sh.b bVar = y6Var.f43721d0;
        LongSparseArray longSparseArray = bVar.f48499c;
        s6 s6Var = new s6(0L);
        Iterator it = bVar.f48503j.iterator();
        while (it.hasNext()) {
            sh.a aVar = (sh.a) it.next();
            s6Var.a(aVar, aVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(aVar.f48493b);
            if (s6Var2 != null) {
                s6Var2.b(aVar);
                if (s6Var2.f41382c <= 0) {
                    longSparseArray.remove(aVar.f48493b);
                    bVar.f48498b.remove(s6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (s6Var.f41382c > 0) {
            y6Var.n0(s6Var, null, null);
        }
        y6Var.f43721d0.d();
        j6 j6Var = y6Var.M;
        if (j6Var != null) {
            j6Var.d();
            y6Var.M.f(false);
        }
        y6Var.z0(true);
        y6Var.x0();
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        switch (this.f43707a) {
            case 0:
                y6 y6Var = this.f43708b;
                y6Var.y0();
                y6Var.fragmentView.invalidate();
                return;
            default:
                y6.Z(this.f43708b, f7);
                return;
        }
    }

    private final void d(float f7, int i10) {
    }

    private final void e(float f7, int i10) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}

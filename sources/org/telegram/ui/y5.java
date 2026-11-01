package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
public final class y5 implements fe.e, a70, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.hu0, org.telegram.ui.Components.ik0 {
    public final int f43561a;
    public final y6 f43562b;

    public y5(y6 y6Var, int i10) {
        this.f43561a = i10;
        this.f43562b = y6Var;
    }

    @Override
    public void E(float f7, int i10) {
        int i11 = this.f43561a;
    }

    @Override
    public void a(int i10) {
        org.telegram.messenger.i0.a4(this.f43562b.f43573b);
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        y6 y6Var = this.f43562b;
        ArrayList arrayList = y6Var.f43580f0;
        if (y6Var.getParentActivity() != null && i10 >= 0 && i10 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i10);
            int i11 = 0;
            if (u6Var.f7681a == 11 && (view instanceof org.telegram.ui.Cells.c2)) {
                int i12 = u6Var.f41831f;
                if (i12 < 0) {
                    y6Var.L = !y6Var.L;
                    y6Var.A0(true);
                    y6Var.y0();
                    return;
                }
                boolean[] zArr = y6Var.d;
                if (i12 < 0) {
                    y6Var.x0(view);
                    return;
                }
                if (zArr[i12]) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < 10; i14++) {
                        if (zArr[i14] && y6Var.w0(i14) > 0) {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        org.telegram.messenger.t2.APP_ERROR.a();
                        org.telegram.messenger.i0.F3(-3.0f, view, null);
                        return;
                    }
                }
                int i15 = u6Var.f41831f;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                if (u6Var.f41833i) {
                    while (true) {
                        if (i11 >= y6Var.f43573b.getChildCount()) {
                            break;
                        }
                        View childAt = y6Var.f43573b.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.c2) {
                            y6Var.f43573b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u6) arrayList.get(R)).f41831f < 0) {
                                ((org.telegram.ui.Cells.c2) childAt).c(y6Var.t0(), true);
                                break;
                            }
                        }
                        i11++;
                    }
                }
                y6Var.y0();
            } else if (u6Var.f41830c >= 0) {
                d70 d70Var = new d70(view.getContext(), y6Var);
                org.telegram.ui.ActionBar.k1 P = org.telegram.ui.Components.s4.P(y6Var, d70Var, view, f7, f10);
                int i16 = ((u6) arrayList.get(i10)).f41830c;
                d70Var.f36514c0 = i16;
                FrameLayout frameLayout = d70Var.f36519h0;
                org.telegram.ui.ActionBar.b1 b1Var = d70Var.V;
                org.telegram.ui.ActionBar.b1 b1Var2 = d70Var.W;
                org.telegram.ui.Components.p80 p80Var = d70Var.T;
                c70 c70Var = d70Var.f36513b0;
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
                ArrayList d = d70Var.f36515d0.d(i16);
                d70Var.f36517f0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.k2 k2Var = d70Var.f36518g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.u5 u5Var = c70Var.f36214a;
                    org.telegram.ui.Components.u8 u8Var = c70Var.f36215b;
                    u5Var.l(org.telegram.messenger.dd.L0(2131754475, null), false);
                    c70Var.f36214a.setRightPadding(org.telegram.messenger.i0.L(8.0f));
                    u8Var.b(0, k2Var.getCurrentAccount(), null);
                    u8Var.b(1, k2Var.getCurrentAccount(), null);
                    u8Var.b(2, k2Var.getCurrentAccount(), null);
                    u8Var.a(false);
                } else {
                    int min = Math.min(3, d70Var.f36517f0.size());
                    org.telegram.ui.ActionBar.u5 u5Var2 = c70Var.f36214a;
                    org.telegram.ui.Components.u8 u8Var2 = c70Var.f36215b;
                    u5Var2.setRightPadding(org.telegram.messenger.i0.L((Math.max(0, min - 1) * 12) + 64));
                    c70Var.f36214a.l(org.telegram.messenger.dd.G(d70Var.f36517f0.size(), "ExceptionShort", Integer.valueOf(d70Var.f36517f0.size())), false);
                    for (int i17 = 0; i17 < min; i17++) {
                        u8Var2.b(i17, k2Var.getCurrentAccount(), k2Var.getMessagesController().d2(((org.telegram.messenger.w2) d70Var.f36517f0.get(i17)).f18968a));
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
        return this.f43562b.R;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        y6 y6Var = this.f43562b;
        sh.b bVar = y6Var.f43577d0;
        LongSparseArray longSparseArray = bVar.f48510c;
        s6 s6Var = new s6(0L);
        Iterator it = bVar.f48514j.iterator();
        while (it.hasNext()) {
            sh.a aVar = (sh.a) it.next();
            s6Var.a(aVar, aVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(aVar.f48504b);
            if (s6Var2 != null) {
                s6Var2.b(aVar);
                if (s6Var2.f41233c <= 0) {
                    longSparseArray.remove(aVar.f48504b);
                    bVar.f48509b.remove(s6Var2);
                }
                ArrayList e = bVar.e(aVar.d);
                if (e != null) {
                    e.remove(aVar);
                }
            }
        }
        if (s6Var.f41233c > 0) {
            y6Var.o0(s6Var, null, null);
        }
        y6Var.f43577d0.d();
        j6 j6Var = y6Var.M;
        if (j6Var != null) {
            j6Var.d();
            y6Var.M.f(false);
        }
        y6Var.A0(true);
        y6Var.y0();
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        switch (this.f43561a) {
            case 0:
                y6 y6Var = this.f43562b;
                y6Var.z0();
                y6Var.fragmentView.invalidate();
                return;
            default:
                y6.a0(this.f43562b, f7);
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

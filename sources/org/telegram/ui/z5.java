package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
public final class z5 implements te.b, a60, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.et0, org.telegram.ui.Components.hj0 {
    public final int f53843a;
    public final y6 f53844b;

    public z5(y6 y6Var, int i7) {
        this.f53843a = i7;
        this.f53844b = y6Var;
    }

    @Override
    public void E(float f10, int i7) {
        int i10 = this.f53843a;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        switch (this.f53843a) {
            case 0:
                y6 y6Var = this.f53844b;
                y6Var.z0();
                y6Var.fragmentView.invalidate();
                return;
            default:
                y6.a0(this.f53844b, f10);
                return;
        }
    }

    @Override
    public void a(int i7) {
        org.telegram.messenger.g0.a4(this.f53844b.f53440b);
    }

    @Override
    public int b() {
        return this.f53844b.S;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        y6 y6Var = this.f53844b;
        ArrayList arrayList = y6Var.f53449g0;
        if (y6Var.getParentActivity() != null && i7 >= 0 && i7 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i7);
            int i10 = 0;
            if (u6Var.f56015a == 11 && (view instanceof org.telegram.ui.Cells.c2)) {
                int i11 = u6Var.f51775f;
                if (i11 < 0) {
                    y6Var.M = !y6Var.M;
                    y6Var.A0(true);
                    y6Var.y0();
                    return;
                }
                boolean[] zArr = y6Var.d;
                if (i11 < 0) {
                    y6Var.x0(view);
                    return;
                }
                if (zArr[i11]) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < 10; i13++) {
                        if (zArr[i13] && y6Var.w0(i13) > 0) {
                            i12++;
                        }
                    }
                    if (i12 <= 1) {
                        org.telegram.messenger.p2.APP_ERROR.a();
                        org.telegram.messenger.g0.F3(-3.0f, view, null);
                        return;
                    }
                }
                int i14 = u6Var.f51775f;
                boolean z10 = !zArr[i14];
                zArr[i14] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                if (u6Var.f51777i) {
                    while (true) {
                        if (i10 >= y6Var.f53440b.getChildCount()) {
                            break;
                        }
                        View childAt = y6Var.f53440b.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.c2) {
                            y6Var.f53440b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u6) arrayList.get(R)).f51775f < 0) {
                                ((org.telegram.ui.Cells.c2) childAt).c(y6Var.t0(), true);
                                break;
                            }
                        }
                        i10++;
                    }
                }
                y6Var.y0();
            } else if (u6Var.f51773c >= 0) {
                d60 d60Var = new d60(view.getContext(), y6Var);
                org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.t4.N(y6Var, d60Var, view, f10, f11);
                int i15 = ((u6) arrayList.get(i7)).f51773c;
                d60Var.f46281d0 = i15;
                FrameLayout frameLayout = d60Var.f46286i0;
                org.telegram.ui.ActionBar.z0 z0Var = d60Var.W;
                org.telegram.ui.ActionBar.z0 z0Var2 = d60Var.f46278a0;
                org.telegram.ui.Components.z70 z70Var = d60Var.U;
                c60 c60Var = d60Var.f46280c0;
                if (i15 == 3) {
                    z0Var2.setVisibility(0);
                    z0Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    c60Var.setVisibility(8);
                    z70Var.setVisibility(8);
                } else {
                    z0Var2.setVisibility(8);
                    z0Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    c60Var.setVisibility(0);
                    z70Var.setVisibility(0);
                }
                ArrayList d = d60Var.f46282e0.d(i15);
                d60Var.f46284g0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.e2 e2Var = d60Var.f46285h0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.j5 j5Var = c60Var.f46022a;
                    org.telegram.ui.Components.w8 w8Var = c60Var.f46023b;
                    j5Var.l(org.telegram.messenger.hd.M0(2131754475, null), false);
                    c60Var.f46022a.setRightPadding(org.telegram.messenger.g0.L(8.0f));
                    w8Var.b(0, e2Var.getCurrentAccount(), null);
                    w8Var.b(1, e2Var.getCurrentAccount(), null);
                    w8Var.b(2, e2Var.getCurrentAccount(), null);
                    w8Var.a(false);
                } else {
                    int min = Math.min(3, d60Var.f46284g0.size());
                    org.telegram.ui.ActionBar.j5 j5Var2 = c60Var.f46022a;
                    org.telegram.ui.Components.w8 w8Var2 = c60Var.f46023b;
                    j5Var2.setRightPadding(org.telegram.messenger.g0.L((Math.max(0, min - 1) * 12) + 64));
                    c60Var.f46022a.l(org.telegram.messenger.hd.G(d60Var.f46284g0.size(), "ExceptionShort", Integer.valueOf(d60Var.f46284g0.size())), false);
                    for (int i16 = 0; i16 < min; i16++) {
                        w8Var2.b(i16, e2Var.getCurrentAccount(), e2Var.getMessagesController().e2(((org.telegram.messenger.s2) d60Var.f46284g0.get(i16)).f26401a));
                    }
                    w8Var2.a(false);
                }
                d60Var.V.setVisibility(8);
                z70Var.setVisibility(8);
                d60Var.g();
                d60Var.setParentWindow(N);
                d60Var.setCallback(new z5(y6Var, 1));
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        y6 y6Var = this.f53844b;
        ei.c cVar = y6Var.f53446e0;
        LongSparseArray longSparseArray = cVar.f10654c;
        s6 s6Var = new s6(0L);
        Iterator it = cVar.f10659j.iterator();
        while (it.hasNext()) {
            ei.b bVar = (ei.b) it.next();
            s6Var.a(bVar, bVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(bVar.f10647b);
            if (s6Var2 != null) {
                s6Var2.b(bVar);
                if (s6Var2.f51114c <= 0) {
                    longSparseArray.remove(bVar.f10647b);
                    cVar.f10653b.remove(s6Var2);
                }
                ArrayList e10 = cVar.e(bVar.d);
                if (e10 != null) {
                    e10.remove(bVar);
                }
            }
        }
        if (s6Var.f51114c > 0) {
            y6Var.o0(s6Var, null, null);
        }
        y6Var.f53446e0.d();
        j6 j6Var = y6Var.N;
        if (j6Var != null) {
            j6Var.d();
            y6Var.N.f(false);
        }
        y6Var.A0(true);
        y6Var.y0();
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}

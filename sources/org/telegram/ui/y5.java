package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
public final class y5 implements te.b, b60, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.dt0, org.telegram.ui.Components.cj0 {
    public final int f52091a;
    public final y6 f52092b;

    public y5(y6 y6Var, int i7) {
        this.f52091a = i7;
        this.f52092b = y6Var;
    }

    @Override
    public void F(float f10, int i7) {
        int i10 = this.f52091a;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        switch (this.f52091a) {
            case 0:
                y6 y6Var = this.f52092b;
                y6Var.z0();
                y6Var.fragmentView.invalidate();
                return;
            default:
                y6.a0(this.f52092b, f10);
                return;
        }
    }

    @Override
    public void a(int i7) {
        org.telegram.messenger.g0.b4(this.f52092b.f52108b);
    }

    @Override
    public int b() {
        return this.f52092b.R;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        y6 y6Var = this.f52092b;
        ArrayList arrayList = y6Var.f52116f0;
        if (y6Var.getParentActivity() != null && i7 >= 0 && i7 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i7);
            int i10 = 0;
            if (u6Var.f54440a == 11 && (view instanceof org.telegram.ui.Cells.c2)) {
                int i11 = u6Var.f50244f;
                if (i11 < 0) {
                    y6Var.L = !y6Var.L;
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
                        org.telegram.messenger.g0.G3(-3.0f, view, null);
                        return;
                    }
                }
                int i14 = u6Var.f50244f;
                boolean z9 = !zArr[i14];
                zArr[i14] = z9;
                ((org.telegram.ui.Cells.c2) view).c(z9, true);
                if (u6Var.f50246i) {
                    while (true) {
                        if (i10 >= y6Var.f52108b.getChildCount()) {
                            break;
                        }
                        View childAt = y6Var.f52108b.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.c2) {
                            y6Var.f52108b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u6) arrayList.get(R)).f50244f < 0) {
                                ((org.telegram.ui.Cells.c2) childAt).c(y6Var.t0(), true);
                                break;
                            }
                        }
                        i10++;
                    }
                }
                y6Var.y0();
            } else if (u6Var.f50242c >= 0) {
                e60 e60Var = new e60(view.getContext(), y6Var);
                org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.v4.N(y6Var, e60Var, view, f10, f11);
                int i15 = ((u6) arrayList.get(i7)).f50242c;
                e60Var.f45210c0 = i15;
                FrameLayout frameLayout = e60Var.f45215h0;
                org.telegram.ui.ActionBar.z0 z0Var = e60Var.V;
                org.telegram.ui.ActionBar.z0 z0Var2 = e60Var.W;
                org.telegram.ui.Components.w70 w70Var = e60Var.T;
                d60 d60Var = e60Var.f45209b0;
                if (i15 == 3) {
                    z0Var2.setVisibility(0);
                    z0Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    d60Var.setVisibility(8);
                    w70Var.setVisibility(8);
                } else {
                    z0Var2.setVisibility(8);
                    z0Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    d60Var.setVisibility(0);
                    w70Var.setVisibility(0);
                }
                ArrayList d = e60Var.f45211d0.d(i15);
                e60Var.f45213f0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.f2 f2Var = e60Var.f45214g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.k5 k5Var = d60Var.f44965a;
                    org.telegram.ui.Components.z8 z8Var = d60Var.f44966b;
                    k5Var.l(org.telegram.messenger.hd.M0(2131754475, null), false);
                    d60Var.f44965a.setRightPadding(org.telegram.messenger.g0.L(8.0f));
                    z8Var.b(0, f2Var.getCurrentAccount(), null);
                    z8Var.b(1, f2Var.getCurrentAccount(), null);
                    z8Var.b(2, f2Var.getCurrentAccount(), null);
                    z8Var.a(false);
                } else {
                    int min = Math.min(3, e60Var.f45213f0.size());
                    org.telegram.ui.ActionBar.k5 k5Var2 = d60Var.f44965a;
                    org.telegram.ui.Components.z8 z8Var2 = d60Var.f44966b;
                    k5Var2.setRightPadding(org.telegram.messenger.g0.L((Math.max(0, min - 1) * 12) + 64));
                    d60Var.f44965a.l(org.telegram.messenger.hd.G(e60Var.f45213f0.size(), "ExceptionShort", Integer.valueOf(e60Var.f45213f0.size())), false);
                    for (int i16 = 0; i16 < min; i16++) {
                        z8Var2.b(i16, f2Var.getCurrentAccount(), f2Var.getMessagesController().e2(((org.telegram.messenger.s2) e60Var.f45213f0.get(i16)).f25403a));
                    }
                    z8Var2.a(false);
                }
                e60Var.U.setVisibility(8);
                w70Var.setVisibility(8);
                e60Var.g();
                e60Var.setParentWindow(N);
                e60Var.setCallback(new y5(y6Var, 1));
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        y6 y6Var = this.f52092b;
        ci.c cVar = y6Var.f52112d0;
        LongSparseArray longSparseArray = cVar.f6425c;
        s6 s6Var = new s6(0L);
        Iterator it = cVar.f6430j.iterator();
        while (it.hasNext()) {
            ci.b bVar = (ci.b) it.next();
            s6Var.a(bVar, bVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(bVar.f6418b);
            if (s6Var2 != null) {
                s6Var2.b(bVar);
                if (s6Var2.f49663c <= 0) {
                    longSparseArray.remove(bVar.f6418b);
                    cVar.f6424b.remove(s6Var2);
                }
                ArrayList e10 = cVar.e(bVar.d);
                if (e10 != null) {
                    e10.remove(bVar);
                }
            }
        }
        if (s6Var.f49663c > 0) {
            y6Var.o0(s6Var, null, null);
        }
        y6Var.f52112d0.d();
        i6 i6Var = y6Var.M;
        if (i6Var != null) {
            i6Var.d();
            y6Var.M.f(false);
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

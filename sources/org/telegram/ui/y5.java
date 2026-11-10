package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
public final class y5 implements te.b, e60, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.et0, org.telegram.ui.Components.cj0 {
    public final int f51895a;
    public final y6 f51896b;

    public y5(y6 y6Var, int i7) {
        this.f51895a = i7;
        this.f51896b = y6Var;
    }

    @Override
    public void F(float f10, int i7) {
        int i10 = this.f51895a;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        switch (this.f51895a) {
            case 0:
                y6 y6Var = this.f51896b;
                y6Var.z0();
                y6Var.fragmentView.invalidate();
                return;
            default:
                y6.a0(this.f51896b, f10);
                return;
        }
    }

    @Override
    public void a(int i7) {
        org.telegram.messenger.g0.b4(this.f51896b.f51911b);
    }

    @Override
    public int b() {
        return this.f51896b.R;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        y6 y6Var = this.f51896b;
        ArrayList arrayList = y6Var.f51919f0;
        if (y6Var.getParentActivity() != null && i7 >= 0 && i7 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i7);
            int i10 = 0;
            if (u6Var.f54543a == 11 && (view instanceof org.telegram.ui.Cells.c2)) {
                int i11 = u6Var.f50415f;
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
                int i14 = u6Var.f50415f;
                boolean z9 = !zArr[i14];
                zArr[i14] = z9;
                ((org.telegram.ui.Cells.c2) view).c(z9, true);
                if (u6Var.f50417i) {
                    while (true) {
                        if (i10 >= y6Var.f51911b.getChildCount()) {
                            break;
                        }
                        View childAt = y6Var.f51911b.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.c2) {
                            y6Var.f51911b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u6) arrayList.get(R)).f50415f < 0) {
                                ((org.telegram.ui.Cells.c2) childAt).c(y6Var.t0(), true);
                                break;
                            }
                        }
                        i10++;
                    }
                }
                y6Var.y0();
            } else if (u6Var.f50413c >= 0) {
                h60 h60Var = new h60(view.getContext(), y6Var);
                org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.u4.N(y6Var, h60Var, view, f10, f11);
                int i15 = ((u6) arrayList.get(i7)).f50413c;
                h60Var.f46226c0 = i15;
                FrameLayout frameLayout = h60Var.f46231h0;
                org.telegram.ui.ActionBar.z0 z0Var = h60Var.V;
                org.telegram.ui.ActionBar.z0 z0Var2 = h60Var.W;
                org.telegram.ui.Components.w70 w70Var = h60Var.T;
                g60 g60Var = h60Var.f46225b0;
                if (i15 == 3) {
                    z0Var2.setVisibility(0);
                    z0Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    g60Var.setVisibility(8);
                    w70Var.setVisibility(8);
                } else {
                    z0Var2.setVisibility(8);
                    z0Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    g60Var.setVisibility(0);
                    w70Var.setVisibility(0);
                }
                ArrayList d = h60Var.f46227d0.d(i15);
                h60Var.f46229f0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.f2 f2Var = h60Var.f46230g0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.m5 m5Var = g60Var.f45992a;
                    org.telegram.ui.Components.y8 y8Var = g60Var.f45993b;
                    m5Var.l(org.telegram.messenger.id.M0(2131754475, null), false);
                    g60Var.f45992a.setRightPadding(org.telegram.messenger.g0.L(8.0f));
                    y8Var.b(0, f2Var.getCurrentAccount(), null);
                    y8Var.b(1, f2Var.getCurrentAccount(), null);
                    y8Var.b(2, f2Var.getCurrentAccount(), null);
                    y8Var.a(false);
                } else {
                    int min = Math.min(3, h60Var.f46229f0.size());
                    org.telegram.ui.ActionBar.m5 m5Var2 = g60Var.f45992a;
                    org.telegram.ui.Components.y8 y8Var2 = g60Var.f45993b;
                    m5Var2.setRightPadding(org.telegram.messenger.g0.L((Math.max(0, min - 1) * 12) + 64));
                    g60Var.f45992a.l(org.telegram.messenger.id.G(h60Var.f46229f0.size(), "ExceptionShort", Integer.valueOf(h60Var.f46229f0.size())), false);
                    for (int i16 = 0; i16 < min; i16++) {
                        y8Var2.b(i16, f2Var.getCurrentAccount(), f2Var.getMessagesController().e2(((org.telegram.messenger.s2) h60Var.f46229f0.get(i16)).f25411a));
                    }
                    y8Var2.a(false);
                }
                h60Var.U.setVisibility(8);
                w70Var.setVisibility(8);
                h60Var.g();
                h60Var.setParentWindow(N);
                h60Var.setCallback(new y5(y6Var, 1));
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        y6 y6Var = this.f51896b;
        ci.c cVar = y6Var.f51915d0;
        LongSparseArray longSparseArray = cVar.f6428c;
        s6 s6Var = new s6(0L);
        Iterator it = cVar.f6433j.iterator();
        while (it.hasNext()) {
            ci.b bVar = (ci.b) it.next();
            s6Var.a(bVar, bVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(bVar.f6421b);
            if (s6Var2 != null) {
                s6Var2.b(bVar);
                if (s6Var2.f49686c <= 0) {
                    longSparseArray.remove(bVar.f6421b);
                    cVar.f6427b.remove(s6Var2);
                }
                ArrayList e10 = cVar.e(bVar.d);
                if (e10 != null) {
                    e10.remove(bVar);
                }
            }
        }
        if (s6Var.f49686c > 0) {
            y6Var.o0(s6Var, null, null);
        }
        y6Var.f51915d0.d();
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

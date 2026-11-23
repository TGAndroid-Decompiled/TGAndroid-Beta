package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
public final class z5 implements te.b, c60, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.ot0, org.telegram.ui.Components.rj0 {
    public final int f54526a;
    public final y6 f54527b;

    public z5(y6 y6Var, int i7) {
        this.f54526a = i7;
        this.f54527b = y6Var;
    }

    @Override
    public void G(float f10, int i7) {
        int i10 = this.f54526a;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        switch (this.f54526a) {
            case 0:
                y6 y6Var = this.f54527b;
                y6Var.z0();
                y6Var.fragmentView.invalidate();
                return;
            default:
                y6.a0(this.f54527b, f10);
                return;
        }
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void a(int i7) {
        org.telegram.messenger.g0.Z3(this.f54527b.f54242b);
    }

    @Override
    public int b() {
        return this.f54527b.S;
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        y6 y6Var = this.f54527b;
        ArrayList arrayList = y6Var.f54251g0;
        if (y6Var.getParentActivity() != null && i7 >= 0 && i7 < arrayList.size()) {
            u6 u6Var = (u6) arrayList.get(i7);
            int i10 = 0;
            if (u6Var.f56712a == 11 && (view instanceof org.telegram.ui.Cells.d2)) {
                int i11 = u6Var.f52546f;
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
                        org.telegram.messenger.q2.APP_ERROR.a();
                        org.telegram.messenger.g0.E3(-3.0f, view, null);
                        return;
                    }
                }
                int i14 = u6Var.f52546f;
                boolean z10 = !zArr[i14];
                zArr[i14] = z10;
                ((org.telegram.ui.Cells.d2) view).c(z10, true);
                if (u6Var.f52548i) {
                    while (true) {
                        if (i10 >= y6Var.f54242b.getChildCount()) {
                            break;
                        }
                        View childAt = y6Var.f54242b.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            y6Var.f54242b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((u6) arrayList.get(R)).f52546f < 0) {
                                ((org.telegram.ui.Cells.d2) childAt).c(y6Var.t0(), true);
                                break;
                            }
                        }
                        i10++;
                    }
                }
                y6Var.y0();
            } else if (u6Var.f52544c >= 0) {
                f60 f60Var = new f60(view.getContext(), y6Var);
                org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.b5.N(y6Var, f60Var, view, f10, f11);
                int i15 = ((u6) arrayList.get(i7)).f52544c;
                f60Var.f47696d0 = i15;
                FrameLayout frameLayout = f60Var.f47701i0;
                org.telegram.ui.ActionBar.y0 y0Var = f60Var.W;
                org.telegram.ui.ActionBar.y0 y0Var2 = f60Var.f47693a0;
                org.telegram.ui.Components.j80 j80Var = f60Var.U;
                e60 e60Var = f60Var.f47695c0;
                if (i15 == 3) {
                    y0Var2.setVisibility(0);
                    y0Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    e60Var.setVisibility(8);
                    j80Var.setVisibility(8);
                } else {
                    y0Var2.setVisibility(8);
                    y0Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    e60Var.setVisibility(0);
                    j80Var.setVisibility(0);
                }
                ArrayList d = f60Var.f47697e0.d(i15);
                f60Var.f47699g0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.g2 g2Var = f60Var.f47700h0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.n5 n5Var = e60Var.f47455a;
                    org.telegram.ui.Components.d9 d9Var = e60Var.f47456b;
                    n5Var.l(org.telegram.messenger.gd.N0(2131754472, null), false);
                    e60Var.f47455a.setRightPadding(org.telegram.messenger.g0.L(8.0f));
                    d9Var.b(0, g2Var.getCurrentAccount(), null);
                    d9Var.b(1, g2Var.getCurrentAccount(), null);
                    d9Var.b(2, g2Var.getCurrentAccount(), null);
                    d9Var.a(false);
                } else {
                    int min = Math.min(3, f60Var.f47699g0.size());
                    org.telegram.ui.ActionBar.n5 n5Var2 = e60Var.f47455a;
                    org.telegram.ui.Components.d9 d9Var2 = e60Var.f47456b;
                    n5Var2.setRightPadding(org.telegram.messenger.g0.L((Math.max(0, min - 1) * 12) + 64));
                    e60Var.f47455a.l(org.telegram.messenger.gd.G(f60Var.f47699g0.size(), "ExceptionShort", Integer.valueOf(f60Var.f47699g0.size())), false);
                    for (int i16 = 0; i16 < min; i16++) {
                        d9Var2.b(i16, g2Var.getCurrentAccount(), g2Var.getMessagesController().g2(((org.telegram.messenger.t2) f60Var.f47699g0.get(i16)).f27031a));
                    }
                    d9Var2.a(false);
                }
                f60Var.V.setVisibility(8);
                j80Var.setVisibility(8);
                f60Var.g();
                f60Var.setParentWindow(N);
                f60Var.setCallback(new z5(y6Var, 1));
            }
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        y6 y6Var = this.f54527b;
        ei.c cVar = y6Var.f54248e0;
        LongSparseArray longSparseArray = cVar.f10964c;
        s6 s6Var = new s6(0L);
        Iterator it = cVar.f10969j.iterator();
        while (it.hasNext()) {
            ei.b bVar = (ei.b) it.next();
            s6Var.a(bVar, bVar.d);
            s6 s6Var2 = (s6) longSparseArray.get(bVar.f10957b);
            if (s6Var2 != null) {
                s6Var2.b(bVar);
                if (s6Var2.f51982c <= 0) {
                    longSparseArray.remove(bVar.f10957b);
                    cVar.f10963b.remove(s6Var2);
                }
                ArrayList e10 = cVar.e(bVar.d);
                if (e10 != null) {
                    e10.remove(bVar);
                }
            }
        }
        if (s6Var.f51982c > 0) {
            y6Var.o0(s6Var, null, null);
        }
        y6Var.f54248e0.d();
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
    public void f0(View view, float f10, float f11) {
    }
}

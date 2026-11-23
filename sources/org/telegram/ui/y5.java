package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
public final class y5 implements te.b, c60, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.pt0, org.telegram.ui.Components.rj0 {
    public final int f54031a;
    public final x6 f54032b;

    public y5(x6 x6Var, int i7) {
        this.f54031a = i7;
        this.f54032b = x6Var;
    }

    @Override
    public void D(float f10, int i7) {
        int i10 = this.f54031a;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.f54031a) {
            case 0:
                x6 x6Var = this.f54032b;
                x6Var.z0();
                x6Var.fragmentView.invalidate();
                return;
            default:
                x6.a0(this.f54032b, f10);
                return;
        }
    }

    @Override
    public void a(int i7) {
        org.telegram.messenger.g0.Z3(this.f54032b.f53572b);
    }

    @Override
    public int b() {
        return this.f54032b.S;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        x6 x6Var = this.f54032b;
        ArrayList arrayList = x6Var.f53581g0;
        if (x6Var.getParentActivity() != null && i7 >= 0 && i7 < arrayList.size()) {
            t6 t6Var = (t6) arrayList.get(i7);
            int i10 = 0;
            if (t6Var.f56599a == 11 && (view instanceof org.telegram.ui.Cells.d2)) {
                int i11 = t6Var.f52184f;
                if (i11 < 0) {
                    x6Var.M = !x6Var.M;
                    x6Var.A0(true);
                    x6Var.y0();
                    return;
                }
                boolean[] zArr = x6Var.d;
                if (i11 < 0) {
                    x6Var.x0(view);
                    return;
                }
                if (zArr[i11]) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < 10; i13++) {
                        if (zArr[i13] && x6Var.w0(i13) > 0) {
                            i12++;
                        }
                    }
                    if (i12 <= 1) {
                        org.telegram.messenger.q2.APP_ERROR.a();
                        org.telegram.messenger.g0.E3(-3.0f, view, null);
                        return;
                    }
                }
                int i14 = t6Var.f52184f;
                boolean z10 = !zArr[i14];
                zArr[i14] = z10;
                ((org.telegram.ui.Cells.d2) view).c(z10, true);
                if (t6Var.f52186i) {
                    while (true) {
                        if (i10 >= x6Var.f53572b.getChildCount()) {
                            break;
                        }
                        View childAt = x6Var.f53572b.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            x6Var.f53572b.getClass();
                            int R = RecyclerView.R(childAt);
                            if (R >= 0 && R < arrayList.size() && ((t6) arrayList.get(R)).f52184f < 0) {
                                ((org.telegram.ui.Cells.d2) childAt).c(x6Var.t0(), true);
                                break;
                            }
                        }
                        i10++;
                    }
                }
                x6Var.y0();
            } else if (t6Var.f52182c >= 0) {
                f60 f60Var = new f60(view.getContext(), x6Var);
                org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.c5.N(x6Var, f60Var, view, f10, f11);
                int i15 = ((t6) arrayList.get(i7)).f52182c;
                f60Var.f47574d0 = i15;
                FrameLayout frameLayout = f60Var.f47579i0;
                org.telegram.ui.ActionBar.y0 y0Var = f60Var.W;
                org.telegram.ui.ActionBar.y0 y0Var2 = f60Var.f47571a0;
                org.telegram.ui.Components.m80 m80Var = f60Var.U;
                e60 e60Var = f60Var.f47573c0;
                if (i15 == 3) {
                    y0Var2.setVisibility(0);
                    y0Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    e60Var.setVisibility(8);
                    m80Var.setVisibility(8);
                } else {
                    y0Var2.setVisibility(8);
                    y0Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    e60Var.setVisibility(0);
                    m80Var.setVisibility(0);
                }
                ArrayList d = f60Var.f47575e0.d(i15);
                f60Var.f47577g0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.g2 g2Var = f60Var.f47578h0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.m5 m5Var = e60Var.f47113a;
                    org.telegram.ui.Components.e9 e9Var = e60Var.f47114b;
                    m5Var.l(org.telegram.messenger.hd.N0(2131754472, null), false);
                    e60Var.f47113a.setRightPadding(org.telegram.messenger.g0.L(8.0f));
                    e9Var.b(0, g2Var.getCurrentAccount(), null);
                    e9Var.b(1, g2Var.getCurrentAccount(), null);
                    e9Var.b(2, g2Var.getCurrentAccount(), null);
                    e9Var.a(false);
                } else {
                    int min = Math.min(3, f60Var.f47577g0.size());
                    org.telegram.ui.ActionBar.m5 m5Var2 = e60Var.f47113a;
                    org.telegram.ui.Components.e9 e9Var2 = e60Var.f47114b;
                    m5Var2.setRightPadding(org.telegram.messenger.g0.L((Math.max(0, min - 1) * 12) + 64));
                    e60Var.f47113a.l(org.telegram.messenger.hd.G(f60Var.f47577g0.size(), "ExceptionShort", Integer.valueOf(f60Var.f47577g0.size())), false);
                    for (int i16 = 0; i16 < min; i16++) {
                        e9Var2.b(i16, g2Var.getCurrentAccount(), g2Var.getMessagesController().g2(((org.telegram.messenger.t2) f60Var.f47577g0.get(i16)).f26911a));
                    }
                    e9Var2.a(false);
                }
                f60Var.V.setVisibility(8);
                m80Var.setVisibility(8);
                f60Var.g();
                f60Var.setParentWindow(N);
                f60Var.setCallback(new y5(x6Var, 1));
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        x6 x6Var = this.f54032b;
        ei.c cVar = x6Var.f53578e0;
        LongSparseArray longSparseArray = cVar.f10966c;
        r6 r6Var = new r6(0L);
        Iterator it = cVar.f10971j.iterator();
        while (it.hasNext()) {
            ei.b bVar = (ei.b) it.next();
            r6Var.a(bVar, bVar.d);
            r6 r6Var2 = (r6) longSparseArray.get(bVar.f10959b);
            if (r6Var2 != null) {
                r6Var2.b(bVar);
                if (r6Var2.f51497c <= 0) {
                    longSparseArray.remove(bVar.f10959b);
                    cVar.f10965b.remove(r6Var2);
                }
                ArrayList e10 = cVar.e(bVar.d);
                if (e10 != null) {
                    e10.remove(bVar);
                }
            }
        }
        if (r6Var.f51497c > 0) {
            x6Var.o0(r6Var, null, null);
        }
        x6Var.f53578e0.d();
        i6 i6Var = x6Var.N;
        if (i6Var != null) {
            i6Var.d();
            x6Var.N.f(false);
        }
        x6Var.A0(true);
        x6Var.y0();
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}

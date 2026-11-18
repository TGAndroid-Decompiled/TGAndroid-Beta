package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
public final class y5 implements te.b, c60, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.mt0, org.telegram.ui.Components.pj0 {
    public final int f54006a;
    public final x6 f54007b;

    public y5(x6 x6Var, int i7) {
        this.f54006a = i7;
        this.f54007b = x6Var;
    }

    @Override
    public void D(float f10, int i7) {
        int i10 = this.f54006a;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.f54006a) {
            case 0:
                x6 x6Var = this.f54007b;
                x6Var.z0();
                x6Var.fragmentView.invalidate();
                return;
            default:
                x6.a0(this.f54007b, f10);
                return;
        }
    }

    @Override
    public void a(int i7) {
        org.telegram.messenger.g0.Z3(this.f54007b.f53605b);
    }

    @Override
    public int b() {
        return this.f54007b.S;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        x6 x6Var = this.f54007b;
        ArrayList arrayList = x6Var.f53614g0;
        if (x6Var.getParentActivity() != null && i7 >= 0 && i7 < arrayList.size()) {
            t6 t6Var = (t6) arrayList.get(i7);
            int i10 = 0;
            if (t6Var.f56589a == 11 && (view instanceof org.telegram.ui.Cells.d2)) {
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
                        if (i10 >= x6Var.f53605b.getChildCount()) {
                            break;
                        }
                        View childAt = x6Var.f53605b.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            x6Var.f53605b.getClass();
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
                org.telegram.ui.ActionBar.h1 N = org.telegram.ui.Components.b5.N(x6Var, f60Var, view, f10, f11);
                int i15 = ((t6) arrayList.get(i7)).f52182c;
                f60Var.f47540d0 = i15;
                FrameLayout frameLayout = f60Var.f47545i0;
                org.telegram.ui.ActionBar.z0 z0Var = f60Var.W;
                org.telegram.ui.ActionBar.z0 z0Var2 = f60Var.f47537a0;
                org.telegram.ui.Components.k80 k80Var = f60Var.U;
                e60 e60Var = f60Var.f47539c0;
                if (i15 == 3) {
                    z0Var2.setVisibility(0);
                    z0Var.setVisibility(8);
                    frameLayout.setVisibility(8);
                    e60Var.setVisibility(8);
                    k80Var.setVisibility(8);
                } else {
                    z0Var2.setVisibility(8);
                    z0Var.setVisibility(0);
                    frameLayout.setVisibility(0);
                    e60Var.setVisibility(0);
                    k80Var.setVisibility(0);
                }
                ArrayList d = f60Var.f47541e0.d(i15);
                f60Var.f47543g0 = d;
                boolean isEmpty = d.isEmpty();
                org.telegram.ui.ActionBar.h2 h2Var = f60Var.f47544h0;
                if (isEmpty) {
                    org.telegram.ui.ActionBar.n5 n5Var = e60Var.f47071a;
                    org.telegram.ui.Components.e9 e9Var = e60Var.f47072b;
                    n5Var.l(org.telegram.messenger.gd.M0(2131754473, null), false);
                    e60Var.f47071a.setRightPadding(org.telegram.messenger.g0.L(8.0f));
                    e9Var.b(0, h2Var.getCurrentAccount(), null);
                    e9Var.b(1, h2Var.getCurrentAccount(), null);
                    e9Var.b(2, h2Var.getCurrentAccount(), null);
                    e9Var.a(false);
                } else {
                    int min = Math.min(3, f60Var.f47543g0.size());
                    org.telegram.ui.ActionBar.n5 n5Var2 = e60Var.f47071a;
                    org.telegram.ui.Components.e9 e9Var2 = e60Var.f47072b;
                    n5Var2.setRightPadding(org.telegram.messenger.g0.L((Math.max(0, min - 1) * 12) + 64));
                    e60Var.f47071a.l(org.telegram.messenger.gd.G(f60Var.f47543g0.size(), "ExceptionShort", Integer.valueOf(f60Var.f47543g0.size())), false);
                    for (int i16 = 0; i16 < min; i16++) {
                        e9Var2.b(i16, h2Var.getCurrentAccount(), h2Var.getMessagesController().g2(((org.telegram.messenger.t2) f60Var.f47543g0.get(i16)).f26932a));
                    }
                    e9Var2.a(false);
                }
                f60Var.V.setVisibility(8);
                k80Var.setVisibility(8);
                f60Var.g();
                f60Var.setParentWindow(N);
                f60Var.setCallback(new y5(x6Var, 1));
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        x6 x6Var = this.f54007b;
        ei.c cVar = x6Var.f53611e0;
        LongSparseArray longSparseArray = cVar.f10971c;
        r6 r6Var = new r6(0L);
        Iterator it = cVar.f10976j.iterator();
        while (it.hasNext()) {
            ei.b bVar = (ei.b) it.next();
            r6Var.a(bVar, bVar.d);
            r6 r6Var2 = (r6) longSparseArray.get(bVar.f10964b);
            if (r6Var2 != null) {
                r6Var2.b(bVar);
                if (r6Var2.f51473c <= 0) {
                    longSparseArray.remove(bVar.f10964b);
                    cVar.f10970b.remove(r6Var2);
                }
                ArrayList e10 = cVar.e(bVar.d);
                if (e10 != null) {
                    e10.remove(bVar);
                }
            }
        }
        if (r6Var.f51473c > 0) {
            x6Var.o0(r6Var, null, null);
        }
        x6Var.f53611e0.d();
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

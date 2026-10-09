package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class yw extends s4.t0 {
    public boolean f44416a;
    public final sy f44417b;
    public final my f44418c;
    public final ty d;

    public yw(ty tyVar, sy syVar, my myVar) {
        this.d = tyVar;
        this.f44417b = syVar;
        this.f44418c = myVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        ty tyVar = this.d;
        if (i10 == 1) {
            this.f44416a = true;
            tyVar.f42169d3 = true;
            a5.a aVar = tyVar.f42172e0[0].f41789b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f300c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f300c).cancel();
                aVar.f300c = null;
            }
            if (tyVar.X.f30614r.getText().length() == 0 && tyVar.X.f30614r.hasFocus()) {
                AndroidUtilities.hideKeyboard(tyVar.X.f30614r);
                tyVar.X.f30614r.clearFocus();
            }
        } else {
            tyVar.f42169d3 = false;
        }
        if (i10 == 0) {
            this.f44416a = false;
            tyVar.f42174e2 = false;
            boolean z10 = tyVar.f42156b1;
            sy syVar = this.f44417b;
            if (z10) {
                tyVar.f42156b1 = false;
                if (tyVar.f42167d1) {
                    py pyVar = syVar.f41788a;
                    int i11 = py.f40911t3;
                    pyVar.B1();
                    tyVar.f42167d1 = false;
                }
                syVar.d.l();
            }
            ty.o1(tyVar, syVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        py pyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        Object[] objArr;
        this.f44418c.X();
        sy syVar = this.f44417b;
        uw uwVar = syVar.f41797x;
        int i14 = -i11;
        ArrayList arrayList = uwVar.f30508x;
        ArrayList arrayList2 = uwVar.f30500o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.d1) arrayList2.get(i15)).f47656a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.d1) arrayList.get(i16)).f47656a;
                view2.setTranslationY(view2.getTranslationY() + i14);
            }
        }
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
            int R = RecyclerView.R(recyclerView.getChildAt(i19));
            if (R >= 0) {
                if (i17 == -1 || R > i17) {
                    i17 = R;
                }
                if (i18 == -1 || R < i18) {
                    i18 = R;
                }
            }
        }
        ty tyVar = this.d;
        tyVar.o3(syVar);
        tyVar.Q = true;
        View view3 = tyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (tyVar.R0 != 10 && this.f44416a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.d1 K = recyclerView.K(i18);
            if (!tyVar.W3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f47656a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = tyVar.Y1;
                if (i20 == i18) {
                    int i21 = tyVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        objArr = null;
                        if (objArr != null && tyVar.a2 && (z10 || tyVar.f42169d3)) {
                            tyVar.Z3(z10);
                        }
                        tyVar.Y1 = i18;
                        tyVar.Z1 = i13;
                        tyVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    tyVar.Z3(z10);
                }
                tyVar.Y1 = i18;
                tyVar.Z1 = i13;
                tyVar.a2 = true;
            }
        }
        if (!tyVar.K && recyclerView == tyVar.f42172e0[0].f41788a && !tyVar.f42200j2) {
            kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                if (!kVar2.t() && !tyVar.f42174e2 && !tyVar.F3.c()) {
                    if (i11 > 0 && tyVar.W3() && tyVar.f42172e0[0].f41795s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    tyVar.Q = true;
                    View view4 = tyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (tyVar.fragmentView != null) {
            tyVar.j3();
        }
        nx nxVar = tyVar.F3;
        if (nxVar != null && nxVar.c() && (pyVar = syVar.f41788a) != null) {
            pyVar.invalidate();
        }
        kx kxVar = tyVar.E0;
        if (kxVar != null && kxVar.getPremiumHint() != null && tyVar.E0.getPremiumHint().V) {
            tyVar.E0.getPremiumHint().e(true);
        }
        ?? W3 = tyVar.W3();
        View childAt2 = syVar.f41788a.getChildAt(W3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        tyVar.f42171e.a((i18 > W3 || (i12 - tyVar.N) + AndroidUtilities.dp(5.0f) < syVar.f41788a.getPaddingTop()) ? true : true, true);
        if (i11 != 0 && (hVar = tyVar.f42206k4) != null && Build.VERSION.SDK_INT >= 31) {
            hVar.f(i10, i11);
        }
    }
}

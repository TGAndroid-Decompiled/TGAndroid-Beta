package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class vw extends s4.s0 {
    public boolean f38718a;
    public final sy f38719b;
    public final my f38720c;
    public final ty d;

    public vw(ty tyVar, sy syVar, my myVar) {
        this.d = tyVar;
        this.f38719b = syVar;
        this.f38720c = myVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        ty tyVar = this.d;
        if (i10 == 1) {
            this.f38718a = true;
            tyVar.f37974d3 = true;
            a5.a aVar = tyVar.f37976e0[0].f37594b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f278c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f278c).cancel();
                aVar.f278c = null;
            }
            if (tyVar.X.f23850r.getText().length() == 0 && tyVar.X.f23850r.hasFocus()) {
                AndroidUtilities.hideKeyboard(tyVar.X.f23850r);
                tyVar.X.f23850r.clearFocus();
            }
        } else {
            tyVar.f37974d3 = false;
        }
        if (i10 == 0) {
            this.f38718a = false;
            tyVar.f37978e2 = false;
            boolean z10 = tyVar.f37961b1;
            sy syVar = this.f38719b;
            if (z10) {
                tyVar.f37961b1 = false;
                if (tyVar.f37972d1) {
                    py pyVar = syVar.f37593a;
                    int i11 = py.f36563v3;
                    pyVar.B1();
                    tyVar.f37972d1 = false;
                }
                syVar.d.l();
            }
            ty.v1(tyVar, syVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.i iVar;
        py pyVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View childAt;
        int i13;
        boolean z10;
        boolean z11;
        this.f38720c.X();
        sy syVar = this.f38719b;
        rw rwVar = syVar.f37601x;
        int i14 = -i11;
        ArrayList arrayList = rwVar.f23404x;
        ArrayList arrayList2 = rwVar.f23396o;
        boolean z12 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.c1) arrayList2.get(i15)).f43005a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.c1) arrayList.get(i16)).f43005a;
                view2.setTranslationY(view2.getTranslationY() + i14);
            }
        }
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
            int S = RecyclerView.S(recyclerView.getChildAt(i19));
            if (S >= 0) {
                if (i17 == -1 || S > i17) {
                    i17 = S;
                }
                if (i18 == -1 || S < i18) {
                    i18 = S;
                }
            }
        }
        ty tyVar = this.d;
        tyVar.A3(syVar);
        tyVar.Q = true;
        View view3 = tyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (tyVar.R0 != 10 && this.f38718a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.c1 L = recyclerView.L(i18);
            if (!tyVar.i4() || (L != null && L.b() >= 0)) {
                if (L != null) {
                    i13 = L.f43005a.getTop();
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
                        z11 = false;
                        if (z11 && tyVar.a2 && (z10 || tyVar.f37974d3)) {
                            tyVar.l4(z10);
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
                z11 = true;
                if (z11) {
                    tyVar.l4(z10);
                }
                tyVar.Y1 = i18;
                tyVar.Z1 = i13;
                tyVar.a2 = true;
            }
        }
        if (!tyVar.K && recyclerView == tyVar.f37976e0[0].f37593a && !tyVar.f38004j2) {
            lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                if (!lVar2.t() && !tyVar.f37978e2 && !tyVar.F3.c()) {
                    if (i11 > 0 && tyVar.i4() && tyVar.f37976e0[0].f37599s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.U(childAt).b() == 0) {
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
        kx kxVar = tyVar.F3;
        if (kxVar != null && kxVar.c() && (pyVar = syVar.f37593a) != null) {
            pyVar.invalidate();
        }
        hx hxVar = tyVar.E0;
        if (hxVar != null && hxVar.getPremiumHint() != null && tyVar.E0.getPremiumHint().V) {
            tyVar.E0.getPremiumHint().e(true);
        }
        ?? i42 = tyVar.i4();
        View childAt2 = syVar.f37593a.getChildAt(i42 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        tyVar.e.a((i18 > i42 || (((float) i12) - tyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) syVar.f37593a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (iVar = tyVar.f38005j4) != null && Build.VERSION.SDK_INT >= 31) {
            iVar.f(i10, i11);
        }
    }
}

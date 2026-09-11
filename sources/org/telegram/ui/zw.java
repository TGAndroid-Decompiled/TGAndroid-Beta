package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class zw extends s4.s0 {
    public boolean f43563a;
    public final ty f43564b;
    public final ny f43565c;
    public final uy d;

    public zw(uy uyVar, ty tyVar, ny nyVar) {
        this.d = uyVar;
        this.f43564b = tyVar;
        this.f43565c = nyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        uy uyVar = this.d;
        if (i10 == 1) {
            this.f43563a = true;
            uyVar.f41256d3 = true;
            a5.a aVar = uyVar.f41259e0[0].f40859b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f286c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f286c).cancel();
                aVar.f286c = null;
            }
            if (uyVar.X.f24522r.getText().length() == 0 && uyVar.X.f24522r.hasFocus()) {
                AndroidUtilities.hideKeyboard(uyVar.X.f24522r);
                uyVar.X.f24522r.clearFocus();
            }
        } else {
            uyVar.f41256d3 = false;
        }
        if (i10 == 0) {
            this.f43563a = false;
            uyVar.f41261e2 = false;
            boolean z10 = uyVar.f41243b1;
            ty tyVar = this.f43564b;
            if (z10) {
                uyVar.f41243b1 = false;
                if (uyVar.f41254d1) {
                    qy qyVar = tyVar.f40858a;
                    int i11 = qy.f39998v3;
                    qyVar.z1();
                    uyVar.f41254d1 = false;
                }
                tyVar.d.l();
            }
            uy.r1(uyVar, tyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        bh.f fVar;
        qy qyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        boolean z11;
        this.f43565c.X();
        ty tyVar = this.f43564b;
        vw vwVar = tyVar.f40867x;
        int i14 = -i11;
        ArrayList arrayList = vwVar.f33224x;
        ArrayList arrayList2 = vwVar.f33216o;
        boolean z12 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.c1) arrayList2.get(i15)).f45738a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.c1) arrayList.get(i16)).f45738a;
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
        uy uyVar = this.d;
        uyVar.r3(tyVar);
        uyVar.Q = true;
        View view3 = uyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (uyVar.R0 != 10 && this.f43563a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.c1 K = recyclerView.K(i18);
            if (!uyVar.Z3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f45738a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = uyVar.Y1;
                if (i20 == i18) {
                    int i21 = uyVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        z11 = false;
                        if (z11 && uyVar.a2 && (z10 || uyVar.f41256d3)) {
                            uyVar.c4(z10);
                        }
                        uyVar.Y1 = i18;
                        uyVar.Z1 = i13;
                        uyVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = true;
                if (z11) {
                    uyVar.c4(z10);
                }
                uyVar.Y1 = i18;
                uyVar.Z1 = i13;
                uyVar.a2 = true;
            }
        }
        if (!uyVar.K && recyclerView == uyVar.f41259e0[0].f40858a && !uyVar.f41287j2) {
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (!kVar2.s() && !uyVar.f41261e2 && !uyVar.F3.c()) {
                    if (i11 > 0 && uyVar.Z3() && uyVar.f41259e0[0].f40865s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    uyVar.Q = true;
                    View view4 = uyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (uyVar.fragmentView != null) {
            uyVar.m3();
        }
        ox oxVar = uyVar.F3;
        if (oxVar != null && oxVar.c() && (qyVar = tyVar.f40858a) != null) {
            qyVar.invalidate();
        }
        lx lxVar = uyVar.E0;
        if (lxVar != null && lxVar.getPremiumHint() != null && uyVar.E0.getPremiumHint().V) {
            uyVar.E0.getPremiumHint().e(true);
        }
        ?? Z3 = uyVar.Z3();
        View childAt2 = tyVar.f40858a.getChildAt(Z3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        uyVar.f41258e.a((i18 > Z3 || (((float) i12) - uyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) tyVar.f40858a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (fVar = uyVar.l4) != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(i10, i11);
        }
    }
}

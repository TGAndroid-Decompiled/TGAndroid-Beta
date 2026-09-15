package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class zw extends s4.s0 {
    public boolean f40320a;
    public final ty f40321b;
    public final ny f40322c;
    public final uy d;

    public zw(uy uyVar, ty tyVar, ny nyVar) {
        this.d = uyVar;
        this.f40321b = tyVar;
        this.f40322c = nyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        uy uyVar = this.d;
        if (i10 == 1) {
            this.f40320a = true;
            uyVar.f38205d3 = true;
            a5.a aVar = uyVar.f38207e0[0].f37804b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f276c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f276c).cancel();
                aVar.f276c = null;
            }
            if (uyVar.X.f22573r.getText().length() == 0 && uyVar.X.f22573r.hasFocus()) {
                AndroidUtilities.hideKeyboard(uyVar.X.f22573r);
                uyVar.X.f22573r.clearFocus();
            }
        } else {
            uyVar.f38205d3 = false;
        }
        if (i10 == 0) {
            this.f40320a = false;
            uyVar.f38209e2 = false;
            boolean z10 = uyVar.f38192b1;
            ty tyVar = this.f40321b;
            if (z10) {
                uyVar.f38192b1 = false;
                if (uyVar.f38203d1) {
                    qy qyVar = tyVar.f37803a;
                    int i11 = qy.f36955v3;
                    qyVar.A1();
                    uyVar.f38203d1 = false;
                }
                tyVar.d.l();
            }
            uy.r1(uyVar, tyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        qy qyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        boolean z11;
        this.f40322c.X();
        ty tyVar = this.f40321b;
        vw vwVar = tyVar.f37811x;
        int i14 = -i11;
        ArrayList arrayList = vwVar.f22480x;
        ArrayList arrayList2 = vwVar.f22472o;
        boolean z12 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.c1) arrayList2.get(i15)).f42675a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.c1) arrayList.get(i16)).f42675a;
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
        if (uyVar.R0 != 10 && this.f40320a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.c1 K = recyclerView.K(i18);
            if (!uyVar.Z3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f42675a.getTop();
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
                        if (z11 && uyVar.a2 && (z10 || uyVar.f38205d3)) {
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
        if (!uyVar.K && recyclerView == uyVar.f38207e0[0].f37803a && !uyVar.f38235j2) {
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (!kVar2.s() && !uyVar.f38209e2 && !uyVar.F3.c()) {
                    if (i11 > 0 && uyVar.Z3() && uyVar.f38207e0[0].f37809s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
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
        if (oxVar != null && oxVar.c() && (qyVar = tyVar.f37803a) != null) {
            qyVar.invalidate();
        }
        lx lxVar = uyVar.E0;
        if (lxVar != null && lxVar.getPremiumHint() != null && uyVar.E0.getPremiumHint().V) {
            uyVar.E0.getPremiumHint().e(true);
        }
        ?? Z3 = uyVar.Z3();
        View childAt2 = tyVar.f37803a.getChildAt(Z3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        uyVar.e.a((i18 > Z3 || (((float) i12) - uyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) tyVar.f37803a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (hVar = uyVar.l4) != null && Build.VERSION.SDK_INT >= 31) {
            hVar.f(i10, i11);
        }
    }
}

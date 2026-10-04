package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class xw extends s4.s0 {
    public boolean f42966a;
    public final ty f42967b;
    public final ny f42968c;
    public final uy d;

    public xw(uy uyVar, ty tyVar, ny nyVar) {
        this.d = uyVar;
        this.f42967b = tyVar;
        this.f42968c = nyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        uy uyVar = this.d;
        if (i10 == 1) {
            this.f42966a = true;
            uyVar.f41397d3 = true;
            a5.a aVar = uyVar.f41400e0[0].f40991b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f300c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f300c).cancel();
                aVar.f300c = null;
            }
            if (uyVar.X.f26252r.getText().length() == 0 && uyVar.X.f26252r.hasFocus()) {
                AndroidUtilities.hideKeyboard(uyVar.X.f26252r);
                uyVar.X.f26252r.clearFocus();
            }
        } else {
            uyVar.f41397d3 = false;
        }
        if (i10 == 0) {
            this.f42966a = false;
            uyVar.f41402e2 = false;
            boolean z10 = uyVar.f41384b1;
            ty tyVar = this.f42967b;
            if (z10) {
                uyVar.f41384b1 = false;
                if (uyVar.f41395d1) {
                    qy qyVar = tyVar.f40990a;
                    int i11 = qy.C3;
                    qyVar.C1();
                    uyVar.f41395d1 = false;
                }
                tyVar.d.l();
            }
            uy.v1(uyVar, tyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.i iVar;
        qy qyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        boolean z11;
        this.f42968c.X();
        ty tyVar = this.f42967b;
        tw twVar = tyVar.f40999x;
        int i14 = -i11;
        ArrayList arrayList = twVar.f25825x;
        ArrayList arrayList2 = twVar.f25817o;
        boolean z12 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.c1) arrayList2.get(i15)).f46531a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.c1) arrayList.get(i16)).f46531a;
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
        uyVar.A3(tyVar);
        uyVar.Q = true;
        View view3 = uyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (uyVar.R0 != 10 && this.f42966a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.c1 K = recyclerView.K(i18);
            if (!uyVar.i4() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f46531a.getTop();
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
                        if (z11 && uyVar.a2 && (z10 || uyVar.f41397d3)) {
                            uyVar.l4(z10);
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
                    uyVar.l4(z10);
                }
                uyVar.Y1 = i18;
                uyVar.Z1 = i13;
                uyVar.a2 = true;
            }
        }
        if (!uyVar.K && recyclerView == uyVar.f41400e0[0].f40990a && !uyVar.f41428j2) {
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (!kVar2.s() && !uyVar.f41402e2 && !uyVar.F3.c()) {
                    if (i11 > 0 && uyVar.i4() && uyVar.f41400e0[0].f40997s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
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
        mx mxVar = uyVar.F3;
        if (mxVar != null && mxVar.c() && (qyVar = tyVar.f40990a) != null) {
            qyVar.invalidate();
        }
        jx jxVar = uyVar.E0;
        if (jxVar != null && jxVar.getPremiumHint() != null && uyVar.E0.getPremiumHint().V) {
            uyVar.E0.getPremiumHint().e(true);
        }
        ?? i42 = uyVar.i4();
        View childAt2 = tyVar.f40990a.getChildAt(i42 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        uyVar.f41399e.a((i18 > i42 || (((float) i12) - uyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) tyVar.f40990a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (iVar = uyVar.f41429j4) != null && Build.VERSION.SDK_INT >= 31) {
            iVar.f(i10, i11);
        }
    }
}

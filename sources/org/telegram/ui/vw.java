package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class vw extends s4.s0 {
    public boolean f38823a;
    public final py f38824b;
    public final jy f38825c;
    public final qy d;

    public vw(qy qyVar, py pyVar, jy jyVar) {
        this.d = qyVar;
        this.f38824b = pyVar;
        this.f38825c = jyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        qy qyVar = this.d;
        if (i10 == 1) {
            this.f38823a = true;
            qyVar.f37019d3 = true;
            a5.a aVar = qyVar.f37021e0[0].f36680b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f278c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f278c).cancel();
                aVar.f278c = null;
            }
            if (qyVar.X.f23131r.getText().length() == 0 && qyVar.X.f23131r.hasFocus()) {
                AndroidUtilities.hideKeyboard(qyVar.X.f23131r);
                qyVar.X.f23131r.clearFocus();
            }
        } else {
            qyVar.f37019d3 = false;
        }
        if (i10 == 0) {
            this.f38823a = false;
            qyVar.f37023e2 = false;
            boolean z10 = qyVar.f37006b1;
            py pyVar = this.f38824b;
            if (z10) {
                qyVar.f37006b1 = false;
                if (qyVar.f37017d1) {
                    my myVar = pyVar.f36679a;
                    int i11 = my.f35672v3;
                    myVar.A1();
                    qyVar.f37017d1 = false;
                }
                pyVar.d.l();
            }
            qy.r1(qyVar, pyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        my myVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        boolean z11;
        this.f38825c.X();
        py pyVar = this.f38824b;
        rw rwVar = pyVar.f36687x;
        int i14 = -i11;
        ArrayList arrayList = rwVar.f23061x;
        ArrayList arrayList2 = rwVar.f23053o;
        boolean z12 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.c1) arrayList2.get(i15)).f42946a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.c1) arrayList.get(i16)).f42946a;
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
        qy qyVar = this.d;
        qyVar.r3(pyVar);
        qyVar.Q = true;
        View view3 = qyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (qyVar.R0 != 10 && this.f38823a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.c1 K = recyclerView.K(i18);
            if (!qyVar.Z3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f42946a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = qyVar.Y1;
                if (i20 == i18) {
                    int i21 = qyVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        z11 = false;
                        if (z11 && qyVar.a2 && (z10 || qyVar.f37019d3)) {
                            qyVar.c4(z10);
                        }
                        qyVar.Y1 = i18;
                        qyVar.Z1 = i13;
                        qyVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = true;
                if (z11) {
                    qyVar.c4(z10);
                }
                qyVar.Y1 = i18;
                qyVar.Z1 = i13;
                qyVar.a2 = true;
            }
        }
        if (!qyVar.K && recyclerView == qyVar.f37021e0[0].f36679a && !qyVar.f37049j2) {
            kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                if (!kVar2.s() && !qyVar.f37023e2 && !qyVar.F3.c()) {
                    if (i11 > 0 && qyVar.Z3() && qyVar.f37021e0[0].f36685s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    qyVar.Q = true;
                    View view4 = qyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (qyVar.fragmentView != null) {
            qyVar.m3();
        }
        kx kxVar = qyVar.F3;
        if (kxVar != null && kxVar.c() && (myVar = pyVar.f36679a) != null) {
            myVar.invalidate();
        }
        hx hxVar = qyVar.E0;
        if (hxVar != null && hxVar.getPremiumHint() != null && qyVar.E0.getPremiumHint().V) {
            qyVar.E0.getPremiumHint().e(true);
        }
        ?? Z3 = qyVar.Z3();
        View childAt2 = pyVar.f36679a.getChildAt(Z3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        qyVar.e.a((i18 > Z3 || (((float) i12) - qyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) pyVar.f36679a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (hVar = qyVar.f37055k4) != null && Build.VERSION.SDK_INT >= 31) {
            hVar.f(i10, i11);
        }
    }
}

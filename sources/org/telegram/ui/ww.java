package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ww extends f2.z0 {
    public boolean f39776a;
    public final py f39777b;
    public final jy f39778c;
    public final qy d;

    public ww(qy qyVar, py pyVar, jy jyVar) {
        this.d = qyVar;
        this.f39777b = pyVar;
        this.f39778c = jyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        qy qyVar = this.d;
        if (i10 == 1) {
            this.f39776a = true;
            qyVar.f37524a3 = true;
            b4.e0 e0Var = qyVar.f37527b0[0].f37247b;
            ValueAnimator valueAnimator = (ValueAnimator) e0Var.f1379c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) e0Var.f1379c).cancel();
                e0Var.f1379c = null;
            }
            if (qyVar.U.f24117r.getText().length() == 0 && qyVar.U.f24117r.hasFocus()) {
                AndroidUtilities.hideKeyboard(qyVar.U.f24117r);
                qyVar.U.f24117r.clearFocus();
            }
        } else {
            qyVar.f37524a3 = false;
        }
        if (i10 == 0) {
            this.f39776a = false;
            qyVar.f37529b2 = false;
            boolean z4 = qyVar.Y0;
            py pyVar = this.f39777b;
            if (z4) {
                qyVar.Y0 = false;
                if (qyVar.f37523a1) {
                    my myVar = pyVar.f37246a;
                    int i11 = my.f36270s3;
                    myVar.z1();
                    qyVar.f37523a1 = false;
                }
                pyVar.d.l();
            }
            qy.r1(qyVar, pyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ng.e eVar;
        my myVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z4;
        boolean z10;
        this.f39778c.X();
        py pyVar = this.f39777b;
        sw swVar = pyVar.f37254x;
        int i14 = -i11;
        ArrayList arrayList = swVar.f30707x;
        ArrayList arrayList2 = swVar.f30699o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((f2.l1) arrayList2.get(i15)).f5774a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((f2.l1) arrayList.get(i16)).f5774a;
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
        qyVar.N = true;
        View view3 = qyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (qyVar.O0 != 10 && this.f39776a && recyclerView.getChildCount() > 0 && i18 != -1) {
            f2.l1 K = recyclerView.K(i18);
            if (!qyVar.Z3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f5774a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = qyVar.V1;
                if (i20 == i18) {
                    int i21 = qyVar.W1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        z10 = false;
                        if (z10 && qyVar.X1 && (z4 || qyVar.f37524a3)) {
                            qyVar.c4(z4);
                        }
                        qyVar.V1 = i18;
                        qyVar.W1 = i13;
                        qyVar.X1 = true;
                    }
                } else if (i18 > i20) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z10 = true;
                if (z10) {
                    qyVar.c4(z4);
                }
                qyVar.V1 = i18;
                qyVar.W1 = i13;
                qyVar.X1 = true;
            }
        }
        if (!qyVar.H && recyclerView == qyVar.f37527b0[0].f37246a && !qyVar.f37555g2) {
            kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                if (!kVar2.s() && !qyVar.f37529b2 && !qyVar.C3.c()) {
                    if (i11 > 0 && qyVar.Z3() && qyVar.f37527b0[0].f37252s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    qyVar.N = true;
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
        lx lxVar = qyVar.C3;
        if (lxVar != null && lxVar.c() && (myVar = pyVar.f37246a) != null) {
            myVar.invalidate();
        }
        ix ixVar = qyVar.B0;
        if (ixVar != null && ixVar.getPremiumHint() != null && qyVar.B0.getPremiumHint().S) {
            qyVar.B0.getPremiumHint().e(true);
        }
        ?? Z3 = qyVar.Z3();
        View childAt2 = pyVar.f37246a.getChildAt(Z3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        qyVar.e.a((i18 > Z3 || (((float) i12) - qyVar.K) + ((float) AndroidUtilities.dp(5.0f)) < ((float) pyVar.f37246a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (eVar = qyVar.f37567i4) != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(i10, i11);
        }
    }
}

package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class vw extends f2.a1 {
    public boolean f42306a;
    public final oy f42307b;
    public final iy f42308c;
    public final py d;

    public vw(py pyVar, oy oyVar, iy iyVar) {
        this.d = pyVar;
        this.f42307b = oyVar;
        this.f42308c = iyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        py pyVar = this.d;
        if (i10 == 1) {
            this.f42306a = true;
            pyVar.f40182a3 = true;
            b4.e0 e0Var = pyVar.f40185b0[0].f39867b;
            ValueAnimator valueAnimator = (ValueAnimator) e0Var.f1475c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) e0Var.f1475c).cancel();
                e0Var.f1475c = null;
            }
            if (pyVar.U.f26172r.getText().length() == 0 && pyVar.U.f26172r.hasFocus()) {
                AndroidUtilities.hideKeyboard(pyVar.U.f26172r);
                pyVar.U.f26172r.clearFocus();
            }
        } else {
            pyVar.f40182a3 = false;
        }
        if (i10 == 0) {
            this.f42306a = false;
            pyVar.f40187b2 = false;
            boolean z4 = pyVar.Y0;
            oy oyVar = this.f42307b;
            if (z4) {
                pyVar.Y0 = false;
                if (pyVar.f40181a1) {
                    ly lyVar = oyVar.f39866a;
                    int i11 = ly.f38903s3;
                    lyVar.A1();
                    pyVar.f40181a1 = false;
                }
                oyVar.d.l();
            }
            py.r1(pyVar, oyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        og.e eVar;
        ly lyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z4;
        boolean z10;
        this.f42308c.X();
        oy oyVar = this.f42307b;
        rw rwVar = oyVar.f39875x;
        int i14 = -i11;
        ArrayList arrayList = rwVar.f25343x;
        ArrayList arrayList2 = rwVar.f25335o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((f2.m1) arrayList2.get(i15)).f5875a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((f2.m1) arrayList.get(i16)).f5875a;
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
        py pyVar = this.d;
        pyVar.r3(oyVar);
        pyVar.N = true;
        View view3 = pyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (pyVar.O0 != 10 && this.f42306a && recyclerView.getChildCount() > 0 && i18 != -1) {
            f2.m1 K = recyclerView.K(i18);
            if (!pyVar.Z3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f5875a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = pyVar.V1;
                if (i20 == i18) {
                    int i21 = pyVar.W1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        z10 = false;
                        if (z10 && pyVar.X1 && (z4 || pyVar.f40182a3)) {
                            pyVar.c4(z4);
                        }
                        pyVar.V1 = i18;
                        pyVar.W1 = i13;
                        pyVar.X1 = true;
                    }
                } else if (i18 > i20) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z10 = true;
                if (z10) {
                    pyVar.c4(z4);
                }
                pyVar.V1 = i18;
                pyVar.W1 = i13;
                pyVar.X1 = true;
            }
        }
        if (!pyVar.H && recyclerView == pyVar.f40185b0[0].f39866a && !pyVar.f40214g2) {
            kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                if (!kVar2.s() && !pyVar.f40187b2 && !pyVar.C3.c()) {
                    if (i11 > 0 && pyVar.Z3() && pyVar.f40185b0[0].f39873s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    pyVar.N = true;
                    View view4 = pyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (pyVar.fragmentView != null) {
            pyVar.m3();
        }
        kx kxVar = pyVar.C3;
        if (kxVar != null && kxVar.c() && (lyVar = oyVar.f39866a) != null) {
            lyVar.invalidate();
        }
        hx hxVar = pyVar.B0;
        if (hxVar != null && hxVar.getPremiumHint() != null && pyVar.B0.getPremiumHint().S) {
            pyVar.B0.getPremiumHint().e(true);
        }
        ?? Z3 = pyVar.Z3();
        View childAt2 = oyVar.f39866a.getChildAt(Z3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        pyVar.f40200e.a((i18 > Z3 || (((float) i12) - pyVar.K) + ((float) AndroidUtilities.dp(5.0f)) < ((float) oyVar.f39866a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (eVar = pyVar.f40226i4) != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(i10, i11);
        }
    }
}

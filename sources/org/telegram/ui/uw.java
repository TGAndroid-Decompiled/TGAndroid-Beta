package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class uw extends f2.z0 {
    public boolean f39009a;
    public final ny f39010b;
    public final hy f39011c;
    public final oy d;

    public uw(oy oyVar, ny nyVar, hy hyVar) {
        this.d = oyVar;
        this.f39010b = nyVar;
        this.f39011c = hyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        oy oyVar = this.d;
        if (i10 == 1) {
            this.f39009a = true;
            oyVar.f37006a3 = true;
            b4.e0 e0Var = oyVar.f37009b0[0].f36742b;
            ValueAnimator valueAnimator = (ValueAnimator) e0Var.f1368c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) e0Var.f1368c).cancel();
                e0Var.f1368c = null;
            }
            if (oyVar.U.f23815r.getText().length() == 0 && oyVar.U.f23815r.hasFocus()) {
                AndroidUtilities.hideKeyboard(oyVar.U.f23815r);
                oyVar.U.f23815r.clearFocus();
            }
        } else {
            oyVar.f37006a3 = false;
        }
        if (i10 == 0) {
            this.f39009a = false;
            oyVar.f37011b2 = false;
            boolean z4 = oyVar.Y0;
            ny nyVar = this.f39010b;
            if (z4) {
                oyVar.Y0 = false;
                if (oyVar.f37005a1) {
                    ky kyVar = nyVar.f36741a;
                    int i11 = ky.f35832s3;
                    kyVar.A1();
                    oyVar.f37005a1 = false;
                }
                nyVar.d.l();
            }
            oy.r1(oyVar, nyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ng.e eVar;
        ky kyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z4;
        boolean z10;
        this.f39011c.X();
        ny nyVar = this.f39010b;
        qw qwVar = nyVar.f36749x;
        int i14 = -i11;
        ArrayList arrayList = qwVar.f31093x;
        ArrayList arrayList2 = qwVar.f31085o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((f2.l1) arrayList2.get(i15)).f5785a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((f2.l1) arrayList.get(i16)).f5785a;
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
        oy oyVar = this.d;
        oyVar.r3(nyVar);
        oyVar.N = true;
        View view3 = oyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (oyVar.O0 != 10 && this.f39009a && recyclerView.getChildCount() > 0 && i18 != -1) {
            f2.l1 K = recyclerView.K(i18);
            if (!oyVar.Z3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f5785a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = oyVar.V1;
                if (i20 == i18) {
                    int i21 = oyVar.W1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        z10 = false;
                        if (z10 && oyVar.X1 && (z4 || oyVar.f37006a3)) {
                            oyVar.c4(z4);
                        }
                        oyVar.V1 = i18;
                        oyVar.W1 = i13;
                        oyVar.X1 = true;
                    }
                } else if (i18 > i20) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z10 = true;
                if (z10) {
                    oyVar.c4(z4);
                }
                oyVar.V1 = i18;
                oyVar.W1 = i13;
                oyVar.X1 = true;
            }
        }
        if (!oyVar.H && recyclerView == oyVar.f37009b0[0].f36741a && !oyVar.f37037g2) {
            kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                if (!kVar2.s() && !oyVar.f37011b2 && !oyVar.C3.c()) {
                    if (i11 > 0 && oyVar.Z3() && oyVar.f37009b0[0].f36747s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    oyVar.N = true;
                    View view4 = oyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (oyVar.fragmentView != null) {
            oyVar.m3();
        }
        jx jxVar = oyVar.C3;
        if (jxVar != null && jxVar.c() && (kyVar = nyVar.f36741a) != null) {
            kyVar.invalidate();
        }
        gx gxVar = oyVar.B0;
        if (gxVar != null && gxVar.getPremiumHint() != null && oyVar.B0.getPremiumHint().S) {
            oyVar.B0.getPremiumHint().e(true);
        }
        ?? Z3 = oyVar.Z3();
        View childAt2 = nyVar.f36741a.getChildAt(Z3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        oyVar.e.a((i18 > Z3 || (((float) i12) - oyVar.K) + ((float) AndroidUtilities.dp(5.0f)) < ((float) nyVar.f36741a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (eVar = oyVar.f37049i4) != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(i10, i11);
        }
    }
}

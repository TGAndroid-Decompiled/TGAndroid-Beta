package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class xw extends s4.t0 {
    public boolean f44225a;
    public final ry f44226b;
    public final ly f44227c;
    public final sy d;

    public xw(sy syVar, ry ryVar, ly lyVar) {
        this.d = syVar;
        this.f44226b = ryVar;
        this.f44227c = lyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        sy syVar = this.d;
        if (i10 == 1) {
            this.f44225a = true;
            syVar.f41938d3 = true;
            a5.a aVar = syVar.f41941e0[0].f41565b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f300c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f300c).cancel();
                aVar.f300c = null;
            }
            if (syVar.X.f31038r.getText().length() == 0 && syVar.X.f31038r.hasFocus()) {
                AndroidUtilities.hideKeyboard(syVar.X.f31038r);
                syVar.X.f31038r.clearFocus();
            }
        } else {
            syVar.f41938d3 = false;
        }
        if (i10 == 0) {
            this.f44225a = false;
            syVar.f41943e2 = false;
            boolean z10 = syVar.f41925b1;
            ry ryVar = this.f44226b;
            if (z10) {
                syVar.f41925b1 = false;
                if (syVar.f41936d1) {
                    oy oyVar = ryVar.f41564a;
                    int i11 = oy.f40677t3;
                    oyVar.B1();
                    syVar.f41936d1 = false;
                }
                ryVar.d.l();
            }
            sy.o1(syVar, ryVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        oy oyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        Object[] objArr;
        this.f44227c.X();
        ry ryVar = this.f44226b;
        tw twVar = ryVar.f41573x;
        int i14 = -i11;
        ArrayList arrayList = twVar.f30940x;
        ArrayList arrayList2 = twVar.f30932o;
        boolean z11 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.d1) arrayList2.get(i15)).f47782a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.d1) arrayList.get(i16)).f47782a;
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
        sy syVar = this.d;
        syVar.o3(ryVar);
        syVar.Q = true;
        View view3 = syVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (syVar.R0 != 10 && this.f44225a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.d1 K = recyclerView.K(i18);
            if (!syVar.W3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f47782a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = syVar.Y1;
                if (i20 == i18) {
                    int i21 = syVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        objArr = null;
                        if (objArr != null && syVar.a2 && (z10 || syVar.f41938d3)) {
                            syVar.Z3(z10);
                        }
                        syVar.Y1 = i18;
                        syVar.Z1 = i13;
                        syVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objArr = 1;
                if (objArr != null) {
                    syVar.Z3(z10);
                }
                syVar.Y1 = i18;
                syVar.Z1 = i13;
                syVar.a2 = true;
            }
        }
        if (!syVar.K && recyclerView == syVar.f41941e0[0].f41564a && !syVar.f41969j2) {
            kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
                if (!kVar2.t() && !syVar.f41943e2 && !syVar.F3.c()) {
                    if (i11 > 0 && syVar.W3() && syVar.f41941e0[0].f41571s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    syVar.Q = true;
                    View view4 = syVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (syVar.fragmentView != null) {
            syVar.j3();
        }
        mx mxVar = syVar.F3;
        if (mxVar != null && mxVar.c() && (oyVar = ryVar.f41564a) != null) {
            oyVar.invalidate();
        }
        jx jxVar = syVar.E0;
        if (jxVar != null && jxVar.getPremiumHint() != null && syVar.E0.getPremiumHint().V) {
            syVar.E0.getPremiumHint().e(true);
        }
        ?? W3 = syVar.W3();
        View childAt2 = ryVar.f41564a.getChildAt(W3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        syVar.f41940e.a((i18 > W3 || (i12 - syVar.N) + AndroidUtilities.dp(5.0f) < ryVar.f41564a.getPaddingTop()) ? true : true, true);
        if (i11 != 0 && (hVar = syVar.f41975k4) != null && Build.VERSION.SDK_INT >= 31) {
            hVar.f(i10, i11);
        }
    }
}

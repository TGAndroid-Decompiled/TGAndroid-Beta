package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ww extends s4.s0 {
    public boolean f39116a;
    public final qy f39117b;
    public final ky f39118c;
    public final ry d;

    public ww(ry ryVar, qy qyVar, ky kyVar) {
        this.d = ryVar;
        this.f39117b = qyVar;
        this.f39118c = kyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        ry ryVar = this.d;
        if (i10 == 1) {
            this.f39116a = true;
            ryVar.f36976d3 = true;
            a5.a aVar = ryVar.f36978e0[0].f36630b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f278c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f278c).cancel();
                aVar.f278c = null;
            }
            if (ryVar.X.f22890r.getText().length() == 0 && ryVar.X.f22890r.hasFocus()) {
                AndroidUtilities.hideKeyboard(ryVar.X.f22890r);
                ryVar.X.f22890r.clearFocus();
            }
        } else {
            ryVar.f36976d3 = false;
        }
        if (i10 == 0) {
            this.f39116a = false;
            ryVar.f36980e2 = false;
            boolean z10 = ryVar.f36963b1;
            qy qyVar = this.f39117b;
            if (z10) {
                ryVar.f36963b1 = false;
                if (ryVar.f36974d1) {
                    ny nyVar = qyVar.f36629a;
                    int i11 = ny.f35622v3;
                    nyVar.A1();
                    ryVar.f36974d1 = false;
                }
                qyVar.d.l();
            }
            ry.r1(ryVar, qyVar);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        ny nyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        int i13;
        boolean z10;
        boolean z11;
        this.f39118c.X();
        qy qyVar = this.f39117b;
        sw swVar = qyVar.f36637x;
        int i14 = -i11;
        ArrayList arrayList = swVar.f22843x;
        ArrayList arrayList2 = swVar.f22835o;
        boolean z12 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = ((s4.c1) arrayList2.get(i15)).f42627a;
                view.setTranslationY(view.getTranslationY() + i14);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                View view2 = ((s4.c1) arrayList.get(i16)).f42627a;
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
        ry ryVar = this.d;
        ryVar.r3(qyVar);
        ryVar.Q = true;
        View view3 = ryVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (ryVar.R0 != 10 && this.f39116a && recyclerView.getChildCount() > 0 && i18 != -1) {
            s4.c1 K = recyclerView.K(i18);
            if (!ryVar.Z3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i13 = K.f42627a.getTop();
                } else {
                    i13 = 0;
                }
                int i20 = ryVar.Y1;
                if (i20 == i18) {
                    int i21 = ryVar.Z1;
                    int i22 = i21 - i13;
                    if (i13 < i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(i22) <= 1) {
                        z11 = false;
                        if (z11 && ryVar.a2 && (z10 || ryVar.f36976d3)) {
                            ryVar.c4(z10);
                        }
                        ryVar.Y1 = i18;
                        ryVar.Z1 = i13;
                        ryVar.a2 = true;
                    }
                } else if (i18 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = true;
                if (z11) {
                    ryVar.c4(z10);
                }
                ryVar.Y1 = i18;
                ryVar.Z1 = i13;
                ryVar.a2 = true;
            }
        }
        if (!ryVar.K && recyclerView == ryVar.f36978e0[0].f36629a && !ryVar.f37006j2) {
            kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                if (!kVar2.s() && !ryVar.f36980e2 && !ryVar.F3.c()) {
                    if (i11 > 0 && ryVar.Z3() && ryVar.f36978e0[0].f36635s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i11 > 0) {
                            if (top < 0) {
                                i11 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    ryVar.Q = true;
                    View view4 = ryVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (ryVar.fragmentView != null) {
            ryVar.m3();
        }
        lx lxVar = ryVar.F3;
        if (lxVar != null && lxVar.c() && (nyVar = qyVar.f36629a) != null) {
            nyVar.invalidate();
        }
        ix ixVar = ryVar.E0;
        if (ixVar != null && ixVar.getPremiumHint() != null && ryVar.E0.getPremiumHint().V) {
            ryVar.E0.getPremiumHint().e(true);
        }
        ?? Z3 = ryVar.Z3();
        View childAt2 = qyVar.f36629a.getChildAt(Z3 == true ? 1 : 0);
        if (childAt2 != null) {
            i12 = childAt2.getTop();
        } else {
            i12 = 0;
        }
        ryVar.e.a((i18 > Z3 || (((float) i12) - ryVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) qyVar.f36629a.getPaddingTop())) ? true : true, true);
        if (i11 != 0 && (hVar = ryVar.f37012k4) != null && Build.VERSION.SDK_INT >= 31) {
            hVar.f(i10, i11);
        }
    }
}

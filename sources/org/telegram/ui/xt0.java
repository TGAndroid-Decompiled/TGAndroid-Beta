package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class xt0 extends AnimatorListenerAdapter {
    public final int f39698a;
    public final PhotoViewer f39699b;

    public xt0(PhotoViewer photoViewer, int i10) {
        this.f39699b = photoViewer;
        this.f39698a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        dv0 dv0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f39699b;
        int i12 = photoViewer.f31094u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f28369b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f28369b.f14110a;
            cropAreaView.f22030n0 = 0.0f;
            cropAreaView.f22031o0 = 1.0f;
            cropAreaView.f22032p0 = 0.0f;
            cropAreaView.f22033q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f30950e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.n0(false);
            try {
                photoViewer.f30950e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f30950e0.invalidate();
            photoViewer.f30950e0.post(new pl0(17, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f31104v5.m(false, true);
            photoViewer.f31114w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f31058q5.setVisibility(8);
            org.telegram.ui.Components.kf0 kf0Var = photoViewer.f31058q5;
            kf0Var.d = null;
            kf0Var.f25621a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f31050p6 = null;
        int i14 = photoViewer.f31094u4;
        photoViewer.f31094u4 = this.f39698a;
        ci.j4 j4Var = photoViewer.f1().L;
        if (photoViewer.f31094u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j4Var.b(z10);
        ci.j4 j4Var2 = photoViewer.K1;
        if (j4Var2 != null) {
            if (photoViewer.f31094u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            j4Var2.b(z11);
        }
        if (photoViewer.f31094u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f30934c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f30934c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f30938c6 = photoViewer.f30982h6;
            photoViewer.f30947d6 = photoViewer.f30991i6;
            photoViewer.f30956e6 = photoViewer.f30999j6;
            photoViewer.f30965f6 = photoViewer.f31008k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f30956e6 = r22;
            photoViewer.f30918a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f30938c6 = 0.0f;
            photoViewer.f30947d6 = 0.0f;
        }
        photoViewer.f31042o6 = -1;
        photoViewer.f30950e0.invalidate();
        iv0 iv0Var = photoViewer.f30992i7;
        if (iv0Var != null) {
            PhotoViewer photoViewer2 = iv0Var.d;
            photoViewer2.d = iv0Var.f34697c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f30941d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f30967g0.setFocusable(false);
            photoViewer2.f30950e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f30950e0.setAlpha(1.0f);
            ArrayList arrayList = iv0Var.f34696b;
            int i15 = iv0Var.f34695a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i15, iv0Var.f34697c.E((MessageObject) arrayList.get(i15), null, iv0Var.f34695a, true, false));
            photoViewer.f30992i7 = null;
            nu0 nu0Var = new nu0();
            nu0Var.f36161c = false;
            photoViewer.k3(false, false, nu0Var);
            photoViewer.k3(true, true, nu0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        t5 t5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(t5Var, property, 0.0f));
        t5 t5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(t5Var2, property2, 1.0f));
        qg.p2 p2Var = photoViewer.p5;
        if (p2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(p2Var, property2, 1.0f));
        }
        ai.n4 n4Var = photoViewer.f31077s5;
        if (n4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f30934c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f30987i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f30934c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f30951e1.getTag() != null) {
            org.telegram.ui.ActionBar.l0 l0Var = photoViewer.f30951e1;
            if (photoViewer.f30943d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            l0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30951e1, property2, 1.0f));
        }
        if (photoViewer.f30960f1.getTag() != null) {
            org.telegram.ui.Components.e90 e90Var = photoViewer.f30960f1;
            if (!photoViewer.f30943d2 && photoViewer.J4 && ((dv0Var = photoViewer.d) == null || dv0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            e90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30960f1, property2, 1.0f));
        }
        if (photoViewer.f30968g1.getTag() != null) {
            bt0 bt0Var = photoViewer.f30968g1;
            if (!photoViewer.f30943d2) {
                i13 = 0;
            }
            bt0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30968g1, property2, 1.0f));
        }
        View view = photoViewer.f30994j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30994j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new wt0(this, i14));
        animatorSet.start();
    }
}

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
public final class wt0 extends AnimatorListenerAdapter {
    public final int f43753a;
    public final PhotoViewer f43754b;

    public wt0(PhotoViewer photoViewer, int i10) {
        this.f43754b = photoViewer;
        this.f43753a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        cv0 cv0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f43754b;
        int i12 = photoViewer.f34048u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f31768b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f31768b.f15572a;
            cropAreaView.f24149n0 = 0.0f;
            cropAreaView.f24150o0 = 1.0f;
            cropAreaView.f24151p0 = 0.0f;
            cropAreaView.f24152q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33904e0.removeView(photoViewer.I1);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f33904e0.removeView(photoViewer.L1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33904e0.invalidate();
            photoViewer.f33904e0.post(new rt0(1, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f34058v5.m(false, true);
            photoViewer.f34068w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f34012q5.setVisibility(8);
            org.telegram.ui.Components.lg0 lg0Var = photoViewer.f34012q5;
            lg0Var.d = null;
            lg0Var.f28452a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f34004p6 = null;
        int i14 = photoViewer.f34048u4;
        photoViewer.f34048u4 = this.f43753a;
        ci.h4 h4Var = photoViewer.f1().L;
        if (photoViewer.f34048u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h4Var.b(z10);
        ci.h4 h4Var2 = photoViewer.K1;
        if (h4Var2 != null) {
            if (photoViewer.f34048u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            h4Var2.b(z11);
        }
        if (photoViewer.f34048u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33887c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33887c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33891c6 = photoViewer.f33936h6;
            photoViewer.f33900d6 = photoViewer.f33945i6;
            photoViewer.f33910e6 = photoViewer.f33953j6;
            photoViewer.f33919f6 = photoViewer.f33962k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f33910e6 = r22;
            photoViewer.f33871a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f33891c6 = 0.0f;
            photoViewer.f33900d6 = 0.0f;
        }
        photoViewer.f33996o6 = -1;
        photoViewer.f33904e0.invalidate();
        hv0 hv0Var = photoViewer.f33946i7;
        if (hv0Var != null) {
            PhotoViewer photoViewer2 = hv0Var.d;
            photoViewer2.d = hv0Var.f38404c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33894d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33921g0.setFocusable(false);
            photoViewer2.f33904e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33904e0.setAlpha(1.0f);
            ArrayList arrayList = hv0Var.f38403b;
            int i15 = hv0Var.f38402a;
            photoViewer2.Z1(null, null, null, null, arrayList, null, null, i15, hv0Var.f38404c.E((MessageObject) arrayList.get(i15), null, hv0Var.f38402a, true, false));
            photoViewer.f33946i7 = null;
            mu0 mu0Var = new mu0();
            mu0Var.f39987c = false;
            photoViewer.k3(false, false, mu0Var);
            photoViewer.k3(true, true, mu0Var);
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
        qg.o2 o2Var = photoViewer.p5;
        if (o2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o2Var, property2, 1.0f));
        }
        ai.o4 o4Var = photoViewer.f34031s5;
        if (o4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33887c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33941i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33887c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33905e1.getTag() != null) {
            org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f33905e1;
            if (photoViewer.f33896d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            k0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33905e1, property2, 1.0f));
        }
        if (photoViewer.f33914f1.getTag() != null) {
            org.telegram.ui.Components.ga0 ga0Var = photoViewer.f33914f1;
            if (!photoViewer.f33896d2 && photoViewer.J4 && ((cv0Var = photoViewer.d) == null || cv0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ga0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33914f1, property2, 1.0f));
        }
        if (photoViewer.f33922g1.getTag() != null) {
            zs0 zs0Var = photoViewer.f33922g1;
            if (!photoViewer.f33896d2) {
                i13 = 0;
            }
            zs0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33922g1, property2, 1.0f));
        }
        View view = photoViewer.f33948j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33948j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new vt0(this, i14));
        animatorSet.start();
    }
}

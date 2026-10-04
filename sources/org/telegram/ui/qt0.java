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
public final class qt0 extends AnimatorListenerAdapter {
    public final int f39823a;
    public final PhotoViewer f39824b;

    public qt0(PhotoViewer photoViewer, int i10) {
        this.f39824b = photoViewer;
        this.f39823a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        wu0 wu0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f39824b;
        int i12 = photoViewer.f34045u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f26856b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f26856b.f15576a;
            cropAreaView.f24150n0 = 0.0f;
            cropAreaView.f24151o0 = 1.0f;
            cropAreaView.f24152p0 = 0.0f;
            cropAreaView.f24153q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33901e0.removeView(photoViewer.I1);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f33901e0.removeView(photoViewer.L1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33901e0.invalidate();
            photoViewer.f33901e0.post(new wj0(20, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f34055v5.m(false, true);
            photoViewer.f34065w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f34009q5.setVisibility(8);
            org.telegram.ui.Components.wf0 wf0Var = photoViewer.f34009q5;
            wf0Var.d = null;
            wf0Var.f32531a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f34001p6 = null;
        int i14 = photoViewer.f34045u4;
        photoViewer.f34045u4 = this.f39823a;
        ci.i4 i4Var = photoViewer.f1().L;
        if (photoViewer.f34045u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i4Var.b(z10);
        ci.i4 i4Var2 = photoViewer.K1;
        if (i4Var2 != null) {
            if (photoViewer.f34045u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            i4Var2.b(z11);
        }
        if (photoViewer.f34045u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33884c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33884c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33888c6 = photoViewer.f33933h6;
            photoViewer.f33897d6 = photoViewer.f33942i6;
            photoViewer.f33907e6 = photoViewer.f33950j6;
            photoViewer.f33916f6 = photoViewer.f33959k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f33907e6 = r22;
            photoViewer.f33868a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f33888c6 = 0.0f;
            photoViewer.f33897d6 = 0.0f;
        }
        photoViewer.f33993o6 = -1;
        photoViewer.f33901e0.invalidate();
        bv0 bv0Var = photoViewer.f33943i7;
        if (bv0Var != null) {
            PhotoViewer photoViewer2 = bv0Var.d;
            photoViewer2.d = bv0Var.f35202c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33891d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33918g0.setFocusable(false);
            photoViewer2.f33901e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33901e0.setAlpha(1.0f);
            ArrayList arrayList = bv0Var.f35201b;
            int i15 = bv0Var.f35200a;
            photoViewer2.Z1(null, null, null, null, arrayList, null, null, i15, bv0Var.f35202c.E((MessageObject) arrayList.get(i15), null, bv0Var.f35200a, true, false));
            photoViewer.f33943i7 = null;
            gu0 gu0Var = new gu0();
            gu0Var.f36742c = false;
            photoViewer.k3(false, false, gu0Var);
            photoViewer.k3(true, true, gu0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        u5 u5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(u5Var, property, 0.0f));
        u5 u5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(u5Var2, property2, 1.0f));
        qg.n2 n2Var = photoViewer.p5;
        if (n2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n2Var, property2, 1.0f));
        }
        ai.n4 n4Var = photoViewer.f34028s5;
        if (n4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33884c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33938i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33884c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33902e1.getTag() != null) {
            org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f33902e1;
            if (photoViewer.f33893d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            k0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33902e1, property2, 1.0f));
        }
        if (photoViewer.f33911f1.getTag() != null) {
            org.telegram.ui.Components.s90 s90Var = photoViewer.f33911f1;
            if (!photoViewer.f33893d2 && photoViewer.J4 && ((wu0Var = photoViewer.d) == null || wu0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33911f1, property2, 1.0f));
        }
        if (photoViewer.f33919g1.getTag() != null) {
            us0 us0Var = photoViewer.f33919g1;
            if (!photoViewer.f33893d2) {
                i13 = 0;
            }
            us0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33919g1, property2, 1.0f));
        }
        View view = photoViewer.f33945j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33945j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new pt0(this, i14));
        animatorSet.start();
    }
}

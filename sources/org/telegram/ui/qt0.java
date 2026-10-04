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
    public final int f39818a;
    public final PhotoViewer f39819b;

    public qt0(PhotoViewer photoViewer, int i10) {
        this.f39819b = photoViewer;
        this.f39818a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        wu0 wu0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f39819b;
        int i12 = photoViewer.f34039u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f26851b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f26851b.f15575a;
            cropAreaView.f24146n0 = 0.0f;
            cropAreaView.f24147o0 = 1.0f;
            cropAreaView.f24148p0 = 0.0f;
            cropAreaView.f24149q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33895e0.removeView(photoViewer.I1);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f33895e0.removeView(photoViewer.L1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33895e0.invalidate();
            photoViewer.f33895e0.post(new wj0(20, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f34049v5.m(false, true);
            photoViewer.f34059w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f34003q5.setVisibility(8);
            org.telegram.ui.Components.wf0 wf0Var = photoViewer.f34003q5;
            wf0Var.d = null;
            wf0Var.f32525a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f33995p6 = null;
        int i14 = photoViewer.f34039u4;
        photoViewer.f34039u4 = this.f39818a;
        ci.i4 i4Var = photoViewer.f1().L;
        if (photoViewer.f34039u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i4Var.b(z10);
        ci.i4 i4Var2 = photoViewer.K1;
        if (i4Var2 != null) {
            if (photoViewer.f34039u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            i4Var2.b(z11);
        }
        if (photoViewer.f34039u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33878c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33878c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33882c6 = photoViewer.f33927h6;
            photoViewer.f33891d6 = photoViewer.f33936i6;
            photoViewer.f33901e6 = photoViewer.f33944j6;
            photoViewer.f33910f6 = photoViewer.f33953k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f33901e6 = r22;
            photoViewer.f33862a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f33882c6 = 0.0f;
            photoViewer.f33891d6 = 0.0f;
        }
        photoViewer.f33987o6 = -1;
        photoViewer.f33895e0.invalidate();
        bv0 bv0Var = photoViewer.f33937i7;
        if (bv0Var != null) {
            PhotoViewer photoViewer2 = bv0Var.d;
            photoViewer2.d = bv0Var.f35197c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33885d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33912g0.setFocusable(false);
            photoViewer2.f33895e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33895e0.setAlpha(1.0f);
            ArrayList arrayList = bv0Var.f35196b;
            int i15 = bv0Var.f35195a;
            photoViewer2.Z1(null, null, null, null, arrayList, null, null, i15, bv0Var.f35197c.E((MessageObject) arrayList.get(i15), null, bv0Var.f35195a, true, false));
            photoViewer.f33937i7 = null;
            gu0 gu0Var = new gu0();
            gu0Var.f36737c = false;
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
        ai.n4 n4Var = photoViewer.f34022s5;
        if (n4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33878c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33932i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33878c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33896e1.getTag() != null) {
            org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f33896e1;
            if (photoViewer.f33887d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            k0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33896e1, property2, 1.0f));
        }
        if (photoViewer.f33905f1.getTag() != null) {
            org.telegram.ui.Components.s90 s90Var = photoViewer.f33905f1;
            if (!photoViewer.f33887d2 && photoViewer.J4 && ((wu0Var = photoViewer.d) == null || wu0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33905f1, property2, 1.0f));
        }
        if (photoViewer.f33913g1.getTag() != null) {
            us0 us0Var = photoViewer.f33913g1;
            if (!photoViewer.f33887d2) {
                i13 = 0;
            }
            us0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33913g1, property2, 1.0f));
        }
        View view = photoViewer.f33939j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33939j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new pt0(this, i14));
        animatorSet.start();
    }
}

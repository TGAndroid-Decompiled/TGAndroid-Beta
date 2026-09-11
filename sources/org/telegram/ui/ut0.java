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
public final class ut0 extends AnimatorListenerAdapter {
    public final int f41217a;
    public final PhotoViewer f41218b;

    public ut0(PhotoViewer photoViewer, int i10) {
        this.f41218b = photoViewer;
        this.f41217a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        av0 av0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f41218b;
        int i12 = photoViewer.f33693u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            mg.q qVar = photoViewer.C1.f30869b;
            qVar.d = null;
            qVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f30869b.f16303a;
            cropAreaView.f23959n0 = 0.0f;
            cropAreaView.f23960o0 = 1.0f;
            cropAreaView.f23961p0 = 0.0f;
            cropAreaView.f23962q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33549e0.removeView(photoViewer.I1);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.n0(false);
            try {
                photoViewer.f33549e0.removeView(photoViewer.L1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33549e0.invalidate();
            photoViewer.f33549e0.post(new ej0(23, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f33703v5.m(false, true);
            photoViewer.f33713w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f33657q5.setVisibility(8);
            org.telegram.ui.Components.kf0 kf0Var = photoViewer.f33657q5;
            kf0Var.d = null;
            kf0Var.f27814a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f33649p6 = null;
        int i14 = photoViewer.f33693u4;
        photoViewer.f33693u4 = this.f41217a;
        di.j4 j4Var = photoViewer.f1().L;
        if (photoViewer.f33693u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j4Var.b(z10);
        di.j4 j4Var2 = photoViewer.K1;
        if (j4Var2 != null) {
            if (photoViewer.f33693u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            j4Var2.b(z11);
        }
        if (photoViewer.f33693u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33532c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33532c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33536c6 = photoViewer.f33581h6;
            photoViewer.f33545d6 = photoViewer.f33590i6;
            photoViewer.f33555e6 = photoViewer.f33598j6;
            photoViewer.f33564f6 = photoViewer.f33607k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f33555e6 = r22;
            photoViewer.f33516a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f33536c6 = 0.0f;
            photoViewer.f33545d6 = 0.0f;
        }
        photoViewer.f33641o6 = -1;
        photoViewer.f33549e0.invalidate();
        fv0 fv0Var = photoViewer.f33591i7;
        if (fv0Var != null) {
            PhotoViewer photoViewer2 = fv0Var.d;
            photoViewer2.d = fv0Var.f36478c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33539d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33566g0.setFocusable(false);
            photoViewer2.f33549e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33549e0.setAlpha(1.0f);
            ArrayList arrayList = fv0Var.f36477b;
            int i15 = fv0Var.f36476a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i15, fv0Var.f36478c.E((MessageObject) arrayList.get(i15), null, fv0Var.f36476a, true, false));
            photoViewer.f33591i7 = null;
            ku0 ku0Var = new ku0();
            ku0Var.f38133c = false;
            photoViewer.k3(false, false, ku0Var);
            photoViewer.k3(true, true, ku0Var);
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
        rg.o2 o2Var = photoViewer.p5;
        if (o2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o2Var, property2, 1.0f));
        }
        bi.a4 a4Var = photoViewer.f33676s5;
        if (a4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(a4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33532c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33586i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33532c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33550e1.getTag() != null) {
            org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f33550e1;
            if (photoViewer.f33541d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            k0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33550e1, property2, 1.0f));
        }
        if (photoViewer.f33559f1.getTag() != null) {
            org.telegram.ui.Components.f90 f90Var = photoViewer.f33559f1;
            if (!photoViewer.f33541d2 && photoViewer.J4 && ((av0Var = photoViewer.d) == null || av0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            f90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33559f1, property2, 1.0f));
        }
        if (photoViewer.f33567g1.getTag() != null) {
            ys0 ys0Var = photoViewer.f33567g1;
            if (!photoViewer.f33541d2) {
                i13 = 0;
            }
            ys0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33567g1, property2, 1.0f));
        }
        View view = photoViewer.f33593j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33593j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new tt0(this, i14));
        animatorSet.start();
    }
}

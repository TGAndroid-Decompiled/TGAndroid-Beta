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
public final class vt0 extends AnimatorListenerAdapter {
    public final int f43171a;
    public final PhotoViewer f43172b;

    public vt0(PhotoViewer photoViewer, int i10) {
        this.f43172b = photoViewer;
        this.f43171a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        bv0 bv0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f43172b;
        int i12 = photoViewer.f34110u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f32682b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f32682b.f15611a;
            cropAreaView.f24177n0 = 0.0f;
            cropAreaView.f24178o0 = 1.0f;
            cropAreaView.f24179p0 = 0.0f;
            cropAreaView.f24180q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33966e0.removeView(photoViewer.I1);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f33966e0.removeView(photoViewer.L1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33966e0.invalidate();
            photoViewer.f33966e0.post(new tt0(0, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f34120v5.m(false, true);
            photoViewer.f34130w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f34074q5.setVisibility(8);
            org.telegram.ui.Components.mg0 mg0Var = photoViewer.f34074q5;
            mg0Var.d = null;
            mg0Var.f28849a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f34066p6 = null;
        int i14 = photoViewer.f34110u4;
        photoViewer.f34110u4 = this.f43171a;
        ci.h4 h4Var = photoViewer.f1().L;
        if (photoViewer.f34110u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h4Var.b(z10);
        ci.h4 h4Var2 = photoViewer.K1;
        if (h4Var2 != null) {
            if (photoViewer.f34110u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            h4Var2.b(z11);
        }
        if (photoViewer.f34110u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33949c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33949c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33953c6 = photoViewer.f33998h6;
            photoViewer.f33962d6 = photoViewer.f34007i6;
            photoViewer.f33972e6 = photoViewer.f34015j6;
            photoViewer.f33981f6 = photoViewer.f34024k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f33972e6 = r22;
            photoViewer.f33933a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f33953c6 = 0.0f;
            photoViewer.f33962d6 = 0.0f;
        }
        photoViewer.f34058o6 = -1;
        photoViewer.f33966e0.invalidate();
        gv0 gv0Var = photoViewer.f34008i7;
        if (gv0Var != null) {
            PhotoViewer photoViewer2 = gv0Var.d;
            photoViewer2.d = gv0Var.f38201c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33956d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33983g0.setFocusable(false);
            photoViewer2.f33966e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33966e0.setAlpha(1.0f);
            ArrayList arrayList = gv0Var.f38200b;
            int i15 = gv0Var.f38199a;
            photoViewer2.Z1(null, null, null, null, arrayList, null, null, i15, gv0Var.f38201c.E((MessageObject) arrayList.get(i15), null, gv0Var.f38199a, true, false));
            photoViewer.f34008i7 = null;
            lu0 lu0Var = new lu0();
            lu0Var.f39765c = false;
            photoViewer.k3(false, false, lu0Var);
            photoViewer.k3(true, true, lu0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        s5 s5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(s5Var, property, 0.0f));
        s5 s5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(s5Var2, property2, 1.0f));
        qg.n2 n2Var = photoViewer.p5;
        if (n2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n2Var, property2, 1.0f));
        }
        ai.o4 o4Var = photoViewer.f34093s5;
        if (o4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33949c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f34003i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33949c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33967e1.getTag() != null) {
            org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f33967e1;
            if (photoViewer.f33958d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            j0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33967e1, property2, 1.0f));
        }
        if (photoViewer.f33976f1.getTag() != null) {
            org.telegram.ui.Components.ga0 ga0Var = photoViewer.f33976f1;
            if (!photoViewer.f33958d2 && photoViewer.J4 && ((bv0Var = photoViewer.d) == null || bv0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ga0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33976f1, property2, 1.0f));
        }
        if (photoViewer.f33984g1.getTag() != null) {
            ys0 ys0Var = photoViewer.f33984g1;
            if (!photoViewer.f33958d2) {
                i13 = 0;
            }
            ys0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33984g1, property2, 1.0f));
        }
        View view = photoViewer.f34010j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f34010j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new ut0(this, i14));
        animatorSet.start();
    }
}

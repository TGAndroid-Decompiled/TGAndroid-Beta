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
    public final int f38620a;
    public final PhotoViewer f38621b;

    public vt0(PhotoViewer photoViewer, int i10) {
        this.f38621b = photoViewer;
        this.f38620a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        bv0 bv0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f38621b;
        int i12 = photoViewer.f31325u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f23571b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f23571b.f14256a;
            cropAreaView.f22206n0 = 0.0f;
            cropAreaView.f22207o0 = 1.0f;
            cropAreaView.f22208p0 = 0.0f;
            cropAreaView.f22209q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f31181e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.n0(false);
            try {
                photoViewer.f31181e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f31181e0.invalidate();
            photoViewer.f31181e0.post(new ak0(21, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f31335v5.m(false, true);
            photoViewer.f31345w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f31289q5.setVisibility(8);
            org.telegram.ui.Components.tf0 tf0Var = photoViewer.f31289q5;
            tf0Var.d = null;
            tf0Var.f28375a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f31281p6 = null;
        int i14 = photoViewer.f31325u4;
        photoViewer.f31325u4 = this.f38620a;
        ci.j4 j4Var = photoViewer.f1().L;
        if (photoViewer.f31325u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j4Var.b(z10);
        ci.j4 j4Var2 = photoViewer.K1;
        if (j4Var2 != null) {
            if (photoViewer.f31325u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            j4Var2.b(z11);
        }
        if (photoViewer.f31325u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f31165c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f31165c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f31169c6 = photoViewer.f31213h6;
            photoViewer.f31178d6 = photoViewer.f31222i6;
            photoViewer.f31187e6 = photoViewer.f31230j6;
            photoViewer.f31196f6 = photoViewer.f31239k6;
        } else {
            float q22 = photoViewer.q2(false);
            photoViewer.f31187e6 = q22;
            photoViewer.f31149a6 = q22;
            photoViewer.v3(q22);
            photoViewer.f31169c6 = 0.0f;
            photoViewer.f31178d6 = 0.0f;
        }
        photoViewer.f31273o6 = -1;
        photoViewer.f31181e0.invalidate();
        gv0 gv0Var = photoViewer.f31223i7;
        if (gv0Var != null) {
            PhotoViewer photoViewer2 = gv0Var.d;
            photoViewer2.d = gv0Var.f33957c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f31172d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f31198g0.setFocusable(false);
            photoViewer2.f31181e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f31181e0.setAlpha(1.0f);
            ArrayList arrayList = gv0Var.f33956b;
            int i15 = gv0Var.f33955a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i15, gv0Var.f33957c.E((MessageObject) arrayList.get(i15), null, gv0Var.f33955a, true, false));
            photoViewer.f31223i7 = null;
            lu0 lu0Var = new lu0();
            lu0Var.f35456c = false;
            photoViewer.j3(false, false, lu0Var);
            photoViewer.j3(true, true, lu0Var);
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
        qg.m2 m2Var = photoViewer.p5;
        if (m2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(m2Var, property2, 1.0f));
        }
        ai.n4 n4Var = photoViewer.f31308s5;
        if (n4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f31165c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f31218i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f31165c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f31182e1.getTag() != null) {
            org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f31182e1;
            if (photoViewer.f31174d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            k0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31182e1, property2, 1.0f));
        }
        if (photoViewer.f31191f1.getTag() != null) {
            org.telegram.ui.Components.n90 n90Var = photoViewer.f31191f1;
            if (!photoViewer.f31174d2 && photoViewer.J4 && ((bv0Var = photoViewer.d) == null || bv0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            n90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31191f1, property2, 1.0f));
        }
        if (photoViewer.f31199g1.getTag() != null) {
            zs0 zs0Var = photoViewer.f31199g1;
            if (!photoViewer.f31174d2) {
                i13 = 0;
            }
            zs0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31199g1, property2, 1.0f));
        }
        View view = photoViewer.f31225j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31225j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new ut0(this, i14));
        animatorSet.start();
    }
}

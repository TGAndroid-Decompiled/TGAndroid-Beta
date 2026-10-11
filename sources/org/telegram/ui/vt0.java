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
    public final int f43137a;
    public final PhotoViewer f43138b;

    public vt0(PhotoViewer photoViewer, int i10) {
        this.f43138b = photoViewer;
        this.f43137a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        bv0 bv0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f43138b;
        int i12 = photoViewer.f34076u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f32884b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f32884b.f15575a;
            cropAreaView.f24141n0 = 0.0f;
            cropAreaView.f24142o0 = 1.0f;
            cropAreaView.f24143p0 = 0.0f;
            cropAreaView.f24144q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33932e0.removeView(photoViewer.I1);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f33932e0.removeView(photoViewer.L1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33932e0.invalidate();
            photoViewer.f33932e0.post(new tt0(0, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f34086v5.m(false, true);
            photoViewer.f34096w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f34040q5.setVisibility(8);
            org.telegram.ui.Components.ng0 ng0Var = photoViewer.f34040q5;
            ng0Var.d = null;
            ng0Var.f29049a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f34032p6 = null;
        int i14 = photoViewer.f34076u4;
        photoViewer.f34076u4 = this.f43137a;
        ci.h4 h4Var = photoViewer.f1().L;
        if (photoViewer.f34076u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h4Var.b(z10);
        ci.h4 h4Var2 = photoViewer.K1;
        if (h4Var2 != null) {
            if (photoViewer.f34076u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            h4Var2.b(z11);
        }
        if (photoViewer.f34076u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33915c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33915c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33919c6 = photoViewer.f33964h6;
            photoViewer.f33928d6 = photoViewer.f33973i6;
            photoViewer.f33938e6 = photoViewer.f33981j6;
            photoViewer.f33947f6 = photoViewer.f33990k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f33938e6 = r22;
            photoViewer.f33899a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f33919c6 = 0.0f;
            photoViewer.f33928d6 = 0.0f;
        }
        photoViewer.f34024o6 = -1;
        photoViewer.f33932e0.invalidate();
        gv0 gv0Var = photoViewer.f33974i7;
        if (gv0Var != null) {
            PhotoViewer photoViewer2 = gv0Var.d;
            photoViewer2.d = gv0Var.f38167c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33922d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33949g0.setFocusable(false);
            photoViewer2.f33932e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33932e0.setAlpha(1.0f);
            ArrayList arrayList = gv0Var.f38166b;
            int i15 = gv0Var.f38165a;
            photoViewer2.Z1(null, null, null, null, arrayList, null, null, i15, gv0Var.f38167c.E((MessageObject) arrayList.get(i15), null, gv0Var.f38165a, true, false));
            photoViewer.f33974i7 = null;
            lu0 lu0Var = new lu0();
            lu0Var.f39731c = false;
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
        ai.o4 o4Var = photoViewer.f34059s5;
        if (o4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33915c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33969i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33915c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33933e1.getTag() != null) {
            org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f33933e1;
            if (photoViewer.f33924d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            j0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33933e1, property2, 1.0f));
        }
        if (photoViewer.f33942f1.getTag() != null) {
            org.telegram.ui.Components.ha0 ha0Var = photoViewer.f33942f1;
            if (!photoViewer.f33924d2 && photoViewer.J4 && ((bv0Var = photoViewer.d) == null || bv0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ha0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33942f1, property2, 1.0f));
        }
        if (photoViewer.f33950g1.getTag() != null) {
            ys0 ys0Var = photoViewer.f33950g1;
            if (!photoViewer.f33924d2) {
                i13 = 0;
            }
            ys0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33950g1, property2, 1.0f));
        }
        View view = photoViewer.f33976j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33976j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new ut0(this, i14));
        animatorSet.start();
    }
}

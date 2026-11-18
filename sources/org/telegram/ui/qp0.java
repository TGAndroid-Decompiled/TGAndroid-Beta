package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f51262a;
    public final PhotoViewer f51263b;

    public qp0(PhotoViewer photoViewer, int i7) {
        this.f51263b = photoViewer;
        this.f51262a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i7;
        uq0 uq0Var;
        int i10;
        boolean z11;
        PhotoViewer photoViewer = this.f51263b;
        int i11 = photoViewer.f43341u4;
        int i12 = 8;
        if (i11 == 1) {
            photoViewer.D1.a();
            og.o oVar = photoViewer.D1.f38763b;
            oVar.d = null;
            oVar.K = false;
            photoViewer.V0.setVisibility(8);
            photoViewer.D1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.D1.f38763b.f21893a;
            cropAreaView.f32892o0 = 0.0f;
            cropAreaView.f32893p0 = 1.0f;
            cropAreaView.f32894q0 = 0.0f;
            cropAreaView.f32896r0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i11 == 2) {
            try {
                photoViewer.f43208f0.removeView(photoViewer.J1);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            photoViewer.J1 = null;
        } else if (i11 == 3) {
            photoViewer.M1.m0(false);
            try {
                photoViewer.f43208f0.removeView(photoViewer.M1.getView());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            photoViewer.M1 = null;
        } else if (i11 == 4) {
            photoViewer.P1 = true;
            photoViewer.f43208f0.invalidate();
            photoViewer.f43208f0.post(new we0(25, this, photoViewer.O1));
            photoViewer.O1 = null;
            photoViewer.f43351v5.m(false, true);
            photoViewer.f43361w5.m(false, true);
        } else if (i11 == 5) {
            photoViewer.f43306q5.setVisibility(8);
            org.telegram.ui.Components.ee0 ee0Var = photoViewer.f43306q5;
            ee0Var.d = null;
            ee0Var.f34681a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f43298p6 = null;
        int i13 = photoViewer.f43341u4;
        photoViewer.f43341u4 = this.f51262a;
        hi.p3 p3Var = photoViewer.b1().M;
        if (photoViewer.f43341u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p3Var.b(z10);
        hi.p3 p3Var2 = photoViewer.L1;
        if (p3Var2 != null) {
            if (photoViewer.f43341u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            p3Var2.b(z11);
        }
        if (photoViewer.f43341u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.d2 == 1) {
            photoViewer.D1.setVisibility(0);
        }
        if (photoViewer.d2 == 11 && (i13 == 3 || i13 == 2 || i13 == 1 || i13 == 4)) {
            photoViewer.f43186c6 = photoViewer.f43232h6;
            photoViewer.f43194d6 = photoViewer.f43240i6;
            photoViewer.f43204e6 = photoViewer.f43247j6;
            photoViewer.f43214f6 = photoViewer.f43256k6;
        } else {
            float p22 = photoViewer.p2(false);
            photoViewer.f43204e6 = p22;
            photoViewer.f43166a6 = p22;
            photoViewer.u3(p22);
            photoViewer.f43186c6 = 0.0f;
            photoViewer.f43194d6 = 0.0f;
        }
        photoViewer.f43289o6 = -1;
        photoViewer.f43208f0.invalidate();
        yq0 yq0Var = photoViewer.i7;
        if (yq0Var != null) {
            PhotoViewer photoViewer2 = yq0Var.d;
            photoViewer2.d = yq0Var.f54231c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f43198e0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f43226h0.setFocusable(false);
            photoViewer2.f43208f0.setFocusable(false);
            photoViewer2.M0.setAlpha(255);
            photoViewer2.f43208f0.setAlpha(1.0f);
            ArrayList arrayList = yq0Var.f54230b;
            int i14 = yq0Var.f54229a;
            photoViewer2.X1(null, null, null, null, arrayList, null, null, i14, yq0Var.f54231c.E((org.telegram.messenger.fj) arrayList.get(i14), null, yq0Var.f54229a, true, false));
            photoViewer.i7 = null;
            gq0 gq0Var = new gq0();
            gq0Var.f48082c = false;
            photoViewer.i3(false, false, gq0Var);
            photoViewer.i3(true, true, gq0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        di.n4 n4Var = photoViewer.Q0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(n4Var, property, 0.0f));
        di.n4 n4Var2 = photoViewer.Q0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(n4Var2, property2, 1.0f));
        tg.e2 e2Var = photoViewer.f43297p5;
        if (e2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(e2Var, property2, 1.0f));
        }
        fi.u2 u2Var = photoViewer.s5;
        if (u2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(u2Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.T0, property, 0.0f));
        if (photoViewer.d2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.G, property, 0.0f));
        }
        if (photoViewer.f43244j2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.R1, property, 0.0f));
        }
        int i15 = photoViewer.d2;
        if (i15 != 0 && i15 != 4) {
            if (i15 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.D1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, property2, 1.0f));
        }
        if (photoViewer.f43209f1.getTag() != null) {
            org.telegram.ui.ActionBar.g0 g0Var = photoViewer.f43209f1;
            if (photoViewer.f43200e2) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            g0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f43209f1, property2, 1.0f));
        }
        if (photoViewer.f43218g1.getTag() != null) {
            org.telegram.ui.Components.m80 m80Var = photoViewer.f43218g1;
            if (!photoViewer.f43200e2 && photoViewer.J4 && ((uq0Var = photoViewer.d) == null || uq0Var.O())) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            m80Var.setVisibility(i7);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f43218g1, property2, 1.0f));
        }
        if (photoViewer.f43227h1.getTag() != null) {
            yo0 yo0Var = photoViewer.f43227h1;
            if (!photoViewer.f43200e2) {
                i12 = 0;
            }
            yo0Var.setVisibility(i12);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f43227h1, property2, 1.0f));
        }
        View view = photoViewer.f43250k0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f43250k0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new pp0(this, i13));
        animatorSet.start();
    }
}

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
public final class s extends AnimatorListenerAdapter {
    public final byte a;
    public final PhotoViewer b;

    public s(PhotoViewer photoViewer, int i) {
        this.b = photoViewer;
        this.a = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        int i;
        o98 o98Var;
        int i2;
        boolean z2;
        PhotoViewer photoViewer = this.b;
        byte b = photoViewer.u4;
        int i3 = 8;
        if (b == 1) {
            photoViewer.D1.a();
            j33 j33Var = photoViewer.D1.b;
            j33Var.d = null;
            j33Var.K = false;
            photoViewer.V0.setVisibility(8);
            photoViewer.D1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.D1.b.a;
            cropAreaView.o0 = 0.0f;
            cropAreaView.p0 = 1.0f;
            cropAreaView.q0 = 0.0f;
            cropAreaView.r0 = 0.0f;
            cropAreaView.invalidate();
        } else if (b == 2) {
            try {
                photoViewer.f0.removeView(photoViewer.J1);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            photoViewer.J1 = null;
        } else if (b == 3) {
            photoViewer.M1.o0(false);
            try {
                photoViewer.f0.removeView(photoViewer.M1.getView());
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            photoViewer.M1 = null;
        } else if (b == 4) {
            photoViewer.P1 = true;
            photoViewer.f0.invalidate();
            photoViewer.f0.post(new h18(this, photoViewer.O1, (byte) 11));
            photoViewer.O1 = null;
            photoViewer.v5.m(false, true);
            photoViewer.w5.m(false, true);
        } else if (b == 5) {
            photoViewer.q5.setVisibility(8);
            v98 v98Var = photoViewer.q5;
            v98Var.d = null;
            v98Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.p6 = null;
        byte b2 = photoViewer.u4;
        photoViewer.u4 = this.a;
        mv5 mv5Var = photoViewer.d0().M;
        if (photoViewer.u4 != 0) {
            z = true;
        } else {
            z = false;
        }
        mv5Var.b(z);
        mv5 mv5Var2 = photoViewer.L1;
        if (mv5Var2 != null) {
            if (photoViewer.u4 != 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            mv5Var2.b(z2);
        }
        if (photoViewer.u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.d2 == 1) {
            photoViewer.D1.setVisibility(0);
        }
        if (photoViewer.d2 == 11 && (b2 == 3 || b2 == 2 || b2 == 1 || b2 == 4)) {
            photoViewer.c6 = photoViewer.h6;
            photoViewer.d6 = photoViewer.i6;
            photoViewer.e6 = photoViewer.j6;
            photoViewer.f6 = photoViewer.k6;
        } else {
            float y1 = photoViewer.y1(false);
            photoViewer.e6 = y1;
            photoViewer.a6 = y1;
            photoViewer.H2(y1);
            photoViewer.c6 = 0.0f;
            photoViewer.d6 = 0.0f;
        }
        photoViewer.o6 = -1;
        photoViewer.f0.invalidate();
        a0 a0Var = photoViewer.i7;
        if (a0Var != null) {
            PhotoViewer photoViewer2 = a0Var.d;
            photoViewer2.d = a0Var.c;
            WindowManager.LayoutParams layoutParams = photoViewer2.e0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.h0.setFocusable(false);
            photoViewer2.f0.setFocusable(false);
            photoViewer2.M0.setAlpha(255);
            photoViewer2.f0.setAlpha(1.0f);
            PhotoViewer photoViewer3 = a0Var.d;
            ArrayList arrayList = a0Var.b;
            int i4 = a0Var.a;
            photoViewer3.c1(null, null, null, null, arrayList, null, null, i4, a0Var.c.M((k27) arrayList.get(i4), null, a0Var.a, true, false));
            photoViewer.i7 = null;
            b98 b98Var = new b98();
            b98Var.c = false;
            photoViewer.t2(false, false, b98Var);
            photoViewer.t2(true, true, b98Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        jo0 jo0Var = photoViewer.Q0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(jo0Var, property, 0.0f));
        jo0 jo0Var2 = photoViewer.Q0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(jo0Var2, property2, 1.0f));
        mza mzaVar = photoViewer.p5;
        if (mzaVar != null) {
            arrayList2.add(ObjectAnimator.ofFloat(mzaVar, property2, 1.0f));
        }
        rj4 rj4Var = photoViewer.s5;
        if (rj4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(rj4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.T0, property, 0.0f));
        if (photoViewer.d2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.G, property, 0.0f));
        }
        if (photoViewer.j2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.R1, property, 0.0f));
        }
        int i5 = photoViewer.d2;
        if (i5 != 0 && i5 != 4) {
            if (i5 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.D1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, property2, 1.0f));
        }
        if (photoViewer.f1.getTag() != null) {
            c7 c7Var = photoViewer.f1;
            if (photoViewer.e2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            c7Var.setVisibility(i2);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f1, property2, 1.0f));
        }
        if (photoViewer.g1.getTag() != null) {
            o76 o76Var = photoViewer.g1;
            if (!photoViewer.e2 && photoViewer.J4 && ((o98Var = photoViewer.d) == null || o98Var.O())) {
                i = 0;
            } else {
                i = 8;
            }
            o76Var.setVisibility(i);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.g1, property2, 1.0f));
        }
        if (photoViewer.h1.getTag() != null) {
            w78 w78Var = photoViewer.h1;
            if (!photoViewer.e2) {
                i3 = 0;
            }
            w78Var.setVisibility(i3);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.h1, property2, 1.0f));
        }
        View view = photoViewer.k0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.k0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new r(this, b2));
        animatorSet.start();
    }
}

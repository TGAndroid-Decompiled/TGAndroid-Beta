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
        pb8 pb8Var;
        int i2;
        boolean z2;
        PhotoViewer photoViewer = this.b;
        byte b = photoViewer.t4;
        int i3 = 8;
        if (b == 1) {
            photoViewer.D1.a();
            u43 u43Var = photoViewer.D1.b;
            u43Var.d = null;
            u43Var.K = false;
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
                fc4.g(e, true);
            }
            photoViewer.J1 = null;
        } else if (b == 3) {
            photoViewer.M1.o0(false);
            try {
                photoViewer.f0.removeView(photoViewer.M1.getView());
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            photoViewer.M1 = null;
        } else if (b == 4) {
            photoViewer.P1 = true;
            photoViewer.f0.invalidate();
            photoViewer.f0.post(new a18(this, photoViewer.O1, (byte) 12));
            photoViewer.O1 = null;
            photoViewer.u5.m(false, true);
            photoViewer.v5.m(false, true);
        } else if (b == 5) {
            photoViewer.p5.setVisibility(8);
            wb8 wb8Var = photoViewer.p5;
            wb8Var.d = null;
            wb8Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.o6 = null;
        byte b2 = photoViewer.t4;
        photoViewer.t4 = this.a;
        mx5 mx5Var = photoViewer.d0().M;
        if (photoViewer.t4 != 0) {
            z = true;
        } else {
            z = false;
        }
        mx5Var.b(z);
        mx5 mx5Var2 = photoViewer.L1;
        if (mx5Var2 != null) {
            if (photoViewer.t4 != 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            mx5Var2.b(z2);
        }
        if (photoViewer.t4 != 3) {
            photoViewer.Y5 = 0.0f;
        }
        if (photoViewer.d2 == 1) {
            photoViewer.D1.setVisibility(0);
        }
        if (photoViewer.d2 == 11 && (b2 == 3 || b2 == 2 || b2 == 1 || b2 == 4)) {
            photoViewer.b6 = photoViewer.g6;
            photoViewer.c6 = photoViewer.h6;
            photoViewer.d6 = photoViewer.i6;
            photoViewer.e6 = photoViewer.j6;
        } else {
            float z1 = photoViewer.z1(false);
            photoViewer.d6 = z1;
            photoViewer.Z5 = z1;
            photoViewer.I2(z1);
            photoViewer.b6 = 0.0f;
            photoViewer.c6 = 0.0f;
        }
        photoViewer.n6 = -1;
        photoViewer.f0.invalidate();
        a0 a0Var = photoViewer.h7;
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
            photoViewer3.d1(null, null, null, null, arrayList, null, null, i4, a0Var.c.N((k47) arrayList.get(i4), null, a0Var.a, true, false));
            photoViewer.h7 = null;
            cb8 cb8Var = new cb8();
            cb8Var.c = false;
            photoViewer.u2(false, false, cb8Var);
            photoViewer.u2(true, true, cb8Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        jp0 jp0Var = photoViewer.Q0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(jp0Var, property, 0.0f));
        jp0 jp0Var2 = photoViewer.Q0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(jp0Var2, property2, 1.0f));
        n1b n1bVar = photoViewer.o5;
        if (n1bVar != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n1bVar, property2, 1.0f));
        }
        yc ycVar = photoViewer.r5;
        if (ycVar != null) {
            arrayList2.add(ObjectAnimator.ofFloat(ycVar, property2, 1.0f));
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
            o96 o96Var = photoViewer.g1;
            if (!photoViewer.e2 && photoViewer.I4 && ((pb8Var = photoViewer.d) == null || pb8Var.P())) {
                i = 0;
            } else {
                i = 8;
            }
            o96Var.setVisibility(i);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.g1, property2, 1.0f));
        }
        if (photoViewer.h1.getTag() != null) {
            y98 y98Var = photoViewer.h1;
            if (!photoViewer.e2) {
                i3 = 0;
            }
            y98Var.setVisibility(i3);
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

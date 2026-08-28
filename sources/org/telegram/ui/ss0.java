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
public final class ss0 extends AnimatorListenerAdapter {
    public final int f42758a;
    public final PhotoViewer f42759b;

    public ss0(PhotoViewer photoViewer, int i9) {
        this.f42759b = photoViewer;
        this.f42758a = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i9;
        zt0 zt0Var;
        int i10;
        boolean z11;
        PhotoViewer photoViewer = this.f42759b;
        int i11 = photoViewer.f35727q4;
        int i12 = 8;
        if (i11 == 1) {
            photoViewer.f35799y1.a();
            tf.n nVar = photoViewer.f35799y1.f27183b;
            nVar.d = null;
            nVar.F = false;
            photoViewer.Q0.setVisibility(8);
            photoViewer.f35799y1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.f35799y1.f27183b.f47904a;
            cropAreaView.f26361j0 = 0.0f;
            cropAreaView.f26362k0 = 1.0f;
            cropAreaView.f26363l0 = 0.0f;
            cropAreaView.m0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i11 == 2) {
            try {
                photoViewer.f35580a0.removeView(photoViewer.E1);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.E1 = null;
        } else if (i11 == 3) {
            photoViewer.H1.n0(false);
            try {
                photoViewer.f35580a0.removeView(photoViewer.H1.getView());
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            photoViewer.H1 = null;
        } else if (i11 == 4) {
            photoViewer.K1 = true;
            photoViewer.f35580a0.invalidate();
            photoViewer.f35580a0.post(new cf0(29, this, photoViewer.J1));
            photoViewer.J1 = null;
            photoViewer.f35738r5.m(false, true);
            photoViewer.f35748s5.m(false, true);
        } else if (i11 == 5) {
            photoViewer.f35693m5.setVisibility(8);
            org.telegram.ui.Components.re0 re0Var = photoViewer.f35693m5;
            re0Var.d = null;
            re0Var.f32146a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f35686l6 = null;
        int i13 = photoViewer.f35727q4;
        photoViewer.f35727q4 = this.f42758a;
        kh.b4 b4Var = photoViewer.f1().H;
        if (photoViewer.f35727q4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        b4Var.b(z10);
        kh.b4 b4Var2 = photoViewer.G1;
        if (b4Var2 != null) {
            if (photoViewer.f35727q4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            b4Var2.b(z11);
        }
        if (photoViewer.f35727q4 != 3) {
            photoViewer.V5 = 0.0f;
        }
        if (photoViewer.Y1 == 1) {
            photoViewer.f35799y1.setVisibility(0);
        }
        if (photoViewer.Y1 == 11 && (i13 == 3 || i13 == 2 || i13 == 1 || i13 == 4)) {
            photoViewer.Y5 = photoViewer.f35613d6;
            photoViewer.Z5 = photoViewer.f35623e6;
            photoViewer.f35584a6 = photoViewer.f35633f6;
            photoViewer.f35594b6 = photoViewer.f35642g6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f35584a6 = r22;
            photoViewer.W5 = r22;
            photoViewer.w3(r22);
            photoViewer.Y5 = 0.0f;
            photoViewer.Z5 = 0.0f;
        }
        photoViewer.f35678k6 = -1;
        photoViewer.f35580a0.invalidate();
        eu0 eu0Var = photoViewer.f35624e7;
        if (eu0Var != null) {
            PhotoViewer photoViewer2 = eu0Var.d;
            photoViewer2.d = eu0Var.f38028c;
            WindowManager.LayoutParams layoutParams = photoViewer2.Z;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f35598c0.setFocusable(false);
            photoViewer2.f35580a0.setFocusable(false);
            photoViewer2.H0.setAlpha(255);
            photoViewer2.f35580a0.setAlpha(1.0f);
            ArrayList arrayList = eu0Var.f38027b;
            int i14 = eu0Var.f38026a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i14, eu0Var.f38028c.E((MessageObject) arrayList.get(i14), null, eu0Var.f38026a, true, false));
            photoViewer.f35624e7 = null;
            jt0 jt0Var = new jt0();
            jt0Var.f39629c = false;
            photoViewer.k3(false, false, jt0Var);
            photoViewer.k3(true, true, jt0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        bh.g gVar = photoViewer.L0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(gVar, property, 0.0f));
        bh.g gVar2 = photoViewer.L0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(gVar2, property2, 1.0f));
        yf.m2 m2Var = photoViewer.f35685l5;
        if (m2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(m2Var, property2, 1.0f));
        }
        ih.b3 b3Var = photoViewer.f35712o5;
        if (b3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(b3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property, 0.0f));
        if (photoViewer.Y1 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.B, property, 0.0f));
        }
        if (photoViewer.f35619e2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.M1, property, 0.0f));
        }
        int i15 = photoViewer.Y1;
        if (i15 != 0 && i15 != 4) {
            if (i15 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35799y1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.J0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.K0, property2, 1.0f));
        }
        if (photoViewer.f35581a1.getTag() != null) {
            org.telegram.ui.ActionBar.l0 l0Var = photoViewer.f35581a1;
            if (photoViewer.Z1) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            l0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35581a1, property2, 1.0f));
        }
        if (photoViewer.f35589b1.getTag() != null) {
            org.telegram.ui.Components.n80 n80Var = photoViewer.f35589b1;
            if (!photoViewer.Z1 && photoViewer.F4 && ((zt0Var = photoViewer.d) == null || zt0Var.N())) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            n80Var.setVisibility(i9);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35589b1, property2, 1.0f));
        }
        if (photoViewer.f35599c1.getTag() != null) {
            wr0 wr0Var = photoViewer.f35599c1;
            if (!photoViewer.Z1) {
                i12 = 0;
            }
            wr0Var.setVisibility(i12);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35599c1, property2, 1.0f));
        }
        View view = photoViewer.f35627f0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35627f0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new rs0(this, i13));
        animatorSet.start();
    }
}

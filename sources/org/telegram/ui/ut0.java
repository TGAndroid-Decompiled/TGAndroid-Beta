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
    public final int f37340a;
    public final PhotoViewer f37341b;

    public ut0(PhotoViewer photoViewer, int i10) {
        this.f37341b = photoViewer;
        this.f37340a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        cv0 cv0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f37341b;
        int i12 = photoViewer.f30193u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            kg.p pVar = photoViewer.C1.f22405b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f22405b.f12495a;
            cropAreaView.f21105n0 = 0.0f;
            cropAreaView.f21106o0 = 1.0f;
            cropAreaView.f21107p0 = 0.0f;
            cropAreaView.f21108q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f30049e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.n0(false);
            try {
                photoViewer.f30049e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f30049e0.invalidate();
            photoViewer.f30049e0.post(new ak0(20, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f30203v5.m(false, true);
            photoViewer.f30213w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f30157q5.setVisibility(8);
            org.telegram.ui.Components.tf0 tf0Var = photoViewer.f30157q5;
            tf0Var.d = null;
            tf0Var.f27402a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f30149p6 = null;
        int i14 = photoViewer.f30193u4;
        photoViewer.f30193u4 = this.f37340a;
        bi.b5 b5Var = photoViewer.f1().L;
        if (photoViewer.f30193u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        b5Var.b(z10);
        bi.b5 b5Var2 = photoViewer.K1;
        if (b5Var2 != null) {
            if (photoViewer.f30193u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            b5Var2.b(z11);
        }
        if (photoViewer.f30193u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f30033c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f30033c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f30037c6 = photoViewer.f30081h6;
            photoViewer.f30046d6 = photoViewer.f30090i6;
            photoViewer.f30055e6 = photoViewer.f30098j6;
            photoViewer.f30064f6 = photoViewer.f30107k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f30055e6 = r22;
            photoViewer.f30017a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f30037c6 = 0.0f;
            photoViewer.f30046d6 = 0.0f;
        }
        photoViewer.f30141o6 = -1;
        photoViewer.f30049e0.invalidate();
        hv0 hv0Var = photoViewer.f30091i7;
        if (hv0Var != null) {
            PhotoViewer photoViewer2 = hv0Var.d;
            photoViewer2.d = hv0Var.f33473c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f30040d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f30066g0.setFocusable(false);
            photoViewer2.f30049e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f30049e0.setAlpha(1.0f);
            ArrayList arrayList = hv0Var.f33472b;
            int i15 = hv0Var.f33471a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i15, hv0Var.f33473c.E((MessageObject) arrayList.get(i15), null, hv0Var.f33471a, true, false));
            photoViewer.f30091i7 = null;
            lu0 lu0Var = new lu0();
            lu0Var.f34778c = false;
            photoViewer.k3(false, false, lu0Var);
            photoViewer.k3(true, true, lu0Var);
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
        pg.n2 n2Var = photoViewer.p5;
        if (n2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n2Var, property2, 1.0f));
        }
        u7 u7Var = photoViewer.f30176s5;
        if (u7Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(u7Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f30033c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f30086i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f30033c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f30050e1.getTag() != null) {
            org.telegram.ui.ActionBar.l0 l0Var = photoViewer.f30050e1;
            if (photoViewer.f30042d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            l0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30050e1, property2, 1.0f));
        }
        if (photoViewer.f30059f1.getTag() != null) {
            org.telegram.ui.Components.o90 o90Var = photoViewer.f30059f1;
            if (!photoViewer.f30042d2 && photoViewer.J4 && ((cv0Var = photoViewer.d) == null || cv0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            o90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30059f1, property2, 1.0f));
        }
        if (photoViewer.f30067g1.getTag() != null) {
            ys0 ys0Var = photoViewer.f30067g1;
            if (!photoViewer.f30042d2) {
                i13 = 0;
            }
            ys0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30067g1, property2, 1.0f));
        }
        View view = photoViewer.f30093j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30093j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new tt0(this, i14));
        animatorSet.start();
    }
}

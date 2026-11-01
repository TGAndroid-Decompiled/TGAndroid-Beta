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
public final class xq0 extends AnimatorListenerAdapter {
    public final int f43447a;
    public final PhotoViewer f43448b;

    public xq0(PhotoViewer photoViewer, int i10) {
        this.f43448b = photoViewer;
        this.f43447a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        ds0 ds0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f43448b;
        int i12 = photoViewer.f33622u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            eg.q qVar = photoViewer.C1.f24715b;
            qVar.d = null;
            qVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f24715b.f6583a;
            cropAreaView.f23969n0 = 0.0f;
            cropAreaView.f23970o0 = 1.0f;
            cropAreaView.f23971p0 = 0.0f;
            cropAreaView.f23972q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33477e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.m0(false);
            try {
                photoViewer.f33477e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33477e0.invalidate();
            photoViewer.f33477e0.post(new if0(27, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f33632v5.m(false, true);
            photoViewer.f33642w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f33586q5.setVisibility(8);
            org.telegram.ui.Components.pe0 pe0Var = photoViewer.f33586q5;
            pe0Var.d = null;
            pe0Var.f29410a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f33578p6 = null;
        int i14 = photoViewer.f33622u4;
        photoViewer.f33622u4 = this.f43447a;
        vh.r2 r2Var = photoViewer.h1().L;
        if (photoViewer.f33622u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        r2Var.b(z10);
        vh.r2 r2Var2 = photoViewer.K1;
        if (r2Var2 != null) {
            if (photoViewer.f33622u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            r2Var2.b(z11);
        }
        if (photoViewer.f33622u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33461c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33461c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33465c6 = photoViewer.f33509h6;
            photoViewer.f33474d6 = photoViewer.f33518i6;
            photoViewer.f33483e6 = photoViewer.f33527j6;
            photoViewer.f33492f6 = photoViewer.f33536k6;
        } else {
            float u22 = photoViewer.u2(false);
            photoViewer.f33483e6 = u22;
            photoViewer.f33445a6 = u22;
            photoViewer.z3(u22);
            photoViewer.f33465c6 = 0.0f;
            photoViewer.f33474d6 = 0.0f;
        }
        photoViewer.f33570o6 = -1;
        photoViewer.f33477e0.invalidate();
        hs0 hs0Var = photoViewer.f33519i7;
        if (hs0Var != null) {
            PhotoViewer photoViewer2 = hs0Var.d;
            photoViewer2.d = hs0Var.f37860c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33468d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33494g0.setFocusable(false);
            photoViewer2.f33477e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33477e0.setAlpha(1.0f);
            ArrayList arrayList = hs0Var.f37859b;
            int i15 = hs0Var.f37858a;
            photoViewer2.c2(null, null, null, null, arrayList, null, null, i15, hs0Var.f37860c.E((org.telegram.messenger.kj) arrayList.get(i15), null, hs0Var.f37858a, true, false));
            photoViewer.f33519i7 = null;
            pr0 pr0Var = new pr0();
            pr0Var.f40587c = false;
            photoViewer.n3(false, false, pr0Var);
            photoViewer.n3(true, true, pr0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        jg.b1 b1Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(b1Var, property, 0.0f));
        jg.b1 b1Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(b1Var2, property2, 1.0f));
        jg.v2 v2Var = photoViewer.p5;
        if (v2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(v2Var, property2, 1.0f));
        }
        ih.c cVar = photoViewer.f33605s5;
        if (cVar != null) {
            arrayList2.add(ObjectAnimator.ofFloat(cVar, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33461c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33514i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33461c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33478e1.getTag() != null) {
            org.telegram.ui.ActionBar.g0 g0Var = photoViewer.f33478e1;
            if (photoViewer.f33470d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            g0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33478e1, property2, 1.0f));
        }
        if (photoViewer.f33487f1.getTag() != null) {
            org.telegram.ui.Components.r80 r80Var = photoViewer.f33487f1;
            if (!photoViewer.f33470d2 && photoViewer.J4 && ((ds0Var = photoViewer.d) == null || ds0Var.O())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            r80Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33487f1, property2, 1.0f));
        }
        if (photoViewer.f33495g1.getTag() != null) {
            fq0 fq0Var = photoViewer.f33495g1;
            if (!photoViewer.f33470d2) {
                i13 = 0;
            }
            fq0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33495g1, property2, 1.0f));
        }
        View view = photoViewer.f33521j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33521j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new wq0(this, i14));
        animatorSet.start();
    }
}

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
public final class zq0 extends AnimatorListenerAdapter {
    public final int f44214a;
    public final PhotoViewer f44215b;

    public zq0(PhotoViewer photoViewer, int i10) {
        this.f44215b = photoViewer;
        this.f44214a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        es0 es0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f44215b;
        int i12 = photoViewer.f33615u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            eg.q qVar = photoViewer.C1.f24615b;
            qVar.d = null;
            qVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f24615b.f6583a;
            cropAreaView.f23968n0 = 0.0f;
            cropAreaView.f23969o0 = 1.0f;
            cropAreaView.f23970p0 = 0.0f;
            cropAreaView.f23971q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33470e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.m0(false);
            try {
                photoViewer.f33470e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33470e0.invalidate();
            photoViewer.f33470e0.post(new uf0(26, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f33625v5.m(false, true);
            photoViewer.f33635w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f33579q5.setVisibility(8);
            org.telegram.ui.Components.pe0 pe0Var = photoViewer.f33579q5;
            pe0Var.d = null;
            pe0Var.f29345a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f33571p6 = null;
        int i14 = photoViewer.f33615u4;
        photoViewer.f33615u4 = this.f44214a;
        vh.r2 r2Var = photoViewer.h1().L;
        if (photoViewer.f33615u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        r2Var.b(z10);
        vh.r2 r2Var2 = photoViewer.K1;
        if (r2Var2 != null) {
            if (photoViewer.f33615u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            r2Var2.b(z11);
        }
        if (photoViewer.f33615u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33454c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33454c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33458c6 = photoViewer.f33502h6;
            photoViewer.f33467d6 = photoViewer.f33511i6;
            photoViewer.f33476e6 = photoViewer.f33520j6;
            photoViewer.f33485f6 = photoViewer.f33529k6;
        } else {
            float u22 = photoViewer.u2(false);
            photoViewer.f33476e6 = u22;
            photoViewer.f33438a6 = u22;
            photoViewer.z3(u22);
            photoViewer.f33458c6 = 0.0f;
            photoViewer.f33467d6 = 0.0f;
        }
        photoViewer.f33563o6 = -1;
        photoViewer.f33470e0.invalidate();
        is0 is0Var = photoViewer.f33512i7;
        if (is0Var != null) {
            PhotoViewer photoViewer2 = is0Var.d;
            photoViewer2.d = is0Var.f38342c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33461d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33487g0.setFocusable(false);
            photoViewer2.f33470e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33470e0.setAlpha(1.0f);
            ArrayList arrayList = is0Var.f38341b;
            int i15 = is0Var.f38340a;
            photoViewer2.c2(null, null, null, null, arrayList, null, null, i15, is0Var.f38342c.E((org.telegram.messenger.jj) arrayList.get(i15), null, is0Var.f38340a, true, false));
            photoViewer.f33512i7 = null;
            qr0 qr0Var = new qr0();
            qr0Var.f41041c = false;
            photoViewer.n3(false, false, qr0Var);
            photoViewer.n3(true, true, qr0Var);
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
        ih.c cVar = photoViewer.f33598s5;
        if (cVar != null) {
            arrayList2.add(ObjectAnimator.ofFloat(cVar, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33454c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33507i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33454c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33471e1.getTag() != null) {
            org.telegram.ui.ActionBar.g0 g0Var = photoViewer.f33471e1;
            if (photoViewer.f33463d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            g0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33471e1, property2, 1.0f));
        }
        if (photoViewer.f33480f1.getTag() != null) {
            org.telegram.ui.Components.r80 r80Var = photoViewer.f33480f1;
            if (!photoViewer.f33463d2 && photoViewer.J4 && ((es0Var = photoViewer.d) == null || es0Var.O())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            r80Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33480f1, property2, 1.0f));
        }
        if (photoViewer.f33488g1.getTag() != null) {
            hq0 hq0Var = photoViewer.f33488g1;
            if (!photoViewer.f33463d2) {
                i13 = 0;
            }
            hq0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33488g1, property2, 1.0f));
        }
        View view = photoViewer.f33514j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33514j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new yq0(this, i14));
        animatorSet.start();
    }
}

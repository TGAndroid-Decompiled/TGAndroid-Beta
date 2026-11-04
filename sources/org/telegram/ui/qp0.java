package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
public final class qp0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f48936a;
    public final ViewGroup.LayoutParams f48937b;
    public final float f48938c;
    public final mq0 d;
    public final float f48939e;
    public final kq0 f48940f;
    public final ArrayList h;
    public final Integer f48941n;
    public final PhotoViewer f48942r;

    public qp0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, mq0 mq0Var, float f11, kq0 kq0Var, ArrayList arrayList, Integer num) {
        this.f48942r = photoViewer;
        this.f48936a = clippingImageViewArr;
        this.f48937b = layoutParams;
        this.f48938c = f10;
        this.d = mq0Var;
        this.f48939e = f11;
        this.f48940f = kq0Var;
        this.h = arrayList;
        this.f48941n = num;
    }

    @Override
    public final boolean onPreDraw() {
        int i3;
        int i10;
        int i11;
        float c2;
        float f10;
        float f11;
        int i12;
        boolean z10;
        int i13;
        float f12;
        int i14;
        int i15;
        PhotoViewer photoViewer = this.f48942r;
        Rect rect = photoViewer.f41542t2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.M0;
        float[][] fArr = photoViewer.f41474l4;
        ClippingImageView[] clippingImageViewArr = this.f48936a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f41437h0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i16 = photoViewer.f41402d2;
        ViewGroup.LayoutParams layoutParams = this.f48937b;
        if (i16 == 1) {
            if (!photoViewer.f41531s) {
                i14 = org.telegram.messenger.g0.f22602m;
            } else {
                i14 = 0;
            }
            float f13 = i14;
            float measuredHeight = (photoViewer.D1.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - f13;
            i3 = 0;
            float min = Math.min(photoViewer.D1.getMeasuredWidth(), measuredHeight) - (org.telegram.messenger.g0.L(16.0f) * 2);
            float measuredWidth = photoViewer.D1.getMeasuredWidth() / 2.0f;
            float f14 = (measuredHeight / 2.0f) + f13;
            float f15 = min / 2.0f;
            float f16 = f14 - f15;
            float f17 = (f14 + f15) - f16;
            f10 = Math.max(((measuredWidth + f15) - (measuredWidth - f15)) / layoutParams.width, f17 / layoutParams.height);
            c2 = ((f17 - (layoutParams.height * f10)) / 2.0f) + f16;
            int measuredWidth2 = photoViewer.f41437h0.getMeasuredWidth();
            f11 = com.google.android.recaptcha.internal.a.c(layoutParams.width, f10, (measuredWidth2 - i15) - rect.right, 2.0f) + rect.left;
        } else {
            i3 = 0;
            float measuredWidth3 = photoViewer.f41437h0.getMeasuredWidth() / layoutParams.width;
            Point point = org.telegram.messenger.g0.f22608q;
            int i17 = point.y;
            if (!photoViewer.f41531s) {
                i10 = org.telegram.messenger.g0.f22602m;
            } else {
                i10 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i17 + i10) / layoutParams.height);
            if (photoViewer.f41402d2 == 11) {
                min2 = photoViewer.u2(true) * min2;
            }
            int i18 = point.y;
            if (!photoViewer.f41531s) {
                i11 = org.telegram.messenger.g0.f22602m;
            } else {
                i11 = 0;
            }
            c2 = com.google.android.recaptcha.internal.a.c(layoutParams.height, min2, i18 + i11, 2.0f);
            float c10 = com.google.android.recaptcha.internal.a.c(layoutParams.width, min2, photoViewer.f41437h0.getMeasuredWidth(), 2.0f);
            photoViewer.f41397c6 = 0.0f;
            photoViewer.f41435g6 = 0.0f;
            f10 = min2;
            f11 = c10;
        }
        mq0 mq0Var = this.d;
        int abs = (int) Math.abs(this.f48938c - mq0Var.f47751a.L0);
        float f18 = mq0Var.f47751a.M0;
        float f19 = this.f48939e;
        int abs2 = (int) Math.abs(f19 - f18);
        if (mq0Var.f47751a.S0) {
            abs = i3;
        }
        int[] iArr = new int[2];
        int i19 = 2;
        mq0Var.d.getLocationInWindow(iArr);
        float f20 = mq0Var.f47753c + f19;
        int i20 = (int) ((iArr[1] - f20) + mq0Var.f47758j);
        if (i20 < 0) {
            i20 = i3;
        }
        int height = (int) (((f20 + layoutParams.height) - (mq0Var.d.getHeight() + i12)) + mq0Var.f47757i);
        if (height < 0) {
            height = i3;
        }
        int max = Math.max(i20, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i3][i3] = photoViewer.f41445i0.getScaleX();
        fArr[i3][1] = photoViewer.f41445i0.getScaleY();
        fArr[i3][2] = photoViewer.f41445i0.getTranslationX();
        fArr[i3][3] = photoViewer.f41445i0.getTranslationY();
        float[] fArr2 = fArr[i3];
        float f21 = abs;
        float f22 = mq0Var.f47759k;
        int i21 = 3;
        fArr2[4] = f21 * f22;
        fArr2[5] = max * f22;
        char c11 = 6;
        fArr2[6] = max2 * f22;
        int[] radius = photoViewer.f41445i0.getRadius();
        int i22 = i3;
        while (i22 < 4) {
            float[] fArr3 = fArr[i3];
            int i23 = i22 + 7;
            char c12 = c11;
            if (radius != null) {
                f12 = radius[i22];
            } else {
                f12 = 0.0f;
            }
            fArr3[i23] = f12;
            i22++;
            c11 = c12;
        }
        float[] fArr4 = fArr[i3];
        float f23 = mq0Var.f47759k;
        fArr4[11] = abs2 * f23;
        fArr4[12] = f21 * f23;
        float[] fArr5 = fArr[1];
        fArr5[i3] = f10;
        fArr5[1] = f10;
        fArr5[2] = f11;
        fArr5[3] = c2;
        fArr5[4] = 0.0f;
        fArr5[5] = 0.0f;
        fArr5[c11] = 0.0f;
        fArr5[7] = 0.0f;
        fArr5[8] = 0.0f;
        fArr5[9] = 0.0f;
        fArr5[10] = 0.0f;
        fArr5[11] = 0.0f;
        fArr5[12] = 0.0f;
        for (int i24 = i3; i24 < clippingImageViewArr.length; i24++) {
            clippingImageViewArr[i24].setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(i3);
        photoViewer.f41420f0.setAlpha(0.0f);
        photoViewer.f41462k0.setAlpha(0.0f);
        lq lqVar = new lq(this, clippingImageViewArr, this.h, this.f48941n, this.f48940f);
        photoViewer.f41517q4 = lqVar;
        if (!photoViewer.f41479m2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f41402d2 != 1) {
                i21 = 2;
            }
            int length = i21 + clippingImageViewArr.length;
            if (clippingImageViewArr.length > 1) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            ArrayList arrayList = new ArrayList(length + i13);
            int i25 = 0;
            while (i25 < clippingImageViewArr.length) {
                float[] fArr6 = new float[i19];
                
                fArr6[0] = 0.0f;
                fArr6[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i25], org.telegram.ui.Components.k6.f35326f, fArr6);
                if (i25 == 0) {
                    ofFloat.addUpdateListener(new b3(this, 21));
                }
                arrayList.add(ofFloat);
                i25++;
                i19 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f41445i0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.k6.d, 0, 255));
            gq0 gq0Var = photoViewer.f41420f0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(gq0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f41462k0, property, 0.0f, 1.0f));
            if (photoViewer.f41402d2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.D1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new y20(this, 16));
            photoViewer.f41420f0.setLayerType(2, null);
            photoViewer.B2(false);
            photoViewer.f41508p4 = System.currentTimeMillis();
            org.telegram.messenger.g0.h3(new hk0(10, this, animatorSet));
        } else {
            lqVar.run();
            photoViewer.f41517q4 = null;
            photoViewer.f41420f0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.f41402d2 == 1) {
                photoViewer.D1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new hk0(11, this, mq0Var);
        wm wmVar = photoViewer.f41481m4;
        if (wmVar != null && wmVar.getFragmentView() != null) {
            wm wmVar2 = photoViewer.f41481m4;
            wmVar2.f8();
            UndoView undoView = wmVar2.N3;
            if (undoView != null) {
                z10 = true;
                undoView.d(1, false);
            } else {
                z10 = true;
            }
            photoViewer.f41481m4.getFragmentView().invalidate();
            return z10;
        }
        return true;
    }
}

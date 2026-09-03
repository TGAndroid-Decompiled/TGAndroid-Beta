package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
public final class rt0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f40937a;
    public final ViewGroup.LayoutParams f40938b;
    public final float f40939c;
    public final qu0 d;
    public final float f40940e;
    public final ou0 f40941f;
    public final ArrayList h;
    public final Integer f40942n;
    public final PhotoViewer f40943r;

    public rt0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, qu0 qu0Var, float f11, ou0 ou0Var, ArrayList arrayList, Integer num) {
        this.f40943r = photoViewer;
        this.f40937a = clippingImageViewArr;
        this.f40938b = layoutParams;
        this.f40939c = f10;
        this.d = qu0Var;
        this.f40940e = f11;
        this.f40941f = ou0Var;
        this.h = arrayList;
        this.f40942n = num;
    }

    @Override
    public final boolean onPreDraw() {
        char c3;
        int i10;
        float f10;
        int i11;
        float d;
        float d10;
        int i12;
        boolean z4;
        int i13;
        float f11;
        int i14;
        int i15;
        PhotoViewer photoViewer = this.f40943r;
        Rect rect = photoViewer.f34358p2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.I0;
        float[][] fArr = photoViewer.f34289h4;
        ClippingImageView[] clippingImageViewArr = this.f40937a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f34248d0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i16 = photoViewer.Z1;
        ViewGroup.LayoutParams layoutParams = this.f40938b;
        if (i16 == 1) {
            if (!photoViewer.f34384s) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            float f12 = i14;
            float measuredHeight = (photoViewer.f34450z1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f12;
            c3 = 0;
            float min = Math.min(photoViewer.f34450z1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.f34450z1.getMeasuredWidth() / 2.0f;
            float f13 = (measuredHeight / 2.0f) + f12;
            float f14 = min / 2.0f;
            float f15 = f13 - f14;
            float f16 = (f13 + f14) - f15;
            f10 = Math.max(((measuredWidth + f14) - (measuredWidth - f14)) / layoutParams.width, f16 / layoutParams.height);
            d = ((f16 - (layoutParams.height * f10)) / 2.0f) + f15;
            int measuredWidth2 = photoViewer.f34248d0.getMeasuredWidth();
            d10 = e2.c.d(layoutParams.width, f10, (measuredWidth2 - i15) - rect.right, 2.0f) + rect.left;
        } else {
            c3 = 0;
            float measuredWidth3 = photoViewer.f34248d0.getMeasuredWidth() / layoutParams.width;
            int i17 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f34384s) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i17 + i10) / layoutParams.height);
            if (photoViewer.Z1 == 11) {
                f10 = photoViewer.r2(true) * min2;
            } else {
                f10 = min2;
            }
            int i18 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f34384s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            d = e2.c.d(layoutParams.height, f10, i18 + i11, 2.0f);
            d10 = e2.c.d(layoutParams.width, f10, photoViewer.f34248d0.getMeasuredWidth(), 2.0f);
            photoViewer.Y5 = 0.0f;
            photoViewer.f34245c6 = 0.0f;
        }
        qu0 qu0Var = this.d;
        int abs = (int) Math.abs(this.f40939c - qu0Var.f40678a.getImageX());
        float imageY = qu0Var.f40678a.getImageY();
        float f17 = this.f40940e;
        int abs2 = (int) Math.abs(f17 - imageY);
        if (qu0Var.f40678a.isAspectFit()) {
            abs = 0;
        }
        int[] iArr = new int[2];
        qu0Var.d.getLocationInWindow(iArr);
        float f18 = qu0Var.f40680c + f17;
        int i19 = (int) ((iArr[1] - f18) + qu0Var.f40685j);
        if (i19 < 0) {
            i19 = 0;
        }
        int height = (int) (((f18 + layoutParams.height) - (qu0Var.d.getHeight() + i12)) + qu0Var.f40684i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i19, abs2);
        int max2 = Math.max(height, abs2);
        fArr[c3][c3] = photoViewer.f34258e0.getScaleX();
        fArr[c3][1] = photoViewer.f34258e0.getScaleY();
        fArr[c3][2] = photoViewer.f34258e0.getTranslationX();
        fArr[c3][3] = photoViewer.f34258e0.getTranslationY();
        float[] fArr2 = fArr[c3];
        float f19 = abs;
        float f20 = qu0Var.f40686k;
        int i20 = 3;
        fArr2[4] = f19 * f20;
        fArr2[5] = max * f20;
        fArr2[6] = max2 * f20;
        int[] radius = photoViewer.f34258e0.getRadius();
        for (int i21 = 0; i21 < 4; i21++) {
            float[] fArr3 = fArr[c3];
            int i22 = i21 + 7;
            if (radius != null) {
                f11 = radius[i21];
            } else {
                f11 = 0.0f;
            }
            fArr3[i22] = f11;
        }
        float[] fArr4 = fArr[c3];
        float f21 = qu0Var.f40686k;
        fArr4[11] = abs2 * f21;
        fArr4[12] = f19 * f21;
        float[] fArr5 = fArr[1];
        fArr5[c3] = f10;
        fArr5[1] = f10;
        fArr5[2] = d10;
        fArr5[3] = d;
        fArr5[4] = 0.0f;
        fArr5[5] = 0.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 0.0f;
        fArr5[8] = 0.0f;
        fArr5[9] = 0.0f;
        fArr5[10] = 0.0f;
        fArr5[11] = 0.0f;
        fArr5[12] = 0.0f;
        for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
            clippingImageView2.setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(0);
        photoViewer.f34230b0.setAlpha(0.0f);
        photoViewer.f34276g0.setAlpha(0.0f);
        org.telegram.ui.Components.jy0 jy0Var = new org.telegram.ui.Components.jy0(this, clippingImageViewArr, this.h, this.f40942n, this.f40941f, 21);
        photoViewer.f34332m4 = jy0Var;
        if (!photoViewer.f34296i2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.Z1 != 1) {
                i20 = 2;
            }
            int length = i20 + clippingImageViewArr.length;
            if (clippingImageViewArr.length > 1) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            ArrayList arrayList = new ArrayList(length + i13);
            for (int i23 = 0; i23 < clippingImageViewArr.length; i23++) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i23], org.telegram.ui.Components.n6.f29398f, 0.0f, 1.0f);
                if (i23 == 0) {
                    ofFloat.addUpdateListener(new e3(this, 23));
                }
                arrayList.add(ofFloat);
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f34258e0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.n6.d, 0, 255));
            iu0 iu0Var = photoViewer.f34230b0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(iu0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f34276g0, property, 0.0f, 1.0f));
            if (photoViewer.Z1 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f34450z1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new ss0(this, 6));
            photoViewer.f34230b0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.f34324l4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new pr0(5, this, animatorSet));
        } else {
            jy0Var.run();
            photoViewer.f34332m4 = null;
            photoViewer.f34230b0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
                clippingImageView3.setAnimationProgress(1.0f);
            }
            if (photoViewer.Z1 == 1) {
                photoViewer.f34450z1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new pr0(6, this, qu0Var);
        xn xnVar = photoViewer.f34298i4;
        if (xnVar != null && xnVar.getFragmentView() != null) {
            xn xnVar2 = photoViewer.f34298i4;
            xnVar2.Q7();
            UndoView undoView = xnVar2.f43356v3;
            if (undoView != null) {
                z4 = true;
                undoView.e(1, false);
            } else {
                z4 = true;
            }
            photoViewer.f34298i4.getFragmentView().invalidate();
            return z4;
        }
        return true;
    }
}

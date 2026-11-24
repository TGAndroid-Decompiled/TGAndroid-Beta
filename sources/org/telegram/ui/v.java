package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
public final class v implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] a;
    public final ViewGroup.LayoutParams b;
    public final float c;
    public final qb8 d;
    public final float e;
    public final pb8 f;
    public final ArrayList h;
    public final Integer n;
    public final PhotoViewer r;

    public v(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f, qb8 qb8Var, float f2, pb8 pb8Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f;
        this.d = qb8Var;
        this.e = f2;
        this.f = pb8Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override
    public final boolean onPreDraw() {
        int i;
        int i2;
        float b;
        float f;
        float f2;
        int i3;
        boolean z;
        int i4;
        float f3;
        int i5;
        int i6;
        PhotoViewer photoViewer = this.r;
        Rect rect = photoViewer.t2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.M0;
        float[][] fArr = photoViewer.j4;
        ClippingImageView[] clippingImageViewArr = this.a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            ClippingImageView clippingImageView = clippingImageViewArr[1];
            Drawable[] drawableArr = PhotoViewer.d9;
            clippingImageView.setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView2 = clippingImageViewArr[0];
        float translationX = clippingImageView2.getTranslationX();
        Drawable[] drawableArr2 = PhotoViewer.d9;
        clippingImageView2.setTranslationX(translationX + rect.left);
        photoViewer.h0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i7 = photoViewer.d2;
        ViewGroup.LayoutParams layoutParams = this.b;
        if (i7 == 1) {
            if (!photoViewer.s) {
                i5 = gm.m;
            } else {
                i5 = 0;
            }
            float f4 = i5;
            float measuredHeight = (photoViewer.D1.getMeasuredHeight() - gm.L(64.0f)) - f4;
            float min = Math.min(photoViewer.D1.getMeasuredWidth(), measuredHeight) - (gm.L(16.0f) << 1);
            float measuredWidth = photoViewer.D1.getMeasuredWidth() / 2.0f;
            float f5 = (measuredHeight / 2.0f) + f4;
            float f6 = min / 2.0f;
            float f7 = f5 - f6;
            float f8 = (f5 + f6) - f7;
            f = Math.max(((measuredWidth + f6) - (measuredWidth - f6)) / layoutParams.width, f8 / layoutParams.height);
            b = ((f8 - (layoutParams.height * f)) / 2.0f) + f7;
            int measuredWidth2 = photoViewer.h0.getMeasuredWidth();
            f2 = b10.b(layoutParams.width, f, (measuredWidth2 - i6) - rect.right, 2.0f) + rect.left;
        } else {
            float measuredWidth3 = photoViewer.h0.getMeasuredWidth() / layoutParams.width;
            Point point = gm.q;
            int i8 = point.y;
            if (!photoViewer.s) {
                i = gm.m;
            } else {
                i = 0;
            }
            float min2 = Math.min(measuredWidth3, (i8 + i) / layoutParams.height);
            if (photoViewer.d2 == 11) {
                min2 = photoViewer.z1(true) * min2;
            }
            int i9 = point.y;
            if (!photoViewer.s) {
                i2 = gm.m;
            } else {
                i2 = 0;
            }
            b = b10.b(layoutParams.height, min2, i9 + i2, 2.0f);
            float b2 = b10.b(layoutParams.width, min2, photoViewer.h0.getMeasuredWidth(), 2.0f);
            photoViewer.a6 = 0.0f;
            photoViewer.e6 = 0.0f;
            f = min2;
            f2 = b2;
        }
        qb8 qb8Var = this.d;
        int abs = (int) Math.abs(this.c - qb8Var.a.L0);
        float f9 = qb8Var.a.M0;
        float f10 = this.e;
        int abs2 = (int) Math.abs(f10 - f9);
        if (qb8Var.a.S0) {
            abs = 0;
        }
        int[] iArr = new int[2];
        int i10 = 2;
        qb8Var.d.getLocationInWindow(iArr);
        float f11 = qb8Var.c + f10;
        int i11 = (int) ((iArr[1] - f11) + qb8Var.j);
        if (i11 < 0) {
            i11 = 0;
        }
        int height = (int) (((f11 + layoutParams.height) - (qb8Var.d.getHeight() + i3)) + qb8Var.i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i11, abs2);
        int max2 = Math.max(height, abs2);
        fArr[0][0] = photoViewer.i0.getScaleX();
        fArr[0][1] = photoViewer.i0.getScaleY();
        fArr[0][2] = photoViewer.i0.getTranslationX();
        fArr[0][3] = photoViewer.i0.getTranslationY();
        float[] fArr2 = fArr[0];
        float f12 = abs;
        float f13 = qb8Var.k;
        int i12 = 3;
        int i13 = 4;
        fArr2[4] = f12 * f13;
        fArr2[5] = max * f13;
        fArr2[6] = max2 * f13;
        int[] radius = photoViewer.i0.getRadius();
        int i14 = 0;
        while (i14 < i13) {
            float[] fArr3 = fArr[0];
            int i15 = i14 + 7;
            int i16 = i13;
            if (radius != null) {
                f3 = radius[i14];
            } else {
                f3 = 0.0f;
            }
            fArr3[i15] = f3;
            i14++;
            i13 = i16;
        }
        float[] fArr4 = fArr[0];
        float f14 = qb8Var.k;
        fArr4[11] = abs2 * f14;
        fArr4[12] = f12 * f14;
        float[] fArr5 = fArr[1];
        fArr5[0] = f;
        fArr5[1] = f;
        fArr5[2] = f2;
        fArr5[3] = b;
        fArr5[i13] = 0.0f;
        fArr5[5] = 0.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 0.0f;
        fArr5[8] = 0.0f;
        fArr5[9] = 0.0f;
        fArr5[10] = 0.0f;
        fArr5[11] = 0.0f;
        fArr5[12] = 0.0f;
        for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
            clippingImageView3.setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(0);
        photoViewer.f0.setAlpha(0.0f);
        photoViewer.k0.setAlpha(0.0f);
        hz7 hz7Var = new hz7(this, clippingImageViewArr, this.h, this.n, this.f, (byte) 6);
        photoViewer.o4 = hz7Var;
        if (!photoViewer.m2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.d2 != 1) {
                i12 = 2;
            }
            int length = i12 + clippingImageViewArr.length;
            if (clippingImageViewArr.length > 1) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            ArrayList arrayList = new ArrayList(length + i4);
            int i17 = 0;
            while (i17 < clippingImageViewArr.length) {
                float[] fArr6 = new float[i10];
                
                fArr6[0] = 0.0f;
                fArr6[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i17], so.f, fArr6);
                if (i17 == 0) {
                    ofFloat.addUpdateListener(new fx7(this, (byte) 6));
                }
                arrayList.add(ofFloat);
                i17++;
                i10 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.i0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, so.d, 0, 255));
            lb8 lb8Var = photoViewer.f0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(lb8Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.k0, property, 0.0f, 1.0f));
            if (photoViewer.d2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.D1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new s38(this, (byte) 12));
            photoViewer.f0.setLayerType(2, null);
            photoViewer.H1(false);
            photoViewer.n4 = System.currentTimeMillis();
            gm.c3(new a18(this, animatorSet, (byte) 13));
        } else {
            hz7Var.run();
            photoViewer.o4 = null;
            photoViewer.f0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView4 : clippingImageViewArr) {
                clippingImageView4.setAnimationProgress(1.0f);
            }
            if (photoViewer.d2 == 1) {
                photoViewer.D1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new a18(this, qb8Var, (byte) 14);
        yv1 yv1Var = photoViewer.k4;
        if (yv1Var != null && yv1Var.getFragmentView() != null) {
            yv1 yv1Var2 = photoViewer.k4;
            yv1Var2.i6();
            UndoView undoView = yv1Var2.N3;
            if (undoView != null) {
                z = true;
                undoView.d(1, false);
            } else {
                z = true;
            }
            photoViewer.k4.getFragmentView().invalidate();
            return z;
        }
        return true;
    }
}

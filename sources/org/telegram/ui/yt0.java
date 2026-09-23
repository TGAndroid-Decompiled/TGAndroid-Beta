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
public final class yt0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f39889a;
    public final ViewGroup.LayoutParams f39890b;
    public final float f39891c;
    public final wu0 d;
    public final float e;
    public final uu0 f39892f;
    public final ArrayList h;
    public final Integer f39893n;
    public final PhotoViewer f39894r;

    public yt0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, wu0 wu0Var, float f10, uu0 uu0Var, ArrayList arrayList, Integer num) {
        this.f39894r = photoViewer;
        this.f39889a = clippingImageViewArr;
        this.f39890b = layoutParams;
        this.f39891c = f7;
        this.d = wu0Var;
        this.e = f10;
        this.f39892f = uu0Var;
        this.h = arrayList;
        this.f39893n = num;
    }

    @Override
    public final boolean onPreDraw() {
        char c10;
        int i10;
        float f7;
        int i11;
        float v;
        float v9;
        int i12;
        boolean z10;
        int i13;
        float f10;
        int i14;
        int i15;
        PhotoViewer photoViewer = this.f39894r;
        Rect rect = photoViewer.f31032s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f30964k4;
        ClippingImageView[] clippingImageViewArr = this.f39889a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f30925g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i16 = photoViewer.f30892c2;
        ViewGroup.LayoutParams layoutParams = this.f39890b;
        if (i16 == 1) {
            if (!photoViewer.f31029s) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            float f11 = i14;
            float measuredHeight = (photoViewer.C1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f11;
            c10 = 0;
            float min = Math.min(photoViewer.C1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.C1.getMeasuredWidth() / 2.0f;
            float f12 = (measuredHeight / 2.0f) + f11;
            float f13 = min / 2.0f;
            float f14 = f12 - f13;
            float f15 = (f12 + f13) - f14;
            f7 = Math.max(((measuredWidth + f13) - (measuredWidth - f13)) / layoutParams.width, f15 / layoutParams.height);
            v = ((f15 - (layoutParams.height * f7)) / 2.0f) + f14;
            int measuredWidth2 = photoViewer.f30925g0.getMeasuredWidth();
            v9 = com.google.android.gms.internal.vision.e2.v(layoutParams.width, f7, (measuredWidth2 - i15) - rect.right, 2.0f) + rect.left;
        } else {
            c10 = 0;
            float measuredWidth3 = photoViewer.f30925g0.getMeasuredWidth() / layoutParams.width;
            int i17 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f31029s) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i17 + i10) / layoutParams.height);
            if (photoViewer.f30892c2 == 11) {
                f7 = photoViewer.q2(true) * min2;
            } else {
                f7 = min2;
            }
            int i18 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f31029s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            v = com.google.android.gms.internal.vision.e2.v(layoutParams.height, f7, i18 + i11, 2.0f);
            v9 = com.google.android.gms.internal.vision.e2.v(layoutParams.width, f7, photoViewer.f30925g0.getMeasuredWidth(), 2.0f);
            photoViewer.f30886b6 = 0.0f;
            photoViewer.f30923f6 = 0.0f;
        }
        wu0 wu0Var = this.d;
        int abs = (int) Math.abs(this.f39891c - wu0Var.f39094a.getImageX());
        float imageY = wu0Var.f39094a.getImageY();
        float f16 = this.e;
        int abs2 = (int) Math.abs(f16 - imageY);
        if (wu0Var.f39094a.isAspectFit()) {
            abs = 0;
        }
        int[] iArr = new int[2];
        wu0Var.d.getLocationInWindow(iArr);
        float f17 = wu0Var.f39096c + f16;
        int i19 = (int) ((iArr[1] - f17) + wu0Var.f39100j);
        if (i19 < 0) {
            i19 = 0;
        }
        int height = (int) (((f17 + layoutParams.height) - (wu0Var.d.getHeight() + i12)) + wu0Var.f39099i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i19, abs2);
        int max2 = Math.max(height, abs2);
        fArr[c10][c10] = photoViewer.f30934h0.getScaleX();
        fArr[c10][1] = photoViewer.f30934h0.getScaleY();
        fArr[c10][2] = photoViewer.f30934h0.getTranslationX();
        fArr[c10][3] = photoViewer.f30934h0.getTranslationY();
        float[] fArr2 = fArr[c10];
        float f18 = abs;
        float f19 = wu0Var.f39101k;
        int i20 = 3;
        fArr2[4] = f18 * f19;
        fArr2[5] = max * f19;
        fArr2[6] = max2 * f19;
        int[] radius = photoViewer.f30934h0.getRadius();
        for (int i21 = 0; i21 < 4; i21++) {
            float[] fArr3 = fArr[c10];
            int i22 = i21 + 7;
            if (radius != null) {
                f10 = radius[i21];
            } else {
                f10 = 0.0f;
            }
            fArr3[i22] = f10;
        }
        float[] fArr4 = fArr[c10];
        float f20 = wu0Var.f39101k;
        fArr4[11] = abs2 * f20;
        fArr4[12] = f18 * f20;
        float[] fArr5 = fArr[1];
        fArr5[c10] = f7;
        fArr5[1] = f7;
        fArr5[2] = v9;
        fArr5[3] = v;
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
        photoViewer.f30908e0.setAlpha(0.0f);
        photoViewer.f30952j0.setAlpha(0.0f);
        d90 d90Var = new d90(this, clippingImageViewArr, this.h, this.f39893n, this.f39892f, 15);
        photoViewer.f31007p4 = d90Var;
        if (!photoViewer.f30970l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f30892c2 != 1) {
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i23], org.telegram.ui.Components.s6.f27837f, 0.0f, 1.0f);
                if (i23 == 0) {
                    ofFloat.addUpdateListener(new c3(this, 23));
                }
                arrayList.add(ofFloat);
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f30934h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.s6.d, 0, 255));
            ou0 ou0Var = photoViewer.f30908e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ou0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f30952j0, property, 0.0f, 1.0f));
            if (photoViewer.f30892c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new wq0(this, 7));
            photoViewer.f30908e0.setLayerType(2, null);
            photoViewer.x2(false);
            photoViewer.f30998o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new gl0(19, this, animatorSet));
        } else {
            d90Var.run();
            photoViewer.f31007p4 = null;
            photoViewer.f30908e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
                clippingImageView3.setAnimationProgress(1.0f);
            }
            if (photoViewer.f30892c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new gl0(20, this, wu0Var);
        xn xnVar = photoViewer.l4;
        if (xnVar != null && xnVar.getFragmentView() != null) {
            xn xnVar2 = photoViewer.l4;
            xnVar2.Q7();
            UndoView undoView = xnVar2.y3;
            if (undoView != null) {
                z10 = true;
                undoView.e(1, false);
            } else {
                z10 = true;
            }
            photoViewer.l4.getFragmentView().invalidate();
            return z10;
        }
        return true;
    }
}

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
public final class st0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f43591a;
    public final ViewGroup.LayoutParams f43592b;
    public final float f43593c;
    public final qu0 d;
    public final float e;
    public final ou0 f43594f;
    public final ArrayList h;
    public final Integer f43595n;
    public final PhotoViewer f43596r;

    public st0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, qu0 qu0Var, float f10, ou0 ou0Var, ArrayList arrayList, Integer num) {
        this.f43596r = photoViewer;
        this.f43591a = clippingImageViewArr;
        this.f43592b = layoutParams;
        this.f43593c = f7;
        this.d = qu0Var;
        this.e = f10;
        this.f43594f = ou0Var;
        this.h = arrayList;
        this.f43595n = num;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        int i11;
        float f7;
        int i12;
        float f10;
        float f11;
        int i13;
        boolean z10;
        int i14;
        float f12;
        int i15;
        int i16;
        PhotoViewer photoViewer = this.f43596r;
        Rect rect = photoViewer.f35771s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f35703k4;
        ClippingImageView[] clippingImageViewArr = this.f43591a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f35664g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = photoViewer.f35630c2;
        ViewGroup.LayoutParams layoutParams = this.f43592b;
        if (i17 == 1) {
            if (!photoViewer.f35768s) {
                i15 = AndroidUtilities.statusBarHeight;
            } else {
                i15 = 0;
            }
            float f13 = i15;
            float measuredHeight = (photoViewer.C1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f13;
            i10 = 0;
            float min = Math.min(photoViewer.C1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.C1.getMeasuredWidth() / 2.0f;
            float f14 = (measuredHeight / 2.0f) + f13;
            float f15 = min / 2.0f;
            float f16 = f14 - f15;
            float f17 = (f14 + f15) - f16;
            f7 = Math.max(((measuredWidth + f15) - (measuredWidth - f15)) / layoutParams.width, f17 / layoutParams.height);
            f10 = ((f17 - (layoutParams.height * f7)) / 2.0f) + f16;
            int measuredWidth2 = photoViewer.f35664g0.getMeasuredWidth();
            f11 = c3.h0.f(layoutParams.width, f7, (measuredWidth2 - i16) - rect.right, 2.0f) + rect.left;
        } else {
            i10 = 0;
            float measuredWidth3 = photoViewer.f35664g0.getMeasuredWidth() / layoutParams.width;
            int i18 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f35768s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i18 + i11) / layoutParams.height);
            if (photoViewer.f35630c2 == 11) {
                f7 = photoViewer.t2(true) * min2;
            } else {
                f7 = min2;
            }
            int i19 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f35768s) {
                i12 = AndroidUtilities.statusBarHeight;
            } else {
                i12 = 0;
            }
            f10 = c3.h0.f(layoutParams.height, f7, i19 + i12, 2.0f);
            f11 = c3.h0.f(layoutParams.width, f7, photoViewer.f35664g0.getMeasuredWidth(), 2.0f);
            photoViewer.f35624b6 = 0.0f;
            photoViewer.f35662f6 = 0.0f;
        }
        qu0 qu0Var = this.d;
        int abs = (int) Math.abs(this.f43593c - qu0Var.f42919a.getImageX());
        float imageY = qu0Var.f42919a.getImageY();
        float f18 = this.e;
        int abs2 = (int) Math.abs(f18 - imageY);
        if (qu0Var.f42919a.isAspectFit()) {
            abs = i10;
        }
        int[] iArr = new int[2];
        int i20 = 2;
        qu0Var.d.getLocationInWindow(iArr);
        float f19 = qu0Var.f42921c + f18;
        int i21 = (int) ((iArr[1] - f19) + qu0Var.f42925j);
        if (i21 < 0) {
            i21 = i10;
        }
        int height = (int) (((f19 + layoutParams.height) - (qu0Var.d.getHeight() + i13)) + qu0Var.f42924i);
        if (height < 0) {
            height = i10;
        }
        int max = Math.max(i21, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i10][i10] = photoViewer.f35672h0.getScaleX();
        fArr[i10][1] = photoViewer.f35672h0.getScaleY();
        fArr[i10][2] = photoViewer.f35672h0.getTranslationX();
        fArr[i10][3] = photoViewer.f35672h0.getTranslationY();
        float[] fArr2 = fArr[i10];
        float f20 = abs;
        float f21 = qu0Var.f42926k;
        int i22 = 3;
        fArr2[4] = f20 * f21;
        fArr2[5] = max * f21;
        char c10 = 6;
        fArr2[6] = max2 * f21;
        int[] radius = photoViewer.f35672h0.getRadius();
        int i23 = i10;
        while (i23 < 4) {
            float[] fArr3 = fArr[i10];
            int i24 = i23 + 7;
            char c11 = c10;
            if (radius != null) {
                f12 = radius[i23];
            } else {
                f12 = 0.0f;
            }
            fArr3[i24] = f12;
            i23++;
            c10 = c11;
        }
        float[] fArr4 = fArr[i10];
        float f22 = qu0Var.f42926k;
        fArr4[11] = abs2 * f22;
        fArr4[12] = f20 * f22;
        float[] fArr5 = fArr[1];
        fArr5[i10] = f7;
        fArr5[1] = f7;
        fArr5[2] = f11;
        fArr5[3] = f10;
        fArr5[4] = 0.0f;
        fArr5[5] = 0.0f;
        fArr5[c10] = 0.0f;
        fArr5[7] = 0.0f;
        fArr5[8] = 0.0f;
        fArr5[9] = 0.0f;
        fArr5[10] = 0.0f;
        fArr5[11] = 0.0f;
        fArr5[12] = 0.0f;
        for (int i25 = i10; i25 < clippingImageViewArr.length; i25++) {
            clippingImageViewArr[i25].setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(i10);
        photoViewer.f35646e0.setAlpha(0.0f);
        photoViewer.f35690j0.setAlpha(0.0f);
        org.telegram.ui.Components.i30 i30Var = new org.telegram.ui.Components.i30(this, clippingImageViewArr, this.h, this.f43595n, this.f43594f, 23);
        photoViewer.f35746p4 = i30Var;
        if (!photoViewer.f35709l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f35630c2 != 1) {
                i22 = 2;
            }
            int length = i22 + clippingImageViewArr.length;
            if (clippingImageViewArr.length > 1) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            ArrayList arrayList = new ArrayList(length + i14);
            int i26 = 0;
            while (i26 < clippingImageViewArr.length) {
                float[] fArr6 = new float[i20];
                
                fArr6[0] = 0.0f;
                fArr6[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i26], org.telegram.ui.Components.v6.f33582f, fArr6);
                if (i26 == 0) {
                    ofFloat.addUpdateListener(new b3(this, 22));
                }
                arrayList.add(ofFloat);
                i26++;
                i20 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f35672h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.v6.d, 0, 255));
            iu0 iu0Var = photoViewer.f35646e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(iu0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f35690j0, property, 0.0f, 1.0f));
            if (photoViewer.f35630c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new i50(this, 16));
            photoViewer.f35646e0.setLayerType(2, null);
            photoViewer.A2(false);
            photoViewer.f35737o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new yl0(16, this, animatorSet));
        } else {
            i30Var.run();
            photoViewer.f35746p4 = null;
            photoViewer.f35646e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.f35630c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new yl0(17, this, qu0Var);
        un unVar = photoViewer.l4;
        if (unVar != null && unVar.getFragmentView() != null) {
            un unVar2 = photoViewer.l4;
            unVar2.X7();
            UndoView undoView = unVar2.K3;
            if (undoView != null) {
                z10 = true;
                undoView.d(1, false);
            } else {
                z10 = true;
            }
            photoViewer.l4.getFragmentView().invalidate();
            return z10;
        }
        return true;
    }
}

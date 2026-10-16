package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
public final class v9 extends ViewGroup {
    public final int f40611a = 1;
    public final Object f40612b;
    public final org.telegram.ui.ActionBar.m2 f40613c;

    public v9(z9 z9Var, Context context) {
        super(context);
        this.f40613c = z9Var;
        this.f40612b = new Path();
    }

    public static RectF a(int i10, int i11, int i12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        return rectF;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f40611a) {
            case 0:
                Path path = (Path) this.f40612b;
                boolean drawChild = super.drawChild(canvas, view, j10);
                z9 z9Var = (z9) this.f40613c;
                Paint paint = z9Var.f42232n;
                Paint paint2 = z9Var.h;
                if (z9Var.a0() && view == z9Var.f42225c) {
                    float min = Math.min(1.0f, Math.max(0.0f, ((float) (SystemClock.elapsedRealtime() - z9Var.L)) / 75.0f));
                    if (min < 1.0f) {
                        z9Var.fragmentView.invalidate();
                    }
                    RectF rectF = z9Var.J;
                    RectF rectF2 = z9Var.K;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    AndroidUtilities.lerp(rectF, rectF2, min, rectF3);
                    if (z9Var.f42226c0 < 1.0f) {
                        if (z9Var.f42227d0 == null) {
                            z9Var.h0();
                        }
                        AndroidUtilities.lerp(z9Var.f42227d0, rectF3, z9Var.f42226c0, rectF3);
                    }
                    int width = (int) (rectF3.width() * view.getWidth());
                    int height = (int) (rectF3.height() * view.getHeight());
                    int centerX = (int) (rectF3.centerX() * view.getWidth());
                    float centerY = rectF3.centerY();
                    float f7 = z9Var.E;
                    float f10 = (f7 * 0.5f) + 0.5f;
                    int i10 = (int) (width * f10);
                    int i11 = (int) (f10 * height);
                    int i12 = centerX - (i10 / 2);
                    int height2 = ((int) (centerY * view.getHeight())) - (i11 / 2);
                    paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f7) * (1.0f - z9Var.f42235w))) * 255.0f));
                    float f11 = height2;
                    canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f11, paint2);
                    int i13 = height2 + i11;
                    float f12 = i13;
                    canvas.drawRect(0.0f, f12, view.getMeasuredWidth(), view.getMeasuredHeight(), paint2);
                    float f13 = i12;
                    canvas.drawRect(0.0f, f11, f13, f12, paint2);
                    int i14 = i12 + i10;
                    float f14 = i14;
                    canvas.drawRect(f14, f11, view.getMeasuredWidth(), f12, paint2);
                    paint2.setAlpha((int) (Math.max(0.0f, 1.0f - z9Var.E) * 255.0f));
                    canvas.drawRect(f13, f11, f14, f12, paint2);
                    int lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), Math.min(1.0f, z9Var.E * 20.0f));
                    int i15 = lerp / 2;
                    int lerp2 = AndroidUtilities.lerp(Math.min(i10, i11), AndroidUtilities.dp(20.0f), Math.min(1.2f, (float) Math.pow(z9Var.E, 1.7999999523162842d)));
                    paint.setAlpha((int) (Math.min(1.0f, z9Var.E) * 255.0f));
                    path.reset();
                    int i16 = height2 + lerp2;
                    path.arcTo(a(i12, i16, i15), 0.0f, 180.0f);
                    float f15 = lerp * 1.5f;
                    int i17 = (int) (f13 + f15);
                    int i18 = (int) (f11 + f15);
                    int i19 = lerp * 2;
                    path.arcTo(a(i17, i18, i19), 180.0f, 90.0f);
                    int i20 = i12 + lerp2;
                    path.arcTo(a(i20, height2, i15), 270.0f, 180.0f);
                    path.lineTo(i12 + i15, height2 + i15);
                    path.arcTo(a(i17, i18, lerp), 270.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i14, i16, i15), 180.0f, -180.0f);
                    int i21 = (int) (f14 - f15);
                    path.arcTo(a(i21, i18, i19), 0.0f, -90.0f);
                    int i22 = i14 - lerp2;
                    path.arcTo(a(i22, height2, i15), 270.0f, -180.0f);
                    path.arcTo(a(i21, i18, lerp), 270.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    int i23 = i13 - lerp2;
                    path.arcTo(a(i12, i23, i15), 0.0f, -180.0f);
                    int i24 = (int) (f12 - f15);
                    path.arcTo(a(i17, i24, i19), 180.0f, -90.0f);
                    path.arcTo(a(i20, i13, i15), 90.0f, -180.0f);
                    path.arcTo(a(i17, i24, lerp), 90.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i14, i23, i15), 180.0f, 180.0f);
                    path.arcTo(a(i21, i24, i19), 0.0f, 90.0f);
                    path.arcTo(a(i22, i13, i15), 90.0f, 180.0f);
                    path.arcTo(a(i21, i24, lerp), 90.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    return drawChild;
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int measuredHeight;
        int dp;
        int measuredWidth;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        switch (this.f40611a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                z9 z9Var = (z9) this.f40613c;
                int i16 = z9Var.X;
                if (i16 != 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) z9Var).actionBar;
                    kVar2 = ((org.telegram.ui.ActionBar.m2) z9Var).actionBar;
                    int measuredWidth2 = kVar2.getMeasuredWidth();
                    kVar3 = ((org.telegram.ui.ActionBar.m2) z9Var).actionBar;
                    kVar.layout(0, 0, measuredWidth2, kVar3.getMeasuredHeight());
                    CameraView cameraView = z9Var.f42225c;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), z9Var.f42225c.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i14, i15) / 1.5f);
                    if (i16 == 1) {
                        measuredHeight = ((i15 - min) / 2) - z9Var.f42221a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(30.0f);
                    } else {
                        measuredHeight = ((i15 - min) / 2) - z9Var.f42221a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(64.0f);
                    }
                    int i17 = measuredHeight - dp;
                    z9Var.f42221a.layout(AndroidUtilities.dp(36.0f), i17, z9Var.f42221a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), z9Var.f42221a.getMeasuredHeight() + i17);
                    if (i16 == 3) {
                        int C = org.telegram.messenger.g0.C(8.0f, z9Var.f42221a.getMeasuredHeight(), i17);
                        z9Var.f42223b.layout(AndroidUtilities.dp(36.0f), C, z9Var.f42223b.getMeasuredWidth() + AndroidUtilities.dp(36.0f), z9Var.f42223b.getMeasuredHeight() + C);
                    }
                    z9Var.f42229f.layout(0, getMeasuredHeight() - z9Var.f42229f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    if (z9Var.W) {
                        measuredWidth = AndroidUtilities.dp(35.0f) + (i14 / 2);
                    } else {
                        measuredWidth = (i14 / 2) - (z9Var.f42234s.getMeasuredWidth() / 2);
                    }
                    int dp2 = AndroidUtilities.dp(80.0f) + i2.d.C(i15, min, 2, min);
                    ImageView imageView = z9Var.f42234s;
                    imageView.layout(measuredWidth, dp2, imageView.getMeasuredWidth() + measuredWidth, z9Var.f42234s.getMeasuredHeight() + dp2);
                    if (z9Var.f42233r != null) {
                        int dp3 = ((i14 / 2) - AndroidUtilities.dp(35.0f)) - z9Var.f42233r.getMeasuredWidth();
                        ImageView imageView2 = z9Var.f42233r;
                        imageView2.layout(dp3, dp2, imageView2.getMeasuredWidth() + dp3, z9Var.f42233r.getMeasuredHeight() + dp2);
                    }
                } else {
                    CameraView cameraView2 = z9Var.f42225c;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), z9Var.f42225c.getMeasuredHeight());
                    }
                    z9Var.f42229f.setTextSize(0, i15 / 22);
                    z9Var.f42229f.setPadding(0, 0, 0, i15 / 15);
                    int i18 = (int) (i15 * 0.65f);
                    z9Var.f42221a.layout(AndroidUtilities.dp(36.0f), i18, z9Var.f42221a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), z9Var.f42221a.getMeasuredHeight() + i18);
                }
                if (i16 != 3) {
                    int i19 = (int) (i15 * 0.74f);
                    int i20 = (int) (i14 * 0.05f);
                    TextView textView = z9Var.f42223b;
                    textView.layout(i20, i19, textView.getMeasuredWidth() + i20, z9Var.f42223b.getMeasuredHeight() + i19);
                }
                z9Var.h0();
                return;
            default:
                oh1 oh1Var = (oh1) this.f40613c;
                kVar4 = ((org.telegram.ui.ActionBar.m2) oh1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.m2) oh1Var).actionBar;
                int measuredWidth3 = kVar5.getMeasuredWidth();
                kVar6 = ((org.telegram.ui.ActionBar.m2) oh1Var).actionBar;
                kVar4.layout(0, 0, measuredWidth3, kVar6.getMeasuredHeight());
                di.p6 p6Var = oh1Var.f38675y;
                p6Var.layout(0, 0, p6Var.getMeasuredWidth(), oh1Var.f38675y.getMeasuredHeight());
                org.telegram.ui.Components.wa0 wa0Var = (org.telegram.ui.Components.wa0) this.f40612b;
                wa0Var.layout(0, 0, wa0Var.getMeasuredWidth(), wa0Var.getMeasuredHeight());
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.f40611a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                z9 z9Var = (z9) this.f40613c;
                kVar = ((org.telegram.ui.ActionBar.m2) z9Var).actionBar;
                kVar.measure(i10, i11);
                int i12 = z9Var.X;
                if (i12 == 0) {
                    CameraView cameraView = z9Var.f42225c;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                    }
                } else {
                    CameraView cameraView2 = z9Var.f42225c;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    z9Var.f42229f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    ImageView imageView = z9Var.f42233r;
                    if (imageView != null) {
                        imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                    }
                    z9Var.f42234s.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                }
                z9Var.f42221a.measure(org.telegram.messenger.sk.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i12 == 3) {
                    z9Var.f42223b.measure(org.telegram.messenger.sk.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    z9Var.f42223b.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                oh1 oh1Var = (oh1) this.f40613c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) oh1Var).actionBar;
                kVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                di.p6 p6Var = oh1Var.f38675y;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                kVar3 = ((org.telegram.ui.ActionBar.m2) oh1Var).actionBar;
                p6Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f) + kVar3.getMeasuredHeight(), 1073741824));
                ((org.telegram.ui.Components.wa0) this.f40612b).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                setMeasuredDimension(size3, size4);
                return;
        }
    }

    public v9(oh1 oh1Var, Context context, org.telegram.ui.Components.wa0 wa0Var) {
        super(context);
        this.f40613c = oh1Var;
        this.f40612b = wa0Var;
    }
}

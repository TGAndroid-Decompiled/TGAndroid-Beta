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
public final class r9 extends ViewGroup {
    public final int f40102a = 1;
    public final Object f40103b;
    public final org.telegram.ui.ActionBar.n2 f40104c;

    public r9(u9 u9Var, Context context) {
        super(context);
        this.f40104c = u9Var;
        this.f40103b = new Path();
    }

    public static RectF a(int i10, int i11, int i12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        return rectF;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f40102a) {
            case 0:
                Path path = (Path) this.f40103b;
                boolean drawChild = super.drawChild(canvas, view, j3);
                u9 u9Var = (u9) this.f40104c;
                Paint paint = u9Var.f40987n;
                Paint paint2 = u9Var.h;
                if (u9Var.a0() && view == u9Var.f40981c) {
                    float min = Math.min(1.0f, Math.max(0.0f, ((float) (SystemClock.elapsedRealtime() - u9Var.K)) / 75.0f));
                    if (min < 1.0f) {
                        u9Var.fragmentView.invalidate();
                    }
                    RectF rectF = u9Var.I;
                    RectF rectF2 = u9Var.J;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    AndroidUtilities.lerp(rectF, rectF2, min, rectF3);
                    if (u9Var.f40978a0 < 1.0f) {
                        if (u9Var.f40980b0 == null) {
                            u9Var.h0();
                        }
                        AndroidUtilities.lerp(u9Var.f40980b0, rectF3, u9Var.f40978a0, rectF3);
                    }
                    int width = (int) (rectF3.width() * view.getWidth());
                    int height = (int) (rectF3.height() * view.getHeight());
                    int centerX = (int) (rectF3.centerX() * view.getWidth());
                    float centerY = rectF3.centerY();
                    float f7 = u9Var.f40992y;
                    float f10 = (f7 * 0.5f) + 0.5f;
                    int i10 = (int) (width * f10);
                    int i11 = (int) (f10 * height);
                    int i12 = centerX - (i10 / 2);
                    int height2 = ((int) (centerY * view.getHeight())) - (i11 / 2);
                    paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f7) * (1.0f - u9Var.v))) * 255.0f));
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
                    paint2.setAlpha((int) (Math.max(0.0f, 1.0f - u9Var.f40992y) * 255.0f));
                    canvas.drawRect(f13, f11, f14, f12, paint2);
                    int lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), Math.min(1.0f, u9Var.f40992y * 20.0f));
                    int i15 = lerp / 2;
                    int lerp2 = AndroidUtilities.lerp(Math.min(i10, i11), AndroidUtilities.dp(20.0f), Math.min(1.2f, (float) Math.pow(u9Var.f40992y, 1.7999999523162842d)));
                    paint.setAlpha((int) (Math.min(1.0f, u9Var.f40992y) * 255.0f));
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
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int measuredHeight;
        int dp;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        switch (this.f40102a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                u9 u9Var = (u9) this.f40104c;
                int i16 = u9Var.V;
                if (i16 != 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) u9Var).actionBar;
                    kVar2 = ((org.telegram.ui.ActionBar.n2) u9Var).actionBar;
                    int measuredWidth = kVar2.getMeasuredWidth();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) u9Var).actionBar;
                    kVar.layout(0, 0, measuredWidth, kVar3.getMeasuredHeight());
                    CameraView cameraView = u9Var.f40981c;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), u9Var.f40981c.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i14, i15) / 1.5f);
                    if (i16 == 1) {
                        measuredHeight = ((i15 - min) / 2) - u9Var.f40977a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(30.0f);
                    } else {
                        measuredHeight = ((i15 - min) / 2) - u9Var.f40977a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(64.0f);
                    }
                    int i17 = measuredHeight - dp;
                    u9Var.f40977a.layout(AndroidUtilities.dp(36.0f), i17, u9Var.f40977a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), u9Var.f40977a.getMeasuredHeight() + i17);
                    if (i16 == 3) {
                        int C = org.telegram.messenger.w1.C(8.0f, u9Var.f40977a.getMeasuredHeight(), i17);
                        u9Var.f40979b.layout(AndroidUtilities.dp(36.0f), C, u9Var.f40979b.getMeasuredWidth() + AndroidUtilities.dp(36.0f), u9Var.f40979b.getMeasuredHeight() + C);
                    }
                    u9Var.f40986f.layout(0, getMeasuredHeight() - u9Var.f40986f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i14 / 2) - (u9Var.f40988r.getMeasuredWidth() / 2);
                    int dp2 = AndroidUtilities.dp(80.0f) + i2.g.C(i15, min, 2, min);
                    ImageView imageView = u9Var.f40988r;
                    imageView.layout(measuredWidth2, dp2, imageView.getMeasuredWidth() + measuredWidth2, u9Var.f40988r.getMeasuredHeight() + dp2);
                } else {
                    CameraView cameraView2 = u9Var.f40981c;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), u9Var.f40981c.getMeasuredHeight());
                    }
                    u9Var.f40986f.setTextSize(0, i15 / 22);
                    u9Var.f40986f.setPadding(0, 0, 0, i15 / 15);
                    int i18 = (int) (i15 * 0.65f);
                    u9Var.f40977a.layout(AndroidUtilities.dp(36.0f), i18, u9Var.f40977a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), u9Var.f40977a.getMeasuredHeight() + i18);
                }
                if (i16 != 3) {
                    int i19 = (int) (i15 * 0.74f);
                    int i20 = (int) (i14 * 0.05f);
                    TextView textView = u9Var.f40979b;
                    textView.layout(i20, i19, textView.getMeasuredWidth() + i20, u9Var.f40979b.getMeasuredHeight() + i19);
                }
                u9Var.h0();
                return;
            default:
                hh1 hh1Var = (hh1) this.f40104c;
                kVar4 = ((org.telegram.ui.ActionBar.n2) hh1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.n2) hh1Var).actionBar;
                int measuredWidth3 = kVar5.getMeasuredWidth();
                kVar6 = ((org.telegram.ui.ActionBar.n2) hh1Var).actionBar;
                kVar4.layout(0, 0, measuredWidth3, kVar6.getMeasuredHeight());
                di.r6 r6Var = hh1Var.f37022y;
                r6Var.layout(0, 0, r6Var.getMeasuredWidth(), hh1Var.f37022y.getMeasuredHeight());
                org.telegram.ui.Components.w90 w90Var = (org.telegram.ui.Components.w90) this.f40103b;
                w90Var.layout(0, 0, w90Var.getMeasuredWidth(), w90Var.getMeasuredHeight());
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.f40102a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                u9 u9Var = (u9) this.f40104c;
                kVar = ((org.telegram.ui.ActionBar.n2) u9Var).actionBar;
                kVar.measure(i10, i11);
                int i12 = u9Var.V;
                if (i12 == 0) {
                    CameraView cameraView = u9Var.f40981c;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                    }
                } else {
                    CameraView cameraView2 = u9Var.f40981c;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    u9Var.f40986f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    u9Var.f40988r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                }
                u9Var.f40977a.measure(org.telegram.messenger.wl.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i12 == 3) {
                    u9Var.f40979b.measure(org.telegram.messenger.wl.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    u9Var.f40979b.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                hh1 hh1Var = (hh1) this.f40104c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) hh1Var).actionBar;
                kVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                di.r6 r6Var = hh1Var.f37022y;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                kVar3 = ((org.telegram.ui.ActionBar.n2) hh1Var).actionBar;
                r6Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f) + kVar3.getMeasuredHeight(), 1073741824));
                ((org.telegram.ui.Components.w90) this.f40103b).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                setMeasuredDimension(size3, size4);
                return;
        }
    }

    public r9(hh1 hh1Var, Context context, org.telegram.ui.Components.w90 w90Var) {
        super(context);
        this.f40104c = hh1Var;
        this.f40103b = w90Var;
    }
}

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
public final class t9 extends ViewGroup {
    public final int f41620a = 1;
    public final Object f41621b;
    public final org.telegram.ui.ActionBar.n2 f41622c;

    public t9(w9 w9Var, Context context) {
        super(context);
        this.f41622c = w9Var;
        this.f41621b = new Path();
    }

    public static RectF a(int i10, int i11, int i12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        return rectF;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f41620a) {
            case 0:
                Path path = (Path) this.f41621b;
                boolean drawChild = super.drawChild(canvas, view, j10);
                w9 w9Var = (w9) this.f41622c;
                Paint paint = w9Var.f42512r;
                Paint paint2 = w9Var.f42511n;
                if (w9Var.a0() && view == w9Var.d) {
                    float min = Math.min(1.0f, Math.max(0.0f, ((float) (SystemClock.elapsedRealtime() - w9Var.L)) / 75.0f));
                    if (min < 1.0f) {
                        w9Var.fragmentView.invalidate();
                    }
                    RectF rectF = w9Var.J;
                    RectF rectF2 = w9Var.K;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    AndroidUtilities.lerp(rectF, rectF2, min, rectF3);
                    if (w9Var.f42504b0 < 1.0f) {
                        if (w9Var.f42506c0 == null) {
                            w9Var.h0();
                        }
                        AndroidUtilities.lerp(w9Var.f42506c0, rectF3, w9Var.f42504b0, rectF3);
                    }
                    int width = (int) (rectF3.width() * view.getWidth());
                    int height = (int) (rectF3.height() * view.getHeight());
                    int centerX = (int) (rectF3.centerX() * view.getWidth());
                    float centerY = rectF3.centerY();
                    float f7 = w9Var.E;
                    float f10 = (f7 * 0.5f) + 0.5f;
                    int i10 = (int) (width * f10);
                    int i11 = (int) (f10 * height);
                    int i12 = centerX - (i10 / 2);
                    int height2 = ((int) (centerY * view.getHeight())) - (i11 / 2);
                    paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f7) * (1.0f - w9Var.f42514w))) * 255.0f));
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
                    paint2.setAlpha((int) (Math.max(0.0f, 1.0f - w9Var.E) * 255.0f));
                    canvas.drawRect(f13, f11, f14, f12, paint2);
                    int lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), Math.min(1.0f, w9Var.E * 20.0f));
                    int i15 = lerp / 2;
                    int lerp2 = AndroidUtilities.lerp(Math.min(i10, i11), AndroidUtilities.dp(20.0f), Math.min(1.2f, (float) Math.pow(w9Var.E, 1.7999999523162842d)));
                    paint.setAlpha((int) (Math.min(1.0f, w9Var.E) * 255.0f));
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
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        switch (this.f41620a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                w9 w9Var = (w9) this.f41622c;
                int i16 = w9Var.W;
                if (i16 != 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) w9Var).actionBar;
                    kVar2 = ((org.telegram.ui.ActionBar.n2) w9Var).actionBar;
                    int measuredWidth = kVar2.getMeasuredWidth();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) w9Var).actionBar;
                    kVar.layout(0, 0, measuredWidth, kVar3.getMeasuredHeight());
                    CameraView cameraView = w9Var.d;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), w9Var.d.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i14, i15) / 1.5f);
                    if (i16 == 1) {
                        measuredHeight = ((i15 - min) / 2) - w9Var.f42503b.getMeasuredHeight();
                        dp = AndroidUtilities.dp(30.0f);
                    } else {
                        measuredHeight = ((i15 - min) / 2) - w9Var.f42503b.getMeasuredHeight();
                        dp = AndroidUtilities.dp(64.0f);
                    }
                    int i17 = measuredHeight - dp;
                    w9Var.f42503b.layout(AndroidUtilities.dp(36.0f), i17, w9Var.f42503b.getMeasuredWidth() + AndroidUtilities.dp(36.0f), w9Var.f42503b.getMeasuredHeight() + i17);
                    if (i16 == 3) {
                        int C = org.telegram.messenger.g0.C(8.0f, w9Var.f42503b.getMeasuredHeight(), i17);
                        w9Var.f42505c.layout(AndroidUtilities.dp(36.0f), C, w9Var.f42505c.getMeasuredWidth() + AndroidUtilities.dp(36.0f), w9Var.f42505c.getMeasuredHeight() + C);
                    }
                    w9Var.h.layout(0, getMeasuredHeight() - w9Var.h.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i14 / 2) - (w9Var.f42513s.getMeasuredWidth() / 2);
                    int dp2 = AndroidUtilities.dp(80.0f) + i2.e.C(i15, min, 2, min);
                    ImageView imageView = w9Var.f42513s;
                    imageView.layout(measuredWidth2, dp2, imageView.getMeasuredWidth() + measuredWidth2, w9Var.f42513s.getMeasuredHeight() + dp2);
                } else {
                    CameraView cameraView2 = w9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), w9Var.d.getMeasuredHeight());
                    }
                    w9Var.h.setTextSize(0, i15 / 22);
                    w9Var.h.setPadding(0, 0, 0, i15 / 15);
                    int i18 = (int) (i15 * 0.65f);
                    w9Var.f42503b.layout(AndroidUtilities.dp(36.0f), i18, w9Var.f42503b.getMeasuredWidth() + AndroidUtilities.dp(36.0f), w9Var.f42503b.getMeasuredHeight() + i18);
                }
                if (i16 != 3) {
                    int i19 = (int) (i15 * 0.74f);
                    int i20 = (int) (i14 * 0.05f);
                    TextView textView = w9Var.f42505c;
                    textView.layout(i20, i19, textView.getMeasuredWidth() + i20, w9Var.f42505c.getMeasuredHeight() + i19);
                }
                w9Var.h0();
                return;
            default:
                vf1 vf1Var = (vf1) this.f41622c;
                kVar4 = ((org.telegram.ui.ActionBar.n2) vf1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.n2) vf1Var).actionBar;
                int measuredWidth3 = kVar5.getMeasuredWidth();
                kVar6 = ((org.telegram.ui.ActionBar.n2) vf1Var).actionBar;
                kVar4.layout(0, 0, measuredWidth3, kVar6.getMeasuredHeight());
                ei.g6 g6Var = vf1Var.f42249y;
                g6Var.layout(0, 0, g6Var.getMeasuredWidth(), vf1Var.f42249y.getMeasuredHeight());
                org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) this.f41621b;
                qa0Var.layout(0, 0, qa0Var.getMeasuredWidth(), qa0Var.getMeasuredHeight());
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.f41620a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                w9 w9Var = (w9) this.f41622c;
                kVar = ((org.telegram.ui.ActionBar.n2) w9Var).actionBar;
                kVar.measure(i10, i11);
                int i12 = w9Var.W;
                if (i12 == 0) {
                    CameraView cameraView = w9Var.d;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                    }
                } else {
                    CameraView cameraView2 = w9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    w9Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    w9Var.f42513s.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                }
                w9Var.f42503b.measure(org.telegram.messenger.mk.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i12 == 3) {
                    w9Var.f42505c.measure(org.telegram.messenger.mk.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    w9Var.f42505c.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                vf1 vf1Var = (vf1) this.f41622c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) vf1Var).actionBar;
                kVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                ei.g6 g6Var = vf1Var.f42249y;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                kVar3 = ((org.telegram.ui.ActionBar.n2) vf1Var).actionBar;
                g6Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f) + kVar3.getMeasuredHeight(), 1073741824));
                ((org.telegram.ui.Components.qa0) this.f41621b).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                setMeasuredDimension(size3, size4);
                return;
        }
    }

    public t9(vf1 vf1Var, Context context, org.telegram.ui.Components.qa0 qa0Var) {
        super(context);
        this.f41622c = vf1Var;
        this.f41621b = qa0Var;
    }
}

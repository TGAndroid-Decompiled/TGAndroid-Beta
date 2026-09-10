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
    public final int f36263a = 1;
    public final Object f36264b;
    public final org.telegram.ui.ActionBar.p2 f36265c;

    public r9(u9 u9Var, Context context) {
        super(context);
        this.f36265c = u9Var;
        this.f36264b = new Path();
    }

    public static RectF a(int i10, int i11, int i12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        return rectF;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f36263a) {
            case 0:
                Path path = (Path) this.f36264b;
                boolean drawChild = super.drawChild(canvas, view, j3);
                u9 u9Var = (u9) this.f36265c;
                Paint paint = u9Var.f37169n;
                Paint paint2 = u9Var.h;
                if (u9Var.a0() && view == u9Var.f37164c) {
                    float min = Math.min(1.0f, Math.max(0.0f, ((float) (SystemClock.elapsedRealtime() - u9Var.K)) / 75.0f));
                    if (min < 1.0f) {
                        u9Var.fragmentView.invalidate();
                    }
                    RectF rectF = u9Var.I;
                    RectF rectF2 = u9Var.J;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    AndroidUtilities.lerp(rectF, rectF2, min, rectF3);
                    if (u9Var.f37161a0 < 1.0f) {
                        if (u9Var.f37163b0 == null) {
                            u9Var.h0();
                        }
                        AndroidUtilities.lerp(u9Var.f37163b0, rectF3, u9Var.f37161a0, rectF3);
                    }
                    int width = (int) (rectF3.width() * view.getWidth());
                    int height = (int) (rectF3.height() * view.getHeight());
                    int centerX = (int) (rectF3.centerX() * view.getWidth());
                    float centerY = rectF3.centerY();
                    float f7 = u9Var.f37174y;
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
                    paint2.setAlpha((int) (Math.max(0.0f, 1.0f - u9Var.f37174y) * 255.0f));
                    canvas.drawRect(f13, f11, f14, f12, paint2);
                    int lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), Math.min(1.0f, u9Var.f37174y * 20.0f));
                    int i15 = lerp / 2;
                    int lerp2 = AndroidUtilities.lerp(Math.min(i10, i11), AndroidUtilities.dp(20.0f), Math.min(1.2f, (float) Math.pow(u9Var.f37174y, 1.7999999523162842d)));
                    paint.setAlpha((int) (Math.min(1.0f, u9Var.f37174y) * 255.0f));
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        int measuredHeight;
        int dp;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        switch (this.f36263a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                u9 u9Var = (u9) this.f36265c;
                int i16 = u9Var.V;
                if (i16 != 0) {
                    lVar = ((org.telegram.ui.ActionBar.p2) u9Var).actionBar;
                    lVar2 = ((org.telegram.ui.ActionBar.p2) u9Var).actionBar;
                    int measuredWidth = lVar2.getMeasuredWidth();
                    lVar3 = ((org.telegram.ui.ActionBar.p2) u9Var).actionBar;
                    lVar.layout(0, 0, measuredWidth, lVar3.getMeasuredHeight());
                    CameraView cameraView = u9Var.f37164c;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), u9Var.f37164c.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i14, i15) / 1.5f);
                    if (i16 == 1) {
                        measuredHeight = ((i15 - min) / 2) - u9Var.f37160a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(30.0f);
                    } else {
                        measuredHeight = ((i15 - min) / 2) - u9Var.f37160a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(64.0f);
                    }
                    int i17 = measuredHeight - dp;
                    u9Var.f37160a.layout(AndroidUtilities.dp(36.0f), i17, u9Var.f37160a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), u9Var.f37160a.getMeasuredHeight() + i17);
                    if (i16 == 3) {
                        int C = org.telegram.messenger.a2.C(8.0f, u9Var.f37160a.getMeasuredHeight(), i17);
                        u9Var.f37162b.layout(AndroidUtilities.dp(36.0f), C, u9Var.f37162b.getMeasuredWidth() + AndroidUtilities.dp(36.0f), u9Var.f37162b.getMeasuredHeight() + C);
                    }
                    u9Var.f37168f.layout(0, getMeasuredHeight() - u9Var.f37168f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i14 / 2) - (u9Var.f37170r.getMeasuredWidth() / 2);
                    int dp2 = AndroidUtilities.dp(80.0f) + hc.b.C(i15, min, 2, min);
                    ImageView imageView = u9Var.f37170r;
                    imageView.layout(measuredWidth2, dp2, imageView.getMeasuredWidth() + measuredWidth2, u9Var.f37170r.getMeasuredHeight() + dp2);
                } else {
                    CameraView cameraView2 = u9Var.f37164c;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), u9Var.f37164c.getMeasuredHeight());
                    }
                    u9Var.f37168f.setTextSize(0, i15 / 22);
                    u9Var.f37168f.setPadding(0, 0, 0, i15 / 15);
                    int i18 = (int) (i15 * 0.65f);
                    u9Var.f37160a.layout(AndroidUtilities.dp(36.0f), i18, u9Var.f37160a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), u9Var.f37160a.getMeasuredHeight() + i18);
                }
                if (i16 != 3) {
                    int i19 = (int) (i15 * 0.74f);
                    int i20 = (int) (i14 * 0.05f);
                    TextView textView = u9Var.f37162b;
                    textView.layout(i20, i19, textView.getMeasuredWidth() + i20, u9Var.f37162b.getMeasuredHeight() + i19);
                }
                u9Var.h0();
                return;
            default:
                mh1 mh1Var = (mh1) this.f36265c;
                lVar4 = ((org.telegram.ui.ActionBar.p2) mh1Var).actionBar;
                lVar5 = ((org.telegram.ui.ActionBar.p2) mh1Var).actionBar;
                int measuredWidth3 = lVar5.getMeasuredWidth();
                lVar6 = ((org.telegram.ui.ActionBar.p2) mh1Var).actionBar;
                lVar4.layout(0, 0, measuredWidth3, lVar6.getMeasuredHeight());
                bi.s7 s7Var = mh1Var.f34971y;
                s7Var.layout(0, 0, s7Var.getMeasuredWidth(), mh1Var.f34971y.getMeasuredHeight());
                org.telegram.ui.Components.fa0 fa0Var = (org.telegram.ui.Components.fa0) this.f36264b;
                fa0Var.layout(0, 0, fa0Var.getMeasuredWidth(), fa0Var.getMeasuredHeight());
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.f36263a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                u9 u9Var = (u9) this.f36265c;
                lVar = ((org.telegram.ui.ActionBar.p2) u9Var).actionBar;
                lVar.measure(i10, i11);
                int i12 = u9Var.V;
                if (i12 == 0) {
                    CameraView cameraView = u9Var.f37164c;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                    }
                } else {
                    CameraView cameraView2 = u9Var.f37164c;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    u9Var.f37168f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    u9Var.f37170r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                }
                u9Var.f37160a.measure(org.telegram.messenger.em.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i12 == 3) {
                    u9Var.f37162b.measure(org.telegram.messenger.em.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    u9Var.f37162b.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                mh1 mh1Var = (mh1) this.f36265c;
                lVar2 = ((org.telegram.ui.ActionBar.p2) mh1Var).actionBar;
                lVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                bi.s7 s7Var = mh1Var.f34971y;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                lVar3 = ((org.telegram.ui.ActionBar.p2) mh1Var).actionBar;
                s7Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f) + lVar3.getMeasuredHeight(), 1073741824));
                ((org.telegram.ui.Components.fa0) this.f36264b).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                setMeasuredDimension(size3, size4);
                return;
        }
    }

    public r9(mh1 mh1Var, Context context, org.telegram.ui.Components.fa0 fa0Var) {
        super(context);
        this.f36265c = mh1Var;
        this.f36264b = fa0Var;
    }
}

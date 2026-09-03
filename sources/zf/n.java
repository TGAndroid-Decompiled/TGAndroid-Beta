package zf;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import dg.t1;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.vd1;
import org.telegram.ui.web.e0;
import qh.ta;
public class n extends FrameLayout implements a {
    public float B;
    public boolean C;
    public final b D;
    public final float[] E;
    public boolean F;
    public boolean G;
    public int H;
    public l I;
    public m J;
    public final RectF K;
    public final RectF L;
    public final CropAreaView f51201a;
    public final ImageView f51202b;
    public final Matrix f51203c;
    public x61 d;
    public f f51204e;
    public final RectF f51205f;
    public final RectF h;
    public float f51206n;
    public final boolean f51207r;
    public final e0 f51208s;
    public final Matrix v;
    public Bitmap f51209w;
    public boolean f51210x;
    public float f51211y;

    public n(Context context) {
        super(context);
        this.E = new float[9];
        this.K = new RectF();
        this.L = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z4 = context instanceof BubbleActivity;
        this.f51207r = z4;
        this.f51205f = new RectF();
        this.h = new RectF();
        this.f51203c = new Matrix();
        e0 e0Var = new e0(23);
        e0Var.f42491b = new float[8];
        this.f51208s = e0Var;
        this.v = new Matrix();
        this.C = false;
        ImageView imageView = new ImageView(context);
        this.f51202b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        b bVar = new b(context);
        this.D = bVar;
        bVar.f51140b = this;
        ?? viewGroup = new ViewGroup(context);
        viewGroup.d = new RectF();
        viewGroup.f24852e = new RectF();
        viewGroup.f24854f = new RectF();
        viewGroup.h = new RectF();
        viewGroup.f24862n = new RectF();
        viewGroup.f24867r = new RectF();
        viewGroup.f24868s = new RectF();
        viewGroup.v = new RectF();
        viewGroup.f24870x = new RectF();
        viewGroup.f24871y = new RectF();
        viewGroup.H = -1.0f;
        viewGroup.I = 1.0f;
        viewGroup.J = -1.0f;
        viewGroup.R = new AccelerateDecelerateInterpolator();
        viewGroup.f24850c0 = true;
        viewGroup.f24858i0 = new RectF();
        viewGroup.f24860k0 = 0.0f;
        viewGroup.f24861l0 = 1.0f;
        viewGroup.m0 = 0.0f;
        viewGroup.f24863n0 = 0.0f;
        viewGroup.U = z4;
        viewGroup.G = true;
        viewGroup.F = true;
        viewGroup.S = AndroidUtilities.dp(16.0f);
        viewGroup.T = AndroidUtilities.dp(32.0f);
        viewGroup.f24866q0 = 1;
        Paint paint = new Paint();
        viewGroup.L = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        viewGroup.M = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint paint3 = new Paint();
        viewGroup.N = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        Paint paint4 = new Paint();
        viewGroup.O = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        viewGroup.P = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        viewGroup.f24853e0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        viewGroup.Q = paint7;
        paint7.setColor(-1);
        viewGroup.setWillNotDraw(false);
        this.f51201a = viewGroup;
        viewGroup.setListener(this);
        addView(viewGroup);
    }

    public static void a(n nVar, Integer[][] numArr, int i10) {
        float f10;
        float f11;
        nVar.F = false;
        if (i10 != 0) {
            if (i10 != 1) {
                Integer[] numArr2 = numArr[i10 - 2];
                if (nVar.f51201a.getAspectRatio() > 1.0f) {
                    nVar.setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
                    return;
                } else {
                    nVar.setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
                    return;
                }
            }
            nVar.setLockedAspectRatio(1.0f);
            return;
        }
        l lVar = nVar.I;
        int i11 = ((lVar.f51196g % 180.0f) > 0.0f ? 1 : ((lVar.f51196g % 180.0f) == 0.0f ? 0 : -1));
        if (i11 != 0) {
            f10 = lVar.f51192b;
        } else {
            f10 = lVar.f51191a;
        }
        if (i11 != 0) {
            f11 = lVar.f51191a;
        } else {
            f11 = lVar.f51192b;
        }
        nVar.setLockedAspectRatio(f10 / f11);
    }

    public static void c(java.lang.String r19, android.graphics.Canvas r20, android.graphics.Bitmap r21, android.graphics.Matrix r22, int r23, int r24, float r25, float r26, float r27, float r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: zf.n.c(java.lang.String, android.graphics.Canvas, android.graphics.Bitmap, android.graphics.Matrix, int, int, float, float, float, float, java.util.ArrayList):void");
    }

    public static float f(RectF rectF, float f10, float f11) {
        float width = rectF.width() * f11;
        float height = rectF.height() * f11;
        float width2 = rectF.left + ((rectF.width() - width) / 2.0f);
        float height2 = rectF.top + ((rectF.height() - height) / 2.0f);
        rectF.set(width2, height2, width + width2, height + height2);
        return f10 * f11;
    }

    public static void g(RectF rectF, RectF rectF2, PointF pointF, float f10) {
        float f11 = rectF2.left;
        float f12 = rectF2.top;
        float f13 = rectF2.right;
        float f14 = rectF2.bottom;
        float f15 = rectF.left;
        if (f15 > f11) {
            f13 += f15 - f11;
            f11 = f15;
        }
        float f16 = rectF.top;
        if (f16 > f12) {
            f14 += f16 - f12;
            f12 = f16;
        }
        float f17 = rectF.right;
        if (f17 < f13) {
            f11 += f17 - f13;
        }
        float f18 = rectF.bottom;
        if (f18 < f14) {
            f12 += f18 - f14;
        }
        double d = f10;
        double d10 = 1.5707963267948966d - d;
        double centerX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f11);
        float cos = (float) (Math.cos(d10) * centerX);
        double d11 = d + 1.5707963267948966d;
        double centerY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f12);
        pointF.set(pointF.x + ((float) (Math.sin(d10) * centerX)) + ((float) (Math.cos(d11) * centerY)), pointF.y + cos + ((float) (Math.sin(d11) * centerY)));
    }

    public static String h(String str) {
        File directory = FileLoader.getDirectory(4);
        File file = new File(directory, SharedConfig.getLastLocalId() + "_temp.jpg");
        try {
            AndroidUtilities.copyFile(new File(str), file);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        return file.getAbsolutePath();
    }

    public static float n(RectF rectF, RectF rectF2) {
        float width = rectF2.width();
        if (((float) Math.floor((rectF.height() * width) / rectF.width())) > rectF2.height()) {
            return (float) Math.floor((rectF.width() * rectF2.height()) / rectF.height());
        }
        return width;
    }

    private void setLockedAspectRatio(float f10) {
        CropAreaView cropAreaView = this.f51201a;
        cropAreaView.setLockedAspectRatio(f10);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f10);
        d(rectF);
        m mVar = this.J;
        if (mVar != null) {
            mVar.N(false);
            this.J.F(true);
        }
    }

    public final void b(MediaController.CropState cropState) {
        RectF rectF;
        float f10;
        int i10;
        int i11;
        float f11;
        CropAreaView cropAreaView = this.f51201a;
        cropAreaView.d(this.K);
        int ceil = (int) Math.ceil(n(rectF, this.L));
        int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.I.f51199k;
        float[] fArr = this.E;
        matrix.getValues(fArr);
        l lVar = this.I;
        float f12 = lVar.f51195f * cropWidth;
        cropState.transformRotation = (int) lVar.h;
        if (BuildVars.LOGS_ENABLED) {
            l.d.t(cropState.transformRotation, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i10 = cropState.transformRotation;
            if (i10 >= 0) {
                break;
            }
            cropState.transformRotation = i10 + 360;
        }
        if (i10 != 90 && i10 != 270) {
            l lVar2 = this.I;
            i11 = (int) lVar2.f51191a;
            f11 = lVar2.f51192b;
        } else {
            l lVar3 = this.I;
            i11 = (int) lVar3.f51192b;
            f11 = lVar3.f51191a;
        }
        int i12 = (int) f11;
        float f13 = i11;
        cropState.cropPw = (float) (ceil / Math.ceil(f13 * f12));
        float f14 = i12;
        float ceil3 = (float) (ceil2 / Math.ceil(f12 * f14));
        cropState.cropPh = ceil3;
        float f15 = cropState.cropPw;
        if (f15 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f15, ceil3);
            cropState.cropPw /= max;
            cropState.cropPh /= max;
        }
        cropState.cropScale = Math.min(f13 / cropAreaView.getCropWidth(), f14 / cropAreaView.getCropHeight()) * this.I.f51194e;
        float f16 = fArr[2] / f13;
        l lVar4 = this.I;
        float f17 = lVar4.f51194e;
        cropState.cropPx = f16 / f17;
        cropState.cropPy = (fArr[5] / f14) / f17;
        cropState.cropRotate = lVar4.f51197i;
        cropState.stateScale = f17;
        cropState.mirrored = lVar4.f51198j;
        cropState.scale = cropWidth;
        cropState.matrix = lVar4.f51199k;
        cropState.width = ceil;
        cropState.height = ceil2;
        cropState.freeform = this.f51210x;
        cropState.lockedAspectRatio = cropAreaView.getLockAspectRatio();
        cropState.initied = true;
    }

    public final void d(RectF rectF) {
        boolean z4;
        int i10;
        if (this.I == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.f51201a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f10 = this.I.f51194e;
        if (f10 * max > 30.0f) {
            max = 30.0f / f10;
            z4 = true;
        } else {
            z4 = false;
        }
        float f11 = max;
        if (!this.f51207r) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float centerX = rectF.centerX();
        ImageView imageView = this.f51202b;
        float a2 = l.a(this.I) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = l.b(this.I) * ((rectF.centerY() - ((((imageView.getHeight() - this.f51211y) + i10) + this.B) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new g(this, f11, fArr, a2, b10, 0));
        ofFloat.addListener(new vd1(17, this, z4));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.R;
        AnimatorSet animatorSet = cropAreaView.f24857h0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f24857h0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.f24857h0 = animatorSet2;
        animatorSet2.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cropAreaView, "cropLeft", rectF.left);
        ofFloat2.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cropAreaView, "cropTop", rectF.top);
        ofFloat3.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cropAreaView, "cropRight", rectF.right);
        ofFloat4.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cropAreaView, "cropBottom", rectF.bottom);
        ofFloat5.setInterpolator(accelerateDecelerateInterpolator);
        ofFloat.setInterpolator(accelerateDecelerateInterpolator);
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat);
        animatorSet2.addListener(new ex0(23, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z4, boolean z10, boolean z11, boolean z12) {
        float f10;
        long j10;
        if (this.I != null) {
            CropAreaView cropAreaView = this.f51201a;
            float cropWidth = cropAreaView.getCropWidth();
            float cropHeight = cropAreaView.getCropHeight();
            float a2 = l.a(this.I);
            float b10 = l.b(this.I);
            float f11 = this.I.f51197i;
            float radians = (float) Math.toRadians(f11);
            RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
            Matrix matrix = new Matrix();
            matrix.postRotate(f11, cropWidth / 2.0f, cropHeight / 2.0f);
            matrix.mapRect(rectF);
            RectF rectF2 = new RectF(0.0f, 0.0f, a2, b10);
            float f12 = (cropWidth - a2) / 2.0f;
            l lVar = this.I;
            float f13 = lVar.f51194e;
            e0 e0Var = this.f51208s;
            float[] fArr = (float[]) e0Var.f42491b;
            float[] fArr2 = (float[]) e0Var.f42491b;
            float f14 = rectF2.left;
            fArr[0] = f14;
            float f15 = rectF2.top;
            fArr[1] = f15;
            float f16 = rectF2.right;
            fArr[2] = f16;
            fArr[3] = f15;
            fArr[4] = f16;
            float f17 = rectF2.bottom;
            fArr[5] = f17;
            fArr[6] = f14;
            fArr[7] = f17;
            Matrix matrix2 = new Matrix();
            matrix2.set(lVar.f51199k);
            matrix2.preTranslate(f12 / f13, ((cropHeight - b10) / 2.0f) / f13);
            Matrix matrix3 = this.v;
            matrix3.reset();
            matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
            matrix3.setConcat(matrix3, matrix2);
            matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
            matrix3.mapPoints(fArr2);
            matrix3.reset();
            matrix3.preRotate(-f11, a2 / 2.0f, b10 / 2.0f);
            matrix3.mapPoints(fArr2);
            rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
            l lVar2 = this.I;
            PointF pointF = new PointF(lVar2.f51193c, lVar2.d);
            if (!rectF2.contains(rectF)) {
                if (z4 && (rectF.width() > rectF2.width() || rectF.height() > rectF2.height())) {
                    f10 = f(rectF2, f13, rectF.width() / n(rectF, rectF2));
                } else {
                    f10 = f13;
                }
                g(rectF2, rectF, pointF, radians);
            } else if (z10 && this.f51206n > 0.0f) {
                float width = rectF.width() / n(rectF, rectF2);
                if (this.I.f51194e * width < this.f51206n) {
                    width = 1.0f;
                }
                f10 = f(rectF2, f13, width);
                g(rectF2, rectF, pointF, radians);
            } else {
                f10 = f13;
            }
            float f18 = pointF.x;
            l lVar3 = this.I;
            float f19 = f18 - lVar3.f51193c;
            float f20 = pointF.y - lVar3.d;
            if (z11) {
                float f21 = f10 / f13;
                if (Math.abs(f21 - 1.0f) < 1.0E-5f && Math.abs(f19) < 1.0E-5f && Math.abs(f20) < 1.0E-5f) {
                    return;
                }
                this.C = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new g(this, f19, new float[]{1.0f, 0.0f, 0.0f}, f20, f21, 1));
                ofFloat.addListener(new k(this, z12, z4, z10, z11));
                ofFloat.setInterpolator(cropAreaView.getInterpolator());
                if (z12) {
                    j10 = 100;
                } else {
                    j10 = 200;
                }
                ofFloat.setDuration(j10);
                ofFloat.start();
                return;
            }
            l.f(lVar3, f19, f20);
            l.g(this.I, f10 / f13, 0.0f, 0.0f);
            r(false);
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.f51201a;
        RectF rectF = this.K;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.f51201a.getCropHeight();
    }

    public float getCropLeft() {
        return this.f51201a.getCropLeft();
    }

    public float getCropTop() {
        return this.f51201a.getCropTop();
    }

    public float getCropWidth() {
        return this.f51201a.getCropWidth();
    }

    public int getCurrentHeight() {
        x61 x61Var = this.d;
        if (x61Var != null) {
            return x61Var.getVideoHeight();
        }
        Bitmap bitmap = this.f51209w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.H;
        if (i10 != 90 && i10 != 270) {
            return bitmap.getHeight();
        }
        return bitmap.getWidth();
    }

    public int getCurrentWidth() {
        x61 x61Var = this.d;
        if (x61Var != null) {
            return x61Var.getVideoWidth();
        }
        Bitmap bitmap = this.f51209w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.H;
        if (i10 != 90 && i10 != 270) {
            return bitmap.getWidth();
        }
        return bitmap.getHeight();
    }

    public float getStateFullOrientation() {
        l lVar = this.I;
        if (lVar == null) {
            return 0.0f;
        }
        return lVar.f51196g + lVar.h;
    }

    public boolean getStateMirror() {
        l lVar = this.I;
        if (lVar != null && lVar.f51198j) {
            return true;
        }
        return false;
    }

    public float getStateOrientation() {
        l lVar = this.I;
        if (lVar == null) {
            return 0.0f;
        }
        return lVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        l lVar = this.I;
        if (lVar == null) {
            return;
        }
        final float f10 = lVar.f51195f;
        CropAreaView cropAreaView = this.f51201a;
        AnimatorSet animatorSet = cropAreaView.f24857h0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f24857h0 = null;
        }
        l lVar2 = this.I;
        if ((lVar2.h + lVar2.f51196g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f11 = currentWidth / currentHeight;
        float f12 = 1.0f;
        if (!this.f51210x) {
            f11 = 1.0f;
        }
        cropAreaView.a(this.h, f11);
        if (this.f51210x) {
            f12 = 0.0f;
        }
        cropAreaView.setLockedAspectRatio(f12);
        this.f51206n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.f24870x);
        l lVar3 = this.I;
        final float f13 = lVar3.f51193c;
        final float f14 = lVar3.d;
        final float f15 = lVar3.f51194e;
        final float f16 = lVar3.f51197i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n nVar = n.this;
                if (nVar.I == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = nVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                AndroidUtilities.lerp(rectF4, rectF3, floatValue, rectF5);
                nVar.f51201a.setActualRect(rectF5);
                l lVar4 = nVar.I;
                float f17 = 1.0f - floatValue;
                float f18 = lVar4.f51193c - (f13 * f17);
                float f19 = lVar4.d - (f14 * f17);
                float f20 = lVar4.f51197i - (f16 * f17);
                float lerp = AndroidUtilities.lerp(f15, f10, floatValue);
                l lVar5 = nVar.I;
                l.f(lVar5, -f18, -f19);
                l.g(nVar.I, lerp / lVar5.f51194e, 0.0f, 0.0f);
                l.e(nVar.I, -f20);
                nVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        l lVar = this.I;
        boolean z4 = false;
        if (lVar == null) {
            return false;
        }
        lVar.f51198j = !lVar.f51198j;
        r(false);
        m mVar = this.J;
        if (mVar != null) {
            l lVar2 = this.I;
            float f10 = lVar2.h;
            float f11 = lVar2.f51196g;
            float f12 = ((f10 + f11) - f11) % 360.0f;
            if (!l.c(lVar2) && f12 == 0.0f && this.f51201a.getLockAspectRatio() == 0.0f && !this.I.f51198j) {
                z4 = true;
            }
            mVar.N(z4);
        }
        return this.I.f51198j;
    }

    public final void k() {
        this.f51201a.g(2, false);
        if (this.f51206n < 1.0E-5f) {
            this.f51206n = this.I.f51194e;
        }
    }

    public final void l(boolean z4) {
        boolean z10;
        float f10;
        CropAreaView cropAreaView = this.f51201a;
        AnimatorSet animatorSet = cropAreaView.f24857h0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f24857h0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        l lVar = this.I;
        if (lVar != null && lVar.f51196g % 180.0f != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        cropAreaView.e(currentWidth, currentHeight, z10, this.f51210x);
        if (this.f51210x) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        cropAreaView.setLockedAspectRatio(f10);
        l lVar2 = this.I;
        if (lVar2 != null) {
            l.d(lVar2, 0.0f);
            this.I.f51198j = false;
        }
        cropAreaView.d(this.h);
        r(z4);
        this.f51206n = 0.0f;
        m mVar = this.J;
        if (mVar != null) {
            mVar.N(true);
            this.J.F(false);
        }
    }

    public final boolean m(float f10) {
        boolean z4;
        boolean z10;
        if (this.I != null) {
            CropAreaView cropAreaView = this.f51201a;
            AnimatorSet animatorSet = cropAreaView.f24857h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.f24857h0 = null;
            }
            this.f51206n = 0.0f;
            l lVar = this.I;
            float f11 = lVar.h;
            float f12 = lVar.f51196g;
            float f13 = (((f11 + f12) - f12) + f10) % 360.0f;
            if (this.f51210x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = getCurrentWidth();
                int currentHeight = getCurrentHeight();
                if ((this.I.f51196g + f13) % 180.0f != 0.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z4, this.f51210x);
            }
            l.d(this.I, f13);
            r(false);
            e(true, false, false, false);
            m mVar = this.J;
            if (mVar != null) {
                if (f13 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.I.f51198j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mVar.N(z10);
            }
            if (((int) this.I.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        if (this.I == null || this.F) {
            return;
        }
        this.F = true;
        String[] strArr = new String[8];
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = LocaleController.getString(R.string.CropOriginal);
        strArr[1] = LocaleController.getString(R.string.CropSquare);
        int i10 = 2;
        for (int i11 = 0; i11 < 6; i11++) {
            Integer[] numArr2 = numArr[i11];
            if (this.f51201a.getAspectRatio() > 1.0f) {
                strArr[i10] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i10] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i10++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new t1(13, this, numArr));
        d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.setCanceledOnTouchOutside(true);
        d2Var.setOnCancelListener(new ta(this, 4));
        d2Var.show();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.C) {
            CropAreaView cropAreaView = this.f51201a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.C) {
                    cropAreaView.g(3, true);
                    this.f51206n = 0.0f;
                    m mVar = this.J;
                    if (mVar != null) {
                        mVar.N(false);
                    }
                }
                try {
                    this.D.a(motionEvent);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void p(int i10, f fVar, MediaController.CropState cropState) {
        this.f51210x = true;
        this.d = null;
        this.f51204e = fVar;
        this.H = i10;
        this.f51209w = null;
        CropAreaView cropAreaView = this.f51201a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.I = new l(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new i(this, cropState, currentHeight, currentWidth));
    }

    public final void q() {
        RectF rectF;
        float f10;
        int i10;
        float f11;
        float max;
        boolean z4;
        if (this.f51204e != null && this.I != null) {
            CropAreaView cropAreaView = this.f51201a;
            cropAreaView.d(this.K);
            int ceil = (int) Math.ceil(n(rectF, this.L));
            int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
            float cropWidth = ceil / cropAreaView.getCropWidth();
            Matrix matrix = this.I.f51199k;
            float[] fArr = this.E;
            matrix.getValues(fArr);
            l lVar = this.I;
            float f12 = lVar.f51195f * cropWidth;
            int i11 = (int) lVar.h;
            while (i11 < 0) {
                i11 += 360;
            }
            if (i11 != 90 && i11 != 270) {
                l lVar2 = this.I;
                i10 = (int) lVar2.f51191a;
                f11 = lVar2.f51192b;
            } else {
                l lVar3 = this.I;
                i10 = (int) lVar3.f51192b;
                f11 = lVar3.f51191a;
            }
            int i12 = (int) f11;
            double d = ceil;
            float f13 = i10;
            float ceil3 = (float) (d / Math.ceil(f13 * f12));
            float f14 = i12;
            float ceil4 = (float) (ceil2 / Math.ceil(f12 * f14));
            if (ceil3 > 1.0f || ceil4 > 1.0f) {
                float max2 = Math.max(ceil3, ceil4);
                ceil3 /= max2;
                ceil4 /= max2;
            }
            float f15 = ceil4;
            float f16 = ceil3;
            RectF rectF2 = cropAreaView.f24858i0;
            cropAreaView.a(rectF2, f13 / f14);
            if (this.f51210x) {
                max = rectF2.width() / f13;
            } else {
                max = Math.max(rectF2.width() / f13, rectF2.height() / f14);
            }
            l lVar4 = this.I;
            float f17 = lVar4.f51194e;
            float f18 = f17 / max;
            float f19 = f17 / lVar4.f51195f;
            float f20 = (fArr[2] / f13) / f17;
            float f21 = (fArr[5] / f14) / f17;
            float f22 = lVar4.f51197i;
            RectF targetRectToFill = cropAreaView.getTargetRectToFill();
            float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
            float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
            f fVar = this.f51204e;
            l lVar5 = this.I;
            if (!lVar5.f51198j && !l.c(lVar5) && this.I.f51196g < 1.0E-5f) {
                z4 = false;
            } else {
                z4 = true;
            }
            l lVar6 = this.I;
            fVar.e(z4, f20, f21, f22, (int) lVar6.h, f18, f19, lVar6.f51195f / max, f16, f15, cropCenterX, cropCenterY, lVar6.f51198j);
        }
    }

    public final void r(boolean z4) {
        if (this.I == null) {
            return;
        }
        Matrix matrix = this.f51203c;
        matrix.reset();
        l lVar = this.I;
        float f10 = lVar.f51196g;
        if (f10 != 90.0f && f10 != 270.0f) {
            matrix.postTranslate((-lVar.f51191a) / 2.0f, (-lVar.f51192b) / 2.0f);
        } else {
            matrix.postTranslate((-lVar.f51192b) / 2.0f, (-lVar.f51191a) / 2.0f);
        }
        matrix.postRotate((int) this.I.h);
        matrix.postConcat(this.I.f51199k);
        CropAreaView cropAreaView = this.f51201a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.f51210x || this.G || z4) {
            q();
            this.J.w();
        }
        invalidate();
    }

    public void setAspectRatio(float f10) {
        this.f51201a.setActualRect(f10);
    }

    public void setBottomPadding(float f10) {
        this.f51211y = f10;
        this.f51201a.setBottomPadding(f10);
    }

    public void setFreeform(boolean z4) {
        this.f51201a.setFreeform(z4);
        this.f51210x = z4;
    }

    public void setListener(m mVar) {
        this.J = mVar;
    }

    @Override
    public void setRotation(float f10) {
        l lVar = this.I;
        l.e(lVar, f10 - lVar.f51197i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.f51201a.setSubtitle(str);
    }

    public void setTopPadding(float f10) {
        this.B = f10;
        this.f51201a.setTopPadding(f10);
    }
}

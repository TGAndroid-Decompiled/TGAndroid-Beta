package tf;

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
import java.io.File;
import kh.pc;
import n5.a0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.l0;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.n60;
import org.telegram.ui.v;
public class n extends FrameLayout implements a {
    public float A;
    public boolean B;
    public final b C;
    public final float[] D;
    public boolean E;
    public boolean F;
    public int G;
    public l H;
    public m I;
    public final RectF J;
    public final RectF K;
    public final CropAreaView f47904a;
    public final ImageView f47905b;
    public final Matrix f47906c;
    public y51 d;
    public f f47907e;
    public final RectF f47908f;
    public final RectF h;
    public float f47909n;
    public final boolean f47910r;
    public final a0 f47911s;
    public final Matrix v;
    public Bitmap f47912w;
    public boolean f47913x;
    public float f47914y;

    public n(Context context) {
        super(context);
        this.D = new float[9];
        this.J = new RectF();
        this.K = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z10 = context instanceof BubbleActivity;
        this.f47910r = z10;
        this.f47908f = new RectF();
        this.h = new RectF();
        this.f47906c = new Matrix();
        a0 a0Var = new a0(17);
        a0Var.f18462b = new float[8];
        this.f47911s = a0Var;
        this.v = new Matrix();
        this.B = false;
        ImageView imageView = new ImageView(context);
        this.f47905b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        b bVar = new b(context);
        this.C = bVar;
        bVar.f47843b = this;
        ?? viewGroup = new ViewGroup(context);
        viewGroup.d = new RectF();
        viewGroup.f26354e = new RectF();
        viewGroup.f26356f = new RectF();
        viewGroup.h = new RectF();
        viewGroup.f26364n = new RectF();
        viewGroup.f26368r = new RectF();
        viewGroup.f26369s = new RectF();
        viewGroup.v = new RectF();
        viewGroup.f26371x = new RectF();
        viewGroup.f26372y = new RectF();
        viewGroup.G = -1.0f;
        viewGroup.H = 1.0f;
        viewGroup.I = -1.0f;
        viewGroup.Q = new AccelerateDecelerateInterpolator();
        viewGroup.f26350b0 = true;
        viewGroup.f26359h0 = new RectF();
        viewGroup.f26361j0 = 0.0f;
        viewGroup.f26362k0 = 1.0f;
        viewGroup.f26363l0 = 0.0f;
        viewGroup.m0 = 0.0f;
        viewGroup.T = z10;
        viewGroup.F = true;
        viewGroup.E = true;
        viewGroup.R = AndroidUtilities.dp(16.0f);
        viewGroup.S = AndroidUtilities.dp(32.0f);
        viewGroup.f26367p0 = 1;
        Paint paint = new Paint();
        viewGroup.K = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        viewGroup.L = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint paint3 = new Paint();
        viewGroup.M = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        Paint paint4 = new Paint();
        viewGroup.N = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        viewGroup.O = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        viewGroup.f26353d0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        viewGroup.P = paint7;
        paint7.setColor(-1);
        viewGroup.setWillNotDraw(false);
        this.f47904a = viewGroup;
        viewGroup.setListener(this);
        addView(viewGroup);
    }

    public static void a(n nVar, Integer[][] numArr, int i9) {
        float f10;
        float f11;
        nVar.E = false;
        if (i9 != 0) {
            if (i9 != 1) {
                Integer[] numArr2 = numArr[i9 - 2];
                if (nVar.f47904a.getAspectRatio() > 1.0f) {
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
        l lVar = nVar.H;
        int i10 = ((lVar.f47899g % 180.0f) > 0.0f ? 1 : ((lVar.f47899g % 180.0f) == 0.0f ? 0 : -1));
        if (i10 != 0) {
            f10 = lVar.f47895b;
        } else {
            f10 = lVar.f47894a;
        }
        if (i10 != 0) {
            f11 = lVar.f47894a;
        } else {
            f11 = lVar.f47895b;
        }
        nVar.setLockedAspectRatio(f10 / f11);
    }

    public static void c(java.lang.String r19, android.graphics.Canvas r20, android.graphics.Bitmap r21, android.graphics.Matrix r22, int r23, int r24, float r25, float r26, float r27, float r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: tf.n.c(java.lang.String, android.graphics.Canvas, android.graphics.Bitmap, android.graphics.Matrix, int, int, float, float, float, float, java.util.ArrayList):void");
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
        double d9 = 1.5707963267948966d - d;
        double centerX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f11);
        float cos = (float) (Math.cos(d9) * centerX);
        double d10 = d + 1.5707963267948966d;
        double centerY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f12);
        pointF.set(pointF.x + ((float) (Math.sin(d9) * centerX)) + ((float) (Math.cos(d10) * centerY)), pointF.y + cos + ((float) (Math.sin(d10) * centerY)));
    }

    public static String h(String str) {
        File directory = FileLoader.getDirectory(4);
        File file = new File(directory, SharedConfig.getLastLocalId() + "_temp.jpg");
        try {
            AndroidUtilities.copyFile(new File(str), file);
        } catch (Exception e10) {
            FileLog.e(e10);
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
        CropAreaView cropAreaView = this.f47904a;
        cropAreaView.setLockedAspectRatio(f10);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f10);
        d(rectF);
        m mVar = this.I;
        if (mVar != null) {
            mVar.C(false);
            this.I.v(true);
        }
    }

    public final void b(MediaController.CropState cropState) {
        RectF rectF;
        float f10;
        int i9;
        int i10;
        float f11;
        CropAreaView cropAreaView = this.f47904a;
        cropAreaView.d(this.J);
        int ceil = (int) Math.ceil(n(rectF, this.K));
        int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.H.f47902k;
        float[] fArr = this.D;
        matrix.getValues(fArr);
        l lVar = this.H;
        float f12 = lVar.f47898f * cropWidth;
        cropState.transformRotation = (int) lVar.h;
        if (BuildVars.LOGS_ENABLED) {
            l0.n(cropState.transformRotation, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i9 = cropState.transformRotation;
            if (i9 >= 0) {
                break;
            }
            cropState.transformRotation = i9 + 360;
        }
        if (i9 != 90 && i9 != 270) {
            l lVar2 = this.H;
            i10 = (int) lVar2.f47894a;
            f11 = lVar2.f47895b;
        } else {
            l lVar3 = this.H;
            i10 = (int) lVar3.f47895b;
            f11 = lVar3.f47894a;
        }
        int i11 = (int) f11;
        float f13 = i10;
        cropState.cropPw = (float) (ceil / Math.ceil(f13 * f12));
        float f14 = i11;
        float ceil3 = (float) (ceil2 / Math.ceil(f12 * f14));
        cropState.cropPh = ceil3;
        float f15 = cropState.cropPw;
        if (f15 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f15, ceil3);
            cropState.cropPw /= max;
            cropState.cropPh /= max;
        }
        cropState.cropScale = Math.min(f13 / cropAreaView.getCropWidth(), f14 / cropAreaView.getCropHeight()) * this.H.f47897e;
        float f16 = fArr[2] / f13;
        l lVar4 = this.H;
        float f17 = lVar4.f47897e;
        cropState.cropPx = f16 / f17;
        cropState.cropPy = (fArr[5] / f14) / f17;
        cropState.cropRotate = lVar4.f47900i;
        cropState.stateScale = f17;
        cropState.mirrored = lVar4.f47901j;
        cropState.scale = cropWidth;
        cropState.matrix = lVar4.f47902k;
        cropState.width = ceil;
        cropState.height = ceil2;
        cropState.freeform = this.f47913x;
        cropState.lockedAspectRatio = cropAreaView.getLockAspectRatio();
        cropState.initied = true;
    }

    public final void d(RectF rectF) {
        boolean z10;
        int i9;
        if (this.H == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.f47904a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f10 = this.H.f47897e;
        if (f10 * max > 30.0f) {
            max = 30.0f / f10;
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = max;
        if (!this.f47910r) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        float centerX = rectF.centerX();
        ImageView imageView = this.f47905b;
        float a2 = l.a(this.H) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = l.b(this.H) * ((rectF.centerY() - ((((imageView.getHeight() - this.f47914y) + i9) + this.A) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new g(this, f11, fArr, a2, b10, 0));
        ofFloat.addListener(new n60(14, this, z10));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.Q;
        AnimatorSet animatorSet = cropAreaView.f26358g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f26358g0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.f26358g0 = animatorSet2;
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
        animatorSet2.addListener(new su0(20, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z10, boolean z11, boolean z12, boolean z13) {
        float f10;
        long j10;
        if (this.H != null) {
            CropAreaView cropAreaView = this.f47904a;
            float cropWidth = cropAreaView.getCropWidth();
            float cropHeight = cropAreaView.getCropHeight();
            float a2 = l.a(this.H);
            float b10 = l.b(this.H);
            float f11 = this.H.f47900i;
            float radians = (float) Math.toRadians(f11);
            RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
            Matrix matrix = new Matrix();
            matrix.postRotate(f11, cropWidth / 2.0f, cropHeight / 2.0f);
            matrix.mapRect(rectF);
            RectF rectF2 = new RectF(0.0f, 0.0f, a2, b10);
            float f12 = (cropWidth - a2) / 2.0f;
            l lVar = this.H;
            float f13 = lVar.f47897e;
            a0 a0Var = this.f47911s;
            float[] fArr = (float[]) a0Var.f18462b;
            float[] fArr2 = (float[]) a0Var.f18462b;
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
            matrix2.set(lVar.f47902k);
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
            l lVar2 = this.H;
            PointF pointF = new PointF(lVar2.f47896c, lVar2.d);
            if (!rectF2.contains(rectF)) {
                if (z10 && (rectF.width() > rectF2.width() || rectF.height() > rectF2.height())) {
                    f10 = f(rectF2, f13, rectF.width() / n(rectF, rectF2));
                } else {
                    f10 = f13;
                }
                g(rectF2, rectF, pointF, radians);
            } else if (z11 && this.f47909n > 0.0f) {
                float width = rectF.width() / n(rectF, rectF2);
                if (this.H.f47897e * width < this.f47909n) {
                    width = 1.0f;
                }
                f10 = f(rectF2, f13, width);
                g(rectF2, rectF, pointF, radians);
            } else {
                f10 = f13;
            }
            float f18 = pointF.x;
            l lVar3 = this.H;
            float f19 = f18 - lVar3.f47896c;
            float f20 = pointF.y - lVar3.d;
            if (z12) {
                float f21 = f10 / f13;
                if (Math.abs(f21 - 1.0f) < 1.0E-5f && Math.abs(f19) < 1.0E-5f && Math.abs(f20) < 1.0E-5f) {
                    return;
                }
                this.B = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new g(this, f19, new float[]{1.0f, 0.0f, 0.0f}, f20, f21, 1));
                ofFloat.addListener(new k(this, z13, z10, z11, z12));
                ofFloat.setInterpolator(cropAreaView.getInterpolator());
                if (z13) {
                    j10 = 100;
                } else {
                    j10 = 200;
                }
                ofFloat.setDuration(j10);
                ofFloat.start();
                return;
            }
            l.f(lVar3, f19, f20);
            l.g(this.H, f10 / f13, 0.0f, 0.0f);
            r(false);
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.f47904a;
        RectF rectF = this.J;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.f47904a.getCropHeight();
    }

    public float getCropLeft() {
        return this.f47904a.getCropLeft();
    }

    public float getCropTop() {
        return this.f47904a.getCropTop();
    }

    public float getCropWidth() {
        return this.f47904a.getCropWidth();
    }

    public int getCurrentHeight() {
        y51 y51Var = this.d;
        if (y51Var != null) {
            return y51Var.getVideoHeight();
        }
        Bitmap bitmap = this.f47912w;
        if (bitmap == null) {
            return 1;
        }
        int i9 = this.G;
        if (i9 != 90 && i9 != 270) {
            return bitmap.getHeight();
        }
        return bitmap.getWidth();
    }

    public int getCurrentWidth() {
        y51 y51Var = this.d;
        if (y51Var != null) {
            return y51Var.getVideoWidth();
        }
        Bitmap bitmap = this.f47912w;
        if (bitmap == null) {
            return 1;
        }
        int i9 = this.G;
        if (i9 != 90 && i9 != 270) {
            return bitmap.getWidth();
        }
        return bitmap.getHeight();
    }

    public float getStateFullOrientation() {
        l lVar = this.H;
        if (lVar == null) {
            return 0.0f;
        }
        return lVar.f47899g + lVar.h;
    }

    public boolean getStateMirror() {
        l lVar = this.H;
        if (lVar != null && lVar.f47901j) {
            return true;
        }
        return false;
    }

    public float getStateOrientation() {
        l lVar = this.H;
        if (lVar == null) {
            return 0.0f;
        }
        return lVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        l lVar = this.H;
        if (lVar == null) {
            return;
        }
        final float f10 = lVar.f47898f;
        CropAreaView cropAreaView = this.f47904a;
        AnimatorSet animatorSet = cropAreaView.f26358g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f26358g0 = null;
        }
        l lVar2 = this.H;
        if ((lVar2.h + lVar2.f47899g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f11 = currentWidth / currentHeight;
        float f12 = 1.0f;
        if (!this.f47913x) {
            f11 = 1.0f;
        }
        cropAreaView.a(this.h, f11);
        if (this.f47913x) {
            f12 = 0.0f;
        }
        cropAreaView.setLockedAspectRatio(f12);
        this.f47909n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.f26371x);
        l lVar3 = this.H;
        final float f13 = lVar3.f47896c;
        final float f14 = lVar3.d;
        final float f15 = lVar3.f47897e;
        final float f16 = lVar3.f47900i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n nVar = n.this;
                if (nVar.H == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = nVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                AndroidUtilities.lerp(rectF4, rectF3, floatValue, rectF5);
                nVar.f47904a.setActualRect(rectF5);
                l lVar4 = nVar.H;
                float f17 = 1.0f - floatValue;
                float f18 = lVar4.f47896c - (f13 * f17);
                float f19 = lVar4.d - (f14 * f17);
                float f20 = lVar4.f47900i - (f16 * f17);
                float lerp = AndroidUtilities.lerp(f15, f10, floatValue);
                l lVar5 = nVar.H;
                l.f(lVar5, -f18, -f19);
                l.g(nVar.H, lerp / lVar5.f47897e, 0.0f, 0.0f);
                l.e(nVar.H, -f20);
                nVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        l lVar = this.H;
        boolean z10 = false;
        if (lVar == null) {
            return false;
        }
        lVar.f47901j = !lVar.f47901j;
        r(false);
        m mVar = this.I;
        if (mVar != null) {
            l lVar2 = this.H;
            float f10 = lVar2.h;
            float f11 = lVar2.f47899g;
            float f12 = ((f10 + f11) - f11) % 360.0f;
            if (!l.c(lVar2) && f12 == 0.0f && this.f47904a.getLockAspectRatio() == 0.0f && !this.H.f47901j) {
                z10 = true;
            }
            mVar.C(z10);
        }
        return this.H.f47901j;
    }

    public final void k() {
        this.f47904a.g(2, false);
        if (this.f47909n < 1.0E-5f) {
            this.f47909n = this.H.f47897e;
        }
    }

    public final void l(boolean z10) {
        boolean z11;
        float f10;
        CropAreaView cropAreaView = this.f47904a;
        AnimatorSet animatorSet = cropAreaView.f26358g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f26358g0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        l lVar = this.H;
        if (lVar != null && lVar.f47899g % 180.0f != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        cropAreaView.e(currentWidth, currentHeight, z11, this.f47913x);
        if (this.f47913x) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        cropAreaView.setLockedAspectRatio(f10);
        l lVar2 = this.H;
        if (lVar2 != null) {
            l.d(lVar2, 0.0f);
            this.H.f47901j = false;
        }
        cropAreaView.d(this.h);
        r(z10);
        this.f47909n = 0.0f;
        m mVar = this.I;
        if (mVar != null) {
            mVar.C(true);
            this.I.v(false);
        }
    }

    public final boolean m(float f10) {
        boolean z10;
        boolean z11;
        if (this.H != null) {
            CropAreaView cropAreaView = this.f47904a;
            AnimatorSet animatorSet = cropAreaView.f26358g0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.f26358g0 = null;
            }
            this.f47909n = 0.0f;
            l lVar = this.H;
            float f11 = lVar.h;
            float f12 = lVar.f47899g;
            float f13 = (((f11 + f12) - f12) + f10) % 360.0f;
            if (this.f47913x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = getCurrentWidth();
                int currentHeight = getCurrentHeight();
                if ((this.H.f47899g + f13) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, this.f47913x);
            }
            l.d(this.H, f13);
            r(false);
            e(true, false, false, false);
            m mVar = this.I;
            if (mVar != null) {
                if (f13 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.H.f47901j) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                mVar.C(z11);
            }
            if (((int) this.H.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        if (this.H == null || this.E) {
            return;
        }
        this.E = true;
        String[] strArr = new String[8];
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = LocaleController.getString(R.string.CropOriginal);
        strArr[1] = LocaleController.getString(R.string.CropSquare);
        int i9 = 2;
        for (int i10 = 0; i10 < 6; i10++) {
            Integer[] numArr2 = numArr[i10];
            if (this.f47904a.getAspectRatio() > 1.0f) {
                strArr[i9] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i9] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i9++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new v(12, this, numArr));
        c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.setCanceledOnTouchOutside(true);
        c2Var.setOnCancelListener(new pc(this, 4));
        c2Var.show();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.B) {
            CropAreaView cropAreaView = this.f47904a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.B) {
                    cropAreaView.g(3, true);
                    this.f47909n = 0.0f;
                    m mVar = this.I;
                    if (mVar != null) {
                        mVar.C(false);
                    }
                }
                try {
                    this.C.a(motionEvent);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void p(int i9, f fVar, MediaController.CropState cropState) {
        this.f47913x = true;
        this.d = null;
        this.f47907e = fVar;
        this.G = i9;
        this.f47912w = null;
        CropAreaView cropAreaView = this.f47904a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.H = new l(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new i(this, cropState, currentHeight, currentWidth));
    }

    public final void q() {
        RectF rectF;
        float f10;
        int i9;
        float f11;
        float max;
        boolean z10;
        if (this.f47907e != null && this.H != null) {
            CropAreaView cropAreaView = this.f47904a;
            cropAreaView.d(this.J);
            int ceil = (int) Math.ceil(n(rectF, this.K));
            int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
            float cropWidth = ceil / cropAreaView.getCropWidth();
            Matrix matrix = this.H.f47902k;
            float[] fArr = this.D;
            matrix.getValues(fArr);
            l lVar = this.H;
            float f12 = lVar.f47898f * cropWidth;
            int i10 = (int) lVar.h;
            while (i10 < 0) {
                i10 += 360;
            }
            if (i10 != 90 && i10 != 270) {
                l lVar2 = this.H;
                i9 = (int) lVar2.f47894a;
                f11 = lVar2.f47895b;
            } else {
                l lVar3 = this.H;
                i9 = (int) lVar3.f47895b;
                f11 = lVar3.f47894a;
            }
            int i11 = (int) f11;
            double d = ceil;
            float f13 = i9;
            float ceil3 = (float) (d / Math.ceil(f13 * f12));
            float f14 = i11;
            float ceil4 = (float) (ceil2 / Math.ceil(f12 * f14));
            if (ceil3 > 1.0f || ceil4 > 1.0f) {
                float max2 = Math.max(ceil3, ceil4);
                ceil3 /= max2;
                ceil4 /= max2;
            }
            float f15 = ceil4;
            float f16 = ceil3;
            RectF rectF2 = cropAreaView.f26359h0;
            cropAreaView.a(rectF2, f13 / f14);
            if (this.f47913x) {
                max = rectF2.width() / f13;
            } else {
                max = Math.max(rectF2.width() / f13, rectF2.height() / f14);
            }
            l lVar4 = this.H;
            float f17 = lVar4.f47897e;
            float f18 = f17 / max;
            float f19 = f17 / lVar4.f47898f;
            float f20 = (fArr[2] / f13) / f17;
            float f21 = (fArr[5] / f14) / f17;
            float f22 = lVar4.f47900i;
            RectF targetRectToFill = cropAreaView.getTargetRectToFill();
            float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
            float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
            f fVar = this.f47907e;
            l lVar5 = this.H;
            if (!lVar5.f47901j && !l.c(lVar5) && this.H.f47899g < 1.0E-5f) {
                z10 = false;
            } else {
                z10 = true;
            }
            l lVar6 = this.H;
            fVar.e(z10, f20, f21, f22, (int) lVar6.h, f18, f19, lVar6.f47898f / max, f16, f15, cropCenterX, cropCenterY, lVar6.f47901j);
        }
    }

    public final void r(boolean z10) {
        if (this.H == null) {
            return;
        }
        Matrix matrix = this.f47906c;
        matrix.reset();
        l lVar = this.H;
        float f10 = lVar.f47899g;
        if (f10 != 90.0f && f10 != 270.0f) {
            matrix.postTranslate((-lVar.f47894a) / 2.0f, (-lVar.f47895b) / 2.0f);
        } else {
            matrix.postTranslate((-lVar.f47895b) / 2.0f, (-lVar.f47894a) / 2.0f);
        }
        matrix.postRotate((int) this.H.h);
        matrix.postConcat(this.H.f47902k);
        CropAreaView cropAreaView = this.f47904a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.f47913x || this.F || z10) {
            q();
            this.I.q();
        }
        invalidate();
    }

    public void setAspectRatio(float f10) {
        this.f47904a.setActualRect(f10);
    }

    public void setBottomPadding(float f10) {
        this.f47914y = f10;
        this.f47904a.setBottomPadding(f10);
    }

    public void setFreeform(boolean z10) {
        this.f47904a.setFreeform(z10);
        this.f47913x = z10;
    }

    public void setListener(m mVar) {
        this.I = mVar;
    }

    @Override
    public void setRotation(float f10) {
        l lVar = this.H;
        l.e(lVar, f10 - lVar.f47900i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.f47904a.setSubtitle(str);
    }

    public void setTopPadding(float f10) {
        this.A = f10;
        this.f47904a.setTopPadding(f10);
    }
}

package wf;

import ag.y1;
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
import j7.l1;
import java.io.File;
import nh.zb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.p60;
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
    public final CropAreaView f49953a;
    public final ImageView f49954b;
    public final Matrix f49955c;
    public l61 d;
    public f f49956e;
    public final RectF f49957f;
    public final RectF h;
    public float f49958n;
    public final boolean f49959r;
    public final vd.d f49960s;
    public final Matrix v;
    public Bitmap f49961w;
    public boolean f49962x;
    public float f49963y;

    public n(Context context) {
        super(context);
        this.D = new float[9];
        this.J = new RectF();
        this.K = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z10 = context instanceof BubbleActivity;
        this.f49959r = z10;
        this.f49957f = new RectF();
        this.h = new RectF();
        this.f49955c = new Matrix();
        ?? obj = new Object();
        obj.f49513a = new float[8];
        this.f49960s = obj;
        this.v = new Matrix();
        this.B = false;
        ImageView imageView = new ImageView(context);
        this.f49954b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        b bVar = new b(context);
        this.C = bVar;
        bVar.f49892b = this;
        ?? viewGroup = new ViewGroup(context);
        viewGroup.d = new RectF();
        viewGroup.f26365e = new RectF();
        viewGroup.f26367f = new RectF();
        viewGroup.h = new RectF();
        viewGroup.f26375n = new RectF();
        viewGroup.f26379r = new RectF();
        viewGroup.f26380s = new RectF();
        viewGroup.v = new RectF();
        viewGroup.f26382x = new RectF();
        viewGroup.f26383y = new RectF();
        viewGroup.G = -1.0f;
        viewGroup.H = 1.0f;
        viewGroup.I = -1.0f;
        viewGroup.Q = new AccelerateDecelerateInterpolator();
        viewGroup.f26361b0 = true;
        viewGroup.f26370h0 = new RectF();
        viewGroup.f26372j0 = 0.0f;
        viewGroup.f26373k0 = 1.0f;
        viewGroup.f26374l0 = 0.0f;
        viewGroup.m0 = 0.0f;
        viewGroup.T = z10;
        viewGroup.F = true;
        viewGroup.E = true;
        viewGroup.R = AndroidUtilities.dp(16.0f);
        viewGroup.S = AndroidUtilities.dp(32.0f);
        viewGroup.f26378p0 = 1;
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
        viewGroup.f26364d0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        viewGroup.P = paint7;
        paint7.setColor(-1);
        viewGroup.setWillNotDraw(false);
        this.f49953a = viewGroup;
        viewGroup.setListener(this);
        addView(viewGroup);
    }

    public static void a(n nVar, Integer[][] numArr, int i10) {
        float f9;
        float f10;
        nVar.E = false;
        if (i10 != 0) {
            if (i10 != 1) {
                Integer[] numArr2 = numArr[i10 - 2];
                if (nVar.f49953a.getAspectRatio() > 1.0f) {
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
        int i11 = ((lVar.f49948g % 180.0f) > 0.0f ? 1 : ((lVar.f49948g % 180.0f) == 0.0f ? 0 : -1));
        if (i11 != 0) {
            f9 = lVar.f49944b;
        } else {
            f9 = lVar.f49943a;
        }
        if (i11 != 0) {
            f10 = lVar.f49943a;
        } else {
            f10 = lVar.f49944b;
        }
        nVar.setLockedAspectRatio(f9 / f10);
    }

    public static void c(java.lang.String r19, android.graphics.Canvas r20, android.graphics.Bitmap r21, android.graphics.Matrix r22, int r23, int r24, float r25, float r26, float r27, float r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: wf.n.c(java.lang.String, android.graphics.Canvas, android.graphics.Bitmap, android.graphics.Matrix, int, int, float, float, float, float, java.util.ArrayList):void");
    }

    public static float f(RectF rectF, float f9, float f10) {
        float width = rectF.width() * f10;
        float height = rectF.height() * f10;
        float width2 = rectF.left + ((rectF.width() - width) / 2.0f);
        float height2 = rectF.top + ((rectF.height() - height) / 2.0f);
        rectF.set(width2, height2, width + width2, height + height2);
        return f9 * f10;
    }

    public static void g(RectF rectF, RectF rectF2, PointF pointF, float f9) {
        float f10 = rectF2.left;
        float f11 = rectF2.top;
        float f12 = rectF2.right;
        float f13 = rectF2.bottom;
        float f14 = rectF.left;
        if (f14 > f10) {
            f12 += f14 - f10;
            f10 = f14;
        }
        float f15 = rectF.top;
        if (f15 > f11) {
            f13 += f15 - f11;
            f11 = f15;
        }
        float f16 = rectF.right;
        if (f16 < f12) {
            f10 += f16 - f12;
        }
        float f17 = rectF.bottom;
        if (f17 < f13) {
            f11 += f17 - f13;
        }
        double d = f9;
        double d10 = 1.5707963267948966d - d;
        double centerX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f10);
        float cos = (float) (Math.cos(d10) * centerX);
        double d11 = d + 1.5707963267948966d;
        double centerY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f11);
        pointF.set(pointF.x + ((float) (Math.sin(d10) * centerX)) + ((float) (Math.cos(d11) * centerY)), pointF.y + cos + ((float) (Math.sin(d11) * centerY)));
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

    private void setLockedAspectRatio(float f9) {
        CropAreaView cropAreaView = this.f49953a;
        cropAreaView.setLockedAspectRatio(f9);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f9);
        d(rectF);
        m mVar = this.I;
        if (mVar != null) {
            mVar.P(false);
            this.I.C(true);
        }
    }

    public final void b(MediaController.CropState cropState) {
        RectF rectF;
        float f9;
        int i10;
        int i11;
        float f10;
        CropAreaView cropAreaView = this.f49953a;
        cropAreaView.d(this.J);
        int ceil = (int) Math.ceil(n(rectF, this.K));
        int ceil2 = (int) Math.ceil(f9 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.H.f49951k;
        float[] fArr = this.D;
        matrix.getValues(fArr);
        l lVar = this.H;
        float f11 = lVar.f49947f * cropWidth;
        cropState.transformRotation = (int) lVar.h;
        if (BuildVars.LOGS_ENABLED) {
            l1.t(cropState.transformRotation, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i10 = cropState.transformRotation;
            if (i10 >= 0) {
                break;
            }
            cropState.transformRotation = i10 + 360;
        }
        if (i10 != 90 && i10 != 270) {
            l lVar2 = this.H;
            i11 = (int) lVar2.f49943a;
            f10 = lVar2.f49944b;
        } else {
            l lVar3 = this.H;
            i11 = (int) lVar3.f49944b;
            f10 = lVar3.f49943a;
        }
        int i12 = (int) f10;
        float f12 = i11;
        cropState.cropPw = (float) (ceil / Math.ceil(f12 * f11));
        float f13 = i12;
        float ceil3 = (float) (ceil2 / Math.ceil(f11 * f13));
        cropState.cropPh = ceil3;
        float f14 = cropState.cropPw;
        if (f14 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f14, ceil3);
            cropState.cropPw /= max;
            cropState.cropPh /= max;
        }
        cropState.cropScale = Math.min(f12 / cropAreaView.getCropWidth(), f13 / cropAreaView.getCropHeight()) * this.H.f49946e;
        float f15 = fArr[2] / f12;
        l lVar4 = this.H;
        float f16 = lVar4.f49946e;
        cropState.cropPx = f15 / f16;
        cropState.cropPy = (fArr[5] / f13) / f16;
        cropState.cropRotate = lVar4.f49949i;
        cropState.stateScale = f16;
        cropState.mirrored = lVar4.f49950j;
        cropState.scale = cropWidth;
        cropState.matrix = lVar4.f49951k;
        cropState.width = ceil;
        cropState.height = ceil2;
        cropState.freeform = this.f49962x;
        cropState.lockedAspectRatio = cropAreaView.getLockAspectRatio();
        cropState.initied = true;
    }

    public final void d(RectF rectF) {
        boolean z10;
        int i10;
        if (this.H == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.f49953a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f9 = this.H.f49946e;
        if (f9 * max > 30.0f) {
            max = 30.0f / f9;
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = max;
        if (!this.f49959r) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float centerX = rectF.centerX();
        ImageView imageView = this.f49954b;
        float a2 = l.a(this.H) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = l.b(this.H) * ((rectF.centerY() - ((((imageView.getHeight() - this.f49963y) + i10) + this.A) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new g(this, f10, fArr, a2, b10, 0));
        ofFloat.addListener(new p60(17, this, z10));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.Q;
        AnimatorSet animatorSet = cropAreaView.f26369g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f26369g0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.f26369g0 = animatorSet2;
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
        animatorSet2.addListener(new ok0(23, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z10, boolean z11, boolean z12, boolean z13) {
        float f9;
        long j10;
        if (this.H != null) {
            CropAreaView cropAreaView = this.f49953a;
            float cropWidth = cropAreaView.getCropWidth();
            float cropHeight = cropAreaView.getCropHeight();
            float a2 = l.a(this.H);
            float b10 = l.b(this.H);
            float f10 = this.H.f49949i;
            float radians = (float) Math.toRadians(f10);
            RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
            Matrix matrix = new Matrix();
            matrix.postRotate(f10, cropWidth / 2.0f, cropHeight / 2.0f);
            matrix.mapRect(rectF);
            RectF rectF2 = new RectF(0.0f, 0.0f, a2, b10);
            float f11 = (cropWidth - a2) / 2.0f;
            l lVar = this.H;
            float f12 = lVar.f49946e;
            vd.d dVar = this.f49960s;
            float[] fArr = (float[]) dVar.f49513a;
            float[] fArr2 = (float[]) dVar.f49513a;
            float f13 = rectF2.left;
            fArr[0] = f13;
            float f14 = rectF2.top;
            fArr[1] = f14;
            float f15 = rectF2.right;
            fArr[2] = f15;
            fArr[3] = f14;
            fArr[4] = f15;
            float f16 = rectF2.bottom;
            fArr[5] = f16;
            fArr[6] = f13;
            fArr[7] = f16;
            Matrix matrix2 = new Matrix();
            matrix2.set(lVar.f49951k);
            matrix2.preTranslate(f11 / f12, ((cropHeight - b10) / 2.0f) / f12);
            Matrix matrix3 = this.v;
            matrix3.reset();
            matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
            matrix3.setConcat(matrix3, matrix2);
            matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
            matrix3.mapPoints(fArr2);
            matrix3.reset();
            matrix3.preRotate(-f10, a2 / 2.0f, b10 / 2.0f);
            matrix3.mapPoints(fArr2);
            rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
            l lVar2 = this.H;
            PointF pointF = new PointF(lVar2.f49945c, lVar2.d);
            if (!rectF2.contains(rectF)) {
                if (z10 && (rectF.width() > rectF2.width() || rectF.height() > rectF2.height())) {
                    f9 = f(rectF2, f12, rectF.width() / n(rectF, rectF2));
                } else {
                    f9 = f12;
                }
                g(rectF2, rectF, pointF, radians);
            } else if (z11 && this.f49958n > 0.0f) {
                float width = rectF.width() / n(rectF, rectF2);
                if (this.H.f49946e * width < this.f49958n) {
                    width = 1.0f;
                }
                f9 = f(rectF2, f12, width);
                g(rectF2, rectF, pointF, radians);
            } else {
                f9 = f12;
            }
            float f17 = pointF.x;
            l lVar3 = this.H;
            float f18 = f17 - lVar3.f49945c;
            float f19 = pointF.y - lVar3.d;
            if (z12) {
                float f20 = f9 / f12;
                if (Math.abs(f20 - 1.0f) < 1.0E-5f && Math.abs(f18) < 1.0E-5f && Math.abs(f19) < 1.0E-5f) {
                    return;
                }
                this.B = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new g(this, f18, new float[]{1.0f, 0.0f, 0.0f}, f19, f20, 1));
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
            l.f(lVar3, f18, f19);
            l.g(this.H, f9 / f12, 0.0f, 0.0f);
            r(false);
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.f49953a;
        RectF rectF = this.J;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.f49953a.getCropHeight();
    }

    public float getCropLeft() {
        return this.f49953a.getCropLeft();
    }

    public float getCropTop() {
        return this.f49953a.getCropTop();
    }

    public float getCropWidth() {
        return this.f49953a.getCropWidth();
    }

    public int getCurrentHeight() {
        l61 l61Var = this.d;
        if (l61Var != null) {
            return l61Var.getVideoHeight();
        }
        Bitmap bitmap = this.f49961w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.G;
        if (i10 != 90 && i10 != 270) {
            return bitmap.getHeight();
        }
        return bitmap.getWidth();
    }

    public int getCurrentWidth() {
        l61 l61Var = this.d;
        if (l61Var != null) {
            return l61Var.getVideoWidth();
        }
        Bitmap bitmap = this.f49961w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.G;
        if (i10 != 90 && i10 != 270) {
            return bitmap.getWidth();
        }
        return bitmap.getHeight();
    }

    public float getStateFullOrientation() {
        l lVar = this.H;
        if (lVar == null) {
            return 0.0f;
        }
        return lVar.f49948g + lVar.h;
    }

    public boolean getStateMirror() {
        l lVar = this.H;
        if (lVar != null && lVar.f49950j) {
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
        final float f9 = lVar.f49947f;
        CropAreaView cropAreaView = this.f49953a;
        AnimatorSet animatorSet = cropAreaView.f26369g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f26369g0 = null;
        }
        l lVar2 = this.H;
        if ((lVar2.h + lVar2.f49948g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f10 = currentWidth / currentHeight;
        float f11 = 1.0f;
        if (!this.f49962x) {
            f10 = 1.0f;
        }
        cropAreaView.a(this.h, f10);
        if (this.f49962x) {
            f11 = 0.0f;
        }
        cropAreaView.setLockedAspectRatio(f11);
        this.f49958n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.f26382x);
        l lVar3 = this.H;
        final float f12 = lVar3.f49945c;
        final float f13 = lVar3.d;
        final float f14 = lVar3.f49946e;
        final float f15 = lVar3.f49949i;
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
                nVar.f49953a.setActualRect(rectF5);
                l lVar4 = nVar.H;
                float f16 = 1.0f - floatValue;
                float f17 = lVar4.f49945c - (f12 * f16);
                float f18 = lVar4.d - (f13 * f16);
                float f19 = lVar4.f49949i - (f15 * f16);
                float lerp = AndroidUtilities.lerp(f14, f9, floatValue);
                l lVar5 = nVar.H;
                l.f(lVar5, -f17, -f18);
                l.g(nVar.H, lerp / lVar5.f49946e, 0.0f, 0.0f);
                l.e(nVar.H, -f19);
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
        lVar.f49950j = !lVar.f49950j;
        r(false);
        m mVar = this.I;
        if (mVar != null) {
            l lVar2 = this.H;
            float f9 = lVar2.h;
            float f10 = lVar2.f49948g;
            float f11 = ((f9 + f10) - f10) % 360.0f;
            if (!l.c(lVar2) && f11 == 0.0f && this.f49953a.getLockAspectRatio() == 0.0f && !this.H.f49950j) {
                z10 = true;
            }
            mVar.P(z10);
        }
        return this.H.f49950j;
    }

    public final void k() {
        this.f49953a.g(2, false);
        if (this.f49958n < 1.0E-5f) {
            this.f49958n = this.H.f49946e;
        }
    }

    public final void l(boolean z10) {
        boolean z11;
        float f9;
        CropAreaView cropAreaView = this.f49953a;
        AnimatorSet animatorSet = cropAreaView.f26369g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f26369g0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        l lVar = this.H;
        if (lVar != null && lVar.f49948g % 180.0f != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        cropAreaView.e(currentWidth, currentHeight, z11, this.f49962x);
        if (this.f49962x) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        cropAreaView.setLockedAspectRatio(f9);
        l lVar2 = this.H;
        if (lVar2 != null) {
            l.d(lVar2, 0.0f);
            this.H.f49950j = false;
        }
        cropAreaView.d(this.h);
        r(z10);
        this.f49958n = 0.0f;
        m mVar = this.I;
        if (mVar != null) {
            mVar.P(true);
            this.I.C(false);
        }
    }

    public final boolean m(float f9) {
        boolean z10;
        boolean z11;
        if (this.H != null) {
            CropAreaView cropAreaView = this.f49953a;
            AnimatorSet animatorSet = cropAreaView.f26369g0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.f26369g0 = null;
            }
            this.f49958n = 0.0f;
            l lVar = this.H;
            float f10 = lVar.h;
            float f11 = lVar.f49948g;
            float f12 = (((f10 + f11) - f11) + f9) % 360.0f;
            if (this.f49962x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = getCurrentWidth();
                int currentHeight = getCurrentHeight();
                if ((this.H.f49948g + f12) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, this.f49962x);
            }
            l.d(this.H, f12);
            r(false);
            e(true, false, false, false);
            m mVar = this.I;
            if (mVar != null) {
                if (f12 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.H.f49950j) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                mVar.P(z11);
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
        int i10 = 2;
        for (int i11 = 0; i11 < 6; i11++) {
            Integer[] numArr2 = numArr[i11];
            if (this.f49953a.getAspectRatio() > 1.0f) {
                strArr[i10] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i10] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i10++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new y1(13, this, numArr));
        c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.setCanceledOnTouchOutside(true);
        c2Var.setOnCancelListener(new zb(this, 4));
        c2Var.show();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.B) {
            CropAreaView cropAreaView = this.f49953a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.B) {
                    cropAreaView.g(3, true);
                    this.f49958n = 0.0f;
                    m mVar = this.I;
                    if (mVar != null) {
                        mVar.P(false);
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

    public final void p(int i10, f fVar, MediaController.CropState cropState) {
        this.f49962x = true;
        this.d = null;
        this.f49956e = fVar;
        this.G = i10;
        this.f49961w = null;
        CropAreaView cropAreaView = this.f49953a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.H = new l(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new i(this, cropState, currentHeight, currentWidth));
    }

    public final void q() {
        RectF rectF;
        float f9;
        int i10;
        float f10;
        float max;
        boolean z10;
        if (this.f49956e != null && this.H != null) {
            CropAreaView cropAreaView = this.f49953a;
            cropAreaView.d(this.J);
            int ceil = (int) Math.ceil(n(rectF, this.K));
            int ceil2 = (int) Math.ceil(f9 / cropAreaView.getAspectRatio());
            float cropWidth = ceil / cropAreaView.getCropWidth();
            Matrix matrix = this.H.f49951k;
            float[] fArr = this.D;
            matrix.getValues(fArr);
            l lVar = this.H;
            float f11 = lVar.f49947f * cropWidth;
            int i11 = (int) lVar.h;
            while (i11 < 0) {
                i11 += 360;
            }
            if (i11 != 90 && i11 != 270) {
                l lVar2 = this.H;
                i10 = (int) lVar2.f49943a;
                f10 = lVar2.f49944b;
            } else {
                l lVar3 = this.H;
                i10 = (int) lVar3.f49944b;
                f10 = lVar3.f49943a;
            }
            int i12 = (int) f10;
            double d = ceil;
            float f12 = i10;
            float ceil3 = (float) (d / Math.ceil(f12 * f11));
            float f13 = i12;
            float ceil4 = (float) (ceil2 / Math.ceil(f11 * f13));
            if (ceil3 > 1.0f || ceil4 > 1.0f) {
                float max2 = Math.max(ceil3, ceil4);
                ceil3 /= max2;
                ceil4 /= max2;
            }
            float f14 = ceil4;
            float f15 = ceil3;
            RectF rectF2 = cropAreaView.f26370h0;
            cropAreaView.a(rectF2, f12 / f13);
            if (this.f49962x) {
                max = rectF2.width() / f12;
            } else {
                max = Math.max(rectF2.width() / f12, rectF2.height() / f13);
            }
            l lVar4 = this.H;
            float f16 = lVar4.f49946e;
            float f17 = f16 / max;
            float f18 = f16 / lVar4.f49947f;
            float f19 = (fArr[2] / f12) / f16;
            float f20 = (fArr[5] / f13) / f16;
            float f21 = lVar4.f49949i;
            RectF targetRectToFill = cropAreaView.getTargetRectToFill();
            float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
            float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
            f fVar = this.f49956e;
            l lVar5 = this.H;
            if (!lVar5.f49950j && !l.c(lVar5) && this.H.f49948g < 1.0E-5f) {
                z10 = false;
            } else {
                z10 = true;
            }
            l lVar6 = this.H;
            fVar.e(z10, f19, f20, f21, (int) lVar6.h, f17, f18, lVar6.f49947f / max, f15, f14, cropCenterX, cropCenterY, lVar6.f49950j);
        }
    }

    public final void r(boolean z10) {
        if (this.H == null) {
            return;
        }
        Matrix matrix = this.f49955c;
        matrix.reset();
        l lVar = this.H;
        float f9 = lVar.f49948g;
        if (f9 != 90.0f && f9 != 270.0f) {
            matrix.postTranslate((-lVar.f49943a) / 2.0f, (-lVar.f49944b) / 2.0f);
        } else {
            matrix.postTranslate((-lVar.f49944b) / 2.0f, (-lVar.f49943a) / 2.0f);
        }
        matrix.postRotate((int) this.H.h);
        matrix.postConcat(this.H.f49951k);
        CropAreaView cropAreaView = this.f49953a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.f49962x || this.F || z10) {
            q();
            this.I.u();
        }
        invalidate();
    }

    public void setAspectRatio(float f9) {
        this.f49953a.setActualRect(f9);
    }

    public void setBottomPadding(float f9) {
        this.f49963y = f9;
        this.f49953a.setBottomPadding(f9);
    }

    public void setFreeform(boolean z10) {
        this.f49953a.setFreeform(z10);
        this.f49962x = z10;
    }

    public void setListener(m mVar) {
        this.I = mVar;
    }

    @Override
    public void setRotation(float f9) {
        l lVar = this.H;
        l.e(lVar, f9 - lVar.f49949i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.f49953a.setSubtitle(str);
    }

    public void setTopPadding(float f9) {
        this.A = f9;
        this.f49953a.setTopPadding(f9);
    }
}

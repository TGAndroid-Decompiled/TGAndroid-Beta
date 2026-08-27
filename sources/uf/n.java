package uf;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import lh.lc;
import m5.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.n40;
import org.telegram.ui.w;

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

    public final CropAreaView f48626a;

    public final ImageView f48627b;

    public final Matrix f48628c;
    public a61 d;

    public f f48629e;

    public final RectF f48630f;
    public final RectF h;

    public float f48631n;

    public final boolean f48632r;

    public final o f48633s;
    public final Matrix v;

    public Bitmap f48634w;

    public boolean f48635x;

    public float f48636y;

    public n(Context context) {
        super(context);
        this.D = new float[9];
        this.J = new RectF();
        this.K = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z10 = context instanceof BubbleActivity;
        this.f48632r = z10;
        this.f48630f = new RectF();
        this.h = new RectF();
        this.f48628c = new Matrix();
        o oVar = new o(25);
        oVar.f17823b = new float[8];
        this.f48633s = oVar;
        this.v = new Matrix();
        this.B = false;
        ImageView imageView = new ImageView(context);
        this.f48627b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        b bVar = new b(context);
        this.C = bVar;
        bVar.f48565b = this;
        CropAreaView cropAreaView = new CropAreaView(context);
        cropAreaView.d = new RectF();
        cropAreaView.f26350e = new RectF();
        cropAreaView.f26352f = new RectF();
        cropAreaView.h = new RectF();
        cropAreaView.f26360n = new RectF();
        cropAreaView.f26364r = new RectF();
        cropAreaView.f26365s = new RectF();
        cropAreaView.v = new RectF();
        cropAreaView.f26367x = new RectF();
        cropAreaView.f26368y = new RectF();
        cropAreaView.G = -1.0f;
        cropAreaView.H = 1.0f;
        cropAreaView.I = -1.0f;
        cropAreaView.Q = new AccelerateDecelerateInterpolator();
        cropAreaView.f26346b0 = true;
        cropAreaView.f26355h0 = new RectF();
        cropAreaView.f26357j0 = 0.0f;
        cropAreaView.f26358k0 = 1.0f;
        cropAreaView.f26359l0 = 0.0f;
        cropAreaView.m0 = 0.0f;
        cropAreaView.T = z10;
        cropAreaView.F = true;
        cropAreaView.E = true;
        cropAreaView.R = AndroidUtilities.dp(16.0f);
        cropAreaView.S = AndroidUtilities.dp(32.0f);
        cropAreaView.f26363p0 = 1;
        Paint paint = new Paint();
        cropAreaView.K = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        cropAreaView.L = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint paint3 = new Paint();
        cropAreaView.M = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        Paint paint4 = new Paint();
        cropAreaView.N = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        cropAreaView.O = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        cropAreaView.f26349d0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        cropAreaView.P = paint7;
        paint7.setColor(-1);
        cropAreaView.setWillNotDraw(false);
        this.f48626a = cropAreaView;
        cropAreaView.setListener(this);
        addView(cropAreaView);
    }

    public static void a(n nVar, Integer[][] numArr, int i10) {
        nVar.E = false;
        if (i10 == 0) {
            l lVar = nVar.H;
            float f10 = lVar.f48621g % 180.0f;
            nVar.setLockedAspectRatio((f10 != 0.0f ? lVar.f48617b : lVar.f48616a) / (f10 != 0.0f ? lVar.f48616a : lVar.f48617b));
        } else {
            if (i10 == 1) {
                nVar.setLockedAspectRatio(1.0f);
                return;
            }
            Integer[] numArr2 = numArr[i10 - 2];
            if (nVar.f48626a.getAspectRatio() > 1.0f) {
                nVar.setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
            } else {
                nVar.setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
            }
        }
    }

    public static void c(String str, Canvas canvas, Bitmap bitmap, Matrix matrix, int i10, int i11, float f10, float f11, float f12, float f13, ArrayList arrayList) {
        char c10;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            float fMax = Math.max(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight()) / Math.max(i10, i11);
            Matrix matrix2 = new Matrix();
            matrix2.postTranslate((-bitmapDecodeFile.getWidth()) / 2, (-bitmapDecodeFile.getHeight()) / 2);
            float f14 = 1.0f / fMax;
            matrix2.postScale(f14, f14);
            matrix2.postRotate(f12);
            matrix2.postConcat(matrix);
            matrix2.postScale(f13, f13);
            matrix2.postTranslate(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            canvas.drawBitmap(bitmapDecodeFile, matrix2, new Paint(2));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i12);
                    float[] fArr = {((mediaEntity.width / 2.0f) + mediaEntity.f19646x) * bitmapDecodeFile.getWidth(), ((mediaEntity.height / 2.0f) + mediaEntity.f19647y) * bitmapDecodeFile.getHeight(), mediaEntity.textViewX * bitmapDecodeFile.getWidth(), mediaEntity.textViewY * bitmapDecodeFile.getHeight()};
                    matrix2.mapPoints(fArr);
                    int width = bitmapDecodeFile.getWidth();
                    int height = bitmapDecodeFile.getHeight();
                    if (f12 == 90.0f || f12 == 270.0f) {
                        width = bitmapDecodeFile.getHeight();
                        height = bitmapDecodeFile.getWidth();
                    }
                    if (mediaEntity.type == 1) {
                        mediaEntity.width = ((mediaEntity.width * i10) / bitmap.getWidth()) * f13 * f10;
                        mediaEntity.height = ((mediaEntity.height * i11) / bitmap.getHeight()) * f13 * f10;
                        c10 = 1;
                    } else {
                        c10 = 1;
                        float f15 = i10;
                        float f16 = width;
                        mediaEntity.viewWidth = (int) ((mediaEntity.viewWidth / f15) * f16);
                        float f17 = i11;
                        float f18 = height;
                        mediaEntity.viewHeight = (int) ((mediaEntity.viewHeight / f17) * f18);
                        mediaEntity.width = ((mediaEntity.width * f15) / f16) * f13 * f10;
                        mediaEntity.height = ((mediaEntity.height * f17) / f18) * f13 * f10;
                    }
                    mediaEntity.f19646x = (fArr[0] / bitmap.getWidth()) - (mediaEntity.width / 2.0f);
                    mediaEntity.f19647y = (fArr[c10] / bitmap.getHeight()) - (mediaEntity.height / 2.0f);
                    mediaEntity.textViewX = fArr[2] / bitmap.getWidth();
                    mediaEntity.textViewY = fArr[3] / bitmap.getHeight();
                    mediaEntity.rotation = (float) (((double) mediaEntity.rotation) - (((double) (f11 + f12)) * 0.017453292519943295d));
                }
            }
            bitmapDecodeFile.recycle();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static float f(RectF rectF, float f10, float f11) {
        float fWidth = rectF.width() * f11;
        float fHeight = rectF.height() * f11;
        float fWidth2 = (rectF.width() - fWidth) / 2.0f;
        float fHeight2 = (rectF.height() - fHeight) / 2.0f;
        float f12 = rectF.left + fWidth2;
        float f13 = rectF.top + fHeight2;
        rectF.set(f12, f13, fWidth + f12, fHeight + f13);
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
        float fCenterX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f11);
        float fCenterY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f12);
        double d = f10;
        double d10 = 1.5707963267948966d - d;
        double d11 = fCenterX;
        float fSin = (float) (Math.sin(d10) * d11);
        float fCos = (float) (Math.cos(d10) * d11);
        double d12 = d + 1.5707963267948966d;
        double d13 = fCenterY;
        pointF.set(pointF.x + fSin + ((float) (Math.cos(d12) * d13)), pointF.y + fCos + ((float) (Math.sin(d12) * d13)));
    }

    public static String h(String str) {
        File file = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "_temp.jpg");
        try {
            AndroidUtilities.copyFile(new File(str), file);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        return file.getAbsolutePath();
    }

    public static float n(RectF rectF, RectF rectF2) {
        float fWidth = rectF2.width();
        if (((float) Math.floor((rectF.height() * fWidth) / rectF.width())) <= rectF2.height()) {
            return fWidth;
        }
        return (float) Math.floor((rectF.width() * rectF2.height()) / rectF.height());
    }

    private void setLockedAspectRatio(float f10) {
        CropAreaView cropAreaView = this.f48626a;
        cropAreaView.setLockedAspectRatio(f10);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f10);
        d(rectF);
        m mVar = this.I;
        if (mVar != null) {
            mVar.D(false);
            this.I.q(true);
        }
    }

    public final void b(MediaController.CropState cropState) {
        int i10;
        int i11;
        float f10;
        CropAreaView cropAreaView = this.f48626a;
        RectF rectF = this.J;
        cropAreaView.d(rectF);
        int iCeil = (int) Math.ceil(n(rectF, this.K));
        float f11 = iCeil;
        int iCeil2 = (int) Math.ceil(f11 / cropAreaView.getAspectRatio());
        float cropWidth = f11 / cropAreaView.getCropWidth();
        Matrix matrix = this.H.f48624k;
        float[] fArr = this.D;
        matrix.getValues(fArr);
        l lVar = this.H;
        float f12 = lVar.f48620f * cropWidth;
        cropState.transformRotation = (int) lVar.h;
        if (BuildVars.LOGS_ENABLED) {
            i0.a.v(cropState.transformRotation, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i10 = cropState.transformRotation;
            if (i10 >= 0) {
                break;
            } else {
                cropState.transformRotation = i10 + 360;
            }
        }
        if (i10 == 90 || i10 == 270) {
            l lVar2 = this.H;
            i11 = (int) lVar2.f48617b;
            f10 = lVar2.f48616a;
        } else {
            l lVar3 = this.H;
            i11 = (int) lVar3.f48616a;
            f10 = lVar3.f48617b;
        }
        int i12 = (int) f10;
        float f13 = i11;
        cropState.cropPw = (float) (((double) iCeil) / Math.ceil(f13 * f12));
        float f14 = i12;
        float fCeil = (float) (((double) iCeil2) / Math.ceil(f12 * f14));
        cropState.cropPh = fCeil;
        float f15 = cropState.cropPw;
        if (f15 > 1.0f || fCeil > 1.0f) {
            float fMax = Math.max(f15, fCeil);
            cropState.cropPw /= fMax;
            cropState.cropPh /= fMax;
        }
        cropState.cropScale = Math.min(f13 / cropAreaView.getCropWidth(), f14 / cropAreaView.getCropHeight()) * this.H.f48619e;
        float f16 = fArr[2] / f13;
        l lVar4 = this.H;
        float f17 = lVar4.f48619e;
        cropState.cropPx = f16 / f17;
        cropState.cropPy = (fArr[5] / f14) / f17;
        cropState.cropRotate = lVar4.f48622i;
        cropState.stateScale = f17;
        cropState.mirrored = lVar4.f48623j;
        cropState.scale = cropWidth;
        cropState.matrix = lVar4.f48624k;
        cropState.width = iCeil;
        cropState.height = iCeil2;
        cropState.freeform = this.f48635x;
        cropState.lockedAspectRatio = cropAreaView.getLockAspectRatio();
        cropState.initied = true;
    }

    public final void d(RectF rectF) {
        boolean z10;
        if (this.H == null) {
            return;
        }
        float[] fArr = {1.0f};
        float fWidth = rectF.width();
        CropAreaView cropAreaView = this.f48626a;
        float fMax = Math.max(fWidth / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f10 = this.H.f48619e;
        if (f10 * fMax > 30.0f) {
            fMax = 30.0f / f10;
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = fMax;
        int i10 = !this.f48632r ? AndroidUtilities.statusBarHeight : 0;
        float fCenterX = rectF.centerX();
        ImageView imageView = this.f48627b;
        float fA = l.a(this.H) * ((fCenterX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float fB = l.b(this.H) * ((rectF.centerY() - ((((imageView.getHeight() - this.f48636y) + i10) + this.A) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new g(this, f11, fArr, fA, fB, 0));
        valueAnimatorOfFloat.addListener(new n40(16, this, z10));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.Q;
        AnimatorSet animatorSet = cropAreaView.f26354g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f26354g0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.f26354g0 = animatorSet2;
        animatorSet2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cropAreaView, "cropLeft", rectF.left);
        objectAnimatorOfFloat.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cropAreaView, "cropTop", rectF.top);
        objectAnimatorOfFloat2.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(cropAreaView, "cropRight", rectF.right);
        objectAnimatorOfFloat3.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(cropAreaView, "cropBottom", rectF.bottom);
        objectAnimatorOfFloat4.setInterpolator(accelerateDecelerateInterpolator);
        valueAnimatorOfFloat.setInterpolator(accelerateDecelerateInterpolator);
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, valueAnimatorOfFloat);
        animatorSet2.addListener(new fk0(22, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z10, boolean z11, boolean z12, boolean z13) {
        float f10;
        if (this.H == null) {
            return;
        }
        CropAreaView cropAreaView = this.f48626a;
        float cropWidth = cropAreaView.getCropWidth();
        float cropHeight = cropAreaView.getCropHeight();
        float fA = l.a(this.H);
        float fB = l.b(this.H);
        float f11 = this.H.f48622i;
        float radians = (float) Math.toRadians(f11);
        RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
        Matrix matrix = new Matrix();
        matrix.postRotate(f11, cropWidth / 2.0f, cropHeight / 2.0f);
        matrix.mapRect(rectF);
        RectF rectF2 = new RectF(0.0f, 0.0f, fA, fB);
        float f12 = (cropWidth - fA) / 2.0f;
        l lVar = this.H;
        float f13 = lVar.f48619e;
        o oVar = this.f48633s;
        float[] fArr = (float[]) oVar.f17823b;
        float[] fArr2 = (float[]) oVar.f17823b;
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
        matrix2.set(lVar.f48624k);
        matrix2.preTranslate(f12 / f13, ((cropHeight - fB) / 2.0f) / f13);
        Matrix matrix3 = this.v;
        matrix3.reset();
        matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
        matrix3.setConcat(matrix3, matrix2);
        matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrix3.mapPoints(fArr2);
        matrix3.reset();
        matrix3.preRotate(-f11, fA / 2.0f, fB / 2.0f);
        matrix3.mapPoints(fArr2);
        rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
        l lVar2 = this.H;
        PointF pointF = new PointF(lVar2.f48618c, lVar2.d);
        if (!rectF2.contains(rectF)) {
            f10 = (!z10 || (rectF.width() <= rectF2.width() && rectF.height() <= rectF2.height())) ? f13 : f(rectF2, f13, rectF.width() / n(rectF, rectF2));
            g(rectF2, rectF, pointF, radians);
        } else if (!z11 || this.f48631n <= 0.0f) {
            f10 = f13;
        } else {
            float fWidth = rectF.width() / n(rectF, rectF2);
            if (this.H.f48619e * fWidth < this.f48631n) {
                fWidth = 1.0f;
            }
            f10 = f(rectF2, f13, fWidth);
            g(rectF2, rectF, pointF, radians);
        }
        float f18 = pointF.x;
        l lVar3 = this.H;
        float f19 = f18 - lVar3.f48618c;
        float f20 = pointF.y - lVar3.d;
        if (!z12) {
            l.f(lVar3, f19, f20);
            l.g(this.H, f10 / f13, 0.0f, 0.0f);
            r(false);
            return;
        }
        float f21 = f10 / f13;
        if (Math.abs(f21 - 1.0f) >= 1.0E-5f || Math.abs(f19) >= 1.0E-5f || Math.abs(f20) >= 1.0E-5f) {
            this.B = true;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new g(this, f19, new float[]{1.0f, 0.0f, 0.0f}, f20, f21, 1));
            valueAnimatorOfFloat.addListener(new k(this, z13, z10, z11, z12));
            valueAnimatorOfFloat.setInterpolator(cropAreaView.getInterpolator());
            valueAnimatorOfFloat.setDuration(z13 ? 100L : 200L);
            valueAnimatorOfFloat.start();
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.f48626a;
        RectF rectF = this.J;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.f48626a.getCropHeight();
    }

    public float getCropLeft() {
        return this.f48626a.getCropLeft();
    }

    public float getCropTop() {
        return this.f48626a.getCropTop();
    }

    public float getCropWidth() {
        return this.f48626a.getCropWidth();
    }

    public int getCurrentHeight() {
        a61 a61Var = this.d;
        if (a61Var != null) {
            return a61Var.getVideoHeight();
        }
        Bitmap bitmap = this.f48634w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.G;
        return (i10 == 90 || i10 == 270) ? bitmap.getWidth() : bitmap.getHeight();
    }

    public int getCurrentWidth() {
        a61 a61Var = this.d;
        if (a61Var != null) {
            return a61Var.getVideoWidth();
        }
        Bitmap bitmap = this.f48634w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.G;
        return (i10 == 90 || i10 == 270) ? bitmap.getHeight() : bitmap.getWidth();
    }

    public float getStateFullOrientation() {
        l lVar = this.H;
        if (lVar == null) {
            return 0.0f;
        }
        return lVar.f48621g + lVar.h;
    }

    public boolean getStateMirror() {
        l lVar = this.H;
        return lVar != null && lVar.f48623j;
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
        final float f10 = lVar.f48620f;
        CropAreaView cropAreaView = this.f48626a;
        AnimatorSet animatorSet = cropAreaView.f26354g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f26354g0 = null;
        }
        l lVar2 = this.H;
        if ((lVar2.h + lVar2.f48621g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f11 = currentWidth / currentHeight;
        if (!this.f48635x) {
            f11 = 1.0f;
        }
        cropAreaView.a(this.h, f11);
        cropAreaView.setLockedAspectRatio(this.f48635x ? 0.0f : 1.0f);
        this.f48631n = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.f26367x);
        l lVar3 = this.H;
        final float f12 = lVar3.f48618c;
        final float f13 = lVar3.d;
        final float f14 = lVar3.f48619e;
        final float f15 = lVar3.f48622i;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n nVar = this.f48600a;
                if (nVar.H == null) {
                    return;
                }
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = nVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                AndroidUtilities.lerp(rectF4, rectF3, fFloatValue, rectF5);
                nVar.f48626a.setActualRect(rectF5);
                l lVar4 = nVar.H;
                float f16 = 1.0f - fFloatValue;
                float f17 = lVar4.f48618c - (f12 * f16);
                float f18 = lVar4.d - (f13 * f16);
                float f19 = lVar4.f48622i - (f15 * f16);
                float fLerp = AndroidUtilities.lerp(f14, f10, fFloatValue);
                l lVar5 = nVar.H;
                float f20 = fLerp / lVar5.f48619e;
                l.f(lVar5, -f17, -f18);
                l.g(nVar.H, f20, 0.0f, 0.0f);
                l.e(nVar.H, -f19);
                nVar.e(true, false, false, false);
            }
        });
        valueAnimatorOfFloat.setInterpolator(cropAreaView.getInterpolator());
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.start();
    }

    public final boolean j() {
        l lVar = this.H;
        boolean z10 = false;
        if (lVar == null) {
            return false;
        }
        lVar.f48623j = !lVar.f48623j;
        r(false);
        m mVar = this.I;
        if (mVar != null) {
            l lVar2 = this.H;
            float f10 = lVar2.h;
            float f11 = lVar2.f48621g;
            float f12 = ((f10 + f11) - f11) % 360.0f;
            if (!l.c(lVar2) && f12 == 0.0f && this.f48626a.getLockAspectRatio() == 0.0f && !this.H.f48623j) {
                z10 = true;
            }
            mVar.D(z10);
        }
        return this.H.f48623j;
    }

    public final void k() {
        this.f48626a.g(2, false);
        if (this.f48631n < 1.0E-5f) {
            this.f48631n = this.H.f48619e;
        }
    }

    public final void l(boolean z10) {
        CropAreaView cropAreaView = this.f48626a;
        AnimatorSet animatorSet = cropAreaView.f26354g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f26354g0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        l lVar = this.H;
        cropAreaView.e(currentWidth, currentHeight, (lVar == null || lVar.f48621g % 180.0f == 0.0f) ? false : true, this.f48635x);
        cropAreaView.setLockedAspectRatio(this.f48635x ? 0.0f : 1.0f);
        l lVar2 = this.H;
        if (lVar2 != null) {
            l.d(lVar2, 0.0f);
            this.H.f48623j = false;
        }
        cropAreaView.d(this.h);
        r(z10);
        this.f48631n = 0.0f;
        m mVar = this.I;
        if (mVar != null) {
            mVar.D(true);
            this.I.q(false);
        }
    }

    public final boolean m(float f10) {
        if (this.H != null) {
            CropAreaView cropAreaView = this.f48626a;
            AnimatorSet animatorSet = cropAreaView.f26354g0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.f26354g0 = null;
            }
            this.f48631n = 0.0f;
            l lVar = this.H;
            float f11 = lVar.h;
            float f12 = lVar.f48621g;
            float f13 = (((f11 + f12) - f12) + f10) % 360.0f;
            if (!this.f48635x || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(getCurrentWidth(), getCurrentHeight(), (this.H.f48621g + f13) % 180.0f != 0.0f, this.f48635x);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            l.d(this.H, f13);
            r(false);
            e(true, false, false, false);
            m mVar = this.I;
            if (mVar != null) {
                mVar.D(f13 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.H.f48623j);
            }
            if (((int) this.H.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        int i10 = 4;
        if (this.H == null || this.E) {
            return;
        }
        this.E = true;
        String[] strArr = new String[8];
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = LocaleController.getString(R.string.CropOriginal);
        strArr[1] = LocaleController.getString(R.string.CropSquare);
        int i11 = 2;
        for (int i12 = 0; i12 < 6; i12++) {
            Integer[] numArr2 = numArr[i12];
            if (this.f48626a.getAspectRatio() > 1.0f) {
                strArr[i11] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i11] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i11++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new w(12, this, numArr));
        b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.setCanceledOnTouchOutside(true);
        b2Var.setOnCancelListener(new lc(this, i10));
        b2Var.show();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.B) {
            CropAreaView cropAreaView = this.f48626a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.B) {
                    cropAreaView.g(3, true);
                    this.f48631n = 0.0f;
                    m mVar = this.I;
                    if (mVar != null) {
                        mVar.D(false);
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
        this.f48635x = true;
        this.d = null;
        this.f48629e = fVar;
        this.G = i10;
        this.f48634w = null;
        CropAreaView cropAreaView = this.f48626a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.H = new l(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new i(this, cropState, currentHeight, currentWidth));
    }

    public final void q() {
        int i10;
        float f10;
        if (this.f48629e == null || this.H == null) {
            return;
        }
        CropAreaView cropAreaView = this.f48626a;
        RectF rectF = this.J;
        cropAreaView.d(rectF);
        int iCeil = (int) Math.ceil(n(rectF, this.K));
        float f11 = iCeil;
        int iCeil2 = (int) Math.ceil(f11 / cropAreaView.getAspectRatio());
        float cropWidth = f11 / cropAreaView.getCropWidth();
        Matrix matrix = this.H.f48624k;
        float[] fArr = this.D;
        matrix.getValues(fArr);
        l lVar = this.H;
        float f12 = lVar.f48620f * cropWidth;
        int i11 = (int) lVar.h;
        while (i11 < 0) {
            i11 += 360;
        }
        if (i11 == 90 || i11 == 270) {
            l lVar2 = this.H;
            i10 = (int) lVar2.f48617b;
            f10 = lVar2.f48616a;
        } else {
            l lVar3 = this.H;
            i10 = (int) lVar3.f48616a;
            f10 = lVar3.f48617b;
        }
        int i12 = (int) f10;
        double d = iCeil;
        float f13 = i10;
        float fCeil = (float) (d / Math.ceil(f13 * f12));
        float f14 = i12;
        float fCeil2 = (float) (((double) iCeil2) / Math.ceil(f12 * f14));
        if (fCeil > 1.0f || fCeil2 > 1.0f) {
            float fMax = Math.max(fCeil, fCeil2);
            fCeil /= fMax;
            fCeil2 /= fMax;
        }
        float f15 = fCeil2;
        float f16 = fCeil;
        RectF rectF2 = cropAreaView.f26355h0;
        cropAreaView.a(rectF2, f13 / f14);
        float fWidth = this.f48635x ? rectF2.width() / f13 : Math.max(rectF2.width() / f13, rectF2.height() / f14);
        l lVar4 = this.H;
        float f17 = lVar4.f48619e;
        float f18 = f17 / fWidth;
        float f19 = f17 / lVar4.f48620f;
        float f20 = (fArr[2] / f13) / f17;
        float f21 = (fArr[5] / f14) / f17;
        float f22 = lVar4.f48622i;
        RectF targetRectToFill = cropAreaView.getTargetRectToFill();
        float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
        float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
        f fVar = this.f48629e;
        l lVar5 = this.H;
        boolean z10 = lVar5.f48623j || l.c(lVar5) || this.H.f48621g >= 1.0E-5f;
        l lVar6 = this.H;
        fVar.e(z10, f20, f21, f22, (int) lVar6.h, f18, f19, lVar6.f48620f / fWidth, f16, f15, cropCenterX, cropCenterY, lVar6.f48623j);
    }

    public final void r(boolean z10) {
        if (this.H == null) {
            return;
        }
        Matrix matrix = this.f48628c;
        matrix.reset();
        l lVar = this.H;
        float f10 = lVar.f48621g;
        if (f10 == 90.0f || f10 == 270.0f) {
            matrix.postTranslate((-lVar.f48617b) / 2.0f, (-lVar.f48616a) / 2.0f);
        } else {
            matrix.postTranslate((-lVar.f48616a) / 2.0f, (-lVar.f48617b) / 2.0f);
        }
        matrix.postRotate((int) this.H.h);
        matrix.postConcat(this.H.f48624k);
        CropAreaView cropAreaView = this.f48626a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.f48635x || this.F || z10) {
            q();
            this.I.k();
        }
        invalidate();
    }

    public void setAspectRatio(float f10) {
        this.f48626a.setActualRect(f10);
    }

    public void setBottomPadding(float f10) {
        this.f48636y = f10;
        this.f48626a.setBottomPadding(f10);
    }

    public void setFreeform(boolean z10) {
        this.f48626a.setFreeform(z10);
        this.f48635x = z10;
    }

    public void setListener(m mVar) {
        this.I = mVar;
    }

    @Override
    public void setRotation(float f10) {
        l lVar = this.H;
        l.e(lVar, f10 - lVar.f48622i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.f48626a.setSubtitle(str);
    }

    public void setTopPadding(float f10) {
        this.A = f10;
        this.f48626a.setTopPadding(f10);
    }
}

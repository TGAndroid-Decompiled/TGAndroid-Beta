package pg;

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
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import gi.ob;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.r2;
import org.telegram.messenger.re;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.u;
import org.telegram.ui.u40;
public class m extends FrameLayout implements a {
    public float E;
    public float F;
    public boolean G;
    public final b H;
    public final float[] I;
    public boolean J;
    public boolean K;
    public int L;
    public k M;
    public l N;
    public final RectF O;
    public final RectF P;
    public final CropAreaView f53511a;
    public final ImageView f53512b;
    public final Matrix f53513c;
    public b51 d;
    public f f53514e;
    public final RectF f53515f;
    public final RectF h;
    public float f53516n;
    public final boolean f53517r;
    public final y00 f53518s;
    public final Matrix f53519w;
    public Bitmap f53520x;
    public boolean f53521y;

    public m(Context context) {
        super(context);
        this.I = new float[9];
        this.O = new RectF();
        this.P = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z10 = context instanceof BubbleActivity;
        this.f53517r = z10;
        this.f53515f = new RectF();
        this.h = new RectF();
        this.f53513c = new Matrix();
        ?? obj = new Object();
        obj.f40562a = new float[8];
        this.f53518s = obj;
        this.f53519w = new Matrix();
        this.G = false;
        ImageView imageView = new ImageView(context);
        this.f53512b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        b bVar = new b(context);
        this.H = bVar;
        bVar.f53451b = this;
        ?? viewGroup = new ViewGroup(context);
        viewGroup.d = new RectF();
        viewGroup.f31376e = new RectF();
        viewGroup.f31378f = new RectF();
        viewGroup.h = new RectF();
        viewGroup.f31386n = new RectF();
        viewGroup.f31391r = new RectF();
        viewGroup.f31393s = new RectF();
        viewGroup.f31397w = new RectF();
        viewGroup.f31399y = new RectF();
        viewGroup.E = new RectF();
        viewGroup.L = -1.0f;
        viewGroup.M = 1.0f;
        viewGroup.N = -1.0f;
        viewGroup.V = new AccelerateDecelerateInterpolator();
        viewGroup.f31380g0 = true;
        viewGroup.m0 = new RectF();
        viewGroup.f31388o0 = 0.0f;
        viewGroup.f31389p0 = 1.0f;
        viewGroup.f31390q0 = 0.0f;
        viewGroup.f31392r0 = 0.0f;
        viewGroup.f31372b0 = z10;
        viewGroup.K = true;
        viewGroup.J = true;
        viewGroup.W = g0.L(16.0f);
        viewGroup.f31370a0 = g0.L(32.0f);
        viewGroup.f31396u0 = 1;
        Paint paint = new Paint();
        viewGroup.P = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        viewGroup.Q = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(g0.L(2.0f));
        Paint paint3 = new Paint();
        viewGroup.R = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(g0.L(1.0f));
        Paint paint4 = new Paint();
        viewGroup.S = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        viewGroup.T = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        viewGroup.f31382i0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        viewGroup.U = paint7;
        paint7.setColor(-1);
        viewGroup.setWillNotDraw(false);
        this.f53511a = viewGroup;
        viewGroup.setListener(this);
        addView(viewGroup);
    }

    public static void a(m mVar, Integer[][] numArr, int i3) {
        float f10;
        float f11;
        mVar.J = false;
        if (i3 != 0) {
            if (i3 != 1) {
                Integer[] numArr2 = numArr[i3 - 2];
                if (mVar.f53511a.getAspectRatio() > 1.0f) {
                    mVar.setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
                    return;
                } else {
                    mVar.setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
                    return;
                }
            }
            mVar.setLockedAspectRatio(1.0f);
            return;
        }
        k kVar = mVar.M;
        int i10 = ((kVar.f53506g % 180.0f) > 0.0f ? 1 : ((kVar.f53506g % 180.0f) == 0.0f ? 0 : -1));
        if (i10 != 0) {
            f10 = kVar.f53502b;
        } else {
            f10 = kVar.f53501a;
        }
        if (i10 != 0) {
            f11 = kVar.f53501a;
        } else {
            f11 = kVar.f53502b;
        }
        mVar.setLockedAspectRatio(f10 / f11);
    }

    public static void c(String str, Canvas canvas, Bitmap bitmap, Matrix matrix, int i3, int i10, float f10, float f11, float f12, float f13, ArrayList arrayList) {
        int i11 = i3;
        int i12 = i10;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix2 = new Matrix();
            char c2 = 2;
            matrix2.postTranslate((-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2);
            float max = 1.0f / (Math.max(decodeFile.getWidth(), decodeFile.getHeight()) / Math.max(i3, i10));
            matrix2.postScale(max, max);
            matrix2.postRotate(f12);
            matrix2.postConcat(matrix);
            matrix2.postScale(f13, f13);
            matrix2.postTranslate(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            canvas.drawBitmap(decodeFile, matrix2, new Paint(2));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    z10 z10Var = (z10) arrayList.get(i13);
                    float width = ((z10Var.f26707f / 2.0f) + z10Var.f26705c) * decodeFile.getWidth();
                    float height = ((z10Var.f26708g / 2.0f) + z10Var.d) * decodeFile.getHeight();
                    char c10 = c2;
                    float width2 = z10Var.f26724y * decodeFile.getWidth();
                    float height2 = z10Var.f26725z * decodeFile.getHeight();
                    float[] fArr = new float[4];
                    fArr[0] = width;
                    fArr[1] = height;
                    fArr[c10] = width2;
                    fArr[3] = height2;
                    matrix2.mapPoints(fArr);
                    int width3 = decodeFile.getWidth();
                    int height3 = decodeFile.getHeight();
                    if (f12 == 90.0f || f12 == 270.0f) {
                        width3 = decodeFile.getHeight();
                        height3 = decodeFile.getWidth();
                    }
                    if (z10Var.f26703a == 1) {
                        z10Var.f26707f = ((z10Var.f26707f * i11) / bitmap.getWidth()) * f13 * f10;
                        z10Var.f26708g = ((z10Var.f26708g * i12) / bitmap.getHeight()) * f13 * f10;
                    } else {
                        float f14 = i11;
                        float f15 = width3;
                        z10Var.f26717q = (int) ((z10Var.f26717q / f14) * f15);
                        float f16 = i12;
                        float f17 = height3;
                        z10Var.f26718r = (int) ((z10Var.f26718r / f16) * f17);
                        z10Var.f26707f = ((z10Var.f26707f * f14) / f15) * f13 * f10;
                        z10Var.f26708g = ((z10Var.f26708g * f16) / f17) * f13 * f10;
                    }
                    z10Var.f26705c = (fArr[0] / bitmap.getWidth()) - (z10Var.f26707f / 2.0f);
                    z10Var.d = (fArr[1] / bitmap.getHeight()) - (z10Var.f26708g / 2.0f);
                    z10Var.f26724y = fArr[c10] / bitmap.getWidth();
                    z10Var.f26725z = fArr[3] / bitmap.getHeight();
                    z10Var.f26706e = (float) (z10Var.f26706e - ((f11 + f12) * 0.017453292519943295d));
                    i13++;
                    i11 = i3;
                    i12 = i10;
                    c2 = c10;
                }
            }
            decodeFile.recycle();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
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
        File z10 = w7.z(4);
        File file = new File(z10, az.p() + "_temp.jpg");
        try {
            g0.E(new File(str), file);
        } catch (Exception e10) {
            a8.g(e10, true);
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
        CropAreaView cropAreaView = this.f53511a;
        cropAreaView.setLockedAspectRatio(f10);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f10);
        d(rectF);
        l lVar = this.N;
        if (lVar != null) {
            lVar.Q(false);
            this.N.A(true);
        }
    }

    public final void b(re reVar) {
        RectF rectF;
        float f10;
        int i3;
        int i10;
        float f11;
        CropAreaView cropAreaView = this.f53511a;
        cropAreaView.d(this.O);
        int ceil = (int) Math.ceil(n(rectF, this.P));
        int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.M.f53509k;
        float[] fArr = this.I;
        matrix.getValues(fArr);
        k kVar = this.M;
        float f12 = kVar.f53505f * cropWidth;
        reVar.f25117k = (int) kVar.h;
        if (r2.f25040a) {
            p1.q(reVar.f25117k, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i3 = reVar.f25117k;
            if (i3 >= 0) {
                break;
            }
            reVar.f25117k = i3 + 360;
        }
        if (i3 != 90 && i3 != 270) {
            k kVar2 = this.M;
            i10 = (int) kVar2.f53501a;
            f11 = kVar2.f53502b;
        } else {
            k kVar3 = this.M;
            i10 = (int) kVar3.f53502b;
            f11 = kVar3.f53501a;
        }
        int i11 = (int) f11;
        float f13 = i10;
        reVar.f25113e = (float) (ceil / Math.ceil(f13 * f12));
        float f14 = i11;
        float ceil3 = (float) (ceil2 / Math.ceil(f12 * f14));
        reVar.f25114f = ceil3;
        float f15 = reVar.f25113e;
        if (f15 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f15, ceil3);
            reVar.f25113e /= max;
            reVar.f25114f /= max;
        }
        reVar.f25112c = Math.min(f13 / cropAreaView.getCropWidth(), f14 / cropAreaView.getCropHeight()) * this.M.f53504e;
        float f16 = fArr[2] / f13;
        k kVar4 = this.M;
        float f17 = kVar4.f53504e;
        reVar.f25110a = f16 / f17;
        reVar.f25111b = (fArr[5] / f14) / f17;
        reVar.d = kVar4.f53507i;
        reVar.f25119m = f17;
        reVar.f25118l = kVar4.f53508j;
        reVar.f25120o = cropWidth;
        reVar.f25121r = kVar4.f53509k;
        reVar.f25122s = ceil;
        reVar.f25123t = ceil2;
        reVar.f25124u = this.f53521y;
        reVar.v = cropAreaView.getLockAspectRatio();
        reVar.C = true;
    }

    public final void d(RectF rectF) {
        boolean z10;
        int i3;
        if (this.M == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.f53511a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f10 = this.M.f53504e;
        if (f10 * max > 30.0f) {
            max = 30.0f / f10;
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = max;
        if (!this.f53517r) {
            i3 = g0.f22602m;
        } else {
            i3 = 0;
        }
        float centerX = rectF.centerX();
        ImageView imageView = this.f53512b;
        float a10 = k.a(this.M) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = k.b(this.M) * ((rectF.centerY() - ((((imageView.getHeight() - this.E) + i3) + this.F) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new g(this, f11, fArr, a10, b10, 0));
        ofFloat.addListener(new u40(14, this, z10));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.V;
        AnimatorSet animatorSet = cropAreaView.f31385l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f31385l0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.f31385l0 = animatorSet2;
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
        animatorSet2.addListener(new ri0(17, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z10, boolean z11, boolean z12, boolean z13) {
        float f10;
        long j10;
        if (this.M != null) {
            CropAreaView cropAreaView = this.f53511a;
            float cropWidth = cropAreaView.getCropWidth();
            float cropHeight = cropAreaView.getCropHeight();
            float a10 = k.a(this.M);
            float b10 = k.b(this.M);
            float f11 = this.M.f53507i;
            float radians = (float) Math.toRadians(f11);
            RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
            Matrix matrix = new Matrix();
            matrix.postRotate(f11, cropWidth / 2.0f, cropHeight / 2.0f);
            matrix.mapRect(rectF);
            RectF rectF2 = new RectF(0.0f, 0.0f, a10, b10);
            float f12 = (cropWidth - a10) / 2.0f;
            k kVar = this.M;
            float f13 = kVar.f53504e;
            y00 y00Var = this.f53518s;
            float[] fArr = (float[]) y00Var.f40562a;
            float[] fArr2 = (float[]) y00Var.f40562a;
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
            matrix2.set(kVar.f53509k);
            matrix2.preTranslate(f12 / f13, ((cropHeight - b10) / 2.0f) / f13);
            Matrix matrix3 = this.f53519w;
            matrix3.reset();
            matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
            matrix3.setConcat(matrix3, matrix2);
            matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
            matrix3.mapPoints(fArr2);
            matrix3.reset();
            matrix3.preRotate(-f11, a10 / 2.0f, b10 / 2.0f);
            matrix3.mapPoints(fArr2);
            rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
            k kVar2 = this.M;
            PointF pointF = new PointF(kVar2.f53503c, kVar2.d);
            if (!rectF2.contains(rectF)) {
                if (z10 && (rectF.width() > rectF2.width() || rectF.height() > rectF2.height())) {
                    f10 = f(rectF2, f13, rectF.width() / n(rectF, rectF2));
                } else {
                    f10 = f13;
                }
                g(rectF2, rectF, pointF, radians);
            } else if (z11 && this.f53516n > 0.0f) {
                float width = rectF.width() / n(rectF, rectF2);
                if (this.M.f53504e * width < this.f53516n) {
                    width = 1.0f;
                }
                f10 = f(rectF2, f13, width);
                g(rectF2, rectF, pointF, radians);
            } else {
                f10 = f13;
            }
            float f18 = pointF.x;
            k kVar3 = this.M;
            float f19 = f18 - kVar3.f53503c;
            float f20 = pointF.y - kVar3.d;
            if (z12) {
                float f21 = f10 / f13;
                if (Math.abs(f21 - 1.0f) < 1.0E-5f && Math.abs(f19) < 1.0E-5f && Math.abs(f20) < 1.0E-5f) {
                    return;
                }
                this.G = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new g(this, f19, new float[]{1.0f, 0.0f, 0.0f}, f20, f21, 1));
                ofFloat.addListener(new j(this, z13, z10, z11, z12));
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
            k.f(kVar3, f19, f20);
            k.g(this.M, f10 / f13, 0.0f, 0.0f);
            r(false);
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.f53511a;
        RectF rectF = this.O;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.f53511a.getCropHeight();
    }

    public float getCropLeft() {
        return this.f53511a.getCropLeft();
    }

    public float getCropTop() {
        return this.f53511a.getCropTop();
    }

    public float getCropWidth() {
        return this.f53511a.getCropWidth();
    }

    public int getCurrentHeight() {
        b51 b51Var = this.d;
        if (b51Var != null) {
            return b51Var.getVideoHeight();
        }
        Bitmap bitmap = this.f53520x;
        if (bitmap == null) {
            return 1;
        }
        int i3 = this.L;
        if (i3 != 90 && i3 != 270) {
            return bitmap.getHeight();
        }
        return bitmap.getWidth();
    }

    public int getCurrentWidth() {
        b51 b51Var = this.d;
        if (b51Var != null) {
            return b51Var.getVideoWidth();
        }
        Bitmap bitmap = this.f53520x;
        if (bitmap == null) {
            return 1;
        }
        int i3 = this.L;
        if (i3 != 90 && i3 != 270) {
            return bitmap.getWidth();
        }
        return bitmap.getHeight();
    }

    public float getStateFullOrientation() {
        k kVar = this.M;
        if (kVar == null) {
            return 0.0f;
        }
        return kVar.f53506g + kVar.h;
    }

    public boolean getStateMirror() {
        k kVar = this.M;
        if (kVar != null && kVar.f53508j) {
            return true;
        }
        return false;
    }

    public float getStateOrientation() {
        k kVar = this.M;
        if (kVar == null) {
            return 0.0f;
        }
        return kVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        k kVar = this.M;
        if (kVar == null) {
            return;
        }
        final float f10 = kVar.f53505f;
        CropAreaView cropAreaView = this.f53511a;
        AnimatorSet animatorSet = cropAreaView.f31385l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f31385l0 = null;
        }
        k kVar2 = this.M;
        if ((kVar2.h + kVar2.f53506g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f11 = currentWidth / currentHeight;
        float f12 = 1.0f;
        if (!this.f53521y) {
            f11 = 1.0f;
        }
        cropAreaView.a(this.h, f11);
        if (this.f53521y) {
            f12 = 0.0f;
        }
        cropAreaView.setLockedAspectRatio(f12);
        this.f53516n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.f31399y);
        k kVar3 = this.M;
        final float f13 = kVar3.f53503c;
        final float f14 = kVar3.d;
        final float f15 = kVar3.f53504e;
        final float f16 = kVar3.f53507i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                m mVar = m.this;
                if (mVar.M == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = mVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                g0.Z1(rectF4, rectF3, floatValue, rectF5);
                mVar.f53511a.setActualRect(rectF5);
                k kVar4 = mVar.M;
                float f17 = 1.0f - floatValue;
                float f18 = kVar4.f53503c - (f13 * f17);
                float f19 = kVar4.d - (f14 * f17);
                float f20 = kVar4.f53507i - (f16 * f17);
                float T1 = g0.T1(f15, f10, floatValue);
                k kVar5 = mVar.M;
                k.f(kVar5, -f18, -f19);
                k.g(mVar.M, T1 / kVar5.f53504e, 0.0f, 0.0f);
                k.e(mVar.M, -f20);
                mVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        k kVar = this.M;
        boolean z10 = false;
        if (kVar == null) {
            return false;
        }
        kVar.f53508j = !kVar.f53508j;
        r(false);
        l lVar = this.N;
        if (lVar != null) {
            k kVar2 = this.M;
            float f10 = kVar2.h;
            float f11 = kVar2.f53506g;
            float f12 = ((f10 + f11) - f11) % 360.0f;
            if (!k.c(kVar2) && f12 == 0.0f && this.f53511a.getLockAspectRatio() == 0.0f && !this.M.f53508j) {
                z10 = true;
            }
            lVar.Q(z10);
        }
        return this.M.f53508j;
    }

    public final void k() {
        this.f53511a.g(2, false);
        if (this.f53516n < 1.0E-5f) {
            this.f53516n = this.M.f53504e;
        }
    }

    public final void l(boolean z10) {
        boolean z11;
        float f10;
        CropAreaView cropAreaView = this.f53511a;
        AnimatorSet animatorSet = cropAreaView.f31385l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f31385l0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        k kVar = this.M;
        if (kVar != null && kVar.f53506g % 180.0f != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        cropAreaView.e(currentWidth, currentHeight, z11, this.f53521y);
        if (this.f53521y) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        cropAreaView.setLockedAspectRatio(f10);
        k kVar2 = this.M;
        if (kVar2 != null) {
            k.d(kVar2, 0.0f);
            this.M.f53508j = false;
        }
        cropAreaView.d(this.h);
        r(z10);
        this.f53516n = 0.0f;
        l lVar = this.N;
        if (lVar != null) {
            lVar.Q(true);
            this.N.A(false);
        }
    }

    public final boolean m(float f10) {
        boolean z10;
        boolean z11;
        if (this.M != null) {
            CropAreaView cropAreaView = this.f53511a;
            AnimatorSet animatorSet = cropAreaView.f31385l0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.f31385l0 = null;
            }
            this.f53516n = 0.0f;
            k kVar = this.M;
            float f11 = kVar.h;
            float f12 = kVar.f53506g;
            float f13 = (((f11 + f12) - f12) + f10) % 360.0f;
            if (this.f53521y && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = getCurrentWidth();
                int currentHeight = getCurrentHeight();
                if ((this.M.f53506g + f13) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, this.f53521y);
            }
            k.d(this.M, f13);
            r(false);
            e(true, false, false, false);
            l lVar = this.N;
            if (lVar != null) {
                if (f13 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.M.f53508j) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lVar.Q(z11);
            }
            if (((int) this.M.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        if (this.M == null || this.J) {
            return;
        }
        this.J = true;
        String[] strArr = new String[8];
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = bd.M0(2131751698, null);
        strArr[1] = bd.M0(2131751696, null);
        int i3 = 2;
        for (int i10 = 0; i10 < 6; i10++) {
            Integer[] numArr2 = numArr[i10];
            if (this.f53511a.getAspectRatio() > 1.0f) {
                strArr[i3] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i3] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i3++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new u(13, this, numArr));
        s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.setCanceledOnTouchOutside(true);
        s1Var.setOnCancelListener(new ob(this, 4));
        s1Var.show();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.G) {
            CropAreaView cropAreaView = this.f53511a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.G) {
                    cropAreaView.g(3, true);
                    this.f53516n = 0.0f;
                    l lVar = this.N;
                    if (lVar != null) {
                        lVar.Q(false);
                    }
                }
                try {
                    this.H.a(motionEvent);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void p(int i3, f fVar, re reVar) {
        this.f53521y = true;
        this.d = null;
        this.f53514e = fVar;
        this.L = i3;
        this.f53520x = null;
        CropAreaView cropAreaView = this.f53511a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.M = new k(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new i(this, reVar, currentHeight, currentWidth, 0));
    }

    public final void q() {
        RectF rectF;
        float f10;
        int i3;
        float f11;
        float max;
        boolean z10;
        if (this.f53514e != null && this.M != null) {
            CropAreaView cropAreaView = this.f53511a;
            cropAreaView.d(this.O);
            int ceil = (int) Math.ceil(n(rectF, this.P));
            int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
            float cropWidth = ceil / cropAreaView.getCropWidth();
            Matrix matrix = this.M.f53509k;
            float[] fArr = this.I;
            matrix.getValues(fArr);
            k kVar = this.M;
            float f12 = kVar.f53505f * cropWidth;
            int i10 = (int) kVar.h;
            while (i10 < 0) {
                i10 += 360;
            }
            if (i10 != 90 && i10 != 270) {
                k kVar2 = this.M;
                i3 = (int) kVar2.f53501a;
                f11 = kVar2.f53502b;
            } else {
                k kVar3 = this.M;
                i3 = (int) kVar3.f53502b;
                f11 = kVar3.f53501a;
            }
            int i11 = (int) f11;
            double d = ceil;
            float f13 = i3;
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
            RectF rectF2 = cropAreaView.m0;
            cropAreaView.a(rectF2, f13 / f14);
            if (this.f53521y) {
                max = rectF2.width() / f13;
            } else {
                max = Math.max(rectF2.width() / f13, rectF2.height() / f14);
            }
            k kVar4 = this.M;
            float f17 = kVar4.f53504e;
            float f18 = f17 / max;
            float f19 = f17 / kVar4.f53505f;
            float f20 = (fArr[2] / f13) / f17;
            float f21 = (fArr[5] / f14) / f17;
            float f22 = kVar4.f53507i;
            RectF targetRectToFill = cropAreaView.getTargetRectToFill();
            float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
            float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
            f fVar = this.f53514e;
            k kVar5 = this.M;
            if (!kVar5.f53508j && !k.c(kVar5) && this.M.f53506g < 1.0E-5f) {
                z10 = false;
            } else {
                z10 = true;
            }
            boolean z11 = z10;
            k kVar6 = this.M;
            fVar.e(z11, f20, f21, f22, (int) kVar6.h, f18, f19, kVar6.f53505f / max, f16, f15, cropCenterX, cropCenterY, kVar6.f53508j);
        }
    }

    public final void r(boolean z10) {
        if (this.M == null) {
            return;
        }
        Matrix matrix = this.f53513c;
        matrix.reset();
        k kVar = this.M;
        float f10 = kVar.f53506g;
        if (f10 != 90.0f && f10 != 270.0f) {
            matrix.postTranslate((-kVar.f53501a) / 2.0f, (-kVar.f53502b) / 2.0f);
        } else {
            matrix.postTranslate((-kVar.f53502b) / 2.0f, (-kVar.f53501a) / 2.0f);
        }
        matrix.postRotate((int) this.M.h);
        matrix.postConcat(this.M.f53509k);
        CropAreaView cropAreaView = this.f53511a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.f53521y || this.K || z10) {
            q();
            this.N.u();
        }
        invalidate();
    }

    public void setAspectRatio(float f10) {
        this.f53511a.setActualRect(f10);
    }

    public void setBottomPadding(float f10) {
        this.E = f10;
        this.f53511a.setBottomPadding(f10);
    }

    public void setFreeform(boolean z10) {
        this.f53511a.setFreeform(z10);
        this.f53521y = z10;
    }

    public void setListener(l lVar) {
        this.N = lVar;
    }

    @Override
    public void setRotation(float f10) {
        k kVar = this.M;
        k.e(kVar, f10 - kVar.f53507i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.f53511a.setSubtitle(str);
    }

    public void setTopPadding(float f10) {
        this.F = f10;
        this.f53511a.setTopPadding(f10);
    }
}

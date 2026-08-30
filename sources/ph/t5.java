package ph;

import android.app.Activity;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rp;
public final class t5 extends View implements c2 {
    public final org.telegram.ui.Components.z5 A0;
    public final Paint B;
    public final org.telegram.ui.Components.z5 B0;
    public final Paint C;
    public final org.telegram.ui.Components.z5 C0;
    public final Paint D;
    public final org.telegram.ui.Components.z5 D0;
    public final Matrix E;
    public float E0;
    public final RadialGradient F;
    public final org.telegram.ui.Components.z5 F0;
    public final rc G;
    public final org.telegram.ui.Components.z5 G0;
    public final rc H;
    public final org.telegram.ui.Components.z5 H0;
    public final rc I;
    public final q5 I0;
    public float J;
    public final q5 J0;
    public final org.telegram.ui.Components.z5 K;
    public final Path K0;
    public boolean L;
    public final Path L0;
    public final org.telegram.ui.Components.z5 M;
    public final PointF M0;
    public long N;
    public final PointF N0;
    public long O;
    public final PointF O0;
    public final Path P;
    public final PointF P0;
    public final PointF Q;
    public final PointF Q0;
    public final PointF R;
    public final PointF R0;
    public final PointF S;
    public final PointF S0;
    public final s5 T;
    public final PointF T0;
    public boolean U;
    public boolean U0;
    public boolean V;
    public boolean W;
    public r5 f42332a;
    public boolean f42333a0;
    public final ImageReceiver f42334b;
    public boolean f42335b0;
    public final nq f42336c;
    public boolean f42337c0;
    public final Drawable d;
    public float f42338d0;
    public final Drawable e;
    public final org.telegram.ui.Components.z5 f42339e0;
    public final Drawable f42340f;
    public float f42341f0;
    public float f42342g0;
    public final Drawable h;
    public float f42343h0;
    public float f42344i0;
    public final org.telegram.ui.Components.z5 f42345j0;
    public float f42346k0;
    public boolean f42347l0;
    public final org.telegram.ui.Components.z5 m0;
    public final Drawable f42348n;
    public final org.telegram.ui.Components.z5 f42349n0;
    public boolean f42350o0;
    public final float[] f42351p0;
    public final org.telegram.ui.Components.z5 f42352q0;
    public final Paint f42353r;
    public boolean f42354r0;
    public final Paint f42355s;
    public long f42356s0;
    public boolean f42357t0;
    public boolean f42358u0;
    public final Paint v;
    public float f42359v0;
    public final Paint f42360w;
    public boolean f42361w0;
    public final Paint f42362x;
    public boolean f42363x0;
    public final Paint f42364y;
    public final org.telegram.ui.Components.z5 f42365y0;
    public final org.telegram.ui.Components.z5 f42366z0;

    public t5(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f42334b = imageReceiver;
        this.f42353r = new Paint(1);
        Paint paint = new Paint(1);
        this.f42355s = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        Paint paint3 = new Paint(1);
        this.f42360w = paint3;
        Paint paint4 = new Paint(1);
        this.f42362x = paint4;
        Paint paint5 = new Paint(1);
        this.f42364y = paint5;
        Paint paint6 = new Paint(1);
        this.B = paint6;
        Paint paint7 = new Paint(1);
        this.C = paint7;
        Paint paint8 = new Paint(1);
        this.D = paint8;
        Matrix matrix = new Matrix();
        this.E = matrix;
        this.G = new rc(this);
        this.H = new rc(this);
        this.I = new rc(this);
        nr nrVar = nr.h;
        this.K = new org.telegram.ui.Components.z5(this, 0L, 310L, nrVar);
        this.M = new org.telegram.ui.Components.z5(this, 0L, 330L, nrVar);
        this.P = new Path();
        this.Q = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.R = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.S = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.f42339e0 = new org.telegram.ui.Components.z5(this, 0L, 200L, nr.f27346f);
        this.f42345j0 = new org.telegram.ui.Components.z5(this, 0L, 350L, nrVar);
        this.f42346k0 = -1.0f;
        this.f42347l0 = true;
        this.m0 = new org.telegram.ui.Components.z5(this, 0L, 350L, nrVar);
        this.f42349n0 = new org.telegram.ui.Components.z5(this, 0L, 850L, nrVar);
        this.f42351p0 = new float[2];
        this.f42352q0 = new org.telegram.ui.Components.z5(this, 0L, 350L, nrVar);
        this.f42365y0 = new org.telegram.ui.Components.z5(this, 0L, 350L, nrVar);
        this.f42366z0 = new org.telegram.ui.Components.z5(this, 0L, 650L, nrVar);
        this.A0 = new org.telegram.ui.Components.z5(this, 0L, 160L, nr.f27348i);
        this.B0 = new org.telegram.ui.Components.z5(this, 0L, 750L, nrVar);
        this.C0 = new org.telegram.ui.Components.z5(this, 0L, 650L, nrVar);
        this.D0 = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.F0 = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.G0 = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.H0 = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.I0 = new q5(this, 2);
        this.J0 = new q5(this, 3);
        this.K0 = new Path();
        this.L0 = new Path();
        this.M0 = new PointF();
        this.N0 = new PointF();
        this.O0 = new PointF();
        this.P0 = new PointF();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        this.T0 = new PointF();
        setWillNotDraw(false);
        s5 s5Var = new s5(this, this);
        this.T = s5Var;
        r0.j0.k(this, s5Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = radialGradient;
        radialGradient.setLocalMatrix(matrix);
        paint5.setShader(radialGradient);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(-577231);
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        paint3.setColor(1677721600);
        paint4.setColor(-1);
        paint6.setColor(1493172223);
        paint7.setColor(402653184);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint7.setStyle(style);
        paint7.setStrokeCap(cap);
        paint8.setStyle(style);
        paint8.setStrokeJoin(Paint.Join.ROUND);
        paint8.setStrokeCap(cap);
        if (Build.VERSION.SDK_INT >= 29) {
            paint8.setBlendMode(BlendMode.CLEAR);
        } else {
            paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        imageReceiver.setParentView(this);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        Drawable mutate = activity.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        nq nqVar = new nq(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.f42336c = nqVar;
        nqVar.f27342w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        nqVar.e = dp;
        nqVar.f27338f = dp2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f42340f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.f42348n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f10, float f11, double d, float f12, PointF pointF) {
        double d10 = f12;
        pointF.x = (float) ((Math.cos(d) * d10) + f10);
        pointF.y = (float) ((Math.sin(d) * d10) + f11);
    }

    public static void f(Drawable drawable, float f10, float f11) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f10 - max), (int) (f11 - max), (int) (f10 + max), (int) (f11 + max));
    }

    public final boolean b() {
        if (this.E0 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean c(float f10, float f11, float f12, float f13, float f14, boolean z4) {
        if (this.f42350o0) {
            if ((!z4 || f13 - f11 <= AndroidUtilities.dp(100.0f)) && Math.abs(f12 - f10) <= f14) {
                return true;
            }
            return false;
        } else if (k7.n6.a(f10, f11, f12, f13) <= f14) {
            return true;
        } else {
            return false;
        }
    }

    public final void d(float f10) {
        long j10;
        if (f10 > 180.0f) {
            j10 = 620;
        } else {
            j10 = 310;
        }
        this.K.f31243g = j10;
        this.J += f10;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        s5 s5Var = this.T;
        if (s5Var != null && s5Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(float f10, boolean z4) {
        boolean z10;
        if (Math.abs(f10 - this.E0) < 0.01f) {
            return;
        }
        this.E0 = f10;
        if (!z4) {
            if (f10 > 0.0f && !this.f42350o0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.F0.f(z10, true);
            this.G0.d(f10, true);
        }
        invalidate();
    }

    public final void g(boolean z4) {
        this.f42354r0 = false;
        if (!z4) {
            org.telegram.ui.Components.z5 z5Var = this.f42352q0;
            z5Var.getClass();
            z5Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        MediaController.PhotoEntry photoEntry;
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        r5 r5Var = this.f42332a;
        ImageReceiver imageReceiver = this.f42334b;
        if (r5Var != null) {
            r5Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().f15935w.f42319b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((u6) arrayList2.get(0)).O0 != null) {
                this.f42334b.setImage(ImageLocation.getForPath(((u6) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.f42336c, 0L, null, null, 0);
                return;
            }
        }
        MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
        if (albumEntry != null && (arrayList = albumEntry.photos) != null && !arrayList.isEmpty()) {
            photoEntry = albumEntry.photos.get(0);
        } else {
            photoEntry = null;
        }
        if (photoEntry != null && (str = photoEntry.thumbPath) != null) {
            this.f42334b.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.f42336c, 0L, null, null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                this.f42334b.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f42336c, 0L, null, null, 0);
                return;
            }
            imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            this.f42334b.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f42336c, 0L, null, null, 0);
        } else {
            imageReceiver.setImageBitmap(this.f42336c);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42334b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f42334b.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z4;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        char c3;
        float f22;
        float f23;
        Canvas canvas2;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        RectF rectF;
        Paint paint;
        float f31;
        RectF rectF2;
        float f32;
        float f33;
        boolean z10;
        boolean z11;
        RectF rectF3;
        float f34;
        long j10;
        Canvas canvas3;
        float f35;
        float f36;
        float f37;
        float f38;
        float f39;
        org.telegram.ui.Components.z5 z5Var;
        rc rcVar;
        float f40;
        int i10;
        float f41;
        float f42;
        float f43;
        float f44;
        double d;
        double d10;
        double d11;
        float f45;
        if (this.f42350o0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d12 = this.m0.d(f10, false);
        if (this.f42350o0) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d13 = this.f42349n0.d(f11, false);
        float f46 = this.f42346k0;
        if (f46 < 0.0f) {
            if (this.f42347l0) {
                f45 = 1.0f;
            } else {
                f45 = 0.0f;
            }
            f46 = this.f42345j0.d(f45, false);
        }
        float max = Math.max(d12, f46);
        if (this.f42357t0) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float d14 = this.f42365y0.d(f12, false);
        rc rcVar2 = this.G;
        if (Math.abs(this.f42359v0 - this.f42341f0) < AndroidUtilities.dp(64.0f) && (this.f42350o0 || rcVar2.h)) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float d15 = this.f42366z0.d(f13, false) * d14;
        if (Math.abs(this.f42359v0 - this.f42341f0) < AndroidUtilities.dp(64.0f)) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        float d16 = this.A0.d(f14, false) * d14;
        float clamp = Utilities.clamp((this.f42359v0 - this.f42341f0) / AndroidUtilities.dp(16.0f), 1.0f, -1.0f);
        float clamp2 = Utilities.clamp((this.f42359v0 - this.f42341f0) / AndroidUtilities.dp(64.0f), 1.0f, -1.0f);
        if (Math.min(Math.abs(this.f42359v0 - this.f42344i0), Math.abs(this.f42359v0 - this.f42343h0)) < AndroidUtilities.dp(16.0f)) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        float d17 = this.C0.d(f15, false) * d14;
        if (this.E0 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f47 = 1.0f - d12;
        float e = this.F0.e(z4) * f47;
        float d18 = this.G0.d(this.E0, false);
        float e6 = this.H0.e(b());
        if (this.f42361w0) {
            f16 = d12 * max * d14;
        } else {
            f16 = 0.0f;
        }
        if (f16 > 0.0f) {
            f22 = 1.0f;
            float dp = this.f42341f0 - AndroidUtilities.dp(50.0f);
            f23 = 0.0f;
            float dp2 = this.f42341f0 + AndroidUtilities.dp(50.0f);
            Paint paint2 = this.B;
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Paint paint3 = this.C;
            paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f19 = e;
            float f48 = f16;
            f21 = d13;
            f18 = d17;
            f17 = d16;
            c3 = 1;
            f20 = e6;
            canvas.drawLine(dp2, this.f42342g0, AndroidUtilities.lerp(dp2, this.f42344i0 - AndroidUtilities.dp(30.0f), f16), this.f42342g0, paint3);
            canvas.drawLine(dp2, this.f42342g0, AndroidUtilities.lerp(dp2, this.f42344i0 - AndroidUtilities.dp(30.0f), f48), this.f42342g0, paint2);
            canvas.drawLine(dp, this.f42342g0, AndroidUtilities.lerp(dp, this.f42343h0 + AndroidUtilities.dp(30.0f), f48), this.f42342g0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(dp, this.f42342g0, AndroidUtilities.lerp(dp, this.f42343h0 + AndroidUtilities.dp(30.0f), f48), this.f42342g0, paint2);
        } else {
            f17 = d16;
            f18 = d17;
            f19 = e;
            f20 = e6;
            f21 = d13;
            c3 = 1;
            f22 = 1.0f;
            f23 = 0.0f;
            canvas2 = canvas;
        }
        float f49 = this.f42341f0;
        float lerp = AndroidUtilities.lerp(f49, this.B0.d((AndroidUtilities.dp(4.0f) * clamp) + f49, false), d15);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(12.0f), d12), AndroidUtilities.dp(32.0f) - (Math.abs(clamp2) * AndroidUtilities.dp(4.0f)), d15);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), d12), AndroidUtilities.dp(32.0f), d15);
        if (this.f42347l0) {
            f24 = 0.0f;
        } else {
            f24 = 0.2f;
        }
        float lerp4 = AndroidUtilities.lerp(rcVar2.a(f24), (this.f42339e0.d(this.f42338d0, false) * 0.2f) + f22, d12);
        RectF rectF4 = AndroidUtilities.rectTmp;
        float f50 = lerp - lerp2;
        float f51 = this.f42342g0;
        float f52 = lerp + lerp2;
        rectF4.set(f50, f51 - lerp2, f52, f51 + lerp2);
        float f53 = f22 - f20;
        int d19 = i0.a.d(max * f53, -1, -577231);
        Paint paint4 = this.f42353r;
        paint4.setColor(d19);
        int i11 = (f20 > f23 ? 1 : (f20 == f23 ? 0 : -1));
        if (i11 > 0) {
            canvas2.save();
            canvas2.scale(lerp4, lerp4, this.f42341f0, this.f42342g0);
            paint4.setAlpha((int) (f53 * 255.0f));
            canvas2.drawRoundRect(rectF4, lerp3, lerp3, paint4);
            canvas2.restore();
            f26 = f52;
            f27 = d12;
            f29 = f50;
            f25 = f53;
            f30 = lerp4;
            rectF = rectF4;
            f31 = max;
            f28 = d14;
            paint = paint4;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            f25 = f53;
            f26 = f52;
            f27 = d12;
            f28 = d14;
            f29 = f50;
            f30 = lerp4;
            rectF = rectF4;
            paint = paint4;
            f31 = max;
            canvas2.save();
        }
        canvas2.scale(f30, f30, this.f42341f0, this.f42342g0);
        paint.setAlpha(255);
        canvas2.drawRoundRect(rectF, lerp3, lerp3, paint);
        if (i11 > 0) {
            Paint paint5 = this.D;
            paint5.setStrokeWidth(AndroidUtilities.dp(4.0f));
            Path path = this.P;
            path.rewind();
            PointF pointF = this.Q;
            f33 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f54 = pointF.x;
            PointF pointF2 = this.R;
            float f55 = f20 / 0.3f;
            rectF2 = rectF;
            f32 = lerp3;
            path.lineTo(AndroidUtilities.lerp(f54, pointF2.x, Utilities.clamp(f55, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF.y, pointF2.y, Utilities.clamp(f55, 1.0f, 0.0f)));
            if (f20 > 0.3f) {
                float f56 = pointF2.x;
                PointF pointF3 = this.S;
                float f57 = (f20 - 0.3f) / 0.7f;
                path.lineTo(AndroidUtilities.lerp(f56, pointF3.x, Utilities.clamp(f57, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF2.y, pointF3.y, Utilities.clamp(f57, 1.0f, 0.0f)));
            }
            canvas2.translate(this.f42341f0, this.f42342g0);
            canvas2.drawPath(path, paint5);
        } else {
            rectF2 = rectF;
            f32 = lerp3;
            f33 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f30, 1.0f);
        canvas2.scale(max2, max2, this.f42341f0, this.f42342g0);
        float max3 = Math.max(AndroidUtilities.dpf2(33.5f), ((1.0f - d15) * AndroidUtilities.dp(5.0f) * f19) + AndroidUtilities.lerp(AndroidUtilities.dpf2(4.5f), AndroidUtilities.dp(9.0f), d15) + lerp2);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), f19);
        float lerp6 = AndroidUtilities.lerp(max3, (lerp2 - lerp5) - AndroidUtilities.dp(4.0f), f20);
        float f58 = this.f42341f0;
        float f59 = this.f42342g0;
        RectF rectF5 = rectF2;
        rectF5.set(f58 - lerp6, f59 - lerp6, f58 + lerp6, f59 + lerp6);
        Paint paint6 = this.f42355s;
        paint6.setStrokeWidth(lerp5);
        paint6.setAlpha((int) (AndroidUtilities.lerp(1.0f, 0.3f, f19) * 255.0f * f25));
        canvas2.drawCircle(this.f42341f0, this.f42342g0, lerp6, paint6);
        if (f19 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (d18 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 & z10) {
            paint6.setAlpha(255);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, d18 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.N;
        if (this.f42350o0) {
            f34 = 0.0f;
        } else {
            f34 = 1.0f - f21;
        }
        if (this.f42332a != null) {
            j10 = 177000;
        } else {
            j10 = 60000;
        }
        long j11 = j10;
        float min = Math.min((((float) currentTimeMillis) / ((float) 60000)) * 360.0f, 360.0f);
        float e10 = this.f42352q0.e(this.f42354r0);
        Paint paint7 = this.v;
        paint7.setStrokeWidth(lerp5);
        paint7.setAlpha((int) (Math.max(e10 * f33, 1.0f - f34) * 255.0f));
        if (e10 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            rp.a(this.f42351p0, (float) ((SystemClock.elapsedRealtime() - this.f42356s0) % 5400));
            invalidate();
            float[] fArr = this.f42351p0;
            float f60 = fArr[0];
            float f61 = fArr[c3];
            float f62 = (f60 + f61) / 2.0f;
            float abs = Math.abs(f61 - f60) / 2.0f;
            if (this.f42354r0) {
                float f63 = min / 2.0f;
                f62 = AndroidUtilities.lerp((-90.0f) + f63, f62, e10);
                abs = AndroidUtilities.lerp(f63, abs, e10);
            }
            float f64 = f62 - abs;
            float f65 = abs * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f64, f65, false, paint7);
        }
        if (this.f42350o0) {
            invalidate();
            long j12 = currentTimeMillis / 1000;
            if (j12 != this.O / 1000) {
                ((a9) this.f42332a).f41281a.G0.a(j12, true);
            }
            if (j11 > 0 && currentTimeMillis >= j11) {
                post(new q5(this, 0));
            }
            this.O = currentTimeMillis;
        }
        canvas3.restore();
        boolean z12 = this.f42363x0;
        rc rcVar3 = this.I;
        if (z12) {
            float a2 = rcVar3.a(0.2f) * f27;
            if (a2 > 0.0f) {
                canvas3.save();
                canvas3.scale(a2, a2, this.f42343h0, this.f42342g0);
                canvas3.drawCircle(this.f42343h0, this.f42342g0, AndroidUtilities.dp(22.0f), this.f42360w);
                canvas3.rotate(-getRotation(), this.f42343h0, this.f42342g0);
                this.f42340f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a10 = rcVar3.a(0.2f) * f47 * f25;
        if (a10 > 0.0f) {
            canvas3.save();
            canvas3.scale(a10, a10, this.f42343h0, this.f42342g0);
            canvas3.rotate(-getRotation(), this.f42343h0, this.f42342g0);
            this.f42334b.draw(canvas3);
            canvas3.restore();
        }
        if (this.L) {
            f35 = 1.0f;
        } else {
            f35 = 0.0f;
        }
        float d20 = this.M.d(f35, false);
        Paint paint8 = this.f42362x;
        org.telegram.ui.Components.z5 z5Var2 = this.K;
        rc rcVar4 = this.H;
        if (d20 > 0.0f) {
            canvas3.save();
            float a11 = rcVar4.a(0.2f) * d20 * f25;
            canvas3.scale(a11, a11, this.f42344i0, this.f42342g0);
            canvas3.rotate(z5Var2.d(this.J, false) - getRotation(), this.f42344i0, this.f42342g0);
            canvas3.drawCircle(this.f42344i0, this.f42342g0, AndroidUtilities.dp(22.0f), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
        }
        if (d20 < 1.0f) {
            canvas3.save();
            f36 = f25;
            float y10 = org.telegram.messenger.y3.y(1.0f, d20, rcVar4.a(0.2f), f36);
            canvas3.scale(y10, y10, this.f42344i0, this.f42342g0);
            canvas3.rotate(z5Var2.d(this.J, false) - getRotation(), this.f42344i0, this.f42342g0);
            canvas3.drawCircle(this.f42344i0, this.f42342g0, AndroidUtilities.dp(22.0f), this.f42360w);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f36 = f25;
        }
        if (this.f42361w0 && !b()) {
            float f66 = f18;
            f37 = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.lerp((Math.abs(clamp2) * AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(22.0f), f66), Math.max(f66, d15)) * f28 * f31 * f27;
        } else {
            f37 = 0.0f;
        }
        if (!this.f42361w0 && this.f42350o0) {
            f38 = 1.0f;
        } else {
            f38 = 0.0f;
        }
        float d21 = this.D0.d(f38, false);
        int i12 = (f37 > 0.0f ? 1 : (f37 == 0.0f ? 0 : -1));
        if (i12 > 0) {
            Paint paint9 = this.f42364y;
            paint9.setAlpha(255);
            canvas3.drawCircle(this.f42359v0, this.f42342g0, f37, paint9);
            float f67 = this.f42359v0;
            f42 = 22.0f;
            float clamp3 = Utilities.clamp(1.0f - ((Math.abs(clamp2) * f28) / 1.3f), 1.0f, 0.0f);
            float abs2 = Math.abs(lerp - f67);
            if (abs2 < lerp2 + (f37 * 2.0f) && clamp3 < 0.6f) {
                float f68 = lerp2 + f37;
                if (abs2 < f68) {
                    float f69 = lerp2 * lerp2;
                    float f70 = abs2 * abs2;
                    float f71 = f37 * f37;
                    f44 = f37;
                    f40 = d21;
                    i10 = i12;
                    double acos = Math.acos(((f69 + f70) - f71) / ((lerp2 * 2.0f) * abs2));
                    d10 = Math.acos(((f71 + f70) - f69) / (f43 * abs2));
                    d = acos;
                } else {
                    f44 = f37;
                    f40 = d21;
                    i10 = i12;
                    d = 0.0d;
                    d10 = 0.0d;
                }
                if (f67 > lerp) {
                    d11 = 0.0d;
                } else {
                    d11 = 3.141592653589793d;
                }
                double d22 = d;
                double acos2 = (float) Math.acos((lerp2 - f44) / abs2);
                double d23 = acos2 - d22;
                double d24 = clamp3;
                double d25 = d23 * d24;
                double d26 = d11 + d22 + d25;
                double d27 = (d11 - d22) - d25;
                double d28 = ((3.141592653589793d - d10) - acos2) * d24;
                double d29 = ((d11 + 3.141592653589793d) - d10) - d28;
                double d30 = (d11 - 3.141592653589793d) + d10 + d28;
                float f72 = this.f42342g0;
                PointF pointF4 = this.M0;
                a(lerp, f72, d26, lerp2, pointF4);
                float f73 = this.f42342g0;
                PointF pointF5 = this.N0;
                a(lerp, f73, d27, lerp2, pointF5);
                float f74 = this.f42342g0;
                PointF pointF6 = this.O0;
                float f75 = f44;
                a(f67, f74, d29, f75, pointF6);
                float f76 = this.f42342g0;
                PointF pointF7 = this.P0;
                a(f67, f76, d30, f75, pointF7);
                f39 = f75;
                f41 = f36;
                z5Var = z5Var2;
                rcVar = rcVar4;
                float min2 = Math.min(1.0f, (abs2 * 2.0f) / f68) * Math.min(clamp3 * 2.4f, k7.n6.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f68);
                float f77 = lerp2 * min2;
                float f78 = f39 * min2;
                a(pointF4.x, pointF4.y, d26 - 1.5707963705062866d, f77, this.Q0);
                a(pointF5.x, pointF5.y, d27 + 1.5707963705062866d, f77, this.R0);
                a(pointF6.x, pointF6.y, d29 + 1.5707963705062866d, f78, this.S0);
                a(pointF7.x, pointF7.y, d30 - 1.5707963705062866d, f78, this.T0);
                float f79 = f27;
                float z13 = e2.c.z(f28, f31, f79, f17);
                if (z13 > 0.0f) {
                    Path path2 = this.K0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.Q0;
                    float f80 = pointF8.x;
                    float f81 = pointF8.y;
                    f27 = f79;
                    PointF pointF9 = this.S0;
                    path2.cubicTo(f80, f81, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.T0;
                    float f82 = pointF10.x;
                    float f83 = pointF10.y;
                    PointF pointF11 = this.R0;
                    path2.cubicTo(f82, f83, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (z13 * 255.0f));
                    canvas3.drawPath(path2, paint9);
                    float f84 = this.f42342g0;
                    rectF3.set(f29, f84 - lerp2, f26, f84 + lerp2);
                    float f85 = f32;
                    canvas3.drawRoundRect(rectF3, f85, f85, paint9);
                } else {
                    f27 = f79;
                }
            } else {
                f39 = f37;
                z5Var = z5Var2;
                rcVar = rcVar4;
                f40 = d21;
                i10 = i12;
                f41 = f36;
            }
        } else {
            f39 = f37;
            z5Var = z5Var2;
            rcVar = rcVar4;
            f40 = d21;
            i10 = i12;
            f41 = f36;
            f42 = 22.0f;
        }
        if (i10 > 0 || f40 > 0.0f) {
            float a12 = rcVar3.a(0.2f) * f27 * f41;
            canvas3.save();
            Path path3 = this.L0;
            path3.rewind();
            if (i10 > 0) {
                path3.addCircle(this.f42359v0, this.f42342g0, f39, Path.Direction.CW);
            }
            if (f40 > 0.0f && this.f42363x0) {
                path3.addCircle(this.f42343h0, this.f42342g0, f40 * AndroidUtilities.dp(f42) * a12, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.f42363x0) {
                canvas3.save();
                canvas3.scale(a12, a12, this.f42343h0, this.f42342g0);
                canvas3.drawCircle(this.f42343h0, this.f42342g0, AndroidUtilities.dp(f42), paint8);
                canvas3.rotate(-getRotation(), this.f42343h0, this.f42342g0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float a13 = rcVar.a(0.2f) * f41;
            canvas3.save();
            canvas3.scale(a13, a13, this.f42344i0, this.f42342g0);
            canvas3.rotate(z5Var.d(this.J, false) - getRotation(), this.f42344i0, this.f42342g0);
            canvas3.drawCircle(this.f42344i0, this.f42342g0, AndroidUtilities.dp(f42), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        s5 s5Var = this.T;
        if (s5Var != null) {
            boolean b10 = b();
            boolean z14 = this.U;
            boolean z15 = this.f42350o0;
            if (z14 == z15 && this.V == b10 && this.W == this.L && this.f42333a0 == this.f42347l0 && this.f42335b0 == this.f42354r0 && this.f42337c0 == this.f42363x0) {
                return;
            }
            this.U = z15;
            this.V = b10;
            this.W = this.L;
            this.f42333a0 = this.f42347l0;
            this.f42335b0 = this.f42354r0;
            this.f42337c0 = this.f42363x0;
            s5Var.i();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(100.0f);
        float f10 = size;
        this.f42341f0 = f10 / 2.0f;
        this.f42342g0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f10 * 0.35f);
        float f11 = this.f42341f0;
        this.f42343h0 = f11 - min;
        float f12 = f11 + min;
        this.f42344i0 = f12;
        float f13 = this.f42342g0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f12 - dp2), (int) (f13 - dp2), (int) (f12 + dp2), (int) (f13 + dp2));
        float f14 = this.f42344i0;
        float f15 = this.f42342g0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.e.setBounds((int) (f14 - dp3), (int) (f15 - dp3), (int) (f14 + dp3), (int) (f15 + dp3));
        f(this.f42340f, this.f42343h0, this.f42342g0);
        f(this.h, this.f42343h0, this.f42342g0);
        f(this.f42348n, this.f42343h0, this.f42342g0);
        this.f42334b.setImageCoords(this.f42343h0 - AndroidUtilities.dp(20.0f), this.f42342g0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.E;
        matrix.reset();
        matrix.postTranslate(this.f42341f0, this.f42342g0);
        this.F.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        s5 s5Var = this.T;
        if (s5Var != null) {
            s5Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.f42344i0, this.f42343h0);
        float y10 = motionEvent.getY() + 0.0f;
        boolean c3 = c(clamp, y10, this.f42344i0, this.f42342g0, AndroidUtilities.dp(7.0f), true);
        boolean z11 = this.f42354r0;
        rc rcVar = this.I;
        rc rcVar2 = this.G;
        rc rcVar3 = this.H;
        boolean z12 = true;
        boolean z13 = false;
        if (z11) {
            rcVar2.c(false);
            rcVar3.c(false);
            rcVar.c(false);
        } else if (action == 0 || this.f42357t0) {
            rcVar2.c(c(clamp, y10, this.f42341f0, this.f42342g0, AndroidUtilities.dp(60.0f), false));
            if (c(clamp, y10, this.f42344i0, this.f42342g0, AndroidUtilities.dp(30.0f), true) && !b()) {
                z4 = true;
            } else {
                z4 = false;
            }
            rcVar3.c(z4);
            if (c(clamp, y10, this.f42343h0, this.f42342g0, AndroidUtilities.dp(30.0f), false) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            rcVar.c(z10);
        }
        q5 q5Var = this.J0;
        q5 q5Var2 = this.I0;
        if (action == 0) {
            this.f42357t0 = true;
            this.f42358u0 = (rcVar2.h || rcVar3.h) ? true : true;
            System.currentTimeMillis();
            this.f42359v0 = clamp;
            if (Math.abs(clamp - this.f42341f0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(q5Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (rcVar3.h) {
                AndroidUtilities.runOnUIThread(q5Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f42357t0) {
                this.f42359v0 = Utilities.clamp(clamp, this.f42344i0, this.f42343h0);
                invalidate();
                if (this.f42350o0 && !this.U0 && c3) {
                    d(180.0f);
                    ((a9) this.f42332a).b();
                }
                if (this.f42350o0 && this.f42361w0) {
                    float clamp2 = Utilities.clamp(((this.f42342g0 - AndroidUtilities.dp(48.0f)) - y10) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                    da daVar = ((a9) this.f42332a).f41281a;
                    daVar.S0.b(clamp2, true);
                    daVar.j0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z12 = false;
        } else {
            if (this.f42357t0) {
                this.f42357t0 = false;
                this.f42358u0 = false;
                AndroidUtilities.cancelRunOnUIThread(q5Var2);
                AndroidUtilities.cancelRunOnUIThread(q5Var);
                boolean z14 = this.f42350o0;
                if (!z14 && rcVar.h) {
                    da daVar2 = ((a9) this.f42332a).f41281a;
                    if (daVar2.f41480c0 == 0 && !daVar2.M1 && !daVar2.N1 && da.b(daVar2)) {
                        daVar2.f(true);
                    }
                } else if (z14 && this.f42361w0) {
                    if (rcVar.h) {
                        this.f42361w0 = false;
                        this.D0.d(1.0f, true);
                        e3 e3Var = ((a9) this.f42332a).f41281a.Q0;
                        e3Var.f41564a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                        e3Var.invalidate();
                    } else {
                        this.f42350o0 = false;
                        this.f42356s0 = SystemClock.elapsedRealtime();
                        this.f42354r0 = true;
                        ((a9) this.f42332a).d(false);
                    }
                } else if (rcVar2.h) {
                    if (b()) {
                        ((a9) this.f42332a).a();
                    } else if (!this.f42347l0 && !this.f42350o0 && !this.f42361w0) {
                        ((a9) this.f42332a).c();
                    } else if (!this.f42350o0) {
                        if (da.d(((a9) this.f42332a).f41281a)) {
                            this.O = 0L;
                            this.N = System.currentTimeMillis();
                            this.f42363x0 = false;
                            ((a9) this.f42332a).e(new q5(this, 1), false);
                        }
                    } else {
                        this.f42350o0 = false;
                        this.f42356s0 = SystemClock.elapsedRealtime();
                        this.f42354r0 = true;
                        ((a9) this.f42332a).d(false);
                    }
                }
                this.f42361w0 = false;
                if (rcVar3.h) {
                    d(180.0f);
                    ((a9) this.f42332a).b();
                }
                rcVar2.c(false);
                rcVar3.c(false);
                rcVar.c(false);
                invalidate();
            }
            return false;
        }
        this.U0 = c3;
        return z12;
    }

    public void setDelegate(r5 r5Var) {
        this.f42332a = r5Var;
    }

    public void setDual(boolean z4) {
        if (z4 != this.L) {
            this.L = z4;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f10) {
        this.f42355s.setColor(i0.a.d(f10, -1, -16777216));
        this.f42360w.setColor(i0.a.d(f10, 1677721600, 369098752));
        this.B.setColor(i0.a.d(f10, 1493172223, 285212671));
        this.C.setColor(i0.a.d(f10, 402653184, 805306368));
        int d = i0.a.d(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.f42340f.setColorFilter(new PorterDuffColorFilter(i0.a.d(f10, -1, -16777216), mode));
    }
}

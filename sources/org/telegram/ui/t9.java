package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.ActionBar.ActionBarLayout;

public class t9 extends org.telegram.ui.ActionBar.n2 {
    public final PointF[] A;
    public final PointF[] B;
    public final PointF[] C;
    public final PointF[] D;
    public final RectF E;
    public final RectF F;
    public long G;
    public s9 H;
    public boolean I;
    public long J;
    public int K;
    public int L;
    public String M;
    public final int N;
    public boolean O;
    public n2.b0 P;
    public c8.n Q;
    public final int R;
    public ValueAnimator S;
    public float T;
    public float U;
    public o1.j V;
    public float W;
    public RectF X;
    public final w5 Y;
    public float Z;

    public r9 f42818a;

    public long f42819a0;

    public TextView f42820b;

    public CameraView f42821c;
    public final HandlerThread d;

    public Handler f42822e;

    public TextView f42823f;
    public final Paint h;

    public final Paint f42824n;

    public ImageView f42825r;

    public AnimatorSet f42826s;
    public float v;

    public boolean f42827w;

    public o1.j f42828x;

    public float f42829y;

    public t9(int i10) {
        super(null);
        this.d = new HandlerThread("ScanCamera");
        this.h = new Paint();
        this.f42824n = new Paint(1);
        new Path();
        this.v = 0.5f;
        this.f42827w = false;
        this.f42828x = null;
        this.f42829y = 0.0f;
        this.A = new PointF[4];
        this.B = new PointF[4];
        this.C = new PointF[4];
        this.D = new PointF[4];
        for (int i11 = 0; i11 < 4; i11++) {
            this.A[i11] = new PointF(-1.0f, -1.0f);
            this.B[i11] = new PointF(-1.0f, -1.0f);
            this.C[i11] = new PointF(-1.0f, -1.0f);
            this.D[i11] = new PointF(-1.0f, -1.0f);
        }
        this.E = new RectF();
        this.F = new RectF();
        this.G = 0L;
        this.K = 0;
        this.L = 0;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.T = 0.0f;
        this.U = 0.0f;
        this.W = 0.0f;
        this.Y = new w5(this, 1);
        this.Z = 0.0f;
        this.f42819a0 = 0L;
        this.R = i10;
        if (a0()) {
            Utilities.globalQueue.postRunnable(new k9(this, 5));
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.N = 8;
        } else if (devicePerformanceClass != 1) {
            this.N = 40;
        } else {
            this.N = 24;
        }
    }

    public static Bitmap Z(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.set(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        colorMatrix2.preConcat(colorMatrix);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap b0(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        float f10 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static void d0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static p9 e0(Activity activity, int i10, s9 s9Var) {
        if (activity == null) {
            return null;
        }
        p9 p9Var = new p9(activity, new org.telegram.ui.ActionBar.b5[]{new ActionBarLayout(activity, false)}, i10, s9Var);
        p9Var.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) p9Var, false);
        AndroidUtilities.setNavigationBarColor((Dialog) p9Var, -16777216, false);
        p9Var.setUseLightStatusBar(false);
        p9Var.getWindow().addFlags(512);
        p9Var.show();
        return p9Var;
    }

    public static PointF[] f0(Point[] pointArr, int i10, int i11) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i12 = 0; i12 < pointArr.length; i12++) {
            Point point = pointArr[i12];
            pointFArr[i12] = new PointF(point.x / i10, point.y / i11);
        }
        return pointFArr;
    }

    public final void Y() {
        TextView textView;
        if (this.fragmentView == null || !CameraView.isCameraAllowed()) {
            return;
        }
        CameraController.getInstance().initCamera(null);
        CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
        this.f42821c = cameraView;
        cameraView.setUseMaxPreview(true);
        this.f42821c.setOptimizeForBarcode(true);
        this.f42821c.setDelegate(new c1(this, 11));
        ((ViewGroup) this.fragmentView).addView(this.f42821c, 0, h7.z5.c(-1.0f, -1));
        if (this.R != 0 || (textView = this.f42823f) == null) {
            return;
        }
        this.f42821c.addView(textView);
    }

    public final boolean a0() {
        int i10 = this.R;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    public final void c0(Bitmap bitmap) {
        t9 t9Var;
        w5 w5Var = this.Y;
        if (this.f42821c == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Size previewSize = this.f42821c.getPreviewSize();
            int i10 = this.R;
            if (i10 == 0) {
                MrzRecognizer.Result resultRecognize = MrzRecognizer.recognize(bitmap, false);
                if (resultRecognize != null && !TextUtils.isEmpty(resultRecognize.firstName) && !TextUtils.isEmpty(resultRecognize.lastName) && !TextUtils.isEmpty(resultRecognize.number) && resultRecognize.birthDay != 0 && (resultRecognize.expiryDay != 0 || resultRecognize.doesNotExpire)) {
                    if (resultRecognize.gender != 0) {
                        this.I = true;
                        CameraController.getInstance().stopPreview(this.f42821c.getCameraSession());
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(19, this, resultRecognize));
                        return;
                    }
                }
                t9Var = this;
            } else {
                int iMin = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                t9Var = this;
                try {
                    j9.a aVarG0 = t9Var.g0(previewSize, (previewSize.getWidth() - iMin) / 2, (previewSize.getHeight() - iMin) / 2, iMin, bitmap);
                    boolean z10 = t9Var.I;
                    if (z10) {
                        t9Var.L++;
                    }
                    if (aVarG0 != null) {
                        t9Var.K = 0;
                        String str = (String) aVarG0.f12863b;
                        t9Var.M = str;
                        if (!z10) {
                            t9Var.I = true;
                            t9Var.O = t9Var.H.i1(str, new k9(this, 7));
                            t9Var.J = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new k9(this, 8));
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(20, this, aVarG0));
                    } else if (z10) {
                        int i11 = t9Var.K + 1;
                        t9Var.K = i11;
                        if (i11 > 4 && !t9Var.O) {
                            t9Var.I = false;
                            t9Var.L = 0;
                            t9Var.M = null;
                            AndroidUtilities.runOnUIThread(new k9(this, 8));
                            AndroidUtilities.runOnUIThread(w5Var, 500L);
                            return;
                        }
                    }
                    if (((t9Var.L == 0 && aVarG0 != null && ((RectF) aVarG0.f12864c) == null && !t9Var.O) || (SystemClock.elapsedRealtime() - t9Var.J > 1000 && !t9Var.O)) && t9Var.M != null) {
                        CameraView cameraView = t9Var.f42821c;
                        if (cameraView != null && cameraView.getCameraSession() != null && i10 != 3) {
                            CameraController.getInstance().stopPreview(t9Var.f42821c.getCameraSession());
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(18, this, t9Var.M));
                        if (i10 == 3) {
                            AndroidUtilities.runOnUIThread(new k9(this, 1));
                        }
                    } else if (t9Var.I) {
                        t9Var.f42822e.postDelayed(new k9(this, 2), Math.max(16L, ((long) (1000 / t9Var.N)) - ((long) t9Var.Z)));
                    }
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new k9(this, 6));
                }
            }
        } catch (Throwable unused2) {
            t9Var = this;
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        float f10 = t9Var.Z;
        long j10 = t9Var.f42819a0;
        float f11 = (f10 * j10) + jElapsedRealtime2;
        long j11 = j10 + 1;
        t9Var.f42819a0 = j11;
        t9Var.Z = f11 / j11;
        t9Var.f42819a0 = Math.max(j11, 30L);
        if (t9Var.I) {
            return;
        }
        AndroidUtilities.runOnUIThread(w5Var, 500L);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.f42827w) {
            this.actionBar.D(-1, false);
            this.actionBar.C(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false), false);
            this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23359u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !a0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.E && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.x8, kVar.E0));
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 21));
        this.h.setColor(2130706432);
        Paint paint = this.f42824n;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        q9 q9Var = new q9(this, context);
        q9Var.setOnTouchListener(new kh.e(2));
        this.fragmentView = q9Var;
        if (a0()) {
            this.fragmentView.postDelayed(new k9(this, 0), 450L);
        } else {
            Y();
        }
        int i10 = this.R;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
            kVar2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.D(-1, false);
            this.actionBar.C(587202559, false);
            q9Var.setBackgroundColor(-16777216);
            q9Var.addView(this.actionBar);
        }
        if (i10 == 2 || i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.j80.c());
        paint2.setColor(i0.b.k(-1, 40));
        r9 r9Var = new r9(context, paint2);
        this.f42818a = r9Var;
        r9Var.setGravity(1);
        this.f42818a.setTextSize(1, 24.0f);
        q9Var.addView(this.f42818a);
        TextView textView = new TextView(context);
        this.f42820b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.f42820b.setGravity(1);
        this.f42820b.setTextSize(1, 16.0f);
        q9Var.addView(this.f42820b);
        TextView textView2 = new TextView(context);
        this.f42823f = textView2;
        textView2.setTextColor(-1);
        this.f42823f.setGravity(81);
        this.f42823f.setAlpha(0.0f);
        if (i10 == 0) {
            this.f42818a.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.f42820b.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.f42818a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            this.f42823f.setTypeface(Typeface.MONOSPACE);
        } else {
            if (i10 == 1 || i10 == 3) {
                this.f42818a.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AuthAnotherClientInfo5));
                String[] strArr = {LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), LocaleController.getString(R.string.AuthAnotherWebClientUrl)};
                int i12 = 0;
                for (int i13 = 2; i12 < i13; i13 = 2) {
                    String string = spannableStringBuilder.toString();
                    int iIndexOf = string.indexOf(42);
                    int i14 = iIndexOf + 1;
                    int iIndexOf2 = string.indexOf(42, i14);
                    if (iIndexOf == -1 || iIndexOf2 == -1 || iIndexOf == iIndexOf2) {
                        break;
                    }
                    this.f42818a.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(iIndexOf2, iIndexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(iIndexOf, i14, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.r41(strArr[i12], 0), i14, iIndexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.k41(AndroidUtilities.bold()), i14, iIndexOf2, 33);
                    i12++;
                }
                this.f42818a.setLinkTextColor(-1);
                this.f42818a.setTextSize(1, 16.0f);
                this.f42818a.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.f42818a.setPadding(0, 0, 0, 0);
                this.f42818a.setText(spannableStringBuilder);
            }
            this.f42818a.setTextColor(-1);
            if (i10 == 3) {
                this.f42820b.setTextColor(-1711276033);
            }
            this.f42823f.setTextSize(1, 16.0f);
            this.f42823f.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            this.f42823f.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            q9Var.addView(this.f42823f);
            ImageView imageView = new ImageView(context);
            this.f42825r = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f42825r.setImageResource(R.drawable.qr_flashlight);
            this.f42825r.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(60.0f), 587202559));
            q9Var.addView(this.f42825r);
            this.f42825r.setOnClickListener(new a(this, 11));
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final j9.a g0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        j9.a aVar;
        j9.a aVar2;
        int width;
        String str;
        ?? r10;
        int height;
        lb.d gVar;
        ?? r11;
        a5.n nVar;
        PointF[] pointFArr;
        PointF[] pointFArr2;
        PointF[] pointFArrF0;
        j9.a aVar3 = null;
        try {
            RectF rectF = new RectF();
            c8.n nVar2 = this.Q;
            float fMax = Float.MIN_VALUE;
            float fMin = Float.MAX_VALUE;
            int i13 = 0;
            if (nVar2 != null && nVar2.f2560b.k()) {
                if (bitmap != null) {
                    nVar = new a5.n(5);
                    int width2 = bitmap.getWidth();
                    int height2 = bitmap.getHeight();
                    nVar.d = bitmap;
                    b8.b bVar = (b8.b) nVar.f100b;
                    bVar.f2041a = width2;
                    bVar.f2042b = height2;
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                } else {
                    nVar = new a5.n(5);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(null);
                    int width3 = size.getWidth();
                    int height3 = size.getHeight();
                    if (byteBufferWrap == null) {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                    if (byteBufferWrap.capacity() < width3 * height3) {
                        throw new IllegalArgumentException("Invalid image data size.");
                    }
                    nVar.f101c = byteBufferWrap;
                    b8.b bVar2 = (b8.b) nVar.f100b;
                    bVar2.f2041a = width3;
                    bVar2.f2042b = height3;
                    width = size.getWidth();
                    height = size.getWidth();
                }
                SparseArray sparseArrayQ = this.Q.Q(nVar);
                if (sparseArrayQ.size() > 0) {
                    c8.m mVar = (c8.m) sparseArrayQ.valueAt(0);
                    str = mVar.f2550b;
                    Point[] pointArr = mVar.f2552e;
                    pointFArrF0 = f0(pointArr, width, height);
                    if (pointArr.length == 0) {
                        pointFArr2 = pointFArrF0;
                        rectF = null;
                        pointFArr = pointFArr2;
                    } else {
                        int length = pointArr.length;
                        float fMax2 = Float.MIN_VALUE;
                        float fMin2 = Float.MAX_VALUE;
                        while (i13 < length) {
                            pointFArr2 = pointFArrF0;
                            Point point = pointArr[i13];
                            fMin = Math.min(fMin, point.x);
                            fMax = Math.max(fMax, point.x);
                            fMin2 = Math.min(fMin2, point.y);
                            fMax2 = Math.max(fMax2, point.y);
                            i13++;
                        }
                        pointFArr2 = pointFArrF0;
                        rectF.set(fMin, fMin2, fMax, fMax2);
                        pointFArr = pointFArrF0;
                    }
                } else if (bitmap != null) {
                    Bitmap bitmapZ = Z(bitmap);
                    bitmap.recycle();
                    a5.n nVar3 = new a5.n(5);
                    int width4 = bitmapZ.getWidth();
                    int height4 = bitmapZ.getHeight();
                    nVar3.d = bitmapZ;
                    b8.b bVar3 = (b8.b) nVar3.f100b;
                    bVar3.f2041a = width4;
                    bVar3.f2042b = height4;
                    width = bitmapZ.getWidth();
                    height = bitmapZ.getHeight();
                    SparseArray sparseArrayQ2 = this.Q.Q(nVar3);
                    if (sparseArrayQ2.size() > 0) {
                        c8.m mVar2 = (c8.m) sparseArrayQ2.valueAt(0);
                        str = mVar2.f2550b;
                        Point[] pointArr2 = mVar2.f2552e;
                        PointF[] pointFArrF1 = f0(pointArr2, width, height);
                        if (pointArr2.length == 0) {
                            pointFArr2 = pointFArrF1;
                            pointFArr2 = pointFArrF0;
                            rectF = null;
                            pointFArr = pointFArr2;
                        } else {
                            int length2 = pointArr2.length;
                            float fMax3 = Float.MIN_VALUE;
                            float fMin3 = Float.MAX_VALUE;
                            while (i13 < length2) {
                                Point point2 = pointArr2[i13];
                                fMin = Math.min(fMin, point2.x);
                                fMax = Math.max(fMax, point2.x);
                                fMin3 = Math.min(fMin3, point2.y);
                                fMax3 = Math.max(fMax3, point2.y);
                                i13++;
                            }
                            rectF.set(fMin, fMin3, fMax, fMax3);
                            pointFArr = pointFArrF1;
                        }
                    } else {
                        Bitmap bitmapB0 = b0(bitmapZ);
                        bitmapZ.recycle();
                        a5.n nVar4 = new a5.n(5);
                        int width5 = bitmapB0.getWidth();
                        int height5 = bitmapB0.getHeight();
                        nVar4.d = bitmapB0;
                        b8.b bVar4 = (b8.b) nVar4.f100b;
                        bVar4.f2041a = width5;
                        bVar4.f2042b = height5;
                        int width6 = bitmapZ.getWidth();
                        int height6 = bitmapZ.getHeight();
                        SparseArray sparseArrayQ3 = this.Q.Q(nVar4);
                        if (sparseArrayQ3.size() > 0) {
                            c8.m mVar3 = (c8.m) sparseArrayQ3.valueAt(0);
                            String str2 = mVar3.f2550b;
                            Point[] pointArr3 = mVar3.f2552e;
                            PointF[] pointFArrF2 = f0(pointArr3, width6, height6);
                            if (pointArr3.length == 0) {
                                rectF = null;
                            } else {
                                int length3 = pointArr3.length;
                                float fMax4 = Float.MIN_VALUE;
                                float fMin4 = Float.MAX_VALUE;
                                while (i13 < length3) {
                                    Point point3 = pointArr3[i13];
                                    fMin = Math.min(fMin, point3.x);
                                    fMax = Math.max(fMax, point3.x);
                                    fMin4 = Math.min(fMin4, point3.y);
                                    fMax4 = Math.max(fMax4, point3.y);
                                    i13++;
                                }
                                rectF.set(fMin, fMin4, fMax, fMax4);
                            }
                            height = height6;
                            str = str2;
                            width = width6;
                            pointFArr = pointFArrF2;
                        } else {
                            width = width6;
                            height = height6;
                            str = null;
                            pointFArr = null;
                        }
                    }
                } else {
                    str = null;
                    pointFArr = null;
                }
                aVar2 = null;
                r10 = pointFArr;
            } else if (this.P != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    gVar = new lb.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width7 = bitmap.getWidth();
                    height = bitmap.getHeight();
                    width = width7;
                } else {
                    lb.f fVar = new lb.f(size.getWidth(), size.getHeight(), i10, i11, i12, i12);
                    width = size.getWidth();
                    height = size.getHeight();
                    gVar = fVar;
                }
                j9.a aVarF = this.P.f(new g5.b(new mb.f(gVar)));
                lb.j[] jVarArr = (lb.j[]) aVarF.f12864c;
                String str3 = (String) aVarF.f12863b;
                if (jVarArr == null || jVarArr.length == 0) {
                    aVar2 = null;
                    r11 = 0;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float fMax5 = Float.MIN_VALUE;
                    float fMin5 = Float.MAX_VALUE;
                    int i14 = 0;
                    while (i14 < length4) {
                        lb.j jVar = jVarArr[i14];
                        float f10 = jVar.f15529a;
                        aVar = aVar3;
                        try {
                            float f11 = jVar.f15530b;
                            fMin = Math.min(fMin, f10);
                            fMax = Math.max(fMax, jVar.f15529a);
                            fMin5 = Math.min(fMin5, f11);
                            fMax5 = Math.max(fMax5, f11);
                            i14++;
                            aVar3 = aVar;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new k9(this, 6));
                            return aVar;
                        }
                    }
                    aVar2 = aVar3;
                    rectF.set(fMin, fMin5, fMax, fMax5);
                    if (jVarArr.length == 4) {
                        r11 = new PointF[4];
                        while (i13 < 4) {
                            lb.j jVar2 = jVarArr[i13];
                            r11[i13] = new PointF(jVar2.f15529a / width, jVar2.f15530b / height);
                            i13++;
                        }
                    } else {
                        r11 = aVar2;
                    }
                }
                str = str3;
                r10 = r11;
            } else {
                aVar2 = null;
                width = 1;
                str = null;
                r10 = 0;
                height = 1;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new k9(this, 6));
                return aVar2;
            }
            if (this.R == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new k9(this, 6));
                return aVar2;
            }
            j9.a aVar4 = new j9.a(16, false);
            if (rectF != null) {
                float fDp = AndroidUtilities.dp(25.0f);
                float fDp2 = AndroidUtilities.dp(15.0f);
                rectF.set(rectF.left - fDp, rectF.top - fDp2, rectF.right + fDp, rectF.bottom + fDp2);
                float f12 = width;
                float f13 = height;
                rectF.set(rectF.left / f12, rectF.top / f13, rectF.right / f12, rectF.bottom / f13);
            }
            aVar4.d = r10;
            aVar4.f12864c = rectF;
            aVar4.f12863b = str;
            return aVar4;
        } catch (Throwable unused2) {
            aVar = null;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (a0()) {
            return arrayList;
        }
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23359u8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42818a, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42820b, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        return arrayList;
    }

    public final void h0() {
        if (this.X == null) {
            this.X = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int height = this.fragmentView.getHeight();
        int iMin = (int) (Math.min(width, height) / 1.5f);
        float f10 = width;
        float f11 = height;
        this.X.set(((width - iMin) / 2.0f) / f10, ((height - iMin) / 2.0f) / f11, ((width + iMin) / 2.0f) / f10, ((height + iMin) / 2.0f) / f11);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 != -1 || i10 != 11 || intent == null || intent.getData() == null) {
            return;
        }
        try {
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            try {
                j9.a aVarG0 = g0(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
                if (aVarG0 != null) {
                    s9 s9Var = this.H;
                    if (s9Var != null) {
                        s9Var.C((String) aVarG0.f12863b);
                    }
                    finishFragment();
                }
            } catch (Throwable th) {
                th = th;
                FileLog.e(th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CameraView cameraView = this.f42821c;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.f42821c = null;
        }
        this.d.quitSafely();
        AndroidUtilities.unlockOrientation(getParentActivity());
        c8.n nVar = this.Q;
        if (nVar != null) {
            nVar.N();
        }
    }
}

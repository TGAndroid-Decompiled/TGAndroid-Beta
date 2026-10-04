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
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class w9 extends org.telegram.ui.ActionBar.n2 {
    public final PointF[] E;
    public final PointF[] F;
    public final PointF[] G;
    public final PointF[] H;
    public final RectF I;
    public final RectF J;
    public long K;
    public v9 L;
    public boolean M;
    public long N;
    public int O;
    public int P;
    public String Q;
    public final int R;
    public boolean S;
    public a6.m T;
    public r8.n U;
    public final int V;
    public ValueAnimator W;
    public float X;
    public float Y;
    public o1.k Z;
    public u9 f41960a;
    public float f41961a0;
    public TextView f41962b;
    public RectF f41963b0;
    public CameraView f41964c;
    public final x5 f41965c0;
    public final HandlerThread d;
    public float f41966d0;
    public Handler f41967e;
    public long f41968e0;
    public TextView f41969f;
    public final Paint h;
    public final Paint f41970n;
    public ImageView f41971r;
    public AnimatorSet f41972s;
    public float v;
    public boolean f41973w;
    public o1.k f41974x;
    public float f41975y;

    public w9(int i10) {
        super(null);
        this.d = new HandlerThread("ScanCamera");
        this.h = new Paint();
        this.f41970n = new Paint(1);
        new Path();
        this.v = 0.5f;
        this.f41973w = false;
        this.f41974x = null;
        this.f41975y = 0.0f;
        this.E = new PointF[4];
        this.F = new PointF[4];
        this.G = new PointF[4];
        this.H = new PointF[4];
        for (int i11 = 0; i11 < 4; i11++) {
            this.E[i11] = new PointF(-1.0f, -1.0f);
            this.F[i11] = new PointF(-1.0f, -1.0f);
            this.G[i11] = new PointF(-1.0f, -1.0f);
            this.H[i11] = new PointF(-1.0f, -1.0f);
        }
        this.I = new RectF();
        this.J = new RectF();
        this.K = 0L;
        this.O = 0;
        this.P = 0;
        this.S = false;
        this.T = null;
        this.U = null;
        this.X = 0.0f;
        this.Y = 0.0f;
        this.f41961a0 = 0.0f;
        this.f41965c0 = new x5(this, 1);
        this.f41966d0 = 0.0f;
        this.f41968e0 = 0L;
        this.V = i10;
        if (Z()) {
            Utilities.globalQueue.postRunnable(new n9(this, 5));
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            if (devicePerformanceClass != 1) {
                this.R = 40;
                return;
            } else {
                this.R = 24;
                return;
            }
        }
        this.R = 8;
    }

    public static Bitmap Y(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.set(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        colorMatrix2.preConcat(colorMatrix);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static Bitmap b0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f7 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void d0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static s9 e0(Activity activity, int i10, v9 v9Var) {
        if (activity == null) {
            return null;
        }
        s9 s9Var = new s9(activity, new org.telegram.ui.ActionBar.c5[]{new ActionBarLayout(activity, false)}, i10, v9Var);
        s9Var.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) s9Var, false);
        AndroidUtilities.setNavigationBarColor((Dialog) s9Var, -16777216, false);
        s9Var.setUseLightStatusBar(false);
        s9Var.getWindow().addFlags(512);
        s9Var.show();
        return s9Var;
    }

    public static PointF[] f0(Point[] pointArr, int i10, int i11) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i12 = 0; i12 < pointArr.length; i12++) {
            Point point = pointArr[i12];
            pointFArr[i12] = new PointF(point.x / i10, point.y / i11);
        }
        return pointFArr;
    }

    public final void X() {
        TextView textView;
        if (this.fragmentView != null && CameraView.isCameraAllowed()) {
            CameraController.getInstance().initCamera(null);
            CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
            this.f41964c = cameraView;
            cameraView.setUseMaxPreview(true);
            this.f41964c.setOptimizeForBarcode(true);
            this.f41964c.setDelegate(new z0(this, 13));
            ((ViewGroup) this.fragmentView).addView(this.f41964c, 0, w7.z5.c(-1.0f, -1));
            if (this.V == 0 && (textView = this.f41969f) != null) {
                this.f41964c.addView(textView);
            }
        }
    }

    public final boolean Z() {
        int i10 = this.V;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    public final void c0(android.graphics.Bitmap r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w9.c0(android.graphics.Bitmap):void");
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.f41973w) {
            this.actionBar.B(-1, false);
            this.actionBar.A(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21223z6, false), false);
            this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21136u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !Z()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.I && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21189x8, kVar.J0));
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 25));
        this.h.setColor(2130706432);
        Paint paint = this.f41970n;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        t9 t9Var = new t9(this, context);
        t9Var.setOnTouchListener(new bi.d(2));
        this.fragmentView = t9Var;
        if (Z()) {
            this.fragmentView.postDelayed(new n9(this, 0), 450L);
        } else {
            X();
        }
        int i10 = this.V;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.i6.f20817d6;
            kVar2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.B(-1, false);
            this.actionBar.A(587202559, false);
            t9Var.setBackgroundColor(-16777216);
            t9Var.addView(this.actionBar);
        }
        if (i10 == 2 || i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.k90.c());
        paint2.setColor(i0.a.k(-1, 40));
        u9 u9Var = new u9(context, paint2);
        this.f41960a = u9Var;
        u9Var.setGravity(1);
        this.f41960a.setTextSize(1, 24.0f);
        t9Var.addView(this.f41960a);
        TextView textView = new TextView(context);
        this.f41962b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false));
        this.f41962b.setGravity(1);
        this.f41962b.setTextSize(1, 16.0f);
        t9Var.addView(this.f41962b);
        TextView textView2 = new TextView(context);
        this.f41969f = textView2;
        textView2.setTextColor(-1);
        this.f41969f.setGravity(81);
        this.f41969f.setAlpha(0.0f);
        if (i10 == 0) {
            this.f41960a.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.f41962b.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.f41960a.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
            this.f41969f.setTypeface(Typeface.MONOSPACE);
        } else {
            if (i10 != 1 && i10 != 3) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AuthAnotherClientInfo5));
                String[] strArr = {LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), LocaleController.getString(R.string.AuthAnotherWebClientUrl)};
                int i12 = 0;
                for (int i13 = 2; i12 < i13; i13 = 2) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i14 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i14);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.f41960a.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i14, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.k61(strArr[i12], 0), i14, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.d61(AndroidUtilities.bold()), i14, indexOf2, 33);
                    i12++;
                }
                this.f41960a.setLinkTextColor(-1);
                this.f41960a.setTextSize(1, 16.0f);
                this.f41960a.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.f41960a.setPadding(0, 0, 0, 0);
                this.f41960a.setText(spannableStringBuilder);
            } else {
                this.f41960a.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            }
            this.f41960a.setTextColor(-1);
            if (i10 == 3) {
                this.f41962b.setTextColor(-1711276033);
            }
            this.f41969f.setTextSize(1, 16.0f);
            this.f41969f.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            this.f41969f.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            t9Var.addView(this.f41969f);
            ImageView imageView = new ImageView(context);
            this.f41971r = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f41971r.setImageResource(R.drawable.qr_flashlight);
            this.f41971r.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(60.0f), 587202559));
            t9Var.addView(this.f41971r);
            this.f41971r.setOnClickListener(new a(this, 11));
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final la.h g0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        la.h hVar;
        la.h hVar2;
        int i13;
        String str;
        PointF[] pointFArr;
        int i14;
        cc.d dVar;
        PointF[] pointFArr2;
        la.h hVar3;
        PointF[] pointFArr3;
        PointF[] pointFArr4;
        la.h hVar4 = null;
        try {
            RectF rectF = new RectF();
            r8.n nVar = this.U;
            float f7 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.f45930b.k()) {
                if (bitmap != null) {
                    hVar3 = new la.h(22);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    hVar3.d = bitmap;
                    a3.l lVar = (a3.l) hVar3.f15397b;
                    lVar.f155a = width;
                    lVar.f156b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    hVar3 = new la.h(22);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap != null) {
                        if (wrap.capacity() >= width2 * height2) {
                            hVar3.f15398c = wrap;
                            a3.l lVar2 = (a3.l) hVar3.f15397b;
                            lVar2.f155a = width2;
                            lVar2.f156b = height2;
                            i13 = size.getWidth();
                            i14 = size.getWidth();
                        } else {
                            throw new IllegalArgumentException("Invalid image data size.");
                        }
                    } else {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                }
                SparseArray Z0 = this.U.Z0(hVar3);
                if (Z0.size() > 0) {
                    r8.m mVar = (r8.m) Z0.valueAt(0);
                    str = mVar.f45920b;
                    Point[] pointArr = mVar.f45922e;
                    PointF[] f02 = f0(pointArr, i13, i14);
                    pointFArr4 = f02;
                    if (pointArr.length != 0) {
                        int length = pointArr.length;
                        float f11 = Float.MIN_VALUE;
                        float f12 = Float.MAX_VALUE;
                        while (i15 < length) {
                            Point point = pointArr[i15];
                            f10 = Math.min(f10, point.x);
                            f7 = Math.max(f7, point.x);
                            f12 = Math.min(f12, point.y);
                            f11 = Math.max(f11, point.y);
                            i15++;
                        }
                        rectF.set(f10, f12, f7, f11);
                        pointFArr3 = f02;
                        hVar2 = null;
                        pointFArr = pointFArr3;
                    }
                    rectF = null;
                    pointFArr3 = pointFArr4;
                    hVar2 = null;
                    pointFArr = pointFArr3;
                } else {
                    if (bitmap != null) {
                        Bitmap Y = Y(bitmap);
                        bitmap.recycle();
                        la.h hVar5 = new la.h(22);
                        int width3 = Y.getWidth();
                        int height3 = Y.getHeight();
                        hVar5.d = Y;
                        a3.l lVar3 = (a3.l) hVar5.f15397b;
                        lVar3.f155a = width3;
                        lVar3.f156b = height3;
                        i13 = Y.getWidth();
                        i14 = Y.getHeight();
                        SparseArray Z02 = this.U.Z0(hVar5);
                        if (Z02.size() > 0) {
                            r8.m mVar2 = (r8.m) Z02.valueAt(0);
                            str = mVar2.f45920b;
                            Point[] pointArr2 = mVar2.f45922e;
                            PointF[] f03 = f0(pointArr2, i13, i14);
                            if (pointArr2.length == 0) {
                                pointFArr4 = f03;
                                rectF = null;
                                pointFArr3 = pointFArr4;
                            } else {
                                int length2 = pointArr2.length;
                                float f13 = Float.MIN_VALUE;
                                float f14 = Float.MAX_VALUE;
                                while (i15 < length2) {
                                    Point point2 = pointArr2[i15];
                                    f10 = Math.min(f10, point2.x);
                                    f7 = Math.max(f7, point2.x);
                                    f14 = Math.min(f14, point2.y);
                                    f13 = Math.max(f13, point2.y);
                                    i15++;
                                }
                                rectF.set(f10, f14, f7, f13);
                                pointFArr3 = f03;
                            }
                        } else {
                            Bitmap b02 = b0(Y);
                            Y.recycle();
                            la.h hVar6 = new la.h(22);
                            int width4 = b02.getWidth();
                            int height4 = b02.getHeight();
                            hVar6.d = b02;
                            a3.l lVar4 = (a3.l) hVar6.f15397b;
                            lVar4.f155a = width4;
                            lVar4.f156b = height4;
                            int width5 = Y.getWidth();
                            int height5 = Y.getHeight();
                            SparseArray Z03 = this.U.Z0(hVar6);
                            if (Z03.size() > 0) {
                                r8.m mVar3 = (r8.m) Z03.valueAt(0);
                                String str2 = mVar3.f45920b;
                                Point[] pointArr3 = mVar3.f45922e;
                                PointF[] f04 = f0(pointArr3, width5, height5);
                                if (pointArr3.length == 0) {
                                    rectF = null;
                                } else {
                                    int length3 = pointArr3.length;
                                    float f15 = Float.MIN_VALUE;
                                    float f16 = Float.MAX_VALUE;
                                    while (i15 < length3) {
                                        Point point3 = pointArr3[i15];
                                        f10 = Math.min(f10, point3.x);
                                        f7 = Math.max(f7, point3.x);
                                        f16 = Math.min(f16, point3.y);
                                        f15 = Math.max(f15, point3.y);
                                        i15++;
                                    }
                                    rectF.set(f10, f16, f7, f15);
                                }
                                i14 = height5;
                                str = str2;
                                i13 = width5;
                                pointFArr3 = f04;
                            } else {
                                i13 = width5;
                                i14 = height5;
                            }
                        }
                        hVar2 = null;
                        pointFArr = pointFArr3;
                    }
                    str = null;
                    pointFArr3 = null;
                    hVar2 = null;
                    pointFArr = pointFArr3;
                }
            } else if (this.T != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new cc.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                    i13 = width6;
                } else {
                    cc.f fVar = new cc.f(size.getWidth(), size.getHeight(), i10, i11, i12, i12);
                    i13 = size.getWidth();
                    i14 = size.getHeight();
                    dVar = fVar;
                }
                aa.a h = this.T.h(new of.b(new dc.f(dVar)));
                cc.j[] jVarArr = (cc.j[]) h.f387c;
                String str3 = (String) h.f386b;
                if (jVarArr == null || jVarArr.length == 0) {
                    hVar2 = null;
                    pointFArr2 = null;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f17 = Float.MIN_VALUE;
                    float f18 = Float.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < length4) {
                        cc.j jVar = jVarArr[i16];
                        float f19 = jVar.f4553a;
                        hVar = hVar4;
                        try {
                            float f20 = jVar.f4554b;
                            f10 = Math.min(f10, f19);
                            f7 = Math.max(f7, jVar.f4553a);
                            f18 = Math.min(f18, f20);
                            f17 = Math.max(f17, f20);
                            i16++;
                            hVar4 = hVar;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new n9(this, 6));
                            return hVar;
                        }
                    }
                    hVar2 = hVar4;
                    rectF.set(f10, f18, f7, f17);
                    if (jVarArr.length == 4) {
                        pointFArr2 = new PointF[4];
                        while (i15 < 4) {
                            cc.j jVar2 = jVarArr[i15];
                            pointFArr2[i15] = new PointF(jVar2.f4553a / i13, jVar2.f4554b / i14);
                            i15++;
                        }
                    } else {
                        pointFArr2 = hVar2;
                    }
                }
                str = str3;
                pointFArr = pointFArr2;
            } else {
                hVar2 = null;
                i13 = 1;
                str = null;
                pointFArr = null;
                i14 = 1;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new n9(this, 6));
                return hVar2;
            } else if (this.V == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new n9(this, 6));
                return hVar2;
            } else {
                la.h hVar7 = new la.h(12, false);
                if (rectF != null) {
                    float dp = AndroidUtilities.dp(25.0f);
                    float dp2 = AndroidUtilities.dp(15.0f);
                    rectF.set(rectF.left - dp, rectF.top - dp2, rectF.right + dp, rectF.bottom + dp2);
                    float f21 = i13;
                    float f22 = i14;
                    rectF.set(rectF.left / f21, rectF.top / f22, rectF.right / f21, rectF.bottom / f22);
                }
                hVar7.d = pointFArr;
                hVar7.f15398c = rectF;
                hVar7.f15397b = str;
                return hVar7;
            }
        } catch (Throwable unused2) {
            hVar = null;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (Z()) {
            return arrayList;
        }
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20817d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21223z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21136u8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41960a, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41962b, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.D6));
        return arrayList;
    }

    public final void h0() {
        int height;
        if (this.f41963b0 == null) {
            this.f41963b0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, height) / 1.5f);
        float f7 = width;
        float height2 = this.fragmentView.getHeight();
        this.f41963b0.set(((width - min) / 2.0f) / f7, ((height - min) / 2.0f) / height2, ((width + min) / 2.0f) / f7, ((height + min) / 2.0f) / height2);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        Point realScreenSize;
        if (i11 == -1 && i10 == 11 && intent != null && intent.getData() != null) {
            try {
                realScreenSize = AndroidUtilities.getRealScreenSize();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                la.h g02 = g0(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
                if (g02 != null) {
                    v9 v9Var = this.L;
                    if (v9Var != null) {
                        v9Var.L((String) g02.f15397b);
                    }
                    finishFragment();
                }
            } catch (Throwable th3) {
                th = th3;
                FileLog.e(th);
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CameraView cameraView = this.f41964c;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.f41964c = null;
        }
        this.d.quitSafely();
        AndroidUtilities.unlockOrientation(getParentActivity());
        r8.n nVar = this.U;
        if (nVar != null) {
            nVar.U0();
        }
    }
}

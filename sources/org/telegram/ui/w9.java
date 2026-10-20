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
    public float E;
    public final PointF[] F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final RectF J;
    public final RectF K;
    public long L;
    public v9 M;
    public boolean N;
    public long O;
    public int P;
    public int Q;
    public String R;
    public final int S;
    public boolean T;
    public a6.i U;
    public r8.n V;
    public final int W;
    public ValueAnimator X;
    public float Y;
    public float Z;
    public g f42501a;
    public o1.k f42502a0;
    public u9 f42503b;
    public float f42504b0;
    public TextView f42505c;
    public RectF f42506c0;
    public CameraView d;
    public final a6 f42507d0;
    public final HandlerThread e;
    public float f42508e0;
    public Handler f42509f;
    public long f42510f0;
    public TextView h;
    public final Paint f42511n;
    public final Paint f42512r;
    public ImageView f42513s;
    public AnimatorSet v;
    public float f42514w;
    public boolean f42515x;
    public o1.k f42516y;

    public w9(int i10) {
        super(null);
        this.e = new HandlerThread("ScanCamera");
        this.f42511n = new Paint();
        this.f42512r = new Paint(1);
        new Path();
        this.f42514w = 0.5f;
        this.f42515x = false;
        this.f42516y = null;
        this.E = 0.0f;
        this.F = new PointF[4];
        this.G = new PointF[4];
        this.H = new PointF[4];
        this.I = new PointF[4];
        for (int i11 = 0; i11 < 4; i11++) {
            this.F[i11] = new PointF(-1.0f, -1.0f);
            this.G[i11] = new PointF(-1.0f, -1.0f);
            this.H[i11] = new PointF(-1.0f, -1.0f);
            this.I[i11] = new PointF(-1.0f, -1.0f);
        }
        this.J = new RectF();
        this.K = new RectF();
        this.L = 0L;
        this.P = 0;
        this.Q = 0;
        this.T = false;
        this.U = null;
        this.V = null;
        this.Y = 0.0f;
        this.Z = 0.0f;
        this.f42504b0 = 0.0f;
        this.f42507d0 = new a6(this, 1);
        this.f42508e0 = 0.0f;
        this.f42510f0 = 0L;
        this.W = i10;
        if (a0()) {
            Utilities.globalQueue.postRunnable(new n9(this, 5));
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            if (devicePerformanceClass != 1) {
                this.S = 40;
                return;
            } else {
                this.S = 24;
                return;
            }
        }
        this.S = 8;
    }

    public static Bitmap Z(Bitmap bitmap) {
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
        s9 s9Var = new s9(activity, new org.telegram.ui.ActionBar.d5[]{new ActionBarLayout(activity, false)}, i10, v9Var);
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

    public final void Y() {
        TextView textView;
        if (this.fragmentView != null && CameraView.isCameraAllowed()) {
            CameraController.getInstance().initCamera(null);
            CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
            this.d = cameraView;
            cameraView.setUseMaxPreview(true);
            this.d.setOptimizeForBarcode(true);
            this.d.setDelegate(new b1(this, 11));
            ((ViewGroup) this.fragmentView).addView(this.d, 0, w7.z5.c(-1.0f, -1));
            if (this.W == 0 && (textView = this.h) != null) {
                this.d.addView(textView);
            }
        }
    }

    public final boolean a0() {
        int i10 = this.W;
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
        vk0 vk0Var;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.f42515x) {
            this.actionBar.C(-1, false);
            this.actionBar.B(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21395z6, false), false);
            this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21308u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !a0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.I && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21362x8, kVar.I0));
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 28));
        this.f42511n.setColor(2130706432);
        Paint paint = this.f42512r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        t9 t9Var = new t9(this, context);
        t9Var.setOnTouchListener(new di.d(2));
        this.fragmentView = t9Var;
        if (a0()) {
            this.fragmentView.postDelayed(new n9(this, 0), 450L);
        } else {
            Y();
        }
        int i10 = this.W;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.h6.f20990d6;
            kVar2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.C(-1, false);
            this.actionBar.B(587202559, false);
            t9Var.setBackgroundColor(-16777216);
            t9Var.addView(this.actionBar);
        }
        if (i10 == 2 || i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.r90.c());
        paint2.setColor(i0.a.o(-1, 40));
        u9 u9Var = new u9(context, paint2);
        this.f42503b = u9Var;
        u9Var.setGravity(1);
        this.f42503b.setTextSize(1, 24.0f);
        t9Var.addView(this.f42503b);
        TextView textView = new TextView(context);
        this.f42505c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        this.f42505c.setGravity(1);
        this.f42505c.setTextSize(1, 16.0f);
        t9Var.addView(this.f42505c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (i10 == 0) {
            this.f42503b.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.f42505c.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.f42503b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
            this.h.setTypeface(Typeface.MONOSPACE);
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
                    this.f42503b.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i14, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.l61(strArr[i12], 0), i14, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), i14, indexOf2, 33);
                    i12++;
                }
                this.f42503b.setLinkTextColor(-1);
                this.f42503b.setTextSize(1, 16.0f);
                this.f42503b.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.f42503b.setPadding(0, 0, 0, 0);
                this.f42503b.setText(spannableStringBuilder);
            } else {
                this.f42503b.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            }
            this.f42503b.setTextColor(-1);
            if (i10 == 3) {
                this.f42505c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            this.h.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            t9Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.f42513s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f42513s.setImageResource(R.drawable.qr_flashlight);
            this.f42513s.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(60.0f), 587202559));
            t9Var.addView(this.f42513s);
            this.f42513s.setOnClickListener(new a(this, 11));
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            vk0Var = ((LaunchActivity) parentActivity).f33192t1;
        } else {
            vk0Var = null;
        }
        if (vk0Var != null && this.f42501a == null) {
            g gVar = new g(vk0Var, 29);
            vk0Var.f42277b.add(gVar);
            vk0Var.a();
            this.f42501a = gVar;
        }
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final m.g3 g0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        m.g3 g3Var;
        m.g3 g3Var2;
        int i13;
        int i14;
        String str;
        PointF[] pointFArr;
        dc.d dVar;
        PointF[] pointFArr2;
        m.g3 g3Var3;
        PointF[] pointFArr3;
        PointF[] pointFArr4;
        m.g3 g3Var4 = null;
        try {
            RectF rectF = new RectF();
            r8.n nVar = this.V;
            float f7 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.f45125b.k()) {
                if (bitmap != null) {
                    g3Var3 = new m.g3(22);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    g3Var3.d = bitmap;
                    a3.l lVar = (a3.l) g3Var3.f16202b;
                    lVar.f139a = width;
                    lVar.f140b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    g3Var3 = new m.g3(22);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap != null) {
                        if (wrap.capacity() >= width2 * height2) {
                            g3Var3.f16203c = wrap;
                            a3.l lVar2 = (a3.l) g3Var3.f16202b;
                            lVar2.f139a = width2;
                            lVar2.f140b = height2;
                            i13 = size.getWidth();
                            i14 = size.getWidth();
                        } else {
                            throw new IllegalArgumentException("Invalid image data size.");
                        }
                    } else {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                }
                SparseArray e12 = this.V.e1(g3Var3);
                if (e12.size() > 0) {
                    r8.m mVar = (r8.m) e12.valueAt(0);
                    str = mVar.f45116b;
                    Point[] pointArr = mVar.e;
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
                        g3Var2 = null;
                        pointFArr = pointFArr3;
                    }
                    rectF = null;
                    pointFArr3 = pointFArr4;
                    g3Var2 = null;
                    pointFArr = pointFArr3;
                } else {
                    if (bitmap != null) {
                        Bitmap Z = Z(bitmap);
                        bitmap.recycle();
                        m.g3 g3Var5 = new m.g3(22);
                        int width3 = Z.getWidth();
                        int height3 = Z.getHeight();
                        g3Var5.d = Z;
                        a3.l lVar3 = (a3.l) g3Var5.f16202b;
                        lVar3.f139a = width3;
                        lVar3.f140b = height3;
                        i13 = Z.getWidth();
                        i14 = Z.getHeight();
                        SparseArray e13 = this.V.e1(g3Var5);
                        if (e13.size() > 0) {
                            r8.m mVar2 = (r8.m) e13.valueAt(0);
                            str = mVar2.f45116b;
                            Point[] pointArr2 = mVar2.e;
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
                            Bitmap b02 = b0(Z);
                            Z.recycle();
                            m.g3 g3Var6 = new m.g3(22);
                            int width4 = b02.getWidth();
                            int height4 = b02.getHeight();
                            g3Var6.d = b02;
                            a3.l lVar4 = (a3.l) g3Var6.f16202b;
                            lVar4.f139a = width4;
                            lVar4.f140b = height4;
                            int width5 = Z.getWidth();
                            int height5 = Z.getHeight();
                            SparseArray e14 = this.V.e1(g3Var6);
                            if (e14.size() > 0) {
                                r8.m mVar3 = (r8.m) e14.valueAt(0);
                                String str2 = mVar3.f45116b;
                                Point[] pointArr3 = mVar3.e;
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
                        g3Var2 = null;
                        pointFArr = pointFArr3;
                    }
                    str = null;
                    pointFArr3 = null;
                    g3Var2 = null;
                    pointFArr = pointFArr3;
                }
            } else if (this.U != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new dc.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                    i13 = width6;
                } else {
                    dc.f fVar = new dc.f(size.getWidth(), size.getHeight(), i10, i11, i12, i12);
                    i13 = size.getWidth();
                    i14 = size.getHeight();
                    dVar = fVar;
                }
                androidx.biometric.e j10 = this.U.j(new n4.s(15, (Object) new ec.e(dVar), false));
                dc.j[] jVarArr = (dc.j[]) j10.f2816c;
                String str3 = (String) j10.f2815b;
                if (jVarArr == null || jVarArr.length == 0) {
                    g3Var2 = null;
                    pointFArr2 = null;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f17 = Float.MIN_VALUE;
                    float f18 = Float.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < length4) {
                        dc.j jVar = jVarArr[i16];
                        float f19 = jVar.f7939a;
                        g3Var = g3Var4;
                        try {
                            float f20 = jVar.f7940b;
                            f10 = Math.min(f10, f19);
                            f7 = Math.max(f7, jVar.f7939a);
                            f18 = Math.min(f18, f20);
                            f17 = Math.max(f17, f20);
                            i16++;
                            g3Var4 = g3Var;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new n9(this, 6));
                            return g3Var;
                        }
                    }
                    g3Var2 = g3Var4;
                    rectF.set(f10, f18, f7, f17);
                    if (jVarArr.length == 4) {
                        pointFArr2 = new PointF[4];
                        while (i15 < 4) {
                            dc.j jVar2 = jVarArr[i15];
                            pointFArr2[i15] = new PointF(jVar2.f7939a / i13, jVar2.f7940b / i14);
                            i15++;
                        }
                    } else {
                        pointFArr2 = g3Var2;
                    }
                }
                str = str3;
                pointFArr = pointFArr2;
            } else {
                g3Var2 = null;
                i13 = 1;
                i14 = 1;
                str = null;
                pointFArr = null;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new n9(this, 6));
                return g3Var2;
            } else if (this.W == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new n9(this, 6));
                return g3Var2;
            } else {
                m.g3 g3Var7 = new m.g3(11, false);
                if (rectF != null) {
                    float dp = AndroidUtilities.dp(25.0f);
                    float dp2 = AndroidUtilities.dp(15.0f);
                    rectF.set(rectF.left - dp, rectF.top - dp2, rectF.right + dp, rectF.bottom + dp2);
                    float f21 = i13;
                    float f22 = i14;
                    rectF.set(rectF.left / f21, rectF.top / f22, rectF.right / f21, rectF.bottom / f22);
                }
                g3Var7.d = pointFArr;
                g3Var7.f16203c = rectF;
                g3Var7.f16202b = str;
                return g3Var7;
            }
        } catch (Throwable unused2) {
            g3Var = null;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (a0()) {
            return arrayList;
        }
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20990d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21395z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21308u8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42503b, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42505c, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.D6));
        return arrayList;
    }

    public final void h0() {
        int height;
        if (this.f42506c0 == null) {
            this.f42506c0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, height) / 1.5f);
        float f7 = width;
        float height2 = this.fragmentView.getHeight();
        this.f42506c0.set(((width - min) / 2.0f) / f7, ((height - min) / 2.0f) / height2, ((width + min) / 2.0f) / f7, ((height + min) / 2.0f) / height2);
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
                m.g3 g02 = g0(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
                if (g02 != null) {
                    v9 v9Var = this.M;
                    if (v9Var != null) {
                        v9Var.E((String) g02.f16202b);
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
        CameraView cameraView = this.d;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.d = null;
        }
        this.e.quitSafely();
        g gVar = this.f42501a;
        if (gVar != null) {
            vk0 vk0Var = (vk0) gVar.f37149b;
            if (vk0Var.f42277b.remove(gVar)) {
                vk0Var.a();
            }
            this.f42501a = null;
        }
        r8.n nVar = this.V;
        if (nVar != null) {
            nVar.X0();
        }
    }
}

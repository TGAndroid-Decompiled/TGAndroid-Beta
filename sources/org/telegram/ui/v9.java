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
public class v9 extends org.telegram.ui.ActionBar.p2 {
    public final PointF[] B;
    public final PointF[] C;
    public final PointF[] D;
    public final PointF[] E;
    public final RectF F;
    public final RectF G;
    public long H;
    public u9 I;
    public boolean J;
    public long K;
    public int L;
    public int M;
    public String N;
    public final int O;
    public boolean P;
    public org.telegram.ui.Components.ai Q;
    public f8.n R;
    public final int S;
    public ValueAnimator T;
    public float U;
    public float V;
    public o1.j W;
    public float X;
    public RectF Y;
    public final z5 Z;
    public t9 f42055a;
    public float f42056a0;
    public TextView f42057b;
    public long f42058b0;
    public CameraView f42059c;
    public final HandlerThread d;
    public Handler f42060e;
    public TextView f42061f;
    public final Paint h;
    public final Paint f42062n;
    public ImageView f42063r;
    public AnimatorSet f42064s;
    public float v;
    public boolean f42065w;
    public o1.j f42066x;
    public float f42067y;

    public v9(int i10) {
        super(null);
        this.d = new HandlerThread("ScanCamera");
        this.h = new Paint();
        this.f42062n = new Paint(1);
        new Path();
        this.v = 0.5f;
        this.f42065w = false;
        this.f42066x = null;
        this.f42067y = 0.0f;
        this.B = new PointF[4];
        this.C = new PointF[4];
        this.D = new PointF[4];
        this.E = new PointF[4];
        for (int i11 = 0; i11 < 4; i11++) {
            this.B[i11] = new PointF(-1.0f, -1.0f);
            this.C[i11] = new PointF(-1.0f, -1.0f);
            this.D[i11] = new PointF(-1.0f, -1.0f);
            this.E[i11] = new PointF(-1.0f, -1.0f);
        }
        this.F = new RectF();
        this.G = new RectF();
        this.H = 0L;
        this.L = 0;
        this.M = 0;
        this.P = false;
        this.Q = null;
        this.R = null;
        this.U = 0.0f;
        this.V = 0.0f;
        this.X = 0.0f;
        this.Z = new z5(this, 1);
        this.f42056a0 = 0.0f;
        this.f42058b0 = 0L;
        this.S = i10;
        if (a0()) {
            Utilities.globalQueue.postRunnable(new m9(this, 5));
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            if (devicePerformanceClass != 1) {
                this.O = 40;
                return;
            } else {
                this.O = 24;
                return;
            }
        }
        this.O = 8;
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
        float f10 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void d0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static r9 e0(Activity activity, int i10, u9 u9Var) {
        if (activity == null) {
            return null;
        }
        r9 r9Var = new r9(activity, new org.telegram.ui.ActionBar.f5[]{new ActionBarLayout(activity, false)}, i10, u9Var);
        r9Var.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) r9Var, false);
        AndroidUtilities.setNavigationBarColor((Dialog) r9Var, -16777216, false);
        r9Var.setUseLightStatusBar(false);
        r9Var.getWindow().addFlags(512);
        r9Var.show();
        return r9Var;
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
            this.f42059c = cameraView;
            cameraView.setUseMaxPreview(true);
            this.f42059c.setOptimizeForBarcode(true);
            this.f42059c.setDelegate(new a1(this, 11));
            ((ViewGroup) this.fragmentView).addView(this.f42059c, 0, k7.c6.c(-1.0f, -1));
            if (this.S == 0 && (textView = this.f42061f) != null) {
                this.f42059c.addView(textView);
            }
        }
    }

    public final boolean a0() {
        int i10 = this.S;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    public final void c0(android.graphics.Bitmap r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v9.c0(android.graphics.Bitmap):void");
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.f42065w) {
            this.actionBar.C(-1, false);
            this.actionBar.B(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22055z6, false), false);
            this.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21965u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !a0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.F && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22021x8, kVar.F0));
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 12));
        this.h.setColor(2130706432);
        Paint paint = this.f42062n;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        s9 s9Var = new s9(this, context);
        s9Var.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        this.fragmentView = s9Var;
        if (a0()) {
            this.fragmentView.postDelayed(new m9(this, 0), 450L);
        } else {
            Y();
        }
        int i10 = this.S;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.k6.f21661d6;
            kVar2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.C(-1, false);
            this.actionBar.B(587202559, false);
            s9Var.setBackgroundColor(-16777216);
            s9Var.addView(this.actionBar);
        }
        if (i10 == 2 || i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.z80.c());
        paint2.setColor(i0.a.k(-1, 40));
        t9 t9Var = new t9(context, paint2);
        this.f42055a = t9Var;
        t9Var.setGravity(1);
        this.f42055a.setTextSize(1, 24.0f);
        s9Var.addView(this.f42055a);
        TextView textView = new TextView(context);
        this.f42057b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.D6, false));
        this.f42057b.setGravity(1);
        this.f42057b.setTextSize(1, 16.0f);
        s9Var.addView(this.f42057b);
        TextView textView2 = new TextView(context);
        this.f42061f = textView2;
        textView2.setTextColor(-1);
        this.f42061f.setGravity(81);
        this.f42061f.setAlpha(0.0f);
        if (i10 == 0) {
            this.f42055a.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.f42057b.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.f42055a.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
            this.f42061f.setTypeface(Typeface.MONOSPACE);
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
                    this.f42055a.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i14, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.l51(strArr[i12], 0), i14, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), i14, indexOf2, 33);
                    i12++;
                }
                this.f42055a.setLinkTextColor(-1);
                this.f42055a.setTextSize(1, 16.0f);
                this.f42055a.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.f42055a.setPadding(0, 0, 0, 0);
                this.f42055a.setText(spannableStringBuilder);
            } else {
                this.f42055a.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            }
            this.f42055a.setTextColor(-1);
            if (i10 == 3) {
                this.f42057b.setTextColor(-1711276033);
            }
            this.f42061f.setTextSize(1, 16.0f);
            this.f42061f.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            this.f42061f.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            s9Var.addView(this.f42061f);
            ImageView imageView = new ImageView(context);
            this.f42063r = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f42063r.setImageResource(R.drawable.qr_flashlight);
            this.f42063r.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(60.0f), 587202559));
            s9Var.addView(this.f42063r);
            this.f42063r.setOnClickListener(new a(this, 11));
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final l7.w0 g0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        l7.w0 w0Var;
        l7.w0 w0Var2;
        int i13;
        String str;
        PointF[] pointFArr;
        int i14;
        ob.d dVar;
        PointF[] pointFArr2;
        androidx.biometric.e eVar;
        PointF[] pointFArr3;
        PointF[] pointFArr4;
        l7.w0 w0Var3 = null;
        try {
            RectF rectF = new RectF();
            f8.n nVar = this.R;
            float f10 = Float.MIN_VALUE;
            float f11 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.f6220b.k()) {
                if (bitmap != null) {
                    eVar = new androidx.biometric.e(15);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    eVar.d = bitmap;
                    e8.a aVar = (e8.a) eVar.f527b;
                    aVar.f4995a = width;
                    aVar.f4996b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    eVar = new androidx.biometric.e(15);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap != null) {
                        if (wrap.capacity() >= width2 * height2) {
                            eVar.f528c = wrap;
                            e8.a aVar2 = (e8.a) eVar.f527b;
                            aVar2.f4995a = width2;
                            aVar2.f4996b = height2;
                            i13 = size.getWidth();
                            i14 = size.getWidth();
                        } else {
                            throw new IllegalArgumentException("Invalid image data size.");
                        }
                    } else {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                }
                SparseArray L = this.R.L(eVar);
                if (L.size() > 0) {
                    f8.m mVar = (f8.m) L.valueAt(0);
                    str = mVar.f6210b;
                    Point[] pointArr = mVar.f6212e;
                    PointF[] f02 = f0(pointArr, i13, i14);
                    pointFArr4 = f02;
                    if (pointArr.length != 0) {
                        int length = pointArr.length;
                        float f12 = Float.MIN_VALUE;
                        float f13 = Float.MAX_VALUE;
                        while (i15 < length) {
                            Point point = pointArr[i15];
                            f11 = Math.min(f11, point.x);
                            f10 = Math.max(f10, point.x);
                            f13 = Math.min(f13, point.y);
                            f12 = Math.max(f12, point.y);
                            i15++;
                        }
                        rectF.set(f11, f13, f10, f12);
                        pointFArr3 = f02;
                        w0Var2 = null;
                        pointFArr = pointFArr3;
                    }
                    rectF = null;
                    pointFArr3 = pointFArr4;
                    w0Var2 = null;
                    pointFArr = pointFArr3;
                } else {
                    if (bitmap != null) {
                        Bitmap Z = Z(bitmap);
                        bitmap.recycle();
                        androidx.biometric.e eVar2 = new androidx.biometric.e(15);
                        int width3 = Z.getWidth();
                        int height3 = Z.getHeight();
                        eVar2.d = Z;
                        e8.a aVar3 = (e8.a) eVar2.f527b;
                        aVar3.f4995a = width3;
                        aVar3.f4996b = height3;
                        i13 = Z.getWidth();
                        i14 = Z.getHeight();
                        SparseArray L2 = this.R.L(eVar2);
                        if (L2.size() > 0) {
                            f8.m mVar2 = (f8.m) L2.valueAt(0);
                            str = mVar2.f6210b;
                            Point[] pointArr2 = mVar2.f6212e;
                            PointF[] f03 = f0(pointArr2, i13, i14);
                            if (pointArr2.length == 0) {
                                pointFArr4 = f03;
                                rectF = null;
                                pointFArr3 = pointFArr4;
                            } else {
                                int length2 = pointArr2.length;
                                float f14 = Float.MIN_VALUE;
                                float f15 = Float.MAX_VALUE;
                                while (i15 < length2) {
                                    Point point2 = pointArr2[i15];
                                    f11 = Math.min(f11, point2.x);
                                    f10 = Math.max(f10, point2.x);
                                    f15 = Math.min(f15, point2.y);
                                    f14 = Math.max(f14, point2.y);
                                    i15++;
                                }
                                rectF.set(f11, f15, f10, f14);
                                pointFArr3 = f03;
                            }
                        } else {
                            Bitmap b02 = b0(Z);
                            Z.recycle();
                            androidx.biometric.e eVar3 = new androidx.biometric.e(15);
                            int width4 = b02.getWidth();
                            int height4 = b02.getHeight();
                            eVar3.d = b02;
                            e8.a aVar4 = (e8.a) eVar3.f527b;
                            aVar4.f4995a = width4;
                            aVar4.f4996b = height4;
                            int width5 = Z.getWidth();
                            int height5 = Z.getHeight();
                            SparseArray L3 = this.R.L(eVar3);
                            if (L3.size() > 0) {
                                f8.m mVar3 = (f8.m) L3.valueAt(0);
                                String str2 = mVar3.f6210b;
                                Point[] pointArr3 = mVar3.f6212e;
                                PointF[] f04 = f0(pointArr3, width5, height5);
                                if (pointArr3.length == 0) {
                                    rectF = null;
                                } else {
                                    int length3 = pointArr3.length;
                                    float f16 = Float.MIN_VALUE;
                                    float f17 = Float.MAX_VALUE;
                                    while (i15 < length3) {
                                        Point point3 = pointArr3[i15];
                                        f11 = Math.min(f11, point3.x);
                                        f10 = Math.max(f10, point3.x);
                                        f17 = Math.min(f17, point3.y);
                                        f16 = Math.max(f16, point3.y);
                                        i15++;
                                    }
                                    rectF.set(f11, f17, f10, f16);
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
                        w0Var2 = null;
                        pointFArr = pointFArr3;
                    }
                    str = null;
                    pointFArr3 = null;
                    w0Var2 = null;
                    pointFArr = pointFArr3;
                }
            } else if (this.Q != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new ob.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                    i13 = width6;
                } else {
                    ob.f fVar = new ob.f(size.getWidth(), size.getHeight(), i10, i11, i12, i12);
                    i13 = size.getWidth();
                    i14 = size.getHeight();
                    dVar = fVar;
                }
                l7.w0 b10 = this.Q.b(new n7.qa(new pb.f(dVar)));
                ob.j[] jVarArr = (ob.j[]) b10.f12081c;
                String str3 = (String) b10.f12080b;
                if (jVarArr == null || jVarArr.length == 0) {
                    w0Var2 = null;
                    pointFArr2 = null;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f18 = Float.MIN_VALUE;
                    float f19 = Float.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < length4) {
                        ob.j jVar = jVarArr[i16];
                        float f20 = jVar.f16705a;
                        w0Var = w0Var3;
                        try {
                            float f21 = jVar.f16706b;
                            f11 = Math.min(f11, f20);
                            f10 = Math.max(f10, jVar.f16705a);
                            f19 = Math.min(f19, f21);
                            f18 = Math.max(f18, f21);
                            i16++;
                            w0Var3 = w0Var;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new m9(this, 6));
                            return w0Var;
                        }
                    }
                    w0Var2 = w0Var3;
                    rectF.set(f11, f19, f10, f18);
                    if (jVarArr.length == 4) {
                        pointFArr2 = new PointF[4];
                        while (i15 < 4) {
                            ob.j jVar2 = jVarArr[i15];
                            pointFArr2[i15] = new PointF(jVar2.f16705a / i13, jVar2.f16706b / i14);
                            i15++;
                        }
                    } else {
                        pointFArr2 = w0Var2;
                    }
                }
                str = str3;
                pointFArr = pointFArr2;
            } else {
                w0Var2 = null;
                i13 = 1;
                str = null;
                pointFArr = null;
                i14 = 1;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new m9(this, 6));
                return w0Var2;
            } else if (this.S == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new m9(this, 6));
                return w0Var2;
            } else {
                l7.w0 w0Var4 = new l7.w0(18, false);
                if (rectF != null) {
                    float dp = AndroidUtilities.dp(25.0f);
                    float dp2 = AndroidUtilities.dp(15.0f);
                    rectF.set(rectF.left - dp, rectF.top - dp2, rectF.right + dp, rectF.bottom + dp2);
                    float f22 = i13;
                    float f23 = i14;
                    rectF.set(rectF.left / f22, rectF.top / f23, rectF.right / f22, rectF.bottom / f23);
                }
                w0Var4.d = pointFArr;
                w0Var4.f12081c = rectF;
                w0Var4.f12080b = str;
                return w0Var4;
            }
        } catch (Throwable unused2) {
            w0Var = null;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (a0()) {
            return arrayList;
        }
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f22055z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21965u8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f42055a, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f42057b, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.D6));
        return arrayList;
    }

    public final void h0() {
        int height;
        if (this.Y == null) {
            this.Y = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, height) / 1.5f);
        float f10 = width;
        float height2 = this.fragmentView.getHeight();
        this.Y.set(((width - min) / 2.0f) / f10, ((height - min) / 2.0f) / height2, ((width + min) / 2.0f) / f10, ((height + min) / 2.0f) / height2);
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
                l7.w0 g02 = g0(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
                if (g02 != null) {
                    u9 u9Var = this.I;
                    if (u9Var != null) {
                        u9Var.J((String) g02.f12080b);
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
        CameraView cameraView = this.f42059c;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.f42059c = null;
        }
        this.d.quitSafely();
        AndroidUtilities.unlockOrientation(getParentActivity());
        f8.n nVar = this.R;
        if (nVar != null) {
            nVar.J();
        }
    }
}

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
import android.graphics.drawable.Drawable;
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
public class y9 extends org.telegram.ui.ActionBar.r2 {
    public float E;
    public final PointF[] F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final RectF J;
    public final RectF K;
    public long L;
    public x9 M;
    public boolean N;
    public long O;
    public int P;
    public int Q;
    public String R;
    public final int S;
    public boolean T;
    public za.c U;
    public s8.n V;
    public final int W;
    public ValueAnimator X;
    public float Y;
    public float Z;
    public f f45993a;
    public o1.j f45994a0;
    public w9 f45995b;
    public float f45996b0;
    public TextView f45997c;
    public RectF f45998c0;
    public CameraView d;
    public final y5 f45999d0;
    public final HandlerThread e;
    public float f46000e0;
    public Handler f46001f;
    public long f46002f0;
    public TextView h;
    public final Paint f46003n;
    public final Paint f46004r;
    public ImageView f46005s;
    public AnimatorSet v;
    public float f46006w;
    public boolean f46007x;
    public o1.j f46008y;

    public y9(int i10) {
        super(null);
        this.e = new HandlerThread("ScanCamera");
        this.f46003n = new Paint();
        this.f46004r = new Paint(1);
        new Path();
        this.f46006w = 0.5f;
        this.f46007x = false;
        this.f46008y = null;
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
        this.f45996b0 = 0.0f;
        this.f45999d0 = new y5(this, 1);
        this.f46000e0 = 0.0f;
        this.f46002f0 = 0L;
        this.W = i10;
        if (b0()) {
            Utilities.globalQueue.postRunnable(new p9(this, 5));
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

    public static Bitmap a0(Bitmap bitmap) {
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

    public static Bitmap c0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f7 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void e0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static u9 f0(Activity activity, int i10, x9 x9Var) {
        if (activity == null) {
            return null;
        }
        u9 u9Var = new u9(activity, new org.telegram.ui.ActionBar.j5[]{new ActionBarLayout(activity, false)}, i10, x9Var);
        u9Var.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) u9Var, false);
        AndroidUtilities.setNavigationBarColor((Dialog) u9Var, -16777216, false);
        u9Var.setUseLightStatusBar(false);
        u9Var.getWindow().addFlags(512);
        u9Var.show();
        return u9Var;
    }

    public static PointF[] g0(Point[] pointArr, int i10, int i11) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i12 = 0; i12 < pointArr.length; i12++) {
            Point point = pointArr[i12];
            pointFArr[i12] = new PointF(point.x / i10, point.y / i11);
        }
        return pointFArr;
    }

    public final void Z() {
        TextView textView;
        if (this.fragmentView != null && CameraView.isCameraAllowed()) {
            CameraController.getInstance().initCamera(null);
            CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
            this.d = cameraView;
            cameraView.setUseMaxPreview(true);
            this.d.setOptimizeForBarcode(true);
            this.d.setDelegate(new y0(this, 13));
            ((ViewGroup) this.fragmentView).addView(this.d, 0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            if (this.W == 0 && (textView = this.h) != null) {
                this.d.addView(textView);
            }
        }
    }

    public final boolean b0() {
        int i10 = this.W;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        el0 el0Var;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.f46007x;
        int i10 = this.W;
        if (z10) {
            this.actionBar.y(-1, false);
            this.actionBar.x(-1, false);
            this.actionBar.setTitleColor(-1);
        } else if (i10 == 0) {
            org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, org.telegram.ui.ActionBar.y6.f23767z6, null);
            org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.f23675u8, null);
            org.telegram.ui.ActionBar.f7.m(this.actionBar, 5, org.telegram.ui.ActionBar.y6.A8, null);
        } else {
            this.actionBar.y(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23767z6, false), false);
            this.actionBar.x(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23675u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !b0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.I && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23733x8, view, kVar.J0);
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 28));
        this.f46003n.setColor(2130706432);
        Paint paint = this.f46004r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        v9 v9Var = new v9(this, context);
        v9Var.setOnTouchListener(new ei.d(2));
        this.fragmentView = v9Var;
        if (b0()) {
            this.fragmentView.postDelayed(new p9(this, 0), 450L);
        } else {
            Z();
        }
        if (i10 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.y6.f23356d6;
            org.telegram.ui.ActionBar.f7.i(i11, kVar2, null);
            org.telegram.ui.ActionBar.f7.i(i11, this.fragmentView, null);
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.y(-1, false);
            this.actionBar.x(587202559, false);
            v9Var.setBackgroundColor(-16777216);
            v9Var.addView(this.actionBar);
        }
        if (i10 == 2 || i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.s90.c());
        paint2.setColor(i0.a.o(-1, 40));
        w9 w9Var = new w9(context, paint2);
        this.f45995b = w9Var;
        w9Var.setGravity(1);
        this.f45995b.setTextSize(1, 24.0f);
        v9Var.addView(this.f45995b);
        TextView textView = new TextView(context);
        this.f45997c = textView;
        if (i10 == 3) {
            textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false));
        } else {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.D6, null);
        }
        this.f45997c.setGravity(1);
        this.f45997c.setTextSize(1, 16.0f);
        v9Var.addView(this.f45997c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (i10 == 0) {
            this.f45995b.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.f45997c.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            org.telegram.ui.ActionBar.f7.V(this.f45995b, org.telegram.ui.ActionBar.y6.G6, null);
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
                    this.f45995b.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i14, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.x61(strArr[i12], 0), i14, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), i14, indexOf2, 33);
                    i12++;
                }
                this.f45995b.setLinkTextColor(-1);
                this.f45995b.setTextSize(1, 16.0f);
                this.f45995b.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.f45995b.setPadding(0, 0, 0, 0);
                this.f45995b.setText(spannableStringBuilder);
            } else {
                this.f45995b.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            }
            this.f45995b.setTextColor(-1);
            if (i10 == 3) {
                this.f45997c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            this.h.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            v9Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.f46005s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f46005s.setImageResource(R.drawable.qr_flashlight);
            this.f46005s.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(60.0f), 587202559));
            v9Var.addView(this.f46005s);
            this.f46005s.setOnClickListener(new a(this, 10));
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            el0Var = ((LaunchActivity) parentActivity).f35562u1;
        } else {
            el0Var = null;
        }
        if (el0Var != null && this.f45993a == null) {
            f fVar = new f(el0Var, 29);
            el0Var.f39134b.add(fVar);
            el0Var.a();
            this.f45993a = fVar;
        }
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final void d0(android.graphics.Bitmap r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y9.d0(android.graphics.Bitmap):void");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (b0()) {
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45995b, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45997c, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D6));
        return arrayList;
    }

    public final k6.c h0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        k6.c cVar;
        k6.c cVar2;
        int i13;
        int i14;
        String str;
        PointF[] pointFArr;
        ec.d dVar;
        PointF[] pointFArr2;
        k6.c cVar3;
        PointF[] pointFArr3;
        PointF[] pointFArr4;
        k6.c cVar4 = null;
        try {
            RectF rectF = new RectF();
            s8.n nVar = this.V;
            float f7 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.f47982b.k()) {
                if (bitmap != null) {
                    cVar3 = new k6.c(28);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    cVar3.d = bitmap;
                    a3.l lVar = (a3.l) cVar3.f16406b;
                    lVar.f139a = width;
                    lVar.f140b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    cVar3 = new k6.c(28);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap != null) {
                        if (wrap.capacity() >= width2 * height2) {
                            cVar3.f16407c = wrap;
                            a3.l lVar2 = (a3.l) cVar3.f16406b;
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
                SparseArray e12 = this.V.e1(cVar3);
                if (e12.size() > 0) {
                    s8.m mVar = (s8.m) e12.valueAt(0);
                    str = mVar.f47973b;
                    Point[] pointArr = mVar.e;
                    PointF[] g02 = g0(pointArr, i13, i14);
                    pointFArr4 = g02;
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
                        pointFArr3 = g02;
                        cVar2 = null;
                        pointFArr = pointFArr3;
                    }
                    rectF = null;
                    pointFArr3 = pointFArr4;
                    cVar2 = null;
                    pointFArr = pointFArr3;
                } else {
                    if (bitmap != null) {
                        Bitmap a02 = a0(bitmap);
                        bitmap.recycle();
                        k6.c cVar5 = new k6.c(28);
                        int width3 = a02.getWidth();
                        int height3 = a02.getHeight();
                        cVar5.d = a02;
                        a3.l lVar3 = (a3.l) cVar5.f16406b;
                        lVar3.f139a = width3;
                        lVar3.f140b = height3;
                        i13 = a02.getWidth();
                        i14 = a02.getHeight();
                        SparseArray e13 = this.V.e1(cVar5);
                        if (e13.size() > 0) {
                            s8.m mVar2 = (s8.m) e13.valueAt(0);
                            str = mVar2.f47973b;
                            Point[] pointArr2 = mVar2.e;
                            PointF[] g03 = g0(pointArr2, i13, i14);
                            if (pointArr2.length == 0) {
                                pointFArr4 = g03;
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
                                pointFArr3 = g03;
                            }
                        } else {
                            Bitmap c02 = c0(a02);
                            a02.recycle();
                            k6.c cVar6 = new k6.c(28);
                            int width4 = c02.getWidth();
                            int height4 = c02.getHeight();
                            cVar6.d = c02;
                            a3.l lVar4 = (a3.l) cVar6.f16406b;
                            lVar4.f139a = width4;
                            lVar4.f140b = height4;
                            int width5 = a02.getWidth();
                            int height5 = a02.getHeight();
                            SparseArray e14 = this.V.e1(cVar6);
                            if (e14.size() > 0) {
                                s8.m mVar3 = (s8.m) e14.valueAt(0);
                                String str2 = mVar3.f47973b;
                                Point[] pointArr3 = mVar3.e;
                                PointF[] g04 = g0(pointArr3, width5, height5);
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
                                pointFArr3 = g04;
                            } else {
                                i13 = width5;
                                i14 = height5;
                            }
                        }
                        cVar2 = null;
                        pointFArr = pointFArr3;
                    }
                    str = null;
                    pointFArr3 = null;
                    cVar2 = null;
                    pointFArr = pointFArr3;
                }
            } else if (this.U != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new ec.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                    i13 = width6;
                } else {
                    ec.f fVar = new ec.f(size.getWidth(), size.getHeight(), i10, i11, i12, i12);
                    i13 = size.getWidth();
                    i14 = size.getHeight();
                    dVar = fVar;
                }
                a8.h0 M = this.U.M(new n4.s(new fc.e(dVar), 15));
                ec.j[] jVarArr = (ec.j[]) M.f512c;
                String str3 = (String) M.f511b;
                if (jVarArr == null || jVarArr.length == 0) {
                    cVar2 = null;
                    pointFArr2 = null;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f17 = Float.MIN_VALUE;
                    float f18 = Float.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < length4) {
                        ec.j jVar = jVarArr[i16];
                        float f19 = jVar.f9892a;
                        cVar = cVar4;
                        try {
                            float f20 = jVar.f9893b;
                            f10 = Math.min(f10, f19);
                            f7 = Math.max(f7, jVar.f9892a);
                            f18 = Math.min(f18, f20);
                            f17 = Math.max(f17, f20);
                            i16++;
                            cVar4 = cVar;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new p9(this, 6));
                            return cVar;
                        }
                    }
                    cVar2 = cVar4;
                    rectF.set(f10, f18, f7, f17);
                    if (jVarArr.length == 4) {
                        pointFArr2 = new PointF[4];
                        while (i15 < 4) {
                            ec.j jVar2 = jVarArr[i15];
                            pointFArr2[i15] = new PointF(jVar2.f9892a / i13, jVar2.f9893b / i14);
                            i15++;
                        }
                    } else {
                        pointFArr2 = cVar2;
                    }
                }
                str = str3;
                pointFArr = pointFArr2;
            } else {
                cVar2 = null;
                i13 = 1;
                i14 = 1;
                str = null;
                pointFArr = null;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new p9(this, 6));
                return cVar2;
            } else if (this.W == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new p9(this, 6));
                return cVar2;
            } else {
                k6.c cVar7 = new k6.c(16, false);
                if (rectF != null) {
                    float dp = AndroidUtilities.dp(25.0f);
                    float dp2 = AndroidUtilities.dp(15.0f);
                    rectF.set(rectF.left - dp, rectF.top - dp2, rectF.right + dp, rectF.bottom + dp2);
                    float f21 = i13;
                    float f22 = i14;
                    rectF.set(rectF.left / f21, rectF.top / f22, rectF.right / f21, rectF.bottom / f22);
                }
                cVar7.d = pointFArr;
                cVar7.f16406b = rectF;
                cVar7.f16407c = str;
                return cVar7;
            }
        } catch (Throwable unused2) {
            cVar = null;
        }
    }

    public final void i0() {
        int height;
        if (this.f45998c0 == null) {
            this.f45998c0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, height) / 1.5f);
        float f7 = width;
        float height2 = this.fragmentView.getHeight();
        this.f45998c0.set(((width - min) / 2.0f) / f7, ((height - min) / 2.0f) / height2, ((width + min) / 2.0f) / f7, ((height + min) / 2.0f) / height2);
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
                k6.c h02 = h0(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
                if (h02 != null) {
                    x9 x9Var = this.M;
                    if (x9Var != null) {
                        x9Var.H((String) h02.f16407c);
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
        f fVar = this.f45993a;
        if (fVar != null) {
            el0 el0Var = (el0) fVar.f39224b;
            if (el0Var.f39134b.remove(fVar)) {
                el0Var.a();
            }
            this.f45993a = null;
        }
        s8.n nVar = this.V;
        if (nVar != null) {
            nVar.X0();
        }
    }
}

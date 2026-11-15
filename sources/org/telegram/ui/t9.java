package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class t9 extends org.telegram.ui.ActionBar.e2 {
    public r1.g E;
    public float F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final PointF[] J;
    public final RectF K;
    public final RectF L;
    public long M;
    public s9 N;
    public boolean O;
    public long P;
    public int Q;
    public int R;
    public String S;
    public final int T;
    public boolean U;
    public cb.c V;
    public u8.n W;
    public final int X;
    public ValueAnimator Y;
    public float Z;
    public f f51492a;
    public float f51493a0;
    public r9 f51494b;
    public r1.g f51495b0;
    public TextView f51496c;
    public float f51497c0;
    public CameraView d;
    public RectF f51498d0;
    public final HandlerThread f51499e;
    public final m4 f51500e0;
    public Handler f51501f;
    public float f51502f0;
    public long f51503g0;
    public TextView h;
    public final Paint f51504n;
    public final Paint f51505r;
    public ImageView f51506s;
    public AnimatorSet f51507w;
    public float f51508x;
    public boolean f51509y;

    public t9(int i7) {
        super(null);
        this.f51499e = new HandlerThread("ScanCamera");
        this.f51504n = new Paint();
        this.f51505r = new Paint(1);
        new Path();
        this.f51508x = 0.5f;
        this.f51509y = false;
        this.E = null;
        this.F = 0.0f;
        this.G = new PointF[4];
        this.H = new PointF[4];
        this.I = new PointF[4];
        this.J = new PointF[4];
        for (int i10 = 0; i10 < 4; i10++) {
            this.G[i10] = new PointF(-1.0f, -1.0f);
            this.H[i10] = new PointF(-1.0f, -1.0f);
            this.I[i10] = new PointF(-1.0f, -1.0f);
            this.J[i10] = new PointF(-1.0f, -1.0f);
        }
        this.K = new RectF();
        this.L = new RectF();
        this.M = 0L;
        this.Q = 0;
        this.R = 0;
        this.U = false;
        this.V = null;
        this.W = null;
        this.Z = 0.0f;
        this.f51493a0 = 0.0f;
        this.f51497c0 = 0.0f;
        this.f51500e0 = new m4(this, 2);
        this.f51502f0 = 0.0f;
        this.f51503g0 = 0L;
        this.X = i7;
        if (f0()) {
            Utilities.f22416e.c(new j9(this, 5));
        }
        int o4 = org.telegram.messenger.gz.o();
        if (o4 != 0) {
            if (o4 != 1) {
                this.T = 40;
                return;
            } else {
                this.T = 24;
                return;
            }
        }
        this.T = 8;
    }

    public static Bitmap e0(Bitmap bitmap) {
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

    public static Bitmap g0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f10 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void i0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static o9 j0(Activity activity, int i7, s9 s9Var) {
        if (activity == null) {
            return null;
        }
        o9 o9Var = new o9(activity, new org.telegram.ui.ActionBar.o4[]{new ActionBarLayout(activity, false)}, i7, s9Var);
        o9Var.G0(false);
        org.telegram.messenger.g0.n3(o9Var, false);
        org.telegram.messenger.g0.t3(o9Var, -16777216, false, null);
        o9Var.G0(false);
        o9Var.getWindow().addFlags(512);
        o9Var.show();
        return o9Var;
    }

    public static PointF[] k0(Point[] pointArr, int i7, int i10) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i11 = 0; i11 < pointArr.length; i11++) {
            Point point = pointArr[i11];
            pointFArr[i11] = new PointF(point.x / i7, point.y / i10);
        }
        return pointFArr;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        boolean z10 = this.f51509y;
        int i7 = this.X;
        ei0 ei0Var = null;
        if (z10) {
            this.actionBar.H(-1, false);
            this.actionBar.F(-1, false);
            this.actionBar.setTitleColor(-1);
        } else if (i7 == 0) {
            org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, org.telegram.ui.ActionBar.j6.f29260z6, null);
            org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.f29167u8, null);
            org.telegram.ui.ActionBar.q6.l(this.actionBar, 5, org.telegram.ui.ActionBar.j6.A8, null);
        } else {
            this.actionBar.H(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29260z6, false), false);
            this.actionBar.F(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29167u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!org.telegram.messenger.g0.Q1() && !f0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.J && kVar.f29322w == null) {
                View view = new View(kVar.getContext());
                kVar.f29322w = view;
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f29224x8, view, kVar.K0);
                kVar.addView(kVar.f29322w);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.f29322w.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.f23603m;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.f29322w.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new p9(this, 0));
        this.f51504n.setColor(2130706432);
        Paint paint = this.f51505r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        q9 q9Var = new q9(this, context);
        q9Var.setOnTouchListener(new gi.a(2));
        this.fragmentView = q9Var;
        if (f0()) {
            this.fragmentView.postDelayed(new j9(this, 0), 450L);
        } else {
            d0();
        }
        if (i7 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
            org.telegram.ui.ActionBar.q6.h(i10, kVar2, null);
            org.telegram.ui.ActionBar.q6.h(i10, this.fragmentView, null);
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.H(-1, false);
            this.actionBar.F(587202559, false);
            q9Var.setBackgroundColor(-16777216);
            q9Var.addView(this.actionBar);
        }
        if (i7 == 2 || i7 == 3) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131753885, null));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.u70.c());
        paint2.setColor(i0.a.o(-1, 40));
        r9 r9Var = new r9(context, paint2);
        this.f51494b = r9Var;
        r9Var.setGravity(1);
        this.f51494b.setTextSize(1, 24.0f);
        q9Var.addView(this.f51494b);
        TextView textView = new TextView(context);
        this.f51496c = textView;
        if (i7 == 3) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.D6, false));
        } else {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.D6, null);
        }
        this.f51496c.setGravity(1);
        this.f51496c.setTextSize(1, 16.0f);
        q9Var.addView(this.f51496c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (i7 == 0) {
            this.f51494b.setText(org.telegram.messenger.hd.M0(2131747470, null));
            this.f51496c.setText(org.telegram.messenger.hd.M0(2131747469, null));
            org.telegram.ui.ActionBar.q6.U(this.f51494b, org.telegram.ui.ActionBar.j6.G6, null);
            this.h.setTypeface(Typeface.MONOSPACE);
        } else {
            if (i7 != 1 && i7 != 3) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131753888, null));
                String[] strArr = {org.telegram.messenger.hd.M0(2131753893, null), org.telegram.messenger.hd.M0(2131753883, null)};
                int i11 = 0;
                for (int i12 = 2; i11 < i12; i12 = 2) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i13 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i13);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.f51494b.setMovementMethod(new org.telegram.messenger.c0(false));
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i13, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.f41(strArr[i11], 0), i13, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), i13, indexOf2, 33);
                    i11++;
                }
                this.f51494b.setLinkTextColor(-1);
                this.f51494b.setTextSize(1, 16.0f);
                this.f51494b.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                this.f51494b.setPadding(0, 0, 0, 0);
                this.f51494b.setText(spannableStringBuilder);
            } else {
                this.f51494b.setText(org.telegram.messenger.hd.M0(2131753885, null));
            }
            this.f51494b.setTextColor(-1);
            if (i7 == 3) {
                this.f51496c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
            ei0Var = null;
            this.h.setText(org.telegram.messenger.hd.M0(2131753887, null));
            q9Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.f51506s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f51506s.setImageResource(2131232630);
            this.f51506s.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(60.0f), 587202559));
            q9Var.addView(this.f51506s);
            this.f51506s.setOnClickListener(new a(this, 10));
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            ei0Var = ((LaunchActivity) parentActivity).f42658t1;
        }
        if (ei0Var != null && this.f51492a == null) {
            f fVar = new f(ei0Var, 27);
            ei0Var.f46796b.add(fVar);
            ei0Var.a();
            this.f51492a = fVar;
        }
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final void d0() {
        TextView textView;
        if (this.fragmentView != null && CameraView.isCameraAllowed()) {
            CameraController.getInstance().initCamera(null);
            CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
            this.d = cameraView;
            cameraView.setUseMaxPreview(true);
            this.d.setOptimizeForBarcode(true);
            this.d.setDelegate(new w0(this, 13));
            ((ViewGroup) this.fragmentView).addView(this.d, 0, c8.ja.c(-1.0f, -1));
            if (this.X == 0 && (textView = this.h) != null) {
                this.d.addView(textView);
            }
        }
    }

    public final boolean f0() {
        int i7 = this.X;
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (f0()) {
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51494b, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51496c, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D6));
        return arrayList;
    }

    public final void h0(android.graphics.Bitmap r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t9.h0(android.graphics.Bitmap):void");
    }

    public final h6.m l0(Size size, int i7, int i10, int i11, Bitmap bitmap) {
        h6.m mVar;
        h6.m mVar2;
        int i12;
        int i13;
        String str;
        PointF[] pointFArr;
        bc.d dVar;
        PointF[] pointFArr2;
        ld0 ld0Var;
        PointF[] pointFArr3;
        PointF[] pointFArr4;
        h6.m mVar3 = null;
        try {
            RectF rectF = new RectF();
            u8.n nVar = this.W;
            float f10 = Float.MIN_VALUE;
            float f11 = Float.MAX_VALUE;
            int i14 = 0;
            if (nVar != null && nVar.f57960b.k()) {
                if (bitmap != null) {
                    ld0Var = new ld0(18);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    ld0Var.d = bitmap;
                    b7.d dVar2 = (b7.d) ld0Var.f48976b;
                    dVar2.f2945a = width;
                    dVar2.f2946b = height;
                    i12 = bitmap.getWidth();
                    i13 = bitmap.getHeight();
                } else {
                    ld0Var = new ld0(18);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap != null) {
                        if (wrap.capacity() >= width2 * height2) {
                            ld0Var.f48977c = wrap;
                            b7.d dVar3 = (b7.d) ld0Var.f48976b;
                            dVar3.f2945a = width2;
                            dVar3.f2946b = height2;
                            i12 = size.getWidth();
                            i13 = size.getWidth();
                        } else {
                            throw new IllegalArgumentException("Invalid image data size.");
                        }
                    } else {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                }
                SparseArray e12 = this.W.e1(ld0Var);
                if (e12.size() > 0) {
                    u8.m mVar4 = (u8.m) e12.valueAt(0);
                    str = mVar4.f57950b;
                    Point[] pointArr = mVar4.f57952e;
                    PointF[] k02 = k0(pointArr, i12, i13);
                    pointFArr4 = k02;
                    if (pointArr.length != 0) {
                        int length = pointArr.length;
                        float f12 = Float.MIN_VALUE;
                        float f13 = Float.MAX_VALUE;
                        while (i14 < length) {
                            Point point = pointArr[i14];
                            f11 = Math.min(f11, point.x);
                            f10 = Math.max(f10, point.x);
                            f13 = Math.min(f13, point.y);
                            f12 = Math.max(f12, point.y);
                            i14++;
                        }
                        rectF.set(f11, f13, f10, f12);
                        pointFArr3 = k02;
                        mVar2 = null;
                        pointFArr = pointFArr3;
                    }
                    rectF = null;
                    pointFArr3 = pointFArr4;
                    mVar2 = null;
                    pointFArr = pointFArr3;
                } else {
                    if (bitmap != null) {
                        Bitmap e02 = e0(bitmap);
                        bitmap.recycle();
                        ld0 ld0Var2 = new ld0(18);
                        int width3 = e02.getWidth();
                        int height3 = e02.getHeight();
                        ld0Var2.d = e02;
                        b7.d dVar4 = (b7.d) ld0Var2.f48976b;
                        dVar4.f2945a = width3;
                        dVar4.f2946b = height3;
                        i12 = e02.getWidth();
                        i13 = e02.getHeight();
                        SparseArray e13 = this.W.e1(ld0Var2);
                        if (e13.size() > 0) {
                            u8.m mVar5 = (u8.m) e13.valueAt(0);
                            str = mVar5.f57950b;
                            Point[] pointArr2 = mVar5.f57952e;
                            PointF[] k03 = k0(pointArr2, i12, i13);
                            if (pointArr2.length == 0) {
                                pointFArr4 = k03;
                                rectF = null;
                                pointFArr3 = pointFArr4;
                            } else {
                                int length2 = pointArr2.length;
                                float f14 = Float.MIN_VALUE;
                                float f15 = Float.MAX_VALUE;
                                while (i14 < length2) {
                                    Point point2 = pointArr2[i14];
                                    f11 = Math.min(f11, point2.x);
                                    f10 = Math.max(f10, point2.x);
                                    f15 = Math.min(f15, point2.y);
                                    f14 = Math.max(f14, point2.y);
                                    i14++;
                                }
                                rectF.set(f11, f15, f10, f14);
                                pointFArr3 = k03;
                            }
                        } else {
                            Bitmap g02 = g0(e02);
                            e02.recycle();
                            ld0 ld0Var3 = new ld0(18);
                            int width4 = g02.getWidth();
                            int height4 = g02.getHeight();
                            ld0Var3.d = g02;
                            b7.d dVar5 = (b7.d) ld0Var3.f48976b;
                            dVar5.f2945a = width4;
                            dVar5.f2946b = height4;
                            int width5 = e02.getWidth();
                            int height5 = e02.getHeight();
                            SparseArray e14 = this.W.e1(ld0Var3);
                            if (e14.size() > 0) {
                                u8.m mVar6 = (u8.m) e14.valueAt(0);
                                String str2 = mVar6.f57950b;
                                Point[] pointArr3 = mVar6.f57952e;
                                PointF[] k04 = k0(pointArr3, width5, height5);
                                if (pointArr3.length == 0) {
                                    rectF = null;
                                } else {
                                    int length3 = pointArr3.length;
                                    float f16 = Float.MIN_VALUE;
                                    float f17 = Float.MAX_VALUE;
                                    while (i14 < length3) {
                                        Point point3 = pointArr3[i14];
                                        f11 = Math.min(f11, point3.x);
                                        f10 = Math.max(f10, point3.x);
                                        f17 = Math.min(f17, point3.y);
                                        f16 = Math.max(f16, point3.y);
                                        i14++;
                                    }
                                    rectF.set(f11, f17, f10, f16);
                                }
                                i13 = height5;
                                str = str2;
                                i12 = width5;
                                pointFArr3 = k04;
                            } else {
                                i12 = width5;
                                i13 = height5;
                            }
                        }
                        mVar2 = null;
                        pointFArr = pointFArr3;
                    }
                    str = null;
                    pointFArr3 = null;
                    mVar2 = null;
                    pointFArr = pointFArr3;
                }
            } else if (this.V != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new bc.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i13 = bitmap.getHeight();
                    i12 = width6;
                } else {
                    bc.f fVar = new bc.f(size.getWidth(), size.getHeight(), i7, i10, i11, i11);
                    i12 = size.getWidth();
                    i13 = size.getHeight();
                    dVar = fVar;
                }
                android.support.v4.media.session.a0 p10 = this.V.p(new wf.b(new cc.g(dVar), 6));
                bc.j[] jVarArr = (bc.j[]) p10.f1707c;
                String str3 = (String) p10.f1706b;
                if (jVarArr == null || jVarArr.length == 0) {
                    mVar2 = null;
                    pointFArr2 = null;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f18 = Float.MIN_VALUE;
                    float f19 = Float.MAX_VALUE;
                    int i15 = 0;
                    while (i15 < length4) {
                        bc.j jVar = jVarArr[i15];
                        float f20 = jVar.f3135a;
                        mVar = mVar3;
                        try {
                            float f21 = jVar.f3136b;
                            f11 = Math.min(f11, f20);
                            f10 = Math.max(f10, jVar.f3135a);
                            f19 = Math.min(f19, f21);
                            f18 = Math.max(f18, f21);
                            i15++;
                            mVar3 = mVar;
                        } catch (Throwable unused) {
                            org.telegram.messenger.g0.h3(new j9(this, 6));
                            return mVar;
                        }
                    }
                    mVar2 = mVar3;
                    rectF.set(f11, f19, f10, f18);
                    if (jVarArr.length == 4) {
                        pointFArr2 = new PointF[4];
                        while (i14 < 4) {
                            bc.j jVar2 = jVarArr[i14];
                            pointFArr2[i14] = new PointF(jVar2.f3135a / i12, jVar2.f3136b / i13);
                            i14++;
                        }
                    } else {
                        pointFArr2 = mVar2;
                    }
                }
                str = str3;
                pointFArr = pointFArr2;
            } else {
                mVar2 = null;
                i12 = 1;
                i13 = 1;
                str = null;
                pointFArr = null;
            }
            if (TextUtils.isEmpty(str)) {
                org.telegram.messenger.g0.h3(new j9(this, 6));
                return mVar2;
            } else if (this.X == 2 && !str.startsWith("tg://login?token=")) {
                org.telegram.messenger.g0.h3(new j9(this, 6));
                return mVar2;
            } else {
                h6.m mVar7 = new h6.m(23, false);
                if (rectF != null) {
                    float L = org.telegram.messenger.g0.L(25.0f);
                    float L2 = org.telegram.messenger.g0.L(15.0f);
                    rectF.set(rectF.left - L, rectF.top - L2, rectF.right + L, rectF.bottom + L2);
                    float f22 = i12;
                    float f23 = i13;
                    rectF.set(rectF.left / f22, rectF.top / f23, rectF.right / f22, rectF.bottom / f23);
                }
                mVar7.d = pointFArr;
                mVar7.f13625c = rectF;
                mVar7.f13624b = str;
                return mVar7;
            }
        } catch (Throwable unused2) {
            mVar = null;
        }
    }

    public final void m0() {
        int height;
        if (this.f51498d0 == null) {
            this.f51498d0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, height) / 1.5f);
        float f10 = width;
        float height2 = this.fragmentView.getHeight();
        this.f51498d0.set(((width - min) / 2.0f) / f10, ((height - min) / 2.0f) / height2, ((width + min) / 2.0f) / f10, ((height + min) / 2.0f) / height2);
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        Point c12;
        if (i10 == -1 && i7 == 11 && intent != null && intent.getData() != null) {
            try {
                c12 = org.telegram.messenger.g0.c1();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                h6.m l02 = l0(null, 0, 0, 0, org.telegram.messenger.fc.K(null, intent.getData(), c12.x, c12.y, true));
                if (l02 != null) {
                    s9 s9Var = this.N;
                    if (s9Var != null) {
                        s9Var.M((String) l02.f13624b);
                    }
                    finishFragment();
                }
            } catch (Throwable th3) {
                th = th3;
                org.telegram.messenger.a8.g(th, true);
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
        this.f51499e.quitSafely();
        f fVar = this.f51492a;
        if (fVar != null) {
            ei0 ei0Var = (ei0) fVar.f46946b;
            if (ei0Var.f46796b.remove(fVar)) {
                ei0Var.a();
            }
            this.f51492a = null;
        }
        u8.n nVar = this.W;
        if (nVar != null) {
            nVar.X0();
        }
    }
}

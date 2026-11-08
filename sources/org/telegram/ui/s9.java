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
public class s9 extends org.telegram.ui.ActionBar.f2 {
    public r1.g D;
    public float E;
    public final PointF[] F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final RectF J;
    public final RectF K;
    public long L;
    public r9 M;
    public boolean N;
    public long O;
    public int P;
    public int Q;
    public String R;
    public final int S;
    public boolean T;
    public aa.n U;
    public u8.n V;
    public final int W;
    public ValueAnimator X;
    public float Y;
    public float Z;
    public f f49663a;
    public r1.g f49664a0;
    public q9 f49665b;
    public float f49666b0;
    public TextView f49667c;
    public RectF f49668c0;
    public CameraView d;
    public final m4 f49669d0;
    public final HandlerThread f49670e;
    public float f49671e0;
    public Handler f49672f;
    public long f49673f0;
    public TextView h;
    public final Paint f49674n;
    public final Paint f49675r;
    public ImageView f49676s;
    public AnimatorSet f49677w;
    public float f49678x;
    public boolean f49679y;

    public s9(int i7) {
        super(null);
        this.f49670e = new HandlerThread("ScanCamera");
        this.f49674n = new Paint();
        this.f49675r = new Paint(1);
        new Path();
        this.f49678x = 0.5f;
        this.f49679y = false;
        this.D = null;
        this.E = 0.0f;
        this.F = new PointF[4];
        this.G = new PointF[4];
        this.H = new PointF[4];
        this.I = new PointF[4];
        for (int i10 = 0; i10 < 4; i10++) {
            this.F[i10] = new PointF(-1.0f, -1.0f);
            this.G[i10] = new PointF(-1.0f, -1.0f);
            this.H[i10] = new PointF(-1.0f, -1.0f);
            this.I[i10] = new PointF(-1.0f, -1.0f);
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
        this.f49666b0 = 0.0f;
        this.f49669d0 = new m4(this, 2);
        this.f49671e0 = 0.0f;
        this.f49673f0 = 0L;
        this.W = i7;
        if (f0()) {
            Utilities.f21336e.c(new j9(this, 5));
        }
        int o4 = org.telegram.messenger.iz.o();
        if (o4 != 0) {
            if (o4 != 1) {
                this.S = 40;
                return;
            } else {
                this.S = 24;
                return;
            }
        }
        this.S = 8;
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

    public static o9 j0(Activity activity, int i7, r9 r9Var) {
        if (activity == null) {
            return null;
        }
        o9 o9Var = new o9(activity, new org.telegram.ui.ActionBar.q4[]{new ActionBarLayout(activity, false)}, i7, r9Var);
        o9Var.G0(false);
        org.telegram.messenger.g0.n3(o9Var, false);
        org.telegram.messenger.g0.u3(o9Var, -16777216, false, null);
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
        boolean z9 = this.f49679y;
        int i7 = this.W;
        ci0 ci0Var = null;
        if (z9) {
            this.actionBar.D(-1, false);
            this.actionBar.C(-1, false);
            this.actionBar.setTitleColor(-1);
        } else if (i7 == 0) {
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.f28262z6, null);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f28170u8, null);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, org.telegram.ui.ActionBar.k6.A8, null);
        } else {
            this.actionBar.D(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28262z6, false), false);
            this.actionBar.C(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28170u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!org.telegram.messenger.g0.Q1() && !f0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.I && kVar.f27699w == null) {
                View view = new View(kVar.getContext());
                kVar.f27699w = view;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f28227x8, view, kVar.J0);
                kVar.addView(kVar.f27699w);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.f27699w.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.f22557m;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.f27699w.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 29));
        this.f49674n.setColor(2130706432);
        Paint paint = this.f49675r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        p9 p9Var = new p9(this, context);
        p9Var.setOnTouchListener(new ei.b(2));
        this.fragmentView = p9Var;
        if (f0()) {
            this.fragmentView.postDelayed(new j9(this, 0), 450L);
        } else {
            d0();
        }
        if (i7 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.k6.f27852d6;
            org.telegram.ui.ActionBar.r6.i(i10, kVar2, null);
            org.telegram.ui.ActionBar.r6.i(i10, this.fragmentView, null);
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.D(-1, false);
            this.actionBar.C(587202559, false);
            p9Var.setBackgroundColor(-16777216);
            p9Var.addView(this.actionBar);
        }
        if (i7 == 2 || i7 == 3) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131753885, null));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.r70.c());
        paint2.setColor(i0.a.o(-1, 40));
        q9 q9Var = new q9(context, paint2);
        this.f49665b = q9Var;
        q9Var.setGravity(1);
        this.f49665b.setTextSize(1, 24.0f);
        p9Var.addView(this.f49665b);
        TextView textView = new TextView(context);
        this.f49667c = textView;
        if (i7 == 3) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        } else {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.D6, null);
        }
        this.f49667c.setGravity(1);
        this.f49667c.setTextSize(1, 16.0f);
        p9Var.addView(this.f49667c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (i7 == 0) {
            this.f49665b.setText(org.telegram.messenger.id.M0(2131747471, null));
            this.f49667c.setText(org.telegram.messenger.id.M0(2131747470, null));
            org.telegram.ui.ActionBar.r6.V(this.f49665b, org.telegram.ui.ActionBar.k6.G6, null);
            this.h.setTypeface(Typeface.MONOSPACE);
        } else {
            if (i7 != 1 && i7 != 3) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131753888, null));
                String[] strArr = {org.telegram.messenger.id.M0(2131753893, null), org.telegram.messenger.id.M0(2131753883, null)};
                int i11 = 0;
                for (int i12 = 2; i11 < i12; i12 = 2) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i13 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i13);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.f49665b.setMovementMethod(new org.telegram.messenger.c0(false));
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i13, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.b41(strArr[i11], 0), i13, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), i13, indexOf2, 33);
                    i11++;
                }
                this.f49665b.setLinkTextColor(-1);
                this.f49665b.setTextSize(1, 16.0f);
                this.f49665b.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                this.f49665b.setPadding(0, 0, 0, 0);
                this.f49665b.setText(spannableStringBuilder);
            } else {
                this.f49665b.setText(org.telegram.messenger.id.M0(2131753885, null));
            }
            this.f49665b.setTextColor(-1);
            if (i7 == 3) {
                this.f49667c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
            ci0Var = null;
            this.h.setText(org.telegram.messenger.id.M0(2131753887, null));
            p9Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.f49676s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f49676s.setImageResource(2131232629);
            this.f49676s.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(60.0f), 587202559));
            p9Var.addView(this.f49676s);
            this.f49676s.setOnClickListener(new a(this, 10));
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            ci0Var = ((LaunchActivity) parentActivity).f41288s1;
        }
        if (ci0Var != null && this.f49663a == null) {
            f fVar = new f(ci0Var, 27);
            ci0Var.f44846b.add(fVar);
            ci0Var.a();
            this.f49663a = fVar;
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
            ((ViewGroup) this.fragmentView).addView(this.d, 0, c8.ha.c(-1.0f, -1));
            if (this.W == 0 && (textView = this.h) != null) {
                this.d.addView(textView);
            }
        }
    }

    public final boolean f0() {
        int i7 = this.W;
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
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49665b, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49667c, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        return arrayList;
    }

    public final void h0(android.graphics.Bitmap r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s9.h0(android.graphics.Bitmap):void");
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
        hy0 hy0Var;
        PointF[] pointFArr3;
        PointF[] pointFArr4;
        h6.m mVar3 = null;
        try {
            RectF rectF = new RectF();
            u8.n nVar = this.V;
            float f10 = Float.MIN_VALUE;
            float f11 = Float.MAX_VALUE;
            int i14 = 0;
            if (nVar != null && nVar.f56449b.k()) {
                if (bitmap != null) {
                    hy0Var = new hy0(17);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    hy0Var.d = bitmap;
                    b7.d dVar2 = (b7.d) hy0Var.f46526b;
                    dVar2.f2991a = width;
                    dVar2.f2992b = height;
                    i12 = bitmap.getWidth();
                    i13 = bitmap.getHeight();
                } else {
                    hy0Var = new hy0(17);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap != null) {
                        if (wrap.capacity() >= width2 * height2) {
                            hy0Var.f46527c = wrap;
                            b7.d dVar3 = (b7.d) hy0Var.f46526b;
                            dVar3.f2991a = width2;
                            dVar3.f2992b = height2;
                            i12 = size.getWidth();
                            i13 = size.getWidth();
                        } else {
                            throw new IllegalArgumentException("Invalid image data size.");
                        }
                    } else {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                }
                SparseArray e12 = this.V.e1(hy0Var);
                if (e12.size() > 0) {
                    u8.m mVar4 = (u8.m) e12.valueAt(0);
                    str = mVar4.f56439b;
                    Point[] pointArr = mVar4.f56441e;
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
                        hy0 hy0Var2 = new hy0(17);
                        int width3 = e02.getWidth();
                        int height3 = e02.getHeight();
                        hy0Var2.d = e02;
                        b7.d dVar4 = (b7.d) hy0Var2.f46526b;
                        dVar4.f2991a = width3;
                        dVar4.f2992b = height3;
                        i12 = e02.getWidth();
                        i13 = e02.getHeight();
                        SparseArray e13 = this.V.e1(hy0Var2);
                        if (e13.size() > 0) {
                            u8.m mVar5 = (u8.m) e13.valueAt(0);
                            str = mVar5.f56439b;
                            Point[] pointArr2 = mVar5.f56441e;
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
                            hy0 hy0Var3 = new hy0(17);
                            int width4 = g02.getWidth();
                            int height4 = g02.getHeight();
                            hy0Var3.d = g02;
                            b7.d dVar5 = (b7.d) hy0Var3.f46526b;
                            dVar5.f2991a = width4;
                            dVar5.f2992b = height4;
                            int width5 = e02.getWidth();
                            int height5 = e02.getHeight();
                            SparseArray e14 = this.V.e1(hy0Var3);
                            if (e14.size() > 0) {
                                u8.m mVar6 = (u8.m) e14.valueAt(0);
                                String str2 = mVar6.f56439b;
                                Point[] pointArr3 = mVar6.f56441e;
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
            } else if (this.U != null) {
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
                android.support.v4.media.session.a0 h = this.U.h(new wf.b(new cc.g(dVar), 7));
                bc.j[] jVarArr = (bc.j[]) h.f1764c;
                String str3 = (String) h.f1763b;
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
                        float f20 = jVar.f3180a;
                        mVar = mVar3;
                        try {
                            float f21 = jVar.f3181b;
                            f11 = Math.min(f11, f20);
                            f10 = Math.max(f10, jVar.f3180a);
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
                            pointFArr2[i14] = new PointF(jVar2.f3180a / i12, jVar2.f3181b / i13);
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
            } else if (this.W == 2 && !str.startsWith("tg://login?token=")) {
                org.telegram.messenger.g0.h3(new j9(this, 6));
                return mVar2;
            } else {
                h6.m mVar7 = new h6.m(22, false);
                if (rectF != null) {
                    float L = org.telegram.messenger.g0.L(25.0f);
                    float L2 = org.telegram.messenger.g0.L(15.0f);
                    rectF.set(rectF.left - L, rectF.top - L2, rectF.right + L, rectF.bottom + L2);
                    float f22 = i12;
                    float f23 = i13;
                    rectF.set(rectF.left / f22, rectF.top / f23, rectF.right / f22, rectF.bottom / f23);
                }
                mVar7.d = pointFArr;
                mVar7.f14265c = rectF;
                mVar7.f14264b = str;
                return mVar7;
            }
        } catch (Throwable unused2) {
            mVar = null;
        }
    }

    public final void m0() {
        int height;
        if (this.f49668c0 == null) {
            this.f49668c0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, height) / 1.5f);
        float f10 = width;
        float height2 = this.fragmentView.getHeight();
        this.f49668c0.set(((width - min) / 2.0f) / f10, ((height - min) / 2.0f) / height2, ((width + min) / 2.0f) / f10, ((height + min) / 2.0f) / height2);
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
                h6.m l02 = l0(null, 0, 0, 0, org.telegram.messenger.gc.K(null, intent.getData(), c12.x, c12.y, true));
                if (l02 != null) {
                    r9 r9Var = this.M;
                    if (r9Var != null) {
                        r9Var.M((String) l02.f14264b);
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
        this.f49670e.quitSafely();
        f fVar = this.f49663a;
        if (fVar != null) {
            ci0 ci0Var = (ci0) fVar.f45409b;
            if (ci0Var.f44846b.remove(fVar)) {
                ci0Var.a();
            }
            this.f49663a = null;
        }
        u8.n nVar = this.V;
        if (nVar != null) {
            nVar.X0();
        }
    }
}

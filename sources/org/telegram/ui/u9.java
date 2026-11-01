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
public class u9 extends org.telegram.ui.ActionBar.k2 {
    public o1.j D;
    public float E;
    public final PointF[] F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final RectF J;
    public final RectF K;
    public long L;
    public t9 M;
    public boolean N;
    public long O;
    public int P;
    public int Q;
    public String R;
    public final int S;
    public boolean T;
    public vh.w3 U;
    public r8.n V;
    public final int W;
    public ValueAnimator X;
    public float Y;
    public float Z;
    public e f41879a;
    public o1.j f41880a0;
    public r9 f41881b;
    public float f41882b0;
    public TextView f41883c;
    public RectF f41884c0;
    public CameraView d;
    public final m4 f41885d0;
    public final HandlerThread e;
    public float f41886e0;
    public Handler f41887f;
    public long f41888f0;
    public TextView h;
    public final Paint f41889n;
    public final Paint f41890r;
    public ImageView f41891s;
    public AnimatorSet f41892w;
    public float f41893x;
    public boolean f41894y;

    public u9(int i10) {
        super(null);
        this.e = new HandlerThread("ScanCamera");
        this.f41889n = new Paint();
        this.f41890r = new Paint(1);
        new Path();
        this.f41893x = 0.5f;
        this.f41894y = false;
        this.D = null;
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
        this.f41882b0 = 0.0f;
        this.f41885d0 = new m4(this, 2);
        this.f41886e0 = 0.0f;
        this.f41888f0 = 0L;
        this.W = i10;
        if (f0()) {
            Utilities.e.c(new k9(this, 5));
        }
        int o10 = org.telegram.messenger.uz.o();
        if (o10 != 0) {
            if (o10 != 1) {
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
        float f7 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void i0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static p9 j0(Activity activity, int i10, t9 t9Var) {
        if (activity == null) {
            return null;
        }
        p9 p9Var = new p9(activity, new org.telegram.ui.ActionBar.z4[]{new ActionBarLayout(activity, false)}, i10, t9Var);
        p9Var.G0(false);
        org.telegram.messenger.i0.m3(p9Var, false);
        org.telegram.messenger.i0.t3(p9Var, -16777216, false, null);
        p9Var.G0(false);
        p9Var.getWindow().addFlags(512);
        p9Var.show();
        return p9Var;
    }

    public static PointF[] k0(Point[] pointArr, int i10, int i11) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i12 = 0; i12 < pointArr.length; i12++) {
            Point point = pointArr[i12];
            pointFArr[i12] = new PointF(point.x / i10, point.y / i11);
        }
        return pointFArr;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231241);
        boolean z10 = this.f41894y;
        int i10 = this.W;
        ij0 ij0Var = null;
        if (z10) {
            this.actionBar.D(-1, false);
            this.actionBar.C(-1, false);
            this.actionBar.setTitleColor(-1);
        } else if (i10 == 0) {
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, org.telegram.ui.ActionBar.t6.f21331z6, null);
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.f21245u8, null);
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 5, org.telegram.ui.ActionBar.t6.A8, null);
        } else {
            this.actionBar.D(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21331z6, false), false);
            this.actionBar.C(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21245u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!org.telegram.messenger.i0.Q1() && !f0()) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar.I && lVar.f20518w == null) {
                View view = new View(lVar.getContext());
                lVar.f20518w = view;
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21298x8, view, lVar.J0);
                lVar.addView(lVar.f20518w);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lVar.f20518w.getLayoutParams();
                layoutParams.height = org.telegram.messenger.i0.f16166m;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                lVar.f20518w.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ag.e(this, 19));
        this.f41889n.setColor(2130706432);
        Paint paint = this.f41890r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        q9 q9Var = new q9(this, context);
        q9Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        this.fragmentView = q9Var;
        if (f0()) {
            this.fragmentView.postDelayed(new k9(this, 0), 450L);
        } else {
            d0();
        }
        if (i10 == 0) {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
            org.telegram.ui.ActionBar.a7.i(i11, lVar2, null);
            org.telegram.ui.ActionBar.a7.i(i11, this.fragmentView, null);
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
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131753885, null));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.k80.c());
        paint2.setColor(i0.b.o(-1, 40));
        r9 r9Var = new r9(context, paint2);
        this.f41881b = r9Var;
        r9Var.setGravity(1);
        this.f41881b.setTextSize(1, 24.0f);
        q9Var.addView(this.f41881b);
        TextView textView = new TextView(context);
        this.f41883c = textView;
        if (i10 == 3) {
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false));
        } else {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.D6, null);
        }
        this.f41883c.setGravity(1);
        this.f41883c.setTextSize(1, 16.0f);
        q9Var.addView(this.f41883c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (i10 == 0) {
            this.f41881b.setText(org.telegram.messenger.dd.L0(2131747486, null));
            this.f41883c.setText(org.telegram.messenger.dd.L0(2131747485, null));
            org.telegram.ui.ActionBar.a7.V(this.f41881b, org.telegram.ui.ActionBar.t6.G6, null);
            this.h.setTypeface(Typeface.MONOSPACE);
        } else {
            if (i10 != 1 && i10 != 3) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.dd.L0(2131753888, null));
                String[] strArr = {org.telegram.messenger.dd.L0(2131753893, null), org.telegram.messenger.dd.L0(2131753883, null)};
                int i12 = 0;
                for (int i13 = 2; i12 < i13; i13 = 2) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i14 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i14);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.f41881b.setMovementMethod(new org.telegram.messenger.e0(false));
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i14, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(strArr[i12], 0), i14, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.y41(org.telegram.messenger.i0.o()), i14, indexOf2, 33);
                    i12++;
                }
                this.f41881b.setLinkTextColor(-1);
                this.f41881b.setTextSize(1, 16.0f);
                this.f41881b.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                this.f41881b.setPadding(0, 0, 0, 0);
                this.f41881b.setText(spannableStringBuilder);
            } else {
                this.f41881b.setText(org.telegram.messenger.dd.L0(2131753885, null));
            }
            this.f41881b.setTextColor(-1);
            if (i10 == 3) {
                this.f41883c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
            ij0Var = null;
            this.h.setText(org.telegram.messenger.dd.L0(2131753887, null));
            q9Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.f41891s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f41891s.setImageResource(2131232626);
            this.f41891s.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(60.0f), 587202559));
            q9Var.addView(this.f41891s);
            this.f41891s.setOnClickListener(new a(this, 10));
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            ij0Var = ((LaunchActivity) parentActivity).f33393u1;
        }
        if (ij0Var != null && this.f41879a == null) {
            e eVar = new e(ij0Var, 27);
            ij0Var.f38097b.add(eVar);
            ij0Var.a();
            this.f41879a = eVar;
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
            this.d.setDelegate(new y0(this, 13));
            ((ViewGroup) this.fragmentView).addView(this.d, 0, w7.b6.c(-1.0f, -1));
            if (this.W == 0 && (textView = this.h) != null) {
                this.d.addView(textView);
            }
        }
    }

    public final boolean f0() {
        int i10 = this.W;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
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
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41881b, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41883c, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D6));
        return arrayList;
    }

    public final void h0(android.graphics.Bitmap r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u9.h0(android.graphics.Bitmap):void");
    }

    public final li.k l0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        li.k kVar;
        li.k kVar2;
        int i13;
        int i14;
        String str;
        PointF[] pointFArr;
        vb.d dVar;
        PointF[] pointFArr2;
        q5.d dVar2;
        PointF[] pointFArr3;
        PointF[] pointFArr4;
        li.k kVar3 = null;
        try {
            RectF rectF = new RectF();
            r8.n nVar = this.V;
            float f7 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.f46430b.k()) {
                if (bitmap != null) {
                    dVar2 = new q5.d(1);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    dVar2.d = bitmap;
                    a3.l lVar = (a3.l) dVar2.f45498b;
                    lVar.f139a = width;
                    lVar.f140b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    dVar2 = new q5.d(1);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap != null) {
                        if (wrap.capacity() >= width2 * height2) {
                            dVar2.f45499c = wrap;
                            a3.l lVar2 = (a3.l) dVar2.f45498b;
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
                SparseArray e12 = this.V.e1(dVar2);
                if (e12.size() > 0) {
                    r8.m mVar = (r8.m) e12.valueAt(0);
                    str = mVar.f46421b;
                    Point[] pointArr = mVar.e;
                    PointF[] k02 = k0(pointArr, i13, i14);
                    pointFArr4 = k02;
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
                        pointFArr3 = k02;
                        kVar2 = null;
                        pointFArr = pointFArr3;
                    }
                    rectF = null;
                    pointFArr3 = pointFArr4;
                    kVar2 = null;
                    pointFArr = pointFArr3;
                } else {
                    if (bitmap != null) {
                        Bitmap e02 = e0(bitmap);
                        bitmap.recycle();
                        q5.d dVar3 = new q5.d(1);
                        int width3 = e02.getWidth();
                        int height3 = e02.getHeight();
                        dVar3.d = e02;
                        a3.l lVar3 = (a3.l) dVar3.f45498b;
                        lVar3.f139a = width3;
                        lVar3.f140b = height3;
                        i13 = e02.getWidth();
                        i14 = e02.getHeight();
                        SparseArray e13 = this.V.e1(dVar3);
                        if (e13.size() > 0) {
                            r8.m mVar2 = (r8.m) e13.valueAt(0);
                            str = mVar2.f46421b;
                            Point[] pointArr2 = mVar2.e;
                            PointF[] k03 = k0(pointArr2, i13, i14);
                            if (pointArr2.length == 0) {
                                pointFArr4 = k03;
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
                                pointFArr3 = k03;
                            }
                        } else {
                            Bitmap g02 = g0(e02);
                            e02.recycle();
                            q5.d dVar4 = new q5.d(1);
                            int width4 = g02.getWidth();
                            int height4 = g02.getHeight();
                            dVar4.d = g02;
                            a3.l lVar4 = (a3.l) dVar4.f45498b;
                            lVar4.f139a = width4;
                            lVar4.f140b = height4;
                            int width5 = e02.getWidth();
                            int height5 = e02.getHeight();
                            SparseArray e14 = this.V.e1(dVar4);
                            if (e14.size() > 0) {
                                r8.m mVar3 = (r8.m) e14.valueAt(0);
                                String str2 = mVar3.f46421b;
                                Point[] pointArr3 = mVar3.e;
                                PointF[] k04 = k0(pointArr3, width5, height5);
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
                                pointFArr3 = k04;
                            } else {
                                i13 = width5;
                                i14 = height5;
                            }
                        }
                        kVar2 = null;
                        pointFArr = pointFArr3;
                    }
                    str = null;
                    pointFArr3 = null;
                    kVar2 = null;
                    pointFArr = pointFArr3;
                }
            } else if (this.U != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new vb.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                    i13 = width6;
                } else {
                    vb.f fVar = new vb.f(size.getWidth(), size.getHeight(), i10, i11, i12, i12);
                    i13 = size.getWidth();
                    i14 = size.getHeight();
                    dVar = fVar;
                }
                q5.d a2 = this.U.a(new u9.b(new wb.e(dVar)));
                vb.j[] jVarArr = (vb.j[]) a2.f45499c;
                String str3 = (String) a2.f45498b;
                if (jVarArr == null || jVarArr.length == 0) {
                    kVar2 = null;
                    pointFArr2 = null;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f17 = Float.MIN_VALUE;
                    float f18 = Float.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < length4) {
                        vb.j jVar = jVarArr[i16];
                        float f19 = jVar.f50780a;
                        kVar = kVar3;
                        try {
                            float f20 = jVar.f50781b;
                            f10 = Math.min(f10, f19);
                            f7 = Math.max(f7, jVar.f50780a);
                            f18 = Math.min(f18, f20);
                            f17 = Math.max(f17, f20);
                            i16++;
                            kVar3 = kVar;
                        } catch (Throwable unused) {
                            org.telegram.messenger.i0.g3(new k9(this, 6));
                            return kVar;
                        }
                    }
                    kVar2 = kVar3;
                    rectF.set(f10, f18, f7, f17);
                    if (jVarArr.length == 4) {
                        pointFArr2 = new PointF[4];
                        while (i15 < 4) {
                            vb.j jVar2 = jVarArr[i15];
                            pointFArr2[i15] = new PointF(jVar2.f50780a / i13, jVar2.f50781b / i14);
                            i15++;
                        }
                    } else {
                        pointFArr2 = kVar2;
                    }
                }
                str = str3;
                pointFArr = pointFArr2;
            } else {
                kVar2 = null;
                i13 = 1;
                i14 = 1;
                str = null;
                pointFArr = null;
            }
            if (TextUtils.isEmpty(str)) {
                org.telegram.messenger.i0.g3(new k9(this, 6));
                return kVar2;
            } else if (this.W == 2 && !str.startsWith("tg://login?token=")) {
                org.telegram.messenger.i0.g3(new k9(this, 6));
                return kVar2;
            } else {
                li.k kVar4 = new li.k(17, false);
                if (rectF != null) {
                    float L = org.telegram.messenger.i0.L(25.0f);
                    float L2 = org.telegram.messenger.i0.L(15.0f);
                    rectF.set(rectF.left - L, rectF.top - L2, rectF.right + L, rectF.bottom + L2);
                    float f21 = i13;
                    float f22 = i14;
                    rectF.set(rectF.left / f21, rectF.top / f22, rectF.right / f21, rectF.bottom / f22);
                }
                kVar4.d = pointFArr;
                kVar4.f12102c = rectF;
                kVar4.f12101b = str;
                return kVar4;
            }
        } catch (Throwable unused2) {
            kVar = null;
        }
    }

    public final void m0() {
        int height;
        if (this.f41884c0 == null) {
            this.f41884c0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, height) / 1.5f);
        float f7 = width;
        float height2 = this.fragmentView.getHeight();
        this.f41884c0.set(((width - min) / 2.0f) / f7, ((height - min) / 2.0f) / height2, ((width + min) / 2.0f) / f7, ((height + min) / 2.0f) / height2);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        Point c12;
        if (i11 == -1 && i10 == 11 && intent != null && intent.getData() != null) {
            try {
                c12 = org.telegram.messenger.i0.c1();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                li.k l02 = l0(null, 0, 0, 0, org.telegram.messenger.ic.K(null, intent.getData(), c12.x, c12.y, true));
                if (l02 != null) {
                    t9 t9Var = this.M;
                    if (t9Var != null) {
                        t9Var.L((String) l02.f12101b);
                    }
                    finishFragment();
                }
            } catch (Throwable th3) {
                th = th3;
                org.telegram.messenger.f8.g(th, true);
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
        e eVar = this.f41879a;
        if (eVar != null) {
            ij0 ij0Var = (ij0) eVar.f36703b;
            if (ij0Var.f38097b.remove(eVar)) {
                ij0Var.a();
            }
            this.f41879a = null;
        }
        r8.n nVar = this.V;
        if (nVar != null) {
            nVar.X0();
        }
    }
}

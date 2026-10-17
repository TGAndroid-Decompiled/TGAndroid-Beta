package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.StateSet;
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
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class y9 extends org.telegram.ui.ActionBar.n2 {
    public o1.k E;
    public float F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final PointF[] J;
    public final RectF K;
    public final RectF L;
    public long M;
    public x9 N;
    public boolean O;
    public long P;
    public int Q;
    public int R;
    public String S;
    public final int T;
    public boolean U;
    public a6.i V;
    public r8.n W;
    public boolean X;
    public final int Y;
    public ValueAnimator Z;
    public g f43349a;
    public float f43350a0;
    public v9 f43351b;
    public float f43352b0;
    public TextView f43353c;
    public o1.k f43354c0;
    public CameraView d;
    public float f43355d0;
    public final HandlerThread e;
    public RectF f43356e0;
    public Handler f43357f;
    public final a6 f43358f0;
    public float f43359g0;
    public TextView h;
    public long f43360h0;
    public final Paint f43361n;
    public final Paint f43362r;
    public ImageView f43363s;
    public ImageView v;
    public AnimatorSet f43364w;
    public float f43365x;
    public boolean f43366y;

    public y9(int i10) {
        super(null);
        this.e = new HandlerThread("ScanCamera");
        this.f43361n = new Paint();
        this.f43362r = new Paint(1);
        new Path();
        this.f43365x = 0.5f;
        this.f43366y = false;
        this.E = null;
        this.F = 0.0f;
        this.G = new PointF[4];
        this.H = new PointF[4];
        this.I = new PointF[4];
        this.J = new PointF[4];
        for (int i11 = 0; i11 < 4; i11++) {
            this.G[i11] = new PointF(-1.0f, -1.0f);
            this.H[i11] = new PointF(-1.0f, -1.0f);
            this.I[i11] = new PointF(-1.0f, -1.0f);
            this.J[i11] = new PointF(-1.0f, -1.0f);
        }
        this.K = new RectF();
        this.L = new RectF();
        this.M = 0L;
        this.Q = 0;
        this.R = 0;
        this.U = false;
        this.V = null;
        this.W = null;
        this.f43350a0 = 0.0f;
        this.f43352b0 = 0.0f;
        this.f43355d0 = 0.0f;
        this.f43358f0 = new a6(this, 1);
        this.f43359g0 = 0.0f;
        this.f43360h0 = 0L;
        this.Y = i10;
        if (a0()) {
            Utilities.globalQueue.postRunnable(new n9(this, 5));
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            if (devicePerformanceClass != 1) {
                this.T = 40;
                return;
            } else {
                this.T = 24;
                return;
            }
        }
        this.T = 8;
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

    public static t9 e0(Activity activity, boolean z10, int i10, x9 x9Var) {
        if (activity == null) {
            return null;
        }
        t9 t9Var = new t9(activity, new org.telegram.ui.ActionBar.d5[]{new ActionBarLayout(activity, false)}, i10, z10, x9Var);
        t9Var.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) t9Var, false);
        AndroidUtilities.setNavigationBarColor((Dialog) t9Var, -16777216, false);
        t9Var.setUseLightStatusBar(false);
        t9Var.getWindow().addFlags(512);
        t9Var.show();
        return t9Var;
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
            ((ViewGroup) this.fragmentView).addView(this.d, 0, w7.z5.d(-1.0f, -1));
            if (this.Y == 0 && (textView = this.h) != null) {
                this.d.addView(textView);
            }
        }
    }

    public final boolean a0() {
        int i10 = this.Y;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    public final void c0(android.graphics.Bitmap r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y9.c0(android.graphics.Bitmap):void");
    }

    @Override
    public final View createView(Context context) {
        xk0 xk0Var;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.f43366y) {
            this.actionBar.C(-1, false);
            this.actionBar.B(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21391z6, false), false);
            this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21304u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !a0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.I && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21358x8, kVar.I0));
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 28));
        this.f43361n.setColor(2130706432);
        Paint paint = this.f43362r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        u9 u9Var = new u9(this, context);
        u9Var.setOnTouchListener(new di.d(2));
        this.fragmentView = u9Var;
        if (a0()) {
            this.fragmentView.postDelayed(new n9(this, 0), 450L);
        } else {
            Y();
        }
        int i10 = this.Y;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.h6.f20986d6;
            kVar2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.C(-1, false);
            this.actionBar.B(587202559, false);
            u9Var.setBackgroundColor(-16777216);
            u9Var.addView(this.actionBar);
        }
        if (i10 == 2 || i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.r90.c());
        paint2.setColor(i0.b.o(-1, 40));
        v9 v9Var = new v9(context, paint2);
        this.f43351b = v9Var;
        v9Var.setGravity(1);
        this.f43351b.setTextSize(1, 24.0f);
        u9Var.addView(this.f43351b);
        TextView textView = new TextView(context);
        this.f43353c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        this.f43353c.setGravity(1);
        this.f43353c.setTextSize(1, 16.0f);
        u9Var.addView(this.f43353c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (i10 == 0) {
            this.f43351b.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.f43353c.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.f43351b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
            this.h.setTypeface(Typeface.MONOSPACE);
        } else {
            if (!this.X) {
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
                        this.f43351b.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                        spannableStringBuilder.replace(indexOf, i14, (CharSequence) " ");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.j61(strArr[i12], 0), i14, indexOf2, 33);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.c61(AndroidUtilities.bold()), i14, indexOf2, 33);
                        i12++;
                    }
                    this.f43351b.setLinkTextColor(-1);
                    this.f43351b.setTextSize(1, 16.0f);
                    this.f43351b.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f43351b.setPadding(0, 0, 0, 0);
                    this.f43351b.setText(spannableStringBuilder);
                } else {
                    this.f43351b.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                }
            }
            this.f43351b.setTextColor(-1);
            if (i10 == 3) {
                this.f43353c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            if (!this.X) {
                this.h.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            }
            u9Var.addView(this.h);
            if (this.X) {
                ImageView imageView = new ImageView(context);
                this.f43363s = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f43363s.setImageResource(R.drawable.qr_gallery);
                ImageView imageView2 = this.f43363s;
                ShapeDrawable K = org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(60.0f), 587202559);
                ShapeDrawable K2 = org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(60.0f), 1157627903);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, K2);
                stateListDrawable.addState(new int[]{16842913}, K2);
                stateListDrawable.addState(StateSet.WILD_CARD, K);
                imageView2.setBackgroundDrawable(stateListDrawable);
                u9Var.addView(this.f43363s);
                this.f43363s.setOnClickListener(new View.OnClickListener(this) {
                    public final y9 f40633b;

                    {
                        this.f40633b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        CameraSessionWrapper cameraSession;
                        int i15;
                        int i16 = r2;
                        y9 y9Var = this.f40633b;
                        switch (i16) {
                            case 0:
                                if (y9Var.getParentActivity() != null) {
                                    Activity parentActivity = y9Var.getParentActivity();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                                            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                            return;
                                        }
                                    } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                        return;
                                    }
                                    tp0 tp0Var = new tp0(10, false, false, null);
                                    tp0Var.G = 1;
                                    tp0Var.H = false;
                                    tp0Var.f41806x = false;
                                    tp0Var.V = new w9(y9Var);
                                    y9Var.presentFragment(tp0Var);
                                    return;
                                }
                                return;
                            default:
                                CameraView cameraView = y9Var.d;
                                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                                    ShapeDrawable shapeDrawable = (ShapeDrawable) y9Var.v.getBackground();
                                    AnimatorSet animatorSet = y9Var.f43364w;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        y9Var.f43364w = null;
                                    }
                                    y9Var.f43364w = new AnimatorSet();
                                    org.telegram.ui.Components.r6 r6Var = org.telegram.ui.Components.t6.e;
                                    if (y9Var.v.getTag() == null) {
                                        i15 = 68;
                                    } else {
                                        i15 = 34;
                                    }
                                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, r6Var, i15);
                                    ofInt.addUpdateListener(new q9(y9Var, 1));
                                    y9Var.f43364w.playTogether(ofInt);
                                    y9Var.f43364w.setDuration(200L);
                                    y9Var.f43364w.setInterpolator(org.telegram.ui.Components.bs.f25030f);
                                    y9Var.f43364w.addListener(new m.a(y9Var, 8));
                                    y9Var.f43364w.start();
                                    if (y9Var.v.getTag() == null) {
                                        y9Var.v.setTag(1);
                                        cameraSession.setCurrentFlashMode("torch");
                                        return;
                                    }
                                    y9Var.v.setTag(null);
                                    cameraSession.setCurrentFlashMode("off");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ImageView imageView3 = new ImageView(context);
            this.v = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            this.v.setImageResource(R.drawable.qr_flashlight);
            this.v.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(60.0f), 587202559));
            u9Var.addView(this.v);
            this.v.setOnClickListener(new View.OnClickListener(this) {
                public final y9 f40633b;

                {
                    this.f40633b = this;
                }

                @Override
                public final void onClick(View view2) {
                    CameraSessionWrapper cameraSession;
                    int i15;
                    int i16 = r2;
                    y9 y9Var = this.f40633b;
                    switch (i16) {
                        case 0:
                            if (y9Var.getParentActivity() != null) {
                                Activity parentActivity = y9Var.getParentActivity();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        return;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    return;
                                }
                                tp0 tp0Var = new tp0(10, false, false, null);
                                tp0Var.G = 1;
                                tp0Var.H = false;
                                tp0Var.f41806x = false;
                                tp0Var.V = new w9(y9Var);
                                y9Var.presentFragment(tp0Var);
                                return;
                            }
                            return;
                        default:
                            CameraView cameraView = y9Var.d;
                            if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                                ShapeDrawable shapeDrawable = (ShapeDrawable) y9Var.v.getBackground();
                                AnimatorSet animatorSet = y9Var.f43364w;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    y9Var.f43364w = null;
                                }
                                y9Var.f43364w = new AnimatorSet();
                                org.telegram.ui.Components.r6 r6Var = org.telegram.ui.Components.t6.e;
                                if (y9Var.v.getTag() == null) {
                                    i15 = 68;
                                } else {
                                    i15 = 34;
                                }
                                ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, r6Var, i15);
                                ofInt.addUpdateListener(new q9(y9Var, 1));
                                y9Var.f43364w.playTogether(ofInt);
                                y9Var.f43364w.setDuration(200L);
                                y9Var.f43364w.setInterpolator(org.telegram.ui.Components.bs.f25030f);
                                y9Var.f43364w.addListener(new m.a(y9Var, 8));
                                y9Var.f43364w.start();
                                if (y9Var.v.getTag() == null) {
                                    y9Var.v.setTag(1);
                                    cameraSession.setCurrentFlashMode("torch");
                                    return;
                                }
                                y9Var.v.setTag(null);
                                cameraSession.setCurrentFlashMode("off");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            xk0Var = ((LaunchActivity) parentActivity).f33180t1;
        } else {
            xk0Var = null;
        }
        if (xk0Var != null && this.f43349a == null) {
            g gVar = new g(xk0Var, 29);
            xk0Var.f43159b.add(gVar);
            xk0Var.a();
            this.f43349a = gVar;
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
            r8.n nVar = this.W;
            float f7 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.f45143b.k()) {
                if (bitmap != null) {
                    g3Var3 = new m.g3(22);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    g3Var3.d = bitmap;
                    a3.l lVar = (a3.l) g3Var3.f16196b;
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
                            g3Var3.f16197c = wrap;
                            a3.l lVar2 = (a3.l) g3Var3.f16196b;
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
                SparseArray e12 = this.W.e1(g3Var3);
                if (e12.size() > 0) {
                    r8.m mVar = (r8.m) e12.valueAt(0);
                    str = mVar.f45134b;
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
                        a3.l lVar3 = (a3.l) g3Var5.f16196b;
                        lVar3.f139a = width3;
                        lVar3.f140b = height3;
                        i13 = Z.getWidth();
                        i14 = Z.getHeight();
                        SparseArray e13 = this.W.e1(g3Var5);
                        if (e13.size() > 0) {
                            r8.m mVar2 = (r8.m) e13.valueAt(0);
                            str = mVar2.f45134b;
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
                            a3.l lVar4 = (a3.l) g3Var6.f16196b;
                            lVar4.f139a = width4;
                            lVar4.f140b = height4;
                            int width5 = Z.getWidth();
                            int height5 = Z.getHeight();
                            SparseArray e14 = this.W.e1(g3Var6);
                            if (e14.size() > 0) {
                                r8.m mVar3 = (r8.m) e14.valueAt(0);
                                String str2 = mVar3.f45134b;
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
            } else if (this.V != null) {
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
                androidx.biometric.e m10 = this.V.m(new n4.s(15, (Object) new ec.e(dVar), false));
                dc.j[] jVarArr = (dc.j[]) m10.f2819c;
                String str3 = (String) m10.f2818b;
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
                        float f19 = jVar.f7941a;
                        g3Var = g3Var4;
                        try {
                            float f20 = jVar.f7942b;
                            f10 = Math.min(f10, f19);
                            f7 = Math.max(f7, jVar.f7941a);
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
                            pointFArr2[i15] = new PointF(jVar2.f7941a / i13, jVar2.f7942b / i14);
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
            }
            if (this.X) {
                Uri.parse(str).getPath().replace("/", "");
            } else if (this.Y == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new n9(this, 6));
                return g3Var2;
            }
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
            g3Var7.f16197c = rectF;
            g3Var7.f16196b = str;
            return g3Var7;
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
        int i10 = org.telegram.ui.ActionBar.h6.f20986d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21391z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21304u8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43351b, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43353c, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.D6));
        return arrayList;
    }

    public final void h0() {
        int height;
        if (this.f43356e0 == null) {
            this.f43356e0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, height) / 1.5f);
        float f7 = width;
        float height2 = this.fragmentView.getHeight();
        this.f43356e0.set(((width - min) / 2.0f) / f7, ((height - min) / 2.0f) / height2, ((width + min) / 2.0f) / f7, ((height + min) / 2.0f) / height2);
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
                    x9 x9Var = this.N;
                    if (x9Var != null) {
                        x9Var.E((String) g02.f16196b);
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
        g gVar = this.f43349a;
        if (gVar != null) {
            xk0 xk0Var = (xk0) gVar.f37062b;
            if (xk0Var.f43159b.remove(gVar)) {
                xk0Var.a();
            }
            this.f43349a = null;
        }
        r8.n nVar = this.W;
        if (nVar != null) {
            nVar.X0();
        }
    }
}

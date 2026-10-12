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
public class y9 extends org.telegram.ui.ActionBar.m2 {
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
    public a6.m U;
    public r8.n V;
    public boolean W;
    public final int X;
    public ValueAnimator Y;
    public float Z;
    public v9 f44331a;
    public float f44332a0;
    public TextView f44333b;
    public o1.k f44334b0;
    public CameraView f44335c;
    public float f44336c0;
    public final HandlerThread d;
    public RectF f44337d0;
    public Handler f44338e;
    public final z5 f44339e0;
    public TextView f44340f;
    public float f44341f0;
    public long f44342g0;
    public final Paint h;
    public final Paint f44343n;
    public ImageView f44344r;
    public ImageView f44345s;
    public AnimatorSet v;
    public float f44346w;
    public boolean f44347x;
    public o1.k f44348y;

    public y9(int i10) {
        super(null);
        this.d = new HandlerThread("ScanCamera");
        this.h = new Paint();
        this.f44343n = new Paint(1);
        new Path();
        this.f44346w = 0.5f;
        this.f44347x = false;
        this.f44348y = null;
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
        this.Z = 0.0f;
        this.f44332a0 = 0.0f;
        this.f44336c0 = 0.0f;
        this.f44339e0 = new z5(this, 1);
        this.f44341f0 = 0.0f;
        this.f44342g0 = 0L;
        this.X = i10;
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

    public static t9 e0(Activity activity, boolean z10, int i10, x9 x9Var) {
        if (activity == null) {
            return null;
        }
        t9 t9Var = new t9(activity, new org.telegram.ui.ActionBar.b5[]{new ActionBarLayout(activity, false)}, i10, z10, x9Var);
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
            this.f44335c = cameraView;
            cameraView.setUseMaxPreview(true);
            this.f44335c.setOptimizeForBarcode(true);
            this.f44335c.setDelegate(new z0(this, 11));
            ((ViewGroup) this.fragmentView).addView(this.f44335c, 0, w7.w5.d(-1.0f, -1));
            if (this.X == 0 && (textView = this.f44340f) != null) {
                this.f44335c.addView(textView);
            }
        }
    }

    public final boolean a0() {
        int i10 = this.X;
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
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.f44347x) {
            this.actionBar.E(-1, false);
            this.actionBar.D(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.E(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20964z6, false), false);
            this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20877u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !a0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.I && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20932x8, kVar.I0));
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 26));
        this.h.setColor(2130706432);
        Paint paint = this.f44343n;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        u9 u9Var = new u9(this, context);
        u9Var.setOnTouchListener(new bi.d(2));
        this.fragmentView = u9Var;
        if (a0()) {
            this.fragmentView.postDelayed(new n9(this, 0), 450L);
        } else {
            Y();
        }
        int i10 = this.X;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.h6.f20560d6;
            kVar2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.E(-1, false);
            this.actionBar.D(587202559, false);
            u9Var.setBackgroundColor(-16777216);
            u9Var.addView(this.actionBar);
        }
        if (i10 == 2 || i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.ca0.c());
        paint2.setColor(i0.a.k(-1, 40));
        v9 v9Var = new v9(context, paint2);
        this.f44331a = v9Var;
        v9Var.setGravity(1);
        this.f44331a.setTextSize(1, 24.0f);
        u9Var.addView(this.f44331a);
        TextView textView = new TextView(context);
        this.f44333b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        this.f44333b.setGravity(1);
        this.f44333b.setTextSize(1, 16.0f);
        u9Var.addView(this.f44333b);
        TextView textView2 = new TextView(context);
        this.f44340f = textView2;
        textView2.setTextColor(-1);
        this.f44340f.setGravity(81);
        this.f44340f.setAlpha(0.0f);
        if (i10 == 0) {
            this.f44331a.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.f44333b.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.f44331a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
            this.f44340f.setTypeface(Typeface.MONOSPACE);
        } else {
            if (!this.W) {
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
                        this.f44331a.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                        spannableStringBuilder.replace(indexOf, i14, (CharSequence) " ");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.y61(strArr[i12], 0), i14, indexOf2, 33);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), i14, indexOf2, 33);
                        i12++;
                    }
                    this.f44331a.setLinkTextColor(-1);
                    this.f44331a.setTextSize(1, 16.0f);
                    this.f44331a.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f44331a.setPadding(0, 0, 0, 0);
                    this.f44331a.setText(spannableStringBuilder);
                } else {
                    this.f44331a.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                }
            }
            this.f44331a.setTextColor(-1);
            if (i10 == 3) {
                this.f44333b.setTextColor(-1711276033);
            }
            this.f44340f.setTextSize(1, 16.0f);
            this.f44340f.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            if (!this.W) {
                this.f44340f.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            }
            u9Var.addView(this.f44340f);
            if (this.W) {
                ImageView imageView = new ImageView(context);
                this.f44344r = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f44344r.setImageResource(R.drawable.qr_gallery);
                ImageView imageView2 = this.f44344r;
                ShapeDrawable K = org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(60.0f), 587202559);
                ShapeDrawable K2 = org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(60.0f), 1157627903);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, K2);
                stateListDrawable.addState(new int[]{16842913}, K2);
                stateListDrawable.addState(StateSet.WILD_CARD, K);
                imageView2.setBackgroundDrawable(stateListDrawable);
                u9Var.addView(this.f44344r);
                this.f44344r.setOnClickListener(new View.OnClickListener(this) {
                    public final y9 f41538b;

                    {
                        this.f41538b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        CameraSessionWrapper cameraSession;
                        int i15;
                        int i16 = r2;
                        y9 y9Var = this.f41538b;
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
                                    mq0 mq0Var = new mq0(10, false, false, null);
                                    mq0Var.G = 1;
                                    mq0Var.H = false;
                                    mq0Var.f40119x = false;
                                    mq0Var.V = new w9(y9Var);
                                    y9Var.presentFragment(mq0Var);
                                    return;
                                }
                                return;
                            default:
                                CameraView cameraView = y9Var.f44335c;
                                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                                    ShapeDrawable shapeDrawable = (ShapeDrawable) y9Var.f44345s.getBackground();
                                    AnimatorSet animatorSet = y9Var.v;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        y9Var.v = null;
                                    }
                                    y9Var.v = new AnimatorSet();
                                    org.telegram.ui.Components.s6 s6Var = org.telegram.ui.Components.u6.f31057e;
                                    if (y9Var.f44345s.getTag() == null) {
                                        i15 = 68;
                                    } else {
                                        i15 = 34;
                                    }
                                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, s6Var, i15);
                                    ofInt.addUpdateListener(new q9(y9Var, 1));
                                    y9Var.v.playTogether(ofInt);
                                    y9Var.v.setDuration(200L);
                                    y9Var.v.setInterpolator(org.telegram.ui.Components.js.f27634f);
                                    y9Var.v.addListener(new w4(y9Var, 3));
                                    y9Var.v.start();
                                    if (y9Var.f44345s.getTag() == null) {
                                        y9Var.f44345s.setTag(1);
                                        cameraSession.setCurrentFlashMode("torch");
                                        return;
                                    }
                                    y9Var.f44345s.setTag(null);
                                    cameraSession.setCurrentFlashMode("off");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ImageView imageView3 = new ImageView(context);
            this.f44345s = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            this.f44345s.setImageResource(R.drawable.qr_flashlight);
            this.f44345s.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(60.0f), 587202559));
            u9Var.addView(this.f44345s);
            this.f44345s.setOnClickListener(new View.OnClickListener(this) {
                public final y9 f41538b;

                {
                    this.f41538b = this;
                }

                @Override
                public final void onClick(View view2) {
                    CameraSessionWrapper cameraSession;
                    int i15;
                    int i16 = r2;
                    y9 y9Var = this.f41538b;
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
                                mq0 mq0Var = new mq0(10, false, false, null);
                                mq0Var.G = 1;
                                mq0Var.H = false;
                                mq0Var.f40119x = false;
                                mq0Var.V = new w9(y9Var);
                                y9Var.presentFragment(mq0Var);
                                return;
                            }
                            return;
                        default:
                            CameraView cameraView = y9Var.f44335c;
                            if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                                ShapeDrawable shapeDrawable = (ShapeDrawable) y9Var.f44345s.getBackground();
                                AnimatorSet animatorSet = y9Var.v;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    y9Var.v = null;
                                }
                                y9Var.v = new AnimatorSet();
                                org.telegram.ui.Components.s6 s6Var = org.telegram.ui.Components.u6.f31057e;
                                if (y9Var.f44345s.getTag() == null) {
                                    i15 = 68;
                                } else {
                                    i15 = 34;
                                }
                                ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, s6Var, i15);
                                ofInt.addUpdateListener(new q9(y9Var, 1));
                                y9Var.v.playTogether(ofInt);
                                y9Var.v.setDuration(200L);
                                y9Var.v.setInterpolator(org.telegram.ui.Components.js.f27634f);
                                y9Var.v.addListener(new w4(y9Var, 3));
                                y9Var.v.start();
                                if (y9Var.f44345s.getTag() == null) {
                                    y9Var.f44345s.setTag(1);
                                    cameraSession.setCurrentFlashMode("torch");
                                    return;
                                }
                                y9Var.f44345s.setTag(null);
                                cameraSession.setCurrentFlashMode("off");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final m.f3 g0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        m.f3 f3Var;
        m.f3 f3Var2;
        int i13;
        int i14;
        String str;
        PointF[] pointFArr;
        cc.d dVar;
        PointF[] pointFArr2;
        m.f3 f3Var3;
        PointF[] pointFArr3;
        PointF[] pointFArr4;
        m.f3 f3Var4 = null;
        try {
            RectF rectF = new RectF();
            r8.n nVar = this.V;
            float f7 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.f47319b.k()) {
                if (bitmap != null) {
                    f3Var3 = new m.f3(23);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    f3Var3.d = bitmap;
                    a3.l lVar = (a3.l) f3Var3.f15424b;
                    lVar.f155a = width;
                    lVar.f156b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    f3Var3 = new m.f3(23);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap != null) {
                        if (wrap.capacity() >= width2 * height2) {
                            f3Var3.f15425c = wrap;
                            a3.l lVar2 = (a3.l) f3Var3.f15424b;
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
                SparseArray b12 = this.V.b1(f3Var3);
                if (b12.size() > 0) {
                    r8.m mVar = (r8.m) b12.valueAt(0);
                    str = mVar.f47309b;
                    Point[] pointArr = mVar.f47311e;
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
                        f3Var2 = null;
                        pointFArr = pointFArr3;
                    }
                    rectF = null;
                    pointFArr3 = pointFArr4;
                    f3Var2 = null;
                    pointFArr = pointFArr3;
                } else {
                    if (bitmap != null) {
                        Bitmap Z = Z(bitmap);
                        bitmap.recycle();
                        m.f3 f3Var5 = new m.f3(23);
                        int width3 = Z.getWidth();
                        int height3 = Z.getHeight();
                        f3Var5.d = Z;
                        a3.l lVar3 = (a3.l) f3Var5.f15424b;
                        lVar3.f155a = width3;
                        lVar3.f156b = height3;
                        i13 = Z.getWidth();
                        i14 = Z.getHeight();
                        SparseArray b13 = this.V.b1(f3Var5);
                        if (b13.size() > 0) {
                            r8.m mVar2 = (r8.m) b13.valueAt(0);
                            str = mVar2.f47309b;
                            Point[] pointArr2 = mVar2.f47311e;
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
                            m.f3 f3Var6 = new m.f3(23);
                            int width4 = b02.getWidth();
                            int height4 = b02.getHeight();
                            f3Var6.d = b02;
                            a3.l lVar4 = (a3.l) f3Var6.f15424b;
                            lVar4.f155a = width4;
                            lVar4.f156b = height4;
                            int width5 = Z.getWidth();
                            int height5 = Z.getHeight();
                            SparseArray b14 = this.V.b1(f3Var6);
                            if (b14.size() > 0) {
                                r8.m mVar3 = (r8.m) b14.valueAt(0);
                                String str2 = mVar3.f47309b;
                                Point[] pointArr3 = mVar3.f47311e;
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
                        f3Var2 = null;
                        pointFArr = pointFArr3;
                    }
                    str = null;
                    pointFArr3 = null;
                    f3Var2 = null;
                    pointFArr = pointFArr3;
                }
            } else if (this.U != null) {
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
                aa.a b03 = this.U.b0(new pf.b(10, (Object) new dc.f(dVar), false));
                cc.j[] jVarArr = (cc.j[]) b03.f387c;
                String str3 = (String) b03.f386b;
                if (jVarArr == null || jVarArr.length == 0) {
                    f3Var2 = null;
                    pointFArr2 = null;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f17 = Float.MIN_VALUE;
                    float f18 = Float.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < length4) {
                        cc.j jVar = jVarArr[i16];
                        float f19 = jVar.f4602a;
                        f3Var = f3Var4;
                        try {
                            float f20 = jVar.f4603b;
                            f10 = Math.min(f10, f19);
                            f7 = Math.max(f7, jVar.f4602a);
                            f18 = Math.min(f18, f20);
                            f17 = Math.max(f17, f20);
                            i16++;
                            f3Var4 = f3Var;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new n9(this, 6));
                            return f3Var;
                        }
                    }
                    f3Var2 = f3Var4;
                    rectF.set(f10, f18, f7, f17);
                    if (jVarArr.length == 4) {
                        pointFArr2 = new PointF[4];
                        while (i15 < 4) {
                            cc.j jVar2 = jVarArr[i15];
                            pointFArr2[i15] = new PointF(jVar2.f4602a / i13, jVar2.f4603b / i14);
                            i15++;
                        }
                    } else {
                        pointFArr2 = f3Var2;
                    }
                }
                str = str3;
                pointFArr = pointFArr2;
            } else {
                f3Var2 = null;
                i13 = 1;
                i14 = 1;
                str = null;
                pointFArr = null;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new n9(this, 6));
                return f3Var2;
            }
            if (this.W) {
                Uri.parse(str).getPath().replace("/", "");
            } else if (this.X == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new n9(this, 6));
                return f3Var2;
            }
            m.f3 f3Var7 = new m.f3(11, false);
            if (rectF != null) {
                float dp = AndroidUtilities.dp(25.0f);
                float dp2 = AndroidUtilities.dp(15.0f);
                rectF.set(rectF.left - dp, rectF.top - dp2, rectF.right + dp, rectF.bottom + dp2);
                float f21 = i13;
                float f22 = i14;
                rectF.set(rectF.left / f21, rectF.top / f22, rectF.right / f21, rectF.bottom / f22);
            }
            f3Var7.d = pointFArr;
            f3Var7.f15425c = rectF;
            f3Var7.f15424b = str;
            return f3Var7;
        } catch (Throwable unused2) {
            f3Var = null;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (a0()) {
            return arrayList;
        }
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20560d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20964z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20877u8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44331a, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44333b, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.D6));
        return arrayList;
    }

    public final void h0() {
        int height;
        if (this.f44337d0 == null) {
            this.f44337d0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, height) / 1.5f);
        float f7 = width;
        float height2 = this.fragmentView.getHeight();
        this.f44337d0.set(((width - min) / 2.0f) / f7, ((height - min) / 2.0f) / height2, ((width + min) / 2.0f) / f7, ((height + min) / 2.0f) / height2);
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
                m.f3 g02 = g0(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
                if (g02 != null) {
                    x9 x9Var = this.M;
                    if (x9Var != null) {
                        x9Var.K((String) g02.f15424b);
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
        CameraView cameraView = this.f44335c;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.f44335c = null;
        }
        this.d.quitSafely();
        AndroidUtilities.unlockOrientation(getParentActivity());
        r8.n nVar = this.V;
        if (nVar != null) {
            nVar.U0();
        }
    }
}

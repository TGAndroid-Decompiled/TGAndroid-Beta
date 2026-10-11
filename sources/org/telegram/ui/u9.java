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
public class u9 extends org.telegram.ui.ActionBar.m2 {
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
    public pb.c U;
    public r8.n V;
    public boolean W;
    public final int X;
    public ValueAnimator Y;
    public float Z;
    public r9 f42445a;
    public float f42446a0;
    public TextView f42447b;
    public o1.k f42448b0;
    public CameraView f42449c;
    public float f42450c0;
    public final HandlerThread d;
    public RectF f42451d0;
    public Handler f42452e;
    public final v5 f42453e0;
    public TextView f42454f;
    public float f42455f0;
    public long f42456g0;
    public final Paint h;
    public final Paint f42457n;
    public ImageView f42458r;
    public ImageView f42459s;
    public AnimatorSet v;
    public float f42460w;
    public boolean f42461x;
    public o1.k f42462y;

    public u9(int i10) {
        super(null);
        this.d = new HandlerThread("ScanCamera");
        this.h = new Paint();
        this.f42457n = new Paint(1);
        new Path();
        this.f42460w = 0.5f;
        this.f42461x = false;
        this.f42462y = null;
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
        this.f42446a0 = 0.0f;
        this.f42450c0 = 0.0f;
        this.f42453e0 = new v5(this, 1);
        this.f42455f0 = 0.0f;
        this.f42456g0 = 0L;
        this.X = i10;
        if (a0()) {
            Utilities.globalQueue.postRunnable(new j9(this, 5));
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

    public static p9 e0(Activity activity, boolean z10, int i10, t9 t9Var) {
        if (activity == null) {
            return null;
        }
        p9 p9Var = new p9(activity, new org.telegram.ui.ActionBar.b5[]{new ActionBarLayout(activity, false)}, i10, z10, t9Var);
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
        if (this.fragmentView != null && CameraView.isCameraAllowed()) {
            CameraController.getInstance().initCamera(null);
            CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
            this.f42449c = cameraView;
            cameraView.setUseMaxPreview(true);
            this.f42449c.setOptimizeForBarcode(true);
            this.f42449c.setDelegate(new y0(this, 11));
            ((ViewGroup) this.fragmentView).addView(this.f42449c, 0, w7.x5.d(-1.0f, -1));
            if (this.X == 0 && (textView = this.f42454f) != null) {
                this.f42449c.addView(textView);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u9.c0(android.graphics.Bitmap):void");
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.f42461x) {
            this.actionBar.D(-1, false);
            this.actionBar.C(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21225z6, false), false);
            this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21138u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !a0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.I && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21193x8, kVar.I0));
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 25));
        this.h.setColor(2130706432);
        Paint paint = this.f42457n;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        q9 q9Var = new q9(this, context);
        q9Var.setOnTouchListener(new bi.d(2));
        this.fragmentView = q9Var;
        if (a0()) {
            this.fragmentView.postDelayed(new j9(this, 0), 450L);
        } else {
            Y();
        }
        int i10 = this.X;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.h6.f20822d6;
            kVar2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
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
        paint2.setPathEffect(org.telegram.ui.Components.y90.c());
        paint2.setColor(i0.a.k(-1, 40));
        r9 r9Var = new r9(context, paint2);
        this.f42445a = r9Var;
        r9Var.setGravity(1);
        this.f42445a.setTextSize(1, 24.0f);
        q9Var.addView(this.f42445a);
        TextView textView = new TextView(context);
        this.f42447b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        this.f42447b.setGravity(1);
        this.f42447b.setTextSize(1, 16.0f);
        q9Var.addView(this.f42447b);
        TextView textView2 = new TextView(context);
        this.f42454f = textView2;
        textView2.setTextColor(-1);
        this.f42454f.setGravity(81);
        this.f42454f.setAlpha(0.0f);
        if (i10 == 0) {
            this.f42445a.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.f42447b.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.f42445a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
            this.f42454f.setTypeface(Typeface.MONOSPACE);
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
                        this.f42445a.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                        spannableStringBuilder.replace(indexOf, i14, (CharSequence) " ");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.u61(strArr[i12], 0), i14, indexOf2, 33);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.n61(AndroidUtilities.bold()), i14, indexOf2, 33);
                        i12++;
                    }
                    this.f42445a.setLinkTextColor(-1);
                    this.f42445a.setTextSize(1, 16.0f);
                    this.f42445a.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f42445a.setPadding(0, 0, 0, 0);
                    this.f42445a.setText(spannableStringBuilder);
                } else {
                    this.f42445a.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                }
            }
            this.f42445a.setTextColor(-1);
            if (i10 == 3) {
                this.f42447b.setTextColor(-1711276033);
            }
            this.f42454f.setTextSize(1, 16.0f);
            this.f42454f.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            if (!this.W) {
                this.f42454f.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            }
            q9Var.addView(this.f42454f);
            if (this.W) {
                ImageView imageView = new ImageView(context);
                this.f42458r = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f42458r.setImageResource(R.drawable.qr_gallery);
                ImageView imageView2 = this.f42458r;
                ShapeDrawable K = org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(60.0f), 587202559);
                ShapeDrawable K2 = org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(60.0f), 1157627903);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, K2);
                stateListDrawable.addState(new int[]{16842913}, K2);
                stateListDrawable.addState(StateSet.WILD_CARD, K);
                imageView2.setBackgroundDrawable(stateListDrawable);
                q9Var.addView(this.f42458r);
                this.f42458r.setOnClickListener(new View.OnClickListener(this) {
                    public final u9 f40186b;

                    {
                        this.f40186b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        CameraSessionWrapper cameraSession;
                        int i15;
                        int i16 = r2;
                        u9 u9Var = this.f40186b;
                        switch (i16) {
                            case 0:
                                if (u9Var.getParentActivity() != null) {
                                    Activity parentActivity = u9Var.getParentActivity();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                                            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                            return;
                                        }
                                    } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                        return;
                                    }
                                    jq0 jq0Var = new jq0(10, false, false, null);
                                    jq0Var.G = 1;
                                    jq0Var.H = false;
                                    jq0Var.f39142x = false;
                                    jq0Var.V = new s9(u9Var);
                                    u9Var.presentFragment(jq0Var);
                                    return;
                                }
                                return;
                            default:
                                CameraView cameraView = u9Var.f42449c;
                                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                                    ShapeDrawable shapeDrawable = (ShapeDrawable) u9Var.f42459s.getBackground();
                                    AnimatorSet animatorSet = u9Var.v;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        u9Var.v = null;
                                    }
                                    u9Var.v = new AnimatorSet();
                                    org.telegram.ui.Components.s6 s6Var = org.telegram.ui.Components.u6.f31451e;
                                    if (u9Var.f42459s.getTag() == null) {
                                        i15 = 68;
                                    } else {
                                        i15 = 34;
                                    }
                                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, s6Var, i15);
                                    ofInt.addUpdateListener(new m9(u9Var, 1));
                                    u9Var.v.playTogether(ofInt);
                                    u9Var.v.setDuration(200L);
                                    u9Var.v.setInterpolator(org.telegram.ui.Components.is.f27500f);
                                    u9Var.v.addListener(new s4(u9Var, 3));
                                    u9Var.v.start();
                                    if (u9Var.f42459s.getTag() == null) {
                                        u9Var.f42459s.setTag(1);
                                        cameraSession.setCurrentFlashMode("torch");
                                        return;
                                    }
                                    u9Var.f42459s.setTag(null);
                                    cameraSession.setCurrentFlashMode("off");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ImageView imageView3 = new ImageView(context);
            this.f42459s = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            this.f42459s.setImageResource(R.drawable.qr_flashlight);
            this.f42459s.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(60.0f), 587202559));
            q9Var.addView(this.f42459s);
            this.f42459s.setOnClickListener(new View.OnClickListener(this) {
                public final u9 f40186b;

                {
                    this.f40186b = this;
                }

                @Override
                public final void onClick(View view2) {
                    CameraSessionWrapper cameraSession;
                    int i15;
                    int i16 = r2;
                    u9 u9Var = this.f40186b;
                    switch (i16) {
                        case 0:
                            if (u9Var.getParentActivity() != null) {
                                Activity parentActivity = u9Var.getParentActivity();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        return;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    return;
                                }
                                jq0 jq0Var = new jq0(10, false, false, null);
                                jq0Var.G = 1;
                                jq0Var.H = false;
                                jq0Var.f39142x = false;
                                jq0Var.V = new s9(u9Var);
                                u9Var.presentFragment(jq0Var);
                                return;
                            }
                            return;
                        default:
                            CameraView cameraView = u9Var.f42449c;
                            if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                                ShapeDrawable shapeDrawable = (ShapeDrawable) u9Var.f42459s.getBackground();
                                AnimatorSet animatorSet = u9Var.v;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    u9Var.v = null;
                                }
                                u9Var.v = new AnimatorSet();
                                org.telegram.ui.Components.s6 s6Var = org.telegram.ui.Components.u6.f31451e;
                                if (u9Var.f42459s.getTag() == null) {
                                    i15 = 68;
                                } else {
                                    i15 = 34;
                                }
                                ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, s6Var, i15);
                                ofInt.addUpdateListener(new m9(u9Var, 1));
                                u9Var.v.playTogether(ofInt);
                                u9Var.v.setDuration(200L);
                                u9Var.v.setInterpolator(org.telegram.ui.Components.is.f27500f);
                                u9Var.v.addListener(new s4(u9Var, 3));
                                u9Var.v.start();
                                if (u9Var.f42459s.getTag() == null) {
                                    u9Var.f42459s.setTag(1);
                                    cameraSession.setCurrentFlashMode("torch");
                                    return;
                                }
                                u9Var.f42459s.setTag(null);
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

    public final la.h g0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        la.h hVar;
        la.h hVar2;
        int i13;
        int i14;
        String str;
        PointF[] pointFArr;
        cc.d dVar;
        PointF[] pointFArr2;
        la.h hVar3;
        PointF[] pointFArr3;
        PointF[] pointFArr4;
        la.h hVar4 = null;
        try {
            RectF rectF = new RectF();
            r8.n nVar = this.V;
            float f7 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.f47221b.k()) {
                if (bitmap != null) {
                    hVar3 = new la.h(24);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    hVar3.d = bitmap;
                    a3.l lVar = (a3.l) hVar3.f15501b;
                    lVar.f155a = width;
                    lVar.f156b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    hVar3 = new la.h(24);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap != null) {
                        if (wrap.capacity() >= width2 * height2) {
                            hVar3.f15502c = wrap;
                            a3.l lVar2 = (a3.l) hVar3.f15501b;
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
                SparseArray b12 = this.V.b1(hVar3);
                if (b12.size() > 0) {
                    r8.m mVar = (r8.m) b12.valueAt(0);
                    str = mVar.f47211b;
                    Point[] pointArr = mVar.f47213e;
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
                        Bitmap Z = Z(bitmap);
                        bitmap.recycle();
                        la.h hVar5 = new la.h(24);
                        int width3 = Z.getWidth();
                        int height3 = Z.getHeight();
                        hVar5.d = Z;
                        a3.l lVar3 = (a3.l) hVar5.f15501b;
                        lVar3.f155a = width3;
                        lVar3.f156b = height3;
                        i13 = Z.getWidth();
                        i14 = Z.getHeight();
                        SparseArray b13 = this.V.b1(hVar5);
                        if (b13.size() > 0) {
                            r8.m mVar2 = (r8.m) b13.valueAt(0);
                            str = mVar2.f47211b;
                            Point[] pointArr2 = mVar2.f47213e;
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
                            la.h hVar6 = new la.h(24);
                            int width4 = b02.getWidth();
                            int height4 = b02.getHeight();
                            hVar6.d = b02;
                            a3.l lVar4 = (a3.l) hVar6.f15501b;
                            lVar4.f155a = width4;
                            lVar4.f156b = height4;
                            int width5 = Z.getWidth();
                            int height5 = Z.getHeight();
                            SparseArray b14 = this.V.b1(hVar6);
                            if (b14.size() > 0) {
                                r8.m mVar3 = (r8.m) b14.valueAt(0);
                                String str2 = mVar3.f47211b;
                                Point[] pointArr3 = mVar3.f47213e;
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
                aa.a F = this.U.F(new pf.b(10, (Object) new dc.f(dVar), false));
                cc.j[] jVarArr = (cc.j[]) F.f385c;
                String str3 = (String) F.f384b;
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
                        float f19 = jVar.f4603a;
                        hVar = hVar4;
                        try {
                            float f20 = jVar.f4604b;
                            f10 = Math.min(f10, f19);
                            f7 = Math.max(f7, jVar.f4603a);
                            f18 = Math.min(f18, f20);
                            f17 = Math.max(f17, f20);
                            i16++;
                            hVar4 = hVar;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new j9(this, 6));
                            return hVar;
                        }
                    }
                    hVar2 = hVar4;
                    rectF.set(f10, f18, f7, f17);
                    if (jVarArr.length == 4) {
                        pointFArr2 = new PointF[4];
                        while (i15 < 4) {
                            cc.j jVar2 = jVarArr[i15];
                            pointFArr2[i15] = new PointF(jVar2.f4603a / i13, jVar2.f4604b / i14);
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
                i14 = 1;
                str = null;
                pointFArr = null;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new j9(this, 6));
                return hVar2;
            }
            if (this.W) {
                Uri.parse(str).getPath().replace("/", "");
            } else if (this.X == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new j9(this, 6));
                return hVar2;
            }
            la.h hVar7 = new la.h(11, false);
            if (rectF != null) {
                float dp = AndroidUtilities.dp(25.0f);
                float dp2 = AndroidUtilities.dp(15.0f);
                rectF.set(rectF.left - dp, rectF.top - dp2, rectF.right + dp, rectF.bottom + dp2);
                float f21 = i13;
                float f22 = i14;
                rectF.set(rectF.left / f21, rectF.top / f22, rectF.right / f21, rectF.bottom / f22);
            }
            hVar7.d = pointFArr;
            hVar7.f15502c = rectF;
            hVar7.f15501b = str;
            return hVar7;
        } catch (Throwable unused2) {
            hVar = null;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (a0()) {
            return arrayList;
        }
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20822d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21225z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21138u8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42445a, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42447b, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.D6));
        return arrayList;
    }

    public final void h0() {
        int height;
        if (this.f42451d0 == null) {
            this.f42451d0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, height) / 1.5f);
        float f7 = width;
        float height2 = this.fragmentView.getHeight();
        this.f42451d0.set(((width - min) / 2.0f) / f7, ((height - min) / 2.0f) / height2, ((width + min) / 2.0f) / f7, ((height + min) / 2.0f) / height2);
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
                    t9 t9Var = this.M;
                    if (t9Var != null) {
                        t9Var.K((String) g02.f15501b);
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
        CameraView cameraView = this.f42449c;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.f42449c = null;
        }
        this.d.quitSafely();
        AndroidUtilities.unlockOrientation(getParentActivity());
        r8.n nVar = this.V;
        if (nVar != null) {
            nVar.U0();
        }
    }
}

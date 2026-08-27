package zf;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import g7.o8;
import h7.z5;
import i7.ka;
import i7.r7;
import i7.t7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.y5;
import org.telegram.ui.nq0;
import org.telegram.ui.rc1;
import org.telegram.ui.tq0;

public final class n2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {

    public static final int f50607n0 = 0;
    public k2 A;
    public float B;
    public boolean C;
    public k2[] D;
    public volatile Bitmap E;
    public int F;
    public Bitmap G;
    public boolean H;
    public final TextView I;
    public ValueAnimator J;
    public float K;
    public float L;
    public float M;
    public float N;
    public f01 O;
    public int P;
    public int Q;
    public boolean R;
    public l2 S;
    public final c6 T;
    public d2 U;
    public String V;
    public lh.t0 W;

    public int f50608a;

    public final Matrix f50609a0;

    public final y5 f50610b;

    public float f50611b0;

    public final y5 f50612c;

    public float f50613c0;
    public final Paint d;

    public final w1 f50614d0;

    public final Paint f50615e;

    public boolean f50616e0;

    public final Paint f50617f;

    public final Matrix f50618f0;

    public Path f50619g0;
    public final Paint h;

    public Path f50620h0;

    public final RectF f50621i0;

    public float f50622j0;

    public float f50623k0;

    public final ArrayList f50624l0;
    public final Rect m0;

    public final PathMeasure f50625n;

    public final Path f50626r;

    public final Path f50627s;
    public final Path v;

    public final Path f50628w;

    public volatile boolean f50629x;

    public volatile boolean f50630y;

    public n2(ContextThemeWrapper contextThemeWrapper, c6 c6Var) {
        super(contextThemeWrapper);
        this.f50608a = -1;
        er erVar = er.h;
        this.f50610b = new y5(0.0f, (View) null, 0L, 420L, erVar);
        this.f50612c = new y5(0.0f, (View) null, 0L, 420L, erVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f50615e = paint2;
        Paint paint3 = new Paint(1);
        this.f50617f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f50625n = new PathMeasure();
        this.f50626r = new Path();
        this.f50627s = new Path();
        this.v = new Path();
        this.f50628w = new Path();
        this.B = 2.0f;
        this.f50609a0 = new Matrix();
        this.f50618f0 = new Matrix();
        this.f50621i0 = new RectF();
        this.f50624l0 = new ArrayList();
        this.m0 = new Rect();
        this.T = c6Var;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
        paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(140);
        TextView textView = new TextView(contextThemeWrapper);
        this.I = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, z5.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        float fDp = AndroidUtilities.dp(4.0f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(fDp, blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        w1 w1Var = new w1(contextThemeWrapper);
        this.f50614d0 = w1Var;
        w1Var.setAlpha(0.0f);
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.b(0.33f, 10.0f);
        w1Var.setBrushWeight(this.B);
        w1Var.setValueOverride(new n1.d(this, 26));
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.setAlpha(0.0f);
        addView(w1Var, z5.c(-1.0f, -1));
    }

    public static void c(k2 k2Var, int i10, int i11) {
        Bitmap bitmap;
        j2 j2Var;
        boolean z10;
        boolean z11;
        float f10;
        Bitmap bitmapB = k2Var.b();
        Path path = k2Var.f50494l;
        int width = bitmapB.getWidth();
        int height = k2Var.b().getHeight();
        float fMax = Math.max(width, height) / (SharedConfig.getDevicePerformanceClass() == 2 ? 512.0f : 384.0f);
        if ((k2Var.f50487c / 90) % 2 != 0) {
            width = k2Var.b().getHeight();
            height = k2Var.b().getWidth();
        }
        float f11 = width;
        float f12 = height;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (f11 / fMax), (int) (f12 / fMax), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        if (k2Var.f50487c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(k2Var.f50487c, k2Var.b().getWidth() / 2.0f, k2Var.d.getHeight() / 2.0f);
            if ((k2Var.f50487c / 90) % 2 != 0) {
                float height2 = (k2Var.b().getHeight() - k2Var.b().getWidth()) / 2.0f;
                matrix.postTranslate(height2, -height2);
            }
            matrix.postScale(rectF.width() / f11, rectF.height() / f12);
            canvas.drawBitmap(k2Var.b(), matrix, new Paint(3));
        } else {
            canvas.drawBitmap(k2Var.b(), (Rect) null, rectF, new Paint(3));
        }
        int height3 = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth();
        int[] iArr = new int[height3];
        bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f13 = i10;
        float f14 = i11;
        float fMin = Math.min(f13 / bitmapCreateBitmap.getWidth(), f14 / bitmapCreateBitmap.getHeight());
        j2 j2Var2 = null;
        j2 j2Var3 = null;
        int i12 = 0;
        while (i12 < height3) {
            int width2 = i12 / bitmapCreateBitmap.getWidth();
            int width3 = i12 - (bitmapCreateBitmap.getWidth() * width2);
            int i13 = iArr[i12];
            boolean z12 = i13 != 0;
            if (i13 == 0) {
                int i14 = i12 - 1;
                boolean z13 = i14 >= 0;
                f10 = f11;
                int i15 = i12 + 1;
                boolean z14 = i15 < height3;
                if (z13 && iArr[i14] != 0) {
                    j2Var3 = new j2(fMin, width3, width2);
                }
                if (j2Var2 == null && z14 && iArr[i15] != 0) {
                    j2Var2 = new j2(fMin, width3, width2);
                }
            } else {
                f10 = f11;
            }
            boolean z15 = width3 == bitmapCreateBitmap.getWidth() + (-1);
            boolean z16 = width3 == 0;
            if (z15) {
                j2 j2Var4 = z12 ? new j2(fMin, width3, width2) : j2Var3;
                if (j2Var2 != null) {
                    arrayList.add(j2Var2);
                }
                if (j2Var4 != null) {
                    arrayList2.add(j2Var4);
                }
                j2Var2 = null;
                j2Var3 = null;
            }
            if (z16 && z12) {
                j2Var2 = new j2(fMin, width3, width2);
            }
            i12++;
            f11 = f10;
        }
        float f15 = f11;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        j2 j2Var5 = null;
        j2 j2Var6 = null;
        int i16 = 0;
        while (i16 < height3) {
            float f16 = f12;
            int height4 = i16 / bitmapCreateBitmap.getHeight();
            j2 j2Var7 = j2Var5;
            int height5 = i16 - (bitmapCreateBitmap.getHeight() * height4);
            boolean z17 = iArr[(bitmapCreateBitmap.getWidth() * height5) + height4] != 0;
            if (z17) {
                bitmap = bitmapCreateBitmap;
            } else {
                int width4 = (bitmapCreateBitmap.getWidth() * (height5 - 1)) + height4;
                bitmap = bitmapCreateBitmap;
                int width5 = (bitmapCreateBitmap.getWidth() * (height5 + 1)) + height4;
                boolean z18 = width4 >= 0;
                boolean z19 = width5 < height3;
                if (z18 && iArr[width4] != 0) {
                    j2Var6 = new j2(fMin, height4, height5);
                }
                if (j2Var7 == null && z19 && iArr[width5] != 0) {
                    j2Var = new j2(fMin, height4, height5);
                }
                int i17 = height3;
                if (height5 == bitmap.getHeight() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (height5 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10) {
                    if (z17) {
                        j2Var6 = new j2(fMin, height4, height5);
                    }
                    if (j2Var != null) {
                        arrayList3.add(j2Var);
                    }
                    if (j2Var6 != null) {
                        arrayList4.add(j2Var6);
                    }
                    j2Var = null;
                    j2Var6 = null;
                }
                if (z11 || !z17) {
                    j2Var5 = j2Var;
                } else {
                    j2Var5 = new j2(fMin, height4, height5);
                }
                i16++;
                f12 = f16;
                bitmapCreateBitmap = bitmap;
                height3 = i17;
            }
            j2Var = j2Var7;
            int i18 = height3;
            if (height5 == bitmap.getHeight() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (height5 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z17) {
                    j2Var6 = new j2(fMin, height4, height5);
                }
                if (j2Var != null) {
                    arrayList3.add(j2Var);
                }
                if (j2Var6 != null) {
                    arrayList4.add(j2Var6);
                }
                j2Var = null;
                j2Var6 = null;
            }
            if (z11) {
                j2Var5 = j2Var;
            } else {
                j2Var5 = j2Var;
            }
            i16++;
            f12 = f16;
            bitmapCreateBitmap = bitmap;
            height3 = i18;
        }
        float f17 = f12;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Collections.reverse(arrayList2);
        Collections.reverse(arrayList3);
        linkedHashSet2.addAll(arrayList);
        linkedHashSet2.addAll(arrayList2);
        linkedHashSet.addAll(arrayList4);
        linkedHashSet.addAll(arrayList3);
        List listK = k(new ArrayList(linkedHashSet));
        List listK2 = k(new ArrayList(linkedHashSet2));
        Path path2 = new Path();
        int i19 = 0;
        while (true) {
            ArrayList arrayList5 = (ArrayList) listK2;
            if (i19 >= arrayList5.size()) {
                break;
            }
            j2 j2Var8 = (j2) arrayList5.get(i19);
            if (path2.isEmpty()) {
                path2.moveTo(((Point) j2Var8).x, ((Point) j2Var8).y);
            } else {
                path2.lineTo(((Point) j2Var8).x, ((Point) j2Var8).y);
            }
            i19 += 2;
        }
        Path path3 = new Path();
        int i20 = 0;
        while (true) {
            ArrayList arrayList6 = (ArrayList) listK;
            if (i20 >= arrayList6.size()) {
                break;
            }
            j2 j2Var9 = (j2) arrayList6.get(i20);
            if (path3.isEmpty()) {
                path3.moveTo(((Point) j2Var9).x, ((Point) j2Var9).y);
            } else {
                path3.lineTo(((Point) j2Var9).x, ((Point) j2Var9).y);
            }
            i20 += 2;
        }
        path.reset();
        path.op(path2, path3, Path.Op.INTERSECT);
        float fMin2 = Math.min(f13 / f15, f14 / f17);
        float f18 = f15 * fMin2;
        k2Var.f50492j = f18;
        float f19 = fMin2 * f17;
        k2Var.f50493k = f19;
        path.offset((-f18) / 2.0f, (-f19) / 2.0f);
        Paint paint = k2Var.f50500r;
        Paint paint2 = k2Var.f50499q;
        Paint paint3 = k2Var.f50498p;
        Paint paint4 = k2Var.f50501s;
        PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path, true);
        float length = pathMeasure.getLength();
        int iCeil = (int) Math.ceil(length / AndroidUtilities.dp(2.0f));
        k2Var.f50496n = iCeil;
        k2Var.f50497o = new float[iCeil * 2];
        float[] fArr = new float[2];
        int i21 = 0;
        while (true) {
            int i22 = k2Var.f50496n;
            if (i21 >= i22) {
                paint3.setStyle(Paint.Style.FILL);
                paint3.setColor(-1);
                Paint.Join join = Paint.Join.ROUND;
                paint3.setStrokeJoin(join);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint3.setStrokeCap(cap);
                paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(10.0f)));
                Paint.Style style = Paint.Style.STROKE;
                paint2.setStyle(style);
                paint2.setColor(-1);
                paint2.setStrokeJoin(join);
                paint2.setStrokeCap(cap);
                paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(10.0f)));
                paint.setStyle(style);
                paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
                paint.setColor(-1);
                paint.setStrokeCap(cap);
                float fDp = AndroidUtilities.dp(0.33f);
                BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                paint.setMaskFilter(new BlurMaskFilter(fDp, blur));
                paint4.setStyle(style);
                paint4.setColor(g6.l1(0.04f, -1));
                paint4.setStrokeCap(cap);
                paint4.setStrokeWidth(AndroidUtilities.dp(20.0f));
                paint4.setColor(g6.l1(0.04f, -1));
                paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(60.0f), blur));
                return;
            }
            pathMeasure.getPosTan(((i21 / i22) * length) % length, fArr, null);
            float[] fArr2 = k2Var.f50497o;
            int i23 = i21 * 2;
            fArr2[i23] = fArr[0];
            fArr2[i23 + 1] = fArr[1];
            i21++;
        }
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((j2) arrayList.get(0));
        int i10 = 1;
        while (i10 < arrayList.size() - 1) {
            j2 j2Var = (j2) arrayList.get(i10 - 1);
            j2 j2Var2 = (j2) arrayList.get(i10);
            i10++;
            j2 j2Var3 = (j2) arrayList.get(i10);
            int i11 = ((Point) j2Var2).x;
            int i12 = ((Point) j2Var).x;
            int i13 = ((Point) j2Var3).y;
            int i14 = ((Point) j2Var).y;
            if (Math.abs((((i13 - i14) * (i11 - i12)) - ((((Point) j2Var3).x - i12) * (((Point) j2Var2).y - i14))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(j2Var2);
            }
        }
        arrayList2.add((j2) i0.a.i(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final l2 l2Var = this.S;
        if (l2Var == null) {
            return;
        }
        final int i10 = UserConfig.selectedAccount;
        final int i11 = 1;
        l2Var.f50558o = true;
        if (l2Var.f50556m != null) {
            h();
            l2Var.f50556m.run(l2Var.f50547b, l2Var.f50549e.document);
            AndroidUtilities.runOnUIThread(new tq0(20), 250L);
            return;
        }
        final int i12 = 0;
        if (l2Var.f50554k != null) {
            TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
            tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(l2Var.f50554k, l2Var.f50548c).document;
            tL_stickers_replaceSticker.new_sticker = l2Var.f50549e;
            ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {

                public final n2 f50411b;

                {
                    this.f50411b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 0;
                            final n2 n2Var = this.f50411b;
                            final int i14 = i10;
                            final l2 l2Var2 = l2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i13) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var2 = n2Var;
                                            final l2 l2Var3 = l2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i15 = i14;
                                                MediaDataController.getInstance(i15).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i15).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                    MediaDataController.getInstance(i15).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                lh.t0 t0Var = n2Var2.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i16 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i17 = i16;
                                                        l2 l2Var4 = l2Var3;
                                                        TLObject tLObject3 = tLObject2;
                                                        n2 n2Var3 = n2Var2;
                                                        n2Var3.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var4.f50550f.document;
                                                                String str = l2Var4.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject3, document, str, bool);
                                                                n2Var3.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, l2Var4.f50550f.document, l2Var4.f50555l, Boolean.TRUE);
                                                                n2Var3.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var4.f50550f.document;
                                                                String str2 = l2Var4.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject3, document2, str2, bool2);
                                                                n2Var3.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                n2Var2.n(tL_error);
                                                n2Var2.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = l2Var3.f50557n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                l2Var3.f50557n = null;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var3 = n2Var;
                                            final l2 l2Var4 = l2Var2;
                                            if (z14) {
                                                int i17 = i14;
                                                MediaDataController.getInstance(i17).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i17).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                lh.t0 t0Var2 = n2Var3.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i18 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i19 = i18;
                                                        l2 l2Var5 = l2Var4;
                                                        TLObject tLObject4 = tLObject3;
                                                        n2 n2Var4 = n2Var3;
                                                        n2Var4.getClass();
                                                        switch (i19) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i110 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var5.f50550f.document;
                                                                String str = l2Var5.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i110, bool, tLObject4, document, str, bool);
                                                                n2Var4.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject4, l2Var5.f50550f.document, l2Var5.f50555l, Boolean.TRUE);
                                                                n2Var4.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i111 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var5.f50550f.document;
                                                                String str2 = l2Var5.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i111, bool2, tLObject4, document2, str2, bool2);
                                                                n2Var4.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                n2Var3.n(tL_error);
                                                n2Var3.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = l2Var4.f50557n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                l2Var4.f50557n = null;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var4 = n2Var;
                                            final l2 l2Var5 = l2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i14;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                lh.t0 t0Var3 = n2Var4.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i110 = i20;
                                                        l2 l2Var6 = l2Var5;
                                                        TLObject tLObject5 = tLObject4;
                                                        n2 n2Var5 = n2Var4;
                                                        n2Var5.getClass();
                                                        switch (i110) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i111 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var6.f50550f.document;
                                                                String str = l2Var6.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i111, bool, tLObject5, document, str, bool);
                                                                n2Var5.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var6.f50550f.document, l2Var6.f50555l, Boolean.TRUE);
                                                                n2Var5.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i112 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var6.f50550f.document;
                                                                String str2 = l2Var6.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i112, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var5.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                n2Var4.n(tL_error);
                                                n2Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = l2Var5.f50557n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                l2Var5.f50557n = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i15 = 1;
                            final n2 n2Var2 = this.f50411b;
                            final int i16 = i10;
                            final l2 l2Var3 = l2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i15) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var3 = n2Var2;
                                            final l2 l2Var4 = l2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i17 = i16;
                                                MediaDataController.getInstance(i17).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i17).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                    MediaDataController.getInstance(i17).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                lh.t0 t0Var = n2Var3.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i18 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i110 = i18;
                                                        l2 l2Var6 = l2Var4;
                                                        TLObject tLObject5 = tLObject2;
                                                        n2 n2Var5 = n2Var3;
                                                        n2Var5.getClass();
                                                        switch (i110) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i111 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var6.f50550f.document;
                                                                String str = l2Var6.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i111, bool, tLObject5, document, str, bool);
                                                                n2Var5.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var6.f50550f.document, l2Var6.f50555l, Boolean.TRUE);
                                                                n2Var5.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i112 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var6.f50550f.document;
                                                                String str2 = l2Var6.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i112, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var5.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                n2Var3.n(tL_error);
                                                n2Var3.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = l2Var4.f50557n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                l2Var4.f50557n = null;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var4 = n2Var2;
                                            final l2 l2Var5 = l2Var3;
                                            if (z14) {
                                                int i19 = i16;
                                                MediaDataController.getInstance(i19).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                lh.t0 t0Var2 = n2Var4.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i110 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i111 = i110;
                                                        l2 l2Var6 = l2Var5;
                                                        TLObject tLObject5 = tLObject3;
                                                        n2 n2Var5 = n2Var4;
                                                        n2Var5.getClass();
                                                        switch (i111) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i112 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var6.f50550f.document;
                                                                String str = l2Var6.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i112, bool, tLObject5, document, str, bool);
                                                                n2Var5.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var6.f50550f.document, l2Var6.f50555l, Boolean.TRUE);
                                                                n2Var5.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i113 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var6.f50550f.document;
                                                                String str2 = l2Var6.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i113, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var5.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                n2Var4.n(tL_error);
                                                n2Var4.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = l2Var5.f50557n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                l2Var5.f50557n = null;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var5 = n2Var2;
                                            final l2 l2Var6 = l2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i111 = i16;
                                                MediaDataController.getInstance(i111).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i111).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                    MediaDataController.getInstance(i111).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                lh.t0 t0Var3 = n2Var5.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i112 = i20;
                                                        l2 l2Var7 = l2Var6;
                                                        TLObject tLObject5 = tLObject4;
                                                        n2 n2Var6 = n2Var5;
                                                        n2Var6.getClass();
                                                        switch (i112) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i113 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var7.f50550f.document;
                                                                String str = l2Var7.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i113, bool, tLObject5, document, str, bool);
                                                                n2Var6.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var7.f50550f.document, l2Var7.f50555l, Boolean.TRUE);
                                                                n2Var6.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i114 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var7.f50550f.document;
                                                                String str2 = l2Var7.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i114, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var6.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                n2Var5.n(tL_error);
                                                n2Var5.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = l2Var6.f50557n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                l2Var6.f50557n = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i17 = 2;
                            final n2 n2Var3 = this.f50411b;
                            final int i18 = i10;
                            final l2 l2Var4 = l2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i17) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var4 = n2Var3;
                                            final l2 l2Var5 = l2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i19 = i18;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                lh.t0 t0Var = n2Var4.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i110 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i112 = i110;
                                                        l2 l2Var7 = l2Var5;
                                                        TLObject tLObject5 = tLObject2;
                                                        n2 n2Var6 = n2Var4;
                                                        n2Var6.getClass();
                                                        switch (i112) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i113 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var7.f50550f.document;
                                                                String str = l2Var7.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i113, bool, tLObject5, document, str, bool);
                                                                n2Var6.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var7.f50550f.document, l2Var7.f50555l, Boolean.TRUE);
                                                                n2Var6.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i114 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var7.f50550f.document;
                                                                String str2 = l2Var7.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i114, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var6.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                n2Var4.n(tL_error);
                                                n2Var4.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = l2Var5.f50557n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                l2Var5.f50557n = null;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var5 = n2Var3;
                                            final l2 l2Var6 = l2Var4;
                                            if (z14) {
                                                int i111 = i18;
                                                MediaDataController.getInstance(i111).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i111).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                lh.t0 t0Var2 = n2Var5.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i112 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i113 = i112;
                                                        l2 l2Var7 = l2Var6;
                                                        TLObject tLObject5 = tLObject3;
                                                        n2 n2Var6 = n2Var5;
                                                        n2Var6.getClass();
                                                        switch (i113) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i114 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var7.f50550f.document;
                                                                String str = l2Var7.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i114, bool, tLObject5, document, str, bool);
                                                                n2Var6.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var7.f50550f.document, l2Var7.f50555l, Boolean.TRUE);
                                                                n2Var6.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i115 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var7.f50550f.document;
                                                                String str2 = l2Var7.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i115, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var6.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                n2Var5.n(tL_error);
                                                n2Var5.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = l2Var6.f50557n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                l2Var6.f50557n = null;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var6 = n2Var3;
                                            final l2 l2Var7 = l2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i113 = i18;
                                                MediaDataController.getInstance(i113).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i113).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                    MediaDataController.getInstance(i113).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                lh.t0 t0Var3 = n2Var6.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i114 = i20;
                                                        l2 l2Var8 = l2Var7;
                                                        TLObject tLObject5 = tLObject4;
                                                        n2 n2Var7 = n2Var6;
                                                        n2Var7.getClass();
                                                        switch (i114) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i115 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var8.f50550f.document;
                                                                String str = l2Var8.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                n2Var7.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                n2Var7.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i116 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                String str2 = l2Var8.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var7.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                n2Var6.n(tL_error);
                                                n2Var6.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = l2Var7.f50557n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                l2Var7.f50557n = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (l2Var.d != null) {
            TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
            tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
            tL_stickers_createStickerSet.title = l2Var.d.toString();
            tL_stickers_createStickerSet.short_name = "";
            tL_stickers_createStickerSet.stickers.add(l2Var.f50549e);
            ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {

                public final n2 f50411b;

                {
                    this.f50411b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i13 = 0;
                            final n2 n2Var = this.f50411b;
                            final int i14 = i10;
                            final l2 l2Var2 = l2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i13) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var4 = n2Var;
                                            final l2 l2Var5 = l2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i19 = i14;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                lh.t0 t0Var = n2Var4.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i110 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i114 = i110;
                                                        l2 l2Var8 = l2Var5;
                                                        TLObject tLObject5 = tLObject2;
                                                        n2 n2Var7 = n2Var4;
                                                        n2Var7.getClass();
                                                        switch (i114) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i115 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var8.f50550f.document;
                                                                String str = l2Var8.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                n2Var7.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                n2Var7.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i116 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                String str2 = l2Var8.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var7.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                n2Var4.n(tL_error);
                                                n2Var4.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = l2Var5.f50557n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                l2Var5.f50557n = null;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var5 = n2Var;
                                            final l2 l2Var6 = l2Var2;
                                            if (z14) {
                                                int i111 = i14;
                                                MediaDataController.getInstance(i111).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i111).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                lh.t0 t0Var2 = n2Var5.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i112 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i114 = i112;
                                                        l2 l2Var8 = l2Var6;
                                                        TLObject tLObject5 = tLObject3;
                                                        n2 n2Var7 = n2Var5;
                                                        n2Var7.getClass();
                                                        switch (i114) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i115 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var8.f50550f.document;
                                                                String str = l2Var8.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                n2Var7.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                n2Var7.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i116 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                String str2 = l2Var8.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var7.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                n2Var5.n(tL_error);
                                                n2Var5.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = l2Var6.f50557n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                l2Var6.f50557n = null;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var6 = n2Var;
                                            final l2 l2Var7 = l2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i113 = i14;
                                                MediaDataController.getInstance(i113).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i113).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                    MediaDataController.getInstance(i113).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                lh.t0 t0Var3 = n2Var6.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i114 = i20;
                                                        l2 l2Var8 = l2Var7;
                                                        TLObject tLObject5 = tLObject4;
                                                        n2 n2Var7 = n2Var6;
                                                        n2Var7.getClass();
                                                        switch (i114) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i115 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var8.f50550f.document;
                                                                String str = l2Var8.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                n2Var7.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                n2Var7.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i116 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                String str2 = l2Var8.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var7.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                n2Var6.n(tL_error);
                                                n2Var6.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = l2Var7.f50557n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                l2Var7.f50557n = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i15 = 1;
                            final n2 n2Var2 = this.f50411b;
                            final int i16 = i10;
                            final l2 l2Var3 = l2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i15) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var4 = n2Var2;
                                            final l2 l2Var5 = l2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i19 = i16;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                lh.t0 t0Var = n2Var4.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i110 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i114 = i110;
                                                        l2 l2Var8 = l2Var5;
                                                        TLObject tLObject5 = tLObject2;
                                                        n2 n2Var7 = n2Var4;
                                                        n2Var7.getClass();
                                                        switch (i114) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i115 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var8.f50550f.document;
                                                                String str = l2Var8.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                n2Var7.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                n2Var7.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i116 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                String str2 = l2Var8.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var7.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                n2Var4.n(tL_error);
                                                n2Var4.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = l2Var5.f50557n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                l2Var5.f50557n = null;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var5 = n2Var2;
                                            final l2 l2Var6 = l2Var3;
                                            if (z14) {
                                                int i111 = i16;
                                                MediaDataController.getInstance(i111).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i111).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                lh.t0 t0Var2 = n2Var5.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i112 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i114 = i112;
                                                        l2 l2Var8 = l2Var6;
                                                        TLObject tLObject5 = tLObject3;
                                                        n2 n2Var7 = n2Var5;
                                                        n2Var7.getClass();
                                                        switch (i114) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i115 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var8.f50550f.document;
                                                                String str = l2Var8.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                n2Var7.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                n2Var7.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i116 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                String str2 = l2Var8.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var7.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                n2Var5.n(tL_error);
                                                n2Var5.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = l2Var6.f50557n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                l2Var6.f50557n = null;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var6 = n2Var2;
                                            final l2 l2Var7 = l2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i113 = i16;
                                                MediaDataController.getInstance(i113).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i113).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                    MediaDataController.getInstance(i113).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                lh.t0 t0Var3 = n2Var6.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i114 = i20;
                                                        l2 l2Var8 = l2Var7;
                                                        TLObject tLObject5 = tLObject4;
                                                        n2 n2Var7 = n2Var6;
                                                        n2Var7.getClass();
                                                        switch (i114) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i115 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var8.f50550f.document;
                                                                String str = l2Var8.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                n2Var7.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                n2Var7.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i116 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                String str2 = l2Var8.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var7.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                n2Var6.n(tL_error);
                                                n2Var6.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = l2Var7.f50557n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                l2Var7.f50557n = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i17 = 2;
                            final n2 n2Var3 = this.f50411b;
                            final int i18 = i10;
                            final l2 l2Var4 = l2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i17) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var4 = n2Var3;
                                            final l2 l2Var5 = l2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i19 = i18;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                lh.t0 t0Var = n2Var4.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i110 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i114 = i110;
                                                        l2 l2Var8 = l2Var5;
                                                        TLObject tLObject5 = tLObject2;
                                                        n2 n2Var7 = n2Var4;
                                                        n2Var7.getClass();
                                                        switch (i114) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i115 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var8.f50550f.document;
                                                                String str = l2Var8.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                n2Var7.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                n2Var7.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i116 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                String str2 = l2Var8.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var7.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                n2Var4.n(tL_error);
                                                n2Var4.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = l2Var5.f50557n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                l2Var5.f50557n = null;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var5 = n2Var3;
                                            final l2 l2Var6 = l2Var4;
                                            if (z14) {
                                                int i111 = i18;
                                                MediaDataController.getInstance(i111).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i111).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                lh.t0 t0Var2 = n2Var5.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i112 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i114 = i112;
                                                        l2 l2Var8 = l2Var6;
                                                        TLObject tLObject5 = tLObject3;
                                                        n2 n2Var7 = n2Var5;
                                                        n2Var7.getClass();
                                                        switch (i114) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i115 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var8.f50550f.document;
                                                                String str = l2Var8.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                n2Var7.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                n2Var7.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i116 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                String str2 = l2Var8.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var7.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                n2Var5.n(tL_error);
                                                n2Var5.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = l2Var6.f50557n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                l2Var6.f50557n = null;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final n2 n2Var6 = n2Var3;
                                            final l2 l2Var7 = l2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i113 = i18;
                                                MediaDataController.getInstance(i113).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i113).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                    MediaDataController.getInstance(i113).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                lh.t0 t0Var3 = n2Var6.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i114 = i20;
                                                        l2 l2Var8 = l2Var7;
                                                        TLObject tLObject5 = tLObject4;
                                                        n2 n2Var7 = n2Var6;
                                                        n2Var7.getClass();
                                                        switch (i114) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i115 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = l2Var8.f50550f.document;
                                                                String str = l2Var8.f50555l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                n2Var7.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                n2Var7.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i116 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                String str2 = l2Var8.f50555l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                n2Var7.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                n2Var6.n(tL_error);
                                                n2Var6.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = l2Var7.f50557n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                l2Var7.f50557n = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (l2Var.h) {
            h();
            NotificationCenter.getInstance(i10).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
            AndroidUtilities.runOnUIThread(new qf.b(l2Var, 26), 350L);
            Utilities.Callback callback = l2Var.f50557n;
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        if (l2Var.f50552i == 0) {
            if (l2Var.f50553j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(l2Var.f50553j);
                tL_stickers_addStickerToSet.sticker = l2Var.f50549e;
                final int i13 = 2;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {

                    public final n2 f50411b;

                    {
                        this.f50411b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i13) {
                            case 0:
                                final int i14 = 0;
                                final n2 n2Var = this.f50411b;
                                final int i15 = i10;
                                final l2 l2Var2 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i14) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var;
                                                final l2 l2Var5 = l2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i19 = i15;
                                                    MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    lh.t0 t0Var = n2Var4.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i110 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i114 = i110;
                                                            l2 l2Var8 = l2Var5;
                                                            TLObject tLObject5 = tLObject2;
                                                            n2 n2Var7 = n2Var4;
                                                            n2Var7.getClass();
                                                            switch (i114) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i115 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var8.f50550f.document;
                                                                    String str = l2Var8.f50555l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                    n2Var7.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                    n2Var7.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i116 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                    String str2 = l2Var8.f50555l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                    n2Var7.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = l2Var5.f50557n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    l2Var5.f50557n = null;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var5 = n2Var;
                                                final l2 l2Var6 = l2Var2;
                                                if (z14) {
                                                    int i111 = i15;
                                                    MediaDataController.getInstance(i111).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i111).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    lh.t0 t0Var2 = n2Var5.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i112 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i114 = i112;
                                                            l2 l2Var8 = l2Var6;
                                                            TLObject tLObject5 = tLObject3;
                                                            n2 n2Var7 = n2Var5;
                                                            n2Var7.getClass();
                                                            switch (i114) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i115 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var8.f50550f.document;
                                                                    String str = l2Var8.f50555l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                    n2Var7.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                    n2Var7.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i116 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                    String str2 = l2Var8.f50555l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                    n2Var7.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var5.n(tL_error);
                                                    n2Var5.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var6.f50557n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    l2Var6.f50557n = null;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var6 = n2Var;
                                                final l2 l2Var7 = l2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i113 = i15;
                                                    MediaDataController.getInstance(i113).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i113).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i113).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    lh.t0 t0Var3 = n2Var6.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i114 = i20;
                                                            l2 l2Var8 = l2Var7;
                                                            TLObject tLObject5 = tLObject4;
                                                            n2 n2Var7 = n2Var6;
                                                            n2Var7.getClass();
                                                            switch (i114) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i115 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var8.f50550f.document;
                                                                    String str = l2Var8.f50555l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                    n2Var7.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                    n2Var7.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i116 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                    String str2 = l2Var8.f50555l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                    n2Var7.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var6.n(tL_error);
                                                    n2Var6.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback4 = l2Var7.f50557n;
                                                if (callback4 != null) {
                                                    callback4.run(Boolean.valueOf(z12));
                                                    l2Var7.f50557n = null;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final int i16 = 1;
                                final n2 n2Var2 = this.f50411b;
                                final int i17 = i10;
                                final l2 l2Var3 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i16) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var2;
                                                final l2 l2Var5 = l2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i19 = i17;
                                                    MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    lh.t0 t0Var = n2Var4.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i110 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i114 = i110;
                                                            l2 l2Var8 = l2Var5;
                                                            TLObject tLObject5 = tLObject2;
                                                            n2 n2Var7 = n2Var4;
                                                            n2Var7.getClass();
                                                            switch (i114) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i115 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var8.f50550f.document;
                                                                    String str = l2Var8.f50555l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                    n2Var7.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                    n2Var7.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i116 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                    String str2 = l2Var8.f50555l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                    n2Var7.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = l2Var5.f50557n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    l2Var5.f50557n = null;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var5 = n2Var2;
                                                final l2 l2Var6 = l2Var3;
                                                if (z14) {
                                                    int i111 = i17;
                                                    MediaDataController.getInstance(i111).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i111).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    lh.t0 t0Var2 = n2Var5.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i112 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i114 = i112;
                                                            l2 l2Var8 = l2Var6;
                                                            TLObject tLObject5 = tLObject3;
                                                            n2 n2Var7 = n2Var5;
                                                            n2Var7.getClass();
                                                            switch (i114) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i115 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var8.f50550f.document;
                                                                    String str = l2Var8.f50555l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                    n2Var7.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                    n2Var7.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i116 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                    String str2 = l2Var8.f50555l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                    n2Var7.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var5.n(tL_error);
                                                    n2Var5.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var6.f50557n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    l2Var6.f50557n = null;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var6 = n2Var2;
                                                final l2 l2Var7 = l2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i113 = i17;
                                                    MediaDataController.getInstance(i113).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i113).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i113).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    lh.t0 t0Var3 = n2Var6.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i114 = i20;
                                                            l2 l2Var8 = l2Var7;
                                                            TLObject tLObject5 = tLObject4;
                                                            n2 n2Var7 = n2Var6;
                                                            n2Var7.getClass();
                                                            switch (i114) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i115 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var8.f50550f.document;
                                                                    String str = l2Var8.f50555l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                    n2Var7.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                    n2Var7.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i116 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                    String str2 = l2Var8.f50555l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                    n2Var7.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var6.n(tL_error);
                                                    n2Var6.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback4 = l2Var7.f50557n;
                                                if (callback4 != null) {
                                                    callback4.run(Boolean.valueOf(z12));
                                                    l2Var7.f50557n = null;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i18 = 2;
                                final n2 n2Var3 = this.f50411b;
                                final int i19 = i10;
                                final l2 l2Var4 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i18) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var3;
                                                final l2 l2Var5 = l2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i110 = i19;
                                                    MediaDataController.getInstance(i110).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i110).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i110).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    lh.t0 t0Var = n2Var4.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i111 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i114 = i111;
                                                            l2 l2Var8 = l2Var5;
                                                            TLObject tLObject5 = tLObject2;
                                                            n2 n2Var7 = n2Var4;
                                                            n2Var7.getClass();
                                                            switch (i114) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i115 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var8.f50550f.document;
                                                                    String str = l2Var8.f50555l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                    n2Var7.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                    n2Var7.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i116 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                    String str2 = l2Var8.f50555l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                    n2Var7.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = l2Var5.f50557n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    l2Var5.f50557n = null;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var5 = n2Var3;
                                                final l2 l2Var6 = l2Var4;
                                                if (z14) {
                                                    int i112 = i19;
                                                    MediaDataController.getInstance(i112).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i112).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    lh.t0 t0Var2 = n2Var5.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i113 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i114 = i113;
                                                            l2 l2Var8 = l2Var6;
                                                            TLObject tLObject5 = tLObject3;
                                                            n2 n2Var7 = n2Var5;
                                                            n2Var7.getClass();
                                                            switch (i114) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i115 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var8.f50550f.document;
                                                                    String str = l2Var8.f50555l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i115, bool, tLObject5, document, str, bool);
                                                                    n2Var7.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                    n2Var7.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i116 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                    String str2 = l2Var8.f50555l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i116, bool2, tLObject5, document2, str2, bool2);
                                                                    n2Var7.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var5.n(tL_error);
                                                    n2Var5.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var6.f50557n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    l2Var6.f50557n = null;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var6 = n2Var3;
                                                final l2 l2Var7 = l2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i114 = i19;
                                                    MediaDataController.getInstance(i114).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i114).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i114).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    lh.t0 t0Var3 = n2Var6.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i115 = i20;
                                                            l2 l2Var8 = l2Var7;
                                                            TLObject tLObject5 = tLObject4;
                                                            n2 n2Var7 = n2Var6;
                                                            n2Var7.getClass();
                                                            switch (i115) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i116 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var8.f50550f.document;
                                                                    String str = l2Var8.f50555l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i116, bool, tLObject5, document, str, bool);
                                                                    n2Var7.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, l2Var8.f50550f.document, l2Var8.f50555l, Boolean.TRUE);
                                                                    n2Var7.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i117 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var8.f50550f.document;
                                                                    String str2 = l2Var8.f50555l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i117, bool2, tLObject5, document2, str2, bool2);
                                                                    n2Var7.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var6.n(tL_error);
                                                    n2Var6.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback4 = l2Var7.f50557n;
                                                if (callback4 != null) {
                                                    callback4.run(Boolean.valueOf(z12));
                                                    l2Var7.f50557n = null;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        SendMessagesHelper.getInstance(i10).sendSticker(l2Var.f50550f.document, null, l2Var.f50552i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
        lh.t0 t0Var = this.W;
        if (t0Var != null) {
            t0Var.setProgress(1.0f);
        }
        AndroidUtilities.runOnUIThread(new we.a(this, i10, 4), 450L);
        Utilities.Callback callback2 = l2Var.f50557n;
        if (callback2 != null) {
            callback2.run(Boolean.TRUE);
            l2Var.f50557n = null;
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        this.E = null;
        if (this.D != null) {
            int i10 = 0;
            while (true) {
                k2[] k2VarArr = this.D;
                if (i10 >= k2VarArr.length) {
                    break;
                }
                k2 k2Var = k2VarArr[i10];
                if (k2Var != null) {
                    k2Var.f50494l.reset();
                    Bitmap bitmap = k2Var.f50488e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        k2Var.f50488e = null;
                    }
                    Bitmap bitmap2 = k2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        k2Var.d = null;
                    }
                    Bitmap bitmap3 = k2Var.f50490g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        k2Var.f50490g = null;
                    }
                    Bitmap bitmap4 = k2Var.f50489f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        k2Var.f50489f = null;
                    }
                }
                i10++;
            }
            this.D = null;
        }
        this.f50630y = false;
        this.f50629x = false;
        this.H = false;
        this.I.setAlpha(0.0f);
        this.I.setScaleX(0.3f);
        this.I.setScaleY(0.3f);
        l2 l2Var = this.S;
        if (l2Var != null) {
            if (!l2Var.f50558o) {
                l2Var.a();
            }
            this.S = null;
        }
        h();
        this.R = false;
    }

    public final Bitmap d(Bitmap bitmap, int i10, int i11, boolean z10) {
        Bitmap sourceBitmap = getSourceBitmap();
        if (bitmap == null || bitmap.isRecycled() || sourceBitmap == null) {
            return null;
        }
        Paint paint = new Paint(3);
        int width = sourceBitmap.getWidth();
        int height = sourceBitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (z10) {
            canvas.scale(bitmapCreateBitmap.getWidth() / bitmap.getWidth(), bitmapCreateBitmap.getHeight() / bitmap.getHeight());
            canvas.drawBitmap(bitmap, i10, i11, paint);
        } else {
            canvas.drawBitmap(bitmap, i10, i11, paint);
        }
        Utilities.stackBlurBitmap(bitmapCreateBitmap, 5);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), config);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        canvas2.drawBitmap(sourceBitmap, 0.0f, 0.0f, paint);
        Paint paint2 = new Paint(3);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l2 l2Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            l2 l2Var2 = this.S;
            if (l2Var2 == null || !str.equalsIgnoreCase(l2Var2.f50547b)) {
                return;
            }
            l2 l2Var3 = this.S;
            l2Var3.f50551g = inputFile;
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = l2Var3.f50551g;
            if (l2Var3.f50562s != null) {
                tL_inputMediaUploadedDocument.mime_type = "video/webm";
            } else {
                tL_inputMediaUploadedDocument.mime_type = "image/webp";
            }
            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
            tL_documentAttributeSticker.alt = l2Var3.f50548c;
            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
            tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new rc1(11, this, l2Var3), 2);
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            l2 l2Var4 = this.S;
            if (l2Var4 == null || !str2.equalsIgnoreCase(l2Var4.f50547b)) {
                return;
            }
            long jLongValue = ((Long) objArr[1]).longValue();
            long jLongValue2 = ((Long) objArr[2]).longValue();
            if (jLongValue2 > 0) {
                l2 l2Var5 = this.S;
                l2Var5.f50564u = Utilities.clamp(jLongValue / jLongValue2, 1.0f, l2Var5.f50564u);
                lh.t0 t0Var = this.W;
                if (t0Var != null) {
                    t0Var.setProgress(this.S.b());
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            l2 l2Var6 = this.S;
            if (l2Var6 == null || !str3.equalsIgnoreCase(l2Var6.f50547b)) {
                return;
            }
            h();
            return;
        }
        if (i10 == NotificationCenter.filePreparingStarted) {
            l2 l2Var7 = this.S;
            if (l2Var7 != null && objArr[0] == l2Var7.f50561r) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.S.f50547b, false, true, 67108864);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingFailed && (l2Var = this.S) != null && objArr[0] == l2Var.f50561r) {
                h();
                return;
            }
            return;
        }
        l2 l2Var8 = this.S;
        if (l2Var8 != null && objArr[0] == l2Var8.f50561r) {
            String str4 = (String) objArr[1];
            long jLongValue3 = ((Long) objArr[2]).longValue();
            long jLongValue4 = ((Long) objArr[3]).longValue();
            Float f10 = (Float) objArr[4];
            float fFloatValue = f10.floatValue();
            this.S.f50561r.videoEditedInfo.needUpdateProgress = true;
            FileLoader.getInstance(this.f50608a).checkUploadNewDataAvailable(str4, false, Math.max(1L, jLongValue3), jLongValue4, f10);
            l2 l2Var9 = this.S;
            l2Var9.f50563t = Math.max(l2Var9.f50563t, fFloatValue);
            lh.t0 t0Var2 = this.W;
            if (t0Var2 != null) {
                t0Var2.setProgress(this.S.b());
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.v, this.f50615e);
        canvas.drawPath(this.f50628w, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        this.f50622j0 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.f50623k0 = y10;
        if (this.D != null && this.J != null) {
            k2 k2VarJ = j(this.f50622j0, y10);
            int i10 = 0;
            while (true) {
                k2[] k2VarArr = this.D;
                if (i10 >= k2VarArr.length) {
                    break;
                }
                if (k2VarArr[i10] == k2VarJ && motionEvent.getAction() != 3) {
                    z10 = motionEvent.getAction() != 1;
                }
                if (z10 && !this.D[i10].f50486b) {
                    AndroidUtilities.vibrateCursor(this);
                }
                this.D[i10].f50486b = z10;
                i10++;
            }
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        k2 k2Var = this.A;
        if (k2Var != null) {
            this.G = bitmap;
            if (k2Var.f50489f != null && this.H) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                k2 k2Var2 = this.A;
                if (k2Var2.f50487c == 0) {
                    canvas.drawBitmap(k2Var2.a(), (Rect) null, rect, paint);
                    return bitmapCreateBitmap;
                }
                Matrix matrix = new Matrix();
                k2 k2Var3 = this.A;
                matrix.postRotate(k2Var3.f50487c, k2Var3.a().getWidth() / 2.0f, this.A.a().getHeight() / 2.0f);
                k2 k2Var4 = this.A;
                if ((k2Var4.f50487c / 90) % 2 != 0) {
                    float height = (k2Var4.b().getHeight() - this.A.b().getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                }
                matrix.postScale(bitmap.getWidth() / this.A.a().getHeight(), bitmap.getHeight() / this.A.a().getWidth());
                canvas.drawBitmap(this.A.a(), matrix, paint);
                return bitmapCreateBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f50610b.d(0.0f, false);
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.I;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(er.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        y5 y5Var = this.f50612c;
        y5Var.f34810a = viewGroup;
        boolean z12 = this.f50616e0;
        if (z12 || y5Var.f34812c > 0.0f) {
            float fE = viewGroup == null ? 1.0f : y5Var.e(z12 && !z11);
            k2[] k2VarArr = this.D;
            if (k2VarArr != null) {
                for (k2 k2Var : k2VarArr) {
                    if (k2Var != null && k2Var == this.A) {
                        float f10 = this.B;
                        if (f10 > 0.0f) {
                            if (k2Var.f50502t.f50619g0 == null) {
                                return;
                            }
                            canvas.save();
                            canvas.clipPath(k2Var.f50502t.f50619g0);
                            if (k2Var.f50502t.E != null) {
                                Paint paint = z10 ? k2Var.f50499q : k2Var.f50498p;
                                paint.setAlpha((int) (fE * 255.0f));
                                paint.setStrokeWidth(AndroidUtilities.dp(f10));
                                canvas.drawPath(k2Var.f50494l, paint);
                                if (k2Var.f50502t.f50619g0 != null && z10) {
                                    canvas.clipPath(k2Var.f50494l);
                                    paint.setStrokeWidth(AndroidUtilities.dp(f10 * 2.0f));
                                    canvas.drawPath(k2Var.f50502t.f50619g0, paint);
                                }
                            }
                            canvas.restore();
                            return;
                        }
                    }
                }
            }
        }
    }

    public float getSegmentBorderImageHeight() {
        return this.L;
    }

    public float getSegmentBorderImageWidth() {
        return this.K;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        k2 k2Var;
        if (!this.H || (k2Var = this.A) == null) {
            return null;
        }
        return k2Var.a();
    }

    public Bitmap getSourceBitmap() {
        return this.E;
    }

    public f01 getThanosEffect() {
        if (!f01.c()) {
            return null;
        }
        if (this.O == null) {
            f01 f01Var = new f01(getContext(), new e2(this, 1));
            this.O = f01Var;
            addView(f01Var, z5.c(-1.0f, -1));
        }
        return this.O;
    }

    public final void h() {
        lh.t0 t0Var = this.W;
        if (t0Var != null) {
            t0Var.a();
            this.W = null;
        }
    }

    public final boolean i() {
        return this.H;
    }

    public final k2 j(float f10, float f11) {
        int width;
        int height;
        if (this.E == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            k2[] k2VarArr = this.D;
            if (i10 >= k2VarArr.length) {
                return null;
            }
            k2 k2Var = k2VarArr[i10];
            if (k2Var != null) {
                if ((k2Var.f50487c / 90) % 2 != 0) {
                    width = this.E.getHeight();
                    height = this.E.getWidth();
                } else {
                    width = this.E.getWidth();
                    height = this.E.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.D[i10].f50491i;
                float f12 = width;
                float f13 = rectF2.left / f12;
                float f14 = this.f50611b0;
                float f15 = height;
                float f16 = rectF2.top / f15;
                float f17 = this.f50613c0;
                rectF.set(f13 * f14, f16 * f17, (rectF2.right / f12) * f14, (rectF2.bottom / f15) * f17);
                this.f50609a0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return k2Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        k2[] k2VarArr = this.D;
        if (k2VarArr != null) {
            for (k2 k2Var : k2VarArr) {
                if (k2Var != null && (bitmap = k2Var.f50488e) != null) {
                    bitmap.recycle();
                    k2Var.f50488e = null;
                    Bitmap bitmap2 = k2Var.f50490g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        k2Var.f50490g = null;
                    }
                    c(k2Var, this.P, this.Q);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, nq0 nq0Var) {
        fb.c cVar;
        int i13 = i11 <= 0 ? AndroidUtilities.displaySize.x : i11;
        int i14 = i12 <= 0 ? AndroidUtilities.displaySize.y : i12;
        this.P = i13;
        this.Q = i14;
        if (this.f50630y || this.f50629x || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        this.E = bitmap;
        this.F = i10;
        this.V = null;
        gh.q2 q2Var = new gh.q2(this, i10, nq0Var, 5);
        this.f50629x = true;
        jb.d dVar = new jb.d();
        dVar.f12886b = true;
        dVar.f12887c = true;
        zzd zzdVarA = o8.a(new jb.e(dVar));
        if (EmuDetector.with(getContext()).detect()) {
            ArrayList arrayList = new ArrayList();
            Bitmap bitmap2 = this.E;
            m2 m2Var = new m2();
            int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
            m2Var.f50577e = iMin;
            m2Var.d = iMin;
            m2Var.f50574a = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
            new Canvas(m2Var.f50574a).drawRect(0.0f, 0.0f, m2Var.d, m2Var.f50577e, g6.Jl);
            m2Var.f50575b = (bitmap2.getWidth() - m2Var.d) / 2;
            m2Var.f50576c = (bitmap2.getHeight() - m2Var.f50577e) / 2;
            arrayList.add(m2Var);
            q2Var.run(arrayList);
            return;
        }
        eb.a aVarA = eb.a.a(bitmap, i10);
        zzdVarA.g(aVarA).addOnSuccessListener(new t0.c(q2Var, 13)).addOnFailureListener(new gh.u2(this, bitmap, i10, nq0Var, q2Var, 6));
        if (this.V == null) {
            hb.b bVar = hb.b.f8861b;
            y5.l.i(bVar, "options cannot be null");
            synchronized (fb.c.class) {
                cVar = (fb.c) za.g.c().a(fb.c.class);
            }
            y9.b bVar2 = (y9.b) cVar.f6037a.get(hb.b.class);
            y5.l.h(bVar2);
            ib.d dVar2 = (ib.d) bVar2.get();
            dVar2.getClass();
            ka kaVar = dVar2.f11103c;
            com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
            mVar.f4604c = r7.TYPE_THIN;
            za.m.f50301a.execute(new bf.e(kaVar, new b6.a(mVar, 1), t7.ON_DEVICE_IMAGE_LABEL_CREATE, kaVar.b(), false, 5));
            new ImageLabelerImpl((za.e) dVar2.f11101a.G(bVar), (Executor) dVar2.f11102b.f50282a.get(), new v5.c("vision.ica", 1L)).g(aVarA).addOnSuccessListener(new t0.c(this, 14)).addOnFailureListener(new u3.k(18));
        }
        List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.f50608a).getEnabledReactionsList();
        for (int i15 = 0; i15 < Math.min(enabledReactionsList.size(), 9); i15++) {
            Emoji.getEmojiDrawable(enabledReactionsList.get(i15).reaction);
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error == null || "PACK_TITLE_INVALID".equals(tL_error.text)) {
            return;
        }
        new mc((FrameLayout) getParent(), this.T).t(tL_error.text, null).j();
    }

    public final void o() {
        Path path = this.f50619g0;
        if (path == null) {
            this.f50619g0 = new Path();
        } else {
            path.rewind();
        }
        if (this.f50620h0 == null) {
            this.f50620h0 = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.f50620h0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f50619g0.addPath(this.f50620h0, this.f50618f0);
        this.f50619g0.computeBounds(this.f50621i0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f50608a;
        if (i10 >= 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.f50608a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.f50608a).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.f50608a).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.f50608a).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.f50608a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float fDp = AndroidUtilities.dp(10.0f);
        float f10 = fDp * 2.0f;
        float measuredWidth = getMeasuredWidth() - f10;
        float measuredHeight = getMeasuredHeight() - f10;
        float f11 = measuredWidth / 8.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = measuredWidth + fDp;
        rectF.set(fDp, fDp, f12, f12);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.f50627s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.f50626r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.v;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f50628w;
        path4.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        path4.addRoundRect(rectF, f11, f11, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.I.setTranslationY(-((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f50624l0;
            arrayList.clear();
            if (this.f50616e0) {
                Rect rect = this.m0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final VideoEditedInfo videoEditedInfo, final String str2, final CharSequence charSequence, final boolean z10, final long j10, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final Utilities.Callback callback, final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                l2 l2Var;
                n2 n2Var = this.f50436a;
                Utilities.Callback callback3 = callback;
                boolean z11 = callback3 == null || (l2Var = n2Var.S) == null || !l2Var.f50558o;
                if (z11) {
                    l2 l2Var2 = n2Var.S;
                    if (l2Var2 != null) {
                        l2Var2.a();
                    }
                    l2 l2Var3 = new l2();
                    l2Var3.f50559p = new ArrayList();
                    l2Var3.f50560q = new ArrayList();
                    l2Var3.f50563t = 0.0f;
                    l2Var3.f50564u = 0.0f;
                    n2Var.S = l2Var3;
                }
                l2 l2Var4 = n2Var.S;
                l2Var4.f50548c = str2;
                String str4 = str;
                l2Var4.f50547b = str4;
                l2Var4.f50546a = str4;
                l2Var4.d = charSequence;
                l2Var4.h = z10;
                l2Var4.f50552i = j10;
                l2Var4.f50553j = stickerSet;
                l2Var4.f50554k = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                l2Var4.f50562s = videoEditedInfo2;
                l2Var4.f50555l = str3;
                l2Var4.f50557n = callback3;
                l2Var4.f50556m = callback2;
                ArrayList arrayList = l2Var4.f50560q;
                if (!TextUtils.isEmpty(str4)) {
                    l2Var4.f50559p.add(new File(l2Var4.f50547b));
                }
                if (!TextUtils.isEmpty(l2Var4.f50546a) && !TextUtils.equals(l2Var4.f50546a, l2Var4.f50547b)) {
                    arrayList.add(new File(l2Var4.f50546a));
                }
                if (!TextUtils.isEmpty(l2Var4.f50555l)) {
                    arrayList.add(new File(l2Var4.f50555l));
                }
                if (z11) {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        l2 l2Var5 = n2Var.S;
                        l2Var5.f50549e = MediaDataController.getInputStickerSetItem(document3, l2Var5.f50548c);
                        n2Var.S.f50550f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = n2Var.S.f50550f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        n2Var.a();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f22401id = 1;
                        l2 l2Var6 = n2Var.S;
                        String absolutePath = z7.w(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        l2Var6.f50547b = absolutePath;
                        n2Var.S.f50561r = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        n2Var.S.f50561r.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(n2Var.S.f50561r, false, false, false);
                    } else {
                        FileLoader.getInstance(n2Var.f50608a).uploadFile(str4, false, true, 67108864);
                    }
                } else {
                    n2Var.a();
                }
                if (callback3 == null) {
                    if (n2Var.W == null) {
                        n2Var.W = new lh.t0(n2Var.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    n2Var.W.setOnCancelListener(new e2(n2Var, 0));
                    if (n2Var.W.getParent() == null) {
                        n2Var.addView(n2Var.W, z5.e(-1, -1, 17));
                    }
                    lh.t0 t0Var = n2Var.W;
                    t0Var.A = true;
                    t0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i10) {
        int i11 = this.f50608a;
        if (i11 != i10) {
            if (i11 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f50608a).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f50608a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f50608a).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f50608a).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f50608a).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f50608a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.f50608a = i10;
            if (i10 < 0 || !isAttachedToWindow()) {
                return;
            }
            NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.f50608a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    public void setOutlineVisible(boolean z10) {
        if (this.f50616e0 == z10) {
            return;
        }
        this.f50616e0 = z10;
        this.f50614d0.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : AndroidUtilities.dp(-18.0f)).setInterpolator(er.h).setDuration(320L).start();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f50624l0;
            arrayList.clear();
            if (this.f50616e0) {
                Rect rect = this.m0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setOutlineWidth(float f10) {
        this.B = f10;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(d2 d2Var) {
        this.U = d2Var;
    }
}

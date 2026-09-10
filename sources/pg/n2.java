package pg;

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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.r9;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import di.v4;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.js0;
import org.telegram.ui.or0;
import org.telegram.ui.rg0;
import w7.a6;
import x7.fa;
import x7.m7;
import x7.o7;
public final class n2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int f40174r0 = 0;
    public k2 E;
    public float F;
    public boolean G;
    public k2[] H;
    public volatile Bitmap I;
    public int J;
    public Bitmap K;
    public boolean L;
    public final TextView M;
    public ValueAnimator N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public k11 S;
    public int T;
    public int U;
    public boolean V;
    public l2 W;
    public int f40175a;
    public final f6 f40176a0;
    public final d6 f40177b;
    public c2 f40178b0;
    public final d6 f40179c;
    public String f40180c0;
    public final Paint d;
    public bi.x0 f40181d0;
    public final Paint e;
    public final Matrix f40182e0;
    public final Paint f40183f;
    public float f40184f0;
    public float f40185g0;
    public final Paint h;
    public final w1 f40186h0;
    public boolean f40187i0;
    public final Matrix f40188j0;
    public Path f40189k0;
    public Path f40190l0;
    public final RectF m0;
    public final PathMeasure f40191n;
    public float f40192n0;
    public float f40193o0;
    public final ArrayList f40194p0;
    public final Rect f40195q0;
    public final Path f40196r;
    public final Path f40197s;
    public final Path v;
    public final Path f40198w;
    public volatile boolean f40199x;
    public volatile boolean f40200y;

    public n2(ContextThemeWrapper contextThemeWrapper, f6 f6Var) {
        super(contextThemeWrapper);
        this.f40175a = -1;
        wr wrVar = wr.h;
        this.f40177b = new d6(0.0f, (View) null, 0L, 420L, wrVar);
        this.f40179c = new d6(0.0f, (View) null, 0L, 420L, wrVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f40183f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f40191n = new PathMeasure();
        this.f40196r = new Path();
        this.f40197s = new Path();
        this.v = new Path();
        this.f40198w = new Path();
        this.F = 2.0f;
        this.f40182e0 = new Matrix();
        this.f40188j0 = new Matrix();
        this.m0 = new RectF();
        this.f40194p0 = new ArrayList();
        this.f40195q0 = new Rect();
        this.f40176a0 = f6Var;
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
        this.M = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, a6.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(4.0f), blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        w1 w1Var = new w1(contextThemeWrapper);
        this.f40186h0 = w1Var;
        w1Var.setAlpha(0.0f);
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.b(0.33f, 10.0f);
        w1Var.setBrushWeight(this.F);
        w1Var.setValueOverride(new l2.g(this, 14));
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.setAlpha(0.0f);
        addView(w1Var, a6.c(-1.0f, -1));
    }

    public static void c(pg.k2 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: pg.n2.c(pg.k2, int, int):void");
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
        arrayList2.add((j2) hc.b.i(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final l2 l2Var = this.W;
        if (l2Var != null) {
            final int i10 = UserConfig.selectedAccount;
            l2Var.f40114o = true;
            if (l2Var.f40112m != null) {
                h();
                l2Var.f40112m.run(l2Var.f40104b, l2Var.e.document);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(5), 250L);
            } else if (l2Var.f40110k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(l2Var.f40110k, l2Var.f40105c).document;
                tL_stickers_replaceSticker.new_sticker = l2Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final n2 f39993b;

                    {
                        this.f39993b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final n2 n2Var = this.f39993b;
                                final int i11 = i10;
                                final l2 l2Var2 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var2 = n2Var;
                                                final l2 l2Var3 = l2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i12 = i11;
                                                    MediaDataController.getInstance(i12).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i12).isStickerPackInstalled(tL_messages_stickerSet.set.f17222id)) {
                                                        MediaDataController.getInstance(i12).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var = n2Var2.f40181d0;
                                                    if (x0Var != null) {
                                                        x0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i13 = r4;
                                                            l2 l2Var4 = l2Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            n2 n2Var3 = n2Var2;
                                                            n2Var3.getClass();
                                                            switch (i13) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var4.f40106f.document;
                                                                    String str = l2Var4.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject3, document, str, bool);
                                                                    n2Var3.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, l2Var4.f40106f.document, l2Var4.f40111l, Boolean.TRUE);
                                                                    n2Var3.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var4.f40106f.document;
                                                                    String str2 = l2Var4.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject3, document2, str2, bool2);
                                                                    n2Var3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var2.n(tL_error);
                                                    n2Var2.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = l2Var3.f40113n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    l2Var3.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var3 = n2Var;
                                                final l2 l2Var4 = l2Var2;
                                                if (z14) {
                                                    int i13 = i11;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    bi.x0 x0Var2 = n2Var3.f40181d0;
                                                    if (x0Var2 != null) {
                                                        x0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            l2 l2Var42 = l2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            n2 n2Var32 = n2Var3;
                                                            n2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var42.f40106f.document;
                                                                    String str = l2Var42.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject32, document, str, bool);
                                                                    n2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var42.f40106f.document, l2Var42.f40111l, Boolean.TRUE);
                                                                    n2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var42.f40106f.document;
                                                                    String str2 = l2Var42.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var3.n(tL_error);
                                                    n2Var3.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = l2Var4.f40113n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    l2Var4.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var;
                                                final l2 l2Var5 = l2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f17222id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var3 = n2Var4.f40181d0;
                                                    if (x0Var3 != null) {
                                                        x0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            l2 l2Var42 = l2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            n2 n2Var32 = n2Var4;
                                                            n2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var42.f40106f.document;
                                                                    String str = l2Var42.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var42.f40106f.document, l2Var42.f40111l, Boolean.TRUE);
                                                                    n2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var42.f40106f.document;
                                                                    String str2 = l2Var42.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var5.f40113n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    l2Var5.f40113n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final n2 n2Var2 = this.f39993b;
                                final int i12 = i10;
                                final l2 l2Var3 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var22 = n2Var2;
                                                final l2 l2Var32 = l2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f17222id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var = n2Var22.f40181d0;
                                                    if (x0Var != null) {
                                                        x0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            l2 l2Var42 = l2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n2 n2Var32 = n2Var22;
                                                            n2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var42.f40106f.document;
                                                                    String str = l2Var42.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var42.f40106f.document, l2Var42.f40111l, Boolean.TRUE);
                                                                    n2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var42.f40106f.document;
                                                                    String str2 = l2Var42.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var22.n(tL_error);
                                                    n2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = l2Var32.f40113n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    l2Var32.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var3 = n2Var2;
                                                final l2 l2Var4 = l2Var3;
                                                if (z14) {
                                                    int i13 = i12;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    bi.x0 x0Var2 = n2Var3.f40181d0;
                                                    if (x0Var2 != null) {
                                                        x0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            l2 l2Var42 = l2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            n2 n2Var32 = n2Var3;
                                                            n2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var42.f40106f.document;
                                                                    String str = l2Var42.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var42.f40106f.document, l2Var42.f40111l, Boolean.TRUE);
                                                                    n2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var42.f40106f.document;
                                                                    String str2 = l2Var42.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var3.n(tL_error);
                                                    n2Var3.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = l2Var4.f40113n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    l2Var4.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var2;
                                                final l2 l2Var5 = l2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f17222id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var3 = n2Var4.f40181d0;
                                                    if (x0Var3 != null) {
                                                        x0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            l2 l2Var42 = l2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            n2 n2Var32 = n2Var4;
                                                            n2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var42.f40106f.document;
                                                                    String str = l2Var42.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var42.f40106f.document, l2Var42.f40111l, Boolean.TRUE);
                                                                    n2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var42.f40106f.document;
                                                                    String str2 = l2Var42.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var5.f40113n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    l2Var5.f40113n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final n2 n2Var3 = this.f39993b;
                                final int i13 = i10;
                                final l2 l2Var4 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var22 = n2Var3;
                                                final l2 l2Var32 = l2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f17222id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var = n2Var22.f40181d0;
                                                    if (x0Var != null) {
                                                        x0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            l2 l2Var42 = l2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n2 n2Var32 = n2Var22;
                                                            n2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var42.f40106f.document;
                                                                    String str = l2Var42.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var42.f40106f.document, l2Var42.f40111l, Boolean.TRUE);
                                                                    n2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var42.f40106f.document;
                                                                    String str2 = l2Var42.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var22.n(tL_error);
                                                    n2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = l2Var32.f40113n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    l2Var32.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var32 = n2Var3;
                                                final l2 l2Var42 = l2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    bi.x0 x0Var2 = n2Var32.f40181d0;
                                                    if (x0Var2 != null) {
                                                        x0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            n2 n2Var322 = n2Var32;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var32.n(tL_error);
                                                    n2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = l2Var42.f40113n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    l2Var42.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var3;
                                                final l2 l2Var5 = l2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f17222id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var3 = n2Var4.f40181d0;
                                                    if (x0Var3 != null) {
                                                        x0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            n2 n2Var322 = n2Var4;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var5.f40113n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    l2Var5.f40113n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            } else if (l2Var.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = l2Var.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(l2Var.e);
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final n2 f39993b;

                    {
                        this.f39993b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final n2 n2Var = this.f39993b;
                                final int i11 = i10;
                                final l2 l2Var2 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var22 = n2Var;
                                                final l2 l2Var32 = l2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f17222id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var = n2Var22.f40181d0;
                                                    if (x0Var != null) {
                                                        x0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n2 n2Var322 = n2Var22;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var22.n(tL_error);
                                                    n2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = l2Var32.f40113n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    l2Var32.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var32 = n2Var;
                                                final l2 l2Var42 = l2Var2;
                                                if (z14) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    bi.x0 x0Var2 = n2Var32.f40181d0;
                                                    if (x0Var2 != null) {
                                                        x0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            n2 n2Var322 = n2Var32;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var32.n(tL_error);
                                                    n2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = l2Var42.f40113n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    l2Var42.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var;
                                                final l2 l2Var5 = l2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f17222id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var3 = n2Var4.f40181d0;
                                                    if (x0Var3 != null) {
                                                        x0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            n2 n2Var322 = n2Var4;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var5.f40113n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    l2Var5.f40113n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final n2 n2Var2 = this.f39993b;
                                final int i12 = i10;
                                final l2 l2Var3 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var22 = n2Var2;
                                                final l2 l2Var32 = l2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f17222id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var = n2Var22.f40181d0;
                                                    if (x0Var != null) {
                                                        x0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n2 n2Var322 = n2Var22;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var22.n(tL_error);
                                                    n2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = l2Var32.f40113n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    l2Var32.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var32 = n2Var2;
                                                final l2 l2Var42 = l2Var3;
                                                if (z14) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    bi.x0 x0Var2 = n2Var32.f40181d0;
                                                    if (x0Var2 != null) {
                                                        x0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            n2 n2Var322 = n2Var32;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var32.n(tL_error);
                                                    n2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = l2Var42.f40113n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    l2Var42.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var2;
                                                final l2 l2Var5 = l2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f17222id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var3 = n2Var4.f40181d0;
                                                    if (x0Var3 != null) {
                                                        x0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            n2 n2Var322 = n2Var4;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var5.f40113n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    l2Var5.f40113n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final n2 n2Var3 = this.f39993b;
                                final int i13 = i10;
                                final l2 l2Var4 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var22 = n2Var3;
                                                final l2 l2Var32 = l2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f17222id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var = n2Var22.f40181d0;
                                                    if (x0Var != null) {
                                                        x0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n2 n2Var322 = n2Var22;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var22.n(tL_error);
                                                    n2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = l2Var32.f40113n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    l2Var32.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var32 = n2Var3;
                                                final l2 l2Var42 = l2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    bi.x0 x0Var2 = n2Var32.f40181d0;
                                                    if (x0Var2 != null) {
                                                        x0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            n2 n2Var322 = n2Var32;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var32.n(tL_error);
                                                    n2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = l2Var42.f40113n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    l2Var42.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var3;
                                                final l2 l2Var5 = l2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f17222id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var3 = n2Var4.f40181d0;
                                                    if (x0Var3 != null) {
                                                        x0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            n2 n2Var322 = n2Var4;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var5.f40113n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    l2Var5.f40113n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            } else if (l2Var.h) {
                h();
                NotificationCenter.getInstance(i10).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.x(l2Var, 23), 350L);
                Utilities.Callback callback = l2Var.f40113n;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
            } else if (l2Var.f40108i != 0) {
                SendMessagesHelper.getInstance(i10).sendSticker(l2Var.f40106f.document, null, l2Var.f40108i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                bi.x0 x0Var = this.f40181d0;
                if (x0Var != null) {
                    x0Var.setProgress(1.0f);
                }
                AndroidUtilities.runOnUIThread(new f2(this, i10, 0), 450L);
                Utilities.Callback callback2 = l2Var.f40113n;
                if (callback2 != null) {
                    callback2.run(Boolean.TRUE);
                    l2Var.f40113n = null;
                }
            } else if (l2Var.f40109j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(l2Var.f40109j);
                tL_stickers_addStickerToSet.sticker = l2Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final n2 f39993b;

                    {
                        this.f39993b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final n2 n2Var = this.f39993b;
                                final int i11 = i10;
                                final l2 l2Var2 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var22 = n2Var;
                                                final l2 l2Var32 = l2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f17222id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var2 = n2Var22.f40181d0;
                                                    if (x0Var2 != null) {
                                                        x0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n2 n2Var322 = n2Var22;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var22.n(tL_error);
                                                    n2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var32.f40113n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    l2Var32.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var32 = n2Var;
                                                final l2 l2Var42 = l2Var2;
                                                if (z14) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    bi.x0 x0Var22 = n2Var32.f40181d0;
                                                    if (x0Var22 != null) {
                                                        x0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            n2 n2Var322 = n2Var32;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var32.n(tL_error);
                                                    n2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = l2Var42.f40113n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    l2Var42.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var;
                                                final l2 l2Var5 = l2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f17222id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var3 = n2Var4.f40181d0;
                                                    if (x0Var3 != null) {
                                                        x0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            n2 n2Var322 = n2Var4;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = l2Var5.f40113n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    l2Var5.f40113n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final n2 n2Var2 = this.f39993b;
                                final int i12 = i10;
                                final l2 l2Var3 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var22 = n2Var2;
                                                final l2 l2Var32 = l2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f17222id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var2 = n2Var22.f40181d0;
                                                    if (x0Var2 != null) {
                                                        x0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n2 n2Var322 = n2Var22;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var22.n(tL_error);
                                                    n2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var32.f40113n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    l2Var32.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var32 = n2Var2;
                                                final l2 l2Var42 = l2Var3;
                                                if (z14) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    bi.x0 x0Var22 = n2Var32.f40181d0;
                                                    if (x0Var22 != null) {
                                                        x0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            n2 n2Var322 = n2Var32;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var32.n(tL_error);
                                                    n2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = l2Var42.f40113n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    l2Var42.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var2;
                                                final l2 l2Var5 = l2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f17222id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var3 = n2Var4.f40181d0;
                                                    if (x0Var3 != null) {
                                                        x0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            n2 n2Var322 = n2Var4;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = l2Var5.f40113n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    l2Var5.f40113n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final n2 n2Var3 = this.f39993b;
                                final int i13 = i10;
                                final l2 l2Var4 = l2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var22 = n2Var3;
                                                final l2 l2Var32 = l2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f17222id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var2 = n2Var22.f40181d0;
                                                    if (x0Var2 != null) {
                                                        x0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n2 n2Var322 = n2Var22;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    n2Var22.n(tL_error);
                                                    n2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = l2Var32.f40113n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    l2Var32.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var32 = n2Var3;
                                                final l2 l2Var42 = l2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    bi.x0 x0Var22 = n2Var32.f40181d0;
                                                    if (x0Var22 != null) {
                                                        x0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            n2 n2Var322 = n2Var32;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    n2Var32.n(tL_error);
                                                    n2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = l2Var42.f40113n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    l2Var42.f40113n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final n2 n2Var4 = n2Var3;
                                                final l2 l2Var5 = l2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f17222id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    bi.x0 x0Var3 = n2Var4.f40181d0;
                                                    if (x0Var3 != null) {
                                                        x0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            l2 l2Var422 = l2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            n2 n2Var322 = n2Var4;
                                                            n2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = l2Var422.f40106f.document;
                                                                    String str = l2Var422.f40111l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    n2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, l2Var422.f40106f.document, l2Var422.f40111l, Boolean.TRUE);
                                                                    n2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = l2Var422.f40106f.document;
                                                                    String str2 = l2Var422.f40111l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    n2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    n2Var4.n(tL_error);
                                                    n2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = l2Var5.f40113n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    l2Var5.f40113n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        this.I = null;
        if (this.H != null) {
            int i10 = 0;
            while (true) {
                k2[] k2VarArr = this.H;
                if (i10 >= k2VarArr.length) {
                    break;
                }
                k2 k2Var = k2VarArr[i10];
                if (k2Var != null) {
                    k2Var.f40083l.reset();
                    Bitmap bitmap = k2Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        k2Var.e = null;
                    }
                    Bitmap bitmap2 = k2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        k2Var.d = null;
                    }
                    Bitmap bitmap3 = k2Var.f40079g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        k2Var.f40079g = null;
                    }
                    Bitmap bitmap4 = k2Var.f40078f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        k2Var.f40078f = null;
                    }
                }
                i10++;
            }
            this.H = null;
        }
        this.f40200y = false;
        this.f40199x = false;
        this.L = false;
        this.M.setAlpha(0.0f);
        this.M.setScaleX(0.3f);
        this.M.setScaleY(0.3f);
        l2 l2Var = this.W;
        if (l2Var != null) {
            if (!l2Var.f40114o) {
                l2Var.a();
            }
            this.W = null;
        }
        h();
        this.V = false;
    }

    public final Bitmap d(Bitmap bitmap, int i10, int i11, boolean z10) {
        Bitmap sourceBitmap = getSourceBitmap();
        if (bitmap != null && !bitmap.isRecycled() && sourceBitmap != null) {
            Paint paint = new Paint(3);
            int width = sourceBitmap.getWidth();
            int height = sourceBitmap.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(createBitmap);
            if (z10) {
                canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                canvas.drawBitmap(bitmap, i10, i11, paint);
            } else {
                canvas.drawBitmap(bitmap, i10, i11, paint);
            }
            Utilities.stackBlurBitmap(createBitmap, 5);
            Bitmap createBitmap2 = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.drawBitmap(sourceBitmap, 0.0f, 0.0f, paint);
            Paint paint2 = new Paint(3);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
            createBitmap.recycle();
            return createBitmap2;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l2 l2Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            l2 l2Var2 = this.W;
            if (l2Var2 != null && str.equalsIgnoreCase(l2Var2.f40104b)) {
                l2 l2Var3 = this.W;
                l2Var3.f40107g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = l2Var3.f40107g;
                if (l2Var3.f40118s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = l2Var3.f40105c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new rg0(26, this, l2Var3), 2);
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            l2 l2Var4 = this.W;
            if (l2Var4 != null && str2.equalsIgnoreCase(l2Var4.f40104b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    l2 l2Var5 = this.W;
                    l2Var5.f40120u = Utilities.clamp(((float) longValue) / ((float) longValue2), 1.0f, l2Var5.f40120u);
                    bi.x0 x0Var = this.f40181d0;
                    if (x0Var != null) {
                        x0Var.setProgress(this.W.b());
                    }
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            l2 l2Var6 = this.W;
            if (l2Var6 != null && str3.equalsIgnoreCase(l2Var6.f40104b)) {
                h();
            }
        } else if (i10 == NotificationCenter.filePreparingStarted) {
            l2 l2Var7 = this.W;
            if (l2Var7 != null && objArr[0] == l2Var7.f40117r) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.W.f40104b, false, true, 67108864);
            }
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            l2 l2Var8 = this.W;
            if (l2Var8 != null && objArr[0] == l2Var8.f40117r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f7 = (Float) objArr[4];
                float floatValue = f7.floatValue();
                this.W.f40117r.videoEditedInfo.needUpdateProgress = true;
                FileLoader.getInstance(this.f40175a).checkUploadNewDataAvailable(str4, false, Math.max(1L, longValue3), longValue4, f7);
                l2 l2Var9 = this.W;
                l2Var9.f40119t = Math.max(l2Var9.f40119t, floatValue);
                bi.x0 x0Var2 = this.f40181d0;
                if (x0Var2 != null) {
                    x0Var2.setProgress(this.W.b());
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed && (l2Var = this.W) != null && objArr[0] == l2Var.f40117r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.v, this.e);
        canvas.drawPath(this.f40198w, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: pg.n2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        k2 k2Var = this.E;
        if (k2Var != null) {
            this.K = bitmap;
            if (k2Var.f40078f != null && this.L) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                k2 k2Var2 = this.E;
                if (k2Var2.f40077c != 0) {
                    Matrix matrix = new Matrix();
                    k2 k2Var3 = this.E;
                    matrix.postRotate(k2Var3.f40077c, k2Var3.a().getWidth() / 2.0f, this.E.a().getHeight() / 2.0f);
                    k2 k2Var4 = this.E;
                    if ((k2Var4.f40077c / 90) % 2 != 0) {
                        float height = (k2Var4.b().getHeight() - this.E.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.E.a().getHeight(), bitmap.getHeight() / this.E.a().getWidth());
                    canvas.drawBitmap(this.E.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(k2Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f40177b.d(0.0f, false);
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.M;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(wr.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        boolean z12;
        float e;
        float f7;
        Paint paint;
        d6 d6Var = this.f40179c;
        d6Var.f22293a = viewGroup;
        boolean z13 = this.f40187i0;
        if (z13 || d6Var.f22295c > 0.0f) {
            if (viewGroup == null) {
                e = 1.0f;
            } else {
                if (z13 && !z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e = d6Var.e(z12);
            }
            k2[] k2VarArr = this.H;
            if (k2VarArr != null) {
                for (k2 k2Var : k2VarArr) {
                    if (k2Var != null && k2Var == this.E) {
                        if (this.F > 0.0f) {
                            if (k2Var.f40091t.f40189k0 != null) {
                                canvas.save();
                                canvas.clipPath(k2Var.f40091t.f40189k0);
                                if (k2Var.f40091t.I != null) {
                                    if (z10) {
                                        paint = k2Var.f40088q;
                                    } else {
                                        paint = k2Var.f40087p;
                                    }
                                    paint.setAlpha((int) (e * 255.0f));
                                    paint.setStrokeWidth(AndroidUtilities.dp(f7));
                                    canvas.drawPath(k2Var.f40083l, paint);
                                    if (k2Var.f40091t.f40189k0 != null && z10) {
                                        canvas.clipPath(k2Var.f40083l);
                                        paint.setStrokeWidth(AndroidUtilities.dp(f7 * 2.0f));
                                        canvas.drawPath(k2Var.f40091t.f40189k0, paint);
                                    }
                                }
                                canvas.restore();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public float getSegmentBorderImageHeight() {
        return this.P;
    }

    public float getSegmentBorderImageWidth() {
        return this.O;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        k2 k2Var;
        if (this.L && (k2Var = this.E) != null) {
            return k2Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.I;
    }

    public k11 getThanosEffect() {
        if (!k11.c()) {
            return null;
        }
        if (this.S == null) {
            k11 k11Var = new k11(getContext(), new d2(this, 1));
            this.S = k11Var;
            addView(k11Var, a6.c(-1.0f, -1));
        }
        return this.S;
    }

    public final void h() {
        bi.x0 x0Var = this.f40181d0;
        if (x0Var != null) {
            x0Var.a();
            this.f40181d0 = null;
        }
    }

    public final boolean i() {
        return this.L;
    }

    public final k2 j(float f7, float f10) {
        int width;
        int height;
        if (this.I == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            k2[] k2VarArr = this.H;
            if (i10 >= k2VarArr.length) {
                return null;
            }
            k2 k2Var = k2VarArr[i10];
            if (k2Var != null) {
                if ((k2Var.f40077c / 90) % 2 != 0) {
                    width = this.I.getHeight();
                    height = this.I.getWidth();
                } else {
                    width = this.I.getWidth();
                    height = this.I.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.H[i10].f40080i;
                float f11 = width;
                float f12 = this.f40184f0;
                float f13 = height;
                float f14 = this.f40185g0;
                rectF.set((rectF2.left / f11) * f12, (rectF2.top / f13) * f14, (rectF2.right / f11) * f12, (rectF2.bottom / f13) * f14);
                this.f40182e0.mapRect(rectF);
                if (rectF.contains(f7, f10)) {
                    return k2Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        k2[] k2VarArr = this.H;
        if (k2VarArr != null) {
            for (k2 k2Var : k2VarArr) {
                if (k2Var != null && (bitmap = k2Var.e) != null) {
                    bitmap.recycle();
                    k2Var.e = null;
                    Bitmap bitmap2 = k2Var.f40079g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        k2Var.f40079g = null;
                    }
                    c(k2Var, this.T, this.U);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, or0 or0Var) {
        int i13;
        int i14;
        wb.c cVar;
        if (i11 <= 0) {
            i13 = AndroidUtilities.displaySize.x;
        } else {
            i13 = i11;
        }
        if (i12 <= 0) {
            i14 = AndroidUtilities.displaySize.y;
        } else {
            i14 = i12;
        }
        this.T = i13;
        this.U = i14;
        if (!this.f40200y && !this.f40199x && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.I = bitmap;
            this.J = i10;
            this.f40180c0 = null;
            v4 v4Var = new v4(this, i10, or0Var, 4);
            this.f40199x = true;
            ac.d dVar = new ac.d();
            dVar.f379b = true;
            dVar.f380c = true;
            zzd a2 = i8.d.a(new ac.e(dVar));
            if (EmuDetector.with(getContext()).detect()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.I;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.e = min;
                obj.d = min;
                obj.f40161a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f40161a).drawRect(0.0f, 0.0f, obj.d, obj.e, j6.Jl);
                obj.f40162b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f40163c = (bitmap2.getHeight() - obj.e) / 2;
                arrayList.add(obj);
                v4Var.run(arrayList);
                return;
            }
            vb.a a10 = vb.a.a(bitmap, i10);
            a2.g(a10).addOnSuccessListener(new org.telegram.tgnet.j(v4Var, 13)).addOnFailureListener(new org.telegram.ui.Components.f2(this, bitmap, i10, or0Var, v4Var, 4));
            if (this.f40180c0 == null) {
                yb.a aVar = yb.a.f46813b;
                n6.l.i(aVar, "options cannot be null");
                synchronized (wb.c.class) {
                    cVar = (wb.c) qb.g.c().a(wb.c.class);
                }
                pa.b bVar = (pa.b) cVar.f43968a.get(yb.a.class);
                n6.l.h(bVar);
                zb.d dVar2 = (zb.d) bVar.get();
                dVar2.getClass();
                fa faVar = dVar2.f47972c;
                ?? obj2 = new Object();
                obj2.f6105c = m7.TYPE_THIN;
                qb.m.f40631a.execute(new com.google.android.gms.internal.cast.p(faVar, new a5.a((com.google.firebase.messaging.n) obj2, 1), o7.ON_DEVICE_IMAGE_LABEL_CREATE, faVar.b(), 7));
                new ImageLabelerImpl((qb.e) dVar2.f47970a.O0(aVar), (Executor) dVar2.f47971b.f40612a.get(), new k6.c("vision.ica", 1L)).g(a10).addOnSuccessListener(new org.telegram.tgnet.j(this, 14)).addOnFailureListener(new js0(12));
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.f40175a).getEnabledReactionsList();
            for (int i15 = 0; i15 < Math.min(enabledReactionsList.size(), 9); i15++) {
                Emoji.getEmojiDrawable(enabledReactionsList.get(i15).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new wc((FrameLayout) getParent(), this.f40176a0).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f40189k0;
        if (path == null) {
            this.f40189k0 = new Path();
        } else {
            path.rewind();
        }
        if (this.f40190l0 == null) {
            this.f40190l0 = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.f40190l0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f40189k0.addPath(this.f40190l0, this.f40188j0);
        this.f40189k0.computeBounds(this.m0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f40175a;
        if (i10 >= 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.f40175a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.f40175a).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.f40175a).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.f40175a).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.f40175a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(10.0f);
        float f7 = dp * 2.0f;
        float measuredWidth = getMeasuredWidth() - f7;
        float measuredHeight = getMeasuredHeight() - f7;
        float f10 = measuredWidth / 8.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = measuredWidth + dp;
        rectF.set(dp, dp, f11, f11);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.f40197s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        Path path2 = this.f40196r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.v;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f40198w;
        path4.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        path4.addRoundRect(rectF, f10, f10, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.M.setTranslationY(-((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f40194p0;
            arrayList.clear();
            if (this.f40187i0) {
                Rect rect = this.f40195q0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final VideoEditedInfo videoEditedInfo, final String str2, final CharSequence charSequence, final boolean z10, final long j3, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final Utilities.Callback callback, final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                boolean z11;
                l2 l2Var;
                n2 n2Var = n2.this;
                Utilities.Callback callback3 = callback;
                if (callback3 != null && (l2Var = n2Var.W) != null && l2Var.f40114o) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    l2 l2Var2 = n2Var.W;
                    if (l2Var2 != null) {
                        l2Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f40115p = new ArrayList();
                    obj.f40116q = new ArrayList();
                    obj.f40119t = 0.0f;
                    obj.f40120u = 0.0f;
                    n2Var.W = obj;
                }
                l2 l2Var3 = n2Var.W;
                l2Var3.f40105c = str2;
                String str4 = str;
                l2Var3.f40104b = str4;
                l2Var3.f40103a = str4;
                l2Var3.d = charSequence;
                l2Var3.h = z10;
                l2Var3.f40108i = j3;
                l2Var3.f40109j = stickerSet;
                l2Var3.f40110k = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                l2Var3.f40118s = videoEditedInfo2;
                l2Var3.f40111l = str3;
                l2Var3.f40113n = callback3;
                l2Var3.f40112m = callback2;
                ArrayList arrayList = l2Var3.f40116q;
                if (!TextUtils.isEmpty(str4)) {
                    l2Var3.f40115p.add(new File(l2Var3.f40104b));
                }
                if (!TextUtils.isEmpty(l2Var3.f40103a) && !TextUtils.equals(l2Var3.f40103a, l2Var3.f40104b)) {
                    arrayList.add(new File(l2Var3.f40103a));
                }
                if (!TextUtils.isEmpty(l2Var3.f40111l)) {
                    arrayList.add(new File(l2Var3.f40111l));
                }
                if (!z11) {
                    n2Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        l2 l2Var4 = n2Var.W;
                        l2Var4.e = MediaDataController.getInputStickerSetItem(document3, l2Var4.f40105c);
                        n2Var.W.f40106f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = n2Var.W.f40106f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        n2Var.a();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f17216id = 1;
                        l2 l2Var5 = n2Var.W;
                        String absolutePath = r9.w(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        l2Var5.f40104b = absolutePath;
                        n2Var.W.f40117r = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        n2Var.W.f40117r.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(n2Var.W.f40117r, false, false, false);
                    } else {
                        FileLoader.getInstance(n2Var.f40175a).uploadFile(str4, false, true, 67108864);
                    }
                }
                if (callback3 == null) {
                    if (n2Var.f40181d0 == null) {
                        n2Var.f40181d0 = new bi.x0(n2Var.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    n2Var.f40181d0.setOnCancelListener(new d2(n2Var, 0));
                    if (n2Var.f40181d0.getParent() == null) {
                        n2Var.addView(n2Var.f40181d0, a6.e(-1, -1, 17));
                    }
                    bi.x0 x0Var = n2Var.f40181d0;
                    x0Var.E = true;
                    x0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i10) {
        int i11 = this.f40175a;
        if (i11 != i10) {
            if (i11 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f40175a).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f40175a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f40175a).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f40175a).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f40175a).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f40175a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.f40175a = i10;
            if (i10 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f40175a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
        }
    }

    public void setOutlineVisible(boolean z10) {
        float f7;
        if (this.f40187i0 != z10) {
            this.f40187i0 = z10;
            ViewPropertyAnimator animate = this.f40186h0.animate();
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (!z10) {
                f10 = AndroidUtilities.dp(-18.0f);
            }
            alpha.translationX(f10).setInterpolator(wr.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f40194p0;
                arrayList.clear();
                if (this.f40187i0) {
                    Rect rect = this.f40195q0;
                    arrayList.add(rect);
                    int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                    rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
                }
                setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    public void setOutlineWidth(float f7) {
        this.F = f7;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(c2 c2Var) {
        this.f40178b0 = c2Var;
    }
}

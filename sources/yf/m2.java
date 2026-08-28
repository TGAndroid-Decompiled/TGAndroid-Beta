package yf;

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
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import f7.m8;
import fh.z2;
import g7.e6;
import h7.ka;
import h7.r7;
import h7.t7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kh.a8;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.y5;
import org.telegram.ui.lj0;
import org.telegram.ui.mq0;
import org.telegram.ui.o71;
public final class m2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int f49981n0 = 0;
    public j2 A;
    public float B;
    public boolean C;
    public j2[] D;
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
    public d01 O;
    public int P;
    public int Q;
    public boolean R;
    public k2 S;
    public final b6 T;
    public c2 U;
    public String V;
    public kh.u0 W;
    public int f49982a;
    public final Matrix f49983a0;
    public final y5 f49984b;
    public float f49985b0;
    public final y5 f49986c;
    public float f49987c0;
    public final Paint d;
    public final w1 f49988d0;
    public final Paint f49989e;
    public boolean f49990e0;
    public final Paint f49991f;
    public final Matrix f49992f0;
    public Path f49993g0;
    public final Paint h;
    public Path f49994h0;
    public final RectF f49995i0;
    public float f49996j0;
    public float f49997k0;
    public final ArrayList f49998l0;
    public final Rect m0;
    public final PathMeasure f49999n;
    public final Path f50000r;
    public final Path f50001s;
    public final Path v;
    public final Path f50002w;
    public volatile boolean f50003x;
    public volatile boolean f50004y;

    public m2(ContextThemeWrapper contextThemeWrapper, b6 b6Var) {
        super(contextThemeWrapper);
        this.f49982a = -1;
        gr grVar = gr.h;
        this.f49984b = new y5(0.0f, (View) null, 0L, 420L, grVar);
        this.f49986c = new y5(0.0f, (View) null, 0L, 420L, grVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f49989e = paint2;
        Paint paint3 = new Paint(1);
        this.f49991f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f49999n = new PathMeasure();
        this.f50000r = new Path();
        this.f50001s = new Path();
        this.v = new Path();
        this.f50002w = new Path();
        this.B = 2.0f;
        this.f49983a0 = new Matrix();
        this.f49992f0 = new Matrix();
        this.f49995i0 = new RectF();
        this.f49998l0 = new ArrayList();
        this.m0 = new Rect();
        this.T = b6Var;
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
        addView(textView, e6.e(-2, -2, 17));
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
        this.f49988d0 = w1Var;
        w1Var.setAlpha(0.0f);
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.b(0.33f, 10.0f);
        w1Var.setBrushWeight(this.B);
        w1Var.setValueOverride(new n5.e0(this, 27));
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.setAlpha(0.0f);
        addView(w1Var, e6.c(-1.0f, -1));
    }

    public static void c(yf.j2 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: yf.m2.c(yf.j2, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((i2) arrayList.get(0));
        int i9 = 1;
        while (i9 < arrayList.size() - 1) {
            i2 i2Var = (i2) arrayList.get(i9 - 1);
            i2 i2Var2 = (i2) arrayList.get(i9);
            i9++;
            i2 i2Var3 = (i2) arrayList.get(i9);
            int i10 = ((Point) i2Var2).x;
            int i11 = ((Point) i2Var).x;
            int i12 = ((Point) i2Var3).y;
            int i13 = ((Point) i2Var).y;
            if (Math.abs((((i12 - i13) * (i10 - i11)) - ((((Point) i2Var3).x - i11) * (((Point) i2Var2).y - i13))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(i2Var2);
            }
        }
        arrayList2.add((i2) j3.r0.j(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final k2 k2Var = this.S;
        if (k2Var != null) {
            final int i9 = UserConfig.selectedAccount;
            k2Var.f49918o = true;
            if (k2Var.f49916m != null) {
                h();
                k2Var.f49916m.run(k2Var.f49907b, k2Var.f49909e.document);
                AndroidUtilities.runOnUIThread(new lj0(19), 250L);
            } else if (k2Var.f49914k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(k2Var.f49914k, k2Var.f49908c).document;
                tL_stickers_replaceSticker.new_sticker = k2Var.f49909e;
                ConnectionsManager.getInstance(i9).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final m2 f49807b;

                    {
                        this.f49807b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final m2 m2Var = this.f49807b;
                                final int i10 = i9;
                                final k2 k2Var2 = k2Var;
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
                                                final m2 m2Var2 = m2Var;
                                                final k2 k2Var3 = k2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i11 = i10;
                                                    MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i11).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var = m2Var2.W;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i12 = r4;
                                                            k2 k2Var4 = k2Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            m2 m2Var3 = m2Var2;
                                                            m2Var3.getClass();
                                                            switch (i12) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i13 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var4.f49910f.document;
                                                                    String str = k2Var4.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i13, bool, tLObject3, document, str, bool);
                                                                    m2Var3.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, k2Var4.f49910f.document, k2Var4.f49915l, Boolean.TRUE);
                                                                    m2Var3.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var4.f49910f.document;
                                                                    String str2 = k2Var4.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject3, document2, str2, bool2);
                                                                    m2Var3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    m2Var2.n(tL_error);
                                                    m2Var2.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = k2Var3.f49917n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var3.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var3 = m2Var;
                                                final k2 k2Var4 = k2Var2;
                                                if (z14) {
                                                    int i12 = i10;
                                                    MediaDataController.getInstance(i12).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i12).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    kh.u0 u0Var2 = m2Var3.W;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            k2 k2Var42 = k2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var32 = m2Var3;
                                                            m2Var32.getClass();
                                                            switch (i122) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i13 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f49910f.document;
                                                                    String str = k2Var42.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i13, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f49910f.document, k2Var42.f49915l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f49910f.document;
                                                                    String str2 = k2Var42.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    m2Var3.n(tL_error);
                                                    m2Var3.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = k2Var4.f49917n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var4.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var4 = m2Var;
                                                final k2 k2Var5 = k2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var3 = m2Var4.W;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            k2 k2Var42 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var32 = m2Var4;
                                                            m2Var32.getClass();
                                                            switch (i122) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f49910f.document;
                                                                    String str = k2Var42.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f49910f.document, k2Var42.f49915l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f49910f.document;
                                                                    String str2 = k2Var42.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    m2Var4.n(tL_error);
                                                    m2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = k2Var5.f49917n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f49917n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final m2 m2Var2 = this.f49807b;
                                final int i11 = i9;
                                final k2 k2Var3 = k2Var;
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
                                                final m2 m2Var22 = m2Var2;
                                                final k2 k2Var32 = k2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    MediaDataController.getInstance(i112).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i112).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i112).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var = m2Var22.W;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            k2 k2Var42 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var32 = m2Var22;
                                                            m2Var32.getClass();
                                                            switch (i122) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f49910f.document;
                                                                    String str = k2Var42.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f49910f.document, k2Var42.f49915l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f49910f.document;
                                                                    String str2 = k2Var42.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    m2Var22.n(tL_error);
                                                    m2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = k2Var32.f49917n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var32.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var3 = m2Var2;
                                                final k2 k2Var4 = k2Var3;
                                                if (z14) {
                                                    int i12 = i11;
                                                    MediaDataController.getInstance(i12).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i12).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    kh.u0 u0Var2 = m2Var3.W;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            k2 k2Var42 = k2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var32 = m2Var3;
                                                            m2Var32.getClass();
                                                            switch (i122) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f49910f.document;
                                                                    String str = k2Var42.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f49910f.document, k2Var42.f49915l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f49910f.document;
                                                                    String str2 = k2Var42.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    m2Var3.n(tL_error);
                                                    m2Var3.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = k2Var4.f49917n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var4.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var4 = m2Var2;
                                                final k2 k2Var5 = k2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var3 = m2Var4.W;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            k2 k2Var42 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var32 = m2Var4;
                                                            m2Var32.getClass();
                                                            switch (i122) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f49910f.document;
                                                                    String str = k2Var42.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f49910f.document, k2Var42.f49915l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f49910f.document;
                                                                    String str2 = k2Var42.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    m2Var4.n(tL_error);
                                                    m2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = k2Var5.f49917n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f49917n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final m2 m2Var3 = this.f49807b;
                                final int i12 = i9;
                                final k2 k2Var4 = k2Var;
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
                                                final m2 m2Var22 = m2Var3;
                                                final k2 k2Var32 = k2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    MediaDataController.getInstance(i112).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i112).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i112).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var = m2Var22.W;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            k2 k2Var42 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var32 = m2Var22;
                                                            m2Var32.getClass();
                                                            switch (i122) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f49910f.document;
                                                                    String str = k2Var42.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f49910f.document, k2Var42.f49915l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f49910f.document;
                                                                    String str2 = k2Var42.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    m2Var22.n(tL_error);
                                                    m2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = k2Var32.f49917n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var32.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var3;
                                                final k2 k2Var42 = k2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    kh.u0 u0Var2 = m2Var32.W;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    m2Var32.n(tL_error);
                                                    m2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = k2Var42.f49917n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var42.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var4 = m2Var3;
                                                final k2 k2Var5 = k2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var3 = m2Var4.W;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    m2Var4.n(tL_error);
                                                    m2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = k2Var5.f49917n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f49917n = null;
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
            } else if (k2Var.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = k2Var.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(k2Var.f49909e);
                ConnectionsManager.getInstance(i9).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final m2 f49807b;

                    {
                        this.f49807b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final m2 m2Var = this.f49807b;
                                final int i10 = i9;
                                final k2 k2Var2 = k2Var;
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
                                                final m2 m2Var22 = m2Var;
                                                final k2 k2Var32 = k2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    MediaDataController.getInstance(i112).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i112).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i112).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var = m2Var22.W;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    m2Var22.n(tL_error);
                                                    m2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = k2Var32.f49917n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var32.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var;
                                                final k2 k2Var42 = k2Var2;
                                                if (z14) {
                                                    int i122 = i10;
                                                    MediaDataController.getInstance(i122).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    kh.u0 u0Var2 = m2Var32.W;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    m2Var32.n(tL_error);
                                                    m2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = k2Var42.f49917n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var42.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var4 = m2Var;
                                                final k2 k2Var5 = k2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var3 = m2Var4.W;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    m2Var4.n(tL_error);
                                                    m2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = k2Var5.f49917n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f49917n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final m2 m2Var2 = this.f49807b;
                                final int i11 = i9;
                                final k2 k2Var3 = k2Var;
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
                                                final m2 m2Var22 = m2Var2;
                                                final k2 k2Var32 = k2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    MediaDataController.getInstance(i112).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i112).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i112).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var = m2Var22.W;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    m2Var22.n(tL_error);
                                                    m2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = k2Var32.f49917n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var32.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var2;
                                                final k2 k2Var42 = k2Var3;
                                                if (z14) {
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    kh.u0 u0Var2 = m2Var32.W;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    m2Var32.n(tL_error);
                                                    m2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = k2Var42.f49917n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var42.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var4 = m2Var2;
                                                final k2 k2Var5 = k2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var3 = m2Var4.W;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    m2Var4.n(tL_error);
                                                    m2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = k2Var5.f49917n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f49917n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final m2 m2Var3 = this.f49807b;
                                final int i12 = i9;
                                final k2 k2Var4 = k2Var;
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
                                                final m2 m2Var22 = m2Var3;
                                                final k2 k2Var32 = k2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    MediaDataController.getInstance(i112).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i112).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i112).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var = m2Var22.W;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    m2Var22.n(tL_error);
                                                    m2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = k2Var32.f49917n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var32.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var3;
                                                final k2 k2Var42 = k2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    kh.u0 u0Var2 = m2Var32.W;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    m2Var32.n(tL_error);
                                                    m2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = k2Var42.f49917n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var42.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var4 = m2Var3;
                                                final k2 k2Var5 = k2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var3 = m2Var4.W;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    m2Var4.n(tL_error);
                                                    m2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = k2Var5.f49917n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f49917n = null;
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
            } else if (k2Var.h) {
                h();
                NotificationCenter.getInstance(i9).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
                AndroidUtilities.runOnUIThread(new pf.o1(k2Var, 19), 350L);
                Utilities.Callback callback = k2Var.f49917n;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
            } else if (k2Var.f49912i != 0) {
                SendMessagesHelper.getInstance(i9).sendSticker(k2Var.f49910f.document, null, k2Var.f49912i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                kh.u0 u0Var = this.W;
                if (u0Var != null) {
                    u0Var.setProgress(1.0f);
                }
                AndroidUtilities.runOnUIThread(new ve.a(this, i9, 4), 450L);
                Utilities.Callback callback2 = k2Var.f49917n;
                if (callback2 != null) {
                    callback2.run(Boolean.TRUE);
                    k2Var.f49917n = null;
                }
            } else if (k2Var.f49913j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(k2Var.f49913j);
                tL_stickers_addStickerToSet.sticker = k2Var.f49909e;
                ConnectionsManager.getInstance(i9).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final m2 f49807b;

                    {
                        this.f49807b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final m2 m2Var = this.f49807b;
                                final int i10 = i9;
                                final k2 k2Var2 = k2Var;
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
                                                final m2 m2Var22 = m2Var;
                                                final k2 k2Var32 = k2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    MediaDataController.getInstance(i112).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i112).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i112).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var2 = m2Var22.W;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    m2Var22.n(tL_error);
                                                    m2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = k2Var32.f49917n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    k2Var32.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var;
                                                final k2 k2Var42 = k2Var2;
                                                if (z14) {
                                                    int i122 = i10;
                                                    MediaDataController.getInstance(i122).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    kh.u0 u0Var22 = m2Var32.W;
                                                    if (u0Var22 != null) {
                                                        u0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    m2Var32.n(tL_error);
                                                    m2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = k2Var42.f49917n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    k2Var42.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var4 = m2Var;
                                                final k2 k2Var5 = k2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var3 = m2Var4.W;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    m2Var4.n(tL_error);
                                                    m2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = k2Var5.f49917n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    k2Var5.f49917n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final m2 m2Var2 = this.f49807b;
                                final int i11 = i9;
                                final k2 k2Var3 = k2Var;
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
                                                final m2 m2Var22 = m2Var2;
                                                final k2 k2Var32 = k2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    MediaDataController.getInstance(i112).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i112).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i112).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var2 = m2Var22.W;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    m2Var22.n(tL_error);
                                                    m2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = k2Var32.f49917n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    k2Var32.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var2;
                                                final k2 k2Var42 = k2Var3;
                                                if (z14) {
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    kh.u0 u0Var22 = m2Var32.W;
                                                    if (u0Var22 != null) {
                                                        u0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    m2Var32.n(tL_error);
                                                    m2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = k2Var42.f49917n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    k2Var42.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var4 = m2Var2;
                                                final k2 k2Var5 = k2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var3 = m2Var4.W;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    m2Var4.n(tL_error);
                                                    m2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = k2Var5.f49917n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    k2Var5.f49917n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final m2 m2Var3 = this.f49807b;
                                final int i12 = i9;
                                final k2 k2Var4 = k2Var;
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
                                                final m2 m2Var22 = m2Var3;
                                                final k2 k2Var32 = k2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    MediaDataController.getInstance(i112).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i112).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                                                        MediaDataController.getInstance(i112).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var2 = m2Var22.W;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    m2Var22.n(tL_error);
                                                    m2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = k2Var32.f49917n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    k2Var32.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var3;
                                                final k2 k2Var42 = k2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    kh.u0 u0Var22 = m2Var32.W;
                                                    if (u0Var22 != null) {
                                                        u0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    m2Var32.n(tL_error);
                                                    m2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = k2Var42.f49917n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    k2Var42.f49917n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var4 = m2Var3;
                                                final k2 k2Var5 = k2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                                                        MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    kh.u0 u0Var3 = m2Var4.W;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1222) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i132 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f49910f.document;
                                                                    String str = k2Var422.f49915l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i132, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f49910f.document, k2Var422.f49915l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f49910f.document;
                                                                    String str2 = k2Var422.f49915l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i14, bool2, tLObject32, document2, str2, bool2);
                                                                    m2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    m2Var4.n(tL_error);
                                                    m2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = k2Var5.f49917n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    k2Var5.f49917n = null;
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
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        this.E = null;
        if (this.D != null) {
            int i9 = 0;
            while (true) {
                j2[] j2VarArr = this.D;
                if (i9 >= j2VarArr.length) {
                    break;
                }
                j2 j2Var = j2VarArr[i9];
                if (j2Var != null) {
                    j2Var.f49886l.reset();
                    Bitmap bitmap = j2Var.f49880e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        j2Var.f49880e = null;
                    }
                    Bitmap bitmap2 = j2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        j2Var.d = null;
                    }
                    Bitmap bitmap3 = j2Var.f49882g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        j2Var.f49882g = null;
                    }
                    Bitmap bitmap4 = j2Var.f49881f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        j2Var.f49881f = null;
                    }
                }
                i9++;
            }
            this.D = null;
        }
        this.f50004y = false;
        this.f50003x = false;
        this.H = false;
        this.I.setAlpha(0.0f);
        this.I.setScaleX(0.3f);
        this.I.setScaleY(0.3f);
        k2 k2Var = this.S;
        if (k2Var != null) {
            if (!k2Var.f49918o) {
                k2Var.a();
            }
            this.S = null;
        }
        h();
        this.R = false;
    }

    public final Bitmap d(Bitmap bitmap, int i9, int i10, boolean z10) {
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
                canvas.drawBitmap(bitmap, i9, i10, paint);
            } else {
                canvas.drawBitmap(bitmap, i9, i10, paint);
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        k2 k2Var;
        if (i9 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            k2 k2Var2 = this.S;
            if (k2Var2 != null && str.equalsIgnoreCase(k2Var2.f49907b)) {
                k2 k2Var3 = this.S;
                k2Var3.f49911g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = k2Var3.f49911g;
                if (k2Var3.f49922s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = k2Var3.f49908c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new o71(11, this, k2Var3), 2);
            }
        } else if (i9 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            k2 k2Var4 = this.S;
            if (k2Var4 != null && str2.equalsIgnoreCase(k2Var4.f49907b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    k2 k2Var5 = this.S;
                    k2Var5.f49924u = Utilities.clamp(((float) longValue) / ((float) longValue2), 1.0f, k2Var5.f49924u);
                    kh.u0 u0Var = this.W;
                    if (u0Var != null) {
                        u0Var.setProgress(this.S.b());
                    }
                }
            }
        } else if (i9 == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            k2 k2Var6 = this.S;
            if (k2Var6 != null && str3.equalsIgnoreCase(k2Var6.f49907b)) {
                h();
            }
        } else if (i9 == NotificationCenter.filePreparingStarted) {
            k2 k2Var7 = this.S;
            if (k2Var7 != null && objArr[0] == k2Var7.f49921r) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.S.f49907b, false, true, 67108864);
            }
        } else if (i9 == NotificationCenter.fileNewChunkAvailable) {
            k2 k2Var8 = this.S;
            if (k2Var8 != null && objArr[0] == k2Var8.f49921r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                float floatValue = f10.floatValue();
                this.S.f49921r.videoEditedInfo.needUpdateProgress = true;
                FileLoader.getInstance(this.f49982a).checkUploadNewDataAvailable(str4, false, Math.max(1L, longValue3), longValue4, f10);
                k2 k2Var9 = this.S;
                k2Var9.f49923t = Math.max(k2Var9.f49923t, floatValue);
                kh.u0 u0Var2 = this.W;
                if (u0Var2 != null) {
                    u0Var2.setProgress(this.S.b());
                }
            }
        } else if (i9 == NotificationCenter.filePreparingFailed && (k2Var = this.S) != null && objArr[0] == k2Var.f49921r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.v, this.f49989e);
        canvas.drawPath(this.f50002w, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: yf.m2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        j2 j2Var = this.A;
        if (j2Var != null) {
            this.G = bitmap;
            if (j2Var.f49881f != null && this.H) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                j2 j2Var2 = this.A;
                if (j2Var2.f49879c != 0) {
                    Matrix matrix = new Matrix();
                    j2 j2Var3 = this.A;
                    matrix.postRotate(j2Var3.f49879c, j2Var3.a().getWidth() / 2.0f, this.A.a().getHeight() / 2.0f);
                    j2 j2Var4 = this.A;
                    if ((j2Var4.f49879c / 90) % 2 != 0) {
                        float height = (j2Var4.b().getHeight() - this.A.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.A.a().getHeight(), bitmap.getHeight() / this.A.a().getWidth());
                    canvas.drawBitmap(this.A.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(j2Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f49984b.d(0.0f, false);
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.I;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(gr.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        boolean z12;
        float e10;
        float f10;
        Paint paint;
        y5 y5Var = this.f49986c;
        y5Var.f34852a = viewGroup;
        boolean z13 = this.f49990e0;
        if (z13 || y5Var.f34854c > 0.0f) {
            if (viewGroup == null) {
                e10 = 1.0f;
            } else {
                if (z13 && !z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e10 = y5Var.e(z12);
            }
            j2[] j2VarArr = this.D;
            if (j2VarArr != null) {
                for (j2 j2Var : j2VarArr) {
                    if (j2Var != null && j2Var == this.A) {
                        if (this.B > 0.0f) {
                            if (j2Var.f49894t.f49993g0 != null) {
                                canvas.save();
                                canvas.clipPath(j2Var.f49894t.f49993g0);
                                if (j2Var.f49894t.E != null) {
                                    if (z10) {
                                        paint = j2Var.f49891q;
                                    } else {
                                        paint = j2Var.f49890p;
                                    }
                                    paint.setAlpha((int) (e10 * 255.0f));
                                    paint.setStrokeWidth(AndroidUtilities.dp(f10));
                                    canvas.drawPath(j2Var.f49886l, paint);
                                    if (j2Var.f49894t.f49993g0 != null && z10) {
                                        canvas.clipPath(j2Var.f49886l);
                                        paint.setStrokeWidth(AndroidUtilities.dp(f10 * 2.0f));
                                        canvas.drawPath(j2Var.f49894t.f49993g0, paint);
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
        return this.L;
    }

    public float getSegmentBorderImageWidth() {
        return this.K;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        j2 j2Var;
        if (this.H && (j2Var = this.A) != null) {
            return j2Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.E;
    }

    public d01 getThanosEffect() {
        if (!d01.c()) {
            return null;
        }
        if (this.O == null) {
            d01 d01Var = new d01(getContext(), new d2(this, 1));
            this.O = d01Var;
            addView(d01Var, e6.c(-1.0f, -1));
        }
        return this.O;
    }

    public final void h() {
        kh.u0 u0Var = this.W;
        if (u0Var != null) {
            u0Var.a();
            this.W = null;
        }
    }

    public final boolean i() {
        return this.H;
    }

    public final j2 j(float f10, float f11) {
        int width;
        int height;
        if (this.E == null) {
            return null;
        }
        int i9 = 0;
        while (true) {
            j2[] j2VarArr = this.D;
            if (i9 >= j2VarArr.length) {
                return null;
            }
            j2 j2Var = j2VarArr[i9];
            if (j2Var != null) {
                if ((j2Var.f49879c / 90) % 2 != 0) {
                    width = this.E.getHeight();
                    height = this.E.getWidth();
                } else {
                    width = this.E.getWidth();
                    height = this.E.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.D[i9].f49883i;
                float f12 = width;
                float f13 = this.f49985b0;
                float f14 = height;
                float f15 = this.f49987c0;
                rectF.set((rectF2.left / f12) * f13, (rectF2.top / f14) * f15, (rectF2.right / f12) * f13, (rectF2.bottom / f14) * f15);
                this.f49983a0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return j2Var;
                }
            }
            i9++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        j2[] j2VarArr = this.D;
        if (j2VarArr != null) {
            for (j2 j2Var : j2VarArr) {
                if (j2Var != null && (bitmap = j2Var.f49880e) != null) {
                    bitmap.recycle();
                    j2Var.f49880e = null;
                    Bitmap bitmap2 = j2Var.f49882g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        j2Var.f49882g = null;
                    }
                    c(j2Var, this.P, this.Q);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i9, int i10, int i11, mq0 mq0Var) {
        int i12;
        int i13;
        eb.c cVar;
        if (i10 <= 0) {
            i12 = AndroidUtilities.displaySize.x;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            i13 = AndroidUtilities.displaySize.y;
        } else {
            i13 = i11;
        }
        this.P = i12;
        this.Q = i13;
        if (!this.f50004y && !this.f50003x && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.E = bitmap;
            this.F = i9;
            this.V = null;
            fh.v2 v2Var = new fh.v2(this, i9, mq0Var, 5);
            this.f50003x = true;
            ib.d dVar = new ib.d();
            dVar.f11084b = true;
            dVar.f11085c = true;
            zzd a2 = m8.a(new ib.e(dVar));
            if (EmuDetector.with(getContext()).detect()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.E;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.f49971e = min;
                obj.d = min;
                obj.f49968a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f49968a).drawRect(0.0f, 0.0f, obj.d, obj.f49971e, f6.Jl);
                obj.f49969b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f49970c = (bitmap2.getHeight() - obj.f49971e) / 2;
                arrayList.add(obj);
                v2Var.run(arrayList);
                return;
            }
            db.a a3 = db.a.a(bitmap, i9);
            a2.g(a3).addOnSuccessListener(new t0.c(v2Var, 13)).addOnFailureListener(new z2(this, bitmap, i9, mq0Var, v2Var, 6));
            if (this.V == null) {
                gb.b bVar = gb.b.f7690b;
                x5.l.i(bVar, "options cannot be null");
                synchronized (eb.c.class) {
                    cVar = (eb.c) ya.g.c().a(eb.c.class);
                }
                x9.b bVar2 = (x9.b) cVar.f5106a.get(gb.b.class);
                x5.l.h(bVar2);
                hb.d dVar2 = (hb.d) bVar2.get();
                dVar2.getClass();
                ka kaVar = dVar2.f10394c;
                ?? obj2 = new Object();
                obj2.f4162c = r7.TYPE_THIN;
                ya.m.f49706a.execute(new af.f(kaVar, new a6.a((com.google.firebase.messaging.m) obj2, 1), t7.ON_DEVICE_IMAGE_LABEL_CREATE, kaVar.b(), false, 5));
                new ImageLabelerImpl((ya.e) dVar2.f10392a.G(bVar), (Executor) dVar2.f10393b.f49687a.get(), new u5.c("vision.ica", 1L)).g(a3).addOnSuccessListener(new t0.c(this, 14)).addOnFailureListener(new v0.l(13));
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.f49982a).getEnabledReactionsList();
            for (int i14 = 0; i14 < Math.min(enabledReactionsList.size(), 9); i14++) {
                Emoji.getEmojiDrawable(enabledReactionsList.get(i14).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new oc((FrameLayout) getParent(), this.T).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f49993g0;
        if (path == null) {
            this.f49993g0 = new Path();
        } else {
            path.rewind();
        }
        if (this.f49994h0 == null) {
            this.f49994h0 = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.f49994h0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f49993g0.addPath(this.f49994h0, this.f49992f0);
        this.f49993g0.computeBounds(this.f49995i0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = this.f49982a;
        if (i9 >= 0) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.f49982a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.f49982a).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.f49982a).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.f49982a).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.f49982a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        float dp = AndroidUtilities.dp(10.0f);
        float f10 = dp * 2.0f;
        float measuredWidth = getMeasuredWidth() - f10;
        float measuredHeight = getMeasuredHeight() - f10;
        float f11 = measuredWidth / 8.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = measuredWidth + dp;
        rectF.set(dp, dp, f12, f12);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.f50001s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.f50000r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.v;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f50002w;
        path4.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        path4.addRoundRect(rectF, f11, f11, direction);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.I.setTranslationY(-((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f49998l0;
            arrayList.clear();
            if (this.f49990e0) {
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
                boolean z11;
                k2 k2Var;
                m2 m2Var = m2.this;
                Utilities.Callback callback3 = callback;
                if (callback3 != null && (k2Var = m2Var.S) != null && k2Var.f49918o) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    k2 k2Var2 = m2Var.S;
                    if (k2Var2 != null) {
                        k2Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f49919p = new ArrayList();
                    obj.f49920q = new ArrayList();
                    obj.f49923t = 0.0f;
                    obj.f49924u = 0.0f;
                    m2Var.S = obj;
                }
                k2 k2Var3 = m2Var.S;
                k2Var3.f49908c = str2;
                String str4 = str;
                k2Var3.f49907b = str4;
                k2Var3.f49906a = str4;
                k2Var3.d = charSequence;
                k2Var3.h = z10;
                k2Var3.f49912i = j10;
                k2Var3.f49913j = stickerSet;
                k2Var3.f49914k = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                k2Var3.f49922s = videoEditedInfo2;
                k2Var3.f49915l = str3;
                k2Var3.f49917n = callback3;
                k2Var3.f49916m = callback2;
                ArrayList arrayList = k2Var3.f49920q;
                if (!TextUtils.isEmpty(str4)) {
                    k2Var3.f49919p.add(new File(k2Var3.f49907b));
                }
                if (!TextUtils.isEmpty(k2Var3.f49906a) && !TextUtils.equals(k2Var3.f49906a, k2Var3.f49907b)) {
                    arrayList.add(new File(k2Var3.f49906a));
                }
                if (!TextUtils.isEmpty(k2Var3.f49915l)) {
                    arrayList.add(new File(k2Var3.f49915l));
                }
                if (!z11) {
                    m2Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        k2 k2Var4 = m2Var.S;
                        k2Var4.f49909e = MediaDataController.getInputStickerSetItem(document3, k2Var4.f49908c);
                        m2Var.S.f49910f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = m2Var.S.f49910f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        m2Var.a();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f22401id = 1;
                        k2 k2Var5 = m2Var.S;
                        String absolutePath = a8.w(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        k2Var5.f49907b = absolutePath;
                        m2Var.S.f49921r = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        m2Var.S.f49921r.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(m2Var.S.f49921r, false, false, false);
                    } else {
                        FileLoader.getInstance(m2Var.f49982a).uploadFile(str4, false, true, 67108864);
                    }
                }
                if (callback3 == null) {
                    if (m2Var.W == null) {
                        m2Var.W = new kh.u0(m2Var.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    m2Var.W.setOnCancelListener(new d2(m2Var, 0));
                    if (m2Var.W.getParent() == null) {
                        m2Var.addView(m2Var.W, e6.e(-1, -1, 17));
                    }
                    kh.u0 u0Var = m2Var.W;
                    u0Var.A = true;
                    u0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i9) {
        int i10 = this.f49982a;
        if (i10 != i9) {
            if (i10 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f49982a).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f49982a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f49982a).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f49982a).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f49982a).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f49982a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.f49982a = i9;
            if (i9 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f49982a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
        }
    }

    public void setOutlineVisible(boolean z10) {
        float f10;
        if (this.f49990e0 != z10) {
            this.f49990e0 = z10;
            ViewPropertyAnimator animate = this.f49988d0.animate();
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (!z10) {
                f11 = AndroidUtilities.dp(-18.0f);
            }
            alpha.translationX(f11).setInterpolator(gr.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f49998l0;
                arrayList.clear();
                if (this.f49990e0) {
                    Rect rect = this.m0;
                    arrayList.add(rect);
                    int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                    rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
                }
                setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    public void setOutlineWidth(float f10) {
        this.B = f10;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(c2 c2Var) {
        this.U = c2Var;
    }
}

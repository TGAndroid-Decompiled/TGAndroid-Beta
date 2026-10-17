package rg;

import ai.i6;
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
import ei.a8;
import gi.g4;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ff0;
import org.telegram.ui.o71;
import org.telegram.ui.xq0;
import w7.z5;
import x7.fa;
import x7.m7;
import x7.o7;
public final class m2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int f45530r0 = 0;
    public j2 E;
    public float F;
    public boolean G;
    public j2[] H;
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
    public t11 S;
    public int T;
    public int U;
    public boolean V;
    public k2 W;
    public int f45531a;
    public final d6 f45532a0;
    public final f6 f45533b;
    public c2 f45534b0;
    public final f6 f45535c;
    public String f45536c0;
    public final Paint d;
    public ei.t0 f45537d0;
    public final Paint e;
    public final Matrix f45538e0;
    public final Paint f45539f;
    public float f45540f0;
    public float f45541g0;
    public final Paint h;
    public final w1 f45542h0;
    public boolean f45543i0;
    public final Matrix f45544j0;
    public Path f45545k0;
    public Path f45546l0;
    public final RectF m0;
    public final PathMeasure f45547n;
    public float f45548n0;
    public float f45549o0;
    public final ArrayList f45550p0;
    public final Rect f45551q0;
    public final Path f45552r;
    public final Path f45553s;
    public final Path v;
    public final Path f45554w;
    public volatile boolean f45555x;
    public volatile boolean f45556y;

    public m2(ContextThemeWrapper contextThemeWrapper, d6 d6Var) {
        super(contextThemeWrapper);
        this.f45531a = -1;
        bs bsVar = bs.h;
        this.f45533b = new f6(0.0f, (View) null, 0L, 420L, bsVar);
        this.f45535c = new f6(0.0f, (View) null, 0L, 420L, bsVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f45539f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f45547n = new PathMeasure();
        this.f45552r = new Path();
        this.f45553s = new Path();
        this.v = new Path();
        this.f45554w = new Path();
        this.F = 2.0f;
        this.f45538e0 = new Matrix();
        this.f45544j0 = new Matrix();
        this.m0 = new RectF();
        this.f45550p0 = new ArrayList();
        this.f45551q0 = new Rect();
        this.f45532a0 = d6Var;
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
        addView(textView, z5.e(-2, -2, 17));
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
        this.f45542h0 = w1Var;
        w1Var.setAlpha(0.0f);
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.b(0.33f, 10.0f);
        w1Var.setBrushWeight(this.F);
        w1Var.setValueOverride(new k0.b(this, 24));
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.setAlpha(0.0f);
        addView(w1Var, z5.d(-1.0f, -1));
    }

    public static void c(rg.j2 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: rg.m2.c(rg.j2, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((i2) arrayList.get(0));
        int i10 = 1;
        while (i10 < arrayList.size() - 1) {
            i2 i2Var = (i2) arrayList.get(i10 - 1);
            i2 i2Var2 = (i2) arrayList.get(i10);
            i10++;
            i2 i2Var3 = (i2) arrayList.get(i10);
            int i11 = ((Point) i2Var2).x;
            int i12 = ((Point) i2Var).x;
            int i13 = ((Point) i2Var3).y;
            int i14 = ((Point) i2Var).y;
            if (Math.abs((((i13 - i14) * (i11 - i12)) - ((((Point) i2Var3).x - i12) * (((Point) i2Var2).y - i14))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(i2Var2);
            }
        }
        arrayList2.add((i2) i0.a.h(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final k2 k2Var = this.W;
        if (k2Var != null) {
            final int i10 = UserConfig.selectedAccount;
            k2Var.f45469o = true;
            if (k2Var.f45467m != null) {
                h();
                k2Var.f45467m.run(k2Var.f45459b, k2Var.e.document);
                AndroidUtilities.runOnUIThread(new ff0(19), 250L);
            } else if (k2Var.f45465k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(k2Var.f45465k, k2Var.f45460c).document;
                tL_stickers_replaceSticker.new_sticker = k2Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final m2 f45362b;

                    {
                        this.f45362b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final m2 m2Var = this.f45362b;
                                final int i11 = i10;
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
                                                    int i12 = i11;
                                                    MediaDataController.getInstance(i12).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i12).isStickerPackInstalled(tL_messages_stickerSet.set.f20299id)) {
                                                        MediaDataController.getInstance(i12).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var = m2Var2.f45537d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i13 = r4;
                                                            k2 k2Var4 = k2Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            m2 m2Var3 = m2Var2;
                                                            m2Var3.getClass();
                                                            switch (i13) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var4.f45461f.document;
                                                                    String str = k2Var4.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject3, document, str, bool);
                                                                    m2Var3.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, k2Var4.f45461f.document, k2Var4.f45466l, Boolean.TRUE);
                                                                    m2Var3.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var4.f45461f.document;
                                                                    String str2 = k2Var4.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject3, document2, str2, bool2);
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
                                                Utilities.Callback callback = k2Var3.f45468n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var3.f45468n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var3 = m2Var;
                                                final k2 k2Var4 = k2Var2;
                                                if (z14) {
                                                    int i13 = i11;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ei.t0 t0Var2 = m2Var3.f45537d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            k2 k2Var42 = k2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var32 = m2Var3;
                                                            m2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f45461f.document;
                                                                    String str = k2Var42.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f45461f.document, k2Var42.f45466l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f45461f.document;
                                                                    String str2 = k2Var42.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback2 = k2Var4.f45468n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var4.f45468n = null;
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
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20299id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var3 = m2Var4.f45537d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            k2 k2Var42 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var32 = m2Var4;
                                                            m2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f45461f.document;
                                                                    String str = k2Var42.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f45461f.document, k2Var42.f45466l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f45461f.document;
                                                                    String str2 = k2Var42.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback3 = k2Var5.f45468n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f45468n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final m2 m2Var2 = this.f45362b;
                                final int i12 = i10;
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
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20299id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var = m2Var22.f45537d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            k2 k2Var42 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var32 = m2Var22;
                                                            m2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f45461f.document;
                                                                    String str = k2Var42.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f45461f.document, k2Var42.f45466l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f45461f.document;
                                                                    String str2 = k2Var42.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback = k2Var32.f45468n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var32.f45468n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var3 = m2Var2;
                                                final k2 k2Var4 = k2Var3;
                                                if (z14) {
                                                    int i13 = i12;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ei.t0 t0Var2 = m2Var3.f45537d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            k2 k2Var42 = k2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var32 = m2Var3;
                                                            m2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f45461f.document;
                                                                    String str = k2Var42.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f45461f.document, k2Var42.f45466l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f45461f.document;
                                                                    String str2 = k2Var42.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback2 = k2Var4.f45468n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var4.f45468n = null;
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
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20299id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var3 = m2Var4.f45537d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            k2 k2Var42 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var32 = m2Var4;
                                                            m2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f45461f.document;
                                                                    String str = k2Var42.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f45461f.document, k2Var42.f45466l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f45461f.document;
                                                                    String str2 = k2Var42.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback3 = k2Var5.f45468n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f45468n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final m2 m2Var3 = this.f45362b;
                                final int i13 = i10;
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
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20299id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var = m2Var22.f45537d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            k2 k2Var42 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var32 = m2Var22;
                                                            m2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var42.f45461f.document;
                                                                    String str = k2Var42.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var42.f45461f.document, k2Var42.f45466l, Boolean.TRUE);
                                                                    m2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var42.f45461f.document;
                                                                    String str2 = k2Var42.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback = k2Var32.f45468n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var32.f45468n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var3;
                                                final k2 k2Var42 = k2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ei.t0 t0Var2 = m2Var32.f45537d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback2 = k2Var42.f45468n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var42.f45468n = null;
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
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20299id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var3 = m2Var4.f45537d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback3 = k2Var5.f45468n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f45468n = null;
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
                tL_stickers_createStickerSet.stickers.add(k2Var.e);
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final m2 f45362b;

                    {
                        this.f45362b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final m2 m2Var = this.f45362b;
                                final int i11 = i10;
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
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20299id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var = m2Var22.f45537d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback = k2Var32.f45468n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var32.f45468n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var;
                                                final k2 k2Var42 = k2Var2;
                                                if (z14) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ei.t0 t0Var2 = m2Var32.f45537d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback2 = k2Var42.f45468n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var42.f45468n = null;
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
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20299id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var3 = m2Var4.f45537d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback3 = k2Var5.f45468n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f45468n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final m2 m2Var2 = this.f45362b;
                                final int i12 = i10;
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
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20299id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var = m2Var22.f45537d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback = k2Var32.f45468n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var32.f45468n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var2;
                                                final k2 k2Var42 = k2Var3;
                                                if (z14) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ei.t0 t0Var2 = m2Var32.f45537d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback2 = k2Var42.f45468n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var42.f45468n = null;
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
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20299id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var3 = m2Var4.f45537d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback3 = k2Var5.f45468n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f45468n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final m2 m2Var3 = this.f45362b;
                                final int i13 = i10;
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
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20299id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var = m2Var22.f45537d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback = k2Var32.f45468n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    k2Var32.f45468n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var3;
                                                final k2 k2Var42 = k2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ei.t0 t0Var2 = m2Var32.f45537d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback2 = k2Var42.f45468n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    k2Var42.f45468n = null;
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
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20299id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var3 = m2Var4.f45537d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback3 = k2Var5.f45468n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    k2Var5.f45468n = null;
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
                NotificationCenter.getInstance(i10).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(k2Var, 14), 350L);
                Utilities.Callback callback = k2Var.f45468n;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
            } else if (k2Var.f45463i != 0) {
                SendMessagesHelper.getInstance(i10).sendSticker(k2Var.f45461f.document, null, k2Var.f45463i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                ei.t0 t0Var = this.f45537d0;
                if (t0Var != null) {
                    t0Var.setProgress(1.0f);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.j(this, i10, 8), 450L);
                Utilities.Callback callback2 = k2Var.f45468n;
                if (callback2 != null) {
                    callback2.run(Boolean.TRUE);
                    k2Var.f45468n = null;
                }
            } else if (k2Var.f45464j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(k2Var.f45464j);
                tL_stickers_addStickerToSet.sticker = k2Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final m2 f45362b;

                    {
                        this.f45362b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final m2 m2Var = this.f45362b;
                                final int i11 = i10;
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
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20299id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var2 = m2Var22.f45537d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback3 = k2Var32.f45468n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    k2Var32.f45468n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var;
                                                final k2 k2Var42 = k2Var2;
                                                if (z14) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ei.t0 t0Var22 = m2Var32.f45537d0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback22 = k2Var42.f45468n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    k2Var42.f45468n = null;
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
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20299id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var3 = m2Var4.f45537d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback32 = k2Var5.f45468n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    k2Var5.f45468n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final m2 m2Var2 = this.f45362b;
                                final int i12 = i10;
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
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20299id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var2 = m2Var22.f45537d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback3 = k2Var32.f45468n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    k2Var32.f45468n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var2;
                                                final k2 k2Var42 = k2Var3;
                                                if (z14) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ei.t0 t0Var22 = m2Var32.f45537d0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback22 = k2Var42.f45468n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    k2Var42.f45468n = null;
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
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20299id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var3 = m2Var4.f45537d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback32 = k2Var5.f45468n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    k2Var5.f45468n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final m2 m2Var3 = this.f45362b;
                                final int i13 = i10;
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
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20299id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var2 = m2Var22.f45537d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            m2 m2Var322 = m2Var22;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback3 = k2Var32.f45468n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    k2Var32.f45468n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final m2 m2Var32 = m2Var3;
                                                final k2 k2Var42 = k2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ei.t0 t0Var22 = m2Var32.f45537d0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            m2 m2Var322 = m2Var32;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback22 = k2Var42.f45468n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    k2Var42.f45468n = null;
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
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20299id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ei.t0 t0Var3 = m2Var4.f45537d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            k2 k2Var422 = k2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            m2 m2Var322 = m2Var4;
                                                            m2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = k2Var422.f45461f.document;
                                                                    String str = k2Var422.f45466l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    m2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, k2Var422.f45461f.document, k2Var422.f45466l, Boolean.TRUE);
                                                                    m2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = k2Var422.f45461f.document;
                                                                    String str2 = k2Var422.f45466l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
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
                                                Utilities.Callback callback32 = k2Var5.f45468n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    k2Var5.f45468n = null;
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
                j2[] j2VarArr = this.H;
                if (i10 >= j2VarArr.length) {
                    break;
                }
                j2 j2Var = j2VarArr[i10];
                if (j2Var != null) {
                    j2Var.f45442l.reset();
                    Bitmap bitmap = j2Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        j2Var.e = null;
                    }
                    Bitmap bitmap2 = j2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        j2Var.d = null;
                    }
                    Bitmap bitmap3 = j2Var.f45438g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        j2Var.f45438g = null;
                    }
                    Bitmap bitmap4 = j2Var.f45437f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        j2Var.f45437f = null;
                    }
                }
                i10++;
            }
            this.H = null;
        }
        this.f45556y = false;
        this.f45555x = false;
        this.L = false;
        this.M.setAlpha(0.0f);
        this.M.setScaleX(0.3f);
        this.M.setScaleY(0.3f);
        k2 k2Var = this.W;
        if (k2Var != null) {
            if (!k2Var.f45469o) {
                k2Var.a();
            }
            this.W = null;
        }
        h();
        this.V = false;
    }

    public final Bitmap d(int i10, int i11, Bitmap bitmap, boolean z10) {
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
        k2 k2Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            k2 k2Var2 = this.W;
            if (k2Var2 != null && str.equalsIgnoreCase(k2Var2.f45459b)) {
                k2 k2Var3 = this.W;
                k2Var3.f45462g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = k2Var3.f45462g;
                if (k2Var3.f45473s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = k2Var3.f45460c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new o71(8, this, k2Var3), 2);
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            k2 k2Var4 = this.W;
            if (k2Var4 != null && str2.equalsIgnoreCase(k2Var4.f45459b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    k2 k2Var5 = this.W;
                    k2Var5.f45475u = Utilities.clamp(((float) longValue) / ((float) longValue2), 1.0f, k2Var5.f45475u);
                    ei.t0 t0Var = this.f45537d0;
                    if (t0Var != null) {
                        t0Var.setProgress(this.W.b());
                    }
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            k2 k2Var6 = this.W;
            if (k2Var6 != null && str3.equalsIgnoreCase(k2Var6.f45459b)) {
                h();
            }
        } else if (i10 == NotificationCenter.filePreparingStarted) {
            k2 k2Var7 = this.W;
            if (k2Var7 != null && objArr[0] == k2Var7.f45472r) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.W.f45459b, false, true, 67108864);
            }
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            k2 k2Var8 = this.W;
            if (k2Var8 != null && objArr[0] == k2Var8.f45472r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f7 = (Float) objArr[4];
                float floatValue = f7.floatValue();
                this.W.f45472r.videoEditedInfo.needUpdateProgress = true;
                FileLoader.getInstance(this.f45531a).checkUploadNewDataAvailable(str4, false, Math.max(1L, longValue3), longValue4, f7);
                k2 k2Var9 = this.W;
                k2Var9.f45474t = Math.max(k2Var9.f45474t, floatValue);
                ei.t0 t0Var2 = this.f45537d0;
                if (t0Var2 != null) {
                    t0Var2.setProgress(this.W.b());
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed && (k2Var = this.W) != null && objArr[0] == k2Var.f45472r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.v, this.e);
        canvas.drawPath(this.f45554w, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: rg.m2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        j2 j2Var = this.E;
        if (j2Var != null) {
            this.K = bitmap;
            if (j2Var.f45437f != null && this.L) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                j2 j2Var2 = this.E;
                if (j2Var2.f45436c != 0) {
                    Matrix matrix = new Matrix();
                    j2 j2Var3 = this.E;
                    matrix.postRotate(j2Var3.f45436c, j2Var3.a().getWidth() / 2.0f, this.E.a().getHeight() / 2.0f);
                    j2 j2Var4 = this.E;
                    if ((j2Var4.f45436c / 90) % 2 != 0) {
                        float height = (j2Var4.b().getHeight() - this.E.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.E.a().getHeight(), bitmap.getHeight() / this.E.a().getWidth());
                    canvas.drawBitmap(this.E.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(j2Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f45533b.d(0.0f, false);
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.M;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(bs.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        boolean z12;
        float e;
        float f7;
        Paint paint;
        f6 f6Var = this.f45535c;
        f6Var.f26091a = viewGroup;
        boolean z13 = this.f45543i0;
        if (z13 || f6Var.f26093c > 0.0f) {
            if (viewGroup == null) {
                e = 1.0f;
            } else {
                if (z13 && !z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e = f6Var.e(z12);
            }
            j2[] j2VarArr = this.H;
            if (j2VarArr != null) {
                for (j2 j2Var : j2VarArr) {
                    if (j2Var != null && j2Var == this.E) {
                        if (this.F > 0.0f) {
                            if (j2Var.f45450t.f45545k0 != null) {
                                canvas.save();
                                canvas.clipPath(j2Var.f45450t.f45545k0);
                                if (j2Var.f45450t.I != null) {
                                    if (z10) {
                                        paint = j2Var.f45447q;
                                    } else {
                                        paint = j2Var.f45446p;
                                    }
                                    paint.setAlpha((int) (e * 255.0f));
                                    paint.setStrokeWidth(AndroidUtilities.dp(f7));
                                    canvas.drawPath(j2Var.f45442l, paint);
                                    if (j2Var.f45450t.f45545k0 != null && z10) {
                                        canvas.clipPath(j2Var.f45442l);
                                        paint.setStrokeWidth(AndroidUtilities.dp(f7 * 2.0f));
                                        canvas.drawPath(j2Var.f45450t.f45545k0, paint);
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
        j2 j2Var;
        if (this.L && (j2Var = this.E) != null) {
            return j2Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.I;
    }

    public t11 getThanosEffect() {
        if (!t11.c()) {
            return null;
        }
        if (this.S == null) {
            t11 t11Var = new t11(getContext(), new d2(this, 1));
            this.S = t11Var;
            addView(t11Var, z5.d(-1.0f, -1));
        }
        return this.S;
    }

    public final void h() {
        ei.t0 t0Var = this.f45537d0;
        if (t0Var != null) {
            t0Var.a();
            this.f45537d0 = null;
        }
    }

    public final boolean i() {
        return this.L;
    }

    public final j2 j(float f7, float f10) {
        int width;
        int height;
        if (this.I == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            j2[] j2VarArr = this.H;
            if (i10 >= j2VarArr.length) {
                return null;
            }
            j2 j2Var = j2VarArr[i10];
            if (j2Var != null) {
                if ((j2Var.f45436c / 90) % 2 != 0) {
                    width = this.I.getHeight();
                    height = this.I.getWidth();
                } else {
                    width = this.I.getWidth();
                    height = this.I.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.H[i10].f45439i;
                float f11 = width;
                float f12 = this.f45540f0;
                float f13 = height;
                float f14 = this.f45541g0;
                rectF.set((rectF2.left / f11) * f12, (rectF2.top / f13) * f14, (rectF2.right / f11) * f12, (rectF2.bottom / f13) * f14);
                this.f45538e0.mapRect(rectF);
                if (rectF.contains(f7, f10)) {
                    return j2Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        j2[] j2VarArr = this.H;
        if (j2VarArr != null) {
            for (j2 j2Var : j2VarArr) {
                if (j2Var != null && (bitmap = j2Var.e) != null) {
                    bitmap.recycle();
                    j2Var.e = null;
                    Bitmap bitmap2 = j2Var.f45438g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        j2Var.f45438g = null;
                    }
                    c(j2Var, this.T, this.U);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, xq0 xq0Var) {
        int i13;
        int i14;
        xb.c cVar;
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
        if (!this.f45556y && !this.f45555x && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.I = bitmap;
            this.J = i10;
            this.f45536c0 = null;
            g4 g4Var = new g4(this, i10, xq0Var, 4);
            this.f45555x = true;
            bc.d dVar = new bc.d();
            dVar.f4250b = true;
            dVar.f4251c = true;
            zzd a2 = v7.f0.a(new bc.e(dVar));
            if (EmuDetector.with(getContext()).detect()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.I;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.e = min;
                obj.d = min;
                obj.f45487a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f45487a).drawRect(0.0f, 0.0f, obj.d, obj.e, h6.Ml);
                obj.f45488b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f45489c = (bitmap2.getHeight() - obj.e) / 2;
                arrayList.add(obj);
                g4Var.run(arrayList);
                return;
            }
            wb.a a10 = wb.a.a(bitmap, i10);
            a2.g(a10).addOnSuccessListener(new qg.g0(g4Var, 12)).addOnFailureListener(new i6(this, bitmap, i10, xq0Var, g4Var, 5));
            if (this.f45536c0 == null) {
                zb.a aVar = zb.a.f51529b;
                n6.l.i(aVar, "options cannot be null");
                synchronized (xb.c.class) {
                    cVar = (xb.c) rb.g.c().a(xb.c.class);
                }
                qa.b bVar = (qa.b) cVar.f49784a.get(zb.a.class);
                n6.l.h(bVar);
                ac.d dVar2 = (ac.d) bVar.get();
                dVar2.getClass();
                fa faVar = dVar2.f488c;
                ?? obj2 = new Object();
                obj2.f7649c = m7.TYPE_THIN;
                rb.m.f45225a.execute(new com.google.android.gms.internal.cast.p(faVar, new a5.a((com.google.firebase.messaging.l) obj2, 1), o7.ON_DEVICE_IMAGE_LABEL_CREATE, faVar.b(), 7));
                new ImageLabelerImpl((rb.e) dVar2.f486a.R0(aVar), (Executor) dVar2.f487b.f45206a.get(), new k6.c("vision.ica", 1L)).g(a10).addOnSuccessListener(new qg.g0(this, 13)).addOnFailureListener(new r.a(8));
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.f45531a).getEnabledReactionsList();
            for (int i15 = 0; i15 < Math.min(enabledReactionsList.size(), 9); i15++) {
                Emoji.getEmojiDrawable(enabledReactionsList.get(i15).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new xc((FrameLayout) getParent(), this.f45532a0).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f45545k0;
        if (path == null) {
            this.f45545k0 = new Path();
        } else {
            path.rewind();
        }
        if (this.f45546l0 == null) {
            this.f45546l0 = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.f45546l0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f45545k0.addPath(this.f45546l0, this.f45544j0);
        this.f45545k0.computeBounds(this.m0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f45531a;
        if (i10 >= 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.f45531a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.f45531a).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.f45531a).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.f45531a).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.f45531a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
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
        Path path = this.f45553s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        Path path2 = this.f45552r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.v;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f45554w;
        path4.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        path4.addRoundRect(rectF, f10, f10, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.M.setTranslationY(-((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f45550p0;
            arrayList.clear();
            if (this.f45543i0) {
                Rect rect = this.f45551q0;
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
                if (callback3 != null && (k2Var = m2Var.W) != null && k2Var.f45469o) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    k2 k2Var2 = m2Var.W;
                    if (k2Var2 != null) {
                        k2Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f45470p = new ArrayList();
                    obj.f45471q = new ArrayList();
                    obj.f45474t = 0.0f;
                    obj.f45475u = 0.0f;
                    m2Var.W = obj;
                }
                k2 k2Var3 = m2Var.W;
                k2Var3.f45460c = str2;
                String str4 = str;
                k2Var3.f45459b = str4;
                k2Var3.f45458a = str4;
                k2Var3.d = charSequence;
                k2Var3.h = z10;
                k2Var3.f45463i = j10;
                k2Var3.f45464j = stickerSet;
                k2Var3.f45465k = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                k2Var3.f45473s = videoEditedInfo2;
                k2Var3.f45466l = str3;
                k2Var3.f45468n = callback3;
                k2Var3.f45467m = callback2;
                ArrayList arrayList = k2Var3.f45471q;
                if (!TextUtils.isEmpty(str4)) {
                    k2Var3.f45470p.add(new File(k2Var3.f45459b));
                }
                if (!TextUtils.isEmpty(k2Var3.f45458a) && !TextUtils.equals(k2Var3.f45458a, k2Var3.f45459b)) {
                    arrayList.add(new File(k2Var3.f45458a));
                }
                if (!TextUtils.isEmpty(k2Var3.f45466l)) {
                    arrayList.add(new File(k2Var3.f45466l));
                }
                if (!z11) {
                    m2Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        k2 k2Var4 = m2Var.W;
                        k2Var4.e = MediaDataController.getInputStickerSetItem(document3, k2Var4.f45460c);
                        m2Var.W.f45461f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = m2Var.W.f45461f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        m2Var.a();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f20293id = 1;
                        k2 k2Var5 = m2Var.W;
                        String absolutePath = a8.w(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        k2Var5.f45459b = absolutePath;
                        m2Var.W.f45472r = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        m2Var.W.f45472r.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(m2Var.W.f45472r, false, false, false);
                    } else {
                        FileLoader.getInstance(m2Var.f45531a).uploadFile(str4, false, true, 67108864);
                    }
                }
                if (callback3 == null) {
                    if (m2Var.f45537d0 == null) {
                        m2Var.f45537d0 = new ei.t0(m2Var.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    m2Var.f45537d0.setOnCancelListener(new d2(m2Var, 0));
                    if (m2Var.f45537d0.getParent() == null) {
                        m2Var.addView(m2Var.f45537d0, z5.e(-1, -1, 17));
                    }
                    ei.t0 t0Var = m2Var.f45537d0;
                    t0Var.E = true;
                    t0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i10) {
        int i11 = this.f45531a;
        if (i11 != i10) {
            if (i11 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f45531a).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f45531a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f45531a).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f45531a).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f45531a).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f45531a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.f45531a = i10;
            if (i10 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f45531a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
        }
    }

    public void setOutlineVisible(boolean z10) {
        float f7;
        if (this.f45543i0 != z10) {
            this.f45543i0 = z10;
            ViewPropertyAnimator animate = this.f45542h0.animate();
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
            alpha.translationX(f10).setInterpolator(bs.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f45550p0;
                arrayList.clear();
                if (this.f45543i0) {
                    Rect rect = this.f45551q0;
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
        this.f45534b0 = c2Var;
    }
}

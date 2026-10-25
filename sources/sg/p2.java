package sg;

import a8.fg;
import a8.ng;
import a8.y9;
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
import bi.e6;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import fi.w7;
import hi.p4;
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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.wc;
import org.telegram.ui.dr0;
import org.telegram.ui.l71;
import org.telegram.ui.u90;
import org.telegram.ui.wg1;
import y7.ca;
import y7.k7;
import y7.m7;
public final class p2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int f48432r0 = 0;
    public m2 E;
    public float F;
    public boolean G;
    public m2[] H;
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
    public g21 S;
    public int T;
    public int U;
    public boolean V;
    public n2 W;
    public int f48433a;
    public final u6 f48434a0;
    public final h6 f48435b;
    public e2 f48436b0;
    public final h6 f48437c;
    public String f48438c0;
    public final Paint d;
    public fi.t0 f48439d0;
    public final Paint e;
    public final Matrix f48440e0;
    public final Paint f48441f;
    public float f48442f0;
    public float f48443g0;
    public final Paint h;
    public final y1 f48444h0;
    public boolean f48445i0;
    public final Matrix f48446j0;
    public Path f48447k0;
    public Path f48448l0;
    public final RectF m0;
    public final PathMeasure f48449n;
    public float f48450n0;
    public float f48451o0;
    public final ArrayList f48452p0;
    public final Rect f48453q0;
    public final Path f48454r;
    public final Path f48455s;
    public final Path v;
    public final Path f48456w;
    public volatile boolean f48457x;
    public volatile boolean f48458y;

    public p2(ContextThemeWrapper contextThemeWrapper, u6 u6Var) {
        super(contextThemeWrapper);
        this.f48433a = -1;
        ds dsVar = ds.h;
        this.f48435b = new h6(0.0f, (View) null, 0L, 420L, dsVar);
        this.f48437c = new h6(0.0f, (View) null, 0L, 420L, dsVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f48441f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f48449n = new PathMeasure();
        this.f48454r = new Path();
        this.f48455s = new Path();
        this.v = new Path();
        this.f48456w = new Path();
        this.F = 2.0f;
        this.f48440e0 = new Matrix();
        this.f48446j0 = new Matrix();
        this.m0 = new RectF();
        this.f48452p0 = new ArrayList();
        this.f48453q0 = new Rect();
        this.f48434a0 = u6Var;
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
        addView(textView, gb1.i(-2, -2, 17));
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
        y1 y1Var = new y1(contextThemeWrapper);
        this.f48444h0 = y1Var;
        y1Var.setAlpha(0.0f);
        y1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        y1Var.b(0.33f, 10.0f);
        y1Var.setBrushWeight(this.F);
        y1Var.setValueOverride(new s4.o0(this));
        y1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        y1Var.setAlpha(0.0f);
        addView(y1Var, gb1.g(-1.0f, -1));
    }

    public static void c(sg.m2 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: sg.p2.c(sg.m2, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((l2) arrayList.get(0));
        int i10 = 1;
        while (i10 < arrayList.size() - 1) {
            l2 l2Var = (l2) arrayList.get(i10 - 1);
            l2 l2Var2 = (l2) arrayList.get(i10);
            i10++;
            l2 l2Var3 = (l2) arrayList.get(i10);
            int i11 = ((Point) l2Var2).x;
            int i12 = ((Point) l2Var).x;
            int i13 = ((Point) l2Var3).y;
            int i14 = ((Point) l2Var).y;
            if (Math.abs((((i13 - i14) * (i11 - i12)) - ((((Point) l2Var3).x - i12) * (((Point) l2Var2).y - i14))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(l2Var2);
            }
        }
        arrayList2.add((l2) ic.a.g(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final n2 n2Var = this.W;
        if (n2Var != null) {
            final int i10 = UserConfig.selectedAccount;
            n2Var.f48381o = true;
            if (n2Var.f48379m != null) {
                h();
                n2Var.f48379m.run(n2Var.f48371b, n2Var.e.document);
                AndroidUtilities.runOnUIThread(new u90(23), 250L);
            } else if (n2Var.f48377k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(n2Var.f48377k, n2Var.f48372c).document;
                tL_stickers_replaceSticker.new_sticker = n2Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final p2 f48220b;

                    {
                        this.f48220b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final p2 p2Var = this.f48220b;
                                final int i11 = i10;
                                final n2 n2Var2 = n2Var;
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
                                                final p2 p2Var2 = p2Var;
                                                final n2 n2Var3 = n2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i12 = i11;
                                                    MediaDataController.getInstance(i12).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i12).isStickerPackInstalled(tL_messages_stickerSet.set.f22054id)) {
                                                        MediaDataController.getInstance(i12).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var = p2Var2.f48439d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i13 = r4;
                                                            n2 n2Var4 = n2Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            p2 p2Var3 = p2Var2;
                                                            p2Var3.getClass();
                                                            switch (i13) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var4.f48373f.document;
                                                                    String str = n2Var4.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject3, document, str, bool);
                                                                    p2Var3.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, n2Var4.f48373f.document, n2Var4.f48378l, Boolean.TRUE);
                                                                    p2Var3.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var4.f48373f.document;
                                                                    String str2 = n2Var4.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject3, document2, str2, bool2);
                                                                    p2Var3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    p2Var2.n(tL_error);
                                                    p2Var2.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = n2Var3.f48380n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    n2Var3.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var3 = p2Var;
                                                final n2 n2Var4 = n2Var2;
                                                if (z14) {
                                                    int i13 = i11;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    fi.t0 t0Var2 = p2Var3.f48439d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            n2 n2Var42 = n2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            p2 p2Var32 = p2Var3;
                                                            p2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var42.f48373f.document;
                                                                    String str = n2Var42.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject32, document, str, bool);
                                                                    p2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var42.f48373f.document, n2Var42.f48378l, Boolean.TRUE);
                                                                    p2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var42.f48373f.document;
                                                                    String str2 = n2Var42.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    p2Var3.n(tL_error);
                                                    p2Var3.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = n2Var4.f48380n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    n2Var4.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var4 = p2Var;
                                                final n2 n2Var5 = n2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22054id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var3 = p2Var4.f48439d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            n2 n2Var42 = n2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            p2 p2Var32 = p2Var4;
                                                            p2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var42.f48373f.document;
                                                                    String str = n2Var42.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var42.f48373f.document, n2Var42.f48378l, Boolean.TRUE);
                                                                    p2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var42.f48373f.document;
                                                                    String str2 = n2Var42.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    p2Var4.n(tL_error);
                                                    p2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = n2Var5.f48380n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    n2Var5.f48380n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final p2 p2Var2 = this.f48220b;
                                final int i12 = i10;
                                final n2 n2Var3 = n2Var;
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
                                                final p2 p2Var22 = p2Var2;
                                                final n2 n2Var32 = n2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22054id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var = p2Var22.f48439d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            n2 n2Var42 = n2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            p2 p2Var32 = p2Var22;
                                                            p2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var42.f48373f.document;
                                                                    String str = n2Var42.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var42.f48373f.document, n2Var42.f48378l, Boolean.TRUE);
                                                                    p2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var42.f48373f.document;
                                                                    String str2 = n2Var42.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    p2Var22.n(tL_error);
                                                    p2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = n2Var32.f48380n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    n2Var32.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var3 = p2Var2;
                                                final n2 n2Var4 = n2Var3;
                                                if (z14) {
                                                    int i13 = i12;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    fi.t0 t0Var2 = p2Var3.f48439d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            n2 n2Var42 = n2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            p2 p2Var32 = p2Var3;
                                                            p2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var42.f48373f.document;
                                                                    String str = n2Var42.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var42.f48373f.document, n2Var42.f48378l, Boolean.TRUE);
                                                                    p2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var42.f48373f.document;
                                                                    String str2 = n2Var42.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    p2Var3.n(tL_error);
                                                    p2Var3.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = n2Var4.f48380n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    n2Var4.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var4 = p2Var2;
                                                final n2 n2Var5 = n2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22054id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var3 = p2Var4.f48439d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            n2 n2Var42 = n2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            p2 p2Var32 = p2Var4;
                                                            p2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var42.f48373f.document;
                                                                    String str = n2Var42.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var42.f48373f.document, n2Var42.f48378l, Boolean.TRUE);
                                                                    p2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var42.f48373f.document;
                                                                    String str2 = n2Var42.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    p2Var4.n(tL_error);
                                                    p2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = n2Var5.f48380n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    n2Var5.f48380n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final p2 p2Var3 = this.f48220b;
                                final int i13 = i10;
                                final n2 n2Var4 = n2Var;
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
                                                final p2 p2Var22 = p2Var3;
                                                final n2 n2Var32 = n2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22054id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var = p2Var22.f48439d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            n2 n2Var42 = n2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            p2 p2Var32 = p2Var22;
                                                            p2Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var42.f48373f.document;
                                                                    String str = n2Var42.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var42.f48373f.document, n2Var42.f48378l, Boolean.TRUE);
                                                                    p2Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var42.f48373f.document;
                                                                    String str2 = n2Var42.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    p2Var22.n(tL_error);
                                                    p2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = n2Var32.f48380n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    n2Var32.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var32 = p2Var3;
                                                final n2 n2Var42 = n2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    fi.t0 t0Var2 = p2Var32.f48439d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            p2 p2Var322 = p2Var32;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    p2Var32.n(tL_error);
                                                    p2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = n2Var42.f48380n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    n2Var42.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var4 = p2Var3;
                                                final n2 n2Var5 = n2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22054id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var3 = p2Var4.f48439d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            p2 p2Var322 = p2Var4;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    p2Var4.n(tL_error);
                                                    p2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = n2Var5.f48380n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    n2Var5.f48380n = null;
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
            } else if (n2Var.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = n2Var.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(n2Var.e);
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final p2 f48220b;

                    {
                        this.f48220b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final p2 p2Var = this.f48220b;
                                final int i11 = i10;
                                final n2 n2Var2 = n2Var;
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
                                                final p2 p2Var22 = p2Var;
                                                final n2 n2Var32 = n2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22054id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var = p2Var22.f48439d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            p2 p2Var322 = p2Var22;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    p2Var22.n(tL_error);
                                                    p2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = n2Var32.f48380n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    n2Var32.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var32 = p2Var;
                                                final n2 n2Var42 = n2Var2;
                                                if (z14) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    fi.t0 t0Var2 = p2Var32.f48439d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            p2 p2Var322 = p2Var32;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    p2Var32.n(tL_error);
                                                    p2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = n2Var42.f48380n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    n2Var42.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var4 = p2Var;
                                                final n2 n2Var5 = n2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22054id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var3 = p2Var4.f48439d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            p2 p2Var322 = p2Var4;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    p2Var4.n(tL_error);
                                                    p2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = n2Var5.f48380n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    n2Var5.f48380n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final p2 p2Var2 = this.f48220b;
                                final int i12 = i10;
                                final n2 n2Var3 = n2Var;
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
                                                final p2 p2Var22 = p2Var2;
                                                final n2 n2Var32 = n2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22054id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var = p2Var22.f48439d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            p2 p2Var322 = p2Var22;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    p2Var22.n(tL_error);
                                                    p2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = n2Var32.f48380n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    n2Var32.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var32 = p2Var2;
                                                final n2 n2Var42 = n2Var3;
                                                if (z14) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    fi.t0 t0Var2 = p2Var32.f48439d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            p2 p2Var322 = p2Var32;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    p2Var32.n(tL_error);
                                                    p2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = n2Var42.f48380n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    n2Var42.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var4 = p2Var2;
                                                final n2 n2Var5 = n2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22054id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var3 = p2Var4.f48439d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            p2 p2Var322 = p2Var4;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    p2Var4.n(tL_error);
                                                    p2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = n2Var5.f48380n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    n2Var5.f48380n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final p2 p2Var3 = this.f48220b;
                                final int i13 = i10;
                                final n2 n2Var4 = n2Var;
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
                                                final p2 p2Var22 = p2Var3;
                                                final n2 n2Var32 = n2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22054id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var = p2Var22.f48439d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            p2 p2Var322 = p2Var22;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    p2Var22.n(tL_error);
                                                    p2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = n2Var32.f48380n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    n2Var32.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var32 = p2Var3;
                                                final n2 n2Var42 = n2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    fi.t0 t0Var2 = p2Var32.f48439d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            p2 p2Var322 = p2Var32;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    p2Var32.n(tL_error);
                                                    p2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = n2Var42.f48380n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    n2Var42.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var4 = p2Var3;
                                                final n2 n2Var5 = n2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22054id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var3 = p2Var4.f48439d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            p2 p2Var322 = p2Var4;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    p2Var4.n(tL_error);
                                                    p2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = n2Var5.f48380n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    n2Var5.f48380n = null;
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
            } else if (n2Var.h) {
                h();
                NotificationCenter.getInstance(i10).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(n2Var, 18), 350L);
                Utilities.Callback callback = n2Var.f48380n;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
            } else if (n2Var.f48375i != 0) {
                SendMessagesHelper.getInstance(i10).sendSticker(n2Var.f48373f.document, null, n2Var.f48375i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                fi.t0 t0Var = this.f48439d0;
                if (t0Var != null) {
                    t0Var.setProgress(1.0f);
                }
                AndroidUtilities.runOnUIThread(new wg1(this, i10, 11), 450L);
                Utilities.Callback callback2 = n2Var.f48380n;
                if (callback2 != null) {
                    callback2.run(Boolean.TRUE);
                    n2Var.f48380n = null;
                }
            } else if (n2Var.f48376j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(n2Var.f48376j);
                tL_stickers_addStickerToSet.sticker = n2Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final p2 f48220b;

                    {
                        this.f48220b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final p2 p2Var = this.f48220b;
                                final int i11 = i10;
                                final n2 n2Var2 = n2Var;
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
                                                final p2 p2Var22 = p2Var;
                                                final n2 n2Var32 = n2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22054id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var2 = p2Var22.f48439d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            p2 p2Var322 = p2Var22;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    p2Var22.n(tL_error);
                                                    p2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = n2Var32.f48380n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    n2Var32.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var32 = p2Var;
                                                final n2 n2Var42 = n2Var2;
                                                if (z14) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    fi.t0 t0Var22 = p2Var32.f48439d0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            p2 p2Var322 = p2Var32;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    p2Var32.n(tL_error);
                                                    p2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = n2Var42.f48380n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    n2Var42.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var4 = p2Var;
                                                final n2 n2Var5 = n2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22054id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var3 = p2Var4.f48439d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            p2 p2Var322 = p2Var4;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    p2Var4.n(tL_error);
                                                    p2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = n2Var5.f48380n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    n2Var5.f48380n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final p2 p2Var2 = this.f48220b;
                                final int i12 = i10;
                                final n2 n2Var3 = n2Var;
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
                                                final p2 p2Var22 = p2Var2;
                                                final n2 n2Var32 = n2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22054id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var2 = p2Var22.f48439d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            p2 p2Var322 = p2Var22;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    p2Var22.n(tL_error);
                                                    p2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = n2Var32.f48380n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    n2Var32.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var32 = p2Var2;
                                                final n2 n2Var42 = n2Var3;
                                                if (z14) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    fi.t0 t0Var22 = p2Var32.f48439d0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            p2 p2Var322 = p2Var32;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    p2Var32.n(tL_error);
                                                    p2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = n2Var42.f48380n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    n2Var42.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var4 = p2Var2;
                                                final n2 n2Var5 = n2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22054id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var3 = p2Var4.f48439d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            p2 p2Var322 = p2Var4;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    p2Var4.n(tL_error);
                                                    p2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = n2Var5.f48380n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    n2Var5.f48380n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final p2 p2Var3 = this.f48220b;
                                final int i13 = i10;
                                final n2 n2Var4 = n2Var;
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
                                                final p2 p2Var22 = p2Var3;
                                                final n2 n2Var32 = n2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22054id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var2 = p2Var22.f48439d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            p2 p2Var322 = p2Var22;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    p2Var22.n(tL_error);
                                                    p2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = n2Var32.f48380n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    n2Var32.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var32 = p2Var3;
                                                final n2 n2Var42 = n2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    fi.t0 t0Var22 = p2Var32.f48439d0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            p2 p2Var322 = p2Var32;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    p2Var32.n(tL_error);
                                                    p2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = n2Var42.f48380n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    n2Var42.f48380n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final p2 p2Var4 = p2Var3;
                                                final n2 n2Var5 = n2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22054id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.t0 t0Var3 = p2Var4.f48439d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            n2 n2Var422 = n2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            p2 p2Var322 = p2Var4;
                                                            p2Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = n2Var422.f48373f.document;
                                                                    String str = n2Var422.f48378l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    p2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, n2Var422.f48373f.document, n2Var422.f48378l, Boolean.TRUE);
                                                                    p2Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = n2Var422.f48373f.document;
                                                                    String str2 = n2Var422.f48378l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    p2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    p2Var4.n(tL_error);
                                                    p2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = n2Var5.f48380n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    n2Var5.f48380n = null;
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
                m2[] m2VarArr = this.H;
                if (i10 >= m2VarArr.length) {
                    break;
                }
                m2 m2Var = m2VarArr[i10];
                if (m2Var != null) {
                    m2Var.f48318l.reset();
                    Bitmap bitmap = m2Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        m2Var.e = null;
                    }
                    Bitmap bitmap2 = m2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        m2Var.d = null;
                    }
                    Bitmap bitmap3 = m2Var.f48314g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        m2Var.f48314g = null;
                    }
                    Bitmap bitmap4 = m2Var.f48313f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        m2Var.f48313f = null;
                    }
                }
                i10++;
            }
            this.H = null;
        }
        this.f48458y = false;
        this.f48457x = false;
        this.L = false;
        this.M.setAlpha(0.0f);
        this.M.setScaleX(0.3f);
        this.M.setScaleY(0.3f);
        n2 n2Var = this.W;
        if (n2Var != null) {
            if (!n2Var.f48381o) {
                n2Var.a();
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
        n2 n2Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            n2 n2Var2 = this.W;
            if (n2Var2 != null && str.equalsIgnoreCase(n2Var2.f48371b)) {
                n2 n2Var3 = this.W;
                n2Var3.f48374g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = n2Var3.f48374g;
                if (n2Var3.f48385s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = n2Var3.f48372c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new l71(10, this, n2Var3), 2);
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            n2 n2Var4 = this.W;
            if (n2Var4 != null && str2.equalsIgnoreCase(n2Var4.f48371b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    n2 n2Var5 = this.W;
                    n2Var5.f48387u = Utilities.clamp(((float) longValue) / ((float) longValue2), 1.0f, n2Var5.f48387u);
                    fi.t0 t0Var = this.f48439d0;
                    if (t0Var != null) {
                        t0Var.setProgress(this.W.b());
                    }
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            n2 n2Var6 = this.W;
            if (n2Var6 != null && str3.equalsIgnoreCase(n2Var6.f48371b)) {
                h();
            }
        } else if (i10 == NotificationCenter.filePreparingStarted) {
            n2 n2Var7 = this.W;
            if (n2Var7 != null && objArr[0] == n2Var7.f48384r) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.W.f48371b, false, true, 67108864);
            }
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            n2 n2Var8 = this.W;
            if (n2Var8 != null && objArr[0] == n2Var8.f48384r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f7 = (Float) objArr[4];
                float floatValue = f7.floatValue();
                this.W.f48384r.videoEditedInfo.needUpdateProgress = true;
                FileLoader.getInstance(this.f48433a).checkUploadNewDataAvailable(str4, false, Math.max(1L, longValue3), longValue4, f7);
                n2 n2Var9 = this.W;
                n2Var9.f48386t = Math.max(n2Var9.f48386t, floatValue);
                fi.t0 t0Var2 = this.f48439d0;
                if (t0Var2 != null) {
                    t0Var2.setProgress(this.W.b());
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed && (n2Var = this.W) != null && objArr[0] == n2Var.f48384r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.v, this.e);
        canvas.drawPath(this.f48456w, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: sg.p2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        m2 m2Var = this.E;
        if (m2Var != null) {
            this.K = bitmap;
            if (m2Var.f48313f != null && this.L) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                m2 m2Var2 = this.E;
                if (m2Var2.f48312c != 0) {
                    Matrix matrix = new Matrix();
                    m2 m2Var3 = this.E;
                    matrix.postRotate(m2Var3.f48312c, m2Var3.a().getWidth() / 2.0f, this.E.a().getHeight() / 2.0f);
                    m2 m2Var4 = this.E;
                    if ((m2Var4.f48312c / 90) % 2 != 0) {
                        float height = (m2Var4.b().getHeight() - this.E.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.E.a().getHeight(), bitmap.getHeight() / this.E.a().getWidth());
                    canvas.drawBitmap(this.E.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(m2Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f48435b.d(0.0f, false);
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.M;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(ds.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        boolean z12;
        float e;
        float f7;
        Paint paint;
        h6 h6Var = this.f48437c;
        h6Var.f28807a = viewGroup;
        boolean z13 = this.f48445i0;
        if (z13 || h6Var.f28809c > 0.0f) {
            if (viewGroup == null) {
                e = 1.0f;
            } else {
                if (z13 && !z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e = h6Var.e(z12);
            }
            m2[] m2VarArr = this.H;
            if (m2VarArr != null) {
                for (m2 m2Var : m2VarArr) {
                    if (m2Var != null && m2Var == this.E) {
                        if (this.F > 0.0f) {
                            if (m2Var.f48326t.f48447k0 != null) {
                                canvas.save();
                                canvas.clipPath(m2Var.f48326t.f48447k0);
                                if (m2Var.f48326t.I != null) {
                                    if (z10) {
                                        paint = m2Var.f48323q;
                                    } else {
                                        paint = m2Var.f48322p;
                                    }
                                    paint.setAlpha((int) (e * 255.0f));
                                    paint.setStrokeWidth(AndroidUtilities.dp(f7));
                                    canvas.drawPath(m2Var.f48318l, paint);
                                    if (m2Var.f48326t.f48447k0 != null && z10) {
                                        canvas.clipPath(m2Var.f48318l);
                                        paint.setStrokeWidth(AndroidUtilities.dp(f7 * 2.0f));
                                        canvas.drawPath(m2Var.f48326t.f48447k0, paint);
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
        m2 m2Var;
        if (this.L && (m2Var = this.E) != null) {
            return m2Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.I;
    }

    public g21 getThanosEffect() {
        if (!g21.c()) {
            return null;
        }
        if (this.S == null) {
            g21 g21Var = new g21(getContext(), new f2(this, 1));
            this.S = g21Var;
            addView(g21Var, gb1.g(-1.0f, -1));
        }
        return this.S;
    }

    public final void h() {
        fi.t0 t0Var = this.f48439d0;
        if (t0Var != null) {
            t0Var.a();
            this.f48439d0 = null;
        }
    }

    public final boolean i() {
        return this.L;
    }

    public final m2 j(float f7, float f10) {
        int width;
        int height;
        if (this.I == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            m2[] m2VarArr = this.H;
            if (i10 >= m2VarArr.length) {
                return null;
            }
            m2 m2Var = m2VarArr[i10];
            if (m2Var != null) {
                if ((m2Var.f48312c / 90) % 2 != 0) {
                    width = this.I.getHeight();
                    height = this.I.getWidth();
                } else {
                    width = this.I.getWidth();
                    height = this.I.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.H[i10].f48315i;
                float f11 = width;
                float f12 = this.f48442f0;
                float f13 = height;
                float f14 = this.f48443g0;
                rectF.set((rectF2.left / f11) * f12, (rectF2.top / f13) * f14, (rectF2.right / f11) * f12, (rectF2.bottom / f13) * f14);
                this.f48440e0.mapRect(rectF);
                if (rectF.contains(f7, f10)) {
                    return m2Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        m2[] m2VarArr = this.H;
        if (m2VarArr != null) {
            for (m2 m2Var : m2VarArr) {
                if (m2Var != null && (bitmap = m2Var.e) != null) {
                    bitmap.recycle();
                    m2Var.e = null;
                    Bitmap bitmap2 = m2Var.f48314g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        m2Var.f48314g = null;
                    }
                    c(m2Var, this.T, this.U);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, dr0 dr0Var) {
        int i13;
        int i14;
        yb.c cVar;
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
        if (!this.f48458y && !this.f48457x && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.I = bitmap;
            this.J = i10;
            this.f48438c0 = null;
            p4 p4Var = new p4(this, i10, dr0Var, 5);
            this.f48457x = true;
            cc.d dVar = new cc.d();
            dVar.f6190b = true;
            dVar.f6191c = true;
            zzd a2 = y9.a(new cc.e(dVar));
            if (EmuDetector.with(getContext()).detect()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.I;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.e = min;
                obj.d = min;
                obj.f48396a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f48396a).drawRect(0.0f, 0.0f, obj.d, obj.e, y6.Ol);
                obj.f48397b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f48398c = (bitmap2.getHeight() - obj.e) / 2;
                arrayList.add(obj);
                p4Var.run(arrayList);
                return;
            }
            xb.a a10 = xb.a.a(bitmap, i10);
            a2.g(a10).addOnSuccessListener(new org.telegram.ui.Components.voip.j1(p4Var, 16)).addOnFailureListener(new e6(this, bitmap, i10, dr0Var, p4Var, 5));
            if (this.f48438c0 == null) {
                ac.b bVar = ac.b.f1237b;
                o6.l.i(bVar, "options cannot be null");
                synchronized (yb.c.class) {
                    cVar = (yb.c) sb.g.c().a(yb.c.class);
                }
                ra.b bVar2 = (ra.b) cVar.f52512a.get(ac.b.class);
                o6.l.h(bVar2);
                bc.d dVar2 = (bc.d) bVar2.get();
                dVar2.getClass();
                ca caVar = dVar2.f3843c;
                ?? obj2 = new Object();
                obj2.f1152c = k7.TYPE_THIN;
                sb.m.f48061a.execute(new fg(caVar, new ng((aa.m0) obj2, 1), m7.ON_DEVICE_IMAGE_LABEL_CREATE, caVar.b(), 8));
                new ImageLabelerImpl((sb.e) dVar2.f3841a.R0(bVar), (Executor) dVar2.f3842b.f48042a.get(), new l6.c("vision.ica", 1L)).g(a10).addOnSuccessListener(new org.telegram.ui.Components.voip.j1(this, 17)).addOnFailureListener(new s0.b(7));
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.f48433a).getEnabledReactionsList();
            for (int i15 = 0; i15 < Math.min(enabledReactionsList.size(), 9); i15++) {
                Emoji.getEmojiDrawable(enabledReactionsList.get(i15).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new wc((FrameLayout) getParent(), this.f48434a0).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f48447k0;
        if (path == null) {
            this.f48447k0 = new Path();
        } else {
            path.rewind();
        }
        if (this.f48448l0 == null) {
            this.f48448l0 = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.f48448l0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f48447k0.addPath(this.f48448l0, this.f48446j0);
        this.f48447k0.computeBounds(this.m0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f48433a;
        if (i10 >= 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.f48433a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.f48433a).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.f48433a).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.f48433a).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.f48433a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
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
        Path path = this.f48455s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        Path path2 = this.f48454r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.v;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f48456w;
        path4.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        path4.addRoundRect(rectF, f10, f10, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.M.setTranslationY(-((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f48452p0;
            arrayList.clear();
            if (this.f48445i0) {
                Rect rect = this.f48453q0;
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
                n2 n2Var;
                p2 p2Var = p2.this;
                Utilities.Callback callback3 = callback;
                if (callback3 != null && (n2Var = p2Var.W) != null && n2Var.f48381o) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    n2 n2Var2 = p2Var.W;
                    if (n2Var2 != null) {
                        n2Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f48382p = new ArrayList();
                    obj.f48383q = new ArrayList();
                    obj.f48386t = 0.0f;
                    obj.f48387u = 0.0f;
                    p2Var.W = obj;
                }
                n2 n2Var3 = p2Var.W;
                n2Var3.f48372c = str2;
                String str4 = str;
                n2Var3.f48371b = str4;
                n2Var3.f48370a = str4;
                n2Var3.d = charSequence;
                n2Var3.h = z10;
                n2Var3.f48375i = j10;
                n2Var3.f48376j = stickerSet;
                n2Var3.f48377k = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                n2Var3.f48385s = videoEditedInfo2;
                n2Var3.f48378l = str3;
                n2Var3.f48380n = callback3;
                n2Var3.f48379m = callback2;
                ArrayList arrayList = n2Var3.f48383q;
                if (!TextUtils.isEmpty(str4)) {
                    n2Var3.f48382p.add(new File(n2Var3.f48371b));
                }
                if (!TextUtils.isEmpty(n2Var3.f48370a) && !TextUtils.equals(n2Var3.f48370a, n2Var3.f48371b)) {
                    arrayList.add(new File(n2Var3.f48370a));
                }
                if (!TextUtils.isEmpty(n2Var3.f48378l)) {
                    arrayList.add(new File(n2Var3.f48378l));
                }
                if (!z11) {
                    p2Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        n2 n2Var4 = p2Var.W;
                        n2Var4.e = MediaDataController.getInputStickerSetItem(document3, n2Var4.f48372c);
                        p2Var.W.f48373f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = p2Var.W.f48373f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        p2Var.a();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f22048id = 1;
                        n2 n2Var5 = p2Var.W;
                        String absolutePath = w7.w(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        n2Var5.f48371b = absolutePath;
                        p2Var.W.f48384r = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        p2Var.W.f48384r.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(p2Var.W.f48384r, false, false, false);
                    } else {
                        FileLoader.getInstance(p2Var.f48433a).uploadFile(str4, false, true, 67108864);
                    }
                }
                if (callback3 == null) {
                    if (p2Var.f48439d0 == null) {
                        p2Var.f48439d0 = new fi.t0(p2Var.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    p2Var.f48439d0.setOnCancelListener(new f2(p2Var, 0));
                    if (p2Var.f48439d0.getParent() == null) {
                        p2Var.addView(p2Var.f48439d0, gb1.i(-1, -1, 17));
                    }
                    fi.t0 t0Var = p2Var.f48439d0;
                    t0Var.E = true;
                    t0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i10) {
        int i11 = this.f48433a;
        if (i11 != i10) {
            if (i11 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f48433a).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f48433a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f48433a).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f48433a).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f48433a).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f48433a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.f48433a = i10;
            if (i10 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f48433a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
        }
    }

    public void setOutlineVisible(boolean z10) {
        float f7;
        if (this.f48445i0 != z10) {
            this.f48445i0 = z10;
            ViewPropertyAnimator animate = this.f48444h0.animate();
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
            alpha.translationX(f10).setInterpolator(ds.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f48452p0;
                arrayList.clear();
                if (this.f48445i0) {
                    Rect rect = this.f48453q0;
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

    public void setStickerCutOutBtn(e2 e2Var) {
        this.f48436b0 = e2Var;
    }
}

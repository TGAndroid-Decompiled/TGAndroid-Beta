package tg;

import a8.a8;
import a8.b8;
import a8.pa;
import a8.ta;
import a8.wa;
import a8.y7;
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
import bi.i6;
import c8.ha;
import c8.ke;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import fi.e7;
import hi.d4;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.j20;
import org.telegram.messenger.ls;
import org.telegram.messenger.n6;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.v10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.jn0;
import org.telegram.ui.n41;
public final class c2 extends FrameLayout implements ls {
    public static final int f55495r0 = 0;
    public volatile boolean D;
    public z1 E;
    public float F;
    public boolean G;
    public z1[] H;
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
    public dz0 S;
    public int T;
    public int U;
    public boolean V;
    public a2 W;
    public int f55496a;
    public final f6 f55497a0;
    public final w5 f55498b;
    public s1 f55499b0;
    public final w5 f55500c;
    public String f55501c0;
    public final Paint d;
    public fi.s0 f55502d0;
    public final Paint f55503e;
    public final Matrix f55504e0;
    public final Paint f55505f;
    public float f55506f0;
    public float f55507g0;
    public final Paint h;
    public final m1 f55508h0;
    public boolean f55509i0;
    public final Matrix f55510j0;
    public Path f55511k0;
    public Path f55512l0;
    public final RectF m0;
    public final PathMeasure f55513n;
    public float f55514n0;
    public float f55515o0;
    public final ArrayList f55516p0;
    public final Rect f55517q0;
    public final Path f55518r;
    public final Path f55519s;
    public final Path f55520w;
    public final Path f55521x;
    public volatile boolean f55522y;

    public c2(ContextThemeWrapper contextThemeWrapper, f6 f6Var) {
        super(contextThemeWrapper);
        this.f55496a = -1;
        xq xqVar = xq.h;
        this.f55498b = new w5(0.0f, (View) null, 0L, 420L, xqVar);
        this.f55500c = new w5(0.0f, (View) null, 0L, 420L, xqVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f55503e = paint2;
        Paint paint3 = new Paint(1);
        this.f55505f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f55513n = new PathMeasure();
        this.f55518r = new Path();
        this.f55519s = new Path();
        this.f55520w = new Path();
        this.f55521x = new Path();
        this.F = 2.0f;
        this.f55504e0 = new Matrix();
        this.f55510j0 = new Matrix();
        this.m0 = new RectF();
        this.f55516p0 = new ArrayList();
        this.f55517q0 = new Rect();
        this.f55497a0 = f6Var;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f)}, 0.5f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(140);
        TextView textView = new TextView(contextThemeWrapper);
        this.M = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, ha.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(20.0f)));
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(org.telegram.messenger.g0.L(4.0f), blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(org.telegram.messenger.g0.L(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        m1 m1Var = new m1(contextThemeWrapper);
        this.f55508h0 = m1Var;
        m1Var.setAlpha(0.0f);
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.b(0.33f, 10.0f);
        m1Var.setBrushWeight(this.F);
        m1Var.setValueOverride(new org.telegram.ui.Components.n(this));
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.setAlpha(0.0f);
        addView(m1Var, ha.c(-1.0f, -1));
    }

    public static void c(tg.z1 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: tg.c2.c(tg.z1, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((y1) arrayList.get(0));
        int i7 = 1;
        while (i7 < arrayList.size() - 1) {
            y1 y1Var = (y1) arrayList.get(i7 - 1);
            y1 y1Var2 = (y1) arrayList.get(i7);
            i7++;
            y1 y1Var3 = (y1) arrayList.get(i7);
            int i10 = ((Point) y1Var2).x;
            int i11 = ((Point) y1Var).x;
            int i12 = ((Point) y1Var3).y;
            int i13 = ((Point) y1Var).y;
            if (Math.abs((((i12 - i13) * (i10 - i11)) - ((((Point) y1Var3).x - i11) * (((Point) y1Var2).y - i13))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(y1Var2);
            }
        }
        arrayList2.add((y1) jg.g.i(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final a2 a2Var = this.W;
        if (a2Var != null) {
            final int i7 = p10.f24467s0;
            a2Var.f55477o = true;
            if (a2Var.f55475m != null) {
                h();
                a2Var.f55475m.a(a2Var.f55466b, a2Var.f55468e.document);
                org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.z(16), 250L);
            } else if (a2Var.f55473k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = ui.a0(a2Var.f55473k, a2Var.f55467c).document;
                tL_stickers_replaceSticker.new_sticker = a2Var.f55468e;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final c2 f55880b;

                    {
                        this.f55880b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final c2 c2Var = this.f55880b;
                                final int i10 = i7;
                                final a2 a2Var2 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var2 = c2Var;
                                                final a2 a2Var3 = a2Var2;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i11 = i10;
                                                    z9 = true;
                                                    ui.b0(i11).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i11).B0(tL_messages_stickerSet.set.f26980id, true)) {
                                                        ui.b0(i11).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var = c2Var2.f55502d0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i12 = r4;
                                                            a2 a2Var4 = a2Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            c2 c2Var3 = c2Var2;
                                                            switch (i12) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var4.f55469f.document;
                                                                    String str = a2Var4.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject3, document, str, bool);
                                                                    c2Var3.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject3, a2Var4.f55469f.document, a2Var4.f55474l, Boolean.TRUE);
                                                                    c2Var3.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var4.f55469f.document;
                                                                    String str2 = a2Var4.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject3, document2, str2, bool2);
                                                                    c2Var3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var2.n(tL_error);
                                                    c2Var2.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var = a2Var3.f55476n;
                                                if (c20Var != null) {
                                                    c20Var.a(Boolean.valueOf(z9));
                                                    a2Var3.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var3 = c2Var;
                                                final a2 a2Var4 = a2Var2;
                                                if (z13) {
                                                    int i12 = i10;
                                                    z10 = true;
                                                    ui.b0(i12).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i12).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var2 = c2Var3.f55502d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            a2 a2Var42 = a2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var32 = c2Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var42.f55469f.document;
                                                                    String str = a2Var42.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55469f.document, a2Var42.f55474l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var42.f55469f.document;
                                                                    String str2 = a2Var42.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var3.n(tL_error);
                                                    c2Var3.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var2 = a2Var4.f55476n;
                                                if (c20Var2 != null) {
                                                    c20Var2.a(Boolean.valueOf(z10));
                                                    a2Var4.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var;
                                                final a2 a2Var5 = a2Var2;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z11 = true;
                                                    ui.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i13).B0(tL_messages_stickerSet2.set.f26980id, true)) {
                                                        ui.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.f55502d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            a2 a2Var42 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var32 = c2Var4;
                                                            switch (i122) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var42.f55469f.document;
                                                                    String str = a2Var42.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55469f.document, a2Var42.f55474l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var42.f55469f.document;
                                                                    String str2 = a2Var42.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var3 = a2Var5.f55476n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z11));
                                                    a2Var5.f55476n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final c2 c2Var2 = this.f55880b;
                                final int i11 = i7;
                                final a2 a2Var3 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var2;
                                                final a2 a2Var32 = a2Var3;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z9 = true;
                                                    ui.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i112).B0(tL_messages_stickerSet.set.f26980id, true)) {
                                                        ui.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var = c2Var22.f55502d0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            a2 a2Var42 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var32 = c2Var22;
                                                            switch (i122) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var42.f55469f.document;
                                                                    String str = a2Var42.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55469f.document, a2Var42.f55474l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var42.f55469f.document;
                                                                    String str2 = a2Var42.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var = a2Var32.f55476n;
                                                if (c20Var != null) {
                                                    c20Var.a(Boolean.valueOf(z9));
                                                    a2Var32.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var3 = c2Var2;
                                                final a2 a2Var4 = a2Var3;
                                                if (z13) {
                                                    int i12 = i11;
                                                    z10 = true;
                                                    ui.b0(i12).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i12).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var2 = c2Var3.f55502d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            a2 a2Var42 = a2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var32 = c2Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var42.f55469f.document;
                                                                    String str = a2Var42.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55469f.document, a2Var42.f55474l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var42.f55469f.document;
                                                                    String str2 = a2Var42.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var3.n(tL_error);
                                                    c2Var3.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var2 = a2Var4.f55476n;
                                                if (c20Var2 != null) {
                                                    c20Var2.a(Boolean.valueOf(z10));
                                                    a2Var4.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var2;
                                                final a2 a2Var5 = a2Var3;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z11 = true;
                                                    ui.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i13).B0(tL_messages_stickerSet2.set.f26980id, true)) {
                                                        ui.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.f55502d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            a2 a2Var42 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var32 = c2Var4;
                                                            switch (i122) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var42.f55469f.document;
                                                                    String str = a2Var42.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55469f.document, a2Var42.f55474l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var42.f55469f.document;
                                                                    String str2 = a2Var42.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var3 = a2Var5.f55476n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z11));
                                                    a2Var5.f55476n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final c2 c2Var3 = this.f55880b;
                                final int i12 = i7;
                                final a2 a2Var4 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var3;
                                                final a2 a2Var32 = a2Var4;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z9 = true;
                                                    ui.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i112).B0(tL_messages_stickerSet.set.f26980id, true)) {
                                                        ui.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var = c2Var22.f55502d0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            a2 a2Var42 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var32 = c2Var22;
                                                            switch (i122) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var42.f55469f.document;
                                                                    String str = a2Var42.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55469f.document, a2Var42.f55474l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var42.f55469f.document;
                                                                    String str2 = a2Var42.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var = a2Var32.f55476n;
                                                if (c20Var != null) {
                                                    c20Var.a(Boolean.valueOf(z9));
                                                    a2Var32.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var3;
                                                final a2 a2Var42 = a2Var4;
                                                if (z13) {
                                                    int i122 = i12;
                                                    z10 = true;
                                                    ui.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var2 = c2Var32.f55502d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var2 = a2Var42.f55476n;
                                                if (c20Var2 != null) {
                                                    c20Var2.a(Boolean.valueOf(z10));
                                                    a2Var42.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var3;
                                                final a2 a2Var5 = a2Var4;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z11 = true;
                                                    ui.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i13).B0(tL_messages_stickerSet2.set.f26980id, true)) {
                                                        ui.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.f55502d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var3 = a2Var5.f55476n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z11));
                                                    a2Var5.f55476n = null;
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
            } else if (a2Var.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = a2Var.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(a2Var.f55468e);
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final c2 f55880b;

                    {
                        this.f55880b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final c2 c2Var = this.f55880b;
                                final int i10 = i7;
                                final a2 a2Var2 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var;
                                                final a2 a2Var32 = a2Var2;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z9 = true;
                                                    ui.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i112).B0(tL_messages_stickerSet.set.f26980id, true)) {
                                                        ui.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var = c2Var22.f55502d0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var = a2Var32.f55476n;
                                                if (c20Var != null) {
                                                    c20Var.a(Boolean.valueOf(z9));
                                                    a2Var32.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var;
                                                final a2 a2Var42 = a2Var2;
                                                if (z13) {
                                                    int i122 = i10;
                                                    z10 = true;
                                                    ui.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var2 = c2Var32.f55502d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var2 = a2Var42.f55476n;
                                                if (c20Var2 != null) {
                                                    c20Var2.a(Boolean.valueOf(z10));
                                                    a2Var42.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var;
                                                final a2 a2Var5 = a2Var2;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z11 = true;
                                                    ui.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i13).B0(tL_messages_stickerSet2.set.f26980id, true)) {
                                                        ui.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.f55502d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var3 = a2Var5.f55476n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z11));
                                                    a2Var5.f55476n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final c2 c2Var2 = this.f55880b;
                                final int i11 = i7;
                                final a2 a2Var3 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var2;
                                                final a2 a2Var32 = a2Var3;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z9 = true;
                                                    ui.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i112).B0(tL_messages_stickerSet.set.f26980id, true)) {
                                                        ui.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var = c2Var22.f55502d0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var = a2Var32.f55476n;
                                                if (c20Var != null) {
                                                    c20Var.a(Boolean.valueOf(z9));
                                                    a2Var32.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var2;
                                                final a2 a2Var42 = a2Var3;
                                                if (z13) {
                                                    int i122 = i11;
                                                    z10 = true;
                                                    ui.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var2 = c2Var32.f55502d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var2 = a2Var42.f55476n;
                                                if (c20Var2 != null) {
                                                    c20Var2.a(Boolean.valueOf(z10));
                                                    a2Var42.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var2;
                                                final a2 a2Var5 = a2Var3;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z11 = true;
                                                    ui.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i13).B0(tL_messages_stickerSet2.set.f26980id, true)) {
                                                        ui.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.f55502d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var3 = a2Var5.f55476n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z11));
                                                    a2Var5.f55476n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final c2 c2Var3 = this.f55880b;
                                final int i12 = i7;
                                final a2 a2Var4 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var3;
                                                final a2 a2Var32 = a2Var4;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z9 = true;
                                                    ui.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i112).B0(tL_messages_stickerSet.set.f26980id, true)) {
                                                        ui.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var = c2Var22.f55502d0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var = a2Var32.f55476n;
                                                if (c20Var != null) {
                                                    c20Var.a(Boolean.valueOf(z9));
                                                    a2Var32.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var3;
                                                final a2 a2Var42 = a2Var4;
                                                if (z13) {
                                                    int i122 = i12;
                                                    z10 = true;
                                                    ui.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var2 = c2Var32.f55502d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var2 = a2Var42.f55476n;
                                                if (c20Var2 != null) {
                                                    c20Var2.a(Boolean.valueOf(z10));
                                                    a2Var42.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var3;
                                                final a2 a2Var5 = a2Var4;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z11 = true;
                                                    ui.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i13).B0(tL_messages_stickerSet2.set.f26980id, true)) {
                                                        ui.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.f55502d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var3 = a2Var5.f55476n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z11));
                                                    a2Var5.f55476n = null;
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
            } else if (a2Var.h) {
                h();
                qs.f(i7).m(qs.f25065s3, Boolean.FALSE);
                org.telegram.messenger.g0.i3(new sg.t0(a2Var, 7), 350L);
                c20 c20Var = a2Var.f55476n;
                if (c20Var != null) {
                    c20Var.a(Boolean.TRUE);
                }
            } else if (a2Var.f55471i != 0) {
                gz.C(i7).v0(a2Var.f55469f.document, null, a2Var.f55471i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                fi.s0 s0Var = this.f55502d0;
                if (s0Var != null) {
                    s0Var.setProgress(1.0f);
                }
                org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.h2(this, i7, 9), 450L);
                c20 c20Var2 = a2Var.f55476n;
                if (c20Var2 != null) {
                    c20Var2.a(Boolean.TRUE);
                    a2Var.f55476n = null;
                }
            } else if (a2Var.f55472j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = ui.Z(a2Var.f55472j);
                tL_stickers_addStickerToSet.sticker = a2Var.f55468e;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final c2 f55880b;

                    {
                        this.f55880b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final c2 c2Var = this.f55880b;
                                final int i10 = i7;
                                final a2 a2Var2 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var;
                                                final a2 a2Var32 = a2Var2;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z9 = true;
                                                    ui.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i112).B0(tL_messages_stickerSet.set.f26980id, true)) {
                                                        ui.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var2 = c2Var22.f55502d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var3 = a2Var32.f55476n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z9));
                                                    a2Var32.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var;
                                                final a2 a2Var42 = a2Var2;
                                                if (z13) {
                                                    int i122 = i10;
                                                    z10 = true;
                                                    ui.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var22 = c2Var32.f55502d0;
                                                    if (s0Var22 != null) {
                                                        s0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var22 = a2Var42.f55476n;
                                                if (c20Var22 != null) {
                                                    c20Var22.a(Boolean.valueOf(z10));
                                                    a2Var42.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var;
                                                final a2 a2Var5 = a2Var2;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z11 = true;
                                                    ui.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i13).B0(tL_messages_stickerSet2.set.f26980id, true)) {
                                                        ui.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.f55502d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var32 = a2Var5.f55476n;
                                                if (c20Var32 != null) {
                                                    c20Var32.a(Boolean.valueOf(z11));
                                                    a2Var5.f55476n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final c2 c2Var2 = this.f55880b;
                                final int i11 = i7;
                                final a2 a2Var3 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var2;
                                                final a2 a2Var32 = a2Var3;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z9 = true;
                                                    ui.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i112).B0(tL_messages_stickerSet.set.f26980id, true)) {
                                                        ui.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var2 = c2Var22.f55502d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var3 = a2Var32.f55476n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z9));
                                                    a2Var32.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var2;
                                                final a2 a2Var42 = a2Var3;
                                                if (z13) {
                                                    int i122 = i11;
                                                    z10 = true;
                                                    ui.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var22 = c2Var32.f55502d0;
                                                    if (s0Var22 != null) {
                                                        s0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var22 = a2Var42.f55476n;
                                                if (c20Var22 != null) {
                                                    c20Var22.a(Boolean.valueOf(z10));
                                                    a2Var42.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var2;
                                                final a2 a2Var5 = a2Var3;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z11 = true;
                                                    ui.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i13).B0(tL_messages_stickerSet2.set.f26980id, true)) {
                                                        ui.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.f55502d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var32 = a2Var5.f55476n;
                                                if (c20Var32 != null) {
                                                    c20Var32.a(Boolean.valueOf(z11));
                                                    a2Var5.f55476n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final c2 c2Var3 = this.f55880b;
                                final int i12 = i7;
                                final a2 a2Var4 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var3;
                                                final a2 a2Var32 = a2Var4;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z9 = true;
                                                    ui.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i112).B0(tL_messages_stickerSet.set.f26980id, true)) {
                                                        ui.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var2 = c2Var22.f55502d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var3 = a2Var32.f55476n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z9));
                                                    a2Var32.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var3;
                                                final a2 a2Var42 = a2Var4;
                                                if (z13) {
                                                    int i122 = i12;
                                                    z10 = true;
                                                    ui.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var22 = c2Var32.f55502d0;
                                                    if (s0Var22 != null) {
                                                        s0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var22 = a2Var42.f55476n;
                                                if (c20Var22 != null) {
                                                    c20Var22.a(Boolean.valueOf(z10));
                                                    a2Var42.f55476n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var3;
                                                final a2 a2Var5 = a2Var4;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z11 = true;
                                                    ui.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i13).B0(tL_messages_stickerSet2.set.f26980id, true)) {
                                                        ui.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.f55502d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document = a2Var422.f55469f.document;
                                                                    String str = a2Var422.f55474l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    qs.f(p10.f24467s0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55469f.document, a2Var422.f55474l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    qs f11 = qs.f(p10.f24467s0);
                                                                    TLRPC.Document document2 = a2Var422.f55469f.document;
                                                                    String str2 = a2Var422.f55474l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var32 = a2Var5.f55476n;
                                                if (c20Var32 != null) {
                                                    c20Var32.a(Boolean.valueOf(z11));
                                                    a2Var5.f55476n = null;
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
            int i7 = 0;
            while (true) {
                z1[] z1VarArr = this.H;
                if (i7 >= z1VarArr.length) {
                    break;
                }
                z1 z1Var = z1VarArr[i7];
                if (z1Var != null) {
                    z1Var.f55932l.reset();
                    Bitmap bitmap = z1Var.f55926e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        z1Var.f55926e = null;
                    }
                    Bitmap bitmap2 = z1Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        z1Var.d = null;
                    }
                    Bitmap bitmap3 = z1Var.f55928g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        z1Var.f55928g = null;
                    }
                    Bitmap bitmap4 = z1Var.f55927f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        z1Var.f55927f = null;
                    }
                }
                i7++;
            }
            this.H = null;
        }
        this.D = false;
        this.f55522y = false;
        this.L = false;
        this.M.setAlpha(0.0f);
        this.M.setScaleX(0.3f);
        this.M.setScaleY(0.3f);
        a2 a2Var = this.W;
        if (a2Var != null) {
            if (!a2Var.f55477o) {
                a2Var.a();
            }
            this.W = null;
        }
        h();
        this.V = false;
    }

    public final Bitmap d(int i7, int i10, Bitmap bitmap, boolean z9) {
        Bitmap sourceBitmap = getSourceBitmap();
        if (bitmap != null && !bitmap.isRecycled() && sourceBitmap != null) {
            Paint paint = new Paint(3);
            int width = sourceBitmap.getWidth();
            int height = sourceBitmap.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(createBitmap);
            if (z9) {
                canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                canvas.drawBitmap(bitmap, i7, i10, paint);
            } else {
                canvas.drawBitmap(bitmap, i7, i10, paint);
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
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a2 a2Var;
        if (i7 == qs.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            a2 a2Var2 = this.W;
            if (a2Var2 != null && str.equalsIgnoreCase(a2Var2.f55466b)) {
                a2 a2Var3 = this.W;
                a2Var3.f55470g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = a2Var3.f55470g;
                if (a2Var3.f55481s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = a2Var3.f55467c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(p10.f24467s0).sendRequest(tL_messages_uploadMedia, new n41(7, this, a2Var3), 2);
            }
        } else if (i7 == qs.W1) {
            String str2 = (String) objArr[0];
            a2 a2Var4 = this.W;
            if (a2Var4 != null && str2.equalsIgnoreCase(a2Var4.f55466b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    a2 a2Var5 = this.W;
                    a2Var5.f55483u = Utilities.i(((float) longValue) / ((float) longValue2), 1.0f, a2Var5.f55483u);
                    fi.s0 s0Var = this.f55502d0;
                    if (s0Var != null) {
                        s0Var.setProgress(this.W.b());
                    }
                }
            }
        } else if (i7 == qs.V1) {
            String str3 = (String) objArr[0];
            a2 a2Var6 = this.W;
            if (a2Var6 != null && str3.equalsIgnoreCase(a2Var6.f55466b)) {
                h();
            }
        } else if (i7 == qs.f24960a2) {
            a2 a2Var7 = this.W;
            if (a2Var7 != null && objArr[0] == a2Var7.f55480r) {
                w7.G(p10.f24467s0).h0(false, 67108864, this.W.f55466b, true);
            }
        } else if (i7 == qs.f24966b2) {
            a2 a2Var8 = this.W;
            if (a2Var8 != null && objArr[0] == a2Var8.f55480r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                float floatValue = f10.floatValue();
                this.W.f55480r.f23262p0.Y = true;
                w7.G(this.f55496a).n(str4, false, Math.max(1L, longValue3), longValue4, f10);
                a2 a2Var9 = this.W;
                a2Var9.f55482t = Math.max(a2Var9.f55482t, floatValue);
                fi.s0 s0Var2 = this.f55502d0;
                if (s0Var2 != null) {
                    s0Var2.setProgress(this.W.b());
                }
            }
        } else if (i7 == qs.f24972c2 && (a2Var = this.W) != null && objArr[0] == a2Var.f55480r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.f55520w, this.f55503e);
        canvas.drawPath(this.f55521x, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: tg.c2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        z1 z1Var = this.E;
        if (z1Var != null) {
            this.K = bitmap;
            if (z1Var.f55927f != null && this.L) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                z1 z1Var2 = this.E;
                if (z1Var2.f55925c != 0) {
                    Matrix matrix = new Matrix();
                    z1 z1Var3 = this.E;
                    matrix.postRotate(z1Var3.f55925c, z1Var3.a().getWidth() / 2.0f, this.E.a().getHeight() / 2.0f);
                    z1 z1Var4 = this.E;
                    if ((z1Var4.f55925c / 90) % 2 != 0) {
                        float height = (z1Var4.b().getHeight() - this.E.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.E.a().getHeight(), bitmap.getHeight() / this.E.a().getWidth());
                    canvas.drawBitmap(this.E.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(z1Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f55498b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.M;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(xq.h).start();
    }

    public final void g(Canvas canvas, boolean z9, ViewGroup viewGroup, boolean z10) {
        boolean z11;
        float d;
        float f10;
        Paint paint;
        w5 w5Var = this.f55500c;
        w5Var.f39853a = viewGroup;
        boolean z12 = this.f55509i0;
        if (z12 || w5Var.f39855c > 0.0f) {
            if (viewGroup == null) {
                d = 1.0f;
            } else {
                if (z12 && !z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d = w5Var.d(z11);
            }
            z1[] z1VarArr = this.H;
            if (z1VarArr != null) {
                for (z1 z1Var : z1VarArr) {
                    if (z1Var != null && z1Var == this.E) {
                        if (this.F > 0.0f) {
                            if (z1Var.f55940t.f55511k0 != null) {
                                canvas.save();
                                canvas.clipPath(z1Var.f55940t.f55511k0);
                                if (z1Var.f55940t.I != null) {
                                    if (z9) {
                                        paint = z1Var.f55937q;
                                    } else {
                                        paint = z1Var.f55936p;
                                    }
                                    paint.setAlpha((int) (d * 255.0f));
                                    paint.setStrokeWidth(org.telegram.messenger.g0.L(f10));
                                    canvas.drawPath(z1Var.f55932l, paint);
                                    if (z1Var.f55940t.f55511k0 != null && z9) {
                                        canvas.clipPath(z1Var.f55932l);
                                        paint.setStrokeWidth(org.telegram.messenger.g0.L(f10 * 2.0f));
                                        canvas.drawPath(z1Var.f55940t.f55511k0, paint);
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
        z1 z1Var;
        if (this.L && (z1Var = this.E) != null) {
            return z1Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.I;
    }

    public dz0 getThanosEffect() {
        if (!dz0.c()) {
            return null;
        }
        if (this.S == null) {
            dz0 dz0Var = new dz0(getContext(), new t1(this, 1));
            this.S = dz0Var;
            addView(dz0Var, ha.c(-1.0f, -1));
        }
        return this.S;
    }

    public final void h() {
        fi.s0 s0Var = this.f55502d0;
        if (s0Var != null) {
            s0Var.a();
            this.f55502d0 = null;
        }
    }

    public final boolean i() {
        return this.L;
    }

    public final z1 j(float f10, float f11) {
        int width;
        int height;
        if (this.I == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            z1[] z1VarArr = this.H;
            if (i7 >= z1VarArr.length) {
                return null;
            }
            z1 z1Var = z1VarArr[i7];
            if (z1Var != null) {
                if ((z1Var.f55925c / 90) % 2 != 0) {
                    width = this.I.getHeight();
                    height = this.I.getWidth();
                } else {
                    width = this.I.getWidth();
                    height = this.I.getHeight();
                }
                RectF rectF = org.telegram.messenger.g0.P;
                RectF rectF2 = this.H[i7].f55929i;
                float f12 = width;
                float f13 = this.f55506f0;
                float f14 = height;
                float f15 = this.f55507g0;
                rectF.set((rectF2.left / f12) * f13, (rectF2.top / f14) * f15, (rectF2.right / f12) * f13, (rectF2.bottom / f14) * f15);
                this.f55504e0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return z1Var;
                }
            }
            i7++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        z1[] z1VarArr = this.H;
        if (z1VarArr != null) {
            for (z1 z1Var : z1VarArr) {
                if (z1Var != null && (bitmap = z1Var.f55926e) != null) {
                    bitmap.recycle();
                    z1Var.f55926e = null;
                    Bitmap bitmap2 = z1Var.f55928g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        z1Var.f55928g = null;
                    }
                    c(z1Var, this.T, this.U);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i7, int i10, int i11, jn0 jn0Var) {
        int i12;
        int i13;
        vb.c cVar;
        if (i10 <= 0) {
            i12 = org.telegram.messenger.g0.f22544q.x;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            i13 = org.telegram.messenger.g0.f22544q.y;
        } else {
            i13 = i11;
        }
        this.T = i12;
        this.U = i13;
        if (!this.D && !this.f55522y && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.I = bitmap;
            this.J = i7;
            this.f55501c0 = null;
            d4 d4Var = new d4(this, i7, jn0Var, 5);
            this.f55522y = true;
            ia.a aVar = new ia.a();
            aVar.f15408b = true;
            aVar.f15409c = true;
            zzd a10 = ke.a(new zb.d(aVar));
            if (n6.h(getContext()).f()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.I;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.f55490e = min;
                obj.d = min;
                obj.f55487a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f55487a).drawRect(0.0f, 0.0f, obj.d, obj.f55490e, k6.Dm);
                obj.f55488b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f55489c = (bitmap2.getHeight() - obj.f55490e) / 2;
                arrayList.add(obj);
                d4Var.a(arrayList);
                return;
            }
            ub.a a11 = ub.a.a(bitmap, i7);
            a10.g(a11).addOnSuccessListener(new m3(d4Var, 24)).addOnFailureListener(new i6(this, bitmap, i7, jn0Var, d4Var, 5));
            if (this.f55501c0 == null) {
                xb.a aVar2 = xb.a.f58587b;
                q6.m.h(aVar2, "options cannot be null");
                synchronized (vb.c.class) {
                    cVar = (vb.c) pb.g.c().a(vb.c.class);
                }
                ua.b bVar = (ua.b) cVar.f57218a.get(xb.a.class);
                q6.m.g(bVar);
                yb.c cVar2 = (yb.c) bVar.get();
                cVar2.getClass();
                ta taVar = cVar2.f59248c;
                ?? obj2 = new Object();
                obj2.f337c = y7.TYPE_THIN;
                pb.m.f53451a.execute(new pa(taVar, new wa((b8) obj2, 1), a8.ON_DEVICE_IMAGE_LABEL_CREATE, taVar.b(), 0));
                new ImageLabelerImpl((pb.e) cVar2.f59246a.R0(aVar2), (Executor) cVar2.f59247b.f53432a.get(), new n6.c("vision.ica", 1L)).g(a11).addOnSuccessListener(new m3(this, 25)).addOnFailureListener(new s0.b(18));
            }
            ArrayList arrayList2 = ui.b0(this.f55496a).f25825n;
            for (int i14 = 0; i14 < Math.min(arrayList2.size(), 9); i14++) {
                org.telegram.messenger.i6.g(((TLRPC.TL_availableReaction) arrayList2.get(i14)).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new hc((FrameLayout) getParent(), this.f55497a0).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f55511k0;
        if (path == null) {
            this.f55511k0 = new Path();
        } else {
            path.rewind();
        }
        if (this.f55512l0 == null) {
            this.f55512l0 = new Path();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.f55512l0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f55511k0.addPath(this.f55512l0, this.f55510j0);
        this.f55511k0.computeBounds(this.m0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f55496a).c(this, qs.U1);
        qs.f(this.f55496a).c(this, qs.W1);
        qs.f(this.f55496a).c(this, qs.V1);
        qs.f(this.f55496a).c(this, qs.f24972c2);
        qs.f(this.f55496a).c(this, qs.f24960a2);
        qs.f(this.f55496a).c(this, qs.f24966b2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f55496a;
        if (i7 >= 0) {
            qs.f(i7).n(this, qs.U1);
            qs.f(this.f55496a).n(this, qs.W1);
            qs.f(this.f55496a).n(this, qs.V1);
            qs.f(this.f55496a).n(this, qs.f24972c2);
            qs.f(this.f55496a).n(this, qs.f24960a2);
            qs.f(this.f55496a).n(this, qs.f24966b2);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(10.0f);
        float f10 = L * 2.0f;
        float measuredWidth = getMeasuredWidth() - f10;
        float measuredHeight = getMeasuredHeight() - f10;
        float f11 = measuredWidth / 8.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = measuredWidth + L;
        rectF.set(L, L, f12, f12);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.f55519s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.f55518r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.f55520w;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f55521x;
        path4.rewind();
        rectF.inset(org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(-1.0f));
        path4.addRoundRect(rectF, f11, f11, direction);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.M.setTranslationY(-((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f55516p0;
            arrayList.clear();
            if (this.f55509i0) {
                Rect rect = this.f55517q0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final j20 j20Var, final String str2, final CharSequence charSequence, final boolean z9, final long j3, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final c20 c20Var, final v10 v10Var) {
        org.telegram.messenger.g0.i3(new Runnable() {
            @Override
            public final void run() {
                boolean z10;
                a2 a2Var;
                c2 c2Var = c2.this;
                c20 c20Var2 = c20Var;
                if (c20Var2 != null && (a2Var = c2Var.W) != null && a2Var.f55477o) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    a2 a2Var2 = c2Var.W;
                    if (a2Var2 != null) {
                        a2Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f55478p = new ArrayList();
                    obj.f55479q = new ArrayList();
                    obj.f55482t = 0.0f;
                    obj.f55483u = 0.0f;
                    c2Var.W = obj;
                }
                a2 a2Var3 = c2Var.W;
                a2Var3.f55467c = str2;
                String str4 = str;
                a2Var3.f55466b = str4;
                a2Var3.f55465a = str4;
                a2Var3.d = charSequence;
                a2Var3.h = z9;
                a2Var3.f55471i = j3;
                a2Var3.f55472j = stickerSet;
                a2Var3.f55473k = document;
                j20 j20Var2 = j20Var;
                a2Var3.f55481s = j20Var2;
                a2Var3.f55474l = str3;
                a2Var3.f55476n = c20Var2;
                a2Var3.f55475m = v10Var;
                ArrayList arrayList = a2Var3.f55479q;
                if (!TextUtils.isEmpty(str4)) {
                    a2Var3.f55478p.add(new File(a2Var3.f55466b));
                }
                if (!TextUtils.isEmpty(a2Var3.f55465a) && !TextUtils.equals(a2Var3.f55465a, a2Var3.f55466b)) {
                    arrayList.add(new File(a2Var3.f55465a));
                }
                if (!TextUtils.isEmpty(a2Var3.f55474l)) {
                    arrayList.add(new File(a2Var3.f55474l));
                }
                if (!z10) {
                    c2Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        a2 a2Var4 = c2Var.W;
                        a2Var4.f55468e = ui.a0(document3, a2Var4.f55467c);
                        c2Var.W.f55469f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = c2Var.W.f55469f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        c2Var.a();
                    } else if (j20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f26974id = 1;
                        a2 a2Var5 = c2Var.W;
                        String absolutePath = e7.w(p10.f24467s0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        a2Var5.f55466b = absolutePath;
                        c2Var.W.f55480r = new ij(p10.f24467s0, tL_message, null, false, false);
                        c2Var.W.f55480r.f23262p0 = j20Var2;
                        MediaController.B().h0(c2Var.W.f55480r, false, false, false);
                    } else {
                        w7.G(c2Var.f55496a).h0(false, 67108864, str4, true);
                    }
                }
                if (c20Var2 == null) {
                    if (c2Var.f55502d0 == null) {
                        c2Var.f55502d0 = new fi.s0(c2Var.getContext(), hd.M0(2131746918, null));
                    }
                    c2Var.f55502d0.setOnCancelListener(new t1(c2Var, 0));
                    if (c2Var.f55502d0.getParent() == null) {
                        c2Var.addView(c2Var.f55502d0, ha.e(-1, -1, 17));
                    }
                    fi.s0 s0Var = c2Var.f55502d0;
                    s0Var.E = true;
                    s0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i7) {
        int i10 = this.f55496a;
        if (i10 != i7) {
            int i11 = qs.f24966b2;
            int i12 = qs.f24960a2;
            int i13 = qs.f24972c2;
            int i14 = qs.V1;
            int i15 = qs.W1;
            int i16 = qs.U1;
            if (i10 >= 0 && isAttachedToWindow()) {
                qs.f(this.f55496a).n(this, i16);
                qs.f(this.f55496a).n(this, i15);
                qs.f(this.f55496a).n(this, i14);
                qs.f(this.f55496a).n(this, i13);
                qs.f(this.f55496a).n(this, i12);
                qs.f(this.f55496a).n(this, i11);
            }
            this.f55496a = i7;
            if (i7 >= 0 && isAttachedToWindow()) {
                qs.f(this.f55496a).c(this, i16);
                qs.f(this.f55496a).c(this, i15);
                qs.f(this.f55496a).c(this, i14);
                qs.f(this.f55496a).c(this, i13);
                qs.f(this.f55496a).c(this, i12);
                qs.f(this.f55496a).c(this, i11);
            }
        }
    }

    public void setOutlineVisible(boolean z9) {
        float f10;
        if (this.f55509i0 != z9) {
            this.f55509i0 = z9;
            ViewPropertyAnimator animate = this.f55508h0.animate();
            float f11 = 0.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (!z9) {
                f11 = org.telegram.messenger.g0.L(-18.0f);
            }
            alpha.translationX(f11).setInterpolator(xq.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f55516p0;
                arrayList.clear();
                if (this.f55509i0) {
                    Rect rect = this.f55517q0;
                    arrayList.add(rect);
                    int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                    rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
                }
                setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    public void setOutlineWidth(float f10) {
        this.F = f10;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(s1 s1Var) {
        this.f55499b0 = s1Var;
    }
}

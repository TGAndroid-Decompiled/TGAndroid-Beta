package ug;

import ai.g3;
import ai.m3;
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
import b8.cg;
import b8.kg;
import b8.mf;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import gi.f7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.li;
import org.telegram.messenger.n10;
import org.telegram.messenger.n6;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.en0;
import org.telegram.ui.hb1;
import org.telegram.ui.m21;
import x7.q5;
import z7.da;
import z7.l7;
import z7.n7;
public final class c2 extends FrameLayout implements cs {
    public static final int f55894s0 = 0;
    public volatile boolean E;
    public z1 F;
    public float G;
    public boolean H;
    public z1[] I;
    public volatile Bitmap J;
    public int K;
    public Bitmap L;
    public boolean M;
    public final TextView N;
    public ValueAnimator O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public cz0 T;
    public int U;
    public int V;
    public boolean W;
    public int f55895a;
    public a2 f55896a0;
    public final u5 f55897b;
    public final e6 f55898b0;
    public final u5 f55899c;
    public s1 f55900c0;
    public final Paint d;
    public String f55901d0;
    public final Paint f55902e;
    public gi.s0 f55903e0;
    public final Paint f55904f;
    public final Matrix f55905f0;
    public float f55906g0;
    public final Paint h;
    public float f55907h0;
    public final l1 f55908i0;
    public boolean f55909j0;
    public final Matrix f55910k0;
    public Path f55911l0;
    public Path m0;
    public final PathMeasure f55912n;
    public final RectF f55913n0;
    public float f55914o0;
    public float f55915p0;
    public final ArrayList f55916q0;
    public final Path f55917r;
    public final Rect f55918r0;
    public final Path f55919s;
    public final Path f55920w;
    public final Path f55921x;
    public volatile boolean f55922y;

    public c2(ContextThemeWrapper contextThemeWrapper, e6 e6Var) {
        super(contextThemeWrapper);
        this.f55895a = -1;
        xq xqVar = xq.h;
        this.f55897b = new u5(0.0f, (View) null, 0L, 420L, xqVar);
        this.f55899c = new u5(0.0f, (View) null, 0L, 420L, xqVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f55902e = paint2;
        Paint paint3 = new Paint(1);
        this.f55904f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f55912n = new PathMeasure();
        this.f55917r = new Path();
        this.f55919s = new Path();
        this.f55920w = new Path();
        this.f55921x = new Path();
        this.G = 2.0f;
        this.f55905f0 = new Matrix();
        this.f55910k0 = new Matrix();
        this.f55913n0 = new RectF();
        this.f55916q0 = new ArrayList();
        this.f55918r0 = new Rect();
        this.f55898b0 = e6Var;
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
        this.N = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, mf.e(-2, -2, 17));
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
        l1 l1Var = new l1(contextThemeWrapper);
        this.f55908i0 = l1Var;
        l1Var.setAlpha(0.0f);
        l1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        l1Var.b(0.33f, 10.0f);
        l1Var.setBrushWeight(this.G);
        l1Var.setValueOverride(new nh(this, 26));
        l1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        l1Var.setAlpha(0.0f);
        addView(l1Var, mf.c(-1.0f, -1));
    }

    public static void c(ug.z1 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: ug.c2.c(ug.z1, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((y1) arrayList.get(0));
        int i3 = 1;
        while (i3 < arrayList.size() - 1) {
            y1 y1Var = (y1) arrayList.get(i3 - 1);
            y1 y1Var2 = (y1) arrayList.get(i3);
            i3++;
            y1 y1Var3 = (y1) arrayList.get(i3);
            int i10 = ((Point) y1Var2).x;
            int i11 = ((Point) y1Var).x;
            int i12 = ((Point) y1Var3).y;
            int i13 = ((Point) y1Var).y;
            if (Math.abs((((i12 - i13) * (i10 - i11)) - ((((Point) y1Var3).x - i11) * (((Point) y1Var2).y - i13))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(y1Var2);
            }
        }
        arrayList2.add((y1) k2.p1.h(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final a2 a2Var = this.f55896a0;
        if (a2Var != null) {
            final int i3 = h10.f22829t0;
            a2Var.f55875o = true;
            if (a2Var.f55873m != null) {
                h();
                a2Var.f55873m.a(a2Var.f55864b, a2Var.f55866e.document);
                org.telegram.messenger.g0.i3(new hb1(17), 250L);
            } else if (a2Var.f55871k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = li.a0(a2Var.f55871k, a2Var.f55865c).document;
                tL_stickers_replaceSticker.new_sticker = a2Var.f55866e;
                ConnectionsManager.getInstance(i3).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final c2 f56278b;

                    {
                        this.f56278b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final c2 c2Var = this.f56278b;
                                final int i10 = i3;
                                final a2 a2Var2 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var2 = c2Var;
                                                final a2 a2Var3 = a2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i11 = i10;
                                                    z10 = true;
                                                    li.b0(i11).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i11).B0(tL_messages_stickerSet.set.f27028id, true)) {
                                                        li.b0(i11).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var = c2Var2.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var4.f55867f.document;
                                                                    String str = a2Var4.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject3, document, str, bool);
                                                                    c2Var3.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject3, a2Var4.f55867f.document, a2Var4.f55872l, Boolean.TRUE);
                                                                    c2Var3.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var4.f55867f.document;
                                                                    String str2 = a2Var4.f55872l;
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
                                                    z10 = false;
                                                }
                                                u10 u10Var = a2Var3.f55874n;
                                                if (u10Var != null) {
                                                    u10Var.a(Boolean.valueOf(z10));
                                                    a2Var3.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var3 = c2Var;
                                                final a2 a2Var4 = a2Var2;
                                                if (z14) {
                                                    int i12 = i10;
                                                    z11 = true;
                                                    li.b0(i12).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i12).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var2 = c2Var3.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var42.f55867f.document;
                                                                    String str = a2Var42.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55867f.document, a2Var42.f55872l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var42.f55867f.document;
                                                                    String str2 = a2Var42.f55872l;
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
                                                    z11 = false;
                                                }
                                                u10 u10Var2 = a2Var4.f55874n;
                                                if (u10Var2 != null) {
                                                    u10Var2.a(Boolean.valueOf(z11));
                                                    a2Var4.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var;
                                                final a2 a2Var5 = a2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    li.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i13).B0(tL_messages_stickerSet2.set.f27028id, true)) {
                                                        li.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var42.f55867f.document;
                                                                    String str = a2Var42.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55867f.document, a2Var42.f55872l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var42.f55867f.document;
                                                                    String str2 = a2Var42.f55872l;
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
                                                    z12 = false;
                                                }
                                                u10 u10Var3 = a2Var5.f55874n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z12));
                                                    a2Var5.f55874n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final c2 c2Var2 = this.f56278b;
                                final int i11 = i3;
                                final a2 a2Var3 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var2;
                                                final a2 a2Var32 = a2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    li.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i112).B0(tL_messages_stickerSet.set.f27028id, true)) {
                                                        li.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var = c2Var22.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var42.f55867f.document;
                                                                    String str = a2Var42.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55867f.document, a2Var42.f55872l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var42.f55867f.document;
                                                                    String str2 = a2Var42.f55872l;
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
                                                    z10 = false;
                                                }
                                                u10 u10Var = a2Var32.f55874n;
                                                if (u10Var != null) {
                                                    u10Var.a(Boolean.valueOf(z10));
                                                    a2Var32.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var3 = c2Var2;
                                                final a2 a2Var4 = a2Var3;
                                                if (z14) {
                                                    int i12 = i11;
                                                    z11 = true;
                                                    li.b0(i12).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i12).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var2 = c2Var3.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var42.f55867f.document;
                                                                    String str = a2Var42.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55867f.document, a2Var42.f55872l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var42.f55867f.document;
                                                                    String str2 = a2Var42.f55872l;
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
                                                    z11 = false;
                                                }
                                                u10 u10Var2 = a2Var4.f55874n;
                                                if (u10Var2 != null) {
                                                    u10Var2.a(Boolean.valueOf(z11));
                                                    a2Var4.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var2;
                                                final a2 a2Var5 = a2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    li.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i13).B0(tL_messages_stickerSet2.set.f27028id, true)) {
                                                        li.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var42.f55867f.document;
                                                                    String str = a2Var42.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55867f.document, a2Var42.f55872l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var42.f55867f.document;
                                                                    String str2 = a2Var42.f55872l;
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
                                                    z12 = false;
                                                }
                                                u10 u10Var3 = a2Var5.f55874n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z12));
                                                    a2Var5.f55874n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final c2 c2Var3 = this.f56278b;
                                final int i12 = i3;
                                final a2 a2Var4 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var3;
                                                final a2 a2Var32 = a2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    li.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i112).B0(tL_messages_stickerSet.set.f27028id, true)) {
                                                        li.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var = c2Var22.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var42.f55867f.document;
                                                                    String str = a2Var42.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var42.f55867f.document, a2Var42.f55872l, Boolean.TRUE);
                                                                    c2Var32.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var42.f55867f.document;
                                                                    String str2 = a2Var42.f55872l;
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
                                                    z10 = false;
                                                }
                                                u10 u10Var = a2Var32.f55874n;
                                                if (u10Var != null) {
                                                    u10Var.a(Boolean.valueOf(z10));
                                                    a2Var32.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var3;
                                                final a2 a2Var42 = a2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    li.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var2 = c2Var32.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z11 = false;
                                                }
                                                u10 u10Var2 = a2Var42.f55874n;
                                                if (u10Var2 != null) {
                                                    u10Var2.a(Boolean.valueOf(z11));
                                                    a2Var42.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var3;
                                                final a2 a2Var5 = a2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    li.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i13).B0(tL_messages_stickerSet2.set.f27028id, true)) {
                                                        li.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z12 = false;
                                                }
                                                u10 u10Var3 = a2Var5.f55874n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z12));
                                                    a2Var5.f55874n = null;
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
                tL_stickers_createStickerSet.stickers.add(a2Var.f55866e);
                ConnectionsManager.getInstance(i3).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final c2 f56278b;

                    {
                        this.f56278b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final c2 c2Var = this.f56278b;
                                final int i10 = i3;
                                final a2 a2Var2 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var;
                                                final a2 a2Var32 = a2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z10 = true;
                                                    li.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i112).B0(tL_messages_stickerSet.set.f27028id, true)) {
                                                        li.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var = c2Var22.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z10 = false;
                                                }
                                                u10 u10Var = a2Var32.f55874n;
                                                if (u10Var != null) {
                                                    u10Var.a(Boolean.valueOf(z10));
                                                    a2Var32.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var;
                                                final a2 a2Var42 = a2Var2;
                                                if (z14) {
                                                    int i122 = i10;
                                                    z11 = true;
                                                    li.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var2 = c2Var32.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z11 = false;
                                                }
                                                u10 u10Var2 = a2Var42.f55874n;
                                                if (u10Var2 != null) {
                                                    u10Var2.a(Boolean.valueOf(z11));
                                                    a2Var42.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var;
                                                final a2 a2Var5 = a2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    li.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i13).B0(tL_messages_stickerSet2.set.f27028id, true)) {
                                                        li.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z12 = false;
                                                }
                                                u10 u10Var3 = a2Var5.f55874n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z12));
                                                    a2Var5.f55874n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final c2 c2Var2 = this.f56278b;
                                final int i11 = i3;
                                final a2 a2Var3 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var2;
                                                final a2 a2Var32 = a2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    li.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i112).B0(tL_messages_stickerSet.set.f27028id, true)) {
                                                        li.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var = c2Var22.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z10 = false;
                                                }
                                                u10 u10Var = a2Var32.f55874n;
                                                if (u10Var != null) {
                                                    u10Var.a(Boolean.valueOf(z10));
                                                    a2Var32.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var2;
                                                final a2 a2Var42 = a2Var3;
                                                if (z14) {
                                                    int i122 = i11;
                                                    z11 = true;
                                                    li.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var2 = c2Var32.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z11 = false;
                                                }
                                                u10 u10Var2 = a2Var42.f55874n;
                                                if (u10Var2 != null) {
                                                    u10Var2.a(Boolean.valueOf(z11));
                                                    a2Var42.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var2;
                                                final a2 a2Var5 = a2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    li.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i13).B0(tL_messages_stickerSet2.set.f27028id, true)) {
                                                        li.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z12 = false;
                                                }
                                                u10 u10Var3 = a2Var5.f55874n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z12));
                                                    a2Var5.f55874n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final c2 c2Var3 = this.f56278b;
                                final int i12 = i3;
                                final a2 a2Var4 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var3;
                                                final a2 a2Var32 = a2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    li.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i112).B0(tL_messages_stickerSet.set.f27028id, true)) {
                                                        li.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var = c2Var22.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z10 = false;
                                                }
                                                u10 u10Var = a2Var32.f55874n;
                                                if (u10Var != null) {
                                                    u10Var.a(Boolean.valueOf(z10));
                                                    a2Var32.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var3;
                                                final a2 a2Var42 = a2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    li.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var2 = c2Var32.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z11 = false;
                                                }
                                                u10 u10Var2 = a2Var42.f55874n;
                                                if (u10Var2 != null) {
                                                    u10Var2.a(Boolean.valueOf(z11));
                                                    a2Var42.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var3;
                                                final a2 a2Var5 = a2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    li.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i13).B0(tL_messages_stickerSet2.set.f27028id, true)) {
                                                        li.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z12 = false;
                                                }
                                                u10 u10Var3 = a2Var5.f55874n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z12));
                                                    a2Var5.f55874n = null;
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
                hs.f(i3).m(hs.f23302s3, Boolean.FALSE);
                org.telegram.messenger.g0.i3(new r4.u(a2Var, 15), 350L);
                u10 u10Var = a2Var.f55874n;
                if (u10Var != null) {
                    u10Var.a(Boolean.TRUE);
                }
            } else if (a2Var.f55869i != 0) {
                yy.C(i3).v0(a2Var.f55867f.document, null, a2Var.f55869i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                gi.s0 s0Var = this.f55903e0;
                if (s0Var != null) {
                    s0Var.setProgress(1.0f);
                }
                org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.f2(this, i3, 10), 450L);
                u10 u10Var2 = a2Var.f55874n;
                if (u10Var2 != null) {
                    u10Var2.a(Boolean.TRUE);
                    a2Var.f55874n = null;
                }
            } else if (a2Var.f55870j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = li.Z(a2Var.f55870j);
                tL_stickers_addStickerToSet.sticker = a2Var.f55866e;
                ConnectionsManager.getInstance(i3).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final c2 f56278b;

                    {
                        this.f56278b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final c2 c2Var = this.f56278b;
                                final int i10 = i3;
                                final a2 a2Var2 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var;
                                                final a2 a2Var32 = a2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z10 = true;
                                                    li.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i112).B0(tL_messages_stickerSet.set.f27028id, true)) {
                                                        li.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var2 = c2Var22.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z10 = false;
                                                }
                                                u10 u10Var3 = a2Var32.f55874n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z10));
                                                    a2Var32.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var;
                                                final a2 a2Var42 = a2Var2;
                                                if (z14) {
                                                    int i122 = i10;
                                                    z11 = true;
                                                    li.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var22 = c2Var32.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z11 = false;
                                                }
                                                u10 u10Var22 = a2Var42.f55874n;
                                                if (u10Var22 != null) {
                                                    u10Var22.a(Boolean.valueOf(z11));
                                                    a2Var42.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var;
                                                final a2 a2Var5 = a2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    li.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i13).B0(tL_messages_stickerSet2.set.f27028id, true)) {
                                                        li.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z12 = false;
                                                }
                                                u10 u10Var32 = a2Var5.f55874n;
                                                if (u10Var32 != null) {
                                                    u10Var32.a(Boolean.valueOf(z12));
                                                    a2Var5.f55874n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final c2 c2Var2 = this.f56278b;
                                final int i11 = i3;
                                final a2 a2Var3 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var2;
                                                final a2 a2Var32 = a2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    li.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i112).B0(tL_messages_stickerSet.set.f27028id, true)) {
                                                        li.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var2 = c2Var22.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z10 = false;
                                                }
                                                u10 u10Var3 = a2Var32.f55874n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z10));
                                                    a2Var32.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var2;
                                                final a2 a2Var42 = a2Var3;
                                                if (z14) {
                                                    int i122 = i11;
                                                    z11 = true;
                                                    li.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var22 = c2Var32.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z11 = false;
                                                }
                                                u10 u10Var22 = a2Var42.f55874n;
                                                if (u10Var22 != null) {
                                                    u10Var22.a(Boolean.valueOf(z11));
                                                    a2Var42.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var2;
                                                final a2 a2Var5 = a2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    li.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i13).B0(tL_messages_stickerSet2.set.f27028id, true)) {
                                                        li.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z12 = false;
                                                }
                                                u10 u10Var32 = a2Var5.f55874n;
                                                if (u10Var32 != null) {
                                                    u10Var32.a(Boolean.valueOf(z12));
                                                    a2Var5.f55874n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final c2 c2Var3 = this.f56278b;
                                final int i12 = i3;
                                final a2 a2Var4 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var3;
                                                final a2 a2Var32 = a2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    li.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i112).B0(tL_messages_stickerSet.set.f27028id, true)) {
                                                        li.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var2 = c2Var22.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z10 = false;
                                                }
                                                u10 u10Var3 = a2Var32.f55874n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z10));
                                                    a2Var32.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var3;
                                                final a2 a2Var42 = a2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    li.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var22 = c2Var32.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z11 = false;
                                                }
                                                u10 u10Var22 = a2Var42.f55874n;
                                                if (u10Var22 != null) {
                                                    u10Var22.a(Boolean.valueOf(z11));
                                                    a2Var42.f55874n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var3;
                                                final a2 a2Var5 = a2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    li.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i13).B0(tL_messages_stickerSet2.set.f27028id, true)) {
                                                        li.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.f55903e0;
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
                                                                    hs f10 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document = a2Var422.f55867f.document;
                                                                    String str = a2Var422.f55872l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    hs.f(h10.f22829t0).m(215, Boolean.FALSE, tLObject32, a2Var422.f55867f.document, a2Var422.f55872l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    return;
                                                                default:
                                                                    hs f11 = hs.f(h10.f22829t0);
                                                                    TLRPC.Document document2 = a2Var422.f55867f.document;
                                                                    String str2 = a2Var422.f55872l;
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
                                                    z12 = false;
                                                }
                                                u10 u10Var32 = a2Var5.f55874n;
                                                if (u10Var32 != null) {
                                                    u10Var32.a(Boolean.valueOf(z12));
                                                    a2Var5.f55874n = null;
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
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        this.J = null;
        if (this.I != null) {
            int i3 = 0;
            while (true) {
                z1[] z1VarArr = this.I;
                if (i3 >= z1VarArr.length) {
                    break;
                }
                z1 z1Var = z1VarArr[i3];
                if (z1Var != null) {
                    z1Var.f56329l.reset();
                    Bitmap bitmap = z1Var.f56323e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        z1Var.f56323e = null;
                    }
                    Bitmap bitmap2 = z1Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        z1Var.d = null;
                    }
                    Bitmap bitmap3 = z1Var.f56325g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        z1Var.f56325g = null;
                    }
                    Bitmap bitmap4 = z1Var.f56324f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        z1Var.f56324f = null;
                    }
                }
                i3++;
            }
            this.I = null;
        }
        this.E = false;
        this.f55922y = false;
        this.M = false;
        this.N.setAlpha(0.0f);
        this.N.setScaleX(0.3f);
        this.N.setScaleY(0.3f);
        a2 a2Var = this.f55896a0;
        if (a2Var != null) {
            if (!a2Var.f55875o) {
                a2Var.a();
            }
            this.f55896a0 = null;
        }
        h();
        this.W = false;
    }

    public final Bitmap d(int i3, int i10, Bitmap bitmap, boolean z10) {
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
                canvas.drawBitmap(bitmap, i3, i10, paint);
            } else {
                canvas.drawBitmap(bitmap, i3, i10, paint);
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
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        a2 a2Var;
        if (i3 == hs.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            a2 a2Var2 = this.f55896a0;
            if (a2Var2 != null && str.equalsIgnoreCase(a2Var2.f55864b)) {
                a2 a2Var3 = this.f55896a0;
                a2Var3.f55868g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = a2Var3.f55868g;
                if (a2Var3.f55879s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = a2Var3.f55865c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(h10.f22829t0).sendRequest(tL_messages_uploadMedia, new m21(10, this, a2Var3), 2);
            }
        } else if (i3 == hs.W1) {
            String str2 = (String) objArr[0];
            a2 a2Var4 = this.f55896a0;
            if (a2Var4 != null && str2.equalsIgnoreCase(a2Var4.f55864b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    a2 a2Var5 = this.f55896a0;
                    a2Var5.f55881u = Utilities.i(((float) longValue) / ((float) longValue2), 1.0f, a2Var5.f55881u);
                    gi.s0 s0Var = this.f55903e0;
                    if (s0Var != null) {
                        s0Var.setProgress(this.f55896a0.b());
                    }
                }
            }
        } else if (i3 == hs.V1) {
            String str3 = (String) objArr[0];
            a2 a2Var6 = this.f55896a0;
            if (a2Var6 != null && str3.equalsIgnoreCase(a2Var6.f55864b)) {
                h();
            }
        } else if (i3 == hs.f23198a2) {
            a2 a2Var7 = this.f55896a0;
            if (a2Var7 != null && objArr[0] == a2Var7.f55878r) {
                w7.G(h10.f22829t0).i0(false, 67108864, this.f55896a0.f55864b, true);
            }
        } else if (i3 == hs.f23204b2) {
            a2 a2Var8 = this.f55896a0;
            if (a2Var8 != null && objArr[0] == a2Var8.f55878r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                float floatValue = f10.floatValue();
                this.f55896a0.f55878r.f26886p0.Y = true;
                w7.G(this.f55895a).n(str4, false, Math.max(1L, longValue3), longValue4, f10);
                a2 a2Var9 = this.f55896a0;
                a2Var9.f55880t = Math.max(a2Var9.f55880t, floatValue);
                gi.s0 s0Var2 = this.f55903e0;
                if (s0Var2 != null) {
                    s0Var2.setProgress(this.f55896a0.b());
                }
            }
        } else if (i3 == hs.c2 && (a2Var = this.f55896a0) != null && objArr[0] == a2Var.f55878r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.f55920w, this.f55902e);
        canvas.drawPath(this.f55921x, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ug.c2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        z1 z1Var = this.F;
        if (z1Var != null) {
            this.L = bitmap;
            if (z1Var.f56324f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                z1 z1Var2 = this.F;
                if (z1Var2.f56322c != 0) {
                    Matrix matrix = new Matrix();
                    z1 z1Var3 = this.F;
                    matrix.postRotate(z1Var3.f56322c, z1Var3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
                    z1 z1Var4 = this.F;
                    if ((z1Var4.f56322c / 90) % 2 != 0) {
                        float height = (z1Var4.b().getHeight() - this.F.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.F.a().getHeight(), bitmap.getHeight() / this.F.a().getWidth());
                    canvas.drawBitmap(this.F.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(z1Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f55897b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.N;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(xq.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        boolean z12;
        float d;
        float f10;
        Paint paint;
        u5 u5Var = this.f55899c;
        u5Var.f38643a = viewGroup;
        boolean z13 = this.f55909j0;
        if (z13 || u5Var.f38645c > 0.0f) {
            if (viewGroup == null) {
                d = 1.0f;
            } else {
                if (z13 && !z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d = u5Var.d(z12);
            }
            z1[] z1VarArr = this.I;
            if (z1VarArr != null) {
                for (z1 z1Var : z1VarArr) {
                    if (z1Var != null && z1Var == this.F) {
                        if (this.G > 0.0f) {
                            if (z1Var.f56337t.f55911l0 != null) {
                                canvas.save();
                                canvas.clipPath(z1Var.f56337t.f55911l0);
                                if (z1Var.f56337t.J != null) {
                                    if (z10) {
                                        paint = z1Var.f56334q;
                                    } else {
                                        paint = z1Var.f56333p;
                                    }
                                    paint.setAlpha((int) (d * 255.0f));
                                    paint.setStrokeWidth(org.telegram.messenger.g0.L(f10));
                                    canvas.drawPath(z1Var.f56329l, paint);
                                    if (z1Var.f56337t.f55911l0 != null && z10) {
                                        canvas.clipPath(z1Var.f56329l);
                                        paint.setStrokeWidth(org.telegram.messenger.g0.L(f10 * 2.0f));
                                        canvas.drawPath(z1Var.f56337t.f55911l0, paint);
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
        return this.Q;
    }

    public float getSegmentBorderImageWidth() {
        return this.P;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        z1 z1Var;
        if (this.M && (z1Var = this.F) != null) {
            return z1Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.J;
    }

    public cz0 getThanosEffect() {
        if (!cz0.c()) {
            return null;
        }
        if (this.T == null) {
            cz0 cz0Var = new cz0(getContext(), new t1(this, 1));
            this.T = cz0Var;
            addView(cz0Var, mf.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        gi.s0 s0Var = this.f55903e0;
        if (s0Var != null) {
            s0Var.a();
            this.f55903e0 = null;
        }
    }

    public final boolean i() {
        return this.M;
    }

    public final z1 j(float f10, float f11) {
        int width;
        int height;
        if (this.J == null) {
            return null;
        }
        int i3 = 0;
        while (true) {
            z1[] z1VarArr = this.I;
            if (i3 >= z1VarArr.length) {
                return null;
            }
            z1 z1Var = z1VarArr[i3];
            if (z1Var != null) {
                if ((z1Var.f56322c / 90) % 2 != 0) {
                    width = this.J.getHeight();
                    height = this.J.getWidth();
                } else {
                    width = this.J.getWidth();
                    height = this.J.getHeight();
                }
                RectF rectF = org.telegram.messenger.g0.P;
                RectF rectF2 = this.I[i3].f56326i;
                float f12 = width;
                float f13 = this.f55906g0;
                float f14 = height;
                float f15 = this.f55907h0;
                rectF.set((rectF2.left / f12) * f13, (rectF2.top / f14) * f15, (rectF2.right / f12) * f13, (rectF2.bottom / f14) * f15);
                this.f55905f0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return z1Var;
                }
            }
            i3++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        z1[] z1VarArr = this.I;
        if (z1VarArr != null) {
            for (z1 z1Var : z1VarArr) {
                if (z1Var != null && (bitmap = z1Var.f56323e) != null) {
                    bitmap.recycle();
                    z1Var.f56323e = null;
                    Bitmap bitmap2 = z1Var.f56325g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        z1Var.f56325g = null;
                    }
                    c(z1Var, this.U, this.V);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i3, int i10, int i11, en0 en0Var) {
        int i12;
        int i13;
        sb.c cVar;
        if (i10 <= 0) {
            i12 = org.telegram.messenger.g0.f22608q.x;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            i13 = org.telegram.messenger.g0.f22608q.y;
        } else {
            i13 = i11;
        }
        this.U = i12;
        this.V = i13;
        if (!this.E && !this.f55922y && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.J = bitmap;
            this.K = i3;
            this.f55901d0 = null;
            g3 g3Var = new g3(this, i3, en0Var, 6);
            this.f55922y = true;
            ha.a aVar = new ha.a();
            aVar.f14365b = true;
            aVar.f14366c = true;
            zzd a10 = q5.a(new wb.d(aVar));
            if (n6.h(getContext()).f()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.J;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.f55889e = min;
                obj.d = min;
                obj.f55886a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f55886a).drawRect(0.0f, 0.0f, obj.d, obj.f55889e, k6.Dm);
                obj.f55887b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f55888c = (bitmap2.getHeight() - obj.f55889e) / 2;
                arrayList.add(obj);
                g3Var.a(arrayList);
                return;
            }
            rb.a a11 = rb.a.a(bitmap, i3);
            a10.g(a11).addOnSuccessListener(new e3(g3Var, 22)).addOnFailureListener(new m3(this, bitmap, i3, en0Var, g3Var, 6));
            if (this.f55901d0 == null) {
                ub.a aVar2 = ub.a.f55806b;
                p6.m.h(aVar2, "options cannot be null");
                synchronized (sb.c.class) {
                    cVar = (sb.c) mb.g.c().a(sb.c.class);
                }
                ta.b bVar = (ta.b) cVar.f54695a.get(ub.a.class);
                p6.m.g(bVar);
                vb.c cVar2 = (vb.c) bVar.get();
                cVar2.getClass();
                da daVar = cVar2.f56508c;
                ?? obj2 = new Object();
                obj2.f17691c = l7.TYPE_THIN;
                mb.m.f19245a.execute(new cg(daVar, new kg((l2.e) obj2, 1), n7.ON_DEVICE_IMAGE_LABEL_CREATE, daVar.b(), 8));
                new ImageLabelerImpl((mb.e) cVar2.f56506a.R0(aVar2), (Executor) cVar2.f56507b.f19226a.get(), new m6.c("vision.ica", 1L)).g(a11).addOnSuccessListener(new e3(this, 23)).addOnFailureListener(new u9.j(2));
            }
            ArrayList arrayList2 = li.b0(this.f55895a).f24036n;
            for (int i14 = 0; i14 < Math.min(arrayList2.size(), 9); i14++) {
                i6.g(((TLRPC.TL_availableReaction) arrayList2.get(i14)).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new fc((FrameLayout) getParent(), this.f55898b0).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f55911l0;
        if (path == null) {
            this.f55911l0 = new Path();
        } else {
            path.rewind();
        }
        if (this.m0 == null) {
            this.m0 = new Path();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.m0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f55911l0.addPath(this.m0, this.f55910k0);
        this.f55911l0.computeBounds(this.f55913n0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.f55895a).c(this, hs.U1);
        hs.f(this.f55895a).c(this, hs.W1);
        hs.f(this.f55895a).c(this, hs.V1);
        hs.f(this.f55895a).c(this, hs.c2);
        hs.f(this.f55895a).c(this, hs.f23198a2);
        hs.f(this.f55895a).c(this, hs.f23204b2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.f55895a;
        if (i3 >= 0) {
            hs.f(i3).n(this, hs.U1);
            hs.f(this.f55895a).n(this, hs.W1);
            hs.f(this.f55895a).n(this, hs.V1);
            hs.f(this.f55895a).n(this, hs.c2);
            hs.f(this.f55895a).n(this, hs.f23198a2);
            hs.f(this.f55895a).n(this, hs.f23204b2);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(10.0f);
        float f10 = L * 2.0f;
        float measuredWidth = getMeasuredWidth() - f10;
        float measuredHeight = getMeasuredHeight() - f10;
        float f11 = measuredWidth / 8.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = measuredWidth + L;
        rectF.set(L, L, f12, f12);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.f55919s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.f55917r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.f55920w;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f55921x;
        path4.rewind();
        rectF.inset(org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(-1.0f));
        path4.addRoundRect(rectF, f11, f11, direction);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.N.setTranslationY(-((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f55916q0;
            arrayList.clear();
            if (this.f55909j0) {
                Rect rect = this.f55918r0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final b20 b20Var, final String str2, final CharSequence charSequence, final boolean z10, final long j10, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final u10 u10Var, final n10 n10Var) {
        org.telegram.messenger.g0.i3(new Runnable() {
            @Override
            public final void run() {
                boolean z11;
                a2 a2Var;
                c2 c2Var = c2.this;
                u10 u10Var2 = u10Var;
                if (u10Var2 != null && (a2Var = c2Var.f55896a0) != null && a2Var.f55875o) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    a2 a2Var2 = c2Var.f55896a0;
                    if (a2Var2 != null) {
                        a2Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f55876p = new ArrayList();
                    obj.f55877q = new ArrayList();
                    obj.f55880t = 0.0f;
                    obj.f55881u = 0.0f;
                    c2Var.f55896a0 = obj;
                }
                a2 a2Var3 = c2Var.f55896a0;
                a2Var3.f55865c = str2;
                String str4 = str;
                a2Var3.f55864b = str4;
                a2Var3.f55863a = str4;
                a2Var3.d = charSequence;
                a2Var3.h = z10;
                a2Var3.f55869i = j10;
                a2Var3.f55870j = stickerSet;
                a2Var3.f55871k = document;
                b20 b20Var2 = b20Var;
                a2Var3.f55879s = b20Var2;
                a2Var3.f55872l = str3;
                a2Var3.f55874n = u10Var2;
                a2Var3.f55873m = n10Var;
                ArrayList arrayList = a2Var3.f55877q;
                if (!TextUtils.isEmpty(str4)) {
                    a2Var3.f55876p.add(new File(a2Var3.f55864b));
                }
                if (!TextUtils.isEmpty(a2Var3.f55863a) && !TextUtils.equals(a2Var3.f55863a, a2Var3.f55864b)) {
                    arrayList.add(new File(a2Var3.f55863a));
                }
                if (!TextUtils.isEmpty(a2Var3.f55872l)) {
                    arrayList.add(new File(a2Var3.f55872l));
                }
                if (!z11) {
                    c2Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        a2 a2Var4 = c2Var.f55896a0;
                        a2Var4.f55866e = li.a0(document3, a2Var4.f55865c);
                        c2Var.f55896a0.f55867f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = c2Var.f55896a0.f55867f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        c2Var.a();
                    } else if (b20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f27022id = 1;
                        a2 a2Var5 = c2Var.f55896a0;
                        String absolutePath = f7.w(h10.f22829t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        a2Var5.f55864b = absolutePath;
                        c2Var.f55896a0.f55878r = new zi(h10.f22829t0, tL_message, null, false, false);
                        c2Var.f55896a0.f55878r.f26886p0 = b20Var2;
                        MediaController.B().h0(c2Var.f55896a0.f55878r, false, false, false);
                    } else {
                        w7.G(c2Var.f55895a).i0(false, 67108864, str4, true);
                    }
                }
                if (u10Var2 == null) {
                    if (c2Var.f55903e0 == null) {
                        c2Var.f55903e0 = new gi.s0(c2Var.getContext(), bd.M0(2131746927, null));
                    }
                    c2Var.f55903e0.setOnCancelListener(new t1(c2Var, 0));
                    if (c2Var.f55903e0.getParent() == null) {
                        c2Var.addView(c2Var.f55903e0, mf.e(-1, -1, 17));
                    }
                    gi.s0 s0Var = c2Var.f55903e0;
                    s0Var.F = true;
                    s0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i3) {
        int i10 = this.f55895a;
        if (i10 != i3) {
            int i11 = hs.f23204b2;
            int i12 = hs.f23198a2;
            int i13 = hs.c2;
            int i14 = hs.V1;
            int i15 = hs.W1;
            int i16 = hs.U1;
            if (i10 >= 0 && isAttachedToWindow()) {
                hs.f(this.f55895a).n(this, i16);
                hs.f(this.f55895a).n(this, i15);
                hs.f(this.f55895a).n(this, i14);
                hs.f(this.f55895a).n(this, i13);
                hs.f(this.f55895a).n(this, i12);
                hs.f(this.f55895a).n(this, i11);
            }
            this.f55895a = i3;
            if (i3 >= 0 && isAttachedToWindow()) {
                hs.f(this.f55895a).c(this, i16);
                hs.f(this.f55895a).c(this, i15);
                hs.f(this.f55895a).c(this, i14);
                hs.f(this.f55895a).c(this, i13);
                hs.f(this.f55895a).c(this, i12);
                hs.f(this.f55895a).c(this, i11);
            }
        }
    }

    public void setOutlineVisible(boolean z10) {
        float f10;
        if (this.f55909j0 != z10) {
            this.f55909j0 = z10;
            ViewPropertyAnimator animate = this.f55908i0.animate();
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (!z10) {
                f11 = org.telegram.messenger.g0.L(-18.0f);
            }
            alpha.translationX(f11).setInterpolator(xq.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f55916q0;
                arrayList.clear();
                if (this.f55909j0) {
                    Rect rect = this.f55918r0;
                    arrayList.add(rect);
                    int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                    rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
                }
                setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    public void setOutlineWidth(float f10) {
        this.G = f10;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(s1 s1Var) {
        this.f55900c0 = s1Var;
    }
}

package tg;

import a8.a8;
import a8.b8;
import a8.qa;
import a8.ua;
import a8.xa;
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
import bi.j5;
import bi.o5;
import c8.na;
import c8.oe;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import hi.d7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.f20;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.n6;
import org.telegram.messenger.r10;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.cd0;
import org.telegram.ui.e31;
import org.telegram.ui.on0;
import org.telegram.ui.zn0;
public final class f2 extends FrameLayout implements gs {
    public static final int f57825s0 = 0;
    public volatile boolean E;
    public c2 F;
    public float G;
    public boolean H;
    public c2[] I;
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
    public oz0 T;
    public int U;
    public int V;
    public boolean W;
    public int f57826a;
    public d2 f57827a0;
    public final d6 f57828b;
    public final h6 f57829b0;
    public final d6 f57830c;
    public u1 f57831c0;
    public final Paint d;
    public String f57832d0;
    public final Paint f57833e;
    public hi.t0 f57834e0;
    public final Paint f57835f;
    public final Matrix f57836f0;
    public float f57837g0;
    public final Paint h;
    public float f57838h0;
    public final n1 f57839i0;
    public boolean f57840j0;
    public final Matrix f57841k0;
    public Path f57842l0;
    public Path m0;
    public final PathMeasure f57843n;
    public final RectF f57844n0;
    public float f57845o0;
    public float f57846p0;
    public final ArrayList f57847q0;
    public final Path f57848r;
    public final Rect f57849r0;
    public final Path f57850s;
    public final Path f57851w;
    public final Path f57852x;
    public volatile boolean f57853y;

    public f2(ContextThemeWrapper contextThemeWrapper, h6 h6Var) {
        super(contextThemeWrapper);
        this.f57826a = -1;
        nr nrVar = nr.h;
        this.f57828b = new d6(0.0f, (View) null, 0L, 420L, nrVar);
        this.f57830c = new d6(0.0f, (View) null, 0L, 420L, nrVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f57833e = paint2;
        Paint paint3 = new Paint(1);
        this.f57835f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f57843n = new PathMeasure();
        this.f57848r = new Path();
        this.f57850s = new Path();
        this.f57851w = new Path();
        this.f57852x = new Path();
        this.G = 2.0f;
        this.f57836f0 = new Matrix();
        this.f57841k0 = new Matrix();
        this.f57844n0 = new RectF();
        this.f57847q0 = new ArrayList();
        this.f57849r0 = new Rect();
        this.f57829b0 = h6Var;
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
        addView(textView, na.e(-2, -2, 17));
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
        n1 n1Var = new n1(contextThemeWrapper);
        this.f57839i0 = n1Var;
        n1Var.setAlpha(0.0f);
        n1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        n1Var.b(0.33f, 10.0f);
        n1Var.setBrushWeight(this.G);
        n1Var.setValueOverride(new c5(this));
        n1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        n1Var.setAlpha(0.0f);
        addView(n1Var, na.c(-1.0f, -1));
    }

    public static void c(tg.c2 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: tg.f2.c(tg.c2, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((b2) arrayList.get(0));
        int i7 = 1;
        while (i7 < arrayList.size() - 1) {
            b2 b2Var = (b2) arrayList.get(i7 - 1);
            b2 b2Var2 = (b2) arrayList.get(i7);
            i7++;
            b2 b2Var3 = (b2) arrayList.get(i7);
            int i10 = ((Point) b2Var2).x;
            int i11 = ((Point) b2Var).x;
            int i12 = ((Point) b2Var3).y;
            int i13 = ((Point) b2Var).y;
            if (Math.abs((((i12 - i13) * (i10 - i11)) - ((((Point) b2Var3).x - i11) * (((Point) b2Var2).y - i13))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(b2Var2);
            }
        }
        arrayList2.add((b2) i5.c.h(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final d2 d2Var = this.f57827a0;
        if (d2Var != null) {
            final int i7 = k10.f24932t0;
            d2Var.f57793o = true;
            if (d2Var.f57791m != null) {
                h();
                d2Var.f57791m.a(d2Var.f57782b, d2Var.f57784e.document);
                org.telegram.messenger.g0.h3(new cd0(25), 250L);
            } else if (d2Var.f57789k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = si.c0(d2Var.f57789k, d2Var.f57783c).document;
                tL_stickers_replaceSticker.new_sticker = d2Var.f57784e;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final f2 f58179b;

                    {
                        this.f58179b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final f2 f2Var = this.f58179b;
                                final int i10 = i7;
                                final d2 d2Var2 = d2Var;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var2 = f2Var;
                                                final d2 d2Var3 = d2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i11 = i10;
                                                    z10 = true;
                                                    si.d0(i11).N1(tL_messages_stickerSet, true);
                                                    if (!si.d0(i11).E0(tL_messages_stickerSet.set.f28425id, true)) {
                                                        si.d0(i11).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = f2Var2.f57834e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i12 = r4;
                                                            d2 d2Var4 = d2Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            f2 f2Var3 = f2Var2;
                                                            switch (i12) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var4.f57785f.document;
                                                                    String str = d2Var4.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject3, document, str, bool);
                                                                    f2Var3.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject3, d2Var4.f57785f.document, d2Var4.f57790l, Boolean.TRUE);
                                                                    f2Var3.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var4.f57785f.document;
                                                                    String str2 = d2Var4.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject3, document2, str2, bool2);
                                                                    f2Var3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var2.n(tL_error);
                                                    f2Var2.h();
                                                    z10 = false;
                                                }
                                                y10 y10Var = d2Var3.f57792n;
                                                if (y10Var != null) {
                                                    y10Var.a(Boolean.valueOf(z10));
                                                    d2Var3.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var3 = f2Var;
                                                final d2 d2Var4 = d2Var2;
                                                if (z14) {
                                                    int i12 = i10;
                                                    z11 = true;
                                                    si.d0(i12).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.d0(i12).k2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = f2Var3.f57834e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            d2 d2Var42 = d2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            f2 f2Var32 = f2Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var42.f57785f.document;
                                                                    String str = d2Var42.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var42.f57785f.document, d2Var42.f57790l, Boolean.TRUE);
                                                                    f2Var32.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var42.f57785f.document;
                                                                    String str2 = d2Var42.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    f2Var3.n(tL_error);
                                                    f2Var3.h();
                                                    z11 = false;
                                                }
                                                y10 y10Var2 = d2Var4.f57792n;
                                                if (y10Var2 != null) {
                                                    y10Var2.a(Boolean.valueOf(z11));
                                                    d2Var4.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var4 = f2Var;
                                                final d2 d2Var5 = d2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    si.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!si.d0(i13).E0(tL_messages_stickerSet2.set.f28425id, true)) {
                                                        si.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = f2Var4.f57834e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            d2 d2Var42 = d2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            f2 f2Var32 = f2Var4;
                                                            switch (i122) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var42.f57785f.document;
                                                                    String str = d2Var42.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var42.f57785f.document, d2Var42.f57790l, Boolean.TRUE);
                                                                    f2Var32.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var42.f57785f.document;
                                                                    String str2 = d2Var42.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var4.n(tL_error);
                                                    f2Var4.h();
                                                    z12 = false;
                                                }
                                                y10 y10Var3 = d2Var5.f57792n;
                                                if (y10Var3 != null) {
                                                    y10Var3.a(Boolean.valueOf(z12));
                                                    d2Var5.f57792n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final f2 f2Var2 = this.f58179b;
                                final int i11 = i7;
                                final d2 d2Var3 = d2Var;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var22 = f2Var2;
                                                final d2 d2Var32 = d2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    si.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!si.d0(i112).E0(tL_messages_stickerSet.set.f28425id, true)) {
                                                        si.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = f2Var22.f57834e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            d2 d2Var42 = d2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            f2 f2Var32 = f2Var22;
                                                            switch (i122) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var42.f57785f.document;
                                                                    String str = d2Var42.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var42.f57785f.document, d2Var42.f57790l, Boolean.TRUE);
                                                                    f2Var32.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var42.f57785f.document;
                                                                    String str2 = d2Var42.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var22.n(tL_error);
                                                    f2Var22.h();
                                                    z10 = false;
                                                }
                                                y10 y10Var = d2Var32.f57792n;
                                                if (y10Var != null) {
                                                    y10Var.a(Boolean.valueOf(z10));
                                                    d2Var32.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var3 = f2Var2;
                                                final d2 d2Var4 = d2Var3;
                                                if (z14) {
                                                    int i12 = i11;
                                                    z11 = true;
                                                    si.d0(i12).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.d0(i12).k2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = f2Var3.f57834e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            d2 d2Var42 = d2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            f2 f2Var32 = f2Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var42.f57785f.document;
                                                                    String str = d2Var42.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var42.f57785f.document, d2Var42.f57790l, Boolean.TRUE);
                                                                    f2Var32.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var42.f57785f.document;
                                                                    String str2 = d2Var42.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    f2Var3.n(tL_error);
                                                    f2Var3.h();
                                                    z11 = false;
                                                }
                                                y10 y10Var2 = d2Var4.f57792n;
                                                if (y10Var2 != null) {
                                                    y10Var2.a(Boolean.valueOf(z11));
                                                    d2Var4.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var4 = f2Var2;
                                                final d2 d2Var5 = d2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    si.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!si.d0(i13).E0(tL_messages_stickerSet2.set.f28425id, true)) {
                                                        si.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = f2Var4.f57834e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            d2 d2Var42 = d2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            f2 f2Var32 = f2Var4;
                                                            switch (i122) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var42.f57785f.document;
                                                                    String str = d2Var42.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var42.f57785f.document, d2Var42.f57790l, Boolean.TRUE);
                                                                    f2Var32.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var42.f57785f.document;
                                                                    String str2 = d2Var42.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var4.n(tL_error);
                                                    f2Var4.h();
                                                    z12 = false;
                                                }
                                                y10 y10Var3 = d2Var5.f57792n;
                                                if (y10Var3 != null) {
                                                    y10Var3.a(Boolean.valueOf(z12));
                                                    d2Var5.f57792n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final f2 f2Var3 = this.f58179b;
                                final int i12 = i7;
                                final d2 d2Var4 = d2Var;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var22 = f2Var3;
                                                final d2 d2Var32 = d2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    si.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!si.d0(i112).E0(tL_messages_stickerSet.set.f28425id, true)) {
                                                        si.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = f2Var22.f57834e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            d2 d2Var42 = d2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            f2 f2Var32 = f2Var22;
                                                            switch (i122) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var42.f57785f.document;
                                                                    String str = d2Var42.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var42.f57785f.document, d2Var42.f57790l, Boolean.TRUE);
                                                                    f2Var32.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var42.f57785f.document;
                                                                    String str2 = d2Var42.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var22.n(tL_error);
                                                    f2Var22.h();
                                                    z10 = false;
                                                }
                                                y10 y10Var = d2Var32.f57792n;
                                                if (y10Var != null) {
                                                    y10Var.a(Boolean.valueOf(z10));
                                                    d2Var32.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var32 = f2Var3;
                                                final d2 d2Var42 = d2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    si.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = f2Var32.f57834e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            f2 f2Var322 = f2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    f2Var32.n(tL_error);
                                                    f2Var32.h();
                                                    z11 = false;
                                                }
                                                y10 y10Var2 = d2Var42.f57792n;
                                                if (y10Var2 != null) {
                                                    y10Var2.a(Boolean.valueOf(z11));
                                                    d2Var42.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var4 = f2Var3;
                                                final d2 d2Var5 = d2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    si.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!si.d0(i13).E0(tL_messages_stickerSet2.set.f28425id, true)) {
                                                        si.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = f2Var4.f57834e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            f2 f2Var322 = f2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var4.n(tL_error);
                                                    f2Var4.h();
                                                    z12 = false;
                                                }
                                                y10 y10Var3 = d2Var5.f57792n;
                                                if (y10Var3 != null) {
                                                    y10Var3.a(Boolean.valueOf(z12));
                                                    d2Var5.f57792n = null;
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
            } else if (d2Var.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = d2Var.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(d2Var.f57784e);
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final f2 f58179b;

                    {
                        this.f58179b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final f2 f2Var = this.f58179b;
                                final int i10 = i7;
                                final d2 d2Var2 = d2Var;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var22 = f2Var;
                                                final d2 d2Var32 = d2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z10 = true;
                                                    si.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!si.d0(i112).E0(tL_messages_stickerSet.set.f28425id, true)) {
                                                        si.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = f2Var22.f57834e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            f2 f2Var322 = f2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var22.n(tL_error);
                                                    f2Var22.h();
                                                    z10 = false;
                                                }
                                                y10 y10Var = d2Var32.f57792n;
                                                if (y10Var != null) {
                                                    y10Var.a(Boolean.valueOf(z10));
                                                    d2Var32.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var32 = f2Var;
                                                final d2 d2Var42 = d2Var2;
                                                if (z14) {
                                                    int i122 = i10;
                                                    z11 = true;
                                                    si.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = f2Var32.f57834e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            f2 f2Var322 = f2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    f2Var32.n(tL_error);
                                                    f2Var32.h();
                                                    z11 = false;
                                                }
                                                y10 y10Var2 = d2Var42.f57792n;
                                                if (y10Var2 != null) {
                                                    y10Var2.a(Boolean.valueOf(z11));
                                                    d2Var42.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var4 = f2Var;
                                                final d2 d2Var5 = d2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    si.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!si.d0(i13).E0(tL_messages_stickerSet2.set.f28425id, true)) {
                                                        si.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = f2Var4.f57834e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            f2 f2Var322 = f2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var4.n(tL_error);
                                                    f2Var4.h();
                                                    z12 = false;
                                                }
                                                y10 y10Var3 = d2Var5.f57792n;
                                                if (y10Var3 != null) {
                                                    y10Var3.a(Boolean.valueOf(z12));
                                                    d2Var5.f57792n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final f2 f2Var2 = this.f58179b;
                                final int i11 = i7;
                                final d2 d2Var3 = d2Var;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var22 = f2Var2;
                                                final d2 d2Var32 = d2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    si.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!si.d0(i112).E0(tL_messages_stickerSet.set.f28425id, true)) {
                                                        si.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = f2Var22.f57834e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            f2 f2Var322 = f2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var22.n(tL_error);
                                                    f2Var22.h();
                                                    z10 = false;
                                                }
                                                y10 y10Var = d2Var32.f57792n;
                                                if (y10Var != null) {
                                                    y10Var.a(Boolean.valueOf(z10));
                                                    d2Var32.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var32 = f2Var2;
                                                final d2 d2Var42 = d2Var3;
                                                if (z14) {
                                                    int i122 = i11;
                                                    z11 = true;
                                                    si.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = f2Var32.f57834e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            f2 f2Var322 = f2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    f2Var32.n(tL_error);
                                                    f2Var32.h();
                                                    z11 = false;
                                                }
                                                y10 y10Var2 = d2Var42.f57792n;
                                                if (y10Var2 != null) {
                                                    y10Var2.a(Boolean.valueOf(z11));
                                                    d2Var42.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var4 = f2Var2;
                                                final d2 d2Var5 = d2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    si.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!si.d0(i13).E0(tL_messages_stickerSet2.set.f28425id, true)) {
                                                        si.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = f2Var4.f57834e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            f2 f2Var322 = f2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var4.n(tL_error);
                                                    f2Var4.h();
                                                    z12 = false;
                                                }
                                                y10 y10Var3 = d2Var5.f57792n;
                                                if (y10Var3 != null) {
                                                    y10Var3.a(Boolean.valueOf(z12));
                                                    d2Var5.f57792n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final f2 f2Var3 = this.f58179b;
                                final int i12 = i7;
                                final d2 d2Var4 = d2Var;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var22 = f2Var3;
                                                final d2 d2Var32 = d2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    si.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!si.d0(i112).E0(tL_messages_stickerSet.set.f28425id, true)) {
                                                        si.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = f2Var22.f57834e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            f2 f2Var322 = f2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var22.n(tL_error);
                                                    f2Var22.h();
                                                    z10 = false;
                                                }
                                                y10 y10Var = d2Var32.f57792n;
                                                if (y10Var != null) {
                                                    y10Var.a(Boolean.valueOf(z10));
                                                    d2Var32.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var32 = f2Var3;
                                                final d2 d2Var42 = d2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    si.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = f2Var32.f57834e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            f2 f2Var322 = f2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    f2Var32.n(tL_error);
                                                    f2Var32.h();
                                                    z11 = false;
                                                }
                                                y10 y10Var2 = d2Var42.f57792n;
                                                if (y10Var2 != null) {
                                                    y10Var2.a(Boolean.valueOf(z11));
                                                    d2Var42.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var4 = f2Var3;
                                                final d2 d2Var5 = d2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    si.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!si.d0(i13).E0(tL_messages_stickerSet2.set.f28425id, true)) {
                                                        si.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = f2Var4.f57834e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            f2 f2Var322 = f2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var4.n(tL_error);
                                                    f2Var4.h();
                                                    z12 = false;
                                                }
                                                y10 y10Var3 = d2Var5.f57792n;
                                                if (y10Var3 != null) {
                                                    y10Var3.a(Boolean.valueOf(z12));
                                                    d2Var5.f57792n = null;
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
            } else if (d2Var.h) {
                h();
                ls.f(i7).m(ls.f25359u3, Boolean.FALSE);
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.i1(d2Var, 19), 350L);
                y10 y10Var = d2Var.f57792n;
                if (y10Var != null) {
                    y10Var.a(Boolean.TRUE);
                }
            } else if (d2Var.f57787i != 0) {
                az.C(i7).v0(d2Var.f57785f.document, null, d2Var.f57787i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                hi.t0 t0Var = this.f57834e0;
                if (t0Var != null) {
                    t0Var.setProgress(1.0f);
                }
                org.telegram.messenger.g0.h3(new zn0(this, i7, 16), 450L);
                y10 y10Var2 = d2Var.f57792n;
                if (y10Var2 != null) {
                    y10Var2.a(Boolean.TRUE);
                    d2Var.f57792n = null;
                }
            } else if (d2Var.f57788j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = si.b0(d2Var.f57788j);
                tL_stickers_addStickerToSet.sticker = d2Var.f57784e;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final f2 f58179b;

                    {
                        this.f58179b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final f2 f2Var = this.f58179b;
                                final int i10 = i7;
                                final d2 d2Var2 = d2Var;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var22 = f2Var;
                                                final d2 d2Var32 = d2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z10 = true;
                                                    si.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!si.d0(i112).E0(tL_messages_stickerSet.set.f28425id, true)) {
                                                        si.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var2 = f2Var22.f57834e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            f2 f2Var322 = f2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var22.n(tL_error);
                                                    f2Var22.h();
                                                    z10 = false;
                                                }
                                                y10 y10Var3 = d2Var32.f57792n;
                                                if (y10Var3 != null) {
                                                    y10Var3.a(Boolean.valueOf(z10));
                                                    d2Var32.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var32 = f2Var;
                                                final d2 d2Var42 = d2Var2;
                                                if (z14) {
                                                    int i122 = i10;
                                                    z11 = true;
                                                    si.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var22 = f2Var32.f57834e0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            f2 f2Var322 = f2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    f2Var32.n(tL_error);
                                                    f2Var32.h();
                                                    z11 = false;
                                                }
                                                y10 y10Var22 = d2Var42.f57792n;
                                                if (y10Var22 != null) {
                                                    y10Var22.a(Boolean.valueOf(z11));
                                                    d2Var42.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var4 = f2Var;
                                                final d2 d2Var5 = d2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    si.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!si.d0(i13).E0(tL_messages_stickerSet2.set.f28425id, true)) {
                                                        si.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = f2Var4.f57834e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            f2 f2Var322 = f2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var4.n(tL_error);
                                                    f2Var4.h();
                                                    z12 = false;
                                                }
                                                y10 y10Var32 = d2Var5.f57792n;
                                                if (y10Var32 != null) {
                                                    y10Var32.a(Boolean.valueOf(z12));
                                                    d2Var5.f57792n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final f2 f2Var2 = this.f58179b;
                                final int i11 = i7;
                                final d2 d2Var3 = d2Var;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var22 = f2Var2;
                                                final d2 d2Var32 = d2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    si.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!si.d0(i112).E0(tL_messages_stickerSet.set.f28425id, true)) {
                                                        si.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var2 = f2Var22.f57834e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            f2 f2Var322 = f2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var22.n(tL_error);
                                                    f2Var22.h();
                                                    z10 = false;
                                                }
                                                y10 y10Var3 = d2Var32.f57792n;
                                                if (y10Var3 != null) {
                                                    y10Var3.a(Boolean.valueOf(z10));
                                                    d2Var32.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var32 = f2Var2;
                                                final d2 d2Var42 = d2Var3;
                                                if (z14) {
                                                    int i122 = i11;
                                                    z11 = true;
                                                    si.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var22 = f2Var32.f57834e0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            f2 f2Var322 = f2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    f2Var32.n(tL_error);
                                                    f2Var32.h();
                                                    z11 = false;
                                                }
                                                y10 y10Var22 = d2Var42.f57792n;
                                                if (y10Var22 != null) {
                                                    y10Var22.a(Boolean.valueOf(z11));
                                                    d2Var42.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var4 = f2Var2;
                                                final d2 d2Var5 = d2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    si.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!si.d0(i13).E0(tL_messages_stickerSet2.set.f28425id, true)) {
                                                        si.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = f2Var4.f57834e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            f2 f2Var322 = f2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var4.n(tL_error);
                                                    f2Var4.h();
                                                    z12 = false;
                                                }
                                                y10 y10Var32 = d2Var5.f57792n;
                                                if (y10Var32 != null) {
                                                    y10Var32.a(Boolean.valueOf(z12));
                                                    d2Var5.f57792n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final f2 f2Var3 = this.f58179b;
                                final int i12 = i7;
                                final d2 d2Var4 = d2Var;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var22 = f2Var3;
                                                final d2 d2Var32 = d2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    si.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!si.d0(i112).E0(tL_messages_stickerSet.set.f28425id, true)) {
                                                        si.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var2 = f2Var22.f57834e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            f2 f2Var322 = f2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var22.n(tL_error);
                                                    f2Var22.h();
                                                    z10 = false;
                                                }
                                                y10 y10Var3 = d2Var32.f57792n;
                                                if (y10Var3 != null) {
                                                    y10Var3.a(Boolean.valueOf(z10));
                                                    d2Var32.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var32 = f2Var3;
                                                final d2 d2Var42 = d2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    si.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var22 = f2Var32.f57834e0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            f2 f2Var322 = f2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    f2Var32.n(tL_error);
                                                    f2Var32.h();
                                                    z11 = false;
                                                }
                                                y10 y10Var22 = d2Var42.f57792n;
                                                if (y10Var22 != null) {
                                                    y10Var22.a(Boolean.valueOf(z11));
                                                    d2Var42.f57792n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final f2 f2Var4 = f2Var3;
                                                final d2 d2Var5 = d2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    si.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!si.d0(i13).E0(tL_messages_stickerSet2.set.f28425id, true)) {
                                                        si.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = f2Var4.f57834e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            d2 d2Var422 = d2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            f2 f2Var322 = f2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ls f10 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document = d2Var422.f57785f.document;
                                                                    String str = d2Var422.f57790l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    f2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ls.f(k10.f24932t0).m(217, Boolean.FALSE, tLObject32, d2Var422.f57785f.document, d2Var422.f57790l, Boolean.TRUE);
                                                                    f2Var322.h();
                                                                    return;
                                                                default:
                                                                    ls f11 = ls.f(k10.f24932t0);
                                                                    TLRPC.Document document2 = d2Var422.f57785f.document;
                                                                    String str2 = d2Var422.f57790l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    f2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    f2Var4.n(tL_error);
                                                    f2Var4.h();
                                                    z12 = false;
                                                }
                                                y10 y10Var32 = d2Var5.f57792n;
                                                if (y10Var32 != null) {
                                                    y10Var32.a(Boolean.valueOf(z12));
                                                    d2Var5.f57792n = null;
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
            int i7 = 0;
            while (true) {
                c2[] c2VarArr = this.I;
                if (i7 >= c2VarArr.length) {
                    break;
                }
                c2 c2Var = c2VarArr[i7];
                if (c2Var != null) {
                    c2Var.f57763l.reset();
                    Bitmap bitmap = c2Var.f57757e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        c2Var.f57757e = null;
                    }
                    Bitmap bitmap2 = c2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        c2Var.d = null;
                    }
                    Bitmap bitmap3 = c2Var.f57759g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        c2Var.f57759g = null;
                    }
                    Bitmap bitmap4 = c2Var.f57758f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        c2Var.f57758f = null;
                    }
                }
                i7++;
            }
            this.I = null;
        }
        this.E = false;
        this.f57853y = false;
        this.M = false;
        this.N.setAlpha(0.0f);
        this.N.setScaleX(0.3f);
        this.N.setScaleY(0.3f);
        d2 d2Var = this.f57827a0;
        if (d2Var != null) {
            if (!d2Var.f57793o) {
                d2Var.a();
            }
            this.f57827a0 = null;
        }
        h();
        this.W = false;
    }

    public final Bitmap d(int i7, int i10, Bitmap bitmap, boolean z10) {
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
        d2 d2Var;
        if (i7 == ls.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            d2 d2Var2 = this.f57827a0;
            if (d2Var2 != null && str.equalsIgnoreCase(d2Var2.f57782b)) {
                d2 d2Var3 = this.f57827a0;
                d2Var3.f57786g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = d2Var3.f57786g;
                if (d2Var3.f57797s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = d2Var3.f57783c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(k10.f24932t0).sendRequest(tL_messages_uploadMedia, new e31(9, this, d2Var3), 2);
            }
        } else if (i7 == ls.W1) {
            String str2 = (String) objArr[0];
            d2 d2Var4 = this.f57827a0;
            if (d2Var4 != null && str2.equalsIgnoreCase(d2Var4.f57782b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    d2 d2Var5 = this.f57827a0;
                    d2Var5.f57799u = Utilities.i(((float) longValue) / ((float) longValue2), 1.0f, d2Var5.f57799u);
                    hi.t0 t0Var = this.f57834e0;
                    if (t0Var != null) {
                        t0Var.setProgress(this.f57827a0.b());
                    }
                }
            }
        } else if (i7 == ls.V1) {
            String str3 = (String) objArr[0];
            d2 d2Var6 = this.f57827a0;
            if (d2Var6 != null && str3.equalsIgnoreCase(d2Var6.f57782b)) {
                h();
            }
        } else if (i7 == ls.f25240a2) {
            d2 d2Var7 = this.f57827a0;
            if (d2Var7 != null && objArr[0] == d2Var7.f57796r) {
                w7.G(k10.f24932t0).h0(false, 67108864, this.f57827a0.f57782b, true);
            }
        } else if (i7 == ls.f25247b2) {
            d2 d2Var8 = this.f57827a0;
            if (d2Var8 != null && objArr[0] == d2Var8.f57796r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                float floatValue = f10.floatValue();
                this.f57827a0.f57796r.f24205r0.Y = true;
                w7.G(this.f57826a).n(str4, false, Math.max(1L, longValue3), longValue4, f10);
                d2 d2Var9 = this.f57827a0;
                d2Var9.f57798t = Math.max(d2Var9.f57798t, floatValue);
                hi.t0 t0Var2 = this.f57834e0;
                if (t0Var2 != null) {
                    t0Var2.setProgress(this.f57827a0.b());
                }
            }
        } else if (i7 == ls.f25253c2 && (d2Var = this.f57827a0) != null && objArr[0] == d2Var.f57796r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.f57851w, this.f57833e);
        canvas.drawPath(this.f57852x, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: tg.f2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        c2 c2Var = this.F;
        if (c2Var != null) {
            this.L = bitmap;
            if (c2Var.f57758f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                c2 c2Var2 = this.F;
                if (c2Var2.f57756c != 0) {
                    Matrix matrix = new Matrix();
                    c2 c2Var3 = this.F;
                    matrix.postRotate(c2Var3.f57756c, c2Var3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
                    c2 c2Var4 = this.F;
                    if ((c2Var4.f57756c / 90) % 2 != 0) {
                        float height = (c2Var4.b().getHeight() - this.F.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.F.a().getHeight(), bitmap.getHeight() / this.F.a().getWidth());
                    canvas.drawBitmap(this.F.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(c2Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f57828b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.N;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(nr.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        boolean z12;
        float d;
        float f10;
        Paint paint;
        d6 d6Var = this.f57830c;
        d6Var.f34347a = viewGroup;
        boolean z13 = this.f57840j0;
        if (z13 || d6Var.f34349c > 0.0f) {
            if (viewGroup == null) {
                d = 1.0f;
            } else {
                if (z13 && !z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d = d6Var.d(z12);
            }
            c2[] c2VarArr = this.I;
            if (c2VarArr != null) {
                for (c2 c2Var : c2VarArr) {
                    if (c2Var != null && c2Var == this.F) {
                        if (this.G > 0.0f) {
                            if (c2Var.f57771t.f57842l0 != null) {
                                canvas.save();
                                canvas.clipPath(c2Var.f57771t.f57842l0);
                                if (c2Var.f57771t.J != null) {
                                    if (z10) {
                                        paint = c2Var.f57768q;
                                    } else {
                                        paint = c2Var.f57767p;
                                    }
                                    paint.setAlpha((int) (d * 255.0f));
                                    paint.setStrokeWidth(org.telegram.messenger.g0.L(f10));
                                    canvas.drawPath(c2Var.f57763l, paint);
                                    if (c2Var.f57771t.f57842l0 != null && z10) {
                                        canvas.clipPath(c2Var.f57763l);
                                        paint.setStrokeWidth(org.telegram.messenger.g0.L(f10 * 2.0f));
                                        canvas.drawPath(c2Var.f57771t.f57842l0, paint);
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
        c2 c2Var;
        if (this.M && (c2Var = this.F) != null) {
            return c2Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.J;
    }

    public oz0 getThanosEffect() {
        if (!oz0.c()) {
            return null;
        }
        if (this.T == null) {
            oz0 oz0Var = new oz0(getContext(), new v1(this, 1));
            this.T = oz0Var;
            addView(oz0Var, na.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        hi.t0 t0Var = this.f57834e0;
        if (t0Var != null) {
            t0Var.a();
            this.f57834e0 = null;
        }
    }

    public final boolean i() {
        return this.M;
    }

    public final c2 j(float f10, float f11) {
        int width;
        int height;
        if (this.J == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            c2[] c2VarArr = this.I;
            if (i7 >= c2VarArr.length) {
                return null;
            }
            c2 c2Var = c2VarArr[i7];
            if (c2Var != null) {
                if ((c2Var.f57756c / 90) % 2 != 0) {
                    width = this.J.getHeight();
                    height = this.J.getWidth();
                } else {
                    width = this.J.getWidth();
                    height = this.J.getHeight();
                }
                RectF rectF = org.telegram.messenger.g0.P;
                RectF rectF2 = this.I[i7].f57760i;
                float f12 = width;
                float f13 = this.f57837g0;
                float f14 = height;
                float f15 = this.f57838h0;
                rectF.set((rectF2.left / f12) * f13, (rectF2.top / f14) * f15, (rectF2.right / f12) * f13, (rectF2.bottom / f14) * f15);
                this.f57836f0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return c2Var;
                }
            }
            i7++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        c2[] c2VarArr = this.I;
        if (c2VarArr != null) {
            for (c2 c2Var : c2VarArr) {
                if (c2Var != null && (bitmap = c2Var.f57757e) != null) {
                    bitmap.recycle();
                    c2Var.f57757e = null;
                    Bitmap bitmap2 = c2Var.f57759g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        c2Var.f57759g = null;
                    }
                    c(c2Var, this.U, this.V);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i7, int i10, int i11, on0 on0Var) {
        int i12;
        int i13;
        vb.c cVar;
        if (i10 <= 0) {
            i12 = org.telegram.messenger.g0.f24010q.x;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            i13 = org.telegram.messenger.g0.f24010q.y;
        } else {
            i13 = i11;
        }
        this.U = i12;
        this.V = i13;
        if (!this.E && !this.f57853y && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.J = bitmap;
            this.K = i7;
            this.f57832d0 = null;
            j5 j5Var = new j5(this, i7, on0Var, 6);
            this.f57853y = true;
            ia.a aVar = new ia.a();
            aVar.f16175b = true;
            aVar.f16176c = true;
            zzd a10 = oe.a(new zb.d(aVar));
            if (n6.h(getContext()).f()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.J;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.f57809e = min;
                obj.d = min;
                obj.f57806a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f57806a).drawRect(0.0f, 0.0f, obj.d, obj.f57809e, m6.Gm);
                obj.f57807b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f57808c = (bitmap2.getHeight() - obj.f57809e) / 2;
                arrayList.add(obj);
                j5Var.a(arrayList);
                return;
            }
            ub.a a11 = ub.a.a(i7, bitmap);
            a10.h(a11).addOnSuccessListener(new o1(j5Var, 1)).addOnFailureListener(new o5(this, bitmap, i7, on0Var, j5Var, 6));
            if (this.f57832d0 == null) {
                xb.a aVar2 = xb.a.f60454b;
                q6.m.i(aVar2, "options cannot be null");
                synchronized (vb.c.class) {
                    cVar = (vb.c) pb.g.c().a(vb.c.class);
                }
                ua.b bVar = (ua.b) cVar.f59367a.get(xb.a.class);
                q6.m.h(bVar);
                yb.b bVar2 = (yb.b) bVar.get();
                bVar2.getClass();
                ua uaVar = bVar2.f61134c;
                ?? obj2 = new Object();
                obj2.f343c = y7.TYPE_THIN;
                pb.n.f55550a.execute(new qa(uaVar, new xa((b8) obj2, 1), a8.ON_DEVICE_IMAGE_LABEL_CREATE, uaVar.b(), 0));
                new ImageLabelerImpl((pb.e) bVar2.f61132a.R0(aVar2), (Executor) bVar2.f61133b.f55528a.get(), new n6.c("vision.ica", 1L)).h(a11).addOnSuccessListener(new o1(this, 2)).addOnFailureListener(new r0.f1(27));
            }
            ArrayList arrayList2 = si.d0(this.f57826a).f26803n;
            for (int i14 = 0; i14 < Math.min(arrayList2.size(), 9); i14++) {
                j6.g(((TLRPC.TL_availableReaction) arrayList2.get(i14)).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new lc((FrameLayout) getParent(), this.f57829b0).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f57842l0;
        if (path == null) {
            this.f57842l0 = new Path();
        } else {
            path.rewind();
        }
        if (this.m0 == null) {
            this.m0 = new Path();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.m0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f57842l0.addPath(this.m0, this.f57841k0);
        this.f57842l0.computeBounds(this.f57844n0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(this.f57826a).c(this, ls.U1);
        ls.f(this.f57826a).c(this, ls.W1);
        ls.f(this.f57826a).c(this, ls.V1);
        ls.f(this.f57826a).c(this, ls.f25253c2);
        ls.f(this.f57826a).c(this, ls.f25240a2);
        ls.f(this.f57826a).c(this, ls.f25247b2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f57826a;
        if (i7 >= 0) {
            ls.f(i7).n(this, ls.U1);
            ls.f(this.f57826a).n(this, ls.W1);
            ls.f(this.f57826a).n(this, ls.V1);
            ls.f(this.f57826a).n(this, ls.f25253c2);
            ls.f(this.f57826a).n(this, ls.f25240a2);
            ls.f(this.f57826a).n(this, ls.f25247b2);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(10.0f);
        float f10 = L * 2.0f;
        float measuredWidth = getMeasuredWidth() - f10;
        float measuredHeight = getMeasuredHeight() - f10;
        float f11 = measuredWidth / 8.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = measuredWidth + L;
        rectF.set(L, L, f12, f12);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.f57850s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.f57848r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.f57851w;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f57852x;
        path4.rewind();
        rectF.inset(org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(-1.0f));
        path4.addRoundRect(rectF, f11, f11, direction);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.N.setTranslationY(-((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f57847q0;
            arrayList.clear();
            if (this.f57840j0) {
                Rect rect = this.f57849r0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final f20 f20Var, final String str2, final CharSequence charSequence, final boolean z10, final long j3, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final y10 y10Var, final r10 r10Var) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                boolean z11;
                d2 d2Var;
                f2 f2Var = f2.this;
                y10 y10Var2 = y10Var;
                if (y10Var2 != null && (d2Var = f2Var.f57827a0) != null && d2Var.f57793o) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    d2 d2Var2 = f2Var.f57827a0;
                    if (d2Var2 != null) {
                        d2Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f57794p = new ArrayList();
                    obj.f57795q = new ArrayList();
                    obj.f57798t = 0.0f;
                    obj.f57799u = 0.0f;
                    f2Var.f57827a0 = obj;
                }
                d2 d2Var3 = f2Var.f57827a0;
                d2Var3.f57783c = str2;
                String str4 = str;
                d2Var3.f57782b = str4;
                d2Var3.f57781a = str4;
                d2Var3.d = charSequence;
                d2Var3.h = z10;
                d2Var3.f57787i = j3;
                d2Var3.f57788j = stickerSet;
                d2Var3.f57789k = document;
                f20 f20Var2 = f20Var;
                d2Var3.f57797s = f20Var2;
                d2Var3.f57790l = str3;
                d2Var3.f57792n = y10Var2;
                d2Var3.f57791m = r10Var;
                ArrayList arrayList = d2Var3.f57795q;
                if (!TextUtils.isEmpty(str4)) {
                    d2Var3.f57794p.add(new File(d2Var3.f57782b));
                }
                if (!TextUtils.isEmpty(d2Var3.f57781a) && !TextUtils.equals(d2Var3.f57781a, d2Var3.f57782b)) {
                    arrayList.add(new File(d2Var3.f57781a));
                }
                if (!TextUtils.isEmpty(d2Var3.f57790l)) {
                    arrayList.add(new File(d2Var3.f57790l));
                }
                if (!z11) {
                    f2Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        d2 d2Var4 = f2Var.f57827a0;
                        d2Var4.f57784e = si.c0(document3, d2Var4.f57783c);
                        f2Var.f57827a0.f57785f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = f2Var.f57827a0.f57785f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        f2Var.a();
                    } else if (f20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f28419id = 1;
                        d2 d2Var5 = f2Var.f57827a0;
                        String absolutePath = d7.w(k10.f24932t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        d2Var5.f57782b = absolutePath;
                        f2Var.f57827a0.f57796r = new gj(k10.f24932t0, tL_message, null, false, false);
                        f2Var.f57827a0.f57796r.f24205r0 = f20Var2;
                        MediaController.B().h0(f2Var.f57827a0.f57796r, false, false, false);
                    } else {
                        w7.G(f2Var.f57826a).h0(false, 67108864, str4, true);
                    }
                }
                if (y10Var2 == null) {
                    if (f2Var.f57834e0 == null) {
                        f2Var.f57834e0 = new hi.t0(f2Var.getContext(), hd.N0(2131746725, null));
                    }
                    f2Var.f57834e0.setOnCancelListener(new v1(f2Var, 0));
                    if (f2Var.f57834e0.getParent() == null) {
                        f2Var.addView(f2Var.f57834e0, na.e(-1, -1, 17));
                    }
                    hi.t0 t0Var = f2Var.f57834e0;
                    t0Var.F = true;
                    t0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i7) {
        int i10 = this.f57826a;
        if (i10 != i7) {
            int i11 = ls.f25247b2;
            int i12 = ls.f25240a2;
            int i13 = ls.f25253c2;
            int i14 = ls.V1;
            int i15 = ls.W1;
            int i16 = ls.U1;
            if (i10 >= 0 && isAttachedToWindow()) {
                ls.f(this.f57826a).n(this, i16);
                ls.f(this.f57826a).n(this, i15);
                ls.f(this.f57826a).n(this, i14);
                ls.f(this.f57826a).n(this, i13);
                ls.f(this.f57826a).n(this, i12);
                ls.f(this.f57826a).n(this, i11);
            }
            this.f57826a = i7;
            if (i7 >= 0 && isAttachedToWindow()) {
                ls.f(this.f57826a).c(this, i16);
                ls.f(this.f57826a).c(this, i15);
                ls.f(this.f57826a).c(this, i14);
                ls.f(this.f57826a).c(this, i13);
                ls.f(this.f57826a).c(this, i12);
                ls.f(this.f57826a).c(this, i11);
            }
        }
    }

    public void setOutlineVisible(boolean z10) {
        float f10;
        if (this.f57840j0 != z10) {
            this.f57840j0 = z10;
            ViewPropertyAnimator animate = this.f57839i0.animate();
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
            alpha.translationX(f11).setInterpolator(nr.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f57847q0;
                arrayList.clear();
                if (this.f57840j0) {
                    Rect rect = this.f57849r0;
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

    public void setStickerCutOutBtn(u1 u1Var) {
        this.f57831c0 = u1Var;
    }
}

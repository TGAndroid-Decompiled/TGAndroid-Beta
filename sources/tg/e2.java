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
import bi.b3;
import bi.w2;
import c8.ja;
import c8.ke;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import hi.d7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ez;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.n6;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.a31;
import org.telegram.ui.ah0;
import org.telegram.ui.ln0;
import org.telegram.ui.nb1;
public final class e2 extends FrameLayout implements is {
    public static final int f57228s0 = 0;
    public volatile boolean E;
    public b2 F;
    public float G;
    public boolean H;
    public b2[] I;
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
    public fz0 T;
    public int U;
    public int V;
    public boolean W;
    public int f57229a;
    public c2 f57230a0;
    public final u5 f57231b;
    public final e6 f57232b0;
    public final u5 f57233c;
    public s1 f57234c0;
    public final Paint d;
    public String f57235d0;
    public final Paint f57236e;
    public hi.t0 f57237e0;
    public final Paint f57238f;
    public final Matrix f57239f0;
    public float f57240g0;
    public final Paint h;
    public float f57241h0;
    public final m1 f57242i0;
    public boolean f57243j0;
    public final Matrix f57244k0;
    public Path f57245l0;
    public Path m0;
    public final PathMeasure f57246n;
    public final RectF f57247n0;
    public float f57248o0;
    public float f57249p0;
    public final ArrayList f57250q0;
    public final Path f57251r;
    public final Rect f57252r0;
    public final Path f57253s;
    public final Path f57254w;
    public final Path f57255x;
    public volatile boolean f57256y;

    public e2(ContextThemeWrapper contextThemeWrapper, e6 e6Var) {
        super(contextThemeWrapper);
        this.f57229a = -1;
        er erVar = er.h;
        this.f57231b = new u5(0.0f, (View) null, 0L, 420L, erVar);
        this.f57233c = new u5(0.0f, (View) null, 0L, 420L, erVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f57236e = paint2;
        Paint paint3 = new Paint(1);
        this.f57238f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f57246n = new PathMeasure();
        this.f57251r = new Path();
        this.f57253s = new Path();
        this.f57254w = new Path();
        this.f57255x = new Path();
        this.G = 2.0f;
        this.f57239f0 = new Matrix();
        this.f57244k0 = new Matrix();
        this.f57247n0 = new RectF();
        this.f57250q0 = new ArrayList();
        this.f57252r0 = new Rect();
        this.f57232b0 = e6Var;
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
        addView(textView, ja.e(-2, -2, 17));
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
        this.f57242i0 = m1Var;
        m1Var.setAlpha(0.0f);
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.b(0.33f, 10.0f);
        m1Var.setBrushWeight(this.G);
        m1Var.setValueOverride(new cf(this));
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.setAlpha(0.0f);
        addView(m1Var, ja.c(-1.0f, -1));
    }

    public static void c(tg.b2 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: tg.e2.c(tg.b2, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((a2) arrayList.get(0));
        int i7 = 1;
        while (i7 < arrayList.size() - 1) {
            a2 a2Var = (a2) arrayList.get(i7 - 1);
            a2 a2Var2 = (a2) arrayList.get(i7);
            i7++;
            a2 a2Var3 = (a2) arrayList.get(i7);
            int i10 = ((Point) a2Var2).x;
            int i11 = ((Point) a2Var).x;
            int i12 = ((Point) a2Var3).y;
            int i13 = ((Point) a2Var).y;
            if (Math.abs((((i12 - i13) * (i10 - i11)) - ((((Point) a2Var3).x - i11) * (((Point) a2Var2).y - i13))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(a2Var2);
            }
        }
        arrayList2.add((a2) i5.c.h(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final c2 c2Var = this.f57230a0;
        if (c2Var != null) {
            final int i7 = m10.f24940t0;
            c2Var.f57193o = true;
            if (c2Var.f57191m != null) {
                h();
                c2Var.f57191m.a(c2Var.f57182b, c2Var.f57184e.document);
                org.telegram.messenger.g0.i3(new ah0(22), 250L);
            } else if (c2Var.f57189k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = si.a0(c2Var.f57189k, c2Var.f57183c).document;
                tL_stickers_replaceSticker.new_sticker = c2Var.f57184e;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final e2 f57582b;

                    {
                        this.f57582b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final e2 e2Var = this.f57582b;
                                final int i10 = i7;
                                final c2 c2Var2 = c2Var;
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
                                                final e2 e2Var2 = e2Var;
                                                final c2 c2Var3 = c2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i11 = i10;
                                                    z10 = true;
                                                    si.b0(i11).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i11).B0(tL_messages_stickerSet.set.f28078id, true)) {
                                                        si.b0(i11).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = e2Var2.f57237e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i12 = r4;
                                                            c2 c2Var4 = c2Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            e2 e2Var3 = e2Var2;
                                                            switch (i12) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var4.f57185f.document;
                                                                    String str = c2Var4.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject3, document, str, bool);
                                                                    e2Var3.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject3, c2Var4.f57185f.document, c2Var4.f57190l, Boolean.TRUE);
                                                                    e2Var3.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var4.f57185f.document;
                                                                    String str2 = c2Var4.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject3, document2, str2, bool2);
                                                                    e2Var3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var2.n(tL_error);
                                                    e2Var2.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var = c2Var3.f57192n;
                                                if (z10Var != null) {
                                                    z10Var.a(Boolean.valueOf(z10));
                                                    c2Var3.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var3 = e2Var;
                                                final c2 c2Var4 = c2Var2;
                                                if (z14) {
                                                    int i12 = i10;
                                                    z11 = true;
                                                    si.b0(i12).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i12).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = e2Var3.f57237e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var32 = e2Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var42.f57185f.document;
                                                                    String str = c2Var42.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var42.f57185f.document, c2Var42.f57190l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var42.f57185f.document;
                                                                    String str2 = c2Var42.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var3.n(tL_error);
                                                    e2Var3.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var2 = c2Var4.f57192n;
                                                if (z10Var2 != null) {
                                                    z10Var2.a(Boolean.valueOf(z11));
                                                    c2Var4.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var;
                                                final c2 c2Var5 = c2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    si.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i13).B0(tL_messages_stickerSet2.set.f28078id, true)) {
                                                        si.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.f57237e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var32 = e2Var4;
                                                            switch (i122) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var42.f57185f.document;
                                                                    String str = c2Var42.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var42.f57185f.document, c2Var42.f57190l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var42.f57185f.document;
                                                                    String str2 = c2Var42.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var3 = c2Var5.f57192n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57192n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final e2 e2Var2 = this.f57582b;
                                final int i11 = i7;
                                final c2 c2Var3 = c2Var;
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
                                                final e2 e2Var22 = e2Var2;
                                                final c2 c2Var32 = c2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    si.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i112).B0(tL_messages_stickerSet.set.f28078id, true)) {
                                                        si.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = e2Var22.f57237e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var32 = e2Var22;
                                                            switch (i122) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var42.f57185f.document;
                                                                    String str = c2Var42.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var42.f57185f.document, c2Var42.f57190l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var42.f57185f.document;
                                                                    String str2 = c2Var42.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var22.n(tL_error);
                                                    e2Var22.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var = c2Var32.f57192n;
                                                if (z10Var != null) {
                                                    z10Var.a(Boolean.valueOf(z10));
                                                    c2Var32.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var3 = e2Var2;
                                                final c2 c2Var4 = c2Var3;
                                                if (z14) {
                                                    int i12 = i11;
                                                    z11 = true;
                                                    si.b0(i12).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i12).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = e2Var3.f57237e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var32 = e2Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var42.f57185f.document;
                                                                    String str = c2Var42.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var42.f57185f.document, c2Var42.f57190l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var42.f57185f.document;
                                                                    String str2 = c2Var42.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var3.n(tL_error);
                                                    e2Var3.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var2 = c2Var4.f57192n;
                                                if (z10Var2 != null) {
                                                    z10Var2.a(Boolean.valueOf(z11));
                                                    c2Var4.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var2;
                                                final c2 c2Var5 = c2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    si.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i13).B0(tL_messages_stickerSet2.set.f28078id, true)) {
                                                        si.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.f57237e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var32 = e2Var4;
                                                            switch (i122) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var42.f57185f.document;
                                                                    String str = c2Var42.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var42.f57185f.document, c2Var42.f57190l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var42.f57185f.document;
                                                                    String str2 = c2Var42.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var3 = c2Var5.f57192n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57192n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final e2 e2Var3 = this.f57582b;
                                final int i12 = i7;
                                final c2 c2Var4 = c2Var;
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
                                                final e2 e2Var22 = e2Var3;
                                                final c2 c2Var32 = c2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    si.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i112).B0(tL_messages_stickerSet.set.f28078id, true)) {
                                                        si.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = e2Var22.f57237e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var32 = e2Var22;
                                                            switch (i122) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var42.f57185f.document;
                                                                    String str = c2Var42.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var42.f57185f.document, c2Var42.f57190l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var42.f57185f.document;
                                                                    String str2 = c2Var42.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var22.n(tL_error);
                                                    e2Var22.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var = c2Var32.f57192n;
                                                if (z10Var != null) {
                                                    z10Var.a(Boolean.valueOf(z10));
                                                    c2Var32.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var32 = e2Var3;
                                                final c2 c2Var42 = c2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    si.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = e2Var32.f57237e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var32.n(tL_error);
                                                    e2Var32.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var2 = c2Var42.f57192n;
                                                if (z10Var2 != null) {
                                                    z10Var2.a(Boolean.valueOf(z11));
                                                    c2Var42.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var3;
                                                final c2 c2Var5 = c2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    si.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i13).B0(tL_messages_stickerSet2.set.f28078id, true)) {
                                                        si.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.f57237e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var3 = c2Var5.f57192n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57192n = null;
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
            } else if (c2Var.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = c2Var.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(c2Var.f57184e);
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final e2 f57582b;

                    {
                        this.f57582b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final e2 e2Var = this.f57582b;
                                final int i10 = i7;
                                final c2 c2Var2 = c2Var;
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
                                                final e2 e2Var22 = e2Var;
                                                final c2 c2Var32 = c2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z10 = true;
                                                    si.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i112).B0(tL_messages_stickerSet.set.f28078id, true)) {
                                                        si.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = e2Var22.f57237e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var22.n(tL_error);
                                                    e2Var22.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var = c2Var32.f57192n;
                                                if (z10Var != null) {
                                                    z10Var.a(Boolean.valueOf(z10));
                                                    c2Var32.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var32 = e2Var;
                                                final c2 c2Var42 = c2Var2;
                                                if (z14) {
                                                    int i122 = i10;
                                                    z11 = true;
                                                    si.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = e2Var32.f57237e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var32.n(tL_error);
                                                    e2Var32.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var2 = c2Var42.f57192n;
                                                if (z10Var2 != null) {
                                                    z10Var2.a(Boolean.valueOf(z11));
                                                    c2Var42.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var;
                                                final c2 c2Var5 = c2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    si.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i13).B0(tL_messages_stickerSet2.set.f28078id, true)) {
                                                        si.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.f57237e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var3 = c2Var5.f57192n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57192n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final e2 e2Var2 = this.f57582b;
                                final int i11 = i7;
                                final c2 c2Var3 = c2Var;
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
                                                final e2 e2Var22 = e2Var2;
                                                final c2 c2Var32 = c2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    si.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i112).B0(tL_messages_stickerSet.set.f28078id, true)) {
                                                        si.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = e2Var22.f57237e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var22.n(tL_error);
                                                    e2Var22.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var = c2Var32.f57192n;
                                                if (z10Var != null) {
                                                    z10Var.a(Boolean.valueOf(z10));
                                                    c2Var32.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var32 = e2Var2;
                                                final c2 c2Var42 = c2Var3;
                                                if (z14) {
                                                    int i122 = i11;
                                                    z11 = true;
                                                    si.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = e2Var32.f57237e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var32.n(tL_error);
                                                    e2Var32.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var2 = c2Var42.f57192n;
                                                if (z10Var2 != null) {
                                                    z10Var2.a(Boolean.valueOf(z11));
                                                    c2Var42.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var2;
                                                final c2 c2Var5 = c2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    si.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i13).B0(tL_messages_stickerSet2.set.f28078id, true)) {
                                                        si.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.f57237e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var3 = c2Var5.f57192n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57192n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final e2 e2Var3 = this.f57582b;
                                final int i12 = i7;
                                final c2 c2Var4 = c2Var;
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
                                                final e2 e2Var22 = e2Var3;
                                                final c2 c2Var32 = c2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    si.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i112).B0(tL_messages_stickerSet.set.f28078id, true)) {
                                                        si.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = e2Var22.f57237e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var22.n(tL_error);
                                                    e2Var22.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var = c2Var32.f57192n;
                                                if (z10Var != null) {
                                                    z10Var.a(Boolean.valueOf(z10));
                                                    c2Var32.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var32 = e2Var3;
                                                final c2 c2Var42 = c2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    si.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = e2Var32.f57237e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var32.n(tL_error);
                                                    e2Var32.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var2 = c2Var42.f57192n;
                                                if (z10Var2 != null) {
                                                    z10Var2.a(Boolean.valueOf(z11));
                                                    c2Var42.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var3;
                                                final c2 c2Var5 = c2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    si.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i13).B0(tL_messages_stickerSet2.set.f28078id, true)) {
                                                        si.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.f57237e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var3 = c2Var5.f57192n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57192n = null;
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
            } else if (c2Var.h) {
                h();
                ns.f(i7).m(ns.f25571s3, Boolean.FALSE);
                org.telegram.messenger.g0.i3(new q2.d(c2Var, 17), 350L);
                z10 z10Var = c2Var.f57192n;
                if (z10Var != null) {
                    z10Var.a(Boolean.TRUE);
                }
            } else if (c2Var.f57187i != 0) {
                ez.C(i7).v0(c2Var.f57185f.document, null, c2Var.f57187i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                hi.t0 t0Var = this.f57237e0;
                if (t0Var != null) {
                    t0Var.setProgress(1.0f);
                }
                org.telegram.messenger.g0.i3(new nb1(this, i7, 11), 450L);
                z10 z10Var2 = c2Var.f57192n;
                if (z10Var2 != null) {
                    z10Var2.a(Boolean.TRUE);
                    c2Var.f57192n = null;
                }
            } else if (c2Var.f57188j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = si.Z(c2Var.f57188j);
                tL_stickers_addStickerToSet.sticker = c2Var.f57184e;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final e2 f57582b;

                    {
                        this.f57582b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final e2 e2Var = this.f57582b;
                                final int i10 = i7;
                                final c2 c2Var2 = c2Var;
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
                                                final e2 e2Var22 = e2Var;
                                                final c2 c2Var32 = c2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z10 = true;
                                                    si.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i112).B0(tL_messages_stickerSet.set.f28078id, true)) {
                                                        si.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var2 = e2Var22.f57237e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var22.n(tL_error);
                                                    e2Var22.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var3 = c2Var32.f57192n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z10));
                                                    c2Var32.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var32 = e2Var;
                                                final c2 c2Var42 = c2Var2;
                                                if (z14) {
                                                    int i122 = i10;
                                                    z11 = true;
                                                    si.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var22 = e2Var32.f57237e0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var32.n(tL_error);
                                                    e2Var32.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var22 = c2Var42.f57192n;
                                                if (z10Var22 != null) {
                                                    z10Var22.a(Boolean.valueOf(z11));
                                                    c2Var42.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var;
                                                final c2 c2Var5 = c2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    si.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i13).B0(tL_messages_stickerSet2.set.f28078id, true)) {
                                                        si.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.f57237e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var32 = c2Var5.f57192n;
                                                if (z10Var32 != null) {
                                                    z10Var32.a(Boolean.valueOf(z12));
                                                    c2Var5.f57192n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final e2 e2Var2 = this.f57582b;
                                final int i11 = i7;
                                final c2 c2Var3 = c2Var;
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
                                                final e2 e2Var22 = e2Var2;
                                                final c2 c2Var32 = c2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    si.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i112).B0(tL_messages_stickerSet.set.f28078id, true)) {
                                                        si.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var2 = e2Var22.f57237e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var22.n(tL_error);
                                                    e2Var22.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var3 = c2Var32.f57192n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z10));
                                                    c2Var32.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var32 = e2Var2;
                                                final c2 c2Var42 = c2Var3;
                                                if (z14) {
                                                    int i122 = i11;
                                                    z11 = true;
                                                    si.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var22 = e2Var32.f57237e0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var32.n(tL_error);
                                                    e2Var32.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var22 = c2Var42.f57192n;
                                                if (z10Var22 != null) {
                                                    z10Var22.a(Boolean.valueOf(z11));
                                                    c2Var42.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var2;
                                                final c2 c2Var5 = c2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    si.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i13).B0(tL_messages_stickerSet2.set.f28078id, true)) {
                                                        si.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.f57237e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var32 = c2Var5.f57192n;
                                                if (z10Var32 != null) {
                                                    z10Var32.a(Boolean.valueOf(z12));
                                                    c2Var5.f57192n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final e2 e2Var3 = this.f57582b;
                                final int i12 = i7;
                                final c2 c2Var4 = c2Var;
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
                                                final e2 e2Var22 = e2Var3;
                                                final c2 c2Var32 = c2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    si.b0(i112).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i112).B0(tL_messages_stickerSet.set.f28078id, true)) {
                                                        si.b0(i112).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var2 = e2Var22.f57237e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var22.n(tL_error);
                                                    e2Var22.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var3 = c2Var32.f57192n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z10));
                                                    c2Var32.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var32 = e2Var3;
                                                final c2 c2Var42 = c2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    si.b0(i122).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i122).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var22 = e2Var32.f57237e0;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var32.n(tL_error);
                                                    e2Var32.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var22 = c2Var42.f57192n;
                                                if (z10Var22 != null) {
                                                    z10Var22.a(Boolean.valueOf(z11));
                                                    c2Var42.f57192n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var3;
                                                final c2 c2Var5 = c2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    si.b0(i13).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i13).B0(tL_messages_stickerSet2.set.f28078id, true)) {
                                                        si.b0(i13).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.f57237e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.i3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document = c2Var422.f57185f.document;
                                                                    String str = c2Var422.f57190l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(215, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ns.f(m10.f24940t0).m(215, Boolean.FALSE, tLObject32, c2Var422.f57185f.document, c2Var422.f57190l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ns f11 = ns.f(m10.f24940t0);
                                                                    TLRPC.Document document2 = c2Var422.f57185f.document;
                                                                    String str2 = c2Var422.f57190l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var32 = c2Var5.f57192n;
                                                if (z10Var32 != null) {
                                                    z10Var32.a(Boolean.valueOf(z12));
                                                    c2Var5.f57192n = null;
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
                b2[] b2VarArr = this.I;
                if (i7 >= b2VarArr.length) {
                    break;
                }
                b2 b2Var = b2VarArr[i7];
                if (b2Var != null) {
                    b2Var.f57168l.reset();
                    Bitmap bitmap = b2Var.f57162e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        b2Var.f57162e = null;
                    }
                    Bitmap bitmap2 = b2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        b2Var.d = null;
                    }
                    Bitmap bitmap3 = b2Var.f57164g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        b2Var.f57164g = null;
                    }
                    Bitmap bitmap4 = b2Var.f57163f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        b2Var.f57163f = null;
                    }
                }
                i7++;
            }
            this.I = null;
        }
        this.E = false;
        this.f57256y = false;
        this.M = false;
        this.N.setAlpha(0.0f);
        this.N.setScaleX(0.3f);
        this.N.setScaleY(0.3f);
        c2 c2Var = this.f57230a0;
        if (c2Var != null) {
            if (!c2Var.f57193o) {
                c2Var.a();
            }
            this.f57230a0 = null;
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
        c2 c2Var;
        if (i7 == ns.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            c2 c2Var2 = this.f57230a0;
            if (c2Var2 != null && str.equalsIgnoreCase(c2Var2.f57182b)) {
                c2 c2Var3 = this.f57230a0;
                c2Var3.f57186g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = c2Var3.f57186g;
                if (c2Var3.f57197s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = c2Var3.f57183c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(m10.f24940t0).sendRequest(tL_messages_uploadMedia, new a31(9, this, c2Var3), 2);
            }
        } else if (i7 == ns.W1) {
            String str2 = (String) objArr[0];
            c2 c2Var4 = this.f57230a0;
            if (c2Var4 != null && str2.equalsIgnoreCase(c2Var4.f57182b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    c2 c2Var5 = this.f57230a0;
                    c2Var5.f57199u = Utilities.i(((float) longValue) / ((float) longValue2), 1.0f, c2Var5.f57199u);
                    hi.t0 t0Var = this.f57237e0;
                    if (t0Var != null) {
                        t0Var.setProgress(this.f57230a0.b());
                    }
                }
            }
        } else if (i7 == ns.V1) {
            String str3 = (String) objArr[0];
            c2 c2Var6 = this.f57230a0;
            if (c2Var6 != null && str3.equalsIgnoreCase(c2Var6.f57182b)) {
                h();
            }
        } else if (i7 == ns.f25466a2) {
            c2 c2Var7 = this.f57230a0;
            if (c2Var7 != null && objArr[0] == c2Var7.f57196r) {
                w7.G(m10.f24940t0).h0(false, 67108864, this.f57230a0.f57182b, true);
            }
        } else if (i7 == ns.f25472b2) {
            c2 c2Var8 = this.f57230a0;
            if (c2Var8 != null && objArr[0] == c2Var8.f57196r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                float floatValue = f10.floatValue();
                this.f57230a0.f57196r.f23847r0.Y = true;
                w7.G(this.f57229a).n(str4, false, Math.max(1L, longValue3), longValue4, f10);
                c2 c2Var9 = this.f57230a0;
                c2Var9.f57198t = Math.max(c2Var9.f57198t, floatValue);
                hi.t0 t0Var2 = this.f57237e0;
                if (t0Var2 != null) {
                    t0Var2.setProgress(this.f57230a0.b());
                }
            }
        } else if (i7 == ns.f25478c2 && (c2Var = this.f57230a0) != null && objArr[0] == c2Var.f57196r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.f57254w, this.f57236e);
        canvas.drawPath(this.f57255x, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: tg.e2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        b2 b2Var = this.F;
        if (b2Var != null) {
            this.L = bitmap;
            if (b2Var.f57163f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                b2 b2Var2 = this.F;
                if (b2Var2.f57161c != 0) {
                    Matrix matrix = new Matrix();
                    b2 b2Var3 = this.F;
                    matrix.postRotate(b2Var3.f57161c, b2Var3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
                    b2 b2Var4 = this.F;
                    if ((b2Var4.f57161c / 90) % 2 != 0) {
                        float height = (b2Var4.b().getHeight() - this.F.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.F.a().getHeight(), bitmap.getHeight() / this.F.a().getWidth());
                    canvas.drawBitmap(this.F.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(b2Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f57231b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.N;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(er.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        boolean z12;
        float d;
        float f10;
        Paint paint;
        u5 u5Var = this.f57233c;
        u5Var.f39898a = viewGroup;
        boolean z13 = this.f57243j0;
        if (z13 || u5Var.f39900c > 0.0f) {
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
            b2[] b2VarArr = this.I;
            if (b2VarArr != null) {
                for (b2 b2Var : b2VarArr) {
                    if (b2Var != null && b2Var == this.F) {
                        if (this.G > 0.0f) {
                            if (b2Var.f57176t.f57245l0 != null) {
                                canvas.save();
                                canvas.clipPath(b2Var.f57176t.f57245l0);
                                if (b2Var.f57176t.J != null) {
                                    if (z10) {
                                        paint = b2Var.f57173q;
                                    } else {
                                        paint = b2Var.f57172p;
                                    }
                                    paint.setAlpha((int) (d * 255.0f));
                                    paint.setStrokeWidth(org.telegram.messenger.g0.L(f10));
                                    canvas.drawPath(b2Var.f57168l, paint);
                                    if (b2Var.f57176t.f57245l0 != null && z10) {
                                        canvas.clipPath(b2Var.f57168l);
                                        paint.setStrokeWidth(org.telegram.messenger.g0.L(f10 * 2.0f));
                                        canvas.drawPath(b2Var.f57176t.f57245l0, paint);
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
        b2 b2Var;
        if (this.M && (b2Var = this.F) != null) {
            return b2Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.J;
    }

    public fz0 getThanosEffect() {
        if (!fz0.c()) {
            return null;
        }
        if (this.T == null) {
            fz0 fz0Var = new fz0(getContext(), new t1(this, 1));
            this.T = fz0Var;
            addView(fz0Var, ja.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        hi.t0 t0Var = this.f57237e0;
        if (t0Var != null) {
            t0Var.a();
            this.f57237e0 = null;
        }
    }

    public final boolean i() {
        return this.M;
    }

    public final b2 j(float f10, float f11) {
        int width;
        int height;
        if (this.J == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            b2[] b2VarArr = this.I;
            if (i7 >= b2VarArr.length) {
                return null;
            }
            b2 b2Var = b2VarArr[i7];
            if (b2Var != null) {
                if ((b2Var.f57161c / 90) % 2 != 0) {
                    width = this.J.getHeight();
                    height = this.J.getWidth();
                } else {
                    width = this.J.getWidth();
                    height = this.J.getHeight();
                }
                RectF rectF = org.telegram.messenger.g0.P;
                RectF rectF2 = this.I[i7].f57165i;
                float f12 = width;
                float f13 = this.f57240g0;
                float f14 = height;
                float f15 = this.f57241h0;
                rectF.set((rectF2.left / f12) * f13, (rectF2.top / f14) * f15, (rectF2.right / f12) * f13, (rectF2.bottom / f14) * f15);
                this.f57239f0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return b2Var;
                }
            }
            i7++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        b2[] b2VarArr = this.I;
        if (b2VarArr != null) {
            for (b2 b2Var : b2VarArr) {
                if (b2Var != null && (bitmap = b2Var.f57162e) != null) {
                    bitmap.recycle();
                    b2Var.f57162e = null;
                    Bitmap bitmap2 = b2Var.f57164g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        b2Var.f57164g = null;
                    }
                    c(b2Var, this.U, this.V);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i7, int i10, int i11, ln0 ln0Var) {
        int i12;
        int i13;
        vb.c cVar;
        if (i10 <= 0) {
            i12 = org.telegram.messenger.g0.f23611q.x;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            i13 = org.telegram.messenger.g0.f23611q.y;
        } else {
            i13 = i11;
        }
        this.U = i12;
        this.V = i13;
        if (!this.E && !this.f57256y && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.J = bitmap;
            this.K = i7;
            this.f57235d0 = null;
            w2 w2Var = new w2(this, i7, ln0Var, 6);
            this.f57256y = true;
            ia.a aVar = new ia.a();
            aVar.f15866b = true;
            aVar.f15867c = true;
            zzd a10 = ke.a(new zb.d(aVar));
            if (n6.h(getContext()).f()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.J;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.f57212e = min;
                obj.d = min;
                obj.f57209a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f57209a).drawRect(0.0f, 0.0f, obj.d, obj.f57212e, j6.Gm);
                obj.f57210b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f57211c = (bitmap2.getHeight() - obj.f57212e) / 2;
                arrayList.add(obj);
                w2Var.a(arrayList);
                return;
            }
            ub.a a11 = ub.a.a(i7, bitmap);
            a10.g(a11).addOnSuccessListener(new org.telegram.ui.ActionBar.z(w2Var, 29)).addOnFailureListener(new b3(this, bitmap, i7, ln0Var, w2Var, 6));
            if (this.f57235d0 == null) {
                xb.a aVar2 = xb.a.f59874b;
                q6.m.h(aVar2, "options cannot be null");
                synchronized (vb.c.class) {
                    cVar = (vb.c) pb.g.c().a(vb.c.class);
                }
                ua.b bVar = (ua.b) cVar.f58792a.get(xb.a.class);
                q6.m.g(bVar);
                yb.b bVar2 = (yb.b) bVar.get();
                bVar2.getClass();
                ua uaVar = bVar2.f60558c;
                ?? obj2 = new Object();
                obj2.f343c = y7.TYPE_THIN;
                pb.n.f54964a.execute(new qa(uaVar, new xa((b8) obj2, 1), a8.ON_DEVICE_IMAGE_LABEL_CREATE, uaVar.b(), 0));
                new ImageLabelerImpl((pb.e) bVar2.f60556a.R0(aVar2), (Executor) bVar2.f60557b.f54942a.get(), new n6.c("vision.ica", 1L)).g(a11).addOnSuccessListener(new z1(this, 0)).addOnFailureListener(new r2.j(26));
            }
            ArrayList arrayList2 = si.b0(this.f57229a).f26497n;
            for (int i14 = 0; i14 < Math.min(arrayList2.size(), 9); i14++) {
                org.telegram.messenger.j6.g(((TLRPC.TL_availableReaction) arrayList2.get(i14)).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new cc((FrameLayout) getParent(), this.f57232b0).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f57245l0;
        if (path == null) {
            this.f57245l0 = new Path();
        } else {
            path.rewind();
        }
        if (this.m0 == null) {
            this.m0 = new Path();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.m0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f57245l0.addPath(this.m0, this.f57244k0);
        this.f57245l0.computeBounds(this.f57247n0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.f57229a).c(this, ns.U1);
        ns.f(this.f57229a).c(this, ns.W1);
        ns.f(this.f57229a).c(this, ns.V1);
        ns.f(this.f57229a).c(this, ns.f25478c2);
        ns.f(this.f57229a).c(this, ns.f25466a2);
        ns.f(this.f57229a).c(this, ns.f25472b2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f57229a;
        if (i7 >= 0) {
            ns.f(i7).n(this, ns.U1);
            ns.f(this.f57229a).n(this, ns.W1);
            ns.f(this.f57229a).n(this, ns.V1);
            ns.f(this.f57229a).n(this, ns.f25478c2);
            ns.f(this.f57229a).n(this, ns.f25466a2);
            ns.f(this.f57229a).n(this, ns.f25472b2);
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
        Path path = this.f57253s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.f57251r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.f57254w;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f57255x;
        path4.rewind();
        rectF.inset(org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(-1.0f));
        path4.addRoundRect(rectF, f11, f11, direction);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.N.setTranslationY(-((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f57250q0;
            arrayList.clear();
            if (this.f57243j0) {
                Rect rect = this.f57252r0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final g20 g20Var, final String str2, final CharSequence charSequence, final boolean z10, final long j3, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final z10 z10Var, final s10 s10Var) {
        org.telegram.messenger.g0.i3(new Runnable() {
            @Override
            public final void run() {
                boolean z11;
                c2 c2Var;
                e2 e2Var = e2.this;
                z10 z10Var2 = z10Var;
                if (z10Var2 != null && (c2Var = e2Var.f57230a0) != null && c2Var.f57193o) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    c2 c2Var2 = e2Var.f57230a0;
                    if (c2Var2 != null) {
                        c2Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f57194p = new ArrayList();
                    obj.f57195q = new ArrayList();
                    obj.f57198t = 0.0f;
                    obj.f57199u = 0.0f;
                    e2Var.f57230a0 = obj;
                }
                c2 c2Var3 = e2Var.f57230a0;
                c2Var3.f57183c = str2;
                String str4 = str;
                c2Var3.f57182b = str4;
                c2Var3.f57181a = str4;
                c2Var3.d = charSequence;
                c2Var3.h = z10;
                c2Var3.f57187i = j3;
                c2Var3.f57188j = stickerSet;
                c2Var3.f57189k = document;
                g20 g20Var2 = g20Var;
                c2Var3.f57197s = g20Var2;
                c2Var3.f57190l = str3;
                c2Var3.f57192n = z10Var2;
                c2Var3.f57191m = s10Var;
                ArrayList arrayList = c2Var3.f57195q;
                if (!TextUtils.isEmpty(str4)) {
                    c2Var3.f57194p.add(new File(c2Var3.f57182b));
                }
                if (!TextUtils.isEmpty(c2Var3.f57181a) && !TextUtils.equals(c2Var3.f57181a, c2Var3.f57182b)) {
                    arrayList.add(new File(c2Var3.f57181a));
                }
                if (!TextUtils.isEmpty(c2Var3.f57190l)) {
                    arrayList.add(new File(c2Var3.f57190l));
                }
                if (!z11) {
                    e2Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        c2 c2Var4 = e2Var.f57230a0;
                        c2Var4.f57184e = si.a0(document3, c2Var4.f57183c);
                        e2Var.f57230a0.f57185f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = e2Var.f57230a0.f57185f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        e2Var.a();
                    } else if (g20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f28072id = 1;
                        c2 c2Var5 = e2Var.f57230a0;
                        String absolutePath = d7.w(m10.f24940t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        c2Var5.f57182b = absolutePath;
                        e2Var.f57230a0.f57196r = new gj(m10.f24940t0, tL_message, null, false, false);
                        e2Var.f57230a0.f57196r.f23847r0 = g20Var2;
                        MediaController.B().h0(e2Var.f57230a0.f57196r, false, false, false);
                    } else {
                        w7.G(e2Var.f57229a).h0(false, 67108864, str4, true);
                    }
                }
                if (z10Var2 == null) {
                    if (e2Var.f57237e0 == null) {
                        e2Var.f57237e0 = new hi.t0(e2Var.getContext(), hd.M0(2131746919, null));
                    }
                    e2Var.f57237e0.setOnCancelListener(new t1(e2Var, 0));
                    if (e2Var.f57237e0.getParent() == null) {
                        e2Var.addView(e2Var.f57237e0, ja.e(-1, -1, 17));
                    }
                    hi.t0 t0Var = e2Var.f57237e0;
                    t0Var.F = true;
                    t0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i7) {
        int i10 = this.f57229a;
        if (i10 != i7) {
            int i11 = ns.f25472b2;
            int i12 = ns.f25466a2;
            int i13 = ns.f25478c2;
            int i14 = ns.V1;
            int i15 = ns.W1;
            int i16 = ns.U1;
            if (i10 >= 0 && isAttachedToWindow()) {
                ns.f(this.f57229a).n(this, i16);
                ns.f(this.f57229a).n(this, i15);
                ns.f(this.f57229a).n(this, i14);
                ns.f(this.f57229a).n(this, i13);
                ns.f(this.f57229a).n(this, i12);
                ns.f(this.f57229a).n(this, i11);
            }
            this.f57229a = i7;
            if (i7 >= 0 && isAttachedToWindow()) {
                ns.f(this.f57229a).c(this, i16);
                ns.f(this.f57229a).c(this, i15);
                ns.f(this.f57229a).c(this, i14);
                ns.f(this.f57229a).c(this, i13);
                ns.f(this.f57229a).c(this, i12);
                ns.f(this.f57229a).c(this, i11);
            }
        }
    }

    public void setOutlineVisible(boolean z10) {
        float f10;
        if (this.f57243j0 != z10) {
            this.f57243j0 = z10;
            ViewPropertyAnimator animate = this.f57242i0.animate();
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
            alpha.translationX(f11).setInterpolator(er.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f57250q0;
                arrayList.clear();
                if (this.f57243j0) {
                    Rect rect = this.f57252r0;
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
        this.f57234c0 = s1Var;
    }
}

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
import hi.x7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.n6;
import org.telegram.messenger.p10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.ao0;
import org.telegram.ui.cd0;
import org.telegram.ui.d31;
import org.telegram.ui.pn0;
public final class i2 extends FrameLayout implements fs {
    public static final int f57957s0 = 0;
    public volatile boolean E;
    public f2 F;
    public float G;
    public boolean H;
    public f2[] I;
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
    public nz0 T;
    public int U;
    public int V;
    public boolean W;
    public int f57958a;
    public g2 f57959a0;
    public final c6 f57960b;
    public final i6 f57961b0;
    public final c6 f57962c;
    public x1 f57963c0;
    public final Paint d;
    public String f57964d0;
    public final Paint f57965e;
    public hi.c1 f57966e0;
    public final Paint f57967f;
    public final Matrix f57968f0;
    public float f57969g0;
    public final Paint h;
    public float f57970h0;
    public final r1 f57971i0;
    public boolean f57972j0;
    public final Matrix f57973k0;
    public Path f57974l0;
    public Path m0;
    public final PathMeasure f57975n;
    public final RectF f57976n0;
    public float f57977o0;
    public float f57978p0;
    public final ArrayList f57979q0;
    public final Path f57980r;
    public final Rect f57981r0;
    public final Path f57982s;
    public final Path f57983w;
    public final Path f57984x;
    public volatile boolean f57985y;

    public i2(ContextThemeWrapper contextThemeWrapper, i6 i6Var) {
        super(contextThemeWrapper);
        this.f57958a = -1;
        kr krVar = kr.h;
        this.f57960b = new c6(0.0f, (View) null, 0L, 420L, krVar);
        this.f57962c = new c6(0.0f, (View) null, 0L, 420L, krVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f57965e = paint2;
        Paint paint3 = new Paint(1);
        this.f57967f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f57975n = new PathMeasure();
        this.f57980r = new Path();
        this.f57982s = new Path();
        this.f57983w = new Path();
        this.f57984x = new Path();
        this.G = 2.0f;
        this.f57968f0 = new Matrix();
        this.f57973k0 = new Matrix();
        this.f57976n0 = new RectF();
        this.f57979q0 = new ArrayList();
        this.f57981r0 = new Rect();
        this.f57961b0 = i6Var;
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
        r1 r1Var = new r1(contextThemeWrapper);
        this.f57971i0 = r1Var;
        r1Var.setAlpha(0.0f);
        r1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        r1Var.b(0.33f, 10.0f);
        r1Var.setBrushWeight(this.G);
        r1Var.setValueOverride(new nd0(this, 18));
        r1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        r1Var.setAlpha(0.0f);
        addView(r1Var, na.c(-1.0f, -1));
    }

    public static void c(tg.f2 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: tg.i2.c(tg.f2, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((e2) arrayList.get(0));
        int i7 = 1;
        while (i7 < arrayList.size() - 1) {
            e2 e2Var = (e2) arrayList.get(i7 - 1);
            e2 e2Var2 = (e2) arrayList.get(i7);
            i7++;
            e2 e2Var3 = (e2) arrayList.get(i7);
            int i10 = ((Point) e2Var2).x;
            int i11 = ((Point) e2Var).x;
            int i12 = ((Point) e2Var3).y;
            int i13 = ((Point) e2Var).y;
            if (Math.abs((((i12 - i13) * (i10 - i11)) - ((((Point) e2Var3).x - i11) * (((Point) e2Var2).y - i13))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(e2Var2);
            }
        }
        arrayList2.add((e2) i5.c.h(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final g2 g2Var = this.f57959a0;
        if (g2Var != null) {
            final int i7 = i10.f24637t0;
            g2Var.f57931o = true;
            if (g2Var.f57929m != null) {
                h();
                g2Var.f57929m.a(g2Var.f57920b, g2Var.f57922e.document);
                org.telegram.messenger.g0.h3(new cd0(25), 250L);
            } else if (g2Var.f57927k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = ri.c0(g2Var.f57927k, g2Var.f57921c).document;
                tL_stickers_replaceSticker.new_sticker = g2Var.f57922e;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final i2 f58321b;

                    {
                        this.f58321b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final i2 i2Var = this.f58321b;
                                final int i10 = i7;
                                final g2 g2Var2 = g2Var;
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
                                                final i2 i2Var2 = i2Var;
                                                final g2 g2Var3 = g2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i11 = i10;
                                                    z10 = true;
                                                    ri.d0(i11).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i11).E0(tL_messages_stickerSet.set.f28519id, true)) {
                                                        ri.d0(i11).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var = i2Var2.f57966e0;
                                                    if (c1Var != null) {
                                                        c1Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i12 = r4;
                                                            g2 g2Var4 = g2Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            i2 i2Var3 = i2Var2;
                                                            switch (i12) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var4.f57923f.document;
                                                                    String str = g2Var4.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject3, document, str, bool);
                                                                    i2Var3.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject3, g2Var4.f57923f.document, g2Var4.f57928l, Boolean.TRUE);
                                                                    i2Var3.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var4.f57923f.document;
                                                                    String str2 = g2Var4.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject3, document2, str2, bool2);
                                                                    i2Var3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var2.n(tL_error);
                                                    i2Var2.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var = g2Var3.f57930n;
                                                if (w10Var != null) {
                                                    w10Var.a(Boolean.valueOf(z10));
                                                    g2Var3.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var3 = i2Var;
                                                final g2 g2Var4 = g2Var2;
                                                if (z14) {
                                                    int i12 = i10;
                                                    z11 = true;
                                                    ri.d0(i12).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i12).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var2 = i2Var3.f57966e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            g2 g2Var42 = g2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var32 = i2Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var42.f57923f.document;
                                                                    String str = g2Var42.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var42.f57923f.document, g2Var42.f57928l, Boolean.TRUE);
                                                                    i2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var42.f57923f.document;
                                                                    String str2 = g2Var42.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var3.n(tL_error);
                                                    i2Var3.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var2 = g2Var4.f57930n;
                                                if (w10Var2 != null) {
                                                    w10Var2.a(Boolean.valueOf(z11));
                                                    g2Var4.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var;
                                                final g2 g2Var5 = g2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28519id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.f57966e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            g2 g2Var42 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var32 = i2Var4;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var42.f57923f.document;
                                                                    String str = g2Var42.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var42.f57923f.document, g2Var42.f57928l, Boolean.TRUE);
                                                                    i2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var42.f57923f.document;
                                                                    String str2 = g2Var42.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var3 = g2Var5.f57930n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z12));
                                                    g2Var5.f57930n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final i2 i2Var2 = this.f58321b;
                                final int i11 = i7;
                                final g2 g2Var3 = g2Var;
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
                                                final i2 i2Var22 = i2Var2;
                                                final g2 g2Var32 = g2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28519id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var = i2Var22.f57966e0;
                                                    if (c1Var != null) {
                                                        c1Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            g2 g2Var42 = g2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            i2 i2Var32 = i2Var22;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var42.f57923f.document;
                                                                    String str = g2Var42.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var42.f57923f.document, g2Var42.f57928l, Boolean.TRUE);
                                                                    i2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var42.f57923f.document;
                                                                    String str2 = g2Var42.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var22.n(tL_error);
                                                    i2Var22.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var = g2Var32.f57930n;
                                                if (w10Var != null) {
                                                    w10Var.a(Boolean.valueOf(z10));
                                                    g2Var32.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var3 = i2Var2;
                                                final g2 g2Var4 = g2Var3;
                                                if (z14) {
                                                    int i12 = i11;
                                                    z11 = true;
                                                    ri.d0(i12).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i12).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var2 = i2Var3.f57966e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            g2 g2Var42 = g2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var32 = i2Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var42.f57923f.document;
                                                                    String str = g2Var42.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var42.f57923f.document, g2Var42.f57928l, Boolean.TRUE);
                                                                    i2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var42.f57923f.document;
                                                                    String str2 = g2Var42.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var3.n(tL_error);
                                                    i2Var3.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var2 = g2Var4.f57930n;
                                                if (w10Var2 != null) {
                                                    w10Var2.a(Boolean.valueOf(z11));
                                                    g2Var4.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var2;
                                                final g2 g2Var5 = g2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28519id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.f57966e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            g2 g2Var42 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var32 = i2Var4;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var42.f57923f.document;
                                                                    String str = g2Var42.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var42.f57923f.document, g2Var42.f57928l, Boolean.TRUE);
                                                                    i2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var42.f57923f.document;
                                                                    String str2 = g2Var42.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var3 = g2Var5.f57930n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z12));
                                                    g2Var5.f57930n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final i2 i2Var3 = this.f58321b;
                                final int i12 = i7;
                                final g2 g2Var4 = g2Var;
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
                                                final i2 i2Var22 = i2Var3;
                                                final g2 g2Var32 = g2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28519id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var = i2Var22.f57966e0;
                                                    if (c1Var != null) {
                                                        c1Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            g2 g2Var42 = g2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            i2 i2Var32 = i2Var22;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var42.f57923f.document;
                                                                    String str = g2Var42.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var42.f57923f.document, g2Var42.f57928l, Boolean.TRUE);
                                                                    i2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var42.f57923f.document;
                                                                    String str2 = g2Var42.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var22.n(tL_error);
                                                    i2Var22.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var = g2Var32.f57930n;
                                                if (w10Var != null) {
                                                    w10Var.a(Boolean.valueOf(z10));
                                                    g2Var32.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var32 = i2Var3;
                                                final g2 g2Var42 = g2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var2 = i2Var32.f57966e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var322 = i2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var32.n(tL_error);
                                                    i2Var32.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var2 = g2Var42.f57930n;
                                                if (w10Var2 != null) {
                                                    w10Var2.a(Boolean.valueOf(z11));
                                                    g2Var42.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var3;
                                                final g2 g2Var5 = g2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28519id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.f57966e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var322 = i2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var3 = g2Var5.f57930n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z12));
                                                    g2Var5.f57930n = null;
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
            } else if (g2Var.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = g2Var.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(g2Var.f57922e);
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final i2 f58321b;

                    {
                        this.f58321b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final i2 i2Var = this.f58321b;
                                final int i10 = i7;
                                final g2 g2Var2 = g2Var;
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
                                                final i2 i2Var22 = i2Var;
                                                final g2 g2Var32 = g2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28519id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var = i2Var22.f57966e0;
                                                    if (c1Var != null) {
                                                        c1Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            i2 i2Var322 = i2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var22.n(tL_error);
                                                    i2Var22.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var = g2Var32.f57930n;
                                                if (w10Var != null) {
                                                    w10Var.a(Boolean.valueOf(z10));
                                                    g2Var32.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var32 = i2Var;
                                                final g2 g2Var42 = g2Var2;
                                                if (z14) {
                                                    int i122 = i10;
                                                    z11 = true;
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var2 = i2Var32.f57966e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var322 = i2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var32.n(tL_error);
                                                    i2Var32.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var2 = g2Var42.f57930n;
                                                if (w10Var2 != null) {
                                                    w10Var2.a(Boolean.valueOf(z11));
                                                    g2Var42.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var;
                                                final g2 g2Var5 = g2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28519id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.f57966e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var322 = i2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var3 = g2Var5.f57930n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z12));
                                                    g2Var5.f57930n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final i2 i2Var2 = this.f58321b;
                                final int i11 = i7;
                                final g2 g2Var3 = g2Var;
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
                                                final i2 i2Var22 = i2Var2;
                                                final g2 g2Var32 = g2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28519id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var = i2Var22.f57966e0;
                                                    if (c1Var != null) {
                                                        c1Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            i2 i2Var322 = i2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var22.n(tL_error);
                                                    i2Var22.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var = g2Var32.f57930n;
                                                if (w10Var != null) {
                                                    w10Var.a(Boolean.valueOf(z10));
                                                    g2Var32.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var32 = i2Var2;
                                                final g2 g2Var42 = g2Var3;
                                                if (z14) {
                                                    int i122 = i11;
                                                    z11 = true;
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var2 = i2Var32.f57966e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var322 = i2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var32.n(tL_error);
                                                    i2Var32.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var2 = g2Var42.f57930n;
                                                if (w10Var2 != null) {
                                                    w10Var2.a(Boolean.valueOf(z11));
                                                    g2Var42.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var2;
                                                final g2 g2Var5 = g2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28519id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.f57966e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var322 = i2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var3 = g2Var5.f57930n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z12));
                                                    g2Var5.f57930n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final i2 i2Var3 = this.f58321b;
                                final int i12 = i7;
                                final g2 g2Var4 = g2Var;
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
                                                final i2 i2Var22 = i2Var3;
                                                final g2 g2Var32 = g2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28519id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var = i2Var22.f57966e0;
                                                    if (c1Var != null) {
                                                        c1Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            i2 i2Var322 = i2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var22.n(tL_error);
                                                    i2Var22.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var = g2Var32.f57930n;
                                                if (w10Var != null) {
                                                    w10Var.a(Boolean.valueOf(z10));
                                                    g2Var32.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var32 = i2Var3;
                                                final g2 g2Var42 = g2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var2 = i2Var32.f57966e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var322 = i2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var32.n(tL_error);
                                                    i2Var32.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var2 = g2Var42.f57930n;
                                                if (w10Var2 != null) {
                                                    w10Var2.a(Boolean.valueOf(z11));
                                                    g2Var42.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var3;
                                                final g2 g2Var5 = g2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28519id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.f57966e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var322 = i2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var3 = g2Var5.f57930n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z12));
                                                    g2Var5.f57930n = null;
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
            } else if (g2Var.h) {
                h();
                ks.f(i7).m(ks.f25300u3, Boolean.FALSE);
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(g2Var, 21), 350L);
                w10 w10Var = g2Var.f57930n;
                if (w10Var != null) {
                    w10Var.a(Boolean.TRUE);
                }
            } else if (g2Var.f57925i != 0) {
                zy.C(i7).v0(g2Var.f57923f.document, null, g2Var.f57925i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                hi.c1 c1Var = this.f57966e0;
                if (c1Var != null) {
                    c1Var.setProgress(1.0f);
                }
                org.telegram.messenger.g0.h3(new ao0(this, i7, 16), 450L);
                w10 w10Var2 = g2Var.f57930n;
                if (w10Var2 != null) {
                    w10Var2.a(Boolean.TRUE);
                    g2Var.f57930n = null;
                }
            } else if (g2Var.f57926j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = ri.b0(g2Var.f57926j);
                tL_stickers_addStickerToSet.sticker = g2Var.f57922e;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final i2 f58321b;

                    {
                        this.f58321b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final i2 i2Var = this.f58321b;
                                final int i10 = i7;
                                final g2 g2Var2 = g2Var;
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
                                                final i2 i2Var22 = i2Var;
                                                final g2 g2Var32 = g2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28519id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var2 = i2Var22.f57966e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            i2 i2Var322 = i2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var22.n(tL_error);
                                                    i2Var22.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var3 = g2Var32.f57930n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z10));
                                                    g2Var32.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var32 = i2Var;
                                                final g2 g2Var42 = g2Var2;
                                                if (z14) {
                                                    int i122 = i10;
                                                    z11 = true;
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var22 = i2Var32.f57966e0;
                                                    if (c1Var22 != null) {
                                                        c1Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var322 = i2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var32.n(tL_error);
                                                    i2Var32.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var22 = g2Var42.f57930n;
                                                if (w10Var22 != null) {
                                                    w10Var22.a(Boolean.valueOf(z11));
                                                    g2Var42.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var;
                                                final g2 g2Var5 = g2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i10;
                                                    z12 = true;
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28519id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.f57966e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var322 = i2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var32 = g2Var5.f57930n;
                                                if (w10Var32 != null) {
                                                    w10Var32.a(Boolean.valueOf(z12));
                                                    g2Var5.f57930n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final i2 i2Var2 = this.f58321b;
                                final int i11 = i7;
                                final g2 g2Var3 = g2Var;
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
                                                final i2 i2Var22 = i2Var2;
                                                final g2 g2Var32 = g2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28519id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var2 = i2Var22.f57966e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            i2 i2Var322 = i2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var22.n(tL_error);
                                                    i2Var22.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var3 = g2Var32.f57930n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z10));
                                                    g2Var32.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var32 = i2Var2;
                                                final g2 g2Var42 = g2Var3;
                                                if (z14) {
                                                    int i122 = i11;
                                                    z11 = true;
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var22 = i2Var32.f57966e0;
                                                    if (c1Var22 != null) {
                                                        c1Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var322 = i2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var32.n(tL_error);
                                                    i2Var32.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var22 = g2Var42.f57930n;
                                                if (w10Var22 != null) {
                                                    w10Var22.a(Boolean.valueOf(z11));
                                                    g2Var42.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var2;
                                                final g2 g2Var5 = g2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i11;
                                                    z12 = true;
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28519id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.f57966e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var322 = i2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var32 = g2Var5.f57930n;
                                                if (w10Var32 != null) {
                                                    w10Var32.a(Boolean.valueOf(z12));
                                                    g2Var5.f57930n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final i2 i2Var3 = this.f58321b;
                                final int i12 = i7;
                                final g2 g2Var4 = g2Var;
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
                                                final i2 i2Var22 = i2Var3;
                                                final g2 g2Var32 = g2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28519id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var2 = i2Var22.f57966e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            i2 i2Var322 = i2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var22.n(tL_error);
                                                    i2Var22.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var3 = g2Var32.f57930n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z10));
                                                    g2Var32.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var32 = i2Var3;
                                                final g2 g2Var42 = g2Var4;
                                                if (z14) {
                                                    int i122 = i12;
                                                    z11 = true;
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var22 = i2Var32.f57966e0;
                                                    if (c1Var22 != null) {
                                                        c1Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var322 = i2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var32.n(tL_error);
                                                    i2Var32.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var22 = g2Var42.f57930n;
                                                if (w10Var22 != null) {
                                                    w10Var22.a(Boolean.valueOf(z11));
                                                    g2Var42.f57930n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var3;
                                                final g2 g2Var5 = g2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i13 = i12;
                                                    z12 = true;
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28519id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.f57966e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            g2 g2Var422 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var322 = i2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document = g2Var422.f57923f.document;
                                                                    String str = g2Var422.f57928l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(i10.f24637t0).m(217, Boolean.FALSE, tLObject32, g2Var422.f57923f.document, g2Var422.f57928l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(i10.f24637t0);
                                                                    TLRPC.Document document2 = g2Var422.f57923f.document;
                                                                    String str2 = g2Var422.f57928l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var32 = g2Var5.f57930n;
                                                if (w10Var32 != null) {
                                                    w10Var32.a(Boolean.valueOf(z12));
                                                    g2Var5.f57930n = null;
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
                f2[] f2VarArr = this.I;
                if (i7 >= f2VarArr.length) {
                    break;
                }
                f2 f2Var = f2VarArr[i7];
                if (f2Var != null) {
                    f2Var.f57907l.reset();
                    Bitmap bitmap = f2Var.f57901e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        f2Var.f57901e = null;
                    }
                    Bitmap bitmap2 = f2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        f2Var.d = null;
                    }
                    Bitmap bitmap3 = f2Var.f57903g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        f2Var.f57903g = null;
                    }
                    Bitmap bitmap4 = f2Var.f57902f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        f2Var.f57902f = null;
                    }
                }
                i7++;
            }
            this.I = null;
        }
        this.E = false;
        this.f57985y = false;
        this.M = false;
        this.N.setAlpha(0.0f);
        this.N.setScaleX(0.3f);
        this.N.setScaleY(0.3f);
        g2 g2Var = this.f57959a0;
        if (g2Var != null) {
            if (!g2Var.f57931o) {
                g2Var.a();
            }
            this.f57959a0 = null;
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
        g2 g2Var;
        if (i7 == ks.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            g2 g2Var2 = this.f57959a0;
            if (g2Var2 != null && str.equalsIgnoreCase(g2Var2.f57920b)) {
                g2 g2Var3 = this.f57959a0;
                g2Var3.f57924g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = g2Var3.f57924g;
                if (g2Var3.f57935s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = g2Var3.f57921c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(i10.f24637t0).sendRequest(tL_messages_uploadMedia, new d31(9, this, g2Var3), 2);
            }
        } else if (i7 == ks.W1) {
            String str2 = (String) objArr[0];
            g2 g2Var4 = this.f57959a0;
            if (g2Var4 != null && str2.equalsIgnoreCase(g2Var4.f57920b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    g2 g2Var5 = this.f57959a0;
                    g2Var5.f57937u = Utilities.i(((float) longValue) / ((float) longValue2), 1.0f, g2Var5.f57937u);
                    hi.c1 c1Var = this.f57966e0;
                    if (c1Var != null) {
                        c1Var.setProgress(this.f57959a0.b());
                    }
                }
            }
        } else if (i7 == ks.V1) {
            String str3 = (String) objArr[0];
            g2 g2Var6 = this.f57959a0;
            if (g2Var6 != null && str3.equalsIgnoreCase(g2Var6.f57920b)) {
                h();
            }
        } else if (i7 == ks.f25181a2) {
            g2 g2Var7 = this.f57959a0;
            if (g2Var7 != null && objArr[0] == g2Var7.f57934r) {
                w7.G(i10.f24637t0).h0(false, 67108864, this.f57959a0.f57920b, true);
            }
        } else if (i7 == ks.f25188b2) {
            g2 g2Var8 = this.f57959a0;
            if (g2Var8 != null && objArr[0] == g2Var8.f57934r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                float floatValue = f10.floatValue();
                this.f57959a0.f57934r.f24101r0.Y = true;
                w7.G(this.f57958a).n(str4, false, Math.max(1L, longValue3), longValue4, f10);
                g2 g2Var9 = this.f57959a0;
                g2Var9.f57936t = Math.max(g2Var9.f57936t, floatValue);
                hi.c1 c1Var2 = this.f57966e0;
                if (c1Var2 != null) {
                    c1Var2.setProgress(this.f57959a0.b());
                }
            }
        } else if (i7 == ks.f25194c2 && (g2Var = this.f57959a0) != null && objArr[0] == g2Var.f57934r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.f57983w, this.f57965e);
        canvas.drawPath(this.f57984x, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: tg.i2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        f2 f2Var = this.F;
        if (f2Var != null) {
            this.L = bitmap;
            if (f2Var.f57902f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                f2 f2Var2 = this.F;
                if (f2Var2.f57900c != 0) {
                    Matrix matrix = new Matrix();
                    f2 f2Var3 = this.F;
                    matrix.postRotate(f2Var3.f57900c, f2Var3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
                    f2 f2Var4 = this.F;
                    if ((f2Var4.f57900c / 90) % 2 != 0) {
                        float height = (f2Var4.b().getHeight() - this.F.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.F.a().getHeight(), bitmap.getHeight() / this.F.a().getWidth());
                    canvas.drawBitmap(this.F.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(f2Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f57960b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.N;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(kr.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        boolean z12;
        float d;
        float f10;
        Paint paint;
        c6 c6Var = this.f57962c;
        c6Var.f33929a = viewGroup;
        boolean z13 = this.f57972j0;
        if (z13 || c6Var.f33931c > 0.0f) {
            if (viewGroup == null) {
                d = 1.0f;
            } else {
                if (z13 && !z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d = c6Var.d(z12);
            }
            f2[] f2VarArr = this.I;
            if (f2VarArr != null) {
                for (f2 f2Var : f2VarArr) {
                    if (f2Var != null && f2Var == this.F) {
                        if (this.G > 0.0f) {
                            if (f2Var.f57915t.f57974l0 != null) {
                                canvas.save();
                                canvas.clipPath(f2Var.f57915t.f57974l0);
                                if (f2Var.f57915t.J != null) {
                                    if (z10) {
                                        paint = f2Var.f57912q;
                                    } else {
                                        paint = f2Var.f57911p;
                                    }
                                    paint.setAlpha((int) (d * 255.0f));
                                    paint.setStrokeWidth(org.telegram.messenger.g0.L(f10));
                                    canvas.drawPath(f2Var.f57907l, paint);
                                    if (f2Var.f57915t.f57974l0 != null && z10) {
                                        canvas.clipPath(f2Var.f57907l);
                                        paint.setStrokeWidth(org.telegram.messenger.g0.L(f10 * 2.0f));
                                        canvas.drawPath(f2Var.f57915t.f57974l0, paint);
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
        f2 f2Var;
        if (this.M && (f2Var = this.F) != null) {
            return f2Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.J;
    }

    public nz0 getThanosEffect() {
        if (!nz0.c()) {
            return null;
        }
        if (this.T == null) {
            nz0 nz0Var = new nz0(getContext(), new y1(this, 1));
            this.T = nz0Var;
            addView(nz0Var, na.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        hi.c1 c1Var = this.f57966e0;
        if (c1Var != null) {
            c1Var.a();
            this.f57966e0 = null;
        }
    }

    public final boolean i() {
        return this.M;
    }

    public final f2 j(float f10, float f11) {
        int width;
        int height;
        if (this.J == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            f2[] f2VarArr = this.I;
            if (i7 >= f2VarArr.length) {
                return null;
            }
            f2 f2Var = f2VarArr[i7];
            if (f2Var != null) {
                if ((f2Var.f57900c / 90) % 2 != 0) {
                    width = this.J.getHeight();
                    height = this.J.getWidth();
                } else {
                    width = this.J.getWidth();
                    height = this.J.getHeight();
                }
                RectF rectF = org.telegram.messenger.g0.P;
                RectF rectF2 = this.I[i7].f57904i;
                float f12 = width;
                float f13 = this.f57969g0;
                float f14 = height;
                float f15 = this.f57970h0;
                rectF.set((rectF2.left / f12) * f13, (rectF2.top / f14) * f15, (rectF2.right / f12) * f13, (rectF2.bottom / f14) * f15);
                this.f57968f0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return f2Var;
                }
            }
            i7++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        f2[] f2VarArr = this.I;
        if (f2VarArr != null) {
            for (f2 f2Var : f2VarArr) {
                if (f2Var != null && (bitmap = f2Var.f57901e) != null) {
                    bitmap.recycle();
                    f2Var.f57901e = null;
                    Bitmap bitmap2 = f2Var.f57903g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        f2Var.f57903g = null;
                    }
                    c(f2Var, this.U, this.V);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i7, int i10, int i11, pn0 pn0Var) {
        int i12;
        int i13;
        vb.c cVar;
        if (i10 <= 0) {
            i12 = org.telegram.messenger.g0.f24226q.x;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            i13 = org.telegram.messenger.g0.f24226q.y;
        } else {
            i13 = i11;
        }
        this.U = i12;
        this.V = i13;
        if (!this.E && !this.f57985y && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.J = bitmap;
            this.K = i7;
            this.f57964d0 = null;
            j5 j5Var = new j5(this, i7, pn0Var, 6);
            this.f57985y = true;
            ia.a aVar = new ia.a();
            aVar.f16272b = true;
            aVar.f16273c = true;
            zzd a10 = oe.a(new zb.d(aVar));
            if (n6.h(getContext()).f()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.J;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.f57950e = min;
                obj.d = min;
                obj.f57947a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f57947a).drawRect(0.0f, 0.0f, obj.d, obj.f57950e, org.telegram.ui.ActionBar.n6.Gm);
                obj.f57948b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f57949c = (bitmap2.getHeight() - obj.f57950e) / 2;
                arrayList.add(obj);
                j5Var.a(arrayList);
                return;
            }
            ub.a a11 = ub.a.a(i7, bitmap);
            a10.h(a11).addOnSuccessListener(new s(j5Var, 3)).addOnFailureListener(new o5(this, bitmap, i7, pn0Var, j5Var, 6));
            if (this.f57964d0 == null) {
                xb.a aVar2 = xb.a.f60572b;
                q6.m.i(aVar2, "options cannot be null");
                synchronized (vb.c.class) {
                    cVar = (vb.c) pb.g.c().a(vb.c.class);
                }
                ua.b bVar = (ua.b) cVar.f59489a.get(xb.a.class);
                q6.m.h(bVar);
                yb.b bVar2 = (yb.b) bVar.get();
                bVar2.getClass();
                ua uaVar = bVar2.f61253c;
                ?? obj2 = new Object();
                obj2.f343c = y7.TYPE_THIN;
                pb.n.f55663a.execute(new qa(uaVar, new xa((b8) obj2, 1), a8.ON_DEVICE_IMAGE_LABEL_CREATE, uaVar.b(), 0));
                new ImageLabelerImpl((pb.e) bVar2.f61251a.R0(aVar2), (Executor) bVar2.f61252b.f55641a.get(), new n6.c("vision.ica", 1L)).h(a11).addOnSuccessListener(new s(this, 4)).addOnFailureListener(new r0.f1(27));
            }
            ArrayList arrayList2 = ri.d0(this.f57958a).f26726n;
            for (int i14 = 0; i14 < Math.min(arrayList2.size(), 9); i14++) {
                j6.g(((TLRPC.TL_availableReaction) arrayList2.get(i14)).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new kc((FrameLayout) getParent(), this.f57961b0).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f57974l0;
        if (path == null) {
            this.f57974l0 = new Path();
        } else {
            path.rewind();
        }
        if (this.m0 == null) {
            this.m0 = new Path();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.m0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f57974l0.addPath(this.m0, this.f57973k0);
        this.f57974l0.computeBounds(this.f57976n0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f57958a).c(this, ks.U1);
        ks.f(this.f57958a).c(this, ks.W1);
        ks.f(this.f57958a).c(this, ks.V1);
        ks.f(this.f57958a).c(this, ks.f25194c2);
        ks.f(this.f57958a).c(this, ks.f25181a2);
        ks.f(this.f57958a).c(this, ks.f25188b2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f57958a;
        if (i7 >= 0) {
            ks.f(i7).n(this, ks.U1);
            ks.f(this.f57958a).n(this, ks.W1);
            ks.f(this.f57958a).n(this, ks.V1);
            ks.f(this.f57958a).n(this, ks.f25194c2);
            ks.f(this.f57958a).n(this, ks.f25181a2);
            ks.f(this.f57958a).n(this, ks.f25188b2);
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
        Path path = this.f57982s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.f57980r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.f57983w;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f57984x;
        path4.rewind();
        rectF.inset(org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(-1.0f));
        path4.addRoundRect(rectF, f11, f11, direction);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.N.setTranslationY(-((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f57979q0;
            arrayList.clear();
            if (this.f57972j0) {
                Rect rect = this.f57981r0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final d20 d20Var, final String str2, final CharSequence charSequence, final boolean z10, final long j3, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final w10 w10Var, final p10 p10Var) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                boolean z11;
                g2 g2Var;
                i2 i2Var = i2.this;
                w10 w10Var2 = w10Var;
                if (w10Var2 != null && (g2Var = i2Var.f57959a0) != null && g2Var.f57931o) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    g2 g2Var2 = i2Var.f57959a0;
                    if (g2Var2 != null) {
                        g2Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f57932p = new ArrayList();
                    obj.f57933q = new ArrayList();
                    obj.f57936t = 0.0f;
                    obj.f57937u = 0.0f;
                    i2Var.f57959a0 = obj;
                }
                g2 g2Var3 = i2Var.f57959a0;
                g2Var3.f57921c = str2;
                String str4 = str;
                g2Var3.f57920b = str4;
                g2Var3.f57919a = str4;
                g2Var3.d = charSequence;
                g2Var3.h = z10;
                g2Var3.f57925i = j3;
                g2Var3.f57926j = stickerSet;
                g2Var3.f57927k = document;
                d20 d20Var2 = d20Var;
                g2Var3.f57935s = d20Var2;
                g2Var3.f57928l = str3;
                g2Var3.f57930n = w10Var2;
                g2Var3.f57929m = p10Var;
                ArrayList arrayList = g2Var3.f57933q;
                if (!TextUtils.isEmpty(str4)) {
                    g2Var3.f57932p.add(new File(g2Var3.f57920b));
                }
                if (!TextUtils.isEmpty(g2Var3.f57919a) && !TextUtils.equals(g2Var3.f57919a, g2Var3.f57920b)) {
                    arrayList.add(new File(g2Var3.f57919a));
                }
                if (!TextUtils.isEmpty(g2Var3.f57928l)) {
                    arrayList.add(new File(g2Var3.f57928l));
                }
                if (!z11) {
                    i2Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        g2 g2Var4 = i2Var.f57959a0;
                        g2Var4.f57922e = ri.c0(document3, g2Var4.f57921c);
                        i2Var.f57959a0.f57923f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = i2Var.f57959a0.f57923f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        i2Var.a();
                    } else if (d20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f28513id = 1;
                        g2 g2Var5 = i2Var.f57959a0;
                        String absolutePath = x7.w(i10.f24637t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        g2Var5.f57920b = absolutePath;
                        i2Var.f57959a0.f57934r = new fj(i10.f24637t0, tL_message, null, false, false);
                        i2Var.f57959a0.f57934r.f24101r0 = d20Var2;
                        MediaController.B().h0(i2Var.f57959a0.f57934r, false, false, false);
                    } else {
                        w7.G(i2Var.f57958a).h0(false, 67108864, str4, true);
                    }
                }
                if (w10Var2 == null) {
                    if (i2Var.f57966e0 == null) {
                        i2Var.f57966e0 = new hi.c1(i2Var.getContext(), gd.N0(2131746725, null));
                    }
                    i2Var.f57966e0.setOnCancelListener(new y1(i2Var, 0));
                    if (i2Var.f57966e0.getParent() == null) {
                        i2Var.addView(i2Var.f57966e0, na.e(-1, -1, 17));
                    }
                    hi.c1 c1Var = i2Var.f57966e0;
                    c1Var.F = true;
                    c1Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i7) {
        int i10 = this.f57958a;
        if (i10 != i7) {
            int i11 = ks.f25188b2;
            int i12 = ks.f25181a2;
            int i13 = ks.f25194c2;
            int i14 = ks.V1;
            int i15 = ks.W1;
            int i16 = ks.U1;
            if (i10 >= 0 && isAttachedToWindow()) {
                ks.f(this.f57958a).n(this, i16);
                ks.f(this.f57958a).n(this, i15);
                ks.f(this.f57958a).n(this, i14);
                ks.f(this.f57958a).n(this, i13);
                ks.f(this.f57958a).n(this, i12);
                ks.f(this.f57958a).n(this, i11);
            }
            this.f57958a = i7;
            if (i7 >= 0 && isAttachedToWindow()) {
                ks.f(this.f57958a).c(this, i16);
                ks.f(this.f57958a).c(this, i15);
                ks.f(this.f57958a).c(this, i14);
                ks.f(this.f57958a).c(this, i13);
                ks.f(this.f57958a).c(this, i12);
                ks.f(this.f57958a).c(this, i11);
            }
        }
    }

    public void setOutlineVisible(boolean z10) {
        float f10;
        if (this.f57972j0 != z10) {
            this.f57972j0 = z10;
            ViewPropertyAnimator animate = this.f57971i0.animate();
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
            alpha.translationX(f11).setInterpolator(kr.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f57979q0;
                arrayList.clear();
                if (this.f57972j0) {
                    Rect rect = this.f57981r0;
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

    public void setStickerCutOutBtn(x1 x1Var) {
        this.f57963c0 = x1Var;
    }
}

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
import bi.d5;
import bi.i5;
import c8.ma;
import c8.ne;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import hi.d7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e20;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.n6;
import org.telegram.messenger.q10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.dd0;
import org.telegram.ui.e31;
import org.telegram.ui.jw0;
import org.telegram.ui.on0;
public final class e2 extends FrameLayout implements fs {
    public static final int f57800s0 = 0;
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
    public mz0 T;
    public int U;
    public int V;
    public boolean W;
    public int f57801a;
    public c2 f57802a0;
    public final c6 f57803b;
    public final i6 f57804b0;
    public final c6 f57805c;
    public s1 f57806c0;
    public final Paint d;
    public String f57807d0;
    public final Paint f57808e;
    public hi.u0 f57809e0;
    public final Paint f57810f;
    public final Matrix f57811f0;
    public float f57812g0;
    public final Paint h;
    public float f57813h0;
    public final m1 f57814i0;
    public boolean f57815j0;
    public final Matrix f57816k0;
    public Path f57817l0;
    public Path m0;
    public final PathMeasure f57818n;
    public final RectF f57819n0;
    public float f57820o0;
    public float f57821p0;
    public final ArrayList f57822q0;
    public final Path f57823r;
    public final Rect f57824r0;
    public final Path f57825s;
    public final Path f57826w;
    public final Path f57827x;
    public volatile boolean f57828y;

    public e2(ContextThemeWrapper contextThemeWrapper, i6 i6Var) {
        super(contextThemeWrapper);
        this.f57801a = -1;
        lr lrVar = lr.h;
        this.f57803b = new c6(0.0f, (View) null, 0L, 420L, lrVar);
        this.f57805c = new c6(0.0f, (View) null, 0L, 420L, lrVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f57808e = paint2;
        Paint paint3 = new Paint(1);
        this.f57810f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f57818n = new PathMeasure();
        this.f57823r = new Path();
        this.f57825s = new Path();
        this.f57826w = new Path();
        this.f57827x = new Path();
        this.G = 2.0f;
        this.f57811f0 = new Matrix();
        this.f57816k0 = new Matrix();
        this.f57819n0 = new RectF();
        this.f57822q0 = new ArrayList();
        this.f57824r0 = new Rect();
        this.f57804b0 = i6Var;
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
        addView(textView, ma.e(-2, -2, 17));
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
        this.f57814i0 = m1Var;
        m1Var.setAlpha(0.0f);
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.b(0.33f, 10.0f);
        m1Var.setBrushWeight(this.G);
        m1Var.setValueOverride(new c5(this));
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.setAlpha(0.0f);
        addView(m1Var, ma.c(-1.0f, -1));
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
        final c2 c2Var = this.f57802a0;
        if (c2Var != null) {
            final int i7 = j10.f24770t0;
            c2Var.f57765o = true;
            if (c2Var.f57763m != null) {
                h();
                c2Var.f57763m.a(c2Var.f57754b, c2Var.f57756e.document);
                org.telegram.messenger.g0.h3(new dd0(25), 250L);
            } else if (c2Var.f57761k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = ri.c0(c2Var.f57761k, c2Var.f57755c).document;
                tL_stickers_replaceSticker.new_sticker = c2Var.f57756e;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final e2 f58150b;

                    {
                        this.f58150b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final e2 e2Var = this.f58150b;
                                final int i10 = i7;
                                final c2 c2Var2 = c2Var;
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
                                                final e2 e2Var2 = e2Var;
                                                final c2 c2Var3 = c2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i11 = i10;
                                                    z10 = true;
                                                    ri.d0(i11).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i11).E0(tL_messages_stickerSet.set.f28430id, true)) {
                                                        ri.d0(i11).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var = e2Var2.f57809e0;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i12 = r4;
                                                            c2 c2Var4 = c2Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            e2 e2Var3 = e2Var2;
                                                            switch (i12) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var4.f57757f.document;
                                                                    String str = c2Var4.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject3, document, str, bool);
                                                                    e2Var3.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject3, c2Var4.f57757f.document, c2Var4.f57762l, Boolean.TRUE);
                                                                    e2Var3.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var4.f57757f.document;
                                                                    String str2 = c2Var4.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject3, document2, str2, bool2);
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
                                                x10 x10Var = c2Var3.f57764n;
                                                if (x10Var != null) {
                                                    x10Var.a(Boolean.valueOf(z10));
                                                    c2Var3.f57764n = null;
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
                                                    ri.d0(i12).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i12).k2(null, tLObject3, 2, null, false, false);
                                                    hi.u0 u0Var2 = e2Var3.f57809e0;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var32 = e2Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var42.f57757f.document;
                                                                    String str = c2Var42.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var42.f57757f.document, c2Var42.f57762l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var42.f57757f.document;
                                                                    String str2 = c2Var42.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var2 = c2Var4.f57764n;
                                                if (x10Var2 != null) {
                                                    x10Var2.a(Boolean.valueOf(z11));
                                                    c2Var4.f57764n = null;
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
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28430id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var3 = e2Var4.f57809e0;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var32 = e2Var4;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var42.f57757f.document;
                                                                    String str = c2Var42.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var42.f57757f.document, c2Var42.f57762l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var42.f57757f.document;
                                                                    String str2 = c2Var42.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var3 = c2Var5.f57764n;
                                                if (x10Var3 != null) {
                                                    x10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57764n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final e2 e2Var2 = this.f58150b;
                                final int i11 = i7;
                                final c2 c2Var3 = c2Var;
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
                                                final e2 e2Var22 = e2Var2;
                                                final c2 c2Var32 = c2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28430id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var = e2Var22.f57809e0;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var32 = e2Var22;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var42.f57757f.document;
                                                                    String str = c2Var42.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var42.f57757f.document, c2Var42.f57762l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var42.f57757f.document;
                                                                    String str2 = c2Var42.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var = c2Var32.f57764n;
                                                if (x10Var != null) {
                                                    x10Var.a(Boolean.valueOf(z10));
                                                    c2Var32.f57764n = null;
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
                                                    ri.d0(i12).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i12).k2(null, tLObject3, 2, null, false, false);
                                                    hi.u0 u0Var2 = e2Var3.f57809e0;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var32 = e2Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var42.f57757f.document;
                                                                    String str = c2Var42.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var42.f57757f.document, c2Var42.f57762l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var42.f57757f.document;
                                                                    String str2 = c2Var42.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var2 = c2Var4.f57764n;
                                                if (x10Var2 != null) {
                                                    x10Var2.a(Boolean.valueOf(z11));
                                                    c2Var4.f57764n = null;
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
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28430id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var3 = e2Var4.f57809e0;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var32 = e2Var4;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var42.f57757f.document;
                                                                    String str = c2Var42.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var42.f57757f.document, c2Var42.f57762l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var42.f57757f.document;
                                                                    String str2 = c2Var42.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var3 = c2Var5.f57764n;
                                                if (x10Var3 != null) {
                                                    x10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57764n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final e2 e2Var3 = this.f58150b;
                                final int i12 = i7;
                                final c2 c2Var4 = c2Var;
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
                                                final e2 e2Var22 = e2Var3;
                                                final c2 c2Var32 = c2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28430id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var = e2Var22.f57809e0;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i122 = r4;
                                                            c2 c2Var42 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var32 = e2Var22;
                                                            switch (i122) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var42.f57757f.document;
                                                                    String str = c2Var42.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var42.f57757f.document, c2Var42.f57762l, Boolean.TRUE);
                                                                    e2Var32.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var42.f57757f.document;
                                                                    String str2 = c2Var42.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var = c2Var32.f57764n;
                                                if (x10Var != null) {
                                                    x10Var.a(Boolean.valueOf(z10));
                                                    c2Var32.f57764n = null;
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
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.u0 u0Var2 = e2Var32.f57809e0;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var2 = c2Var42.f57764n;
                                                if (x10Var2 != null) {
                                                    x10Var2.a(Boolean.valueOf(z11));
                                                    c2Var42.f57764n = null;
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
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28430id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var3 = e2Var4.f57809e0;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var3 = c2Var5.f57764n;
                                                if (x10Var3 != null) {
                                                    x10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57764n = null;
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
                tL_stickers_createStickerSet.stickers.add(c2Var.f57756e);
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final e2 f58150b;

                    {
                        this.f58150b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final e2 e2Var = this.f58150b;
                                final int i10 = i7;
                                final c2 c2Var2 = c2Var;
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
                                                final e2 e2Var22 = e2Var;
                                                final c2 c2Var32 = c2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28430id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var = e2Var22.f57809e0;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var = c2Var32.f57764n;
                                                if (x10Var != null) {
                                                    x10Var.a(Boolean.valueOf(z10));
                                                    c2Var32.f57764n = null;
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
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.u0 u0Var2 = e2Var32.f57809e0;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var2 = c2Var42.f57764n;
                                                if (x10Var2 != null) {
                                                    x10Var2.a(Boolean.valueOf(z11));
                                                    c2Var42.f57764n = null;
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
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28430id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var3 = e2Var4.f57809e0;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var3 = c2Var5.f57764n;
                                                if (x10Var3 != null) {
                                                    x10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57764n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final e2 e2Var2 = this.f58150b;
                                final int i11 = i7;
                                final c2 c2Var3 = c2Var;
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
                                                final e2 e2Var22 = e2Var2;
                                                final c2 c2Var32 = c2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28430id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var = e2Var22.f57809e0;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var = c2Var32.f57764n;
                                                if (x10Var != null) {
                                                    x10Var.a(Boolean.valueOf(z10));
                                                    c2Var32.f57764n = null;
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
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.u0 u0Var2 = e2Var32.f57809e0;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var2 = c2Var42.f57764n;
                                                if (x10Var2 != null) {
                                                    x10Var2.a(Boolean.valueOf(z11));
                                                    c2Var42.f57764n = null;
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
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28430id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var3 = e2Var4.f57809e0;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var3 = c2Var5.f57764n;
                                                if (x10Var3 != null) {
                                                    x10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57764n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final e2 e2Var3 = this.f58150b;
                                final int i12 = i7;
                                final c2 c2Var4 = c2Var;
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
                                                final e2 e2Var22 = e2Var3;
                                                final c2 c2Var32 = c2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28430id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var = e2Var22.f57809e0;
                                                    if (u0Var != null) {
                                                        u0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var = c2Var32.f57764n;
                                                if (x10Var != null) {
                                                    x10Var.a(Boolean.valueOf(z10));
                                                    c2Var32.f57764n = null;
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
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.u0 u0Var2 = e2Var32.f57809e0;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var2 = c2Var42.f57764n;
                                                if (x10Var2 != null) {
                                                    x10Var2.a(Boolean.valueOf(z11));
                                                    c2Var42.f57764n = null;
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
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28430id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var3 = e2Var4.f57809e0;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var3 = c2Var5.f57764n;
                                                if (x10Var3 != null) {
                                                    x10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.f57764n = null;
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
                ks.f(i7).m(ks.f25201u3, Boolean.FALSE);
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(c2Var, 20), 350L);
                x10 x10Var = c2Var.f57764n;
                if (x10Var != null) {
                    x10Var.a(Boolean.TRUE);
                }
            } else if (c2Var.f57759i != 0) {
                zy.C(i7).v0(c2Var.f57757f.document, null, c2Var.f57759i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                hi.u0 u0Var = this.f57809e0;
                if (u0Var != null) {
                    u0Var.setProgress(1.0f);
                }
                org.telegram.messenger.g0.h3(new jw0(this, i7, 14), 450L);
                x10 x10Var2 = c2Var.f57764n;
                if (x10Var2 != null) {
                    x10Var2.a(Boolean.TRUE);
                    c2Var.f57764n = null;
                }
            } else if (c2Var.f57760j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = ri.b0(c2Var.f57760j);
                tL_stickers_addStickerToSet.sticker = c2Var.f57756e;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final e2 f58150b;

                    {
                        this.f58150b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final e2 e2Var = this.f58150b;
                                final int i10 = i7;
                                final c2 c2Var2 = c2Var;
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
                                                final e2 e2Var22 = e2Var;
                                                final c2 c2Var32 = c2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i10;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28430id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var2 = e2Var22.f57809e0;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var3 = c2Var32.f57764n;
                                                if (x10Var3 != null) {
                                                    x10Var3.a(Boolean.valueOf(z10));
                                                    c2Var32.f57764n = null;
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
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.u0 u0Var22 = e2Var32.f57809e0;
                                                    if (u0Var22 != null) {
                                                        u0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var22 = c2Var42.f57764n;
                                                if (x10Var22 != null) {
                                                    x10Var22.a(Boolean.valueOf(z11));
                                                    c2Var42.f57764n = null;
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
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28430id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var3 = e2Var4.f57809e0;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var32 = c2Var5.f57764n;
                                                if (x10Var32 != null) {
                                                    x10Var32.a(Boolean.valueOf(z12));
                                                    c2Var5.f57764n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final e2 e2Var2 = this.f58150b;
                                final int i11 = i7;
                                final c2 c2Var3 = c2Var;
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
                                                final e2 e2Var22 = e2Var2;
                                                final c2 c2Var32 = c2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i11;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28430id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var2 = e2Var22.f57809e0;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var3 = c2Var32.f57764n;
                                                if (x10Var3 != null) {
                                                    x10Var3.a(Boolean.valueOf(z10));
                                                    c2Var32.f57764n = null;
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
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.u0 u0Var22 = e2Var32.f57809e0;
                                                    if (u0Var22 != null) {
                                                        u0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var22 = c2Var42.f57764n;
                                                if (x10Var22 != null) {
                                                    x10Var22.a(Boolean.valueOf(z11));
                                                    c2Var42.f57764n = null;
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
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28430id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var3 = e2Var4.f57809e0;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var32 = c2Var5.f57764n;
                                                if (x10Var32 != null) {
                                                    x10Var32.a(Boolean.valueOf(z12));
                                                    c2Var5.f57764n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final e2 e2Var3 = this.f58150b;
                                final int i12 = i7;
                                final c2 c2Var4 = c2Var;
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
                                                final e2 e2Var22 = e2Var3;
                                                final c2 c2Var32 = c2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i112 = i12;
                                                    z10 = true;
                                                    ri.d0(i112).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i112).E0(tL_messages_stickerSet.set.f28430id, true)) {
                                                        ri.d0(i112).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var2 = e2Var22.f57809e0;
                                                    if (u0Var2 != null) {
                                                        u0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var3 = c2Var32.f57764n;
                                                if (x10Var3 != null) {
                                                    x10Var3.a(Boolean.valueOf(z10));
                                                    c2Var32.f57764n = null;
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
                                                    ri.d0(i122).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i122).k2(null, tLObject3, 2, null, false, false);
                                                    hi.u0 u0Var22 = e2Var32.f57809e0;
                                                    if (u0Var22 != null) {
                                                        u0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var22 = c2Var42.f57764n;
                                                if (x10Var22 != null) {
                                                    x10Var22.a(Boolean.valueOf(z11));
                                                    c2Var42.f57764n = null;
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
                                                    ri.d0(i13).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i13).E0(tL_messages_stickerSet2.set.f28430id, true)) {
                                                        ri.d0(i13).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.u0 u0Var3 = e2Var4.f57809e0;
                                                    if (u0Var3 != null) {
                                                        u0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1222 = r4;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1222) {
                                                                case 0:
                                                                    ks f10 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document = c2Var422.f57757f.document;
                                                                    String str = c2Var422.f57762l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(217, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    ks.f(j10.f24770t0).m(217, Boolean.FALSE, tLObject32, c2Var422.f57757f.document, c2Var422.f57762l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    return;
                                                                default:
                                                                    ks f11 = ks.f(j10.f24770t0);
                                                                    TLRPC.Document document2 = c2Var422.f57757f.document;
                                                                    String str2 = c2Var422.f57762l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(217, bool2, tLObject32, document2, str2, bool2);
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
                                                x10 x10Var32 = c2Var5.f57764n;
                                                if (x10Var32 != null) {
                                                    x10Var32.a(Boolean.valueOf(z12));
                                                    c2Var5.f57764n = null;
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
                    b2Var.f57740l.reset();
                    Bitmap bitmap = b2Var.f57734e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        b2Var.f57734e = null;
                    }
                    Bitmap bitmap2 = b2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        b2Var.d = null;
                    }
                    Bitmap bitmap3 = b2Var.f57736g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        b2Var.f57736g = null;
                    }
                    Bitmap bitmap4 = b2Var.f57735f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        b2Var.f57735f = null;
                    }
                }
                i7++;
            }
            this.I = null;
        }
        this.E = false;
        this.f57828y = false;
        this.M = false;
        this.N.setAlpha(0.0f);
        this.N.setScaleX(0.3f);
        this.N.setScaleY(0.3f);
        c2 c2Var = this.f57802a0;
        if (c2Var != null) {
            if (!c2Var.f57765o) {
                c2Var.a();
            }
            this.f57802a0 = null;
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
        if (i7 == ks.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            c2 c2Var2 = this.f57802a0;
            if (c2Var2 != null && str.equalsIgnoreCase(c2Var2.f57754b)) {
                c2 c2Var3 = this.f57802a0;
                c2Var3.f57758g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = c2Var3.f57758g;
                if (c2Var3.f57769s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = c2Var3.f57755c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(j10.f24770t0).sendRequest(tL_messages_uploadMedia, new e31(9, this, c2Var3), 2);
            }
        } else if (i7 == ks.W1) {
            String str2 = (String) objArr[0];
            c2 c2Var4 = this.f57802a0;
            if (c2Var4 != null && str2.equalsIgnoreCase(c2Var4.f57754b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    c2 c2Var5 = this.f57802a0;
                    c2Var5.f57771u = Utilities.i(((float) longValue) / ((float) longValue2), 1.0f, c2Var5.f57771u);
                    hi.u0 u0Var = this.f57809e0;
                    if (u0Var != null) {
                        u0Var.setProgress(this.f57802a0.b());
                    }
                }
            }
        } else if (i7 == ks.V1) {
            String str3 = (String) objArr[0];
            c2 c2Var6 = this.f57802a0;
            if (c2Var6 != null && str3.equalsIgnoreCase(c2Var6.f57754b)) {
                h();
            }
        } else if (i7 == ks.f25082a2) {
            c2 c2Var7 = this.f57802a0;
            if (c2Var7 != null && objArr[0] == c2Var7.f57768r) {
                w7.G(j10.f24770t0).h0(false, 67108864, this.f57802a0.f57754b, true);
            }
        } else if (i7 == ks.f25089b2) {
            c2 c2Var8 = this.f57802a0;
            if (c2Var8 != null && objArr[0] == c2Var8.f57768r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                float floatValue = f10.floatValue();
                this.f57802a0.f57768r.f23993r0.Y = true;
                w7.G(this.f57801a).n(str4, false, Math.max(1L, longValue3), longValue4, f10);
                c2 c2Var9 = this.f57802a0;
                c2Var9.f57770t = Math.max(c2Var9.f57770t, floatValue);
                hi.u0 u0Var2 = this.f57809e0;
                if (u0Var2 != null) {
                    u0Var2.setProgress(this.f57802a0.b());
                }
            }
        } else if (i7 == ks.f25095c2 && (c2Var = this.f57802a0) != null && objArr[0] == c2Var.f57768r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.f57826w, this.f57808e);
        canvas.drawPath(this.f57827x, this.d);
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
            if (b2Var.f57735f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                b2 b2Var2 = this.F;
                if (b2Var2.f57733c != 0) {
                    Matrix matrix = new Matrix();
                    b2 b2Var3 = this.F;
                    matrix.postRotate(b2Var3.f57733c, b2Var3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
                    b2 b2Var4 = this.F;
                    if ((b2Var4.f57733c / 90) % 2 != 0) {
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
        this.f57803b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.N;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(lr.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        boolean z12;
        float d;
        float f10;
        Paint paint;
        c6 c6Var = this.f57805c;
        c6Var.f33890a = viewGroup;
        boolean z13 = this.f57815j0;
        if (z13 || c6Var.f33892c > 0.0f) {
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
            b2[] b2VarArr = this.I;
            if (b2VarArr != null) {
                for (b2 b2Var : b2VarArr) {
                    if (b2Var != null && b2Var == this.F) {
                        if (this.G > 0.0f) {
                            if (b2Var.f57748t.f57817l0 != null) {
                                canvas.save();
                                canvas.clipPath(b2Var.f57748t.f57817l0);
                                if (b2Var.f57748t.J != null) {
                                    if (z10) {
                                        paint = b2Var.f57745q;
                                    } else {
                                        paint = b2Var.f57744p;
                                    }
                                    paint.setAlpha((int) (d * 255.0f));
                                    paint.setStrokeWidth(org.telegram.messenger.g0.L(f10));
                                    canvas.drawPath(b2Var.f57740l, paint);
                                    if (b2Var.f57748t.f57817l0 != null && z10) {
                                        canvas.clipPath(b2Var.f57740l);
                                        paint.setStrokeWidth(org.telegram.messenger.g0.L(f10 * 2.0f));
                                        canvas.drawPath(b2Var.f57748t.f57817l0, paint);
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

    public mz0 getThanosEffect() {
        if (!mz0.c()) {
            return null;
        }
        if (this.T == null) {
            mz0 mz0Var = new mz0(getContext(), new t1(this, 1));
            this.T = mz0Var;
            addView(mz0Var, ma.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        hi.u0 u0Var = this.f57809e0;
        if (u0Var != null) {
            u0Var.a();
            this.f57809e0 = null;
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
                if ((b2Var.f57733c / 90) % 2 != 0) {
                    width = this.J.getHeight();
                    height = this.J.getWidth();
                } else {
                    width = this.J.getWidth();
                    height = this.J.getHeight();
                }
                RectF rectF = org.telegram.messenger.g0.P;
                RectF rectF2 = this.I[i7].f57737i;
                float f12 = width;
                float f13 = this.f57812g0;
                float f14 = height;
                float f15 = this.f57813h0;
                rectF.set((rectF2.left / f12) * f13, (rectF2.top / f14) * f15, (rectF2.right / f12) * f13, (rectF2.bottom / f14) * f15);
                this.f57811f0.mapRect(rectF);
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
                if (b2Var != null && (bitmap = b2Var.f57734e) != null) {
                    bitmap.recycle();
                    b2Var.f57734e = null;
                    Bitmap bitmap2 = b2Var.f57736g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        b2Var.f57736g = null;
                    }
                    c(b2Var, this.U, this.V);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i7, int i10, int i11, on0 on0Var) {
        int i12;
        int i13;
        vb.c cVar;
        if (i10 <= 0) {
            i12 = org.telegram.messenger.g0.f24118q.x;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            i13 = org.telegram.messenger.g0.f24118q.y;
        } else {
            i13 = i11;
        }
        this.U = i12;
        this.V = i13;
        if (!this.E && !this.f57828y && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.J = bitmap;
            this.K = i7;
            this.f57807d0 = null;
            d5 d5Var = new d5(this, i7, on0Var, 6);
            this.f57828y = true;
            ia.a aVar = new ia.a();
            aVar.f16181b = true;
            aVar.f16182c = true;
            zzd a10 = ne.a(new zb.d(aVar));
            if (n6.h(getContext()).f()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.J;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.f57784e = min;
                obj.d = min;
                obj.f57781a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f57781a).drawRect(0.0f, 0.0f, obj.d, obj.f57784e, org.telegram.ui.ActionBar.n6.Gm);
                obj.f57782b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f57783c = (bitmap2.getHeight() - obj.f57784e) / 2;
                arrayList.add(obj);
                d5Var.a(arrayList);
                return;
            }
            ub.a a11 = ub.a.a(i7, bitmap);
            a10.h(a11).addOnSuccessListener(new z1(d5Var, 0)).addOnFailureListener(new i5(this, bitmap, i7, on0Var, d5Var, 6));
            if (this.f57807d0 == null) {
                xb.a aVar2 = xb.a.f60444b;
                q6.m.i(aVar2, "options cannot be null");
                synchronized (vb.c.class) {
                    cVar = (vb.c) pb.g.c().a(vb.c.class);
                }
                ua.b bVar = (ua.b) cVar.f59362a.get(xb.a.class);
                q6.m.h(bVar);
                yb.b bVar2 = (yb.b) bVar.get();
                bVar2.getClass();
                ua uaVar = bVar2.f61124c;
                ?? obj2 = new Object();
                obj2.f343c = y7.TYPE_THIN;
                pb.n.f55540a.execute(new qa(uaVar, new xa((b8) obj2, 1), a8.ON_DEVICE_IMAGE_LABEL_CREATE, uaVar.b(), 0));
                new ImageLabelerImpl((pb.e) bVar2.f61122a.R0(aVar2), (Executor) bVar2.f61123b.f55518a.get(), new n6.c("vision.ica", 1L)).h(a11).addOnSuccessListener(new z1(this, 1)).addOnFailureListener(new r0.f1(27));
            }
            ArrayList arrayList2 = ri.d0(this.f57801a).f26625n;
            for (int i14 = 0; i14 < Math.min(arrayList2.size(), 9); i14++) {
                j6.g(((TLRPC.TL_availableReaction) arrayList2.get(i14)).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new lc((FrameLayout) getParent(), this.f57804b0).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f57817l0;
        if (path == null) {
            this.f57817l0 = new Path();
        } else {
            path.rewind();
        }
        if (this.m0 == null) {
            this.m0 = new Path();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.m0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f57817l0.addPath(this.m0, this.f57816k0);
        this.f57817l0.computeBounds(this.f57819n0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f57801a).c(this, ks.U1);
        ks.f(this.f57801a).c(this, ks.W1);
        ks.f(this.f57801a).c(this, ks.V1);
        ks.f(this.f57801a).c(this, ks.f25095c2);
        ks.f(this.f57801a).c(this, ks.f25082a2);
        ks.f(this.f57801a).c(this, ks.f25089b2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f57801a;
        if (i7 >= 0) {
            ks.f(i7).n(this, ks.U1);
            ks.f(this.f57801a).n(this, ks.W1);
            ks.f(this.f57801a).n(this, ks.V1);
            ks.f(this.f57801a).n(this, ks.f25095c2);
            ks.f(this.f57801a).n(this, ks.f25082a2);
            ks.f(this.f57801a).n(this, ks.f25089b2);
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
        Path path = this.f57825s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.f57823r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.f57826w;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f57827x;
        path4.rewind();
        rectF.inset(org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(-1.0f));
        path4.addRoundRect(rectF, f11, f11, direction);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.N.setTranslationY(-((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f57822q0;
            arrayList.clear();
            if (this.f57815j0) {
                Rect rect = this.f57824r0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final e20 e20Var, final String str2, final CharSequence charSequence, final boolean z10, final long j3, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final x10 x10Var, final q10 q10Var) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                boolean z11;
                c2 c2Var;
                e2 e2Var = e2.this;
                x10 x10Var2 = x10Var;
                if (x10Var2 != null && (c2Var = e2Var.f57802a0) != null && c2Var.f57765o) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    c2 c2Var2 = e2Var.f57802a0;
                    if (c2Var2 != null) {
                        c2Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f57766p = new ArrayList();
                    obj.f57767q = new ArrayList();
                    obj.f57770t = 0.0f;
                    obj.f57771u = 0.0f;
                    e2Var.f57802a0 = obj;
                }
                c2 c2Var3 = e2Var.f57802a0;
                c2Var3.f57755c = str2;
                String str4 = str;
                c2Var3.f57754b = str4;
                c2Var3.f57753a = str4;
                c2Var3.d = charSequence;
                c2Var3.h = z10;
                c2Var3.f57759i = j3;
                c2Var3.f57760j = stickerSet;
                c2Var3.f57761k = document;
                e20 e20Var2 = e20Var;
                c2Var3.f57769s = e20Var2;
                c2Var3.f57762l = str3;
                c2Var3.f57764n = x10Var2;
                c2Var3.f57763m = q10Var;
                ArrayList arrayList = c2Var3.f57767q;
                if (!TextUtils.isEmpty(str4)) {
                    c2Var3.f57766p.add(new File(c2Var3.f57754b));
                }
                if (!TextUtils.isEmpty(c2Var3.f57753a) && !TextUtils.equals(c2Var3.f57753a, c2Var3.f57754b)) {
                    arrayList.add(new File(c2Var3.f57753a));
                }
                if (!TextUtils.isEmpty(c2Var3.f57762l)) {
                    arrayList.add(new File(c2Var3.f57762l));
                }
                if (!z11) {
                    e2Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        c2 c2Var4 = e2Var.f57802a0;
                        c2Var4.f57756e = ri.c0(document3, c2Var4.f57755c);
                        e2Var.f57802a0.f57757f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = e2Var.f57802a0.f57757f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        e2Var.a();
                    } else if (e20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f28424id = 1;
                        c2 c2Var5 = e2Var.f57802a0;
                        String absolutePath = d7.w(j10.f24770t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        c2Var5.f57754b = absolutePath;
                        e2Var.f57802a0.f57768r = new fj(j10.f24770t0, tL_message, null, false, false);
                        e2Var.f57802a0.f57768r.f23993r0 = e20Var2;
                        MediaController.B().h0(e2Var.f57802a0.f57768r, false, false, false);
                    } else {
                        w7.G(e2Var.f57801a).h0(false, 67108864, str4, true);
                    }
                }
                if (x10Var2 == null) {
                    if (e2Var.f57809e0 == null) {
                        e2Var.f57809e0 = new hi.u0(e2Var.getContext(), gd.M0(2131746726, null));
                    }
                    e2Var.f57809e0.setOnCancelListener(new t1(e2Var, 0));
                    if (e2Var.f57809e0.getParent() == null) {
                        e2Var.addView(e2Var.f57809e0, ma.e(-1, -1, 17));
                    }
                    hi.u0 u0Var = e2Var.f57809e0;
                    u0Var.F = true;
                    u0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i7) {
        int i10 = this.f57801a;
        if (i10 != i7) {
            int i11 = ks.f25089b2;
            int i12 = ks.f25082a2;
            int i13 = ks.f25095c2;
            int i14 = ks.V1;
            int i15 = ks.W1;
            int i16 = ks.U1;
            if (i10 >= 0 && isAttachedToWindow()) {
                ks.f(this.f57801a).n(this, i16);
                ks.f(this.f57801a).n(this, i15);
                ks.f(this.f57801a).n(this, i14);
                ks.f(this.f57801a).n(this, i13);
                ks.f(this.f57801a).n(this, i12);
                ks.f(this.f57801a).n(this, i11);
            }
            this.f57801a = i7;
            if (i7 >= 0 && isAttachedToWindow()) {
                ks.f(this.f57801a).c(this, i16);
                ks.f(this.f57801a).c(this, i15);
                ks.f(this.f57801a).c(this, i14);
                ks.f(this.f57801a).c(this, i13);
                ks.f(this.f57801a).c(this, i12);
                ks.f(this.f57801a).c(this, i11);
            }
        }
    }

    public void setOutlineVisible(boolean z10) {
        float f10;
        if (this.f57815j0 != z10) {
            this.f57815j0 = z10;
            ViewPropertyAnimator animate = this.f57814i0.animate();
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
            alpha.translationX(f11).setInterpolator(lr.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f57822q0;
                arrayList.clear();
                if (this.f57815j0) {
                    Rect rect = this.f57824r0;
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
        this.f57806c0 = s1Var;
    }
}

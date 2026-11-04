package pi;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.f1;
public final class d {
    public static final ColorMatrixColorFilter v = new ColorMatrixColorFilter(new ColorMatrix());
    public int f53559b;
    public fh.a f53560c;
    public FrameLayout d;
    public boolean f53565j;
    public ColorMatrixColorFilter f53566k;
    public boolean f53567l;
    public int f53571p;
    public int f53572q;
    public int f53573r;
    public int f53574s;
    public int f53575t;
    public int f53576u;
    public final ArrayList f53558a = new ArrayList();
    public final RenderNode f53561e = w.m();
    public final c f53562f = new c(this, 1);
    public final c f53563g = new c(this, 2);
    public final c h = new c(this, 3);
    public final c f53564i = new c(this, 4);
    public int f53568m = 1;
    public int f53569n = 1;
    public int f53570o = 1;

    public static void a(d dVar, Canvas canvas, int i3, float f10, float f11, float f12, float f13) {
        RectF rectF;
        int i10;
        for (int i11 = 0; i11 < dVar.f53559b; i11++) {
            b bVar = (b) dVar.f53558a.get(i11);
            if (bVar.f53535a.intersects(f10, f11, f12, f13)) {
                if (f1.d(i3)) {
                    rectF = bVar.d;
                } else {
                    rectF = bVar.f53537c;
                }
                if (f1.d(i3)) {
                    i10 = bVar.f53548p;
                } else {
                    i10 = bVar.f53547o;
                }
                RenderNode a10 = bVar.a(i3);
                canvas.save();
                canvas.clipRect(bVar.f53535a);
                canvas.translate(rectF.left, rectF.top);
                float f14 = i10;
                canvas.scale(f14, f14);
                canvas.drawRenderNode(a10);
                canvas.restore();
            }
        }
    }

    public static void b(d dVar, int i3, Canvas canvas, RectF rectF, int i10, float f10, float f11) {
        RectF rectF2;
        int i11;
        for (int i12 = 0; i12 < dVar.f53559b; i12++) {
            b bVar = (b) dVar.f53558a.get(i12);
            if (RectF.intersects(bVar.f53535a, rectF)) {
                if (f1.d(i3)) {
                    rectF2 = bVar.d;
                } else {
                    rectF2 = bVar.f53537c;
                }
                if (f1.d(i3)) {
                    i11 = bVar.f53548p;
                } else {
                    i11 = bVar.f53547o;
                }
                canvas.save();
                float f12 = i10 * 2;
                RectF rectF3 = bVar.f53535a;
                float f13 = i10;
                canvas.clipRect(((rectF3.left - f12) - f10) / f13, ((rectF3.top - f12) - f11) / f13, ((rectF3.right + f12) - f10) / f13, ((rectF3.bottom + f12) - f11) / f13);
                canvas.translate((rectF2.left - f10) / f13, (rectF2.top - f11) / f13);
                if (i11 != i10) {
                    float f14 = i11 / f13;
                    canvas.scale(f14, f14);
                }
                canvas.drawRenderNode(bVar.a(i3));
                canvas.restore();
            }
        }
    }

    public static int c(int i3, int i10) {
        int i11 = i3 % i10;
        if (i11 > i10 / 2) {
            return i11 - i10;
        }
        if (i11 < (-i10) / 2) {
            return i11 + i10;
        }
        return i11;
    }

    public final c d(int i3) {
        int c2 = o1.g.c(i3);
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 != 2) {
                    if (c2 == 3) {
                        this.f53565j = true;
                        return this.f53564i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(f1.F(i3)));
                }
                return this.h;
            }
            return this.f53563g;
        }
        return this.f53562f;
    }

    public final void e() {
        int i3;
        int ceil;
        int ceil2;
        b bVar;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10 = 0;
        while (true) {
            int i11 = this.f53559b;
            ArrayList arrayList = this.f53558a;
            if (i10 < i11) {
                b bVar2 = (b) arrayList.get(i10);
                fh.a aVar = this.f53560c;
                boolean z10 = this.f53565j;
                int width = this.d.getWidth();
                int height = this.d.getHeight();
                RectF rectF = bVar2.f53537c;
                RectF rectF2 = bVar2.d;
                float f16 = bVar2.f53551s;
                int i12 = bVar2.f53547o;
                if (f16 <= 0.0f) {
                    i3 = i10;
                    ceil = 0;
                } else {
                    i3 = i10;
                    ceil = ((int) Math.ceil(com.google.android.recaptcha.internal.a.A(f16, 0.57735f, 0.5f, 3.0f))) * i12;
                }
                float f17 = bVar2.f53552t;
                int i13 = bVar2.f53548p;
                if (f17 <= 0.0f) {
                    ceil2 = 0;
                } else {
                    ceil2 = ((int) Math.ceil(com.google.android.recaptcha.internal.a.A(f17, 0.57735f, 0.5f, 3.0f))) * i13;
                }
                RectF rectF3 = bVar2.f53550r;
                rectF3.set(bVar2.f53535a);
                float f18 = -((bVar2.f53549q / 2) + ceil2 + ceil + 1);
                rectF3.inset(f18, f18);
                Rect rect = bVar2.f53536b;
                int i14 = bVar2.f53549q;
                if (i14 > 0) {
                    float f19 = i14;
                    rect.left = ((int) Math.floor(rectF3.left / f19)) * i14;
                    rect.top = ((int) Math.floor(rectF3.top / f19)) * i14;
                    rect.right = ((int) Math.ceil(rectF3.right / f19)) * i14;
                    rect.bottom = ((int) Math.ceil(rectF3.bottom / f19)) * i14;
                    rectF.set(rect);
                    rectF.offset(bVar2.f53553u, bVar2.v);
                    rectF2.set(rect);
                    rectF2.offset(bVar2.f53554w, bVar2.f53555x);
                    int i15 = bVar2.f53548p;
                    float f20 = rectF2.left;
                    if (f20 < 0.0f) {
                        bVar = bVar2;
                        rectF2.left = (((float) Math.ceil((-f20) / f15)) * i15) + f20;
                    } else {
                        bVar = bVar2;
                    }
                    float f21 = rectF2.top;
                    if (f21 < 0.0f) {
                        rectF2.top = (((float) Math.ceil((-f21) / f14)) * i15) + f21;
                    }
                    if (width > 0) {
                        float f22 = rectF2.right;
                        if (f22 > width) {
                            rectF2.right = f22 - (((float) Math.ceil((f22 - f12) / f13)) * i15);
                        }
                    }
                    if (height > 0) {
                        float f23 = rectF2.bottom;
                        if (f23 > height) {
                            rectF2.bottom = f23 - (((float) Math.ceil((f23 - f10) / f11)) * i15);
                        }
                    }
                    bVar.f53543k = rect.width() / bVar.f53547o;
                    bVar.f53544l = rect.height() / bVar.f53547o;
                    bVar.f53545m = Math.max(1, Math.round(rectF2.width() / bVar.f53548p));
                    bVar.f53546n = Math.max(1, Math.round(rectF2.height() / bVar.f53548p));
                    bVar.f53538e.setPosition(0, 0, bVar.f53543k, bVar.f53544l);
                    RecordingCanvas beginRecording = bVar.f53538e.beginRecording();
                    beginRecording.save();
                    float f24 = 1.0f / bVar.f53547o;
                    beginRecording.scale(f24, f24, 0.0f, 0.0f);
                    beginRecording.translate(-rectF.left, -rectF.top);
                    aVar.d(beginRecording, rectF);
                    beginRecording.restore();
                    bVar.f53538e.endRecording();
                    bVar.f53539f.setPosition(0, 0, bVar.f53543k, bVar.f53544l);
                    bVar.f53539f.beginRecording().drawRenderNode(bVar.f53538e);
                    bVar.f53539f.endRecording();
                    bVar.f53540g.setPosition(0, 0, bVar.f53545m, bVar.f53546n);
                    RecordingCanvas beginRecording2 = bVar.f53540g.beginRecording();
                    float f25 = rectF.left - rectF2.left;
                    float f26 = bVar.f53548p;
                    beginRecording2.translate(f25 / f26, (rectF.top - rectF2.top) / f26);
                    int i16 = bVar.f53547o;
                    int i17 = bVar.f53548p;
                    if (i16 != i17) {
                        float f27 = i16 / i17;
                        beginRecording2.scale(f27, f27);
                    }
                    beginRecording2.drawRenderNode(bVar.f53539f);
                    bVar.f53540g.endRecording();
                    if (z10) {
                        bVar.h.setPosition(0, 0, bVar.f53543k, bVar.f53544l);
                        bVar.h.beginRecording().drawRenderNode(bVar.f53538e);
                        bVar.h.endRecording();
                        bVar.f53541i.setPosition(0, 0, bVar.f53545m, bVar.f53546n);
                        RecordingCanvas beginRecording3 = bVar.f53541i.beginRecording();
                        float f28 = rectF.left - rectF2.left;
                        float f29 = bVar.f53548p;
                        beginRecording3.translate(f28 / f29, (rectF.top - rectF2.top) / f29);
                        int i18 = bVar.f53547o;
                        int i19 = bVar.f53548p;
                        if (i18 != i19) {
                            float f30 = i18 / i19;
                            beginRecording3.scale(f30, f30);
                        }
                        beginRecording3.drawRenderNode(bVar.h);
                        bVar.f53541i.endRecording();
                    }
                    i10 = i3 + 1;
                } else {
                    throw new IllegalArgumentException("n must be positive");
                }
            } else {
                this.f53561e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording4 = this.f53561e.beginRecording();
                for (int i20 = 0; i20 < this.f53559b; i20++) {
                    b bVar3 = (b) arrayList.get(i20);
                    beginRecording4.save();
                    RectF rectF4 = bVar3.f53535a;
                    RectF rectF5 = bVar3.f53537c;
                    beginRecording4.clipRect(rectF4);
                    beginRecording4.translate(rectF5.left, rectF5.top);
                    float f31 = bVar3.f53547o;
                    beginRecording4.scale(f31, f31);
                    beginRecording4.drawRenderNode(bVar3.f53538e);
                    beginRecording4.restore();
                    beginRecording4.drawRect(bVar3.f53535a, k6.Gm);
                    beginRecording4.drawRect(rectF5, k6.Fm);
                }
                this.f53561e.endRecording();
                return;
            }
        }
    }

    public final void f() {
        this.f53571p = -c(this.f53575t, this.f53568m);
        this.f53572q = -c(this.f53576u, this.f53568m);
        this.f53573r = -c(this.f53575t, this.f53569n);
        this.f53574s = -c(this.f53576u, this.f53569n);
        for (int i3 = 0; i3 < this.f53559b; i3++) {
            b bVar = (b) this.f53558a.get(i3);
            int i10 = this.f53571p;
            int i11 = this.f53572q;
            int i12 = this.f53573r;
            int i13 = this.f53574s;
            bVar.f53553u = i10;
            bVar.v = i11;
            bVar.f53554w = i12;
            bVar.f53555x = i13;
        }
    }
}

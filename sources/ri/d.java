package ri;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.n6;
public final class d {
    public static final ColorMatrixColorFilter v = new ColorMatrixColorFilter(new ColorMatrix());
    public int f56651b;
    public eh.a f56652c;
    public FrameLayout d;
    public boolean f56657j;
    public ColorMatrixColorFilter f56658k;
    public boolean f56659l;
    public int f56663p;
    public int f56664q;
    public int f56665r;
    public int f56666s;
    public int f56667t;
    public int f56668u;
    public final ArrayList f56650a = new ArrayList();
    public final RenderNode f56653e = w.m();
    public final c f56654f = new c(this, 1);
    public final c f56655g = new c(this, 2);
    public final c h = new c(this, 3);
    public final c f56656i = new c(this, 4);
    public int f56660m = 1;
    public int f56661n = 1;
    public int f56662o = 1;

    public static void a(d dVar, Canvas canvas, int i7, float f10, float f11, float f12, float f13) {
        RectF rectF;
        int i10;
        for (int i11 = 0; i11 < dVar.f56651b; i11++) {
            b bVar = (b) dVar.f56650a.get(i11);
            if (bVar.f56627a.intersects(f10, f11, f12, f13)) {
                if (p5.c.a(i7)) {
                    rectF = bVar.d;
                } else {
                    rectF = bVar.f56629c;
                }
                if (p5.c.a(i7)) {
                    i10 = bVar.f56640p;
                } else {
                    i10 = bVar.f56639o;
                }
                RenderNode a10 = bVar.a(i7);
                canvas.save();
                canvas.clipRect(bVar.f56627a);
                canvas.translate(rectF.left, rectF.top);
                float f14 = i10;
                canvas.scale(f14, f14);
                canvas.drawRenderNode(a10);
                canvas.restore();
            }
        }
    }

    public static void b(d dVar, int i7, Canvas canvas, RectF rectF, int i10, float f10, float f11) {
        RectF rectF2;
        int i11;
        for (int i12 = 0; i12 < dVar.f56651b; i12++) {
            b bVar = (b) dVar.f56650a.get(i12);
            if (RectF.intersects(bVar.f56627a, rectF)) {
                if (p5.c.a(i7)) {
                    rectF2 = bVar.d;
                } else {
                    rectF2 = bVar.f56629c;
                }
                if (p5.c.a(i7)) {
                    i11 = bVar.f56640p;
                } else {
                    i11 = bVar.f56639o;
                }
                canvas.save();
                float f12 = i10 * 2;
                RectF rectF3 = bVar.f56627a;
                float f13 = i10;
                canvas.clipRect(((rectF3.left - f12) - f10) / f13, ((rectF3.top - f12) - f11) / f13, ((rectF3.right + f12) - f10) / f13, ((rectF3.bottom + f12) - f11) / f13);
                canvas.translate((rectF2.left - f10) / f13, (rectF2.top - f11) / f13);
                if (i11 != i10) {
                    float f14 = i11 / f13;
                    canvas.scale(f14, f14);
                }
                canvas.drawRenderNode(bVar.a(i7));
                canvas.restore();
            }
        }
    }

    public static int c(int i7, int i10) {
        int i11 = i7 % i10;
        if (i11 > i10 / 2) {
            return i11 - i10;
        }
        if (i11 < (-i10) / 2) {
            return i11 + i10;
        }
        return i11;
    }

    public final c d(int i7) {
        int c10 = p1.g.c(i7);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        this.f56657j = true;
                        return this.f56656i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(p5.c.x(i7)));
                }
                return this.h;
            }
            return this.f56655g;
        }
        return this.f56654f;
    }

    public final void e() {
        int i7;
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
            int i11 = this.f56651b;
            ArrayList arrayList = this.f56650a;
            if (i10 < i11) {
                b bVar2 = (b) arrayList.get(i10);
                eh.a aVar = this.f56652c;
                boolean z10 = this.f56657j;
                int width = this.d.getWidth();
                int height = this.d.getHeight();
                RectF rectF = bVar2.f56629c;
                RectF rectF2 = bVar2.d;
                float f16 = bVar2.f56643s;
                int i12 = bVar2.f56639o;
                if (f16 <= 0.0f) {
                    i7 = i10;
                    ceil = 0;
                } else {
                    i7 = i10;
                    ceil = ((int) Math.ceil(e2.B(f16, 0.57735f, 0.5f, 3.0f))) * i12;
                }
                float f17 = bVar2.f56644t;
                int i13 = bVar2.f56640p;
                if (f17 <= 0.0f) {
                    ceil2 = 0;
                } else {
                    ceil2 = ((int) Math.ceil(e2.B(f17, 0.57735f, 0.5f, 3.0f))) * i13;
                }
                RectF rectF3 = bVar2.f56642r;
                rectF3.set(bVar2.f56627a);
                float f18 = -((bVar2.f56641q / 2) + ceil2 + ceil + 1);
                rectF3.inset(f18, f18);
                Rect rect = bVar2.f56628b;
                int i14 = bVar2.f56641q;
                if (i14 > 0) {
                    float f19 = i14;
                    rect.left = ((int) Math.floor(rectF3.left / f19)) * i14;
                    rect.top = ((int) Math.floor(rectF3.top / f19)) * i14;
                    rect.right = ((int) Math.ceil(rectF3.right / f19)) * i14;
                    rect.bottom = ((int) Math.ceil(rectF3.bottom / f19)) * i14;
                    rectF.set(rect);
                    rectF.offset(bVar2.f56645u, bVar2.v);
                    rectF2.set(rect);
                    rectF2.offset(bVar2.f56646w, bVar2.f56647x);
                    int i15 = bVar2.f56640p;
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
                    bVar.f56635k = rect.width() / bVar.f56639o;
                    bVar.f56636l = rect.height() / bVar.f56639o;
                    bVar.f56637m = Math.max(1, Math.round(rectF2.width() / bVar.f56640p));
                    bVar.f56638n = Math.max(1, Math.round(rectF2.height() / bVar.f56640p));
                    bVar.f56630e.setPosition(0, 0, bVar.f56635k, bVar.f56636l);
                    RecordingCanvas beginRecording = bVar.f56630e.beginRecording();
                    beginRecording.save();
                    float f24 = 1.0f / bVar.f56639o;
                    beginRecording.scale(f24, f24, 0.0f, 0.0f);
                    beginRecording.translate(-rectF.left, -rectF.top);
                    aVar.d(beginRecording, rectF);
                    beginRecording.restore();
                    bVar.f56630e.endRecording();
                    bVar.f56631f.setPosition(0, 0, bVar.f56635k, bVar.f56636l);
                    bVar.f56631f.beginRecording().drawRenderNode(bVar.f56630e);
                    bVar.f56631f.endRecording();
                    bVar.f56632g.setPosition(0, 0, bVar.f56637m, bVar.f56638n);
                    RecordingCanvas beginRecording2 = bVar.f56632g.beginRecording();
                    float f25 = rectF.left - rectF2.left;
                    float f26 = bVar.f56640p;
                    beginRecording2.translate(f25 / f26, (rectF.top - rectF2.top) / f26);
                    int i16 = bVar.f56639o;
                    int i17 = bVar.f56640p;
                    if (i16 != i17) {
                        float f27 = i16 / i17;
                        beginRecording2.scale(f27, f27);
                    }
                    beginRecording2.drawRenderNode(bVar.f56631f);
                    bVar.f56632g.endRecording();
                    if (z10) {
                        bVar.h.setPosition(0, 0, bVar.f56635k, bVar.f56636l);
                        bVar.h.beginRecording().drawRenderNode(bVar.f56630e);
                        bVar.h.endRecording();
                        bVar.f56633i.setPosition(0, 0, bVar.f56637m, bVar.f56638n);
                        RecordingCanvas beginRecording3 = bVar.f56633i.beginRecording();
                        float f28 = rectF.left - rectF2.left;
                        float f29 = bVar.f56640p;
                        beginRecording3.translate(f28 / f29, (rectF.top - rectF2.top) / f29);
                        int i18 = bVar.f56639o;
                        int i19 = bVar.f56640p;
                        if (i18 != i19) {
                            float f30 = i18 / i19;
                            beginRecording3.scale(f30, f30);
                        }
                        beginRecording3.drawRenderNode(bVar.h);
                        bVar.f56633i.endRecording();
                    }
                    i10 = i7 + 1;
                } else {
                    throw new IllegalArgumentException("n must be positive");
                }
            } else {
                this.f56653e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording4 = this.f56653e.beginRecording();
                for (int i20 = 0; i20 < this.f56651b; i20++) {
                    b bVar3 = (b) arrayList.get(i20);
                    beginRecording4.save();
                    RectF rectF4 = bVar3.f56627a;
                    RectF rectF5 = bVar3.f56629c;
                    beginRecording4.clipRect(rectF4);
                    beginRecording4.translate(rectF5.left, rectF5.top);
                    float f31 = bVar3.f56639o;
                    beginRecording4.scale(f31, f31);
                    beginRecording4.drawRenderNode(bVar3.f56630e);
                    beginRecording4.restore();
                    beginRecording4.drawRect(bVar3.f56627a, n6.Jm);
                    beginRecording4.drawRect(rectF5, n6.Im);
                }
                this.f56653e.endRecording();
                return;
            }
        }
    }

    public final void f() {
        this.f56663p = -c(this.f56667t, this.f56660m);
        this.f56664q = -c(this.f56668u, this.f56660m);
        this.f56665r = -c(this.f56667t, this.f56661n);
        this.f56666s = -c(this.f56668u, this.f56661n);
        for (int i7 = 0; i7 < this.f56651b; i7++) {
            b bVar = (b) this.f56650a.get(i7);
            int i10 = this.f56663p;
            int i11 = this.f56664q;
            int i12 = this.f56665r;
            int i13 = this.f56666s;
            bVar.f56645u = i10;
            bVar.v = i11;
            bVar.f56646w = i12;
            bVar.f56647x = i13;
        }
    }
}

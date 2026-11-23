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
import org.telegram.ui.ActionBar.m6;
public final class d {
    public static final ColorMatrixColorFilter v = new ColorMatrixColorFilter(new ColorMatrix());
    public int f56661b;
    public eh.a f56662c;
    public FrameLayout d;
    public boolean f56667j;
    public ColorMatrixColorFilter f56668k;
    public boolean f56669l;
    public int f56673p;
    public int f56674q;
    public int f56675r;
    public int f56676s;
    public int f56677t;
    public int f56678u;
    public final ArrayList f56660a = new ArrayList();
    public final RenderNode f56663e = w.m();
    public final c f56664f = new c(this, 1);
    public final c f56665g = new c(this, 2);
    public final c h = new c(this, 3);
    public final c f56666i = new c(this, 4);
    public int f56670m = 1;
    public int f56671n = 1;
    public int f56672o = 1;

    public static void a(d dVar, Canvas canvas, int i7, float f10, float f11, float f12, float f13) {
        RectF rectF;
        int i10;
        for (int i11 = 0; i11 < dVar.f56661b; i11++) {
            b bVar = (b) dVar.f56660a.get(i11);
            if (bVar.f56637a.intersects(f10, f11, f12, f13)) {
                if (p5.c.a(i7)) {
                    rectF = bVar.d;
                } else {
                    rectF = bVar.f56639c;
                }
                if (p5.c.a(i7)) {
                    i10 = bVar.f56650p;
                } else {
                    i10 = bVar.f56649o;
                }
                RenderNode a10 = bVar.a(i7);
                canvas.save();
                canvas.clipRect(bVar.f56637a);
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
        for (int i12 = 0; i12 < dVar.f56661b; i12++) {
            b bVar = (b) dVar.f56660a.get(i12);
            if (RectF.intersects(bVar.f56637a, rectF)) {
                if (p5.c.a(i7)) {
                    rectF2 = bVar.d;
                } else {
                    rectF2 = bVar.f56639c;
                }
                if (p5.c.a(i7)) {
                    i11 = bVar.f56650p;
                } else {
                    i11 = bVar.f56649o;
                }
                canvas.save();
                float f12 = i10 * 2;
                RectF rectF3 = bVar.f56637a;
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
                        this.f56667j = true;
                        return this.f56666i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(p5.c.x(i7)));
                }
                return this.h;
            }
            return this.f56665g;
        }
        return this.f56664f;
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
            int i11 = this.f56661b;
            ArrayList arrayList = this.f56660a;
            if (i10 < i11) {
                b bVar2 = (b) arrayList.get(i10);
                eh.a aVar = this.f56662c;
                boolean z10 = this.f56667j;
                int width = this.d.getWidth();
                int height = this.d.getHeight();
                RectF rectF = bVar2.f56639c;
                RectF rectF2 = bVar2.d;
                float f16 = bVar2.f56653s;
                int i12 = bVar2.f56649o;
                if (f16 <= 0.0f) {
                    i7 = i10;
                    ceil = 0;
                } else {
                    i7 = i10;
                    ceil = ((int) Math.ceil(e2.B(f16, 0.57735f, 0.5f, 3.0f))) * i12;
                }
                float f17 = bVar2.f56654t;
                int i13 = bVar2.f56650p;
                if (f17 <= 0.0f) {
                    ceil2 = 0;
                } else {
                    ceil2 = ((int) Math.ceil(e2.B(f17, 0.57735f, 0.5f, 3.0f))) * i13;
                }
                RectF rectF3 = bVar2.f56652r;
                rectF3.set(bVar2.f56637a);
                float f18 = -((bVar2.f56651q / 2) + ceil2 + ceil + 1);
                rectF3.inset(f18, f18);
                Rect rect = bVar2.f56638b;
                int i14 = bVar2.f56651q;
                if (i14 > 0) {
                    float f19 = i14;
                    rect.left = ((int) Math.floor(rectF3.left / f19)) * i14;
                    rect.top = ((int) Math.floor(rectF3.top / f19)) * i14;
                    rect.right = ((int) Math.ceil(rectF3.right / f19)) * i14;
                    rect.bottom = ((int) Math.ceil(rectF3.bottom / f19)) * i14;
                    rectF.set(rect);
                    rectF.offset(bVar2.f56655u, bVar2.v);
                    rectF2.set(rect);
                    rectF2.offset(bVar2.f56656w, bVar2.f56657x);
                    int i15 = bVar2.f56650p;
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
                    bVar.f56645k = rect.width() / bVar.f56649o;
                    bVar.f56646l = rect.height() / bVar.f56649o;
                    bVar.f56647m = Math.max(1, Math.round(rectF2.width() / bVar.f56650p));
                    bVar.f56648n = Math.max(1, Math.round(rectF2.height() / bVar.f56650p));
                    bVar.f56640e.setPosition(0, 0, bVar.f56645k, bVar.f56646l);
                    RecordingCanvas beginRecording = bVar.f56640e.beginRecording();
                    beginRecording.save();
                    float f24 = 1.0f / bVar.f56649o;
                    beginRecording.scale(f24, f24, 0.0f, 0.0f);
                    beginRecording.translate(-rectF.left, -rectF.top);
                    aVar.d(beginRecording, rectF);
                    beginRecording.restore();
                    bVar.f56640e.endRecording();
                    bVar.f56641f.setPosition(0, 0, bVar.f56645k, bVar.f56646l);
                    bVar.f56641f.beginRecording().drawRenderNode(bVar.f56640e);
                    bVar.f56641f.endRecording();
                    bVar.f56642g.setPosition(0, 0, bVar.f56647m, bVar.f56648n);
                    RecordingCanvas beginRecording2 = bVar.f56642g.beginRecording();
                    float f25 = rectF.left - rectF2.left;
                    float f26 = bVar.f56650p;
                    beginRecording2.translate(f25 / f26, (rectF.top - rectF2.top) / f26);
                    int i16 = bVar.f56649o;
                    int i17 = bVar.f56650p;
                    if (i16 != i17) {
                        float f27 = i16 / i17;
                        beginRecording2.scale(f27, f27);
                    }
                    beginRecording2.drawRenderNode(bVar.f56641f);
                    bVar.f56642g.endRecording();
                    if (z10) {
                        bVar.h.setPosition(0, 0, bVar.f56645k, bVar.f56646l);
                        bVar.h.beginRecording().drawRenderNode(bVar.f56640e);
                        bVar.h.endRecording();
                        bVar.f56643i.setPosition(0, 0, bVar.f56647m, bVar.f56648n);
                        RecordingCanvas beginRecording3 = bVar.f56643i.beginRecording();
                        float f28 = rectF.left - rectF2.left;
                        float f29 = bVar.f56650p;
                        beginRecording3.translate(f28 / f29, (rectF.top - rectF2.top) / f29);
                        int i18 = bVar.f56649o;
                        int i19 = bVar.f56650p;
                        if (i18 != i19) {
                            float f30 = i18 / i19;
                            beginRecording3.scale(f30, f30);
                        }
                        beginRecording3.drawRenderNode(bVar.h);
                        bVar.f56643i.endRecording();
                    }
                    i10 = i7 + 1;
                } else {
                    throw new IllegalArgumentException("n must be positive");
                }
            } else {
                this.f56663e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording4 = this.f56663e.beginRecording();
                for (int i20 = 0; i20 < this.f56661b; i20++) {
                    b bVar3 = (b) arrayList.get(i20);
                    beginRecording4.save();
                    RectF rectF4 = bVar3.f56637a;
                    RectF rectF5 = bVar3.f56639c;
                    beginRecording4.clipRect(rectF4);
                    beginRecording4.translate(rectF5.left, rectF5.top);
                    float f31 = bVar3.f56649o;
                    beginRecording4.scale(f31, f31);
                    beginRecording4.drawRenderNode(bVar3.f56640e);
                    beginRecording4.restore();
                    beginRecording4.drawRect(bVar3.f56637a, m6.Jm);
                    beginRecording4.drawRect(rectF5, m6.Im);
                }
                this.f56663e.endRecording();
                return;
            }
        }
    }

    public final void f() {
        this.f56673p = -c(this.f56677t, this.f56670m);
        this.f56674q = -c(this.f56678u, this.f56670m);
        this.f56675r = -c(this.f56677t, this.f56671n);
        this.f56676s = -c(this.f56678u, this.f56671n);
        for (int i7 = 0; i7 < this.f56661b; i7++) {
            b bVar = (b) this.f56660a.get(i7);
            int i10 = this.f56673p;
            int i11 = this.f56674q;
            int i12 = this.f56675r;
            int i13 = this.f56676s;
            bVar.f56655u = i10;
            bVar.v = i11;
            bVar.f56656w = i12;
            bVar.f56657x = i13;
        }
    }
}

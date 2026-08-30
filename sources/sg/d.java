package sg;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.y;
import java.util.Iterator;
import java.util.List;
import ng.g;
import ng.h;
public final class d implements a {
    public final a f44310a;
    public h f44312c;
    public ng.e d;
    public int e;
    public a f44313f;
    public boolean h;
    public boolean f44314n;
    public RecordingCanvas f44315r;
    public Runnable v;
    public final be.b f44316s = new be.b(true);
    public final RenderNode f44311b = y.c();

    public d(a aVar) {
        this.f44310a = aVar;
    }

    @Override
    public final void X(Canvas canvas, float f10, float f11, float f12, float f13) {
        ng.e eVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f44310a;
            if (aVar != null) {
                aVar.X(canvas, f10, f11, f12, f13);
            }
        } else if (!this.f44314n) {
            a aVar2 = this.f44313f;
            if (aVar2 != null) {
                aVar2.X(canvas, f10, f11, f12, f13);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f10, f11, f12, f13);
            }
            if (Build.VERSION.SDK_INT >= 31 && (eVar = this.d) != null) {
                eVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f44311b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f44314n) {
            this.f44314n = true;
            this.f44311b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f44311b.beginRecording(i10, i11);
            this.f44315r = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void b() {
        if (this.f44314n) {
            this.f44311b.endRecording();
            this.f44314n = false;
            this.f44315r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int c(List list, int i10, int i11) {
        RectF rectF;
        Iterator it = this.f44316s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            pg.c cVar = (pg.c) it.next();
            boolean v = cVar.v();
            pg.a aVar = cVar.h;
            if (v && cVar.f41221j > 0 && !aVar.f41212m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(aVar.f41212m);
                rectF.offset(cVar.f41215a, cVar.f41216b);
                float f10 = -i11;
                rectF.inset(f10, f10);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void d() {
        Iterator it = this.f44316s.iterator();
        while (it.hasNext()) {
            ((pg.c) it.next()).M = true;
        }
    }

    public final boolean e(int i10, int i11) {
        if (this.f44311b.hasDisplayList() && this.f44311b.getWidth() == i10 && this.f44311b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final void f() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void g(float f10) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f44311b;
        if (f10 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void h(float f10, RenderEffect renderEffect) {
        this.f44311b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void i(int i10, int i11) {
        this.f44311b.setPosition(0, 0, i10, i11);
    }

    public final void j(g gVar) {
        if (this.f44312c == null) {
            this.f44312c = new h(this.f44311b, gVar);
        }
    }

    @Override
    public final pg.b k() {
        pg.c cVar = new pg.c(this);
        this.f44316s.add(cVar);
        return cVar;
    }

    public final void l() {
        this.f44312c.a();
    }
}

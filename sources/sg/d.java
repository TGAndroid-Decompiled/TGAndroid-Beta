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
    public final a f44375a;
    public h f44377c;
    public ng.e d;
    public int e;
    public a f44378f;
    public boolean h;
    public boolean f44379n;
    public RecordingCanvas f44380r;
    public Runnable v;
    public final be.b f44381s = new be.b(true);
    public final RenderNode f44376b = y.c();

    public d(a aVar) {
        this.f44375a = aVar;
    }

    @Override
    public final void H(Canvas canvas, float f10, float f11, float f12, float f13) {
        ng.e eVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f44375a;
            if (aVar != null) {
                aVar.H(canvas, f10, f11, f12, f13);
            }
        } else if (!this.f44379n) {
            a aVar2 = this.f44378f;
            if (aVar2 != null) {
                aVar2.H(canvas, f10, f11, f12, f13);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f10, f11, f12, f13);
            }
            if (Build.VERSION.SDK_INT >= 31 && (eVar = this.d) != null) {
                eVar.c(canvas, this.e);
            } else {
                canvas.drawRenderNode(this.f44376b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f44379n) {
            this.f44379n = true;
            this.f44376b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f44376b.beginRecording(i10, i11);
            this.f44380r = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    @Override
    public final void b() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        if (this.f44379n) {
            this.f44376b.endRecording();
            this.f44379n = false;
            this.f44380r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int d(List list, int i10, int i11) {
        RectF rectF;
        Iterator it = this.f44381s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            pg.c cVar = (pg.c) it.next();
            boolean v = cVar.v();
            pg.a aVar = cVar.h;
            if (v && cVar.f41248j > 0 && !aVar.f41239m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(aVar.f41239m);
                rectF.offset(cVar.f41242a, cVar.f41243b);
                float f10 = -i11;
                rectF.inset(f10, f10);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void e() {
        Iterator it = this.f44381s.iterator();
        while (it.hasNext()) {
            ((pg.c) it.next()).M = true;
        }
    }

    public final boolean f(int i10, int i11) {
        if (this.f44376b.hasDisplayList() && this.f44376b.getWidth() == i10 && this.f44376b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void g(float f10) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f44376b;
        if (f10 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void h(float f10, RenderEffect renderEffect) {
        this.f44376b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void i(int i10, int i11) {
        this.f44376b.setPosition(0, 0, i10, i11);
    }

    public final void j(g gVar) {
        if (this.f44377c == null) {
            this.f44377c = new h(this.f44376b, gVar);
        }
    }

    @Override
    public final pg.b k() {
        pg.c cVar = new pg.c(this);
        this.f44381s.add(cVar);
        return cVar;
    }

    public final void l() {
        this.f44377c.a();
    }
}

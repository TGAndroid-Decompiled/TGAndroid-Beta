package tg;

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
import og.g;
import og.h;
public final class d implements a {
    public final a f48123a;
    public h f48125c;
    public og.e d;
    public int f48126e;
    public a f48127f;
    public boolean h;
    public boolean f48128n;
    public RecordingCanvas f48129r;
    public Runnable v;
    public final be.b f48130s = new be.b(true);
    public final RenderNode f48124b = y.c();

    public d(a aVar) {
        this.f48123a = aVar;
    }

    @Override
    public final void I(Canvas canvas, float f10, float f11, float f12, float f13) {
        og.e eVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f48123a;
            if (aVar != null) {
                aVar.I(canvas, f10, f11, f12, f13);
            }
        } else if (!this.f48128n) {
            a aVar2 = this.f48127f;
            if (aVar2 != null) {
                aVar2.I(canvas, f10, f11, f12, f13);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f10, f11, f12, f13);
            }
            if (Build.VERSION.SDK_INT >= 31 && (eVar = this.d) != null) {
                eVar.c(canvas, this.f48126e);
            } else {
                canvas.drawRenderNode(this.f48124b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f48128n) {
            this.f48128n = true;
            this.f48124b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f48124b.beginRecording(i10, i11);
            this.f48129r = beginRecording;
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
        if (this.f48128n) {
            this.f48124b.endRecording();
            this.f48128n = false;
            this.f48129r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int d(List list, int i10, int i11) {
        RectF rectF;
        Iterator it = this.f48130s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            qg.c cVar = (qg.c) it.next();
            boolean v = cVar.v();
            qg.a aVar = cVar.h;
            if (v && cVar.f44887j > 0 && !aVar.f44877m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(aVar.f44877m);
                rectF.offset(cVar.f44880a, cVar.f44881b);
                float f10 = -i11;
                rectF.inset(f10, f10);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void e() {
        Iterator it = this.f48130s.iterator();
        while (it.hasNext()) {
            ((qg.c) it.next()).M = true;
        }
    }

    public final boolean f(int i10, int i11) {
        if (this.f48124b.hasDisplayList() && this.f48124b.getWidth() == i10 && this.f48124b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void g(float f10) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f48124b;
        if (f10 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void h(float f10, RenderEffect renderEffect) {
        this.f48124b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void i(int i10, int i11) {
        this.f48124b.setPosition(0, 0, i10, i11);
    }

    public final void j(g gVar) {
        if (this.f48125c == null) {
            this.f48125c = new h(this.f48124b, gVar);
        }
    }

    @Override
    public final qg.b k() {
        qg.c cVar = new qg.c(this);
        this.f48130s.add(cVar);
        return cVar;
    }

    public final void l() {
        this.f48125c.a();
    }
}

package qg;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.z;
import java.util.Iterator;
import java.util.List;
import lg.g;
import lg.h;
public final class d implements a {
    public final a f46668a;
    public h f46670c;
    public lg.e d;
    public int f46671e;
    public a f46672f;
    public boolean h;
    public boolean f46673n;
    public RecordingCanvas f46674r;
    public Runnable v;
    public final zd.b f46675s = new zd.b(true);
    public final RenderNode f46669b = z.c();

    public d(a aVar) {
        this.f46668a = aVar;
    }

    @Override
    public final void E0(Canvas canvas, float f9, float f10, float f11, float f12) {
        lg.e eVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f46668a;
            if (aVar != null) {
                aVar.E0(canvas, f9, f10, f11, f12);
            }
        } else if (!this.f46673n) {
            a aVar2 = this.f46672f;
            if (aVar2 != null) {
                aVar2.E0(canvas, f9, f10, f11, f12);
            }
            canvas.save();
            if (!this.h) {
                canvas.clipRect(f9, f10, f11, f12);
            }
            if (Build.VERSION.SDK_INT >= 31 && (eVar = this.d) != null) {
                eVar.c(canvas, this.f46671e);
            } else {
                canvas.drawRenderNode(this.f46669b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (!this.f46673n) {
            this.f46673n = true;
            this.f46669b.setPosition(0, 0, i10, i11);
            RecordingCanvas beginRecording = this.f46669b.beginRecording(i10, i11);
            this.f46674r = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void b() {
        if (this.f46673n) {
            this.f46669b.endRecording();
            this.f46673n = false;
            this.f46674r = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final int c(List list, int i10, int i11) {
        RectF rectF;
        Iterator it = this.f46675s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            ng.e eVar = (ng.e) it.next();
            boolean v = eVar.v();
            ng.c cVar = eVar.h;
            if (v && eVar.f17346j > 0 && !cVar.f17336m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.f17336m);
                rectF.offset(eVar.f17339a, eVar.f17340b);
                float f9 = -i11;
                rectF.inset(f9, f9);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void d() {
        Iterator it = this.f46675s.iterator();
        while (it.hasNext()) {
            ((ng.e) it.next()).M = true;
        }
    }

    public final boolean e(int i10, int i11) {
        if (this.f46669b.hasDisplayList() && this.f46669b.getWidth() == i10 && this.f46669b.getHeight() == i11) {
            return false;
        }
        return true;
    }

    public final void f(float f9) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f46669b;
        if (f9 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f9, f9, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void g(float f9, RenderEffect renderEffect) {
        this.f46669b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f9, f9, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void h(int i10, int i11) {
        this.f46669b.setPosition(0, 0, i10, i11);
    }

    public final void i(g gVar) {
        if (this.f46670c == null) {
            this.f46670c = new h(this.f46669b, gVar);
        }
    }

    public final void j() {
        this.f46670c.a();
    }

    @Override
    public final void q() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final ng.d v() {
        ng.e eVar = new ng.e(this);
        this.f46675s.add(eVar);
        return eVar;
    }
}

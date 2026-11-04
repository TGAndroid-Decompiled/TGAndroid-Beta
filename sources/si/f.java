package si;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.w;
import eh.i;
public final class f implements a, eh.b, qi.a {
    public final a f54752a;
    public i f54754c;
    public eh.g d;
    public int f54755e;
    public a f54756f;
    public pi.c h;
    public boolean f54757n;
    public boolean f54758r;
    public RecordingCanvas f54759s;
    public final ue.b f54760w = new ue.b();
    public final RenderNode f54753b = w.c();

    public f(a aVar) {
        this.f54752a = aVar;
    }

    @Override
    public final int a() {
        pi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.a();
        }
        return 0;
    }

    @Override
    public final gh.g b() {
        gh.g gVar = new gh.g(this, this, this);
        d(gVar);
        return gVar;
    }

    @Override
    public final void c(float f10, float f11, int i3, Canvas canvas, RectF rectF) {
        Canvas canvas2;
        eh.g gVar;
        pi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        pi.c cVar2 = cVar;
        if (this.f54756f == null && cVar2 != null) {
            canvas2 = canvas;
        } else {
            canvas.save();
            float f12 = 1.0f / i3;
            canvas.scale(f12, f12);
            canvas.translate(-f10, -f11);
            a aVar = this.f54756f;
            if (aVar != null) {
                float f13 = i3 * 2;
                canvas2 = canvas;
                aVar.l(canvas2, rectF.left - f13, rectF.top - f13, rectF.right + f13, rectF.bottom + f13);
            } else {
                canvas2 = canvas;
            }
            if (cVar2 == null && Build.VERSION.SDK_INT >= 31 && (gVar = this.d) != null) {
                gVar.c(canvas2, this.f54755e);
            }
            canvas2.restore();
        }
        if (cVar2 != null) {
            cVar2.c(f10, f11, i3, canvas2, rectF);
        }
    }

    @Override
    public final void d(gh.g gVar) {
        this.f54760w.add(gVar);
    }

    @Override
    public final int e() {
        eh.g gVar;
        eh.e eVar;
        pi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.e();
        }
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.d) != null) {
            int i3 = this.f54755e;
            if (gVar.f10012a && gVar.f10020k != 0) {
                eh.f fVar = (eh.f) gVar.f10019j.get(0);
                if ((i3 == -2 || i3 == -4) && (eVar = fVar.f10010c) != null) {
                    return eVar.f10003e;
                }
                return fVar.f10009b.f10003e;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final int f() {
        pi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.f();
        }
        return 0;
    }

    @Override
    public final boolean g() {
        if (e() > 1) {
            return true;
        }
        return false;
    }

    public final RecordingCanvas h(int i3, int i10) {
        if (!this.f54758r) {
            this.f54758r = true;
            this.f54753b.setPosition(0, 0, i3, i10);
            RecordingCanvas beginRecording = this.f54753b.beginRecording(i3, i10);
            this.f54759s = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void i() {
        if (this.f54758r) {
            this.f54753b.endRecording();
            this.f54758r = false;
            this.f54759s = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean j(int i3, int i10) {
        if (this.f54753b.hasDisplayList() && this.f54753b.getWidth() == i3 && this.f54753b.getHeight() == i10) {
            return false;
        }
        return true;
    }

    public final void k(float f10) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f54753b;
        if (f10 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    @Override
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        eh.g gVar;
        pi.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f54752a;
            if (aVar != null) {
                aVar.l(canvas, f10, f11, f12, f13);
            }
        } else if (!this.f54758r) {
            a aVar2 = this.f54756f;
            if (aVar2 != null) {
                aVar2.l(canvas, f10, f11, f12, f13);
            }
            canvas.save();
            if (!this.f54757n) {
                canvas.clipRect(f10, f11, f12, f13);
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 31 && (cVar = this.h) != null) {
                cVar.l(canvas, f10, f11, f12, f13);
            } else if (i3 >= 31 && (gVar = this.d) != null) {
                gVar.c(canvas, this.f54755e);
            } else {
                canvas.drawRenderNode(this.f54753b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }

    public final void m(float f10, RenderEffect renderEffect) {
        this.f54753b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void n(int i3, int i10) {
        this.f54753b.setPosition(0, 0, i3, i10);
    }
}

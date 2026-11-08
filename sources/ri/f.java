package ri;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.w;
import dh.i;
public final class f implements a, dh.b, pi.a {
    public final a f54568a;
    public i f54570c;
    public dh.g d;
    public int f54571e;
    public a f54572f;
    public oi.c h;
    public boolean f54573n;
    public boolean f54574r;
    public RecordingCanvas f54575s;
    public final xe.b f54576w = new xe.b();
    public final RenderNode f54569b = w.c();

    public f(a aVar) {
        this.f54568a = aVar;
    }

    @Override
    public final int a() {
        oi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.a();
        }
        return 0;
    }

    @Override
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        c(gVar);
        return gVar;
    }

    @Override
    public final void c(fh.g gVar) {
        this.f54576w.add(gVar);
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        Canvas canvas2;
        dh.g gVar;
        oi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        oi.c cVar2 = cVar;
        if (this.f54572f == null && cVar2 != null) {
            canvas2 = canvas;
        } else {
            canvas.save();
            float f12 = 1.0f / i7;
            canvas.scale(f12, f12);
            canvas.translate(-f10, -f11);
            a aVar = this.f54572f;
            if (aVar != null) {
                float f13 = i7 * 2;
                canvas2 = canvas;
                aVar.e(canvas2, rectF.left - f13, rectF.top - f13, rectF.right + f13, rectF.bottom + f13);
            } else {
                canvas2 = canvas;
            }
            if (cVar2 == null && Build.VERSION.SDK_INT >= 31 && (gVar = this.d) != null) {
                gVar.c(canvas2, this.f54571e);
            }
            canvas2.restore();
        }
        if (cVar2 != null) {
            cVar2.d(f10, f11, i7, canvas2, rectF);
        }
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        dh.g gVar;
        oi.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f54568a;
            if (aVar != null) {
                aVar.e(canvas, f10, f11, f12, f13);
            }
        } else if (!this.f54574r) {
            a aVar2 = this.f54572f;
            if (aVar2 != null) {
                aVar2.e(canvas, f10, f11, f12, f13);
            }
            canvas.save();
            if (!this.f54573n) {
                canvas.clipRect(f10, f11, f12, f13);
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31 && (cVar = this.h) != null) {
                cVar.e(canvas, f10, f11, f12, f13);
            } else if (i7 >= 31 && (gVar = this.d) != null) {
                gVar.c(canvas, this.f54571e);
            } else {
                canvas.drawRenderNode(this.f54569b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public final int f() {
        dh.g gVar;
        dh.e eVar;
        oi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.f();
        }
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.d) != null) {
            int i7 = this.f54571e;
            if (gVar.f8734a && gVar.f8742k != 0) {
                dh.f fVar = (dh.f) gVar.f8741j.get(0);
                if ((i7 == -2 || i7 == -4) && (eVar = fVar.f8732c) != null) {
                    return eVar.f8725e;
                }
                return fVar.f8731b.f8725e;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final int g() {
        oi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.g();
        }
        return 0;
    }

    @Override
    public final boolean h() {
        if (f() > 1) {
            return true;
        }
        return false;
    }

    public final RecordingCanvas i(int i7, int i10) {
        if (!this.f54574r) {
            this.f54574r = true;
            this.f54569b.setPosition(0, 0, i7, i10);
            RecordingCanvas beginRecording = this.f54569b.beginRecording(i7, i10);
            this.f54575s = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void j() {
        if (this.f54574r) {
            this.f54569b.endRecording();
            this.f54574r = false;
            this.f54575s = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean k(int i7, int i10) {
        if (this.f54569b.hasDisplayList() && this.f54569b.getWidth() == i7 && this.f54569b.getHeight() == i10) {
            return false;
        }
        return true;
    }

    public final void l(float f10) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f54569b;
        if (f10 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void m(float f10, RenderEffect renderEffect) {
        this.f54569b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void n(int i7, int i10) {
        this.f54569b.setPosition(0, 0, i7, i10);
    }
}

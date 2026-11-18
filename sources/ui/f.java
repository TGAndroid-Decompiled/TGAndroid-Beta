package ui;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.w;
import dh.i;
public final class f implements a, dh.b, si.a {
    public final a f59003a;
    public i f59005c;
    public dh.g d;
    public int f59006e;
    public a f59007f;
    public ri.c h;
    public boolean f59008n;
    public boolean f59009r;
    public RecordingCanvas f59010s;
    public final xe.b f59011w = new xe.b();
    public final RenderNode f59004b = w.c();

    public f(a aVar) {
        this.f59003a = aVar;
    }

    @Override
    public final int a() {
        ri.c cVar = this.h;
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
        this.f59011w.add(gVar);
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        Canvas canvas2;
        dh.g gVar;
        ri.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        ri.c cVar2 = cVar;
        if (this.f59007f == null && cVar2 != null) {
            canvas2 = canvas;
        } else {
            canvas.save();
            float f12 = 1.0f / i7;
            canvas.scale(f12, f12);
            canvas.translate(-f10, -f11);
            a aVar = this.f59007f;
            if (aVar != null) {
                float f13 = i7 * 2;
                aVar.o(rectF.left - f13, rectF.top - f13, rectF.right + f13, rectF.bottom + f13, canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            if (cVar2 == null && Build.VERSION.SDK_INT >= 31 && (gVar = this.d) != null) {
                gVar.c(canvas2, this.f59006e);
            }
            canvas2.restore();
        }
        if (cVar2 != null) {
            cVar2.d(f10, f11, i7, canvas2, rectF);
        }
    }

    @Override
    public final int e() {
        dh.g gVar;
        dh.e eVar;
        ri.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.e();
        }
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.d) != null) {
            int i7 = this.f59006e;
            if (gVar.f8406a && gVar.f8414k != 0) {
                dh.f fVar = (dh.f) gVar.f8413j.get(0);
                if ((i7 == -2 || i7 == -4) && (eVar = fVar.f8404c) != null) {
                    return eVar.f8397e;
                }
                return fVar.f8403b.f8397e;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final int f() {
        ri.c cVar = this.h;
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

    public final RecordingCanvas h(int i7, int i10) {
        if (!this.f59009r) {
            this.f59009r = true;
            this.f59004b.setPosition(0, 0, i7, i10);
            RecordingCanvas beginRecording = this.f59004b.beginRecording(i7, i10);
            this.f59010s = beginRecording;
            return beginRecording;
        }
        throw new IllegalStateException();
    }

    public final void i() {
        if (this.f59009r) {
            this.f59004b.endRecording();
            this.f59009r = false;
            this.f59010s = null;
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean j(int i7, int i10) {
        if (this.f59004b.hasDisplayList() && this.f59004b.getWidth() == i7 && this.f59004b.getHeight() == i10) {
            return false;
        }
        return true;
    }

    public final void k(float f10) {
        RenderEffect renderEffect;
        RenderNode renderNode = this.f59004b;
        if (f10 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public final void l(float f10, RenderEffect renderEffect) {
        this.f59004b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void m(int i7, int i10) {
        this.f59004b.setPosition(0, 0, i7, i10);
    }

    @Override
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        dh.g gVar;
        ri.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.f59003a;
            if (aVar != null) {
                aVar.o(f10, f11, f12, f13, canvas);
            }
        } else if (!this.f59009r) {
            a aVar2 = this.f59007f;
            if (aVar2 != null) {
                aVar2.o(f10, f11, f12, f13, canvas);
            }
            canvas.save();
            if (!this.f59008n) {
                canvas.clipRect(f10, f11, f12, f13);
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31 && (cVar = this.h) != null) {
                cVar.o(f10, f11, f12, f13, canvas);
            } else if (i7 >= 31 && (gVar = this.d) != null) {
                gVar.c(canvas, this.f59006e);
            } else {
                canvas.drawRenderNode(this.f59004b);
            }
            canvas.restore();
        } else {
            throw new IllegalStateException();
        }
    }
}

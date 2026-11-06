package vg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
public abstract class r extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final o[] f57372y = new o[3];
    public final o f57373a;
    public final Rect f57374b;
    public final Runnable f57375c;
    public final int d;
    public q f57376e;
    public boolean f57377f;
    public boolean h;
    public boolean f57378n;
    public float f57379r;
    public float f57380s;
    public boolean f57381w;
    public boolean f57382x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f57374b = new Rect();
        this.h = true;
        this.f57375c = runnable;
        o[] oVarArr = f57372y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f57373a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        p pVar;
        if (this.f57377f && !this.h) {
            this.f57375c.run();
            if (this.f57376e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f57374b)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q qVar = this.f57376e;
                if (z9) {
                    pVar = new p(this.f57379r, this.f57380s, this.f57381w, this.f57382x);
                } else {
                    pVar = null;
                }
                qVar.f57365e = pVar;
                this.f57373a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57377f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f57378n = false;
        this.f57377f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f57378n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f57376e = qVar;
        o oVar = this.f57373a;
        oVar.f57346f.add(qVar);
        oVar.f57347g = (q[]) oVar.f57346f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f57378n = false;
        q qVar = this.f57376e;
        this.f57376e = null;
        if (qVar != null) {
            o oVar = this.f57373a;
            oVar.getClass();
            qVar.f57364c = false;
            oVar.f57346f.remove(qVar);
            oVar.f57347g = (q[]) oVar.f57346f.toArray(new q[0]);
            oVar.f57343b.post(new ti.p(17, oVar, qVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        q qVar;
        int i7 = this.d;
        surfaceTexture.setDefaultBufferSize(i7, i7);
        if (!this.f57378n && (qVar = this.f57376e) != null && qVar.d) {
            this.f57378n = true;
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setPaused(boolean z9) {
        this.h = z9;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f57377f && !z9) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f57376e;
        if (qVar != null) {
            qVar.f57365e = null;
            this.f57373a.c();
        }
    }
}

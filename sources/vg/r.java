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
    public static final o[] f57396y = new o[3];
    public final o f57397a;
    public final Rect f57398b;
    public final Runnable f57399c;
    public final int d;
    public q f57400e;
    public boolean f57401f;
    public boolean h;
    public boolean f57402n;
    public float f57403r;
    public float f57404s;
    public boolean f57405w;
    public boolean f57406x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f57398b = new Rect();
        this.h = true;
        this.f57399c = runnable;
        o[] oVarArr = f57396y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f57397a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        p pVar;
        if (this.f57401f && !this.h) {
            this.f57399c.run();
            if (this.f57400e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f57398b)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q qVar = this.f57400e;
                if (z9) {
                    pVar = new p(this.f57403r, this.f57404s, this.f57405w, this.f57406x);
                } else {
                    pVar = null;
                }
                qVar.f57389e = pVar;
                this.f57397a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57401f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f57402n = false;
        this.f57401f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f57402n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f57400e = qVar;
        o oVar = this.f57397a;
        oVar.f57370f.add(qVar);
        oVar.f57371g = (q[]) oVar.f57370f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f57402n = false;
        q qVar = this.f57400e;
        this.f57400e = null;
        if (qVar != null) {
            o oVar = this.f57397a;
            oVar.getClass();
            qVar.f57388c = false;
            oVar.f57370f.remove(qVar);
            oVar.f57371g = (q[]) oVar.f57370f.toArray(new q[0]);
            oVar.f57367b.post(new ti.p(17, oVar, qVar));
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
        if (!this.f57402n && (qVar = this.f57400e) != null && qVar.d) {
            this.f57402n = true;
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
        if (this.f57401f && !z9) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f57400e;
        if (qVar != null) {
            qVar.f57389e = null;
            this.f57397a.c();
        }
    }
}

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
    public static final o[] f57397y = new o[3];
    public final o f57398a;
    public final Rect f57399b;
    public final Runnable f57400c;
    public final int d;
    public q f57401e;
    public boolean f57402f;
    public boolean h;
    public boolean f57403n;
    public float f57404r;
    public float f57405s;
    public boolean f57406w;
    public boolean f57407x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f57399b = new Rect();
        this.h = true;
        this.f57400c = runnable;
        o[] oVarArr = f57397y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f57398a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        p pVar;
        if (this.f57402f && !this.h) {
            this.f57400c.run();
            if (this.f57401e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f57399b)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q qVar = this.f57401e;
                if (z9) {
                    pVar = new p(this.f57404r, this.f57405s, this.f57406w, this.f57407x);
                } else {
                    pVar = null;
                }
                qVar.f57390e = pVar;
                this.f57398a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57402f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f57403n = false;
        this.f57402f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f57403n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f57401e = qVar;
        o oVar = this.f57398a;
        oVar.f57371f.add(qVar);
        oVar.f57372g = (q[]) oVar.f57371f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f57403n = false;
        q qVar = this.f57401e;
        this.f57401e = null;
        if (qVar != null) {
            o oVar = this.f57398a;
            oVar.getClass();
            qVar.f57389c = false;
            oVar.f57371f.remove(qVar);
            oVar.f57372g = (q[]) oVar.f57371f.toArray(new q[0]);
            oVar.f57368b.post(new ti.p(17, oVar, qVar));
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
        if (!this.f57403n && (qVar = this.f57401e) != null && qVar.d) {
            this.f57403n = true;
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
        if (this.f57402f && !z9) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f57401e;
        if (qVar != null) {
            qVar.f57390e = null;
            this.f57398a.c();
        }
    }
}

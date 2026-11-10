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
    public static final o[] f57497y = new o[3];
    public final o f57498a;
    public final Rect f57499b;
    public final Runnable f57500c;
    public final int d;
    public q f57501e;
    public boolean f57502f;
    public boolean h;
    public boolean f57503n;
    public float f57504r;
    public float f57505s;
    public boolean f57506w;
    public boolean f57507x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f57499b = new Rect();
        this.h = true;
        this.f57500c = runnable;
        o[] oVarArr = f57497y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f57498a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        p pVar;
        if (this.f57502f && !this.h) {
            this.f57500c.run();
            if (this.f57501e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f57499b)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q qVar = this.f57501e;
                if (z9) {
                    pVar = new p(this.f57504r, this.f57505s, this.f57506w, this.f57507x);
                } else {
                    pVar = null;
                }
                qVar.f57490e = pVar;
                this.f57498a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57502f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f57503n = false;
        this.f57502f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f57503n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f57501e = qVar;
        o oVar = this.f57498a;
        oVar.f57471f.add(qVar);
        oVar.f57472g = (q[]) oVar.f57471f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f57503n = false;
        q qVar = this.f57501e;
        this.f57501e = null;
        if (qVar != null) {
            o oVar = this.f57498a;
            oVar.getClass();
            qVar.f57489c = false;
            oVar.f57471f.remove(qVar);
            oVar.f57472g = (q[]) oVar.f57471f.toArray(new q[0]);
            oVar.f57468b.post(new u9.f(13, oVar, qVar));
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
        if (!this.f57503n && (qVar = this.f57501e) != null && qVar.d) {
            this.f57503n = true;
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
        if (this.f57502f && !z9) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f57501e;
        if (qVar != null) {
            qVar.f57490e = null;
            this.f57498a.c();
        }
    }
}

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
    public static final o[] f57489y = new o[3];
    public final o f57490a;
    public final Rect f57491b;
    public final Runnable f57492c;
    public final int d;
    public q f57493e;
    public boolean f57494f;
    public boolean h;
    public boolean f57495n;
    public float f57496r;
    public float f57497s;
    public boolean f57498w;
    public boolean f57499x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f57491b = new Rect();
        this.h = true;
        this.f57492c = runnable;
        o[] oVarArr = f57489y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f57490a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        p pVar;
        if (this.f57494f && !this.h) {
            this.f57492c.run();
            if (this.f57493e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f57491b)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q qVar = this.f57493e;
                if (z9) {
                    pVar = new p(this.f57496r, this.f57497s, this.f57498w, this.f57499x);
                } else {
                    pVar = null;
                }
                qVar.f57482e = pVar;
                this.f57490a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57494f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f57495n = false;
        this.f57494f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f57495n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f57493e = qVar;
        o oVar = this.f57490a;
        oVar.f57463f.add(qVar);
        oVar.f57464g = (q[]) oVar.f57463f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f57495n = false;
        q qVar = this.f57493e;
        this.f57493e = null;
        if (qVar != null) {
            o oVar = this.f57490a;
            oVar.getClass();
            qVar.f57481c = false;
            oVar.f57463f.remove(qVar);
            oVar.f57464g = (q[]) oVar.f57463f.toArray(new q[0]);
            oVar.f57460b.post(new u9.f(12, oVar, qVar));
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
        if (!this.f57495n && (qVar = this.f57493e) != null && qVar.d) {
            this.f57495n = true;
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
        if (this.f57494f && !z9) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f57493e;
        if (qVar != null) {
            qVar.f57482e = null;
            this.f57490a.c();
        }
    }
}

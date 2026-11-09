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
    public static final o[] f57501y = new o[3];
    public final o f57502a;
    public final Rect f57503b;
    public final Runnable f57504c;
    public final int d;
    public q f57505e;
    public boolean f57506f;
    public boolean h;
    public boolean f57507n;
    public float f57508r;
    public float f57509s;
    public boolean f57510w;
    public boolean f57511x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f57503b = new Rect();
        this.h = true;
        this.f57504c = runnable;
        o[] oVarArr = f57501y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f57502a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        p pVar;
        if (this.f57506f && !this.h) {
            this.f57504c.run();
            if (this.f57505e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f57503b)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q qVar = this.f57505e;
                if (z9) {
                    pVar = new p(this.f57508r, this.f57509s, this.f57510w, this.f57511x);
                } else {
                    pVar = null;
                }
                qVar.f57494e = pVar;
                this.f57502a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57506f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f57507n = false;
        this.f57506f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f57507n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f57505e = qVar;
        o oVar = this.f57502a;
        oVar.f57475f.add(qVar);
        oVar.f57476g = (q[]) oVar.f57475f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f57507n = false;
        q qVar = this.f57505e;
        this.f57505e = null;
        if (qVar != null) {
            o oVar = this.f57502a;
            oVar.getClass();
            qVar.f57493c = false;
            oVar.f57475f.remove(qVar);
            oVar.f57476g = (q[]) oVar.f57475f.toArray(new q[0]);
            oVar.f57472b.post(new u9.f(13, oVar, qVar));
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
        if (!this.f57507n && (qVar = this.f57505e) != null && qVar.d) {
            this.f57507n = true;
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
        if (this.f57506f && !z9) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f57505e;
        if (qVar != null) {
            qVar.f57494e = null;
            this.f57502a.c();
        }
    }
}

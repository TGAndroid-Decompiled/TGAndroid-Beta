package vg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import p4.o0;
public abstract class r extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final o[] f59541y = new o[3];
    public final o f59542a;
    public final Rect f59543b;
    public final Runnable f59544c;
    public final int d;
    public q f59545e;
    public boolean f59546f;
    public boolean h;
    public boolean f59547n;
    public float f59548r;
    public float f59549s;
    public boolean f59550w;
    public boolean f59551x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f59543b = new Rect();
        this.h = true;
        this.f59544c = runnable;
        o[] oVarArr = f59541y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f59542a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        p pVar;
        if (this.f59546f && !this.h) {
            this.f59544c.run();
            if (this.f59545e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f59543b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q qVar = this.f59545e;
                if (z10) {
                    pVar = new p(this.f59548r, this.f59549s, this.f59550w, this.f59551x);
                } else {
                    pVar = null;
                }
                qVar.f59534e = pVar;
                this.f59542a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59546f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f59547n = false;
        this.f59546f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f59547n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f59545e = qVar;
        o oVar = this.f59542a;
        oVar.f59515f.add(qVar);
        oVar.f59516g = (q[]) oVar.f59515f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f59547n = false;
        q qVar = this.f59545e;
        this.f59545e = null;
        if (qVar != null) {
            o oVar = this.f59542a;
            oVar.getClass();
            qVar.f59533c = false;
            oVar.f59515f.remove(qVar);
            oVar.f59516g = (q[]) oVar.f59515f.toArray(new q[0]);
            oVar.f59512b.post(new o0(26, oVar, qVar));
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
        if (!this.f59547n && (qVar = this.f59545e) != null && qVar.d) {
            this.f59547n = true;
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setPaused(boolean z10) {
        this.h = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f59546f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f59545e;
        if (qVar != null) {
            qVar.f59534e = null;
            this.f59542a.c();
        }
    }
}

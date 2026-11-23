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
    public static final o[] f59668y = new o[3];
    public final o f59669a;
    public final Rect f59670b;
    public final Runnable f59671c;
    public final int d;
    public q f59672e;
    public boolean f59673f;
    public boolean h;
    public boolean f59674n;
    public float f59675r;
    public float f59676s;
    public boolean f59677w;
    public boolean f59678x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f59670b = new Rect();
        this.h = true;
        this.f59671c = runnable;
        o[] oVarArr = f59668y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f59669a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        p pVar;
        if (this.f59673f && !this.h) {
            this.f59671c.run();
            if (this.f59672e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f59670b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q qVar = this.f59672e;
                if (z10) {
                    pVar = new p(this.f59675r, this.f59676s, this.f59677w, this.f59678x);
                } else {
                    pVar = null;
                }
                qVar.f59661e = pVar;
                this.f59669a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59673f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f59674n = false;
        this.f59673f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f59674n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f59672e = qVar;
        o oVar = this.f59669a;
        oVar.f59642f.add(qVar);
        oVar.f59643g = (q[]) oVar.f59642f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f59674n = false;
        q qVar = this.f59672e;
        this.f59672e = null;
        if (qVar != null) {
            o oVar = this.f59669a;
            oVar.getClass();
            qVar.f59660c = false;
            oVar.f59642f.remove(qVar);
            oVar.f59643g = (q[]) oVar.f59642f.toArray(new q[0]);
            oVar.f59639b.post(new v9.b(2, oVar, qVar));
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
        if (!this.f59674n && (qVar = this.f59672e) != null && qVar.d) {
            this.f59674n = true;
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
        if (this.f59673f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f59672e;
        if (qVar != null) {
            qVar.f59661e = null;
            this.f59669a.c();
        }
    }
}

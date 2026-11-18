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
    public static final o[] f59540y = new o[3];
    public final o f59541a;
    public final Rect f59542b;
    public final Runnable f59543c;
    public final int d;
    public q f59544e;
    public boolean f59545f;
    public boolean h;
    public boolean f59546n;
    public float f59547r;
    public float f59548s;
    public boolean f59549w;
    public boolean f59550x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f59542b = new Rect();
        this.h = true;
        this.f59543c = runnable;
        o[] oVarArr = f59540y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f59541a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        p pVar;
        if (this.f59545f && !this.h) {
            this.f59543c.run();
            if (this.f59544e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f59542b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q qVar = this.f59544e;
                if (z10) {
                    pVar = new p(this.f59547r, this.f59548s, this.f59549w, this.f59550x);
                } else {
                    pVar = null;
                }
                qVar.f59533e = pVar;
                this.f59541a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59545f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f59546n = false;
        this.f59545f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f59546n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f59544e = qVar;
        o oVar = this.f59541a;
        oVar.f59514f.add(qVar);
        oVar.f59515g = (q[]) oVar.f59514f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f59546n = false;
        q qVar = this.f59544e;
        this.f59544e = null;
        if (qVar != null) {
            o oVar = this.f59541a;
            oVar.getClass();
            qVar.f59532c = false;
            oVar.f59514f.remove(qVar);
            oVar.f59515g = (q[]) oVar.f59514f.toArray(new q[0]);
            oVar.f59511b.post(new o0(26, oVar, qVar));
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
        if (!this.f59546n && (qVar = this.f59544e) != null && qVar.d) {
            this.f59546n = true;
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
        if (this.f59545f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f59544e;
        if (qVar != null) {
            qVar.f59533e = null;
            this.f59541a.c();
        }
    }
}

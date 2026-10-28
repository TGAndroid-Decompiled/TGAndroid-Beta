package ug;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
public abstract class s extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final p[] f49924x = new p[3];
    public final p f49925a;
    public final Rect f49926b;
    public final Runnable f49927c;
    public final int d;
    public r e;
    public boolean f49928f;
    public boolean h;
    public boolean f49929n;
    public float f49930r;
    public float f49931s;
    public boolean v;
    public boolean f49932w;

    public s(Context context, Runnable runnable, int i10) {
        super(context);
        this.f49926b = new Rect();
        this.h = true;
        this.f49927c = runnable;
        p[] pVarArr = f49924x;
        if (pVarArr[i10] == null) {
            pVarArr[i10] = new p(context.getApplicationContext(), i10);
        }
        p pVar = pVarArr[i10];
        this.f49925a = pVar;
        this.d = pVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        q qVar;
        if (this.f49928f && !this.h) {
            this.f49927c.run();
            if (this.e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f49926b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.e;
                if (z10) {
                    qVar = new q(this.f49930r, this.f49931s, this.v, this.f49932w);
                } else {
                    qVar = null;
                }
                rVar.e = qVar;
                this.f49925a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49928f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f49929n = false;
        this.f49928f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f49929n = false;
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.d);
        this.e = rVar;
        p pVar = this.f49925a;
        pVar.f49899f.add(rVar);
        pVar.f49900g = (r[]) pVar.f49899f.toArray(new r[0]);
        pVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f49929n = false;
        r rVar = this.e;
        this.e = null;
        if (rVar != null) {
            p pVar = this.f49925a;
            pVar.getClass();
            rVar.f49917c = false;
            pVar.f49899f.remove(rVar);
            pVar.f49900g = (r[]) pVar.f49899f.toArray(new r[0]);
            pVar.f49897b.post(new s9.g(16, pVar, rVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i10 = this.d;
        surfaceTexture.setDefaultBufferSize(i10, i10);
        if (!this.f49929n && (rVar = this.e) != null && rVar.d) {
            this.f49929n = true;
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
        if (this.f49928f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.e;
        if (rVar != null) {
            rVar.e = null;
            this.f49925a.c();
        }
    }
}

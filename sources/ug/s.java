package ug;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import sg.u;
public abstract class s extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final p[] f49886x = new p[3];
    public final p f49887a;
    public final Rect f49888b;
    public final Runnable f49889c;
    public final int d;
    public r e;
    public boolean f49890f;
    public boolean h;
    public boolean f49891n;
    public float f49892r;
    public float f49893s;
    public boolean v;
    public boolean f49894w;

    public s(Context context, Runnable runnable, int i10) {
        super(context);
        this.f49888b = new Rect();
        this.h = true;
        this.f49889c = runnable;
        p[] pVarArr = f49886x;
        if (pVarArr[i10] == null) {
            pVarArr[i10] = new p(context.getApplicationContext(), i10);
        }
        p pVar = pVarArr[i10];
        this.f49887a = pVar;
        this.d = pVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        q qVar;
        if (this.f49890f && !this.h) {
            this.f49889c.run();
            if (this.e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f49888b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.e;
                if (z10) {
                    qVar = new q(this.f49892r, this.f49893s, this.v, this.f49894w);
                } else {
                    qVar = null;
                }
                rVar.e = qVar;
                this.f49887a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49890f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f49891n = false;
        this.f49890f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f49891n = false;
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.d);
        this.e = rVar;
        p pVar = this.f49887a;
        pVar.f49861f.add(rVar);
        pVar.f49862g = (r[]) pVar.f49861f.toArray(new r[0]);
        pVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f49891n = false;
        r rVar = this.e;
        this.e = null;
        if (rVar != null) {
            p pVar = this.f49887a;
            pVar.getClass();
            rVar.f49879c = false;
            pVar.f49861f.remove(rVar);
            pVar.f49862g = (r[]) pVar.f49861f.toArray(new r[0]);
            pVar.f49859b.post(new u(15, pVar, rVar));
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
        if (!this.f49891n && (rVar = this.e) != null && rVar.d) {
            this.f49891n = true;
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
        if (this.f49890f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.e;
        if (rVar != null) {
            rVar.e = null;
            this.f49887a.c();
        }
    }
}

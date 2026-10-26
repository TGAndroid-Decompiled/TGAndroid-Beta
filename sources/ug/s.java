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
    public static final p[] f49889x = new p[3];
    public final p f49890a;
    public final Rect f49891b;
    public final Runnable f49892c;
    public final int d;
    public r e;
    public boolean f49893f;
    public boolean h;
    public boolean f49894n;
    public float f49895r;
    public float f49896s;
    public boolean v;
    public boolean f49897w;

    public s(Context context, Runnable runnable, int i10) {
        super(context);
        this.f49891b = new Rect();
        this.h = true;
        this.f49892c = runnable;
        p[] pVarArr = f49889x;
        if (pVarArr[i10] == null) {
            pVarArr[i10] = new p(context.getApplicationContext(), i10);
        }
        p pVar = pVarArr[i10];
        this.f49890a = pVar;
        this.d = pVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        q qVar;
        if (this.f49893f && !this.h) {
            this.f49892c.run();
            if (this.e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f49891b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.e;
                if (z10) {
                    qVar = new q(this.f49895r, this.f49896s, this.v, this.f49897w);
                } else {
                    qVar = null;
                }
                rVar.e = qVar;
                this.f49890a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49893f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f49894n = false;
        this.f49893f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f49894n = false;
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.d);
        this.e = rVar;
        p pVar = this.f49890a;
        pVar.f49864f.add(rVar);
        pVar.f49865g = (r[]) pVar.f49864f.toArray(new r[0]);
        pVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f49894n = false;
        r rVar = this.e;
        this.e = null;
        if (rVar != null) {
            p pVar = this.f49890a;
            pVar.getClass();
            rVar.f49882c = false;
            pVar.f49864f.remove(rVar);
            pVar.f49865g = (r[]) pVar.f49864f.toArray(new r[0]);
            pVar.f49862b.post(new u(15, pVar, rVar));
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
        if (!this.f49894n && (rVar = this.e) != null && rVar.d) {
            this.f49894n = true;
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
        if (this.f49893f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.e;
        if (rVar != null) {
            rVar.e = null;
            this.f49890a.c();
        }
    }
}

package vg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import ug.t1;
public abstract class s extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final p[] f58973y = new p[3];
    public final p f58974a;
    public final Rect f58975b;
    public final Runnable f58976c;
    public final int d;
    public r f58977e;
    public boolean f58978f;
    public boolean h;
    public boolean f58979n;
    public float f58980r;
    public float f58981s;
    public boolean f58982w;
    public boolean f58983x;

    public s(Context context, Runnable runnable, int i7) {
        super(context);
        this.f58975b = new Rect();
        this.h = true;
        this.f58976c = runnable;
        p[] pVarArr = f58973y;
        if (pVarArr[i7] == null) {
            pVarArr[i7] = new p(context.getApplicationContext(), i7);
        }
        p pVar = pVarArr[i7];
        this.f58974a = pVar;
        this.d = pVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        q qVar;
        if (this.f58978f && !this.h) {
            this.f58976c.run();
            if (this.f58977e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f58975b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.f58977e;
                if (z10) {
                    qVar = new q(this.f58980r, this.f58981s, this.f58982w, this.f58983x);
                } else {
                    qVar = null;
                }
                rVar.f58966e = qVar;
                this.f58974a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58978f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f58979n = false;
        this.f58978f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f58979n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        r rVar = new r(this, new Surface(surfaceTexture), this.d);
        this.f58977e = rVar;
        p pVar = this.f58974a;
        pVar.f58947f.add(rVar);
        pVar.f58948g = (r[]) pVar.f58947f.toArray(new r[0]);
        pVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f58979n = false;
        r rVar = this.f58977e;
        this.f58977e = null;
        if (rVar != null) {
            p pVar = this.f58974a;
            pVar.getClass();
            rVar.f58965c = false;
            pVar.f58947f.remove(rVar);
            pVar.f58948g = (r[]) pVar.f58947f.toArray(new r[0]);
            pVar.f58944b.post(new t1(4, pVar, rVar));
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
        r rVar;
        int i7 = this.d;
        surfaceTexture.setDefaultBufferSize(i7, i7);
        if (!this.f58979n && (rVar = this.f58977e) != null && rVar.d) {
            this.f58979n = true;
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
        if (this.f58978f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.f58977e;
        if (rVar != null) {
            rVar.f58966e = null;
            this.f58974a.c();
        }
    }
}

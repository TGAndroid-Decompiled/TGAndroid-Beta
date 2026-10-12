package tg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
public abstract class s extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static p f45809w;
    public final Rect f45810a;
    public final Runnable f45811b;
    public final int f45812c;
    public r d;
    public boolean e;
    public boolean f45813f;
    public boolean h;
    public float f45814n;
    public float f45815r;
    public boolean f45816s;
    public boolean v;

    public s(Context context, Runnable runnable) {
        super(context);
        this.f45810a = new Rect();
        this.f45813f = true;
        this.f45811b = runnable;
        if (f45809w == null) {
            f45809w = new p(context.getApplicationContext());
        }
        this.f45812c = f45809w.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        q qVar;
        if (this.e && !this.f45813f) {
            this.f45811b.run();
            if (this.d != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f45810a)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.d;
                if (z10) {
                    qVar = new q(this.f45814n, this.f45815r, this.f45816s, this.v);
                } else {
                    qVar = null;
                }
                rVar.e = qVar;
                f45809w.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        setPaused(this.f45813f);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.h = false;
        this.e = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.h = false;
        int i12 = this.f45812c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.f45812c);
        this.d = rVar;
        p pVar = f45809w;
        pVar.e.add(rVar);
        pVar.f45785f = (r[]) pVar.e.toArray(new r[0]);
        pVar.c();
        setPaused(this.f45813f);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.h = false;
        r rVar = this.d;
        this.d = null;
        if (rVar != null) {
            p pVar = f45809w;
            pVar.getClass();
            rVar.f45802c = false;
            pVar.e.remove(rVar);
            pVar.f45785f = (r[]) pVar.e.toArray(new r[0]);
            pVar.f45783b.post(new s9.b(6, pVar, rVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.f45812c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i10 = this.f45812c;
        surfaceTexture.setDefaultBufferSize(i10, i10);
        if (!this.h && (rVar = this.d) != null && rVar.d) {
            this.h = true;
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
        this.f45813f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.e && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.d;
        if (rVar != null) {
            rVar.e = null;
            f45809w.c();
        }
    }
}

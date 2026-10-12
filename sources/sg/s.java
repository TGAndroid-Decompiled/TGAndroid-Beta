package sg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
public abstract class s extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static p f48382w;
    public final Rect f48383a;
    public final Runnable f48384b;
    public final int f48385c;
    public r d;
    public boolean f48386e;
    public boolean f48387f;
    public boolean h;
    public float f48388n;
    public float f48389r;
    public boolean f48390s;
    public boolean v;

    public s(Context context, Runnable runnable) {
        super(context);
        this.f48383a = new Rect();
        this.f48387f = true;
        this.f48384b = runnable;
        if (f48382w == null) {
            f48382w = new p(context.getApplicationContext());
        }
        this.f48385c = f48382w.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        q qVar;
        if (this.f48386e && !this.f48387f) {
            this.f48384b.run();
            if (this.d != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f48383a)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.d;
                if (z10) {
                    qVar = new q(this.f48388n, this.f48389r, this.f48390s, this.v);
                } else {
                    qVar = null;
                }
                rVar.f48375e = qVar;
                f48382w.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48386e = true;
        setPaused(this.f48387f);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.h = false;
        this.f48386e = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.h = false;
        int i12 = this.f48385c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.f48385c);
        this.d = rVar;
        p pVar = f48382w;
        pVar.f48356e.add(rVar);
        pVar.f48357f = (r[]) pVar.f48356e.toArray(new r[0]);
        pVar.c();
        setPaused(this.f48387f);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.h = false;
        r rVar = this.d;
        this.d = null;
        if (rVar != null) {
            p pVar = f48382w;
            pVar.getClass();
            rVar.f48374c = false;
            pVar.f48356e.remove(rVar);
            pVar.f48357f = (r[]) pVar.f48356e.toArray(new r[0]);
            pVar.f48354b.post(new p2.b(22, pVar, rVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.f48385c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i10 = this.f48385c;
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
        this.f48387f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f48386e && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.d;
        if (rVar != null) {
            rVar.f48375e = null;
            f48382w.c();
        }
    }
}

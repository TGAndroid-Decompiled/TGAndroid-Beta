package sg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import org.telegram.ui.web.w1;
public abstract class s extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static p f48151w;
    public final Rect f48152a;
    public final Runnable f48153b;
    public final int f48154c;
    public r d;
    public boolean f48155e;
    public boolean f48156f;
    public boolean h;
    public float f48157n;
    public float f48158r;
    public boolean f48159s;
    public boolean v;

    public s(Context context, Runnable runnable) {
        super(context);
        this.f48152a = new Rect();
        this.f48156f = true;
        this.f48153b = runnable;
        if (f48151w == null) {
            f48151w = new p(context.getApplicationContext());
        }
        this.f48154c = f48151w.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        q qVar;
        if (this.f48155e && !this.f48156f) {
            this.f48153b.run();
            if (this.d != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f48152a)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.d;
                if (z10) {
                    qVar = new q(this.f48157n, this.f48158r, this.f48159s, this.v);
                } else {
                    qVar = null;
                }
                rVar.f48144e = qVar;
                f48151w.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48155e = true;
        setPaused(this.f48156f);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.h = false;
        this.f48155e = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.h = false;
        int i12 = this.f48154c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.f48154c);
        this.d = rVar;
        p pVar = f48151w;
        pVar.f48125e.add(rVar);
        pVar.f48126f = (r[]) pVar.f48125e.toArray(new r[0]);
        pVar.c();
        setPaused(this.f48156f);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.h = false;
        r rVar = this.d;
        this.d = null;
        if (rVar != null) {
            p pVar = f48151w;
            pVar.getClass();
            rVar.f48143c = false;
            pVar.f48125e.remove(rVar);
            pVar.f48126f = (r[]) pVar.f48125e.toArray(new r[0]);
            pVar.f48123b.post(new w1(20, pVar, rVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.f48154c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i10 = this.f48154c;
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
        this.f48156f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f48155e && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.d;
        if (rVar != null) {
            rVar.f48144e = null;
            f48151w.c();
        }
    }
}

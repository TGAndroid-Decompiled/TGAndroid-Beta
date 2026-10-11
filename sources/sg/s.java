package sg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import org.telegram.ui.web.f2;
public abstract class s extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static p f48275w;
    public final Rect f48276a;
    public final Runnable f48277b;
    public final int f48278c;
    public r d;
    public boolean f48279e;
    public boolean f48280f;
    public boolean h;
    public float f48281n;
    public float f48282r;
    public boolean f48283s;
    public boolean v;

    public s(Context context, Runnable runnable) {
        super(context);
        this.f48276a = new Rect();
        this.f48280f = true;
        this.f48277b = runnable;
        if (f48275w == null) {
            f48275w = new p(context.getApplicationContext());
        }
        this.f48278c = f48275w.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        q qVar;
        if (this.f48279e && !this.f48280f) {
            this.f48277b.run();
            if (this.d != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f48276a)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.d;
                if (z10) {
                    qVar = new q(this.f48281n, this.f48282r, this.f48283s, this.v);
                } else {
                    qVar = null;
                }
                rVar.f48268e = qVar;
                f48275w.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48279e = true;
        setPaused(this.f48280f);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.h = false;
        this.f48279e = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.h = false;
        int i12 = this.f48278c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.f48278c);
        this.d = rVar;
        p pVar = f48275w;
        pVar.f48249e.add(rVar);
        pVar.f48250f = (r[]) pVar.f48249e.toArray(new r[0]);
        pVar.c();
        setPaused(this.f48280f);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.h = false;
        r rVar = this.d;
        this.d = null;
        if (rVar != null) {
            p pVar = f48275w;
            pVar.getClass();
            rVar.f48267c = false;
            pVar.f48249e.remove(rVar);
            pVar.f48250f = (r[]) pVar.f48249e.toArray(new r[0]);
            pVar.f48247b.post(new f2(22, pVar, rVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.f48278c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i10 = this.f48278c;
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
        this.f48280f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f48279e && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.d;
        if (rVar != null) {
            rVar.f48268e = null;
            f48275w.c();
        }
    }
}

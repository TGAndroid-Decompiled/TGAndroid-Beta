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
    public static p f48241w;
    public final Rect f48242a;
    public final Runnable f48243b;
    public final int f48244c;
    public r d;
    public boolean f48245e;
    public boolean f48246f;
    public boolean h;
    public float f48247n;
    public float f48248r;
    public boolean f48249s;
    public boolean v;

    public s(Context context, Runnable runnable) {
        super(context);
        this.f48242a = new Rect();
        this.f48246f = true;
        this.f48243b = runnable;
        if (f48241w == null) {
            f48241w = new p(context.getApplicationContext());
        }
        this.f48244c = f48241w.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        q qVar;
        if (this.f48245e && !this.f48246f) {
            this.f48243b.run();
            if (this.d != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f48242a)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.d;
                if (z10) {
                    qVar = new q(this.f48247n, this.f48248r, this.f48249s, this.v);
                } else {
                    qVar = null;
                }
                rVar.f48234e = qVar;
                f48241w.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48245e = true;
        setPaused(this.f48246f);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.h = false;
        this.f48245e = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.h = false;
        int i12 = this.f48244c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.f48244c);
        this.d = rVar;
        p pVar = f48241w;
        pVar.f48215e.add(rVar);
        pVar.f48216f = (r[]) pVar.f48215e.toArray(new r[0]);
        pVar.c();
        setPaused(this.f48246f);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.h = false;
        r rVar = this.d;
        this.d = null;
        if (rVar != null) {
            p pVar = f48241w;
            pVar.getClass();
            rVar.f48233c = false;
            pVar.f48215e.remove(rVar);
            pVar.f48216f = (r[]) pVar.f48215e.toArray(new r[0]);
            pVar.f48213b.post(new f2(22, pVar, rVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.f48244c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i10 = this.f48244c;
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
        this.f48246f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f48245e && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.d;
        if (rVar != null) {
            rVar.f48234e = null;
            f48241w.c();
        }
    }
}

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
    public static p f48149w;
    public final Rect f48150a;
    public final Runnable f48151b;
    public final int f48152c;
    public r d;
    public boolean f48153e;
    public boolean f48154f;
    public boolean h;
    public float f48155n;
    public float f48156r;
    public boolean f48157s;
    public boolean v;

    public s(Context context, Runnable runnable) {
        super(context);
        this.f48150a = new Rect();
        this.f48154f = true;
        this.f48151b = runnable;
        if (f48149w == null) {
            f48149w = new p(context.getApplicationContext());
        }
        this.f48152c = f48149w.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        q qVar;
        if (this.f48153e && !this.f48154f) {
            this.f48151b.run();
            if (this.d != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f48150a)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.d;
                if (z10) {
                    qVar = new q(this.f48155n, this.f48156r, this.f48157s, this.v);
                } else {
                    qVar = null;
                }
                rVar.f48142e = qVar;
                f48149w.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48153e = true;
        setPaused(this.f48154f);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.h = false;
        this.f48153e = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.h = false;
        int i12 = this.f48152c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.f48152c);
        this.d = rVar;
        p pVar = f48149w;
        pVar.f48123e.add(rVar);
        pVar.f48124f = (r[]) pVar.f48123e.toArray(new r[0]);
        pVar.c();
        setPaused(this.f48154f);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.h = false;
        r rVar = this.d;
        this.d = null;
        if (rVar != null) {
            p pVar = f48149w;
            pVar.getClass();
            rVar.f48141c = false;
            pVar.f48123e.remove(rVar);
            pVar.f48124f = (r[]) pVar.f48123e.toArray(new r[0]);
            pVar.f48121b.post(new w1(20, pVar, rVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.f48152c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i10 = this.f48152c;
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
        this.f48154f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f48153e && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.d;
        if (rVar != null) {
            rVar.f48142e = null;
            f48149w.c();
        }
    }
}

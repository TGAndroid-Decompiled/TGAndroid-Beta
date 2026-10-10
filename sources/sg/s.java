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
    public static p f48195w;
    public final Rect f48196a;
    public final Runnable f48197b;
    public final int f48198c;
    public r d;
    public boolean f48199e;
    public boolean f48200f;
    public boolean h;
    public float f48201n;
    public float f48202r;
    public boolean f48203s;
    public boolean v;

    public s(Context context, Runnable runnable) {
        super(context);
        this.f48196a = new Rect();
        this.f48200f = true;
        this.f48197b = runnable;
        if (f48195w == null) {
            f48195w = new p(context.getApplicationContext());
        }
        this.f48198c = f48195w.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        q qVar;
        if (this.f48199e && !this.f48200f) {
            this.f48197b.run();
            if (this.d != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f48196a)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.d;
                if (z10) {
                    qVar = new q(this.f48201n, this.f48202r, this.f48203s, this.v);
                } else {
                    qVar = null;
                }
                rVar.f48188e = qVar;
                f48195w.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48199e = true;
        setPaused(this.f48200f);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.h = false;
        this.f48199e = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.h = false;
        int i12 = this.f48198c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.f48198c);
        this.d = rVar;
        p pVar = f48195w;
        pVar.f48169e.add(rVar);
        pVar.f48170f = (r[]) pVar.f48169e.toArray(new r[0]);
        pVar.c();
        setPaused(this.f48200f);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.h = false;
        r rVar = this.d;
        this.d = null;
        if (rVar != null) {
            p pVar = f48195w;
            pVar.getClass();
            rVar.f48187c = false;
            pVar.f48169e.remove(rVar);
            pVar.f48170f = (r[]) pVar.f48169e.toArray(new r[0]);
            pVar.f48167b.post(new w1(20, pVar, rVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.f48198c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i10 = this.f48198c;
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
        this.f48200f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f48199e && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.d;
        if (rVar != null) {
            rVar.f48188e = null;
            f48195w.c();
        }
    }
}

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
    public static p f48390w;
    public final Rect f48391a;
    public final Runnable f48392b;
    public final int f48393c;
    public r d;
    public boolean f48394e;
    public boolean f48395f;
    public boolean h;
    public float f48396n;
    public float f48397r;
    public boolean f48398s;
    public boolean v;

    public s(Context context, Runnable runnable) {
        super(context);
        this.f48391a = new Rect();
        this.f48395f = true;
        this.f48392b = runnable;
        if (f48390w == null) {
            f48390w = new p(context.getApplicationContext());
        }
        this.f48393c = f48390w.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        q qVar;
        if (this.f48394e && !this.f48395f) {
            this.f48392b.run();
            if (this.d != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f48391a)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.d;
                if (z10) {
                    qVar = new q(this.f48396n, this.f48397r, this.f48398s, this.v);
                } else {
                    qVar = null;
                }
                rVar.f48383e = qVar;
                f48390w.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48394e = true;
        setPaused(this.f48395f);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.h = false;
        this.f48394e = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.h = false;
        int i12 = this.f48393c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.f48393c);
        this.d = rVar;
        p pVar = f48390w;
        pVar.f48364e.add(rVar);
        pVar.f48365f = (r[]) pVar.f48364e.toArray(new r[0]);
        pVar.c();
        setPaused(this.f48395f);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.h = false;
        r rVar = this.d;
        this.d = null;
        if (rVar != null) {
            p pVar = f48390w;
            pVar.getClass();
            rVar.f48382c = false;
            pVar.f48364e.remove(rVar);
            pVar.f48365f = (r[]) pVar.f48364e.toArray(new r[0]);
            pVar.f48362b.post(new f2(24, pVar, rVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.f48393c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i10 = this.f48393c;
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
        this.f48395f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f48394e && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.d;
        if (rVar != null) {
            rVar.f48383e = null;
            f48390w.c();
        }
    }
}

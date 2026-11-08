package vg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
public abstract class r extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final o[] f57488y = new o[3];
    public final o f57489a;
    public final Rect f57490b;
    public final Runnable f57491c;
    public final int d;
    public q f57492e;
    public boolean f57493f;
    public boolean h;
    public boolean f57494n;
    public float f57495r;
    public float f57496s;
    public boolean f57497w;
    public boolean f57498x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f57490b = new Rect();
        this.h = true;
        this.f57491c = runnable;
        o[] oVarArr = f57488y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f57489a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z9;
        p pVar;
        if (this.f57493f && !this.h) {
            this.f57491c.run();
            if (this.f57492e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f57490b)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q qVar = this.f57492e;
                if (z9) {
                    pVar = new p(this.f57495r, this.f57496s, this.f57497w, this.f57498x);
                } else {
                    pVar = null;
                }
                qVar.f57481e = pVar;
                this.f57489a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57493f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f57494n = false;
        this.f57493f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f57494n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f57492e = qVar;
        o oVar = this.f57489a;
        oVar.f57462f.add(qVar);
        oVar.f57463g = (q[]) oVar.f57462f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f57494n = false;
        q qVar = this.f57492e;
        this.f57492e = null;
        if (qVar != null) {
            o oVar = this.f57489a;
            oVar.getClass();
            qVar.f57480c = false;
            oVar.f57462f.remove(qVar);
            oVar.f57463g = (q[]) oVar.f57462f.toArray(new q[0]);
            oVar.f57459b.post(new u9.f(12, oVar, qVar));
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
        q qVar;
        int i7 = this.d;
        surfaceTexture.setDefaultBufferSize(i7, i7);
        if (!this.f57494n && (qVar = this.f57492e) != null && qVar.d) {
            this.f57494n = true;
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setPaused(boolean z9) {
        this.h = z9;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f57493f && !z9) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f57492e;
        if (qVar != null) {
            qVar.f57481e = null;
            this.f57489a.c();
        }
    }
}

package wg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
public abstract class r extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final o[] f57744y = new o[3];
    public final o f57745a;
    public final Rect f57746b;
    public final Runnable f57747c;
    public final int d;
    public q f57748e;
    public boolean f57749f;
    public boolean h;
    public boolean f57750n;
    public float f57751r;
    public float f57752s;
    public boolean f57753w;
    public boolean f57754x;

    public r(Context context, Runnable runnable, int i3) {
        super(context);
        this.f57746b = new Rect();
        this.h = true;
        this.f57747c = runnable;
        o[] oVarArr = f57744y;
        if (oVarArr[i3] == null) {
            oVarArr[i3] = new o(context.getApplicationContext(), i3);
        }
        o oVar = oVarArr[i3];
        this.f57745a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        p pVar;
        if (this.f57749f && !this.h) {
            this.f57747c.run();
            if (this.f57748e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f57746b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q qVar = this.f57748e;
                if (z10) {
                    pVar = new p(this.f57751r, this.f57752s, this.f57753w, this.f57754x);
                } else {
                    pVar = null;
                }
                qVar.f57737e = pVar;
                this.f57745a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57749f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f57750n = false;
        this.f57749f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        this.f57750n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f57748e = qVar;
        o oVar = this.f57745a;
        oVar.f57718f.add(qVar);
        oVar.f57719g = (q[]) oVar.f57718f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f57750n = false;
        q qVar = this.f57748e;
        this.f57748e = null;
        if (qVar != null) {
            o oVar = this.f57745a;
            oVar.getClass();
            qVar.f57736c = false;
            oVar.f57718f.remove(qVar);
            oVar.f57719g = (q[]) oVar.f57718f.toArray(new q[0]);
            oVar.f57715b.post(new u9.a(17, oVar, qVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        q qVar;
        int i3 = this.d;
        surfaceTexture.setDefaultBufferSize(i3, i3);
        if (!this.f57750n && (qVar = this.f57748e) != null && qVar.d) {
            this.f57750n = true;
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
        if (this.f57749f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f57748e;
        if (qVar != null) {
            qVar.f57737e = null;
            this.f57745a.c();
        }
    }
}

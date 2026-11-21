package vg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import p4.z;
public abstract class r extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final o[] f59579y = new o[3];
    public final o f59580a;
    public final Rect f59581b;
    public final Runnable f59582c;
    public final int d;
    public q f59583e;
    public boolean f59584f;
    public boolean h;
    public boolean f59585n;
    public float f59586r;
    public float f59587s;
    public boolean f59588w;
    public boolean f59589x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f59581b = new Rect();
        this.h = true;
        this.f59582c = runnable;
        o[] oVarArr = f59579y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f59580a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        p pVar;
        if (this.f59584f && !this.h) {
            this.f59582c.run();
            if (this.f59583e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f59581b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q qVar = this.f59583e;
                if (z10) {
                    pVar = new p(this.f59586r, this.f59587s, this.f59588w, this.f59589x);
                } else {
                    pVar = null;
                }
                qVar.f59572e = pVar;
                this.f59580a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59584f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f59585n = false;
        this.f59584f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f59585n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f59583e = qVar;
        o oVar = this.f59580a;
        oVar.f59553f.add(qVar);
        oVar.f59554g = (q[]) oVar.f59553f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f59585n = false;
        q qVar = this.f59583e;
        this.f59583e = null;
        if (qVar != null) {
            o oVar = this.f59580a;
            oVar.getClass();
            qVar.f59571c = false;
            oVar.f59553f.remove(qVar);
            oVar.f59554g = (q[]) oVar.f59553f.toArray(new q[0]);
            oVar.f59550b.post(new z(28, oVar, qVar));
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
        if (!this.f59585n && (qVar = this.f59583e) != null && qVar.d) {
            this.f59585n = true;
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
        if (this.f59584f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f59583e;
        if (qVar != null) {
            qVar.f59572e = null;
            this.f59580a.c();
        }
    }
}

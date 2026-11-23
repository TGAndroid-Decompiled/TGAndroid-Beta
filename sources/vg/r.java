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
    public static final o[] f59583y = new o[3];
    public final o f59584a;
    public final Rect f59585b;
    public final Runnable f59586c;
    public final int d;
    public q f59587e;
    public boolean f59588f;
    public boolean h;
    public boolean f59589n;
    public float f59590r;
    public float f59591s;
    public boolean f59592w;
    public boolean f59593x;

    public r(Context context, Runnable runnable, int i7) {
        super(context);
        this.f59585b = new Rect();
        this.h = true;
        this.f59586c = runnable;
        o[] oVarArr = f59583y;
        if (oVarArr[i7] == null) {
            oVarArr[i7] = new o(context.getApplicationContext(), i7);
        }
        o oVar = oVarArr[i7];
        this.f59584a = oVar;
        this.d = oVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        p pVar;
        if (this.f59588f && !this.h) {
            this.f59586c.run();
            if (this.f59587e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f59585b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q qVar = this.f59587e;
                if (z10) {
                    pVar = new p(this.f59590r, this.f59591s, this.f59592w, this.f59593x);
                } else {
                    pVar = null;
                }
                qVar.f59576e = pVar;
                this.f59584a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59588f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f59589n = false;
        this.f59588f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f59589n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        q qVar = new q(this, new Surface(surfaceTexture), this.d);
        this.f59587e = qVar;
        o oVar = this.f59584a;
        oVar.f59557f.add(qVar);
        oVar.f59558g = (q[]) oVar.f59557f.toArray(new q[0]);
        oVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f59589n = false;
        q qVar = this.f59587e;
        this.f59587e = null;
        if (qVar != null) {
            o oVar = this.f59584a;
            oVar.getClass();
            qVar.f59575c = false;
            oVar.f59557f.remove(qVar);
            oVar.f59558g = (q[]) oVar.f59557f.toArray(new q[0]);
            oVar.f59554b.post(new z(28, oVar, qVar));
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
        if (!this.f59589n && (qVar = this.f59587e) != null && qVar.d) {
            this.f59589n = true;
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
        if (this.f59588f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        q qVar = this.f59587e;
        if (qVar != null) {
            qVar.f59576e = null;
            this.f59584a.c();
        }
    }
}

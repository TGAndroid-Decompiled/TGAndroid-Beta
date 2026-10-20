package tg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
public abstract class t extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final q[] f47183x = new q[3];
    public final q f47184a;
    public final Rect f47185b;
    public final Runnable f47186c;
    public final int d;
    public s e;
    public boolean f47187f;
    public boolean h;
    public boolean f47188n;
    public float f47189r;
    public float f47190s;
    public boolean v;
    public boolean f47191w;

    public t(Context context, Runnable runnable, int i10) {
        super(context);
        this.f47185b = new Rect();
        this.h = true;
        this.f47186c = runnable;
        q[] qVarArr = f47183x;
        if (qVarArr[i10] == null) {
            qVarArr[i10] = new q(context.getApplicationContext(), i10);
        }
        q qVar = qVarArr[i10];
        this.f47184a = qVar;
        this.d = qVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        r rVar;
        if (this.f47187f && !this.h) {
            this.f47186c.run();
            if (this.e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f47185b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s sVar = this.e;
                if (z10) {
                    rVar = new r(this.f47189r, this.f47190s, this.v, this.f47191w);
                } else {
                    rVar = null;
                }
                sVar.e = rVar;
                this.f47184a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47187f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f47188n = false;
        this.f47187f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f47188n = false;
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        s sVar = new s(this, new Surface(surfaceTexture), this.d);
        this.e = sVar;
        q qVar = this.f47184a;
        qVar.f47158f.add(sVar);
        qVar.f47159g = (s[]) qVar.f47158f.toArray(new s[0]);
        qVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f47188n = false;
        s sVar = this.e;
        this.e = null;
        if (sVar != null) {
            q qVar = this.f47184a;
            qVar.getClass();
            sVar.f47176c = false;
            qVar.f47158f.remove(sVar);
            qVar.f47159g = (s[]) qVar.f47158f.toArray(new s[0]);
            qVar.f47156b.post(new p2.b(29, qVar, sVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        s sVar;
        int i10 = this.d;
        surfaceTexture.setDefaultBufferSize(i10, i10);
        if (!this.f47188n && (sVar = this.e) != null && sVar.d) {
            this.f47188n = true;
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
        if (this.f47187f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        s sVar = this.e;
        if (sVar != null) {
            sVar.e = null;
            this.f47184a.c();
        }
    }
}

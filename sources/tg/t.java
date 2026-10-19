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
    public static final q[] f47178x = new q[3];
    public final q f47179a;
    public final Rect f47180b;
    public final Runnable f47181c;
    public final int d;
    public s e;
    public boolean f47182f;
    public boolean h;
    public boolean f47183n;
    public float f47184r;
    public float f47185s;
    public boolean v;
    public boolean f47186w;

    public t(Context context, Runnable runnable, int i10) {
        super(context);
        this.f47180b = new Rect();
        this.h = true;
        this.f47181c = runnable;
        q[] qVarArr = f47178x;
        if (qVarArr[i10] == null) {
            qVarArr[i10] = new q(context.getApplicationContext(), i10);
        }
        q qVar = qVarArr[i10];
        this.f47179a = qVar;
        this.d = qVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        r rVar;
        if (this.f47182f && !this.h) {
            this.f47181c.run();
            if (this.e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f47180b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s sVar = this.e;
                if (z10) {
                    rVar = new r(this.f47184r, this.f47185s, this.v, this.f47186w);
                } else {
                    rVar = null;
                }
                sVar.e = rVar;
                this.f47179a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47182f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f47183n = false;
        this.f47182f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f47183n = false;
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        s sVar = new s(this, new Surface(surfaceTexture), this.d);
        this.e = sVar;
        q qVar = this.f47179a;
        qVar.f47153f.add(sVar);
        qVar.f47154g = (s[]) qVar.f47153f.toArray(new s[0]);
        qVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f47183n = false;
        s sVar = this.e;
        this.e = null;
        if (sVar != null) {
            q qVar = this.f47179a;
            qVar.getClass();
            sVar.f47171c = false;
            qVar.f47153f.remove(sVar);
            qVar.f47154g = (s[]) qVar.f47153f.toArray(new s[0]);
            qVar.f47151b.post(new p2.b(27, qVar, sVar));
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
        if (!this.f47183n && (sVar = this.e) != null && sVar.d) {
            this.f47183n = true;
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
        if (this.f47182f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        s sVar = this.e;
        if (sVar != null) {
            sVar.e = null;
            this.f47179a.c();
        }
    }
}

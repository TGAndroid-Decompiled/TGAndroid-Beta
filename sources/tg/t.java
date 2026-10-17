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
    public static final q[] f47199x = new q[3];
    public final q f47200a;
    public final Rect f47201b;
    public final Runnable f47202c;
    public final int d;
    public s e;
    public boolean f47203f;
    public boolean h;
    public boolean f47204n;
    public float f47205r;
    public float f47206s;
    public boolean v;
    public boolean f47207w;

    public t(Context context, Runnable runnable, int i10) {
        super(context);
        this.f47201b = new Rect();
        this.h = true;
        this.f47202c = runnable;
        q[] qVarArr = f47199x;
        if (qVarArr[i10] == null) {
            qVarArr[i10] = new q(context.getApplicationContext(), i10);
        }
        q qVar = qVarArr[i10];
        this.f47200a = qVar;
        this.d = qVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        r rVar;
        if (this.f47203f && !this.h) {
            this.f47202c.run();
            if (this.e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f47201b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s sVar = this.e;
                if (z10) {
                    rVar = new r(this.f47205r, this.f47206s, this.v, this.f47207w);
                } else {
                    rVar = null;
                }
                sVar.e = rVar;
                this.f47200a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47203f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f47204n = false;
        this.f47203f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f47204n = false;
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        s sVar = new s(this, new Surface(surfaceTexture), this.d);
        this.e = sVar;
        q qVar = this.f47200a;
        qVar.f47174f.add(sVar);
        qVar.f47175g = (s[]) qVar.f47174f.toArray(new s[0]);
        qVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f47204n = false;
        s sVar = this.e;
        this.e = null;
        if (sVar != null) {
            q qVar = this.f47200a;
            qVar.getClass();
            sVar.f47192c = false;
            qVar.f47174f.remove(sVar);
            qVar.f47175g = (s[]) qVar.f47174f.toArray(new s[0]);
            qVar.f47172b.post(new p2.b(27, qVar, sVar));
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
        if (!this.f47204n && (sVar = this.e) != null && sVar.d) {
            this.f47204n = true;
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
        if (this.f47203f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        s sVar = this.e;
        if (sVar != null) {
            sVar.e = null;
            this.f47200a.c();
        }
    }
}

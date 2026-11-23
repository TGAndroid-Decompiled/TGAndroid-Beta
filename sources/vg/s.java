package vg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import p4.o0;
public abstract class s extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final p[] f59548y = new p[3];
    public final p f59549a;
    public final Rect f59550b;
    public final Runnable f59551c;
    public final int d;
    public r f59552e;
    public boolean f59553f;
    public boolean h;
    public boolean f59554n;
    public float f59555r;
    public float f59556s;
    public boolean f59557w;
    public boolean f59558x;

    public s(Context context, Runnable runnable, int i7) {
        super(context);
        this.f59550b = new Rect();
        this.h = true;
        this.f59551c = runnable;
        p[] pVarArr = f59548y;
        if (pVarArr[i7] == null) {
            pVarArr[i7] = new p(context.getApplicationContext(), i7);
        }
        p pVar = pVarArr[i7];
        this.f59549a = pVar;
        this.d = pVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j3) {
        boolean z10;
        q qVar;
        if (this.f59553f && !this.h) {
            this.f59551c.run();
            if (this.f59552e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f59550b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = this.f59552e;
                if (z10) {
                    qVar = new q(this.f59555r, this.f59556s, this.f59557w, this.f59558x);
                } else {
                    qVar = null;
                }
                rVar.f59541e = qVar;
                this.f59549a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59553f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f59554n = false;
        this.f59553f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f59554n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
        r rVar = new r(this, new Surface(surfaceTexture), this.d);
        this.f59552e = rVar;
        p pVar = this.f59549a;
        pVar.f59522f.add(rVar);
        pVar.f59523g = (r[]) pVar.f59522f.toArray(new r[0]);
        pVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f59554n = false;
        r rVar = this.f59552e;
        this.f59552e = null;
        if (rVar != null) {
            p pVar = this.f59549a;
            pVar.getClass();
            rVar.f59540c = false;
            pVar.f59522f.remove(rVar);
            pVar.f59523g = (r[]) pVar.f59522f.toArray(new r[0]);
            pVar.f59519b.post(new o0(26, pVar, rVar));
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
        r rVar;
        int i7 = this.d;
        surfaceTexture.setDefaultBufferSize(i7, i7);
        if (!this.f59554n && (rVar = this.f59552e) != null && rVar.d) {
            this.f59554n = true;
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
        if (this.f59553f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.f59552e;
        if (rVar != null) {
            rVar.f59541e = null;
            this.f59549a.c();
        }
    }
}

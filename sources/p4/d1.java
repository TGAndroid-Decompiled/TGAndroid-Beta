package p4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
public final class d1 implements SurfaceHolder {
    public final Surface f55226a;
    public final Rect f55227b;
    public SurfaceHolder.Callback f55228c;

    public d1(Surface surface) {
        this.f55227b = new Rect();
        this.f55226a = surface;
    }

    @Override
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.f55228c = callback;
    }

    @Override
    public final Surface getSurface() {
        return this.f55226a;
    }

    @Override
    public final Rect getSurfaceFrame() {
        return this.f55227b;
    }

    @Override
    public final boolean isCreating() {
        return false;
    }

    @Override
    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void removeCallback(SurfaceHolder.Callback callback) {
        if (this.f55228c == callback) {
            this.f55228c = null;
        }
    }

    @Override
    public final void setFixedSize(int i7, int i10) {
        this.f55227b.set(0, 0, i7, i10);
        SurfaceHolder.Callback callback = this.f55228c;
        if (callback != null) {
            callback.surfaceChanged(this, 1, i7, i10);
        }
    }

    @Override
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    public d1(Surface surface, int i7, int i10) {
        Rect rect = new Rect();
        this.f55227b = rect;
        this.f55226a = surface;
        rect.set(0, 0, i7, i10);
    }

    @Override
    public final void setSizeFromLayout() {
    }

    @Override
    public final void setFormat(int i7) {
    }

    @Override
    public final void setKeepScreenOn(boolean z10) {
    }

    @Override
    public final void setType(int i7) {
    }

    @Override
    public final void unlockCanvasAndPost(Canvas canvas) {
    }
}

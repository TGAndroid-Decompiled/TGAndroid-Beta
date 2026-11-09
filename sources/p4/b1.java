package p4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
public final class b1 implements SurfaceHolder {
    public final Surface f53186a;
    public final Rect f53187b;
    public SurfaceHolder.Callback f53188c;

    public b1(Surface surface) {
        this.f53187b = new Rect();
        this.f53186a = surface;
    }

    @Override
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.f53188c = callback;
    }

    @Override
    public final Surface getSurface() {
        return this.f53186a;
    }

    @Override
    public final Rect getSurfaceFrame() {
        return this.f53187b;
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
        if (this.f53188c == callback) {
            this.f53188c = null;
        }
    }

    @Override
    public final void setFixedSize(int i7, int i10) {
        this.f53187b.set(0, 0, i7, i10);
        SurfaceHolder.Callback callback = this.f53188c;
        if (callback != null) {
            callback.surfaceChanged(this, 1, i7, i10);
        }
    }

    @Override
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    public b1(Surface surface, int i7, int i10) {
        Rect rect = new Rect();
        this.f53187b = rect;
        this.f53186a = surface;
        rect.set(0, 0, i7, i10);
    }

    @Override
    public final void setSizeFromLayout() {
    }

    @Override
    public final void setFormat(int i7) {
    }

    @Override
    public final void setKeepScreenOn(boolean z9) {
    }

    @Override
    public final void setType(int i7) {
    }

    @Override
    public final void unlockCanvasAndPost(Canvas canvas) {
    }
}

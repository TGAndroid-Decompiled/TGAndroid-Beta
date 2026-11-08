package p4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
public final class b1 implements SurfaceHolder {
    public final Surface f53173a;
    public final Rect f53174b;
    public SurfaceHolder.Callback f53175c;

    public b1(Surface surface) {
        this.f53174b = new Rect();
        this.f53173a = surface;
    }

    @Override
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.f53175c = callback;
    }

    @Override
    public final Surface getSurface() {
        return this.f53173a;
    }

    @Override
    public final Rect getSurfaceFrame() {
        return this.f53174b;
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
        if (this.f53175c == callback) {
            this.f53175c = null;
        }
    }

    @Override
    public final void setFixedSize(int i7, int i10) {
        this.f53174b.set(0, 0, i7, i10);
        SurfaceHolder.Callback callback = this.f53175c;
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
        this.f53174b = rect;
        this.f53173a = surface;
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

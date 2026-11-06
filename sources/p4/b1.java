package p4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
public final class b1 implements SurfaceHolder {
    public final Surface f53082a;
    public final Rect f53083b;
    public SurfaceHolder.Callback f53084c;

    public b1(Surface surface) {
        this.f53083b = new Rect();
        this.f53082a = surface;
    }

    @Override
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.f53084c = callback;
    }

    @Override
    public final Surface getSurface() {
        return this.f53082a;
    }

    @Override
    public final Rect getSurfaceFrame() {
        return this.f53083b;
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
        if (this.f53084c == callback) {
            this.f53084c = null;
        }
    }

    @Override
    public final void setFixedSize(int i7, int i10) {
        this.f53083b.set(0, 0, i7, i10);
        SurfaceHolder.Callback callback = this.f53084c;
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
        this.f53083b = rect;
        this.f53082a = surface;
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

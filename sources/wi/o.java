package wi;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class o extends TextureView implements TextureView.SurfaceTextureListener {
    public SurfaceTexture f60038a;
    public TextureView.SurfaceTextureListener f60039b;
    public Runnable f60040c;
    public long d;

    public o(Activity activity) {
        super(activity);
        setOpaque(false);
        super.setSurfaceTextureListener(this);
    }

    @Override
    public final void onAttachedToWindow() {
        if (this.f60038a != null) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.f60038a;
            if (surfaceTexture != surfaceTexture2) {
                setSurfaceTexture(surfaceTexture2);
            }
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f60038a = surfaceTexture;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f60039b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == this.f60038a) {
            post(new wg.q(9, this, surfaceTexture));
            return false;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f60039b;
        if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f60039b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f60039b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        if (this.f60040c != null) {
            if (this.d == 0 || surfaceTexture.getTimestamp() != this.d) {
                Runnable runnable = this.f60040c;
                this.f60040c = null;
                runnable.run();
            }
        }
    }

    public void setFirstFrameCallback(Runnable runnable) {
        long j3;
        this.f60040c = runnable;
        SurfaceTexture surfaceTexture = this.f60038a;
        if (surfaceTexture != null) {
            j3 = surfaceTexture.getTimestamp();
        } else {
            j3 = 0;
        }
        this.d = j3;
    }

    @Override
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f60039b = surfaceTextureListener;
    }
}

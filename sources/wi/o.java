package wi;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import wg.r;
public final class o extends TextureView implements TextureView.SurfaceTextureListener {
    public SurfaceTexture f59993a;
    public TextureView.SurfaceTextureListener f59994b;
    public Runnable f59995c;
    public long d;

    public o(Activity activity) {
        super(activity);
        setOpaque(false);
        super.setSurfaceTextureListener(this);
    }

    @Override
    public final void onAttachedToWindow() {
        if (this.f59993a != null) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.f59993a;
            if (surfaceTexture != surfaceTexture2) {
                setSurfaceTexture(surfaceTexture2);
            }
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f59993a = surfaceTexture;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f59994b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == this.f59993a) {
            post(new r(7, this, surfaceTexture));
            return false;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f59994b;
        if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f59994b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f59994b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        if (this.f59995c != null) {
            if (this.d == 0 || surfaceTexture.getTimestamp() != this.d) {
                Runnable runnable = this.f59995c;
                this.f59995c = null;
                runnable.run();
            }
        }
    }

    public void setFirstFrameCallback(Runnable runnable) {
        long j3;
        this.f59995c = runnable;
        SurfaceTexture surfaceTexture = this.f59993a;
        if (surfaceTexture != null) {
            j3 = surfaceTexture.getTimestamp();
        } else {
            j3 = 0;
        }
        this.d = j3;
    }

    @Override
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f59994b = surfaceTextureListener;
    }
}

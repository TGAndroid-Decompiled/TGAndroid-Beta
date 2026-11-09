package ti;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.web.s;
public final class p extends TextureView implements TextureView.SurfaceTextureListener {
    public SurfaceTexture f56141a;
    public TextureView.SurfaceTextureListener f56142b;
    public Runnable f56143c;
    public long d;

    public p(Activity activity) {
        super(activity);
        setOpaque(false);
        super.setSurfaceTextureListener(this);
    }

    @Override
    public final void onAttachedToWindow() {
        if (this.f56141a != null) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.f56141a;
            if (surfaceTexture != surfaceTexture2) {
                setSurfaceTexture(surfaceTexture2);
            }
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f56141a = surfaceTexture;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f56142b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == this.f56141a) {
            post(new s(26, this, surfaceTexture));
            return false;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f56142b;
        if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f56142b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f56142b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        if (this.f56143c != null) {
            if (this.d == 0 || surfaceTexture.getTimestamp() != this.d) {
                Runnable runnable = this.f56143c;
                this.f56143c = null;
                runnable.run();
            }
        }
    }

    public void setFirstFrameCallback(Runnable runnable) {
        long j3;
        this.f56143c = runnable;
        SurfaceTexture surfaceTexture = this.f56141a;
        if (surfaceTexture != null) {
            j3 = surfaceTexture.getTimestamp();
        } else {
            j3 = 0;
        }
        this.d = j3;
    }

    @Override
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f56142b = surfaceTextureListener;
    }
}

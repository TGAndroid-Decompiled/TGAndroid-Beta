package zh;

import android.graphics.Bitmap;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraView;
public final class z implements Runnable {
    public final b0 f52148a;

    public z(b0 b0Var) {
        this.f52148a = b0Var;
    }

    @Override
    public final void run() {
        b0 b0Var = this.f52148a;
        CameraView cameraView = b0Var.f51644b;
        if (b0Var.f51653h0 && cameraView != null) {
            TextureView textureView = cameraView.getTextureView();
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            if (width > 0 && height > 0) {
                if (width > 720 || height > 720) {
                    float f7 = width;
                    float f10 = height;
                    float min = Math.min(720.0f / f7, 720.0f / f10);
                    width = Math.max(1, (int) (f7 * min));
                    height = Math.max(1, (int) (f10 * min));
                }
                Bitmap bitmap = this.f52148a.f51656k0;
                if (bitmap == null || bitmap.getWidth() != width || this.f52148a.f51656k0.getHeight() != height) {
                    this.f52148a.f51656k0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                }
                try {
                    textureView.getBitmap(this.f52148a.f51656k0);
                    b0 b0Var2 = this.f52148a;
                    xf.c f11 = b0.f(b0Var2.f51656k0, b0Var2.f51654i0, b0Var2.f51655j0, b0Var2.O);
                    if (f11 != null) {
                        AndroidUtilities.runOnUIThread(new uf.c(24, this, f11));
                        return;
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f52148a.f51653h0) {
                this.f52148a.f51652g0.postDelayed(this, 150L);
            }
        }
    }
}

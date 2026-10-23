package zh;

import android.graphics.Bitmap;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraView;
public final class z implements Runnable {
    public final b0 f52159a;

    public z(b0 b0Var) {
        this.f52159a = b0Var;
    }

    @Override
    public final void run() {
        b0 b0Var = this.f52159a;
        CameraView cameraView = b0Var.f51655b;
        if (b0Var.f51664h0 && cameraView != null) {
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
                Bitmap bitmap = this.f52159a.f51667k0;
                if (bitmap == null || bitmap.getWidth() != width || this.f52159a.f51667k0.getHeight() != height) {
                    this.f52159a.f51667k0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                }
                try {
                    textureView.getBitmap(this.f52159a.f51667k0);
                    b0 b0Var2 = this.f52159a;
                    xf.c f11 = b0.f(b0Var2.f51667k0, b0Var2.f51665i0, b0Var2.f51666j0, b0Var2.O);
                    if (f11 != null) {
                        AndroidUtilities.runOnUIThread(new u2.j0(26, this, f11));
                        return;
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f52159a.f51664h0) {
                this.f52159a.f51663g0.postDelayed(this, 150L);
            }
        }
    }
}

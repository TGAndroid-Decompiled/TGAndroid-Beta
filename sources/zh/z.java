package zh;

import android.graphics.Bitmap;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraView;
public final class z implements Runnable {
    public final b0 f52620a;

    public z(b0 b0Var) {
        this.f52620a = b0Var;
    }

    @Override
    public final void run() {
        b0 b0Var = this.f52620a;
        CameraView cameraView = b0Var.f52116b;
        if (b0Var.f52125h0 && cameraView != null) {
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
                Bitmap bitmap = this.f52620a.f52128k0;
                if (bitmap == null || bitmap.getWidth() != width || this.f52620a.f52128k0.getHeight() != height) {
                    this.f52620a.f52128k0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                }
                try {
                    textureView.getBitmap(this.f52620a.f52128k0);
                    b0 b0Var2 = this.f52620a;
                    z4.b f11 = b0.f(b0Var2.f52128k0, b0Var2.f52126i0, b0Var2.f52127j0, b0Var2.O);
                    if (f11 != null) {
                        AndroidUtilities.runOnUIThread(new u2.k0(26, this, f11));
                        return;
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f52620a.f52125h0) {
                this.f52620a.f52124g0.postDelayed(this, 150L);
            }
        }
    }
}

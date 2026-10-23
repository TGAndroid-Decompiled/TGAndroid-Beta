package zh;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import w7.z5;
public final class v implements Runnable {
    public final int f52132a;
    public final b0 f52133b;

    public v(b0 b0Var, int i10) {
        this.f52132a = i10;
        this.f52133b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f52132a) {
            case 0:
                b0 b0Var = this.f52133b;
                b0Var.g();
                b0Var.f51653a.b(b0Var);
                return;
            case 1:
                b0 b0Var2 = this.f52133b;
                r8.n nVar = b0Var2.f51665i0;
                if (nVar != null) {
                    nVar.X0();
                    b0Var2.f51665i0 = null;
                }
                Bitmap bitmap = b0Var2.f51667k0;
                if (bitmap != null) {
                    bitmap.recycle();
                    b0Var2.f51667k0 = null;
                }
                b0Var2.f51662f0.quitSafely();
                return;
            case 2:
                b0 b0Var3 = this.f52133b;
                try {
                    Context context = ApplicationLoader.applicationContext;
                    ?? obj = new Object();
                    obj.f7389a = 256;
                    b0Var3.f51665i0 = new r8.n(new t2(context, (x1) obj));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                b0Var3.f51666j0 = new a6.i(23);
                return;
            default:
                b0 b0Var4 = this.f52133b;
                if (!b0Var4.V && !b0Var4.U && b0Var4.f51655b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(b0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new org.telegram.ui.web.m(26, b0Var4, cameraView));
                    b0Var4.f51655b = cameraView;
                    b0Var4.addView(cameraView, 0, z5.c(-1.0f, -1));
                    return;
                }
                return;
        }
    }
}

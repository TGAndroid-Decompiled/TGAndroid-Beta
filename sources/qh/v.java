package qh;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.f8;
import vh.w3;
import w7.b6;
public final class v implements Runnable {
    public final int f45795a;
    public final y f45796b;

    public v(y yVar, int i10) {
        this.f45795a = i10;
        this.f45796b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f45795a) {
            case 0:
                y yVar = this.f45796b;
                yVar.g();
                yVar.f46068a.o(yVar);
                return;
            case 1:
                y yVar2 = this.f45796b;
                r8.n nVar = yVar2.f46080i0;
                if (nVar != null) {
                    nVar.X0();
                    yVar2.f46080i0 = null;
                }
                Bitmap bitmap = yVar2.f46082k0;
                if (bitmap != null) {
                    bitmap.recycle();
                    yVar2.f46082k0 = null;
                }
                yVar2.f46077f0.quitSafely();
                return;
            case 2:
                y yVar3 = this.f45796b;
                try {
                    Context context = org.telegram.messenger.w0.f18945b;
                    ?? obj = new Object();
                    obj.f5383a = 256;
                    yVar3.f46080i0 = new r8.n(new t2(context, (x1) obj));
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
                yVar3.f46081j0 = new w3();
                return;
            default:
                y yVar4 = this.f45796b;
                if (!yVar4.V && !yVar4.U && yVar4.f46070b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(yVar4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new org.telegram.ui.web.k0(7, yVar4, cameraView));
                    yVar4.f46070b = cameraView;
                    yVar4.addView(cameraView, 0, b6.c(-1.0f, -1));
                    return;
                }
                return;
        }
    }
}

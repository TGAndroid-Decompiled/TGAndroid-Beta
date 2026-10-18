package zh;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import w7.z5;
public final class v implements Runnable {
    public final int f52155a;
    public final w f52156b;

    public v(w wVar, int i10) {
        this.f52155a = i10;
        this.f52156b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f52155a) {
            case 0:
                w wVar = this.f52156b;
                wVar.f();
                f0 f0Var = (f0) wVar.f52161a.f16010b;
                FrameLayout frameLayout = f0Var.f51756f;
                if (frameLayout != null) {
                    frameLayout.removeView(wVar);
                }
                if (f0Var.E == wVar) {
                    f0Var.E = null;
                }
                t0 t0Var = f0Var.d;
                if (t0Var != null) {
                    t0Var.setScanHidden(false);
                    return;
                }
                return;
            case 1:
                w wVar2 = this.f52156b;
                r8.n nVar = wVar2.f52166c0;
                if (nVar != null) {
                    nVar.X0();
                    wVar2.f52166c0 = null;
                }
                Bitmap bitmap = wVar2.f52168e0;
                if (bitmap != null) {
                    bitmap.recycle();
                    wVar2.f52168e0 = null;
                }
                wVar2.W.quitSafely();
                return;
            case 2:
                w wVar3 = this.f52156b;
                try {
                    Context context = ApplicationLoader.applicationContext;
                    ?? obj = new Object();
                    obj.f7392a = 256;
                    wVar3.f52166c0 = new r8.n(new t2(context, (x1) obj));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                wVar3.f52167d0 = new a6.i(23);
                return;
            default:
                w wVar4 = this.f52156b;
                if (!wVar4.Q && !wVar4.P && wVar4.f52163b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(wVar4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new org.telegram.ui.web.m(26, wVar4, cameraView));
                    wVar4.f52163b = cameraView;
                    wVar4.addView(cameraView, 0, z5.d(-1.0f, -1));
                    return;
                }
                return;
        }
    }
}

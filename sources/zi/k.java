package zi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class k extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f61546a;
    public final boolean f61547b;
    public boolean f61548c;
    public boolean d;
    public boolean f61549e;
    public final l f61550f;

    public k(l lVar, CameraDevice.StateCallback stateCallback, boolean z10) {
        this.f61550f = lVar;
        this.f61546a = stateCallback;
        this.f61547b = z10;
        lVar.f61612w0++;
    }

    public final void a() {
        l lVar = this.f61550f;
        boolean z10 = this.f61547b;
        if (z10) {
            if (lVar.f61610v0 != this) {
                return;
            }
        } else if (lVar.f61609u0 != this) {
            return;
        }
        if (z10) {
            lVar.f61610v0 = null;
        } else {
            lVar.f61609u0 = null;
        }
    }

    public final boolean b() {
        k kVar;
        if (!this.f61550f.f61607t0) {
            if (this.f61547b) {
                kVar = this.f61550f.f61610v0;
            } else {
                kVar = this.f61550f.f61609u0;
            }
            if (kVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f61548c) {
            this.f61548c = true;
            l lVar = this.f61550f;
            int i7 = lVar.f61612w0 - 1;
            lVar.f61612w0 = i7;
            HandlerThread handlerThread = lVar.f61614x0;
            if (i7 <= 0 && handlerThread != null) {
                lVar.f61614x0 = null;
                lVar.f61579j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f61549e && !this.f61550f.f61607t0) {
            this.f61546a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f61550f.f61607t0 && (this.d || b10)) {
            a();
            this.f61549e = true;
            this.f61546a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f61550f.f61607t0 && (this.d || b10)) {
            a();
            this.f61549e = true;
            this.f61546a.onError(cameraDevice, i7);
            return;
        }
        p pVar = this.f61550f.f61579j;
        pVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + l.e(i7) + ", warm=" + this.f61547b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            p pVar = this.f61550f.f61579j;
            pVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f61547b + ", released=" + this.f61550f.f61607t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f61549e = true;
        this.f61550f.f61601r0.add(cameraDevice);
        this.f61546a.onOpened(cameraDevice);
    }
}

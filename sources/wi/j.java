package wi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f57993a;
    public final boolean f57994b;
    public boolean f57995c;
    public boolean d;
    public boolean f57996e;
    public final k f57997f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z9) {
        this.f57997f = kVar;
        this.f57993a = stateCallback;
        this.f57994b = z9;
        kVar.f58062x0++;
    }

    public final void a() {
        k kVar = this.f57997f;
        boolean z9 = this.f57994b;
        if (z9) {
            if (kVar.f58060w0 != this) {
                return;
            }
        } else if (kVar.f58058v0 != this) {
            return;
        }
        if (z9) {
            kVar.f58060w0 = null;
        } else {
            kVar.f58058v0 = null;
        }
    }

    public final boolean b() {
        j jVar;
        if (!this.f57997f.f58057u0) {
            if (this.f57994b) {
                jVar = this.f57997f.f58060w0;
            } else {
                jVar = this.f57997f.f58058v0;
            }
            if (jVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f57995c) {
            this.f57995c = true;
            k kVar = this.f57997f;
            int i7 = kVar.f58062x0 - 1;
            kVar.f58062x0 = i7;
            HandlerThread handlerThread = kVar.f58064y0;
            if (i7 <= 0 && handlerThread != null) {
                kVar.f58064y0 = null;
                kVar.f58026j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f57996e && !this.f57997f.f58057u0) {
            this.f57993a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f57997f.f58057u0 && (this.d || b10)) {
            a();
            this.f57996e = true;
            this.f57993a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f57997f.f58057u0 && (this.d || b10)) {
            a();
            this.f57996e = true;
            this.f57993a.onError(cameraDevice, i7);
            return;
        }
        o oVar = this.f57997f.f58026j;
        oVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.f57994b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            o oVar = this.f57997f.f58026j;
            oVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f57994b + ", released=" + this.f57997f.f58057u0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f57996e = true;
        this.f57997f.f58051s0.add(cameraDevice);
        this.f57993a.onOpened(cameraDevice);
    }
}

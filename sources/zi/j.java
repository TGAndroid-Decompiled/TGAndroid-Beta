package zi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f62151a;
    public final boolean f62152b;
    public boolean f62153c;
    public boolean d;
    public boolean f62154e;
    public final k f62155f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z10) {
        this.f62155f = kVar;
        this.f62151a = stateCallback;
        this.f62152b = z10;
        kVar.f62217w0++;
    }

    public final void a() {
        k kVar = this.f62155f;
        boolean z10 = this.f62152b;
        if (z10) {
            if (kVar.f62215v0 != this) {
                return;
            }
        } else if (kVar.f62214u0 != this) {
            return;
        }
        if (z10) {
            kVar.f62215v0 = null;
        } else {
            kVar.f62214u0 = null;
        }
    }

    public final boolean b() {
        j jVar;
        if (!this.f62155f.f62212t0) {
            if (this.f62152b) {
                jVar = this.f62155f.f62215v0;
            } else {
                jVar = this.f62155f.f62214u0;
            }
            if (jVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f62153c) {
            this.f62153c = true;
            k kVar = this.f62155f;
            int i7 = kVar.f62217w0 - 1;
            kVar.f62217w0 = i7;
            HandlerThread handlerThread = kVar.f62219x0;
            if (i7 <= 0 && handlerThread != null) {
                kVar.f62219x0 = null;
                kVar.f62184j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f62154e && !this.f62155f.f62212t0) {
            this.f62151a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f62155f.f62212t0 && (this.d || b10)) {
            a();
            this.f62154e = true;
            this.f62151a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f62155f.f62212t0 && (this.d || b10)) {
            a();
            this.f62154e = true;
            this.f62151a.onError(cameraDevice, i7);
            return;
        }
        o oVar = this.f62155f.f62184j;
        oVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.f62152b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            o oVar = this.f62155f.f62184j;
            oVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f62152b + ", released=" + this.f62155f.f62212t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f62154e = true;
        this.f62155f.f62206r0.add(cameraDevice);
        this.f62151a.onOpened(cameraDevice);
    }
}

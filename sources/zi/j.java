package zi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f62155a;
    public final boolean f62156b;
    public boolean f62157c;
    public boolean d;
    public boolean f62158e;
    public final k f62159f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z10) {
        this.f62159f = kVar;
        this.f62155a = stateCallback;
        this.f62156b = z10;
        kVar.f62221w0++;
    }

    public final void a() {
        k kVar = this.f62159f;
        boolean z10 = this.f62156b;
        if (z10) {
            if (kVar.f62219v0 != this) {
                return;
            }
        } else if (kVar.f62218u0 != this) {
            return;
        }
        if (z10) {
            kVar.f62219v0 = null;
        } else {
            kVar.f62218u0 = null;
        }
    }

    public final boolean b() {
        j jVar;
        if (!this.f62159f.f62216t0) {
            if (this.f62156b) {
                jVar = this.f62159f.f62219v0;
            } else {
                jVar = this.f62159f.f62218u0;
            }
            if (jVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f62157c) {
            this.f62157c = true;
            k kVar = this.f62159f;
            int i7 = kVar.f62221w0 - 1;
            kVar.f62221w0 = i7;
            HandlerThread handlerThread = kVar.f62223x0;
            if (i7 <= 0 && handlerThread != null) {
                kVar.f62223x0 = null;
                kVar.f62188j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f62158e && !this.f62159f.f62216t0) {
            this.f62155a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f62159f.f62216t0 && (this.d || b10)) {
            a();
            this.f62158e = true;
            this.f62155a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f62159f.f62216t0 && (this.d || b10)) {
            a();
            this.f62158e = true;
            this.f62155a.onError(cameraDevice, i7);
            return;
        }
        o oVar = this.f62159f.f62188j;
        oVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.f62156b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            o oVar = this.f62159f.f62188j;
            oVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f62156b + ", released=" + this.f62159f.f62216t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f62158e = true;
        this.f62159f.f62210r0.add(cameraDevice);
        this.f62155a.onOpened(cameraDevice);
    }
}

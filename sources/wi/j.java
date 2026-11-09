package wi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f58003a;
    public final boolean f58004b;
    public boolean f58005c;
    public boolean d;
    public boolean f58006e;
    public final k f58007f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z9) {
        this.f58007f = kVar;
        this.f58003a = stateCallback;
        this.f58004b = z9;
        kVar.f58069w0++;
    }

    public final void a() {
        k kVar = this.f58007f;
        boolean z9 = this.f58004b;
        if (z9) {
            if (kVar.f58067v0 != this) {
                return;
            }
        } else if (kVar.f58066u0 != this) {
            return;
        }
        if (z9) {
            kVar.f58067v0 = null;
        } else {
            kVar.f58066u0 = null;
        }
    }

    public final boolean b() {
        j jVar;
        if (!this.f58007f.f58064t0) {
            if (this.f58004b) {
                jVar = this.f58007f.f58067v0;
            } else {
                jVar = this.f58007f.f58066u0;
            }
            if (jVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f58005c) {
            this.f58005c = true;
            k kVar = this.f58007f;
            int i7 = kVar.f58069w0 - 1;
            kVar.f58069w0 = i7;
            HandlerThread handlerThread = kVar.f58071x0;
            if (i7 <= 0 && handlerThread != null) {
                kVar.f58071x0 = null;
                kVar.f58036j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f58006e && !this.f58007f.f58064t0) {
            this.f58003a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f58007f.f58064t0 && (this.d || b10)) {
            a();
            this.f58006e = true;
            this.f58003a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f58007f.f58064t0 && (this.d || b10)) {
            a();
            this.f58006e = true;
            this.f58003a.onError(cameraDevice, i7);
            return;
        }
        o oVar = this.f58007f.f58036j;
        oVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.f58004b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            o oVar = this.f58007f.f58036j;
            oVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f58004b + ", released=" + this.f58007f.f58064t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f58006e = true;
        this.f58007f.f58058r0.add(cameraDevice);
        this.f58003a.onOpened(cameraDevice);
    }
}

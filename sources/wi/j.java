package wi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f58007a;
    public final boolean f58008b;
    public boolean f58009c;
    public boolean d;
    public boolean f58010e;
    public final k f58011f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z9) {
        this.f58011f = kVar;
        this.f58007a = stateCallback;
        this.f58008b = z9;
        kVar.f58073w0++;
    }

    public final void a() {
        k kVar = this.f58011f;
        boolean z9 = this.f58008b;
        if (z9) {
            if (kVar.f58071v0 != this) {
                return;
            }
        } else if (kVar.f58070u0 != this) {
            return;
        }
        if (z9) {
            kVar.f58071v0 = null;
        } else {
            kVar.f58070u0 = null;
        }
    }

    public final boolean b() {
        j jVar;
        if (!this.f58011f.f58068t0) {
            if (this.f58008b) {
                jVar = this.f58011f.f58071v0;
            } else {
                jVar = this.f58011f.f58070u0;
            }
            if (jVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f58009c) {
            this.f58009c = true;
            k kVar = this.f58011f;
            int i7 = kVar.f58073w0 - 1;
            kVar.f58073w0 = i7;
            HandlerThread handlerThread = kVar.f58075x0;
            if (i7 <= 0 && handlerThread != null) {
                kVar.f58075x0 = null;
                kVar.f58040j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f58010e && !this.f58011f.f58068t0) {
            this.f58007a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f58011f.f58068t0 && (this.d || b10)) {
            a();
            this.f58010e = true;
            this.f58007a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f58011f.f58068t0 && (this.d || b10)) {
            a();
            this.f58010e = true;
            this.f58007a.onError(cameraDevice, i7);
            return;
        }
        o oVar = this.f58011f.f58040j;
        oVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.f58008b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            o oVar = this.f58011f.f58040j;
            oVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f58008b + ", released=" + this.f58011f.f58068t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f58010e = true;
        this.f58011f.f58062r0.add(cameraDevice);
        this.f58007a.onOpened(cameraDevice);
    }
}

package zi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f62238a;
    public final boolean f62239b;
    public boolean f62240c;
    public boolean d;
    public boolean f62241e;
    public final k f62242f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z10) {
        this.f62242f = kVar;
        this.f62238a = stateCallback;
        this.f62239b = z10;
        kVar.f62304w0++;
    }

    public final void a() {
        k kVar = this.f62242f;
        boolean z10 = this.f62239b;
        if (z10) {
            if (kVar.f62302v0 != this) {
                return;
            }
        } else if (kVar.f62301u0 != this) {
            return;
        }
        if (z10) {
            kVar.f62302v0 = null;
        } else {
            kVar.f62301u0 = null;
        }
    }

    public final boolean b() {
        j jVar;
        if (!this.f62242f.f62299t0) {
            if (this.f62239b) {
                jVar = this.f62242f.f62302v0;
            } else {
                jVar = this.f62242f.f62301u0;
            }
            if (jVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f62240c) {
            this.f62240c = true;
            k kVar = this.f62242f;
            int i7 = kVar.f62304w0 - 1;
            kVar.f62304w0 = i7;
            HandlerThread handlerThread = kVar.f62306x0;
            if (i7 <= 0 && handlerThread != null) {
                kVar.f62306x0 = null;
                kVar.f62271j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f62241e && !this.f62242f.f62299t0) {
            this.f62238a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f62242f.f62299t0 && (this.d || b10)) {
            a();
            this.f62241e = true;
            this.f62238a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f62242f.f62299t0 && (this.d || b10)) {
            a();
            this.f62241e = true;
            this.f62238a.onError(cameraDevice, i7);
            return;
        }
        o oVar = this.f62242f.f62271j;
        oVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.f62239b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            o oVar = this.f62242f.f62271j;
            oVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f62239b + ", released=" + this.f62242f.f62299t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f62241e = true;
        this.f62242f.f62293r0.add(cameraDevice);
        this.f62238a.onOpened(cameraDevice);
    }
}

package zi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f62109a;
    public final boolean f62110b;
    public boolean f62111c;
    public boolean d;
    public boolean f62112e;
    public final k f62113f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z10) {
        this.f62113f = kVar;
        this.f62109a = stateCallback;
        this.f62110b = z10;
        kVar.f62175w0++;
    }

    public final void a() {
        k kVar = this.f62113f;
        boolean z10 = this.f62110b;
        if (z10) {
            if (kVar.f62173v0 != this) {
                return;
            }
        } else if (kVar.f62172u0 != this) {
            return;
        }
        if (z10) {
            kVar.f62173v0 = null;
        } else {
            kVar.f62172u0 = null;
        }
    }

    public final boolean b() {
        j jVar;
        if (!this.f62113f.f62170t0) {
            if (this.f62110b) {
                jVar = this.f62113f.f62173v0;
            } else {
                jVar = this.f62113f.f62172u0;
            }
            if (jVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f62111c) {
            this.f62111c = true;
            k kVar = this.f62113f;
            int i7 = kVar.f62175w0 - 1;
            kVar.f62175w0 = i7;
            HandlerThread handlerThread = kVar.f62177x0;
            if (i7 <= 0 && handlerThread != null) {
                kVar.f62177x0 = null;
                kVar.f62142j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f62112e && !this.f62113f.f62170t0) {
            this.f62109a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f62113f.f62170t0 && (this.d || b10)) {
            a();
            this.f62112e = true;
            this.f62109a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f62113f.f62170t0 && (this.d || b10)) {
            a();
            this.f62112e = true;
            this.f62109a.onError(cameraDevice, i7);
            return;
        }
        o oVar = this.f62113f.f62142j;
        oVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.f62110b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            o oVar = this.f62113f.f62142j;
            oVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f62110b + ", released=" + this.f62113f.f62170t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f62112e = true;
        this.f62113f.f62164r0.add(cameraDevice);
        this.f62109a.onOpened(cameraDevice);
    }
}

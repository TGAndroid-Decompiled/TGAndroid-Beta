package zi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f62110a;
    public final boolean f62111b;
    public boolean f62112c;
    public boolean d;
    public boolean f62113e;
    public final k f62114f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z10) {
        this.f62114f = kVar;
        this.f62110a = stateCallback;
        this.f62111b = z10;
        kVar.f62176w0++;
    }

    public final void a() {
        k kVar = this.f62114f;
        boolean z10 = this.f62111b;
        if (z10) {
            if (kVar.f62174v0 != this) {
                return;
            }
        } else if (kVar.f62173u0 != this) {
            return;
        }
        if (z10) {
            kVar.f62174v0 = null;
        } else {
            kVar.f62173u0 = null;
        }
    }

    public final boolean b() {
        j jVar;
        if (!this.f62114f.f62171t0) {
            if (this.f62111b) {
                jVar = this.f62114f.f62174v0;
            } else {
                jVar = this.f62114f.f62173u0;
            }
            if (jVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f62112c) {
            this.f62112c = true;
            k kVar = this.f62114f;
            int i7 = kVar.f62176w0 - 1;
            kVar.f62176w0 = i7;
            HandlerThread handlerThread = kVar.f62178x0;
            if (i7 <= 0 && handlerThread != null) {
                kVar.f62178x0 = null;
                kVar.f62143j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f62113e && !this.f62114f.f62171t0) {
            this.f62110a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f62114f.f62171t0 && (this.d || b10)) {
            a();
            this.f62113e = true;
            this.f62110a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f62114f.f62171t0 && (this.d || b10)) {
            a();
            this.f62113e = true;
            this.f62110a.onError(cameraDevice, i7);
            return;
        }
        o oVar = this.f62114f.f62143j;
        oVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.f62111b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            o oVar = this.f62114f.f62143j;
            oVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f62111b + ", released=" + this.f62114f.f62171t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f62113e = true;
        this.f62114f.f62165r0.add(cameraDevice);
        this.f62110a.onOpened(cameraDevice);
    }
}

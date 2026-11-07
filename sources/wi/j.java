package wi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f57898a;
    public final boolean f57899b;
    public boolean f57900c;
    public boolean d;
    public boolean f57901e;
    public final k f57902f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z9) {
        this.f57902f = kVar;
        this.f57898a = stateCallback;
        this.f57899b = z9;
        kVar.f57966x0++;
    }

    public final void a() {
        k kVar = this.f57902f;
        boolean z9 = this.f57899b;
        if (z9) {
            if (kVar.f57964w0 != this) {
                return;
            }
        } else if (kVar.f57962v0 != this) {
            return;
        }
        if (z9) {
            kVar.f57964w0 = null;
        } else {
            kVar.f57962v0 = null;
        }
    }

    public final boolean b() {
        j jVar;
        if (!this.f57902f.f57961u0) {
            if (this.f57899b) {
                jVar = this.f57902f.f57964w0;
            } else {
                jVar = this.f57902f.f57962v0;
            }
            if (jVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f57900c) {
            this.f57900c = true;
            k kVar = this.f57902f;
            int i7 = kVar.f57966x0 - 1;
            kVar.f57966x0 = i7;
            HandlerThread handlerThread = kVar.f57968y0;
            if (i7 <= 0 && handlerThread != null) {
                kVar.f57968y0 = null;
                kVar.f57930j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f57901e && !this.f57902f.f57961u0) {
            this.f57898a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f57902f.f57961u0 && (this.d || b10)) {
            a();
            this.f57901e = true;
            this.f57898a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f57902f.f57961u0 && (this.d || b10)) {
            a();
            this.f57901e = true;
            this.f57898a.onError(cameraDevice, i7);
            return;
        }
        o oVar = this.f57902f.f57930j;
        oVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.f57899b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            o oVar = this.f57902f.f57930j;
            oVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f57899b + ", released=" + this.f57902f.f57961u0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f57901e = true;
        this.f57902f.f57955s0.add(cameraDevice);
        this.f57898a.onOpened(cameraDevice);
    }
}

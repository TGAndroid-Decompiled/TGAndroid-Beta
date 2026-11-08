package wi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f57992a;
    public final boolean f57993b;
    public boolean f57994c;
    public boolean d;
    public boolean f57995e;
    public final k f57996f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z9) {
        this.f57996f = kVar;
        this.f57992a = stateCallback;
        this.f57993b = z9;
        kVar.f58061x0++;
    }

    public final void a() {
        k kVar = this.f57996f;
        boolean z9 = this.f57993b;
        if (z9) {
            if (kVar.f58059w0 != this) {
                return;
            }
        } else if (kVar.f58057v0 != this) {
            return;
        }
        if (z9) {
            kVar.f58059w0 = null;
        } else {
            kVar.f58057v0 = null;
        }
    }

    public final boolean b() {
        j jVar;
        if (!this.f57996f.f58056u0) {
            if (this.f57993b) {
                jVar = this.f57996f.f58059w0;
            } else {
                jVar = this.f57996f.f58057v0;
            }
            if (jVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f57994c) {
            this.f57994c = true;
            k kVar = this.f57996f;
            int i7 = kVar.f58061x0 - 1;
            kVar.f58061x0 = i7;
            HandlerThread handlerThread = kVar.f58063y0;
            if (i7 <= 0 && handlerThread != null) {
                kVar.f58063y0 = null;
                kVar.f58025j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f57995e && !this.f57996f.f58056u0) {
            this.f57992a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f57996f.f58056u0 && (this.d || b10)) {
            a();
            this.f57995e = true;
            this.f57992a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f57996f.f58056u0 && (this.d || b10)) {
            a();
            this.f57995e = true;
            this.f57992a.onError(cameraDevice, i7);
            return;
        }
        o oVar = this.f57996f.f58025j;
        oVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.f57993b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            o oVar = this.f57996f.f58025j;
            oVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f57993b + ", released=" + this.f57996f.f58056u0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f57995e = true;
        this.f57996f.f58050s0.add(cameraDevice);
        this.f57992a.onOpened(cameraDevice);
    }
}

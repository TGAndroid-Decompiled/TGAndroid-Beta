package zi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback f62120a;
    public final boolean f62121b;
    public boolean f62122c;
    public boolean d;
    public boolean f62123e;
    public final k f62124f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z10) {
        this.f62124f = kVar;
        this.f62120a = stateCallback;
        this.f62121b = z10;
        kVar.f62186w0++;
    }

    public final void a() {
        k kVar = this.f62124f;
        boolean z10 = this.f62121b;
        if (z10) {
            if (kVar.f62184v0 != this) {
                return;
            }
        } else if (kVar.f62183u0 != this) {
            return;
        }
        if (z10) {
            kVar.f62184v0 = null;
        } else {
            kVar.f62183u0 = null;
        }
    }

    public final boolean b() {
        j jVar;
        if (!this.f62124f.f62181t0) {
            if (this.f62121b) {
                jVar = this.f62124f.f62184v0;
            } else {
                jVar = this.f62124f.f62183u0;
            }
            if (jVar == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.f62122c) {
            this.f62122c = true;
            k kVar = this.f62124f;
            int i7 = kVar.f62186w0 - 1;
            kVar.f62186w0 = i7;
            HandlerThread handlerThread = kVar.f62188x0;
            if (i7 <= 0 && handlerThread != null) {
                kVar.f62188x0 = null;
                kVar.f62153j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.f62123e && !this.f62124f.f62181t0) {
            this.f62120a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (!this.f62124f.f62181t0 && (this.d || b10)) {
            a();
            this.f62123e = true;
            this.f62120a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f62124f.f62181t0 && (this.d || b10)) {
            a();
            this.f62123e = true;
            this.f62120a.onError(cameraDevice, i7);
            return;
        }
        o oVar = this.f62124f.f62153j;
        oVar.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.f62121b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (!b10) {
            o oVar = this.f62124f.f62153j;
            oVar.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.f62121b + ", released=" + this.f62124f.f62181t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.f62123e = true;
        this.f62124f.f62175r0.add(cameraDevice);
        this.f62120a.onOpened(cameraDevice);
    }
}

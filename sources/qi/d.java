package qi;

import android.hardware.camera2.CameraDevice;
public final class d extends CameraDevice.StateCallback {
    public final h f46689a;

    public d(h hVar) {
        this.f46689a = hVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        h hVar = this.f46689a;
        if (hVar.U) {
            hVar.U = false;
            if (hVar.S) {
                this.f46689a.r();
            }
        } else if (hVar.V) {
            hVar.V = false;
            if (hVar.S) {
                this.f46689a.r();
            }
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        h hVar = this.f46689a;
        boolean z10 = false;
        hVar.T = false;
        l lVar = hVar.f46733j;
        lVar.b("camera disconnected: id=" + cameraDevice.getId());
        if (this.f46689a.S && !this.f46689a.Y) {
            h hVar2 = this.f46689a;
            if (!hVar2.U && !hVar2.V) {
                z10 = true;
            }
        }
        h hVar3 = this.f46689a;
        if (hVar3.f46761y == cameraDevice) {
            hVar3.i();
            this.f46689a.f46761y = null;
        }
        cameraDevice.close();
        if (z10) {
            this.f46689a.t(new IllegalStateException("Camera device disconnected"));
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        String str;
        h hVar = this.f46689a;
        hVar.T = false;
        if (hVar.f46761y == cameraDevice) {
            hVar.i();
            hVar.f46761y = null;
        }
        cameraDevice.close();
        StringBuilder sb2 = new StringBuilder("Camera device error: ");
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            str = "UNKNOWN";
                        } else {
                            str = "CAMERA_SERVICE";
                        }
                    } else {
                        str = "CAMERA_DEVICE";
                    }
                } else {
                    str = "CAMERA_DISABLED";
                }
            } else {
                str = "MAX_CAMERAS_IN_USE";
            }
        } else {
            str = "CAMERA_IN_USE";
        }
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(")");
        hVar.t(new IllegalStateException(sb2.toString()));
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        h hVar = this.f46689a;
        hVar.T = false;
        l lVar = hVar.f46733j;
        lVar.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + h.m(this.f46689a.f46729g0));
        if (this.f46689a.S) {
            h hVar2 = this.f46689a;
            if (!hVar2.U) {
                hVar2.f46761y = cameraDevice;
                hVar2.j();
                return;
            }
        }
        cameraDevice.close();
    }
}

package zi;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
public final class f extends CameraDevice.StateCallback {
    public final int f61512a;
    public final l f61513b;

    public f(l lVar, int i7) {
        this.f61512a = i7;
        this.f61513b = lVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f61512a) {
            case 0:
                l.c(this.f61513b, cameraDevice);
                return;
            default:
                l.c(this.f61513b, cameraDevice);
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z10;
        switch (this.f61512a) {
            case 0:
                this.f61513b.f61579j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.f61513b.f61604s0.contains(cameraDevice));
                if (this.f61513b.f61604s0.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                l lVar = this.f61513b;
                if (cameraDevice == lVar.f61592o0) {
                    l.b(lVar, cameraDevice, "disconnected", null);
                    return;
                }
                if (lVar.U && !this.f61513b.Y && !this.f61513b.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l lVar2 = this.f61513b;
                if (lVar2.f61615y == cameraDevice) {
                    lVar2.o();
                    this.f61513b.f61615y = null;
                }
                this.f61513b.p(cameraDevice, 1);
                if (z10) {
                    this.f61513b.L(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                l lVar3 = this.f61513b;
                p pVar = lVar3.f61579j;
                StringBuilder sb2 = new StringBuilder("warm camera disconnected: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", closing=");
                ArrayList arrayList = lVar3.f61604s0;
                sb2.append(arrayList.contains(cameraDevice));
                pVar.b(sb2.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else {
                    l.b(lVar3, cameraDevice, "disconnected", null);
                    return;
                }
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        switch (this.f61512a) {
            case 0:
                l lVar = this.f61513b;
                p pVar = lVar.f61579j;
                StringBuilder sb2 = new StringBuilder("camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(l.e(i7));
                sb2.append(" (");
                sb2.append(i7);
                sb2.append("), closing=");
                ArrayList arrayList = lVar.f61604s0;
                sb2.append(arrayList.contains(cameraDevice));
                pVar.b(sb2.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == lVar.f61592o0) {
                    l.b(lVar, cameraDevice, "error=" + l.e(i7) + " (" + i7 + ")", null);
                    return;
                } else {
                    if (lVar.f61615y == cameraDevice) {
                        lVar.o();
                        lVar.f61615y = null;
                    }
                    lVar.p(cameraDevice, 1);
                    lVar.L(new IllegalStateException("Camera device error: " + l.e(i7) + " (" + i7 + ")"));
                    return;
                }
            default:
                l lVar2 = this.f61513b;
                p pVar2 = lVar2.f61579j;
                StringBuilder sb3 = new StringBuilder("warm camera error: id=");
                sb3.append(cameraDevice.getId());
                sb3.append(", error=");
                sb3.append(l.e(i7));
                sb3.append(" (");
                sb3.append(i7);
                sb3.append("), closing=");
                ArrayList arrayList2 = lVar2.f61604s0;
                sb3.append(arrayList2.contains(cameraDevice));
                pVar2.b(sb3.toString());
                if (arrayList2.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                l.b(lVar2, cameraDevice, "error=" + l.e(i7) + " (" + i7 + ")", new IllegalStateException("Warm camera device error: " + l.e(i7) + " (" + i7 + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        int i7;
        switch (this.f61512a) {
            case 0:
                p pVar = this.f61513b.f61579j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(l.z(this.f61513b.D0));
                if (this.f61513b.W) {
                    str = ", switchElapsedMs=" + l.z(this.f61513b.F0);
                } else {
                    str = "";
                }
                sb2.append(str);
                pVar.b(sb2.toString());
                if (this.f61513b.U) {
                    l lVar = this.f61513b;
                    if (!lVar.V) {
                        lVar.f61615y = cameraDevice;
                        if (lVar.f61583k0) {
                            if (lVar.f61610v0 != null || lVar.f61592o0 == null) {
                                lVar.f61579j.b("active camera opened; waiting for dual peer before sessions");
                                return;
                            } else {
                                l.a(lVar);
                                return;
                            }
                        }
                        lVar.t();
                        return;
                    }
                }
                l lVar2 = this.f61513b;
                if (lVar2.V) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                lVar2.p(cameraDevice, i7);
                return;
            default:
                if (this.f61513b.U && !this.f61513b.Y) {
                    l lVar3 = this.f61513b;
                    if (lVar3.f61583k0 && lVar3.f61595p0 != null && cameraDevice.getId().equals(this.f61513b.f61595p0.f61536a)) {
                        l lVar4 = this.f61513b;
                        lVar4.f61592o0 = cameraDevice;
                        lVar4.f61579j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f61513b.f61595p0.f61537b + ", elapsedMs=" + l.z(this.f61513b.f61616y0));
                        l lVar5 = this.f61513b;
                        if (lVar5.f61615y != null && lVar5.f61617z == null && !lVar5.V) {
                            lVar5.f61579j.b("both camera devices opened; configuring dual sessions");
                            l.a(this.f61513b);
                            return;
                        }
                        return;
                    }
                }
                this.f61513b.f61579j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                this.f61513b.p(cameraDevice, 1);
                return;
        }
    }
}

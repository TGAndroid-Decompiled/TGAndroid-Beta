package zi;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
public final class e extends CameraDevice.StateCallback {
    public final int f62076a;
    public final k f62077b;

    public e(k kVar, int i7) {
        this.f62076a = i7;
        this.f62077b = kVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f62076a) {
            case 0:
                k.c(this.f62077b, cameraDevice);
                return;
            default:
                k.c(this.f62077b, cameraDevice);
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z10;
        switch (this.f62076a) {
            case 0:
                this.f62077b.f62143j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.f62077b.f62168s0.contains(cameraDevice));
                if (this.f62077b.f62168s0.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                k kVar = this.f62077b;
                if (cameraDevice == kVar.f62156o0) {
                    k.b(kVar, cameraDevice, "disconnected", null);
                    return;
                }
                if (kVar.U && !this.f62077b.Y && !this.f62077b.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k kVar2 = this.f62077b;
                if (kVar2.f62179y == cameraDevice) {
                    kVar2.o();
                    this.f62077b.f62179y = null;
                }
                this.f62077b.p(cameraDevice, 1);
                if (z10) {
                    this.f62077b.L(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                k kVar3 = this.f62077b;
                o oVar = kVar3.f62143j;
                StringBuilder sb2 = new StringBuilder("warm camera disconnected: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", closing=");
                ArrayList arrayList = kVar3.f62168s0;
                sb2.append(arrayList.contains(cameraDevice));
                oVar.b(sb2.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else {
                    k.b(kVar3, cameraDevice, "disconnected", null);
                    return;
                }
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        switch (this.f62076a) {
            case 0:
                k kVar = this.f62077b;
                o oVar = kVar.f62143j;
                StringBuilder sb2 = new StringBuilder("camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(k.e(i7));
                sb2.append(" (");
                sb2.append(i7);
                sb2.append("), closing=");
                ArrayList arrayList = kVar.f62168s0;
                sb2.append(arrayList.contains(cameraDevice));
                oVar.b(sb2.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == kVar.f62156o0) {
                    k.b(kVar, cameraDevice, "error=" + k.e(i7) + " (" + i7 + ")", null);
                    return;
                } else {
                    if (kVar.f62179y == cameraDevice) {
                        kVar.o();
                        kVar.f62179y = null;
                    }
                    kVar.p(cameraDevice, 1);
                    kVar.L(new IllegalStateException("Camera device error: " + k.e(i7) + " (" + i7 + ")"));
                    return;
                }
            default:
                k kVar2 = this.f62077b;
                o oVar2 = kVar2.f62143j;
                StringBuilder sb3 = new StringBuilder("warm camera error: id=");
                sb3.append(cameraDevice.getId());
                sb3.append(", error=");
                sb3.append(k.e(i7));
                sb3.append(" (");
                sb3.append(i7);
                sb3.append("), closing=");
                ArrayList arrayList2 = kVar2.f62168s0;
                sb3.append(arrayList2.contains(cameraDevice));
                oVar2.b(sb3.toString());
                if (arrayList2.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                k.b(kVar2, cameraDevice, "error=" + k.e(i7) + " (" + i7 + ")", new IllegalStateException("Warm camera device error: " + k.e(i7) + " (" + i7 + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        int i7;
        switch (this.f62076a) {
            case 0:
                o oVar = this.f62077b.f62143j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(k.z(this.f62077b.D0));
                if (this.f62077b.W) {
                    str = ", switchElapsedMs=" + k.z(this.f62077b.F0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.f62077b.U) {
                    k kVar = this.f62077b;
                    if (!kVar.V) {
                        kVar.f62179y = cameraDevice;
                        if (kVar.f62147k0) {
                            if (kVar.f62174v0 != null || kVar.f62156o0 == null) {
                                kVar.f62143j.b("active camera opened; waiting for dual peer before sessions");
                                return;
                            } else {
                                k.a(kVar);
                                return;
                            }
                        }
                        kVar.t();
                        return;
                    }
                }
                k kVar2 = this.f62077b;
                if (kVar2.V) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                kVar2.p(cameraDevice, i7);
                return;
            default:
                if (this.f62077b.U && !this.f62077b.Y) {
                    k kVar3 = this.f62077b;
                    if (kVar3.f62147k0 && kVar3.f62159p0 != null && cameraDevice.getId().equals(this.f62077b.f62159p0.f62100a)) {
                        k kVar4 = this.f62077b;
                        kVar4.f62156o0 = cameraDevice;
                        kVar4.f62143j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f62077b.f62159p0.f62101b + ", elapsedMs=" + k.z(this.f62077b.f62180y0));
                        k kVar5 = this.f62077b;
                        if (kVar5.f62179y != null && kVar5.f62181z == null && !kVar5.V) {
                            kVar5.f62143j.b("both camera devices opened; configuring dual sessions");
                            k.a(this.f62077b);
                            return;
                        }
                        return;
                    }
                }
                this.f62077b.f62143j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                this.f62077b.p(cameraDevice, 1);
                return;
        }
    }
}

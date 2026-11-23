package zi;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
public final class e extends CameraDevice.StateCallback {
    public final int f62086a;
    public final k f62087b;

    public e(k kVar, int i7) {
        this.f62086a = i7;
        this.f62087b = kVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f62086a) {
            case 0:
                k.c(this.f62087b, cameraDevice);
                return;
            default:
                k.c(this.f62087b, cameraDevice);
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z10;
        switch (this.f62086a) {
            case 0:
                this.f62087b.f62153j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.f62087b.f62178s0.contains(cameraDevice));
                if (this.f62087b.f62178s0.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                k kVar = this.f62087b;
                if (cameraDevice == kVar.f62166o0) {
                    k.b(kVar, cameraDevice, "disconnected", null);
                    return;
                }
                if (kVar.U && !this.f62087b.Y && !this.f62087b.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k kVar2 = this.f62087b;
                if (kVar2.f62189y == cameraDevice) {
                    kVar2.o();
                    this.f62087b.f62189y = null;
                }
                this.f62087b.p(cameraDevice, 1);
                if (z10) {
                    this.f62087b.L(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                k kVar3 = this.f62087b;
                o oVar = kVar3.f62153j;
                StringBuilder sb2 = new StringBuilder("warm camera disconnected: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", closing=");
                ArrayList arrayList = kVar3.f62178s0;
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
        switch (this.f62086a) {
            case 0:
                k kVar = this.f62087b;
                o oVar = kVar.f62153j;
                StringBuilder sb2 = new StringBuilder("camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(k.e(i7));
                sb2.append(" (");
                sb2.append(i7);
                sb2.append("), closing=");
                ArrayList arrayList = kVar.f62178s0;
                sb2.append(arrayList.contains(cameraDevice));
                oVar.b(sb2.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == kVar.f62166o0) {
                    k.b(kVar, cameraDevice, "error=" + k.e(i7) + " (" + i7 + ")", null);
                    return;
                } else {
                    if (kVar.f62189y == cameraDevice) {
                        kVar.o();
                        kVar.f62189y = null;
                    }
                    kVar.p(cameraDevice, 1);
                    kVar.L(new IllegalStateException("Camera device error: " + k.e(i7) + " (" + i7 + ")"));
                    return;
                }
            default:
                k kVar2 = this.f62087b;
                o oVar2 = kVar2.f62153j;
                StringBuilder sb3 = new StringBuilder("warm camera error: id=");
                sb3.append(cameraDevice.getId());
                sb3.append(", error=");
                sb3.append(k.e(i7));
                sb3.append(" (");
                sb3.append(i7);
                sb3.append("), closing=");
                ArrayList arrayList2 = kVar2.f62178s0;
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
        switch (this.f62086a) {
            case 0:
                o oVar = this.f62087b.f62153j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(k.z(this.f62087b.D0));
                if (this.f62087b.W) {
                    str = ", switchElapsedMs=" + k.z(this.f62087b.F0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.f62087b.U) {
                    k kVar = this.f62087b;
                    if (!kVar.V) {
                        kVar.f62189y = cameraDevice;
                        if (kVar.f62157k0) {
                            if (kVar.f62184v0 != null || kVar.f62166o0 == null) {
                                kVar.f62153j.b("active camera opened; waiting for dual peer before sessions");
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
                k kVar2 = this.f62087b;
                if (kVar2.V) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                kVar2.p(cameraDevice, i7);
                return;
            default:
                if (this.f62087b.U && !this.f62087b.Y) {
                    k kVar3 = this.f62087b;
                    if (kVar3.f62157k0 && kVar3.f62169p0 != null && cameraDevice.getId().equals(this.f62087b.f62169p0.f62110a)) {
                        k kVar4 = this.f62087b;
                        kVar4.f62166o0 = cameraDevice;
                        kVar4.f62153j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f62087b.f62169p0.f62111b + ", elapsedMs=" + k.z(this.f62087b.f62190y0));
                        k kVar5 = this.f62087b;
                        if (kVar5.f62189y != null && kVar5.f62191z == null && !kVar5.V) {
                            kVar5.f62153j.b("both camera devices opened; configuring dual sessions");
                            k.a(this.f62087b);
                            return;
                        }
                        return;
                    }
                }
                this.f62087b.f62153j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                this.f62087b.p(cameraDevice, 1);
                return;
        }
    }
}

package zi;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
public final class e extends CameraDevice.StateCallback {
    public final int f62204a;
    public final k f62205b;

    public e(k kVar, int i7) {
        this.f62204a = i7;
        this.f62205b = kVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f62204a) {
            case 0:
                k.c(this.f62205b, cameraDevice);
                return;
            default:
                k.c(this.f62205b, cameraDevice);
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z10;
        switch (this.f62204a) {
            case 0:
                this.f62205b.f62271j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.f62205b.f62296s0.contains(cameraDevice));
                if (this.f62205b.f62296s0.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                k kVar = this.f62205b;
                if (cameraDevice == kVar.f62284o0) {
                    k.b(kVar, cameraDevice, "disconnected", null);
                    return;
                }
                if (kVar.U && !this.f62205b.Y && !this.f62205b.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k kVar2 = this.f62205b;
                if (kVar2.f62307y == cameraDevice) {
                    kVar2.o();
                    this.f62205b.f62307y = null;
                }
                this.f62205b.p(cameraDevice, 1);
                if (z10) {
                    this.f62205b.L(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                k kVar3 = this.f62205b;
                o oVar = kVar3.f62271j;
                StringBuilder sb2 = new StringBuilder("warm camera disconnected: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", closing=");
                ArrayList arrayList = kVar3.f62296s0;
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
        switch (this.f62204a) {
            case 0:
                k kVar = this.f62205b;
                o oVar = kVar.f62271j;
                StringBuilder sb2 = new StringBuilder("camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(k.e(i7));
                sb2.append(" (");
                sb2.append(i7);
                sb2.append("), closing=");
                ArrayList arrayList = kVar.f62296s0;
                sb2.append(arrayList.contains(cameraDevice));
                oVar.b(sb2.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == kVar.f62284o0) {
                    k.b(kVar, cameraDevice, "error=" + k.e(i7) + " (" + i7 + ")", null);
                    return;
                } else {
                    if (kVar.f62307y == cameraDevice) {
                        kVar.o();
                        kVar.f62307y = null;
                    }
                    kVar.p(cameraDevice, 1);
                    kVar.L(new IllegalStateException("Camera device error: " + k.e(i7) + " (" + i7 + ")"));
                    return;
                }
            default:
                k kVar2 = this.f62205b;
                o oVar2 = kVar2.f62271j;
                StringBuilder sb3 = new StringBuilder("warm camera error: id=");
                sb3.append(cameraDevice.getId());
                sb3.append(", error=");
                sb3.append(k.e(i7));
                sb3.append(" (");
                sb3.append(i7);
                sb3.append("), closing=");
                ArrayList arrayList2 = kVar2.f62296s0;
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
        switch (this.f62204a) {
            case 0:
                o oVar = this.f62205b.f62271j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(k.z(this.f62205b.D0));
                if (this.f62205b.W) {
                    str = ", switchElapsedMs=" + k.z(this.f62205b.F0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.f62205b.U) {
                    k kVar = this.f62205b;
                    if (!kVar.V) {
                        kVar.f62307y = cameraDevice;
                        if (kVar.f62275k0) {
                            if (kVar.f62302v0 != null || kVar.f62284o0 == null) {
                                kVar.f62271j.b("active camera opened; waiting for dual peer before sessions");
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
                k kVar2 = this.f62205b;
                if (kVar2.V) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                kVar2.p(cameraDevice, i7);
                return;
            default:
                if (this.f62205b.U && !this.f62205b.Y) {
                    k kVar3 = this.f62205b;
                    if (kVar3.f62275k0 && kVar3.f62287p0 != null && cameraDevice.getId().equals(this.f62205b.f62287p0.f62228a)) {
                        k kVar4 = this.f62205b;
                        kVar4.f62284o0 = cameraDevice;
                        kVar4.f62271j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f62205b.f62287p0.f62229b + ", elapsedMs=" + k.z(this.f62205b.f62308y0));
                        k kVar5 = this.f62205b;
                        if (kVar5.f62307y != null && kVar5.f62309z == null && !kVar5.V) {
                            kVar5.f62271j.b("both camera devices opened; configuring dual sessions");
                            k.a(this.f62205b);
                            return;
                        }
                        return;
                    }
                }
                this.f62205b.f62271j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                this.f62205b.p(cameraDevice, 1);
                return;
        }
    }
}

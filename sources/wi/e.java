package wi;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
public final class e extends CameraDevice.StateCallback {
    public final int f57956a;
    public final k f57957b;

    public e(k kVar, int i7) {
        this.f57956a = i7;
        this.f57957b = kVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f57956a) {
            case 0:
                k.c(this.f57957b, cameraDevice);
                return;
            default:
                k.c(this.f57957b, cameraDevice);
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z9;
        switch (this.f57956a) {
            case 0:
                this.f57957b.f58025j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.f57957b.f58053t0.contains(cameraDevice));
                if (this.f57957b.f58053t0.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                k kVar = this.f57957b;
                if (cameraDevice == kVar.f58041p0) {
                    k.b(kVar, cameraDevice, "disconnected", null);
                    return;
                }
                if (kVar.V && !this.f57957b.Z && !this.f57957b.W) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                k kVar2 = this.f57957b;
                if (kVar2.f58064z == cameraDevice) {
                    kVar2.p();
                    this.f57957b.f58064z = null;
                }
                this.f57957b.q(cameraDevice, 1);
                if (z9) {
                    this.f57957b.M(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                k kVar3 = this.f57957b;
                o oVar = kVar3.f58025j;
                StringBuilder sb2 = new StringBuilder("warm camera disconnected: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", closing=");
                ArrayList arrayList = kVar3.f58053t0;
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
        switch (this.f57956a) {
            case 0:
                k kVar = this.f57957b;
                o oVar = kVar.f58025j;
                StringBuilder sb2 = new StringBuilder("camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(k.e(i7));
                sb2.append(" (");
                sb2.append(i7);
                sb2.append("), closing=");
                ArrayList arrayList = kVar.f58053t0;
                sb2.append(arrayList.contains(cameraDevice));
                oVar.b(sb2.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == kVar.f58041p0) {
                    k.b(kVar, cameraDevice, "error=" + k.e(i7) + " (" + i7 + ")", null);
                    return;
                } else {
                    if (kVar.f58064z == cameraDevice) {
                        kVar.p();
                        kVar.f58064z = null;
                    }
                    kVar.q(cameraDevice, 1);
                    kVar.M(new IllegalStateException("Camera device error: " + k.e(i7) + " (" + i7 + ")"));
                    return;
                }
            default:
                k kVar2 = this.f57957b;
                o oVar2 = kVar2.f58025j;
                StringBuilder sb3 = new StringBuilder("warm camera error: id=");
                sb3.append(cameraDevice.getId());
                sb3.append(", error=");
                sb3.append(k.e(i7));
                sb3.append(" (");
                sb3.append(i7);
                sb3.append("), closing=");
                ArrayList arrayList2 = kVar2.f58053t0;
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
        switch (this.f57956a) {
            case 0:
                o oVar = this.f57957b.f58025j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(k.A(this.f57957b.E0));
                if (this.f57957b.X) {
                    str = ", switchElapsedMs=" + k.A(this.f57957b.G0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.f57957b.V) {
                    k kVar = this.f57957b;
                    if (!kVar.W) {
                        kVar.f58064z = cameraDevice;
                        if (kVar.f58032l0) {
                            if (kVar.f58059w0 != null || kVar.f58041p0 == null) {
                                kVar.f58025j.b("active camera opened; waiting for dual peer before sessions");
                                return;
                            } else {
                                k.a(kVar);
                                return;
                            }
                        }
                        kVar.u();
                        return;
                    }
                }
                k kVar2 = this.f57957b;
                if (kVar2.W) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                kVar2.q(cameraDevice, i7);
                return;
            default:
                if (this.f57957b.V && !this.f57957b.Z) {
                    k kVar3 = this.f57957b;
                    if (kVar3.f58032l0 && kVar3.f58044q0 != null && cameraDevice.getId().equals(this.f57957b.f58044q0.f57981a)) {
                        k kVar4 = this.f57957b;
                        kVar4.f58041p0 = cameraDevice;
                        kVar4.f58025j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f57957b.f58044q0.f57982b + ", elapsedMs=" + k.A(this.f57957b.f58065z0));
                        k kVar5 = this.f57957b;
                        if (kVar5.f58064z != null && kVar5.A == null && !kVar5.W) {
                            kVar5.f58025j.b("both camera devices opened; configuring dual sessions");
                            k.a(this.f57957b);
                            return;
                        }
                        return;
                    }
                }
                this.f57957b.f58025j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                this.f57957b.q(cameraDevice, 1);
                return;
        }
    }
}

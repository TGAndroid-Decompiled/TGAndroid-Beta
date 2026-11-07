package wi;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
public final class e extends CameraDevice.StateCallback {
    public final int f57841a;
    public final k f57842b;

    public e(k kVar, int i7) {
        this.f57841a = i7;
        this.f57842b = kVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f57841a) {
            case 0:
                k.c(this.f57842b, cameraDevice);
                return;
            default:
                k.c(this.f57842b, cameraDevice);
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z9;
        switch (this.f57841a) {
            case 0:
                this.f57842b.f57930j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.f57842b.f57958t0.contains(cameraDevice));
                if (this.f57842b.f57958t0.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                k kVar = this.f57842b;
                if (cameraDevice == kVar.f57946p0) {
                    k.b(kVar, cameraDevice, "disconnected", null);
                    return;
                }
                if (kVar.V && !this.f57842b.Z && !this.f57842b.W) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                k kVar2 = this.f57842b;
                if (kVar2.f57969z == cameraDevice) {
                    kVar2.p();
                    this.f57842b.f57969z = null;
                }
                this.f57842b.q(cameraDevice, 1);
                if (z9) {
                    this.f57842b.M(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                k kVar3 = this.f57842b;
                o oVar = kVar3.f57930j;
                StringBuilder sb2 = new StringBuilder("warm camera disconnected: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", closing=");
                ArrayList arrayList = kVar3.f57958t0;
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
        switch (this.f57841a) {
            case 0:
                k kVar = this.f57842b;
                o oVar = kVar.f57930j;
                StringBuilder sb2 = new StringBuilder("camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(k.e(i7));
                sb2.append(" (");
                sb2.append(i7);
                sb2.append("), closing=");
                ArrayList arrayList = kVar.f57958t0;
                sb2.append(arrayList.contains(cameraDevice));
                oVar.b(sb2.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == kVar.f57946p0) {
                    k.b(kVar, cameraDevice, "error=" + k.e(i7) + " (" + i7 + ")", null);
                    return;
                } else {
                    if (kVar.f57969z == cameraDevice) {
                        kVar.p();
                        kVar.f57969z = null;
                    }
                    kVar.q(cameraDevice, 1);
                    kVar.M(new IllegalStateException("Camera device error: " + k.e(i7) + " (" + i7 + ")"));
                    return;
                }
            default:
                k kVar2 = this.f57842b;
                o oVar2 = kVar2.f57930j;
                StringBuilder sb3 = new StringBuilder("warm camera error: id=");
                sb3.append(cameraDevice.getId());
                sb3.append(", error=");
                sb3.append(k.e(i7));
                sb3.append(" (");
                sb3.append(i7);
                sb3.append("), closing=");
                ArrayList arrayList2 = kVar2.f57958t0;
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
        switch (this.f57841a) {
            case 0:
                o oVar = this.f57842b.f57930j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(k.A(this.f57842b.E0));
                if (this.f57842b.X) {
                    str = ", switchElapsedMs=" + k.A(this.f57842b.G0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.f57842b.V) {
                    k kVar = this.f57842b;
                    if (!kVar.W) {
                        kVar.f57969z = cameraDevice;
                        if (kVar.f57937l0) {
                            if (kVar.f57964w0 != null || kVar.f57946p0 == null) {
                                kVar.f57930j.b("active camera opened; waiting for dual peer before sessions");
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
                k kVar2 = this.f57842b;
                if (kVar2.W) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                kVar2.q(cameraDevice, i7);
                return;
            default:
                if (this.f57842b.V && !this.f57842b.Z) {
                    k kVar3 = this.f57842b;
                    if (kVar3.f57937l0 && kVar3.f57949q0 != null && cameraDevice.getId().equals(this.f57842b.f57949q0.f57886a)) {
                        k kVar4 = this.f57842b;
                        kVar4.f57946p0 = cameraDevice;
                        kVar4.f57930j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f57842b.f57949q0.f57887b + ", elapsedMs=" + k.A(this.f57842b.f57970z0));
                        k kVar5 = this.f57842b;
                        if (kVar5.f57969z != null && kVar5.A == null && !kVar5.W) {
                            kVar5.f57930j.b("both camera devices opened; configuring dual sessions");
                            k.a(this.f57842b);
                            return;
                        }
                        return;
                    }
                }
                this.f57842b.f57930j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                this.f57842b.q(cameraDevice, 1);
                return;
        }
    }
}

package wi;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
public final class e extends CameraDevice.StateCallback {
    public final int f57969a;
    public final k f57970b;

    public e(k kVar, int i7) {
        this.f57969a = i7;
        this.f57970b = kVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f57969a) {
            case 0:
                k.c(this.f57970b, cameraDevice);
                return;
            default:
                k.c(this.f57970b, cameraDevice);
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z9;
        switch (this.f57969a) {
            case 0:
                this.f57970b.f58036j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.f57970b.f58061s0.contains(cameraDevice));
                if (this.f57970b.f58061s0.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                k kVar = this.f57970b;
                if (cameraDevice == kVar.f58049o0) {
                    k.b(kVar, cameraDevice, "disconnected", null);
                    return;
                }
                if (kVar.U && !this.f57970b.Y && !this.f57970b.V) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                k kVar2 = this.f57970b;
                if (kVar2.f58072y == cameraDevice) {
                    kVar2.o();
                    this.f57970b.f58072y = null;
                }
                this.f57970b.p(cameraDevice, 1);
                if (z9) {
                    this.f57970b.L(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                k kVar3 = this.f57970b;
                o oVar = kVar3.f58036j;
                StringBuilder sb2 = new StringBuilder("warm camera disconnected: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", closing=");
                ArrayList arrayList = kVar3.f58061s0;
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
        switch (this.f57969a) {
            case 0:
                k kVar = this.f57970b;
                o oVar = kVar.f58036j;
                StringBuilder sb2 = new StringBuilder("camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(k.e(i7));
                sb2.append(" (");
                sb2.append(i7);
                sb2.append("), closing=");
                ArrayList arrayList = kVar.f58061s0;
                sb2.append(arrayList.contains(cameraDevice));
                oVar.b(sb2.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == kVar.f58049o0) {
                    k.b(kVar, cameraDevice, "error=" + k.e(i7) + " (" + i7 + ")", null);
                    return;
                } else {
                    if (kVar.f58072y == cameraDevice) {
                        kVar.o();
                        kVar.f58072y = null;
                    }
                    kVar.p(cameraDevice, 1);
                    kVar.L(new IllegalStateException("Camera device error: " + k.e(i7) + " (" + i7 + ")"));
                    return;
                }
            default:
                k kVar2 = this.f57970b;
                o oVar2 = kVar2.f58036j;
                StringBuilder sb3 = new StringBuilder("warm camera error: id=");
                sb3.append(cameraDevice.getId());
                sb3.append(", error=");
                sb3.append(k.e(i7));
                sb3.append(" (");
                sb3.append(i7);
                sb3.append("), closing=");
                ArrayList arrayList2 = kVar2.f58061s0;
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
        switch (this.f57969a) {
            case 0:
                o oVar = this.f57970b.f58036j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(k.z(this.f57970b.D0));
                if (this.f57970b.W) {
                    str = ", switchElapsedMs=" + k.z(this.f57970b.F0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.f57970b.U) {
                    k kVar = this.f57970b;
                    if (!kVar.V) {
                        kVar.f58072y = cameraDevice;
                        if (kVar.f58040k0) {
                            if (kVar.f58067v0 != null || kVar.f58049o0 == null) {
                                kVar.f58036j.b("active camera opened; waiting for dual peer before sessions");
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
                k kVar2 = this.f57970b;
                if (kVar2.V) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                kVar2.p(cameraDevice, i7);
                return;
            default:
                if (this.f57970b.U && !this.f57970b.Y) {
                    k kVar3 = this.f57970b;
                    if (kVar3.f58040k0 && kVar3.f58052p0 != null && cameraDevice.getId().equals(this.f57970b.f58052p0.f57993a)) {
                        k kVar4 = this.f57970b;
                        kVar4.f58049o0 = cameraDevice;
                        kVar4.f58036j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f57970b.f58052p0.f57994b + ", elapsedMs=" + k.z(this.f57970b.f58073y0));
                        k kVar5 = this.f57970b;
                        if (kVar5.f58072y != null && kVar5.f58074z == null && !kVar5.V) {
                            kVar5.f58036j.b("both camera devices opened; configuring dual sessions");
                            k.a(this.f57970b);
                            return;
                        }
                        return;
                    }
                }
                this.f57970b.f58036j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                this.f57970b.p(cameraDevice, 1);
                return;
        }
    }
}

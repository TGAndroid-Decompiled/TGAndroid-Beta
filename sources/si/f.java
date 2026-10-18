package si;

import android.hardware.camera2.CameraDevice;
public final class f extends CameraDevice.StateCallback {
    public final int f46637a;
    public final k f46638b;

    public f(k kVar, int i10) {
        this.f46637a = i10;
        this.f46638b = kVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f46637a) {
            case 0:
                if (!k.d(this.f46638b, cameraDevice) && !k.e(this.f46638b, cameraDevice)) {
                    k kVar = this.f46638b;
                    if (cameraDevice == kVar.f46726s0) {
                        kVar.f46726s0 = null;
                        o oVar = kVar.f46700j;
                        oVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (kVar.X) {
                        o oVar2 = kVar.f46700j;
                        oVar2.b("camera closed for sequential switch: elapsedMs=" + k.z(this.f46638b.B0) + ", switchElapsedMs=" + k.z(this.f46638b.H0));
                        k kVar2 = this.f46638b;
                        kVar2.X = false;
                        if (kVar2.V) {
                            this.f46638b.I();
                            return;
                        }
                        return;
                    } else if (kVar.Y) {
                        kVar.Y = false;
                        if (kVar.V) {
                            this.f46638b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                k kVar3 = this.f46638b;
                if (!k.d(kVar3, cameraDevice) && !k.e(kVar3, cameraDevice) && cameraDevice == kVar3.f46726s0) {
                    kVar3.f46726s0 = null;
                    o oVar3 = kVar3.f46700j;
                    oVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f46637a) {
            case 0:
                k kVar = this.f46638b;
                boolean z10 = false;
                kVar.W = false;
                o oVar = kVar.f46700j;
                oVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f46638b.G(cameraDevice)) {
                    o oVar2 = this.f46638b.f46700j;
                    oVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                k kVar2 = this.f46638b;
                if (cameraDevice == kVar2.f46726s0) {
                    if (kVar2.m0) {
                        k.b(kVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    kVar2.f46726s0 = null;
                    kVar2.f46729t0 = cameraDevice;
                    cameraDevice.close();
                    this.f46638b.y("standby device disconnected", null);
                    return;
                }
                if (kVar2.V && !this.f46638b.f46680b0) {
                    k kVar3 = this.f46638b;
                    if (!kVar3.X && !kVar3.Y) {
                        z10 = true;
                    }
                }
                k kVar4 = this.f46638b;
                if (kVar4.f46740z == cameraDevice) {
                    kVar4.q();
                    this.f46638b.f46740z = null;
                }
                cameraDevice.close();
                if (z10) {
                    this.f46638b.N(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                k kVar5 = this.f46638b;
                if (kVar5.G(cameraDevice)) {
                    o oVar3 = kVar5.f46700j;
                    oVar3.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                k.b(kVar5, cameraDevice, "disconnected", null);
                return;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.f46637a) {
            case 0:
                k kVar = this.f46638b;
                kVar.W = false;
                if (kVar.G(cameraDevice)) {
                    kVar.f46700j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + k.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == kVar.f46726s0) {
                    if (kVar.m0) {
                        k.b(kVar, cameraDevice, "error=" + k.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    kVar.f46726s0 = null;
                    kVar.f46729t0 = cameraDevice;
                    cameraDevice.close();
                    kVar.y("standby device error=" + k.c(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (kVar.f46740z == cameraDevice) {
                        kVar.q();
                        kVar.f46740z = null;
                    }
                    cameraDevice.close();
                    kVar.N(new IllegalStateException("Camera device error: " + k.c(i10) + " (" + i10 + ")"));
                    return;
                }
            default:
                k kVar2 = this.f46638b;
                if (kVar2.G(cameraDevice)) {
                    kVar2.f46700j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + k.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                }
                k.b(kVar2, cameraDevice, "error=" + k.c(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + k.c(i10) + " (" + i10 + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        switch (this.f46637a) {
            case 0:
                k kVar = this.f46638b;
                kVar.W = false;
                o oVar = kVar.f46700j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(k.z(this.f46638b.F0));
                if (this.f46638b.Z) {
                    str = ", switchElapsedMs=" + k.z(this.f46638b.H0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.f46638b.V) {
                    k kVar2 = this.f46638b;
                    if (!kVar2.X) {
                        kVar2.f46740z = cameraDevice;
                        if (kVar2.m0) {
                            if (!kVar2.f46723r0 && kVar2.f46726s0 != null) {
                                k.a(kVar2);
                                return;
                            } else {
                                kVar2.f46700j.b("active camera opened; waiting for dual peer before sessions");
                                return;
                            }
                        }
                        kVar2.u();
                        return;
                    }
                }
                cameraDevice.close();
                return;
            default:
                k kVar3 = this.f46638b;
                kVar3.f46723r0 = false;
                if (kVar3.V && !this.f46638b.f46680b0) {
                    k kVar4 = this.f46638b;
                    if (!kVar4.f46707l0 && kVar4.f46735w0 != null && cameraDevice.getId().equals(this.f46638b.f46735w0.f46659a)) {
                        k kVar5 = this.f46638b;
                        kVar5.f46726s0 = cameraDevice;
                        kVar5.f46700j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f46638b.f46735w0.f46660b + ", elapsedMs=" + k.z(this.f46638b.A0));
                        k kVar6 = this.f46638b;
                        if (kVar6.f46740z != null && kVar6.A == null && !kVar6.X) {
                            if (kVar6.m0) {
                                kVar6.f46700j.b("both camera devices opened; configuring dual sessions");
                                k.a(this.f46638b);
                            } else {
                                kVar6.f46700j.b("both camera devices opened; configuring active session");
                                this.f46638b.u();
                            }
                        }
                        k kVar7 = this.f46638b;
                        l0 l0Var = kVar7.f46737x0;
                        if (l0Var != null && l0Var == kVar7.f46735w0.f46660b) {
                            kVar7.f46737x0 = null;
                            if (!kVar7.c0(l0Var)) {
                                this.f46638b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f46638b.f46700j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}

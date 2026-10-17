package si;

import android.hardware.camera2.CameraDevice;
public final class f extends CameraDevice.StateCallback {
    public final int f46616a;
    public final k f46617b;

    public f(k kVar, int i10) {
        this.f46616a = i10;
        this.f46617b = kVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f46616a) {
            case 0:
                if (!k.d(this.f46617b, cameraDevice) && !k.e(this.f46617b, cameraDevice)) {
                    k kVar = this.f46617b;
                    if (cameraDevice == kVar.f46699s0) {
                        kVar.f46699s0 = null;
                        o oVar = kVar.f46673j;
                        oVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (kVar.X) {
                        o oVar2 = kVar.f46673j;
                        oVar2.b("camera closed for sequential switch: elapsedMs=" + k.z(this.f46617b.B0) + ", switchElapsedMs=" + k.z(this.f46617b.H0));
                        k kVar2 = this.f46617b;
                        kVar2.X = false;
                        if (kVar2.V) {
                            this.f46617b.I();
                            return;
                        }
                        return;
                    } else if (kVar.Y) {
                        kVar.Y = false;
                        if (kVar.V) {
                            this.f46617b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                k kVar3 = this.f46617b;
                if (!k.d(kVar3, cameraDevice) && !k.e(kVar3, cameraDevice) && cameraDevice == kVar3.f46699s0) {
                    kVar3.f46699s0 = null;
                    o oVar3 = kVar3.f46673j;
                    oVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f46616a) {
            case 0:
                k kVar = this.f46617b;
                boolean z10 = false;
                kVar.W = false;
                o oVar = kVar.f46673j;
                oVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f46617b.G(cameraDevice)) {
                    o oVar2 = this.f46617b.f46673j;
                    oVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                k kVar2 = this.f46617b;
                if (cameraDevice == kVar2.f46699s0) {
                    if (kVar2.m0) {
                        k.b(kVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    kVar2.f46699s0 = null;
                    kVar2.f46702t0 = cameraDevice;
                    cameraDevice.close();
                    this.f46617b.y("standby device disconnected", null);
                    return;
                }
                if (kVar2.V && !this.f46617b.f46653b0) {
                    k kVar3 = this.f46617b;
                    if (!kVar3.X && !kVar3.Y) {
                        z10 = true;
                    }
                }
                k kVar4 = this.f46617b;
                if (kVar4.f46713z == cameraDevice) {
                    kVar4.q();
                    this.f46617b.f46713z = null;
                }
                cameraDevice.close();
                if (z10) {
                    this.f46617b.N(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                k kVar5 = this.f46617b;
                if (kVar5.G(cameraDevice)) {
                    o oVar3 = kVar5.f46673j;
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
        switch (this.f46616a) {
            case 0:
                k kVar = this.f46617b;
                kVar.W = false;
                if (kVar.G(cameraDevice)) {
                    kVar.f46673j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + k.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == kVar.f46699s0) {
                    if (kVar.m0) {
                        k.b(kVar, cameraDevice, "error=" + k.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    kVar.f46699s0 = null;
                    kVar.f46702t0 = cameraDevice;
                    cameraDevice.close();
                    kVar.y("standby device error=" + k.c(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (kVar.f46713z == cameraDevice) {
                        kVar.q();
                        kVar.f46713z = null;
                    }
                    cameraDevice.close();
                    kVar.N(new IllegalStateException("Camera device error: " + k.c(i10) + " (" + i10 + ")"));
                    return;
                }
            default:
                k kVar2 = this.f46617b;
                if (kVar2.G(cameraDevice)) {
                    kVar2.f46673j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + k.c(i10) + " (" + i10 + ")");
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
        switch (this.f46616a) {
            case 0:
                k kVar = this.f46617b;
                kVar.W = false;
                o oVar = kVar.f46673j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(k.z(this.f46617b.F0));
                if (this.f46617b.Z) {
                    str = ", switchElapsedMs=" + k.z(this.f46617b.H0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.f46617b.V) {
                    k kVar2 = this.f46617b;
                    if (!kVar2.X) {
                        kVar2.f46713z = cameraDevice;
                        if (kVar2.m0) {
                            if (!kVar2.f46696r0 && kVar2.f46699s0 != null) {
                                k.a(kVar2);
                                return;
                            } else {
                                kVar2.f46673j.b("active camera opened; waiting for dual peer before sessions");
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
                k kVar3 = this.f46617b;
                kVar3.f46696r0 = false;
                if (kVar3.V && !this.f46617b.f46653b0) {
                    k kVar4 = this.f46617b;
                    if (!kVar4.f46680l0 && kVar4.f46708w0 != null && cameraDevice.getId().equals(this.f46617b.f46708w0.f46639a)) {
                        k kVar5 = this.f46617b;
                        kVar5.f46699s0 = cameraDevice;
                        kVar5.f46673j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f46617b.f46708w0.f46640b + ", elapsedMs=" + k.z(this.f46617b.A0));
                        k kVar6 = this.f46617b;
                        if (kVar6.f46713z != null && kVar6.A == null && !kVar6.X) {
                            if (kVar6.m0) {
                                kVar6.f46673j.b("both camera devices opened; configuring dual sessions");
                                k.a(this.f46617b);
                            } else {
                                kVar6.f46673j.b("both camera devices opened; configuring active session");
                                this.f46617b.u();
                            }
                        }
                        k kVar7 = this.f46617b;
                        m0 m0Var = kVar7.f46710x0;
                        if (m0Var != null && m0Var == kVar7.f46708w0.f46640b) {
                            kVar7.f46710x0 = null;
                            if (!kVar7.c0(m0Var)) {
                                this.f46617b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f46617b.f46673j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}

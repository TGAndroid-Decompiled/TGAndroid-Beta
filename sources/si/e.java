package si;

import android.hardware.camera2.CameraDevice;
public final class e extends CameraDevice.StateCallback {
    public final int f47027a;
    public final j f47028b;

    public e(j jVar, int i10) {
        this.f47027a = i10;
        this.f47028b = jVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f47027a) {
            case 0:
                if (!j.d(this.f47028b, cameraDevice) && !j.e(this.f47028b, cameraDevice)) {
                    j jVar = this.f47028b;
                    if (cameraDevice == jVar.f47111s0) {
                        jVar.f47111s0 = null;
                        n nVar = jVar.f47085j;
                        nVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (jVar.X) {
                        n nVar2 = jVar.f47085j;
                        nVar2.b("camera closed for sequential switch: elapsedMs=" + j.z(this.f47028b.B0) + ", switchElapsedMs=" + j.z(this.f47028b.H0));
                        j jVar2 = this.f47028b;
                        jVar2.X = false;
                        if (jVar2.V) {
                            this.f47028b.I();
                            return;
                        }
                        return;
                    } else if (jVar.Y) {
                        jVar.Y = false;
                        if (jVar.V) {
                            this.f47028b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                j jVar3 = this.f47028b;
                if (!j.d(jVar3, cameraDevice) && !j.e(jVar3, cameraDevice) && cameraDevice == jVar3.f47111s0) {
                    jVar3.f47111s0 = null;
                    n nVar3 = jVar3.f47085j;
                    nVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f47027a) {
            case 0:
                j jVar = this.f47028b;
                boolean z10 = false;
                jVar.W = false;
                n nVar = jVar.f47085j;
                nVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f47028b.G(cameraDevice)) {
                    n nVar2 = this.f47028b.f47085j;
                    nVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j jVar2 = this.f47028b;
                if (cameraDevice == jVar2.f47111s0) {
                    if (jVar2.m0) {
                        j.b(jVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    jVar2.f47111s0 = null;
                    jVar2.f47114t0 = cameraDevice;
                    cameraDevice.close();
                    this.f47028b.y("standby device disconnected", null);
                    return;
                }
                if (jVar2.V && !this.f47028b.f47065b0) {
                    j jVar3 = this.f47028b;
                    if (!jVar3.X && !jVar3.Y) {
                        z10 = true;
                    }
                }
                j jVar4 = this.f47028b;
                if (jVar4.f47125z == cameraDevice) {
                    jVar4.q();
                    this.f47028b.f47125z = null;
                }
                cameraDevice.close();
                if (z10) {
                    this.f47028b.N(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                j jVar5 = this.f47028b;
                if (jVar5.G(cameraDevice)) {
                    n nVar3 = jVar5.f47085j;
                    nVar3.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j.b(jVar5, cameraDevice, "disconnected", null);
                return;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.f47027a) {
            case 0:
                j jVar = this.f47028b;
                jVar.W = false;
                if (jVar.G(cameraDevice)) {
                    jVar.f47085j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == jVar.f47111s0) {
                    if (jVar.m0) {
                        j.b(jVar, cameraDevice, "error=" + j.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    jVar.f47111s0 = null;
                    jVar.f47114t0 = cameraDevice;
                    cameraDevice.close();
                    jVar.y("standby device error=" + j.c(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (jVar.f47125z == cameraDevice) {
                        jVar.q();
                        jVar.f47125z = null;
                    }
                    cameraDevice.close();
                    jVar.N(new IllegalStateException("Camera device error: " + j.c(i10) + " (" + i10 + ")"));
                    return;
                }
            default:
                j jVar2 = this.f47028b;
                if (jVar2.G(cameraDevice)) {
                    jVar2.f47085j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                }
                j.b(jVar2, cameraDevice, "error=" + j.c(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + j.c(i10) + " (" + i10 + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        switch (this.f47027a) {
            case 0:
                j jVar = this.f47028b;
                jVar.W = false;
                n nVar = jVar.f47085j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.z(this.f47028b.F0));
                if (this.f47028b.Z) {
                    str = ", switchElapsedMs=" + j.z(this.f47028b.H0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.f47028b.V) {
                    j jVar2 = this.f47028b;
                    if (!jVar2.X) {
                        jVar2.f47125z = cameraDevice;
                        if (jVar2.m0) {
                            if (!jVar2.f47108r0 && jVar2.f47111s0 != null) {
                                j.a(jVar2);
                                return;
                            } else {
                                jVar2.f47085j.b("active camera opened; waiting for dual peer before sessions");
                                return;
                            }
                        }
                        jVar2.u();
                        return;
                    }
                }
                cameraDevice.close();
                return;
            default:
                j jVar3 = this.f47028b;
                jVar3.f47108r0 = false;
                if (jVar3.V && !this.f47028b.f47065b0) {
                    j jVar4 = this.f47028b;
                    if (!jVar4.f47092l0 && jVar4.f47120w0 != null && cameraDevice.getId().equals(this.f47028b.f47120w0.f47050a)) {
                        j jVar5 = this.f47028b;
                        jVar5.f47111s0 = cameraDevice;
                        jVar5.f47085j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f47028b.f47120w0.f47051b + ", elapsedMs=" + j.z(this.f47028b.A0));
                        j jVar6 = this.f47028b;
                        if (jVar6.f47125z != null && jVar6.A == null && !jVar6.X) {
                            if (jVar6.m0) {
                                jVar6.f47085j.b("both camera devices opened; configuring dual sessions");
                                j.a(this.f47028b);
                            } else {
                                jVar6.f47085j.b("both camera devices opened; configuring active session");
                                this.f47028b.u();
                            }
                        }
                        j jVar7 = this.f47028b;
                        m0 m0Var = jVar7.f47122x0;
                        if (m0Var != null && m0Var == jVar7.f47120w0.f47051b) {
                            jVar7.f47122x0 = null;
                            if (!jVar7.c0(m0Var)) {
                                this.f47028b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f47028b.f47085j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}

package si;

import android.hardware.camera2.CameraDevice;
public final class e extends CameraDevice.StateCallback {
    public final int f47028a;
    public final j f47029b;

    public e(j jVar, int i10) {
        this.f47028a = i10;
        this.f47029b = jVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f47028a) {
            case 0:
                if (!j.d(this.f47029b, cameraDevice) && !j.e(this.f47029b, cameraDevice)) {
                    j jVar = this.f47029b;
                    if (cameraDevice == jVar.f47112s0) {
                        jVar.f47112s0 = null;
                        n nVar = jVar.f47086j;
                        nVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (jVar.X) {
                        n nVar2 = jVar.f47086j;
                        nVar2.b("camera closed for sequential switch: elapsedMs=" + j.z(this.f47029b.B0) + ", switchElapsedMs=" + j.z(this.f47029b.H0));
                        j jVar2 = this.f47029b;
                        jVar2.X = false;
                        if (jVar2.V) {
                            this.f47029b.I();
                            return;
                        }
                        return;
                    } else if (jVar.Y) {
                        jVar.Y = false;
                        if (jVar.V) {
                            this.f47029b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                j jVar3 = this.f47029b;
                if (!j.d(jVar3, cameraDevice) && !j.e(jVar3, cameraDevice) && cameraDevice == jVar3.f47112s0) {
                    jVar3.f47112s0 = null;
                    n nVar3 = jVar3.f47086j;
                    nVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f47028a) {
            case 0:
                j jVar = this.f47029b;
                boolean z10 = false;
                jVar.W = false;
                n nVar = jVar.f47086j;
                nVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f47029b.G(cameraDevice)) {
                    n nVar2 = this.f47029b.f47086j;
                    nVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j jVar2 = this.f47029b;
                if (cameraDevice == jVar2.f47112s0) {
                    if (jVar2.m0) {
                        j.b(jVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    jVar2.f47112s0 = null;
                    jVar2.f47115t0 = cameraDevice;
                    cameraDevice.close();
                    this.f47029b.y("standby device disconnected", null);
                    return;
                }
                if (jVar2.V && !this.f47029b.f47066b0) {
                    j jVar3 = this.f47029b;
                    if (!jVar3.X && !jVar3.Y) {
                        z10 = true;
                    }
                }
                j jVar4 = this.f47029b;
                if (jVar4.f47126z == cameraDevice) {
                    jVar4.q();
                    this.f47029b.f47126z = null;
                }
                cameraDevice.close();
                if (z10) {
                    this.f47029b.N(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                j jVar5 = this.f47029b;
                if (jVar5.G(cameraDevice)) {
                    n nVar3 = jVar5.f47086j;
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
        switch (this.f47028a) {
            case 0:
                j jVar = this.f47029b;
                jVar.W = false;
                if (jVar.G(cameraDevice)) {
                    jVar.f47086j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == jVar.f47112s0) {
                    if (jVar.m0) {
                        j.b(jVar, cameraDevice, "error=" + j.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    jVar.f47112s0 = null;
                    jVar.f47115t0 = cameraDevice;
                    cameraDevice.close();
                    jVar.y("standby device error=" + j.c(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (jVar.f47126z == cameraDevice) {
                        jVar.q();
                        jVar.f47126z = null;
                    }
                    cameraDevice.close();
                    jVar.N(new IllegalStateException("Camera device error: " + j.c(i10) + " (" + i10 + ")"));
                    return;
                }
            default:
                j jVar2 = this.f47029b;
                if (jVar2.G(cameraDevice)) {
                    jVar2.f47086j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
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
        switch (this.f47028a) {
            case 0:
                j jVar = this.f47029b;
                jVar.W = false;
                n nVar = jVar.f47086j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.z(this.f47029b.F0));
                if (this.f47029b.Z) {
                    str = ", switchElapsedMs=" + j.z(this.f47029b.H0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.f47029b.V) {
                    j jVar2 = this.f47029b;
                    if (!jVar2.X) {
                        jVar2.f47126z = cameraDevice;
                        if (jVar2.m0) {
                            if (!jVar2.f47109r0 && jVar2.f47112s0 != null) {
                                j.a(jVar2);
                                return;
                            } else {
                                jVar2.f47086j.b("active camera opened; waiting for dual peer before sessions");
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
                j jVar3 = this.f47029b;
                jVar3.f47109r0 = false;
                if (jVar3.V && !this.f47029b.f47066b0) {
                    j jVar4 = this.f47029b;
                    if (!jVar4.f47093l0 && jVar4.f47121w0 != null && cameraDevice.getId().equals(this.f47029b.f47121w0.f47051a)) {
                        j jVar5 = this.f47029b;
                        jVar5.f47112s0 = cameraDevice;
                        jVar5.f47086j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f47029b.f47121w0.f47052b + ", elapsedMs=" + j.z(this.f47029b.A0));
                        j jVar6 = this.f47029b;
                        if (jVar6.f47126z != null && jVar6.A == null && !jVar6.X) {
                            if (jVar6.m0) {
                                jVar6.f47086j.b("both camera devices opened; configuring dual sessions");
                                j.a(this.f47029b);
                            } else {
                                jVar6.f47086j.b("both camera devices opened; configuring active session");
                                this.f47029b.u();
                            }
                        }
                        j jVar7 = this.f47029b;
                        m0 m0Var = jVar7.f47123x0;
                        if (m0Var != null && m0Var == jVar7.f47121w0.f47052b) {
                            jVar7.f47123x0 = null;
                            if (!jVar7.c0(m0Var)) {
                                this.f47029b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f47029b.f47086j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}

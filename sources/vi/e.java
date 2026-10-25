package vi;

import android.hardware.camera2.CameraDevice;
public final class e extends CameraDevice.StateCallback {
    public final int f50368a;
    public final j f50369b;

    public e(j jVar, int i10) {
        this.f50368a = i10;
        this.f50369b = jVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f50368a) {
            case 0:
                if (!j.d(this.f50369b, cameraDevice) && !j.e(this.f50369b, cameraDevice)) {
                    j jVar = this.f50369b;
                    if (cameraDevice == jVar.f50451s0) {
                        jVar.f50451s0 = null;
                        n nVar = jVar.f50425j;
                        nVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (jVar.X) {
                        n nVar2 = jVar.f50425j;
                        nVar2.b("camera closed for sequential switch: elapsedMs=" + j.z(this.f50369b.B0) + ", switchElapsedMs=" + j.z(this.f50369b.H0));
                        j jVar2 = this.f50369b;
                        jVar2.X = false;
                        if (jVar2.V) {
                            this.f50369b.I();
                            return;
                        }
                        return;
                    } else if (jVar.Y) {
                        jVar.Y = false;
                        if (jVar.V) {
                            this.f50369b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                j jVar3 = this.f50369b;
                if (!j.d(jVar3, cameraDevice) && !j.e(jVar3, cameraDevice) && cameraDevice == jVar3.f50451s0) {
                    jVar3.f50451s0 = null;
                    n nVar3 = jVar3.f50425j;
                    nVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f50368a) {
            case 0:
                j jVar = this.f50369b;
                boolean z10 = false;
                jVar.W = false;
                n nVar = jVar.f50425j;
                nVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f50369b.G(cameraDevice)) {
                    n nVar2 = this.f50369b.f50425j;
                    nVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j jVar2 = this.f50369b;
                if (cameraDevice == jVar2.f50451s0) {
                    if (jVar2.m0) {
                        j.b(jVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    jVar2.f50451s0 = null;
                    jVar2.f50454t0 = cameraDevice;
                    cameraDevice.close();
                    this.f50369b.y("standby device disconnected", null);
                    return;
                }
                if (jVar2.V && !this.f50369b.f50405b0) {
                    j jVar3 = this.f50369b;
                    if (!jVar3.X && !jVar3.Y) {
                        z10 = true;
                    }
                }
                j jVar4 = this.f50369b;
                if (jVar4.f50465z == cameraDevice) {
                    jVar4.q();
                    this.f50369b.f50465z = null;
                }
                cameraDevice.close();
                if (z10) {
                    this.f50369b.N(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                j jVar5 = this.f50369b;
                if (jVar5.G(cameraDevice)) {
                    n nVar3 = jVar5.f50425j;
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
        switch (this.f50368a) {
            case 0:
                j jVar = this.f50369b;
                jVar.W = false;
                if (jVar.G(cameraDevice)) {
                    jVar.f50425j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == jVar.f50451s0) {
                    if (jVar.m0) {
                        j.b(jVar, cameraDevice, "error=" + j.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    jVar.f50451s0 = null;
                    jVar.f50454t0 = cameraDevice;
                    cameraDevice.close();
                    jVar.y("standby device error=" + j.c(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (jVar.f50465z == cameraDevice) {
                        jVar.q();
                        jVar.f50465z = null;
                    }
                    cameraDevice.close();
                    jVar.N(new IllegalStateException("Camera device error: " + j.c(i10) + " (" + i10 + ")"));
                    return;
                }
            default:
                j jVar2 = this.f50369b;
                if (jVar2.G(cameraDevice)) {
                    jVar2.f50425j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
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
        switch (this.f50368a) {
            case 0:
                j jVar = this.f50369b;
                jVar.W = false;
                n nVar = jVar.f50425j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.z(this.f50369b.F0));
                if (this.f50369b.Z) {
                    str = ", switchElapsedMs=" + j.z(this.f50369b.H0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.f50369b.V) {
                    j jVar2 = this.f50369b;
                    if (!jVar2.X) {
                        jVar2.f50465z = cameraDevice;
                        if (jVar2.m0) {
                            if (!jVar2.f50448r0 && jVar2.f50451s0 != null) {
                                j.a(jVar2);
                                return;
                            } else {
                                jVar2.f50425j.b("active camera opened; waiting for dual peer before sessions");
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
                j jVar3 = this.f50369b;
                jVar3.f50448r0 = false;
                if (jVar3.V && !this.f50369b.f50405b0) {
                    j jVar4 = this.f50369b;
                    if (!jVar4.f50432l0 && jVar4.f50460w0 != null && cameraDevice.getId().equals(this.f50369b.f50460w0.f50390a)) {
                        j jVar5 = this.f50369b;
                        jVar5.f50451s0 = cameraDevice;
                        jVar5.f50425j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f50369b.f50460w0.f50391b + ", elapsedMs=" + j.z(this.f50369b.A0));
                        j jVar6 = this.f50369b;
                        if (jVar6.f50465z != null && jVar6.A == null && !jVar6.X) {
                            if (jVar6.m0) {
                                jVar6.f50425j.b("both camera devices opened; configuring dual sessions");
                                j.a(this.f50369b);
                            } else {
                                jVar6.f50425j.b("both camera devices opened; configuring active session");
                                this.f50369b.u();
                            }
                        }
                        j jVar7 = this.f50369b;
                        l0 l0Var = jVar7.f50462x0;
                        if (l0Var != null && l0Var == jVar7.f50460w0.f50391b) {
                            jVar7.f50462x0 = null;
                            if (!jVar7.c0(l0Var)) {
                                this.f50369b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f50369b.f50425j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}

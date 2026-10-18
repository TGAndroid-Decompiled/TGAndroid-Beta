package si;

import android.hardware.camera2.CameraDevice;
public final class e extends CameraDevice.StateCallback {
    public final int f46585a;
    public final j f46586b;

    public e(j jVar, int i10) {
        this.f46585a = i10;
        this.f46586b = jVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f46585a) {
            case 0:
                if (!j.d(this.f46586b, cameraDevice) && !j.e(this.f46586b, cameraDevice)) {
                    j jVar = this.f46586b;
                    if (cameraDevice == jVar.f46668s0) {
                        jVar.f46668s0 = null;
                        n nVar = jVar.f46642j;
                        nVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (jVar.X) {
                        n nVar2 = jVar.f46642j;
                        nVar2.b("camera closed for sequential switch: elapsedMs=" + j.z(this.f46586b.B0) + ", switchElapsedMs=" + j.z(this.f46586b.H0));
                        j jVar2 = this.f46586b;
                        jVar2.X = false;
                        if (jVar2.V) {
                            this.f46586b.I();
                            return;
                        }
                        return;
                    } else if (jVar.Y) {
                        jVar.Y = false;
                        if (jVar.V) {
                            this.f46586b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                j jVar3 = this.f46586b;
                if (!j.d(jVar3, cameraDevice) && !j.e(jVar3, cameraDevice) && cameraDevice == jVar3.f46668s0) {
                    jVar3.f46668s0 = null;
                    n nVar3 = jVar3.f46642j;
                    nVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f46585a) {
            case 0:
                j jVar = this.f46586b;
                boolean z10 = false;
                jVar.W = false;
                n nVar = jVar.f46642j;
                nVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f46586b.G(cameraDevice)) {
                    n nVar2 = this.f46586b.f46642j;
                    nVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j jVar2 = this.f46586b;
                if (cameraDevice == jVar2.f46668s0) {
                    if (jVar2.m0) {
                        j.b(jVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    jVar2.f46668s0 = null;
                    jVar2.f46671t0 = cameraDevice;
                    cameraDevice.close();
                    this.f46586b.y("standby device disconnected", null);
                    return;
                }
                if (jVar2.V && !this.f46586b.f46622b0) {
                    j jVar3 = this.f46586b;
                    if (!jVar3.X && !jVar3.Y) {
                        z10 = true;
                    }
                }
                j jVar4 = this.f46586b;
                if (jVar4.f46682z == cameraDevice) {
                    jVar4.q();
                    this.f46586b.f46682z = null;
                }
                cameraDevice.close();
                if (z10) {
                    this.f46586b.N(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                j jVar5 = this.f46586b;
                if (jVar5.G(cameraDevice)) {
                    n nVar3 = jVar5.f46642j;
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
        switch (this.f46585a) {
            case 0:
                j jVar = this.f46586b;
                jVar.W = false;
                if (jVar.G(cameraDevice)) {
                    jVar.f46642j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == jVar.f46668s0) {
                    if (jVar.m0) {
                        j.b(jVar, cameraDevice, "error=" + j.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    jVar.f46668s0 = null;
                    jVar.f46671t0 = cameraDevice;
                    cameraDevice.close();
                    jVar.y("standby device error=" + j.c(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (jVar.f46682z == cameraDevice) {
                        jVar.q();
                        jVar.f46682z = null;
                    }
                    cameraDevice.close();
                    jVar.N(new IllegalStateException("Camera device error: " + j.c(i10) + " (" + i10 + ")"));
                    return;
                }
            default:
                j jVar2 = this.f46586b;
                if (jVar2.G(cameraDevice)) {
                    jVar2.f46642j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
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
        switch (this.f46585a) {
            case 0:
                j jVar = this.f46586b;
                jVar.W = false;
                n nVar = jVar.f46642j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.z(this.f46586b.F0));
                if (this.f46586b.Z) {
                    str = ", switchElapsedMs=" + j.z(this.f46586b.H0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.f46586b.V) {
                    j jVar2 = this.f46586b;
                    if (!jVar2.X) {
                        jVar2.f46682z = cameraDevice;
                        if (jVar2.m0) {
                            if (!jVar2.f46665r0 && jVar2.f46668s0 != null) {
                                j.a(jVar2);
                                return;
                            } else {
                                jVar2.f46642j.b("active camera opened; waiting for dual peer before sessions");
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
                j jVar3 = this.f46586b;
                jVar3.f46665r0 = false;
                if (jVar3.V && !this.f46586b.f46622b0) {
                    j jVar4 = this.f46586b;
                    if (!jVar4.f46649l0 && jVar4.f46677w0 != null && cameraDevice.getId().equals(this.f46586b.f46677w0.f46608a)) {
                        j jVar5 = this.f46586b;
                        jVar5.f46668s0 = cameraDevice;
                        jVar5.f46642j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f46586b.f46677w0.f46609b + ", elapsedMs=" + j.z(this.f46586b.A0));
                        j jVar6 = this.f46586b;
                        if (jVar6.f46682z != null && jVar6.A == null && !jVar6.X) {
                            if (jVar6.m0) {
                                jVar6.f46642j.b("both camera devices opened; configuring dual sessions");
                                j.a(this.f46586b);
                            } else {
                                jVar6.f46642j.b("both camera devices opened; configuring active session");
                                this.f46586b.u();
                            }
                        }
                        j jVar7 = this.f46586b;
                        l0 l0Var = jVar7.f46679x0;
                        if (l0Var != null && l0Var == jVar7.f46677w0.f46609b) {
                            jVar7.f46679x0 = null;
                            if (!jVar7.c0(l0Var)) {
                                this.f46586b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f46586b.f46642j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}

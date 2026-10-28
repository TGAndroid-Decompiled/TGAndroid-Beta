package vi;

import android.hardware.camera2.CameraDevice;
import li.e3;
public final class e extends CameraDevice.StateCallback {
    public final int f50406a;
    public final j f50407b;

    public e(j jVar, int i10) {
        this.f50406a = i10;
        this.f50407b = jVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f50406a) {
            case 0:
                if (!j.d(this.f50407b, cameraDevice) && !j.e(this.f50407b, cameraDevice)) {
                    j jVar = this.f50407b;
                    if (cameraDevice == jVar.f50492t0) {
                        jVar.f50492t0 = null;
                        n nVar = jVar.f50463j;
                        nVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (jVar.X) {
                        n nVar2 = jVar.f50463j;
                        nVar2.b("camera closed for sequential switch: elapsedMs=" + j.z(this.f50407b.C0) + ", switchElapsedMs=" + j.z(this.f50407b.I0));
                        j jVar2 = this.f50407b;
                        jVar2.X = false;
                        if (jVar2.V) {
                            this.f50407b.I();
                            return;
                        }
                        return;
                    } else if (jVar.Y) {
                        jVar.Y = false;
                        if (jVar.V) {
                            this.f50407b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                j jVar3 = this.f50407b;
                if (!j.d(jVar3, cameraDevice) && !j.e(jVar3, cameraDevice) && cameraDevice == jVar3.f50492t0) {
                    jVar3.f50492t0 = null;
                    n nVar3 = jVar3.f50463j;
                    nVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z10;
        switch (this.f50406a) {
            case 0:
                j jVar = this.f50407b;
                boolean z11 = false;
                jVar.W = false;
                n nVar = jVar.f50463j;
                nVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f50407b.G(cameraDevice)) {
                    n nVar2 = this.f50407b.f50463j;
                    nVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j jVar2 = this.f50407b;
                if (cameraDevice == jVar2.f50492t0) {
                    if (jVar2.f50474n0) {
                        j.b(jVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    jVar2.f50492t0 = null;
                    jVar2.f50495u0 = cameraDevice;
                    cameraDevice.close();
                    this.f50407b.y("standby device disconnected", null);
                    return;
                }
                if (jVar2.V && !this.f50407b.f50443b0) {
                    j jVar3 = this.f50407b;
                    if (!jVar3.X && !jVar3.Y) {
                        z11 = true;
                    }
                }
                j jVar4 = this.f50407b;
                if (jVar4.f50504z == cameraDevice) {
                    jVar4.q();
                    this.f50407b.f50504z = null;
                }
                cameraDevice.close();
                if (z11) {
                    j jVar5 = this.f50407b;
                    IllegalStateException illegalStateException = new IllegalStateException("Camera device disconnected");
                    m mVar = jVar5.f50500x;
                    if (mVar != null) {
                        synchronized (mVar) {
                            z10 = mVar.E;
                        }
                        if (z10) {
                            jVar5.f50463j.a("camera lost while recording", illegalStateException);
                            e3 e3Var = jVar5.f50466k;
                            ((u0) e3Var.f17209b).f50639i.post(new j0(e3Var, illegalStateException, 0));
                            return;
                        }
                    }
                    jVar5.N(illegalStateException);
                    return;
                }
                return;
            default:
                j jVar6 = this.f50407b;
                if (jVar6.G(cameraDevice)) {
                    n nVar3 = jVar6.f50463j;
                    nVar3.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j.b(jVar6, cameraDevice, "disconnected", null);
                return;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        boolean z10;
        switch (this.f50406a) {
            case 0:
                j jVar = this.f50407b;
                jVar.W = false;
                if (jVar.G(cameraDevice)) {
                    jVar.f50463j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == jVar.f50492t0) {
                    if (jVar.f50474n0) {
                        j.b(jVar, cameraDevice, "error=" + j.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    jVar.f50492t0 = null;
                    jVar.f50495u0 = cameraDevice;
                    cameraDevice.close();
                    jVar.y("standby device error=" + j.c(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (jVar.f50504z == cameraDevice) {
                        jVar.q();
                        jVar.f50504z = null;
                    }
                    cameraDevice.close();
                    IllegalStateException illegalStateException = new IllegalStateException("Camera device error: " + j.c(i10) + " (" + i10 + ")");
                    m mVar = jVar.f50500x;
                    if (mVar != null) {
                        synchronized (mVar) {
                            z10 = mVar.E;
                        }
                        if (z10) {
                            jVar.f50463j.a("camera lost while recording", illegalStateException);
                            e3 e3Var = jVar.f50466k;
                            ((u0) e3Var.f17209b).f50639i.post(new j0(e3Var, illegalStateException, 0));
                            return;
                        }
                    }
                    jVar.N(illegalStateException);
                    return;
                }
            default:
                j jVar2 = this.f50407b;
                if (jVar2.G(cameraDevice)) {
                    jVar2.f50463j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
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
        switch (this.f50406a) {
            case 0:
                j jVar = this.f50407b;
                jVar.W = false;
                n nVar = jVar.f50463j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.z(this.f50407b.G0));
                if (this.f50407b.Z) {
                    str = ", switchElapsedMs=" + j.z(this.f50407b.I0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.f50407b.V) {
                    j jVar2 = this.f50407b;
                    if (!jVar2.X) {
                        jVar2.f50504z = cameraDevice;
                        if (jVar2.f50474n0) {
                            if (!jVar2.f50489s0 && jVar2.f50492t0 != null) {
                                j.a(jVar2);
                                return;
                            } else {
                                jVar2.f50463j.b("active camera opened; waiting for dual peer before sessions");
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
                j jVar3 = this.f50407b;
                jVar3.f50489s0 = false;
                if (jVar3.V && !this.f50407b.f50443b0) {
                    j jVar4 = this.f50407b;
                    if (!jVar4.m0 && jVar4.f50501x0 != null && cameraDevice.getId().equals(this.f50407b.f50501x0.f50429a)) {
                        j jVar5 = this.f50407b;
                        jVar5.f50492t0 = cameraDevice;
                        jVar5.f50463j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f50407b.f50501x0.f50430b + ", elapsedMs=" + j.z(this.f50407b.B0));
                        j jVar6 = this.f50407b;
                        if (jVar6.f50504z != null && jVar6.A == null && !jVar6.X) {
                            if (jVar6.f50474n0) {
                                jVar6.f50463j.b("both camera devices opened; configuring dual sessions");
                                j.a(this.f50407b);
                            } else {
                                jVar6.f50463j.b("both camera devices opened; configuring active session");
                                this.f50407b.u();
                            }
                        }
                        j jVar7 = this.f50407b;
                        n0 n0Var = jVar7.f50503y0;
                        if (n0Var != null && n0Var == jVar7.f50501x0.f50430b) {
                            jVar7.f50503y0 = null;
                            if (!jVar7.c0(n0Var)) {
                                this.f50407b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f50407b.f50463j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}

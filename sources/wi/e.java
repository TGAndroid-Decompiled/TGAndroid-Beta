package wi;

import android.hardware.camera2.CameraDevice;
import org.telegram.ui.Components.nh;
public final class e extends CameraDevice.StateCallback {
    public final int f57824a;
    public final j f57825b;

    public e(j jVar, int i3) {
        this.f57824a = i3;
        this.f57825b = jVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f57824a) {
            case 0:
                if (!j.d(this.f57825b, cameraDevice) && !j.e(this.f57825b, cameraDevice)) {
                    j jVar = this.f57825b;
                    if (cameraDevice == jVar.f57912t0) {
                        jVar.f57912t0 = null;
                        n nVar = jVar.f57884j;
                        nVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (jVar.X) {
                        n nVar2 = jVar.f57884j;
                        nVar2.b("camera closed for sequential switch: elapsedMs=" + j.z(this.f57825b.C0) + ", switchElapsedMs=" + j.z(this.f57825b.I0));
                        j jVar2 = this.f57825b;
                        jVar2.X = false;
                        if (jVar2.V) {
                            this.f57825b.I();
                            return;
                        }
                        return;
                    } else if (jVar.Y) {
                        jVar.Y = false;
                        if (jVar.V) {
                            this.f57825b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                j jVar3 = this.f57825b;
                if (!j.d(jVar3, cameraDevice) && !j.e(jVar3, cameraDevice) && cameraDevice == jVar3.f57912t0) {
                    jVar3.f57912t0 = null;
                    n nVar3 = jVar3.f57884j;
                    nVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z10;
        switch (this.f57824a) {
            case 0:
                j jVar = this.f57825b;
                boolean z11 = false;
                jVar.W = false;
                n nVar = jVar.f57884j;
                nVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f57825b.G(cameraDevice)) {
                    n nVar2 = this.f57825b.f57884j;
                    nVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j jVar2 = this.f57825b;
                if (cameraDevice == jVar2.f57912t0) {
                    if (jVar2.f57894n0) {
                        j.b(jVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    jVar2.f57912t0 = null;
                    jVar2.f57915u0 = cameraDevice;
                    cameraDevice.close();
                    this.f57825b.y("standby device disconnected", null);
                    return;
                }
                if (jVar2.V && !this.f57825b.f57863b0) {
                    j jVar3 = this.f57825b;
                    if (!jVar3.X && !jVar3.Y) {
                        z11 = true;
                    }
                }
                j jVar4 = this.f57825b;
                if (jVar4.f57924z == cameraDevice) {
                    jVar4.q();
                    this.f57825b.f57924z = null;
                }
                cameraDevice.close();
                if (z11) {
                    j jVar5 = this.f57825b;
                    IllegalStateException illegalStateException = new IllegalStateException("Camera device disconnected");
                    m mVar = jVar5.f57920x;
                    if (mVar != null) {
                        synchronized (mVar) {
                            z10 = mVar.E;
                        }
                        if (z10) {
                            jVar5.f57884j.a("camera lost while recording", illegalStateException);
                            nh nhVar = jVar5.f57887k;
                            ((t0) nhVar.f36540b).f58060i.post(new j0(nhVar, illegalStateException, 0));
                            return;
                        }
                    }
                    jVar5.N(illegalStateException);
                    return;
                }
                return;
            default:
                j jVar6 = this.f57825b;
                if (jVar6.G(cameraDevice)) {
                    n nVar3 = jVar6.f57884j;
                    nVar3.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j.b(jVar6, cameraDevice, "disconnected", null);
                return;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i3) {
        boolean z10;
        switch (this.f57824a) {
            case 0:
                j jVar = this.f57825b;
                jVar.W = false;
                if (jVar.G(cameraDevice)) {
                    jVar.f57884j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i3) + " (" + i3 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == jVar.f57912t0) {
                    if (jVar.f57894n0) {
                        j.b(jVar, cameraDevice, "error=" + j.c(i3) + " (" + i3 + ")", null);
                        return;
                    }
                    jVar.f57912t0 = null;
                    jVar.f57915u0 = cameraDevice;
                    cameraDevice.close();
                    jVar.y("standby device error=" + j.c(i3) + " (" + i3 + ")", null);
                    return;
                } else {
                    if (jVar.f57924z == cameraDevice) {
                        jVar.q();
                        jVar.f57924z = null;
                    }
                    cameraDevice.close();
                    IllegalStateException illegalStateException = new IllegalStateException("Camera device error: " + j.c(i3) + " (" + i3 + ")");
                    m mVar = jVar.f57920x;
                    if (mVar != null) {
                        synchronized (mVar) {
                            z10 = mVar.E;
                        }
                        if (z10) {
                            jVar.f57884j.a("camera lost while recording", illegalStateException);
                            nh nhVar = jVar.f57887k;
                            ((t0) nhVar.f36540b).f58060i.post(new j0(nhVar, illegalStateException, 0));
                            return;
                        }
                    }
                    jVar.N(illegalStateException);
                    return;
                }
            default:
                j jVar2 = this.f57825b;
                if (jVar2.G(cameraDevice)) {
                    jVar2.f57884j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i3) + " (" + i3 + ")");
                    cameraDevice.close();
                    return;
                }
                j.b(jVar2, cameraDevice, "error=" + j.c(i3) + " (" + i3 + ")", new IllegalStateException("Warm camera device error: " + j.c(i3) + " (" + i3 + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        switch (this.f57824a) {
            case 0:
                j jVar = this.f57825b;
                jVar.W = false;
                n nVar = jVar.f57884j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.z(this.f57825b.G0));
                if (this.f57825b.Z) {
                    str = ", switchElapsedMs=" + j.z(this.f57825b.I0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.f57825b.V) {
                    j jVar2 = this.f57825b;
                    if (!jVar2.X) {
                        jVar2.f57924z = cameraDevice;
                        if (jVar2.f57894n0) {
                            if (!jVar2.f57909s0 && jVar2.f57912t0 != null) {
                                j.a(jVar2);
                                return;
                            } else {
                                jVar2.f57884j.b("active camera opened; waiting for dual peer before sessions");
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
                j jVar3 = this.f57825b;
                jVar3.f57909s0 = false;
                if (jVar3.V && !this.f57825b.f57863b0) {
                    j jVar4 = this.f57825b;
                    if (!jVar4.m0 && jVar4.f57921x0 != null && cameraDevice.getId().equals(this.f57825b.f57921x0.f57848a)) {
                        j jVar5 = this.f57825b;
                        jVar5.f57912t0 = cameraDevice;
                        jVar5.f57884j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f57825b.f57921x0.f57849b + ", elapsedMs=" + j.z(this.f57825b.B0));
                        j jVar6 = this.f57825b;
                        if (jVar6.f57924z != null && jVar6.A == null && !jVar6.X) {
                            if (jVar6.f57894n0) {
                                jVar6.f57884j.b("both camera devices opened; configuring dual sessions");
                                j.a(this.f57825b);
                            } else {
                                jVar6.f57884j.b("both camera devices opened; configuring active session");
                                this.f57825b.u();
                            }
                        }
                        j jVar7 = this.f57825b;
                        m0 m0Var = jVar7.f57923y0;
                        if (m0Var != null && m0Var == jVar7.f57921x0.f57849b) {
                            jVar7.f57923y0 = null;
                            if (!jVar7.c0(m0Var)) {
                                this.f57825b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f57825b.f57884j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}

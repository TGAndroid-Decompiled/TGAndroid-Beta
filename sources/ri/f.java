package ri;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.gm0;
public final class f extends CameraCaptureSession.StateCallback {
    public final int f44518a;
    public final j f44519b;

    public f(j jVar, int i10) {
        this.f44518a = i10;
        this.f44519b = jVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f44518a) {
            case 0:
                j jVar = this.f44519b;
                if (jVar.B == cameraCaptureSession) {
                    jVar.B = null;
                    jVar.D = null;
                    jVar.f44591p0 = false;
                    return;
                }
                return;
            default:
                j jVar2 = this.f44519b;
                if (jVar2.A == cameraCaptureSession) {
                    jVar2.A = null;
                    jVar2.C = null;
                    jVar2.Q = false;
                    jVar2.f44574j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f44518a) {
            case 0:
                cameraCaptureSession.close();
                j jVar = this.f44519b;
                if (jVar.m0 && jVar.f44600s0 != null && cameraCaptureSession.getDevice() == jVar.f44600s0) {
                    jVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f44519b.f44614z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    j jVar2 = this.f44519b;
                    if (device == jVar2.f44614z) {
                        if (jVar2.A == cameraCaptureSession) {
                            jVar2.A = null;
                            jVar2.C = null;
                        }
                        if (jVar2.V) {
                            j jVar3 = this.f44519b;
                            if (jVar3.f44614z != null && !jVar3.f44554b0) {
                                j jVar4 = this.f44519b;
                                if (jVar4.m0) {
                                    jVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (jVar4.f44600s0 != null && !jVar4.f44581l0) {
                                    if (jVar4.X && jVar4.D0) {
                                        jVar4.L("session configuration failed", null);
                                        return;
                                    }
                                    jVar4.f44574j.b("camera session configuration failed with warm device open");
                                    this.f44519b.R("session configuration failed", null);
                                    return;
                                } else if (jVar4.J == m0.FPS_60) {
                                    jVar4.B("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    jVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f44519b.f44574j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                n nVar = this.f44519b.f44574j;
                nVar.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
                return;
        }
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface surface;
        i iVar;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        switch (this.f44518a) {
            case 0:
                if (this.f44519b.V) {
                    j jVar = this.f44519b;
                    if (jVar.m0 && jVar.f44600s0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        j jVar2 = this.f44519b;
                        CameraDevice cameraDevice = jVar2.f44600s0;
                        if (device == cameraDevice && (surface = jVar2.v) != null && (iVar = jVar2.f44609w0) != null) {
                            try {
                                jVar2.B = cameraCaptureSession;
                                jVar2.D = jVar2.x(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.f44519b.D.build();
                                j jVar3 = this.f44519b;
                                cameraCaptureSession.setRepeatingRequest(build, jVar3.f44604t1, jVar3.f44584n);
                                j jVar4 = this.f44519b;
                                jVar4.f44591p0 = true;
                                jVar4.f44574j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + j.z(this.f44519b.G0));
                                j.f(this.f44519b);
                                return;
                            } catch (Exception e) {
                                this.f44519b.A("standby request submission failed", e, true);
                                return;
                            }
                        }
                    }
                }
                this.f44519b.f44574j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f44519b.V && this.f44519b.f44614z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    j jVar5 = this.f44519b;
                    CameraDevice cameraDevice2 = jVar5.f44614z;
                    if (device2 == cameraDevice2) {
                        jVar5.A = cameraCaptureSession;
                        try {
                            jVar5.G = jVar5.H;
                            if (cameraDevice2 != null && jVar5.f44605u != null) {
                                jVar5.C = jVar5.x(cameraDevice2, jVar5.f44605u, jVar5.l(), true, true);
                                s sVar = this.f44519b.f44608w;
                                if (sVar != null) {
                                    Handler handler = sVar.f44733u;
                                    if (sVar.f44728r0 && handler != null) {
                                        handler.post(new o(sVar, 0));
                                    }
                                }
                                j jVar6 = this.f44519b;
                                if (jVar6.m0 && jVar6.f44611x0 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (jVar6.Z && !z10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = jVar6.A;
                                CaptureRequest.Builder builder = jVar6.C;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), jVar6.f44604t1, jVar6.f44584n);
                                }
                                j jVar7 = this.f44519b;
                                if (jVar7.m0) {
                                    jVar7.f44588o0 = true;
                                }
                                if (!z10) {
                                    jVar7.Z = false;
                                }
                                if (z11) {
                                    jVar7.X = false;
                                }
                                jVar7.f44551a0 = z11;
                                n nVar = this.f44519b.f44574j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f44519b.G);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f44519b.K);
                                sb2.append(", elapsedMs=");
                                sb2.append(j.z(this.f44519b.G0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(j.z(this.f44519b.E0));
                                if (z11) {
                                    StringBuilder sb3 = new StringBuilder(", switchPath=");
                                    if (this.f44519b.D0) {
                                        str2 = "WARM_DEVICE";
                                    } else {
                                        str2 = "SEQUENTIAL";
                                    }
                                    sb3.append(str2);
                                    sb3.append(", switchElapsedMs=");
                                    sb3.append(j.z(this.f44519b.H0));
                                    str = sb3.toString();
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                nVar.b(sb2.toString());
                                j jVar8 = this.f44519b;
                                jVar8.f44556c.post(new a(jVar8, 8));
                                j jVar9 = this.f44519b;
                                m.h hVar = jVar9.f44577k;
                                k0 k0Var = jVar9.G;
                                l0 l0Var = jVar9.I;
                                m0 m0Var = jVar9.J;
                                Size size = jVar9.f44593q;
                                Size size2 = jVar9.f44596r;
                                j jVar10 = this.f44519b;
                                ((r0) hVar.f14848b).f44680i.post(new gm0(hVar, new h(k0Var, l0Var, m0Var, size, size2, jVar10.O, jVar10.F()), z11, 15));
                                if (z10) {
                                    j.f(this.f44519b);
                                    return;
                                }
                                k0 k0Var2 = this.f44519b.F;
                                j jVar11 = this.f44519b;
                                if (k0Var2 != jVar11.G) {
                                    jVar11.a0(jVar11.F);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e7) {
                            j jVar12 = this.f44519b;
                            if (jVar12.m0) {
                                jVar12.A("active request submission failed", e7, false);
                                return;
                            } else if (jVar12.X && jVar12.D0) {
                                jVar12.L("request submission failed", e7);
                                return;
                            } else if (jVar12.J == m0.FPS_60) {
                                jVar12.B("60 fps request submission rejected", e7);
                                return;
                            } else {
                                jVar12.N(e7);
                                return;
                            }
                        }
                    }
                }
                this.f44519b.f44574j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

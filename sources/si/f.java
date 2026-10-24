package si;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import k2.w0;
import org.telegram.ui.v90;
public final class f extends CameraCaptureSession.StateCallback {
    public final int f47032a;
    public final j f47033b;

    public f(j jVar, int i10) {
        this.f47032a = i10;
        this.f47033b = jVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f47032a) {
            case 0:
                j jVar = this.f47033b;
                if (jVar.B == cameraCaptureSession) {
                    jVar.B = null;
                    jVar.D = null;
                    jVar.f47102p0 = false;
                    return;
                }
                return;
            default:
                j jVar2 = this.f47033b;
                if (jVar2.A == cameraCaptureSession) {
                    jVar2.A = null;
                    jVar2.C = null;
                    jVar2.Q = false;
                    jVar2.f47085j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f47032a) {
            case 0:
                cameraCaptureSession.close();
                j jVar = this.f47033b;
                if (jVar.m0 && jVar.f47111s0 != null && cameraCaptureSession.getDevice() == jVar.f47111s0) {
                    jVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f47033b.f47125z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    j jVar2 = this.f47033b;
                    if (device == jVar2.f47125z) {
                        if (jVar2.A == cameraCaptureSession) {
                            jVar2.A = null;
                            jVar2.C = null;
                        }
                        if (jVar2.V) {
                            j jVar3 = this.f47033b;
                            if (jVar3.f47125z != null && !jVar3.f47065b0) {
                                j jVar4 = this.f47033b;
                                if (jVar4.m0) {
                                    jVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (jVar4.f47111s0 != null && !jVar4.f47092l0) {
                                    if (jVar4.X && jVar4.D0) {
                                        jVar4.L("session configuration failed", null);
                                        return;
                                    }
                                    jVar4.f47085j.b("camera session configuration failed with warm device open");
                                    this.f47033b.R("session configuration failed", null);
                                    return;
                                } else if (jVar4.J == p0.FPS_60) {
                                    jVar4.B("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    jVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f47033b.f47085j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                n nVar = this.f47033b.f47085j;
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
        switch (this.f47032a) {
            case 0:
                if (this.f47033b.V) {
                    j jVar = this.f47033b;
                    if (jVar.m0 && jVar.f47111s0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        j jVar2 = this.f47033b;
                        CameraDevice cameraDevice = jVar2.f47111s0;
                        if (device == cameraDevice && (surface = jVar2.v) != null && (iVar = jVar2.f47120w0) != null) {
                            try {
                                jVar2.B = cameraCaptureSession;
                                jVar2.D = jVar2.x(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.f47033b.D.build();
                                j jVar3 = this.f47033b;
                                cameraCaptureSession.setRepeatingRequest(build, jVar3.f47115t1, jVar3.f47095n);
                                j jVar4 = this.f47033b;
                                jVar4.f47102p0 = true;
                                jVar4.f47085j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + j.z(this.f47033b.G0));
                                j.f(this.f47033b);
                                return;
                            } catch (Exception e) {
                                this.f47033b.A("standby request submission failed", e, true);
                                return;
                            }
                        }
                    }
                }
                this.f47033b.f47085j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f47033b.V && this.f47033b.f47125z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    j jVar5 = this.f47033b;
                    CameraDevice cameraDevice2 = jVar5.f47125z;
                    if (device2 == cameraDevice2) {
                        jVar5.A = cameraCaptureSession;
                        try {
                            jVar5.G = jVar5.H;
                            if (cameraDevice2 != null && jVar5.f47116u != null) {
                                jVar5.C = jVar5.x(cameraDevice2, jVar5.f47116u, jVar5.l(), true, true);
                                t tVar = this.f47033b.f47119w;
                                if (tVar != null) {
                                    Handler handler = tVar.f47232u;
                                    if (tVar.f47227r0 && handler != null) {
                                        handler.post(new p(tVar, 0));
                                    }
                                }
                                j jVar6 = this.f47033b;
                                if (jVar6.m0 && jVar6.f47122x0 != null) {
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
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), jVar6.f47115t1, jVar6.f47095n);
                                }
                                j jVar7 = this.f47033b;
                                if (jVar7.m0) {
                                    jVar7.f47099o0 = true;
                                }
                                if (!z10) {
                                    jVar7.Z = false;
                                }
                                if (z11) {
                                    jVar7.X = false;
                                }
                                jVar7.f47062a0 = z11;
                                n nVar = this.f47033b.f47085j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f47033b.G);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f47033b.K);
                                sb2.append(", elapsedMs=");
                                sb2.append(j.z(this.f47033b.G0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(j.z(this.f47033b.E0));
                                if (z11) {
                                    StringBuilder sb3 = new StringBuilder(", switchPath=");
                                    if (this.f47033b.D0) {
                                        str2 = "WARM_DEVICE";
                                    } else {
                                        str2 = "SEQUENTIAL";
                                    }
                                    sb3.append(str2);
                                    sb3.append(", switchElapsedMs=");
                                    sb3.append(j.z(this.f47033b.H0));
                                    str = sb3.toString();
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                nVar.b(sb2.toString());
                                j jVar8 = this.f47033b;
                                jVar8.f47067c.post(new a(jVar8, 8));
                                j jVar9 = this.f47033b;
                                w0 w0Var = jVar9.f47088k;
                                m0 m0Var = jVar9.G;
                                n0 n0Var = jVar9.I;
                                p0 p0Var = jVar9.J;
                                Size size = jVar9.f47104q;
                                Size size2 = jVar9.f47107r;
                                j jVar10 = this.f47033b;
                                ((u0) w0Var.f14874b).f47253i.post(new v90(w0Var, new h(m0Var, n0Var, p0Var, size, size2, jVar10.O, jVar10.F()), z11, 17));
                                if (z10) {
                                    j.f(this.f47033b);
                                    return;
                                }
                                m0 m0Var2 = this.f47033b.F;
                                j jVar11 = this.f47033b;
                                if (m0Var2 != jVar11.G) {
                                    jVar11.a0(jVar11.F);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e7) {
                            j jVar12 = this.f47033b;
                            if (jVar12.m0) {
                                jVar12.A("active request submission failed", e7, false);
                                return;
                            } else if (jVar12.X && jVar12.D0) {
                                jVar12.L("request submission failed", e7);
                                return;
                            } else if (jVar12.J == p0.FPS_60) {
                                jVar12.B("60 fps request submission rejected", e7);
                                return;
                            } else {
                                jVar12.N(e7);
                                return;
                            }
                        }
                    }
                }
                this.f47033b.f47085j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

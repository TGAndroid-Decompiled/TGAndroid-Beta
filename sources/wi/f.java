package wi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.Components.nh;
import org.telegram.ui.a60;
public final class f extends CameraCaptureSession.StateCallback {
    public final int f57829a;
    public final j f57830b;

    public f(j jVar, int i3) {
        this.f57829a = i3;
        this.f57830b = jVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f57829a) {
            case 0:
                j jVar = this.f57830b;
                if (jVar.B == cameraCaptureSession) {
                    jVar.B = null;
                    jVar.D = null;
                    jVar.f57903q0 = false;
                    return;
                }
                return;
            default:
                j jVar2 = this.f57830b;
                if (jVar2.A == cameraCaptureSession) {
                    jVar2.A = null;
                    jVar2.C = null;
                    jVar2.Q = false;
                    jVar2.f57884j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f57829a) {
            case 0:
                cameraCaptureSession.close();
                j jVar = this.f57830b;
                if (jVar.f57894n0 && jVar.f57912t0 != null && cameraCaptureSession.getDevice() == jVar.f57912t0) {
                    jVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f57830b.f57924z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    j jVar2 = this.f57830b;
                    if (device == jVar2.f57924z) {
                        if (jVar2.A == cameraCaptureSession) {
                            jVar2.A = null;
                            jVar2.C = null;
                        }
                        if (jVar2.V) {
                            j jVar3 = this.f57830b;
                            if (jVar3.f57924z != null && !jVar3.f57863b0) {
                                j jVar4 = this.f57830b;
                                if (jVar4.f57894n0) {
                                    jVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (jVar4.f57912t0 != null && !jVar4.m0) {
                                    if (jVar4.X && jVar4.E0) {
                                        jVar4.L("session configuration failed", null);
                                        return;
                                    }
                                    jVar4.f57884j.b("camera session configuration failed with warm device open");
                                    this.f57830b.R("session configuration failed", null);
                                    return;
                                } else if (jVar4.J == o0.FPS_60) {
                                    jVar4.B("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    jVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f57830b.f57884j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                n nVar = this.f57830b.f57884j;
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
        switch (this.f57829a) {
            case 0:
                if (this.f57830b.V) {
                    j jVar = this.f57830b;
                    if (jVar.f57894n0 && jVar.f57912t0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        j jVar2 = this.f57830b;
                        CameraDevice cameraDevice = jVar2.f57912t0;
                        if (device == cameraDevice && (surface = jVar2.v) != null && (iVar = jVar2.f57921x0) != null) {
                            try {
                                jVar2.B = cameraCaptureSession;
                                jVar2.D = jVar2.x(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.f57830b.D.build();
                                j jVar3 = this.f57830b;
                                cameraCaptureSession.setRepeatingRequest(build, jVar3.f57916u1, jVar3.f57893n);
                                j jVar4 = this.f57830b;
                                jVar4.f57903q0 = true;
                                jVar4.f57884j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + j.z(this.f57830b.H0));
                                j.f(this.f57830b);
                                return;
                            } catch (Exception e10) {
                                this.f57830b.A("standby request submission failed", e10, true);
                                return;
                            }
                        }
                    }
                }
                this.f57830b.f57884j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f57830b.V && this.f57830b.f57924z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    j jVar5 = this.f57830b;
                    CameraDevice cameraDevice2 = jVar5.f57924z;
                    if (device2 == cameraDevice2) {
                        jVar5.A = cameraCaptureSession;
                        try {
                            jVar5.G = jVar5.H;
                            if (cameraDevice2 != null && jVar5.f57914u != null) {
                                jVar5.C = jVar5.x(cameraDevice2, jVar5.f57914u, jVar5.l(), true, true);
                                s sVar = this.f57830b.f57918w;
                                if (sVar != null) {
                                    Handler handler = sVar.f58038u;
                                    if (sVar.f58033r0 && handler != null) {
                                        handler.post(new o(sVar, 0));
                                    }
                                }
                                j jVar6 = this.f57830b;
                                if (jVar6.f57894n0 && jVar6.f57923y0 != null) {
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
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), jVar6.f57916u1, jVar6.f57893n);
                                }
                                j jVar7 = this.f57830b;
                                if (jVar7.f57894n0) {
                                    jVar7.f57900p0 = true;
                                }
                                if (!z10) {
                                    jVar7.Z = false;
                                }
                                if (z11) {
                                    jVar7.X = false;
                                }
                                jVar7.f57860a0 = z11;
                                n nVar = this.f57830b.f57884j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f57830b.G);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f57830b.K);
                                sb2.append(", elapsedMs=");
                                sb2.append(j.z(this.f57830b.H0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(j.z(this.f57830b.F0));
                                if (z11) {
                                    StringBuilder sb3 = new StringBuilder(", switchPath=");
                                    if (this.f57830b.E0) {
                                        str2 = "WARM_DEVICE";
                                    } else {
                                        str2 = "SEQUENTIAL";
                                    }
                                    sb3.append(str2);
                                    sb3.append(", switchElapsedMs=");
                                    sb3.append(j.z(this.f57830b.I0));
                                    str = sb3.toString();
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                nVar.b(sb2.toString());
                                j jVar8 = this.f57830b;
                                jVar8.f57865c.post(new a(jVar8, 8));
                                j jVar9 = this.f57830b;
                                nh nhVar = jVar9.f57887k;
                                m0 m0Var = jVar9.G;
                                n0 n0Var = jVar9.I;
                                o0 o0Var = jVar9.J;
                                Size size = jVar9.f57902q;
                                Size size2 = jVar9.f57905r;
                                j jVar10 = this.f57830b;
                                ((t0) nhVar.f36540b).f58060i.post(new a60(nhVar, new h(m0Var, n0Var, o0Var, size, size2, jVar10.O, jVar10.F()), z11, 18));
                                if (z10) {
                                    j.f(this.f57830b);
                                    return;
                                }
                                m0 m0Var2 = this.f57830b.F;
                                j jVar11 = this.f57830b;
                                if (m0Var2 != jVar11.G) {
                                    jVar11.a0(jVar11.F);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e11) {
                            j jVar12 = this.f57830b;
                            if (jVar12.f57894n0) {
                                jVar12.A("active request submission failed", e11, false);
                                return;
                            } else if (jVar12.X && jVar12.E0) {
                                jVar12.L("request submission failed", e11);
                                return;
                            } else if (jVar12.J == o0.FPS_60) {
                                jVar12.B("60 fps request submission rejected", e11);
                                return;
                            } else {
                                jVar12.N(e11);
                                return;
                            }
                        }
                    }
                }
                this.f57830b.f57884j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

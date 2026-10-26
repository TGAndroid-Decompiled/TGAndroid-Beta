package vi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import li.e3;
import org.telegram.ui.d80;
public final class f extends CameraCaptureSession.StateCallback {
    public final int f50376a;
    public final j f50377b;

    public f(j jVar, int i10) {
        this.f50376a = i10;
        this.f50377b = jVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f50376a) {
            case 0:
                j jVar = this.f50377b;
                if (jVar.B == cameraCaptureSession) {
                    jVar.B = null;
                    jVar.D = null;
                    jVar.f50445p0 = false;
                    return;
                }
                return;
            default:
                j jVar2 = this.f50377b;
                if (jVar2.A == cameraCaptureSession) {
                    jVar2.A = null;
                    jVar2.C = null;
                    jVar2.Q = false;
                    jVar2.f50428j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f50376a) {
            case 0:
                cameraCaptureSession.close();
                j jVar = this.f50377b;
                if (jVar.m0 && jVar.f50454s0 != null && cameraCaptureSession.getDevice() == jVar.f50454s0) {
                    jVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f50377b.f50468z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    j jVar2 = this.f50377b;
                    if (device == jVar2.f50468z) {
                        if (jVar2.A == cameraCaptureSession) {
                            jVar2.A = null;
                            jVar2.C = null;
                        }
                        if (jVar2.V) {
                            j jVar3 = this.f50377b;
                            if (jVar3.f50468z != null && !jVar3.f50408b0) {
                                j jVar4 = this.f50377b;
                                if (jVar4.m0) {
                                    jVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (jVar4.f50454s0 != null && !jVar4.f50435l0) {
                                    if (jVar4.X && jVar4.D0) {
                                        jVar4.L("session configuration failed", null);
                                        return;
                                    }
                                    jVar4.f50428j.b("camera session configuration failed with warm device open");
                                    this.f50377b.R("session configuration failed", null);
                                    return;
                                } else if (jVar4.J == n0.FPS_60) {
                                    jVar4.B("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    jVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f50377b.f50428j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                n nVar = this.f50377b.f50428j;
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
        switch (this.f50376a) {
            case 0:
                if (this.f50377b.V) {
                    j jVar = this.f50377b;
                    if (jVar.m0 && jVar.f50454s0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        j jVar2 = this.f50377b;
                        CameraDevice cameraDevice = jVar2.f50454s0;
                        if (device == cameraDevice && (surface = jVar2.v) != null && (iVar = jVar2.f50463w0) != null) {
                            try {
                                jVar2.B = cameraCaptureSession;
                                jVar2.D = jVar2.x(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.f50377b.D.build();
                                j jVar3 = this.f50377b;
                                cameraCaptureSession.setRepeatingRequest(build, jVar3.f50458t1, jVar3.f50438n);
                                j jVar4 = this.f50377b;
                                jVar4.f50445p0 = true;
                                jVar4.f50428j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + j.z(this.f50377b.G0));
                                j.f(this.f50377b);
                                return;
                            } catch (Exception e) {
                                this.f50377b.A("standby request submission failed", e, true);
                                return;
                            }
                        }
                    }
                }
                this.f50377b.f50428j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f50377b.V && this.f50377b.f50468z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    j jVar5 = this.f50377b;
                    CameraDevice cameraDevice2 = jVar5.f50468z;
                    if (device2 == cameraDevice2) {
                        jVar5.A = cameraCaptureSession;
                        try {
                            jVar5.G = jVar5.H;
                            if (cameraDevice2 != null && jVar5.f50459u != null) {
                                jVar5.C = jVar5.x(cameraDevice2, jVar5.f50459u, jVar5.l(), true, true);
                                s sVar = this.f50377b.f50462w;
                                if (sVar != null) {
                                    Handler handler = sVar.f50574u;
                                    if (sVar.f50569r0 && handler != null) {
                                        handler.post(new o(sVar, 0));
                                    }
                                }
                                j jVar6 = this.f50377b;
                                if (jVar6.m0 && jVar6.f50465x0 != null) {
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
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), jVar6.f50458t1, jVar6.f50438n);
                                }
                                j jVar7 = this.f50377b;
                                if (jVar7.m0) {
                                    jVar7.f50442o0 = true;
                                }
                                if (!z10) {
                                    jVar7.Z = false;
                                }
                                if (z11) {
                                    jVar7.X = false;
                                }
                                jVar7.f50405a0 = z11;
                                n nVar = this.f50377b.f50428j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f50377b.G);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f50377b.K);
                                sb2.append(", elapsedMs=");
                                sb2.append(j.z(this.f50377b.G0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(j.z(this.f50377b.E0));
                                if (z11) {
                                    StringBuilder sb3 = new StringBuilder(", switchPath=");
                                    if (this.f50377b.D0) {
                                        str2 = "WARM_DEVICE";
                                    } else {
                                        str2 = "SEQUENTIAL";
                                    }
                                    sb3.append(str2);
                                    sb3.append(", switchElapsedMs=");
                                    sb3.append(j.z(this.f50377b.H0));
                                    str = sb3.toString();
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                nVar.b(sb2.toString());
                                j jVar8 = this.f50377b;
                                jVar8.f50410c.post(new a(jVar8, 8));
                                j jVar9 = this.f50377b;
                                e3 e3Var = jVar9.f50431k;
                                l0 l0Var = jVar9.G;
                                m0 m0Var = jVar9.I;
                                n0 n0Var = jVar9.J;
                                Size size = jVar9.f50447q;
                                Size size2 = jVar9.f50450r;
                                j jVar10 = this.f50377b;
                                ((s0) e3Var.f17210b).f50588i.post(new d80(e3Var, new h(l0Var, m0Var, n0Var, size, size2, jVar10.O, jVar10.F()), z11, 18));
                                if (z10) {
                                    j.f(this.f50377b);
                                    return;
                                }
                                l0 l0Var2 = this.f50377b.F;
                                j jVar11 = this.f50377b;
                                if (l0Var2 != jVar11.G) {
                                    jVar11.a0(jVar11.F);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e10) {
                            j jVar12 = this.f50377b;
                            if (jVar12.m0) {
                                jVar12.A("active request submission failed", e10, false);
                                return;
                            } else if (jVar12.X && jVar12.D0) {
                                jVar12.L("request submission failed", e10);
                                return;
                            } else if (jVar12.J == n0.FPS_60) {
                                jVar12.B("60 fps request submission rejected", e10);
                                return;
                            } else {
                                jVar12.N(e10);
                                return;
                            }
                        }
                    }
                }
                this.f50377b.f50428j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

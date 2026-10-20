package si;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import k2.w0;
import org.telegram.ui.x70;
public final class f extends CameraCaptureSession.StateCallback {
    public final int f46597a;
    public final j f46598b;

    public f(j jVar, int i10) {
        this.f46597a = i10;
        this.f46598b = jVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f46597a) {
            case 0:
                j jVar = this.f46598b;
                if (jVar.B == cameraCaptureSession) {
                    jVar.B = null;
                    jVar.D = null;
                    jVar.f46666p0 = false;
                    return;
                }
                return;
            default:
                j jVar2 = this.f46598b;
                if (jVar2.A == cameraCaptureSession) {
                    jVar2.A = null;
                    jVar2.C = null;
                    jVar2.Q = false;
                    jVar2.f46649j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f46597a) {
            case 0:
                cameraCaptureSession.close();
                j jVar = this.f46598b;
                if (jVar.m0 && jVar.f46675s0 != null && cameraCaptureSession.getDevice() == jVar.f46675s0) {
                    jVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f46598b.f46689z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    j jVar2 = this.f46598b;
                    if (device == jVar2.f46689z) {
                        if (jVar2.A == cameraCaptureSession) {
                            jVar2.A = null;
                            jVar2.C = null;
                        }
                        if (jVar2.V) {
                            j jVar3 = this.f46598b;
                            if (jVar3.f46689z != null && !jVar3.f46629b0) {
                                j jVar4 = this.f46598b;
                                if (jVar4.m0) {
                                    jVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (jVar4.f46675s0 != null && !jVar4.f46656l0) {
                                    if (jVar4.X && jVar4.D0) {
                                        jVar4.L("session configuration failed", null);
                                        return;
                                    }
                                    jVar4.f46649j.b("camera session configuration failed with warm device open");
                                    this.f46598b.R("session configuration failed", null);
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
                        this.f46598b.f46649j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                n nVar = this.f46598b.f46649j;
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
        switch (this.f46597a) {
            case 0:
                if (this.f46598b.V) {
                    j jVar = this.f46598b;
                    if (jVar.m0 && jVar.f46675s0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        j jVar2 = this.f46598b;
                        CameraDevice cameraDevice = jVar2.f46675s0;
                        if (device == cameraDevice && (surface = jVar2.v) != null && (iVar = jVar2.f46684w0) != null) {
                            try {
                                jVar2.B = cameraCaptureSession;
                                jVar2.D = jVar2.x(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.f46598b.D.build();
                                j jVar3 = this.f46598b;
                                cameraCaptureSession.setRepeatingRequest(build, jVar3.f46679t1, jVar3.f46659n);
                                j jVar4 = this.f46598b;
                                jVar4.f46666p0 = true;
                                jVar4.f46649j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + j.z(this.f46598b.G0));
                                j.f(this.f46598b);
                                return;
                            } catch (Exception e) {
                                this.f46598b.A("standby request submission failed", e, true);
                                return;
                            }
                        }
                    }
                }
                this.f46598b.f46649j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f46598b.V && this.f46598b.f46689z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    j jVar5 = this.f46598b;
                    CameraDevice cameraDevice2 = jVar5.f46689z;
                    if (device2 == cameraDevice2) {
                        jVar5.A = cameraCaptureSession;
                        try {
                            jVar5.G = jVar5.H;
                            if (cameraDevice2 != null && jVar5.f46680u != null) {
                                jVar5.C = jVar5.x(cameraDevice2, jVar5.f46680u, jVar5.l(), true, true);
                                t tVar = this.f46598b.f46683w;
                                if (tVar != null) {
                                    Handler handler = tVar.f46820u;
                                    if (tVar.f46815r0 && handler != null) {
                                        handler.post(new p(tVar, 0));
                                    }
                                }
                                j jVar6 = this.f46598b;
                                if (jVar6.m0 && jVar6.f46686x0 != null) {
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
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), jVar6.f46679t1, jVar6.f46659n);
                                }
                                j jVar7 = this.f46598b;
                                if (jVar7.m0) {
                                    jVar7.f46663o0 = true;
                                }
                                if (!z10) {
                                    jVar7.Z = false;
                                }
                                if (z11) {
                                    jVar7.X = false;
                                }
                                jVar7.f46626a0 = z11;
                                n nVar = this.f46598b.f46649j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f46598b.G);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f46598b.K);
                                sb2.append(", elapsedMs=");
                                sb2.append(j.z(this.f46598b.G0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(j.z(this.f46598b.E0));
                                if (z11) {
                                    StringBuilder sb3 = new StringBuilder(", switchPath=");
                                    if (this.f46598b.D0) {
                                        str2 = "WARM_DEVICE";
                                    } else {
                                        str2 = "SEQUENTIAL";
                                    }
                                    sb3.append(str2);
                                    sb3.append(", switchElapsedMs=");
                                    sb3.append(j.z(this.f46598b.H0));
                                    str = sb3.toString();
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                nVar.b(sb2.toString());
                                j jVar8 = this.f46598b;
                                jVar8.f46631c.post(new a(jVar8, 8));
                                j jVar9 = this.f46598b;
                                w0 w0Var = jVar9.f46652k;
                                l0 l0Var = jVar9.G;
                                m0 m0Var = jVar9.I;
                                n0 n0Var = jVar9.J;
                                Size size = jVar9.f46668q;
                                Size size2 = jVar9.f46671r;
                                j jVar10 = this.f46598b;
                                ((s0) w0Var.f14830b).f46767i.post(new x70(w0Var, new h(l0Var, m0Var, n0Var, size, size2, jVar10.O, jVar10.F()), z11, 18));
                                if (z10) {
                                    j.f(this.f46598b);
                                    return;
                                }
                                l0 l0Var2 = this.f46598b.F;
                                j jVar11 = this.f46598b;
                                if (l0Var2 != jVar11.G) {
                                    jVar11.a0(jVar11.F);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e7) {
                            j jVar12 = this.f46598b;
                            if (jVar12.m0) {
                                jVar12.A("active request submission failed", e7, false);
                                return;
                            } else if (jVar12.X && jVar12.D0) {
                                jVar12.L("request submission failed", e7);
                                return;
                            } else if (jVar12.J == n0.FPS_60) {
                                jVar12.B("60 fps request submission rejected", e7);
                                return;
                            } else {
                                jVar12.N(e7);
                                return;
                            }
                        }
                    }
                }
                this.f46598b.f46649j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

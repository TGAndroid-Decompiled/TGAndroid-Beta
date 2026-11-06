package wi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.Components.qt;
import org.telegram.ui.g60;
public final class f extends CameraCaptureSession.StateCallback {
    public final int f57869a;
    public final j f57870b;

    public f(j jVar, int i7) {
        this.f57869a = i7;
        this.f57870b = jVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f57869a) {
            case 0:
                j jVar = this.f57870b;
                if (jVar.B == cameraCaptureSession) {
                    jVar.B = null;
                    jVar.D = null;
                    jVar.f57944q0 = false;
                    return;
                }
                return;
            default:
                j jVar2 = this.f57870b;
                if (jVar2.A == cameraCaptureSession) {
                    jVar2.A = null;
                    jVar2.C = null;
                    jVar2.Q = false;
                    jVar2.f57925j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f57869a) {
            case 0:
                cameraCaptureSession.close();
                j jVar = this.f57870b;
                if (jVar.f57936n0 && jVar.f57953t0 != null && cameraCaptureSession.getDevice() == jVar.f57953t0) {
                    jVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f57870b.f57965z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    j jVar2 = this.f57870b;
                    if (device == jVar2.f57965z) {
                        if (jVar2.A == cameraCaptureSession) {
                            jVar2.A = null;
                            jVar2.C = null;
                        }
                        if (jVar2.V) {
                            j jVar3 = this.f57870b;
                            if (jVar3.f57965z != null && !jVar3.f57904b0) {
                                j jVar4 = this.f57870b;
                                if (jVar4.f57936n0) {
                                    jVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (jVar4.f57953t0 != null && !jVar4.m0) {
                                    if (jVar4.X && jVar4.E0) {
                                        jVar4.L("session configuration failed", null);
                                        return;
                                    }
                                    jVar4.f57925j.b("camera session configuration failed with warm device open");
                                    this.f57870b.R("session configuration failed", null);
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
                        this.f57870b.f57925j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                n nVar = this.f57870b.f57925j;
                nVar.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
                return;
        }
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface surface;
        i iVar;
        boolean z9;
        boolean z10;
        String str;
        String str2;
        switch (this.f57869a) {
            case 0:
                if (this.f57870b.V) {
                    j jVar = this.f57870b;
                    if (jVar.f57936n0 && jVar.f57953t0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        j jVar2 = this.f57870b;
                        CameraDevice cameraDevice = jVar2.f57953t0;
                        if (device == cameraDevice && (surface = jVar2.v) != null && (iVar = jVar2.f57962x0) != null) {
                            try {
                                jVar2.B = cameraCaptureSession;
                                jVar2.D = jVar2.x(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.f57870b.D.build();
                                j jVar3 = this.f57870b;
                                cameraCaptureSession.setRepeatingRequest(build, jVar3.f57957u1, jVar3.f57935n);
                                j jVar4 = this.f57870b;
                                jVar4.f57944q0 = true;
                                jVar4.f57925j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + j.z(this.f57870b.H0));
                                j.f(this.f57870b);
                                return;
                            } catch (Exception e10) {
                                this.f57870b.A("standby request submission failed", e10, true);
                                return;
                            }
                        }
                    }
                }
                this.f57870b.f57925j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f57870b.V && this.f57870b.f57965z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    j jVar5 = this.f57870b;
                    CameraDevice cameraDevice2 = jVar5.f57965z;
                    if (device2 == cameraDevice2) {
                        jVar5.A = cameraCaptureSession;
                        try {
                            jVar5.G = jVar5.H;
                            if (cameraDevice2 != null && jVar5.f57955u != null) {
                                jVar5.C = jVar5.x(cameraDevice2, jVar5.f57955u, jVar5.l(), true, true);
                                t tVar = this.f57870b.f57959w;
                                if (tVar != null) {
                                    Handler handler = tVar.f58088u;
                                    if (tVar.f58083r0 && handler != null) {
                                        handler.post(new o(tVar, 0));
                                    }
                                }
                                j jVar6 = this.f57870b;
                                if (jVar6.f57936n0 && jVar6.f57964y0 != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (jVar6.Z && !z9) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = jVar6.A;
                                CaptureRequest.Builder builder = jVar6.C;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), jVar6.f57957u1, jVar6.f57935n);
                                }
                                j jVar7 = this.f57870b;
                                if (jVar7.f57936n0) {
                                    jVar7.f57941p0 = true;
                                }
                                if (!z9) {
                                    jVar7.Z = false;
                                }
                                if (z10) {
                                    jVar7.X = false;
                                }
                                jVar7.f57901a0 = z10;
                                n nVar = this.f57870b.f57925j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f57870b.G);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f57870b.K);
                                sb2.append(", elapsedMs=");
                                sb2.append(j.z(this.f57870b.H0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(j.z(this.f57870b.F0));
                                if (z10) {
                                    StringBuilder sb3 = new StringBuilder(", switchPath=");
                                    if (this.f57870b.E0) {
                                        str2 = "WARM_DEVICE";
                                    } else {
                                        str2 = "SEQUENTIAL";
                                    }
                                    sb3.append(str2);
                                    sb3.append(", switchElapsedMs=");
                                    sb3.append(j.z(this.f57870b.I0));
                                    str = sb3.toString();
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                nVar.b(sb2.toString());
                                j jVar8 = this.f57870b;
                                jVar8.f57906c.post(new a(jVar8, 8));
                                j jVar9 = this.f57870b;
                                qt qtVar = jVar9.f57928k;
                                m0 m0Var = jVar9.G;
                                n0 n0Var = jVar9.I;
                                o0 o0Var = jVar9.J;
                                Size size = jVar9.f57943q;
                                Size size2 = jVar9.f57946r;
                                j jVar10 = this.f57870b;
                                ((t0) qtVar.f37389b).f58104i.post(new g60(qtVar, new h(m0Var, n0Var, o0Var, size, size2, jVar10.O, jVar10.F()), z10, 18));
                                if (z9) {
                                    j.f(this.f57870b);
                                    return;
                                }
                                m0 m0Var2 = this.f57870b.F;
                                j jVar11 = this.f57870b;
                                if (m0Var2 != jVar11.G) {
                                    jVar11.a0(jVar11.F);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e11) {
                            j jVar12 = this.f57870b;
                            if (jVar12.f57936n0) {
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
                this.f57870b.f57925j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

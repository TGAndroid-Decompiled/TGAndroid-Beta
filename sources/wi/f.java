package wi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.Components.rt;
import org.telegram.ui.g60;
public final class f extends CameraCaptureSession.StateCallback {
    public final int f57962a;
    public final k f57963b;

    public f(k kVar, int i7) {
        this.f57962a = i7;
        this.f57963b = kVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f57962a) {
            case 0:
                k kVar = this.f57963b;
                if (kVar.B == cameraCaptureSession) {
                    kVar.B = null;
                    kVar.D = null;
                    kVar.f58037n0 = false;
                    return;
                }
                return;
            default:
                k kVar2 = this.f57963b;
                if (kVar2.A == cameraCaptureSession) {
                    kVar2.A = null;
                    kVar2.C = null;
                    kVar2.Q = false;
                    kVar2.f58026j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f57962a) {
            case 0:
                cameraCaptureSession.close();
                k kVar = this.f57963b;
                if (kVar.f58033l0 && kVar.f58042p0 != null && cameraCaptureSession.getDevice() == kVar.f58042p0) {
                    kVar.B("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f57963b.f58065z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    k kVar2 = this.f57963b;
                    if (device == kVar2.f58065z) {
                        if (kVar2.A == cameraCaptureSession) {
                            kVar2.A = null;
                            kVar2.C = null;
                        }
                        if (kVar2.V) {
                            k kVar3 = this.f57963b;
                            if (kVar3.f58065z != null && !kVar3.Z) {
                                k kVar4 = this.f57963b;
                                if (kVar4.f58033l0) {
                                    kVar4.B("active session configuration failed", null, false);
                                    return;
                                } else if (kVar4.J == o0.FPS_60) {
                                    kVar4.C("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    kVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f57963b.f58026j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                o oVar = this.f57963b.f58026j;
                oVar.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
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
        switch (this.f57962a) {
            case 0:
                if (this.f57963b.V) {
                    k kVar = this.f57963b;
                    if (kVar.f58033l0 && kVar.f58042p0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        k kVar2 = this.f57963b;
                        CameraDevice cameraDevice = kVar2.f58042p0;
                        if (device == cameraDevice && (surface = kVar2.v) != null && (iVar = kVar2.f58045q0) != null) {
                            try {
                                kVar2.B = cameraCaptureSession;
                                kVar2.D = kVar2.x(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.f57963b.D.build();
                                k kVar3 = this.f57963b;
                                cameraCaptureSession.setRepeatingRequest(build, kVar3.f58052s1, kVar3.f58036n);
                                k kVar4 = this.f57963b;
                                kVar4.f58037n0 = true;
                                kVar4.f58026j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + k.A(this.f57963b.F0));
                                k.d(this.f57963b);
                                return;
                            } catch (Exception e10) {
                                this.f57963b.B("standby request submission failed", e10, true);
                                return;
                            }
                        }
                    }
                }
                this.f57963b.f58026j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f57963b.V && this.f57963b.f58065z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    k kVar5 = this.f57963b;
                    CameraDevice cameraDevice2 = kVar5.f58065z;
                    if (device2 == cameraDevice2) {
                        kVar5.A = cameraCaptureSession;
                        try {
                            kVar5.G = kVar5.H;
                            if (cameraDevice2 != null && kVar5.f58056u != null) {
                                kVar5.C = kVar5.x(cameraDevice2, kVar5.f58056u, kVar5.k(), true, true);
                                t tVar = this.f57963b.f58059w;
                                if (tVar != null) {
                                    Handler handler = tVar.f58182u;
                                    if (tVar.f58177r0 && handler != null) {
                                        handler.post(new q(tVar, 0));
                                    }
                                }
                                k kVar6 = this.f57963b;
                                if (kVar6.f58033l0 && kVar6.f58048r0 != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (kVar6.X && !z9) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = kVar6.A;
                                CaptureRequest.Builder builder = kVar6.C;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), kVar6.f58052s1, kVar6.f58036n);
                                }
                                k kVar7 = this.f57963b;
                                if (kVar7.f58033l0) {
                                    kVar7.m0 = true;
                                }
                                if (!z9) {
                                    kVar7.X = false;
                                }
                                if (z10) {
                                    kVar7.W = false;
                                }
                                kVar7.Y = z10;
                                o oVar = this.f57963b.f58026j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f57963b.G);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f57963b.K);
                                sb2.append(", elapsedMs=");
                                sb2.append(k.A(this.f57963b.F0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(k.A(this.f57963b.D0));
                                if (z10) {
                                    str = ", switchPath=SEQUENTIAL, switchElapsedMs=" + k.A(this.f57963b.G0);
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                oVar.b(sb2.toString());
                                k kVar8 = this.f57963b;
                                kVar8.f58007c.post(new a(kVar8, 9));
                                k kVar9 = this.f57963b;
                                rt rtVar = kVar9.f58029k;
                                m0 m0Var = kVar9.G;
                                n0 n0Var = kVar9.I;
                                o0 o0Var = kVar9.J;
                                Size size = kVar9.f58044q;
                                Size size2 = kVar9.f58047r;
                                k kVar10 = this.f57963b;
                                ((t0) rtVar.f37758b).f58200i.post(new g60(rtVar, new h(m0Var, n0Var, o0Var, size, size2, kVar10.O, kVar10.G()), z10, 18));
                                if (z9) {
                                    k.d(this.f57963b);
                                    return;
                                }
                                m0 m0Var2 = this.f57963b.F;
                                k kVar11 = this.f57963b;
                                if (m0Var2 != kVar11.G) {
                                    kVar11.Z(kVar11.F);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e11) {
                            k kVar12 = this.f57963b;
                            if (kVar12.f58033l0) {
                                kVar12.B("active request submission failed", e11, false);
                                return;
                            } else if (kVar12.J == o0.FPS_60) {
                                kVar12.C("60 fps request submission rejected", e11);
                                return;
                            } else {
                                kVar12.N(e11);
                                return;
                            }
                        }
                    }
                }
                this.f57963b.f58026j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

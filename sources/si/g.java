package si;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.z70;
public final class g extends CameraCaptureSession.StateCallback {
    public final int f46642a;
    public final k f46643b;

    public g(k kVar, int i10) {
        this.f46642a = i10;
        this.f46643b = kVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f46642a) {
            case 0:
                k kVar = this.f46643b;
                if (kVar.B == cameraCaptureSession) {
                    kVar.B = null;
                    kVar.D = null;
                    kVar.f46717p0 = false;
                    return;
                }
                return;
            default:
                k kVar2 = this.f46643b;
                if (kVar2.A == cameraCaptureSession) {
                    kVar2.A = null;
                    kVar2.C = null;
                    kVar2.Q = false;
                    kVar2.f46700j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f46642a) {
            case 0:
                cameraCaptureSession.close();
                k kVar = this.f46643b;
                if (kVar.m0 && kVar.f46726s0 != null && cameraCaptureSession.getDevice() == kVar.f46726s0) {
                    kVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f46643b.f46740z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    k kVar2 = this.f46643b;
                    if (device == kVar2.f46740z) {
                        if (kVar2.A == cameraCaptureSession) {
                            kVar2.A = null;
                            kVar2.C = null;
                        }
                        if (kVar2.V) {
                            k kVar3 = this.f46643b;
                            if (kVar3.f46740z != null && !kVar3.f46680b0) {
                                k kVar4 = this.f46643b;
                                if (kVar4.m0) {
                                    kVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (kVar4.f46726s0 != null && !kVar4.f46707l0) {
                                    if (kVar4.X && kVar4.D0) {
                                        kVar4.L("session configuration failed", null);
                                        return;
                                    }
                                    kVar4.f46700j.b("camera session configuration failed with warm device open");
                                    this.f46643b.R("session configuration failed", null);
                                    return;
                                } else if (kVar4.J == n0.FPS_60) {
                                    kVar4.B("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    kVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f46643b.f46700j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                o oVar = this.f46643b.f46700j;
                oVar.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
                return;
        }
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface surface;
        j jVar;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        switch (this.f46642a) {
            case 0:
                if (this.f46643b.V) {
                    k kVar = this.f46643b;
                    if (kVar.m0 && kVar.f46726s0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        k kVar2 = this.f46643b;
                        CameraDevice cameraDevice = kVar2.f46726s0;
                        if (device == cameraDevice && (surface = kVar2.v) != null && (jVar = kVar2.f46735w0) != null) {
                            try {
                                kVar2.B = cameraCaptureSession;
                                kVar2.D = kVar2.x(cameraDevice, surface, jVar, false, true);
                                CaptureRequest build = this.f46643b.D.build();
                                k kVar3 = this.f46643b;
                                cameraCaptureSession.setRepeatingRequest(build, kVar3.f46730t1, kVar3.f46710n);
                                k kVar4 = this.f46643b;
                                kVar4.f46717p0 = true;
                                kVar4.f46700j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + k.z(this.f46643b.G0));
                                k.f(this.f46643b);
                                return;
                            } catch (Exception e) {
                                this.f46643b.A("standby request submission failed", e, true);
                                return;
                            }
                        }
                    }
                }
                this.f46643b.f46700j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f46643b.V && this.f46643b.f46740z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    k kVar5 = this.f46643b;
                    CameraDevice cameraDevice2 = kVar5.f46740z;
                    if (device2 == cameraDevice2) {
                        kVar5.A = cameraCaptureSession;
                        try {
                            kVar5.G = kVar5.H;
                            if (cameraDevice2 != null && kVar5.f46731u != null) {
                                kVar5.C = kVar5.x(cameraDevice2, kVar5.f46731u, kVar5.l(), true, true);
                                u uVar = this.f46643b.f46734w;
                                if (uVar != null) {
                                    Handler handler = uVar.f46865u;
                                    if (uVar.f46860r0 && handler != null) {
                                        handler.post(new q(uVar, 0));
                                    }
                                }
                                k kVar6 = this.f46643b;
                                if (kVar6.m0 && kVar6.f46737x0 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (kVar6.Z && !z10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = kVar6.A;
                                CaptureRequest.Builder builder = kVar6.C;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), kVar6.f46730t1, kVar6.f46710n);
                                }
                                k kVar7 = this.f46643b;
                                if (kVar7.m0) {
                                    kVar7.f46714o0 = true;
                                }
                                if (!z10) {
                                    kVar7.Z = false;
                                }
                                if (z11) {
                                    kVar7.X = false;
                                }
                                kVar7.f46677a0 = z11;
                                o oVar = this.f46643b.f46700j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f46643b.G);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f46643b.K);
                                sb2.append(", elapsedMs=");
                                sb2.append(k.z(this.f46643b.G0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(k.z(this.f46643b.E0));
                                if (z11) {
                                    StringBuilder sb3 = new StringBuilder(", switchPath=");
                                    if (this.f46643b.D0) {
                                        str2 = "WARM_DEVICE";
                                    } else {
                                        str2 = "SEQUENTIAL";
                                    }
                                    sb3.append(str2);
                                    sb3.append(", switchElapsedMs=");
                                    sb3.append(k.z(this.f46643b.H0));
                                    str = sb3.toString();
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                oVar.b(sb2.toString());
                                k kVar8 = this.f46643b;
                                kVar8.f46682c.post(new b(kVar8, 8));
                                k kVar9 = this.f46643b;
                                l2.f fVar = kVar9.f46703k;
                                l0 l0Var = kVar9.G;
                                m0 m0Var = kVar9.I;
                                n0 n0Var = kVar9.J;
                                Size size = kVar9.f46719q;
                                Size size2 = kVar9.f46722r;
                                k kVar10 = this.f46643b;
                                ((s0) fVar.f15844b).f46809i.post(new z70(fVar, new i(l0Var, m0Var, n0Var, size, size2, kVar10.O, kVar10.F()), z11, 18));
                                if (z10) {
                                    k.f(this.f46643b);
                                    return;
                                }
                                l0 l0Var2 = this.f46643b.F;
                                k kVar11 = this.f46643b;
                                if (l0Var2 != kVar11.G) {
                                    kVar11.a0(kVar11.F);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e7) {
                            k kVar12 = this.f46643b;
                            if (kVar12.m0) {
                                kVar12.A("active request submission failed", e7, false);
                                return;
                            } else if (kVar12.X && kVar12.D0) {
                                kVar12.L("request submission failed", e7);
                                return;
                            } else if (kVar12.J == n0.FPS_60) {
                                kVar12.B("60 fps request submission rejected", e7);
                                return;
                            } else {
                                kVar12.N(e7);
                                return;
                            }
                        }
                    }
                }
                this.f46643b.f46700j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

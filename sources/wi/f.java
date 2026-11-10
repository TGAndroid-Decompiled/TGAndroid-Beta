package wi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.Components.qt;
import org.telegram.ui.j60;
public final class f extends CameraCaptureSession.StateCallback {
    public final int f57978a;
    public final k f57979b;

    public f(k kVar, int i7) {
        this.f57978a = i7;
        this.f57979b = kVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f57978a) {
            case 0:
                k kVar = this.f57979b;
                if (kVar.A == cameraCaptureSession) {
                    kVar.A = null;
                    kVar.C = null;
                    kVar.m0 = false;
                    return;
                }
                return;
            default:
                k kVar2 = this.f57979b;
                if (kVar2.f58078z == cameraCaptureSession) {
                    kVar2.f58078z = null;
                    kVar2.B = null;
                    kVar2.P = false;
                    kVar2.f58040j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f57978a) {
            case 0:
                cameraCaptureSession.close();
                k kVar = this.f57979b;
                if (kVar.f58044k0 && kVar.f58053o0 != null && cameraCaptureSession.getDevice() == kVar.f58053o0) {
                    kVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f57979b.f58076y != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    k kVar2 = this.f57979b;
                    if (device == kVar2.f58076y) {
                        if (kVar2.f58078z == cameraCaptureSession) {
                            kVar2.f58078z = null;
                            kVar2.B = null;
                        }
                        if (kVar2.U) {
                            k kVar3 = this.f57979b;
                            if (kVar3.f58076y != null && !kVar3.Y) {
                                k kVar4 = this.f57979b;
                                if (kVar4.f58044k0) {
                                    kVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (kVar4.I == o0.FPS_60) {
                                    kVar4.B("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    kVar4.M(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f57979b.f58040j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                o oVar = this.f57979b.f58040j;
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
        switch (this.f57978a) {
            case 0:
                if (this.f57979b.U) {
                    k kVar = this.f57979b;
                    if (kVar.f58044k0 && kVar.f58053o0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        k kVar2 = this.f57979b;
                        CameraDevice cameraDevice = kVar2.f58053o0;
                        if (device == cameraDevice && (surface = kVar2.f58069u) != null && (iVar = kVar2.f58056p0) != null) {
                            try {
                                kVar2.A = cameraCaptureSession;
                                kVar2.C = kVar2.w(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.f57979b.C.build();
                                k kVar3 = this.f57979b;
                                cameraCaptureSession.setRepeatingRequest(build, kVar3.f58063r1, kVar3.f58050n);
                                k kVar4 = this.f57979b;
                                kVar4.m0 = true;
                                kVar4.f58040j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + k.z(this.f57979b.E0));
                                k.d(this.f57979b);
                                return;
                            } catch (Exception e10) {
                                this.f57979b.A("standby request submission failed", e10, true);
                                return;
                            }
                        }
                    }
                }
                this.f57979b.f58040j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f57979b.U && this.f57979b.f58076y != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    k kVar5 = this.f57979b;
                    CameraDevice cameraDevice2 = kVar5.f58076y;
                    if (device2 == cameraDevice2) {
                        kVar5.f58078z = cameraCaptureSession;
                        try {
                            kVar5.F = kVar5.G;
                            if (cameraDevice2 != null && kVar5.f58067t != null) {
                                kVar5.B = kVar5.w(cameraDevice2, kVar5.f58067t, kVar5.k(), true, true);
                                t tVar = this.f57979b.v;
                                if (tVar != null) {
                                    Handler handler = tVar.f58195u;
                                    if (tVar.f58190r0 && handler != null) {
                                        handler.post(new q(tVar, 0));
                                    }
                                }
                                k kVar6 = this.f57979b;
                                if (kVar6.f58044k0 && kVar6.f58059q0 != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (kVar6.W && !z9) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = kVar6.f58078z;
                                CaptureRequest.Builder builder = kVar6.B;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), kVar6.f58063r1, kVar6.f58050n);
                                }
                                k kVar7 = this.f57979b;
                                if (kVar7.f58044k0) {
                                    kVar7.f58047l0 = true;
                                }
                                if (!z9) {
                                    kVar7.W = false;
                                }
                                if (z10) {
                                    kVar7.V = false;
                                }
                                kVar7.X = z10;
                                o oVar = this.f57979b.f58040j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f57979b.F);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f57979b.J);
                                sb2.append(", elapsedMs=");
                                sb2.append(k.z(this.f57979b.E0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(k.z(this.f57979b.C0));
                                if (z10) {
                                    str = ", switchPath=SEQUENTIAL, switchElapsedMs=" + k.z(this.f57979b.F0);
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                oVar.b(sb2.toString());
                                k kVar8 = this.f57979b;
                                kVar8.f58021c.post(new a(kVar8, 9));
                                k kVar9 = this.f57979b;
                                qt qtVar = kVar9.f58043k;
                                m0 m0Var = kVar9.F;
                                n0 n0Var = kVar9.H;
                                o0 o0Var = kVar9.I;
                                Size size = kVar9.f58058q;
                                k kVar10 = this.f57979b;
                                ((t0) qtVar.f37395b).f58213i.post(new j60(qtVar, new h(m0Var, n0Var, o0Var, size, kVar10.N, kVar10.F()), z10, 18));
                                if (z9) {
                                    k.d(this.f57979b);
                                    return;
                                }
                                m0 m0Var2 = this.f57979b.E;
                                k kVar11 = this.f57979b;
                                if (m0Var2 != kVar11.F) {
                                    kVar11.Y(kVar11.E);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e11) {
                            k kVar12 = this.f57979b;
                            if (kVar12.f58044k0) {
                                kVar12.A("active request submission failed", e11, false);
                                return;
                            } else if (kVar12.I == o0.FPS_60) {
                                kVar12.B("60 fps request submission rejected", e11);
                                return;
                            } else {
                                kVar12.M(e11);
                                return;
                            }
                        }
                    }
                }
                this.f57979b.f58040j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

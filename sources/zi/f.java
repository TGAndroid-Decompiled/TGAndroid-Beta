package zi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.b80;
public final class f extends CameraCaptureSession.StateCallback {
    public final int f62126a;
    public final k f62127b;

    public f(k kVar, int i7) {
        this.f62126a = i7;
        this.f62127b = kVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f62126a) {
            case 0:
                k kVar = this.f62127b;
                if (kVar.A == cameraCaptureSession) {
                    kVar.A = null;
                    kVar.C = null;
                    kVar.m0 = false;
                    return;
                }
                return;
            default:
                k kVar2 = this.f62127b;
                if (kVar2.f62226z == cameraCaptureSession) {
                    kVar2.f62226z = null;
                    kVar2.B = null;
                    kVar2.P = false;
                    kVar2.f62188j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f62126a) {
            case 0:
                cameraCaptureSession.close();
                k kVar = this.f62127b;
                if (kVar.f62192k0 && kVar.f62201o0 != null && cameraCaptureSession.getDevice() == kVar.f62201o0) {
                    kVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f62127b.f62224y != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    k kVar2 = this.f62127b;
                    if (device == kVar2.f62224y) {
                        if (kVar2.f62226z == cameraCaptureSession) {
                            kVar2.f62226z = null;
                            kVar2.B = null;
                        }
                        if (kVar2.U) {
                            k kVar3 = this.f62127b;
                            if (kVar3.f62224y != null && !kVar3.Y) {
                                k kVar4 = this.f62127b;
                                if (kVar4.f62192k0) {
                                    kVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (kVar4.I == p0.FPS_60) {
                                    kVar4.B("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    kVar4.M(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f62127b.f62188j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                o oVar = this.f62127b.f62188j;
                oVar.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
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
        switch (this.f62126a) {
            case 0:
                if (this.f62127b.U) {
                    k kVar = this.f62127b;
                    if (kVar.f62192k0 && kVar.f62201o0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        k kVar2 = this.f62127b;
                        CameraDevice cameraDevice = kVar2.f62201o0;
                        if (device == cameraDevice && (surface = kVar2.f62217u) != null && (iVar = kVar2.f62204p0) != null) {
                            try {
                                kVar2.A = cameraCaptureSession;
                                kVar2.C = kVar2.w(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.f62127b.C.build();
                                k kVar3 = this.f62127b;
                                cameraCaptureSession.setRepeatingRequest(build, kVar3.f62211r1, kVar3.f62198n);
                                k kVar4 = this.f62127b;
                                kVar4.m0 = true;
                                kVar4.f62188j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + k.z(this.f62127b.E0));
                                k.d(this.f62127b);
                                return;
                            } catch (Exception e10) {
                                this.f62127b.A("standby request submission failed", e10, true);
                                return;
                            }
                        }
                    }
                }
                this.f62127b.f62188j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f62127b.U && this.f62127b.f62224y != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    k kVar5 = this.f62127b;
                    CameraDevice cameraDevice2 = kVar5.f62224y;
                    if (device2 == cameraDevice2) {
                        kVar5.f62226z = cameraCaptureSession;
                        try {
                            kVar5.F = kVar5.G;
                            if (cameraDevice2 != null && kVar5.f62215t != null) {
                                kVar5.B = kVar5.w(cameraDevice2, kVar5.f62215t, kVar5.k(), true, true);
                                t tVar = this.f62127b.v;
                                if (tVar != null) {
                                    Handler handler = tVar.f62338u;
                                    if (tVar.f62333r0 && handler != null) {
                                        handler.post(new q(tVar, 0));
                                    }
                                }
                                k kVar6 = this.f62127b;
                                if (kVar6.f62192k0 && kVar6.f62207q0 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (kVar6.W && !z10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = kVar6.f62226z;
                                CaptureRequest.Builder builder = kVar6.B;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), kVar6.f62211r1, kVar6.f62198n);
                                }
                                k kVar7 = this.f62127b;
                                if (kVar7.f62192k0) {
                                    kVar7.f62195l0 = true;
                                }
                                if (!z10) {
                                    kVar7.W = false;
                                }
                                if (z11) {
                                    kVar7.V = false;
                                }
                                kVar7.X = z11;
                                o oVar = this.f62127b.f62188j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f62127b.F);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f62127b.J);
                                sb2.append(", elapsedMs=");
                                sb2.append(k.z(this.f62127b.E0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(k.z(this.f62127b.C0));
                                if (z11) {
                                    str = ", switchPath=SEQUENTIAL, switchElapsedMs=" + k.z(this.f62127b.F0);
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                oVar.b(sb2.toString());
                                k kVar8 = this.f62127b;
                                kVar8.f62169c.post(new a(kVar8, 9));
                                k kVar9 = this.f62127b;
                                k0 k0Var = kVar9.f62191k;
                                n0 n0Var = kVar9.F;
                                o0 o0Var = kVar9.H;
                                p0 p0Var = kVar9.I;
                                Size size = kVar9.f62206q;
                                k kVar10 = this.f62127b;
                                ((u0) k0Var.f62228a).f62362i.post(new b80(k0Var, new h(n0Var, o0Var, p0Var, size, kVar10.N, kVar10.F()), z11, 17));
                                if (z10) {
                                    k.d(this.f62127b);
                                    return;
                                }
                                n0 n0Var2 = this.f62127b.E;
                                k kVar11 = this.f62127b;
                                if (n0Var2 != kVar11.F) {
                                    kVar11.Y(kVar11.E);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e11) {
                            k kVar12 = this.f62127b;
                            if (kVar12.f62192k0) {
                                kVar12.A("active request submission failed", e11, false);
                                return;
                            } else if (kVar12.I == p0.FPS_60) {
                                kVar12.B("60 fps request submission rejected", e11);
                                return;
                            } else {
                                kVar12.M(e11);
                                return;
                            }
                        }
                    }
                }
                this.f62127b.f62188j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

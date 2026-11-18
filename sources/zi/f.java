package zi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.a80;
public final class f extends CameraCaptureSession.StateCallback {
    public final int f62080a;
    public final k f62081b;

    public f(k kVar, int i7) {
        this.f62080a = i7;
        this.f62081b = kVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f62080a) {
            case 0:
                k kVar = this.f62081b;
                if (kVar.A == cameraCaptureSession) {
                    kVar.A = null;
                    kVar.C = null;
                    kVar.m0 = false;
                    return;
                }
                return;
            default:
                k kVar2 = this.f62081b;
                if (kVar2.f62180z == cameraCaptureSession) {
                    kVar2.f62180z = null;
                    kVar2.B = null;
                    kVar2.P = false;
                    kVar2.f62142j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f62080a) {
            case 0:
                cameraCaptureSession.close();
                k kVar = this.f62081b;
                if (kVar.f62146k0 && kVar.f62155o0 != null && cameraCaptureSession.getDevice() == kVar.f62155o0) {
                    kVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f62081b.f62178y != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    k kVar2 = this.f62081b;
                    if (device == kVar2.f62178y) {
                        if (kVar2.f62180z == cameraCaptureSession) {
                            kVar2.f62180z = null;
                            kVar2.B = null;
                        }
                        if (kVar2.U) {
                            k kVar3 = this.f62081b;
                            if (kVar3.f62178y != null && !kVar3.Y) {
                                k kVar4 = this.f62081b;
                                if (kVar4.f62146k0) {
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
                        this.f62081b.f62142j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                o oVar = this.f62081b.f62142j;
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
        switch (this.f62080a) {
            case 0:
                if (this.f62081b.U) {
                    k kVar = this.f62081b;
                    if (kVar.f62146k0 && kVar.f62155o0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        k kVar2 = this.f62081b;
                        CameraDevice cameraDevice = kVar2.f62155o0;
                        if (device == cameraDevice && (surface = kVar2.f62171u) != null && (iVar = kVar2.f62158p0) != null) {
                            try {
                                kVar2.A = cameraCaptureSession;
                                kVar2.C = kVar2.w(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.f62081b.C.build();
                                k kVar3 = this.f62081b;
                                cameraCaptureSession.setRepeatingRequest(build, kVar3.f62165r1, kVar3.f62152n);
                                k kVar4 = this.f62081b;
                                kVar4.m0 = true;
                                kVar4.f62142j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + k.z(this.f62081b.E0));
                                k.d(this.f62081b);
                                return;
                            } catch (Exception e10) {
                                this.f62081b.A("standby request submission failed", e10, true);
                                return;
                            }
                        }
                    }
                }
                this.f62081b.f62142j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f62081b.U && this.f62081b.f62178y != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    k kVar5 = this.f62081b;
                    CameraDevice cameraDevice2 = kVar5.f62178y;
                    if (device2 == cameraDevice2) {
                        kVar5.f62180z = cameraCaptureSession;
                        try {
                            kVar5.F = kVar5.G;
                            if (cameraDevice2 != null && kVar5.f62169t != null) {
                                kVar5.B = kVar5.w(cameraDevice2, kVar5.f62169t, kVar5.k(), true, true);
                                t tVar = this.f62081b.v;
                                if (tVar != null) {
                                    Handler handler = tVar.f62292u;
                                    if (tVar.f62287r0 && handler != null) {
                                        handler.post(new q(tVar, 0));
                                    }
                                }
                                k kVar6 = this.f62081b;
                                if (kVar6.f62146k0 && kVar6.f62161q0 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (kVar6.W && !z10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = kVar6.f62180z;
                                CaptureRequest.Builder builder = kVar6.B;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), kVar6.f62165r1, kVar6.f62152n);
                                }
                                k kVar7 = this.f62081b;
                                if (kVar7.f62146k0) {
                                    kVar7.f62149l0 = true;
                                }
                                if (!z10) {
                                    kVar7.W = false;
                                }
                                if (z11) {
                                    kVar7.V = false;
                                }
                                kVar7.X = z11;
                                o oVar = this.f62081b.f62142j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f62081b.F);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f62081b.J);
                                sb2.append(", elapsedMs=");
                                sb2.append(k.z(this.f62081b.E0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(k.z(this.f62081b.C0));
                                if (z11) {
                                    str = ", switchPath=SEQUENTIAL, switchElapsedMs=" + k.z(this.f62081b.F0);
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                oVar.b(sb2.toString());
                                k kVar8 = this.f62081b;
                                kVar8.f62123c.post(new a(kVar8, 9));
                                k kVar9 = this.f62081b;
                                k0 k0Var = kVar9.f62145k;
                                n0 n0Var = kVar9.F;
                                o0 o0Var = kVar9.H;
                                p0 p0Var = kVar9.I;
                                Size size = kVar9.f62160q;
                                k kVar10 = this.f62081b;
                                ((u0) k0Var.f62182a).f62316i.post(new a80(k0Var, new h(n0Var, o0Var, p0Var, size, kVar10.N, kVar10.F()), z11, 17));
                                if (z10) {
                                    k.d(this.f62081b);
                                    return;
                                }
                                n0 n0Var2 = this.f62081b.E;
                                k kVar11 = this.f62081b;
                                if (n0Var2 != kVar11.F) {
                                    kVar11.Y(kVar11.E);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e11) {
                            k kVar12 = this.f62081b;
                            if (kVar12.f62146k0) {
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
                this.f62081b.f62142j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

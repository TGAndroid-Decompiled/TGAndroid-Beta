package zi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.f60;
public final class g extends CameraCaptureSession.StateCallback {
    public final int f61517a;
    public final l f61518b;

    public g(l lVar, int i7) {
        this.f61517a = i7;
        this.f61518b = lVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f61517a) {
            case 0:
                l lVar = this.f61518b;
                if (lVar.A == cameraCaptureSession) {
                    lVar.A = null;
                    lVar.C = null;
                    lVar.m0 = false;
                    return;
                }
                return;
            default:
                l lVar2 = this.f61518b;
                if (lVar2.f61617z == cameraCaptureSession) {
                    lVar2.f61617z = null;
                    lVar2.B = null;
                    lVar2.P = false;
                    lVar2.f61579j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f61517a) {
            case 0:
                cameraCaptureSession.close();
                l lVar = this.f61518b;
                if (lVar.f61583k0 && lVar.f61592o0 != null && cameraCaptureSession.getDevice() == lVar.f61592o0) {
                    lVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f61518b.f61615y != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    l lVar2 = this.f61518b;
                    if (device == lVar2.f61615y) {
                        if (lVar2.f61617z == cameraCaptureSession) {
                            lVar2.f61617z = null;
                            lVar2.B = null;
                        }
                        if (lVar2.U) {
                            l lVar3 = this.f61518b;
                            if (lVar3.f61615y != null && !lVar3.Y) {
                                l lVar4 = this.f61518b;
                                if (lVar4.f61583k0) {
                                    lVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (lVar4.I == q0.FPS_60) {
                                    lVar4.B("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    lVar4.M(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f61518b.f61579j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                p pVar = this.f61518b.f61579j;
                pVar.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
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
        switch (this.f61517a) {
            case 0:
                if (this.f61518b.U) {
                    l lVar = this.f61518b;
                    if (lVar.f61583k0 && lVar.f61592o0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        l lVar2 = this.f61518b;
                        CameraDevice cameraDevice = lVar2.f61592o0;
                        if (device == cameraDevice && (surface = lVar2.f61608u) != null && (jVar = lVar2.f61595p0) != null) {
                            try {
                                lVar2.A = cameraCaptureSession;
                                lVar2.C = lVar2.w(cameraDevice, surface, jVar, false, true);
                                CaptureRequest build = this.f61518b.C.build();
                                l lVar3 = this.f61518b;
                                cameraCaptureSession.setRepeatingRequest(build, lVar3.f61602r1, lVar3.f61589n);
                                l lVar4 = this.f61518b;
                                lVar4.m0 = true;
                                lVar4.f61579j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + l.z(this.f61518b.E0));
                                l.d(this.f61518b);
                                return;
                            } catch (Exception e10) {
                                this.f61518b.A("standby request submission failed", e10, true);
                                return;
                            }
                        }
                    }
                }
                this.f61518b.f61579j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f61518b.U && this.f61518b.f61615y != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    l lVar5 = this.f61518b;
                    CameraDevice cameraDevice2 = lVar5.f61615y;
                    if (device2 == cameraDevice2) {
                        lVar5.f61617z = cameraCaptureSession;
                        try {
                            lVar5.F = lVar5.G;
                            if (cameraDevice2 != null && lVar5.f61606t != null) {
                                lVar5.B = lVar5.w(cameraDevice2, lVar5.f61606t, lVar5.k(), true, true);
                                u uVar = this.f61518b.v;
                                if (uVar != null) {
                                    Handler handler = uVar.f61728u;
                                    if (uVar.f61723r0 && handler != null) {
                                        handler.post(new r(uVar, 0));
                                    }
                                }
                                l lVar6 = this.f61518b;
                                if (lVar6.f61583k0 && lVar6.f61598q0 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (lVar6.W && !z10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = lVar6.f61617z;
                                CaptureRequest.Builder builder = lVar6.B;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), lVar6.f61602r1, lVar6.f61589n);
                                }
                                l lVar7 = this.f61518b;
                                if (lVar7.f61583k0) {
                                    lVar7.f61586l0 = true;
                                }
                                if (!z10) {
                                    lVar7.W = false;
                                }
                                if (z11) {
                                    lVar7.V = false;
                                }
                                lVar7.X = z11;
                                p pVar = this.f61518b.f61579j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f61518b.F);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f61518b.J);
                                sb2.append(", elapsedMs=");
                                sb2.append(l.z(this.f61518b.E0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(l.z(this.f61518b.C0));
                                if (z11) {
                                    str = ", switchPath=SEQUENTIAL, switchElapsedMs=" + l.z(this.f61518b.F0);
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                pVar.b(sb2.toString());
                                l lVar8 = this.f61518b;
                                lVar8.f61560c.post(new a(lVar8, 9));
                                l lVar9 = this.f61518b;
                                u7.i iVar = lVar9.f61582k;
                                n0 n0Var = lVar9.F;
                                o0 o0Var = lVar9.H;
                                q0 q0Var = lVar9.I;
                                Size size = lVar9.f61597q;
                                l lVar10 = this.f61518b;
                                ((v0) iVar.f57880a).f61752i.post(new f60(iVar, new i(n0Var, o0Var, q0Var, size, lVar10.N, lVar10.F()), z11, 18));
                                if (z10) {
                                    l.d(this.f61518b);
                                    return;
                                }
                                n0 n0Var2 = this.f61518b.E;
                                l lVar11 = this.f61518b;
                                if (n0Var2 != lVar11.F) {
                                    lVar11.Y(lVar11.E);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e11) {
                            l lVar12 = this.f61518b;
                            if (lVar12.f61583k0) {
                                lVar12.A("active request submission failed", e11, false);
                                return;
                            } else if (lVar12.I == q0.FPS_60) {
                                lVar12.B("60 fps request submission rejected", e11);
                                return;
                            } else {
                                lVar12.M(e11);
                                return;
                            }
                        }
                    }
                }
                this.f61518b.f61579j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}

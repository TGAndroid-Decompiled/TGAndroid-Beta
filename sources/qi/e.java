package qi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import org.telegram.ui.dm0;
public final class e extends CameraCaptureSession.StateCallback {
    public final h f46685a;

    public e(h hVar) {
        this.f46685a = hVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        h hVar = this.f46685a;
        if (hVar.f46755z != cameraCaptureSession) {
            return;
        }
        hVar.f46755z = null;
        hVar.A = null;
        hVar.N = false;
        hVar.f46725j.b("capture session closed");
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        h hVar = this.f46685a;
        if (hVar.f46755z == cameraCaptureSession) {
            hVar.f46755z = null;
            hVar.A = null;
        }
        if (hVar.S) {
            h hVar2 = this.f46685a;
            if (hVar2.f46753y != null && !hVar2.U && !hVar2.Y) {
                h hVar3 = this.f46685a;
                if (hVar3.G == k0.FPS_60) {
                    hVar3.n("60 fps session configuration failed", null);
                    return;
                } else {
                    hVar3.t(new IllegalStateException("Camera capture session configuration failed"));
                    return;
                }
            }
        }
        this.f46685a.f46725j.b("stale capture session configuration failure ignored");
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        if (this.f46685a.S) {
            h hVar = this.f46685a;
            if (hVar.f46753y != null) {
                hVar.f46755z = cameraCaptureSession;
                try {
                    hVar.D = hVar.E;
                    hVar.A = hVar.l(true);
                    p pVar = this.f46685a.v;
                    if (pVar != null) {
                        Handler handler = pVar.f46839o;
                        if (pVar.f46833k0 && handler != null) {
                            handler.post(new m(pVar, 0));
                        }
                    }
                    h hVar2 = this.f46685a;
                    boolean z10 = hVar2.W;
                    hVar2.W = false;
                    hVar2.X = z10;
                    h hVar3 = this.f46685a;
                    CameraCaptureSession cameraCaptureSession2 = hVar3.f46755z;
                    CaptureRequest.Builder builder = hVar3.A;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), hVar3.S0, hVar3.f46732n);
                    }
                    l lVar = this.f46685a.f46725j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.f46685a.D);
                    sb2.append(", fpsRange=");
                    sb2.append(this.f46685a.H);
                    sb2.append(", elapsedMs=");
                    sb2.append(h.m(this.f46685a.f46722h0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(h.m(this.f46685a.f46719f0));
                    if (z10) {
                        str = ", switchElapsedMs=" + h.m(this.f46685a.f46724i0);
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    lVar.b(sb2.toString());
                    h hVar4 = this.f46685a;
                    hVar4.f46713c.post(new a(hVar4, 7));
                    h hVar5 = this.f46685a;
                    k2.g0 g0Var = hVar5.f46727k;
                    i0 i0Var = hVar5.D;
                    j0 j0Var = hVar5.F;
                    k0 k0Var = hVar5.G;
                    Size size = hVar5.f46738q;
                    Size size2 = hVar5.f46740r;
                    h hVar6 = this.f46685a;
                    ((p0) g0Var.f14466b).f46859j.post(new dm0(g0Var, new g(i0Var, j0Var, k0Var, size, size2, hVar6.L, hVar6.q()), z10, 14));
                    i0 i0Var2 = this.f46685a.C;
                    h hVar7 = this.f46685a;
                    if (i0Var2 != hVar7.D) {
                        hVar7.F(hVar7.C);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    h hVar8 = this.f46685a;
                    if (hVar8.G == k0.FPS_60) {
                        hVar8.n("60 fps request submission rejected", e7);
                        return;
                    } else {
                        hVar8.t(e7);
                        return;
                    }
                }
            }
        }
        cameraCaptureSession.close();
    }
}

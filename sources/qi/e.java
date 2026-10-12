package qi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import org.telegram.ui.dm0;
public final class e extends CameraCaptureSession.StateCallback {
    public final h f46693a;

    public e(h hVar) {
        this.f46693a = hVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        h hVar = this.f46693a;
        if (hVar.f46763z != cameraCaptureSession) {
            return;
        }
        hVar.f46763z = null;
        hVar.A = null;
        hVar.N = false;
        hVar.f46733j.b("capture session closed");
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        h hVar = this.f46693a;
        if (hVar.f46763z == cameraCaptureSession) {
            hVar.f46763z = null;
            hVar.A = null;
        }
        if (hVar.S) {
            h hVar2 = this.f46693a;
            if (hVar2.f46761y != null && !hVar2.U && !hVar2.Y) {
                h hVar3 = this.f46693a;
                if (hVar3.G == k0.FPS_60) {
                    hVar3.n("60 fps session configuration failed", null);
                    return;
                } else {
                    hVar3.t(new IllegalStateException("Camera capture session configuration failed"));
                    return;
                }
            }
        }
        this.f46693a.f46733j.b("stale capture session configuration failure ignored");
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        if (this.f46693a.S) {
            h hVar = this.f46693a;
            if (hVar.f46761y != null) {
                hVar.f46763z = cameraCaptureSession;
                try {
                    hVar.D = hVar.E;
                    hVar.A = hVar.l(true);
                    p pVar = this.f46693a.v;
                    if (pVar != null) {
                        Handler handler = pVar.f46847o;
                        if (pVar.f46841k0 && handler != null) {
                            handler.post(new m(pVar, 0));
                        }
                    }
                    h hVar2 = this.f46693a;
                    boolean z10 = hVar2.W;
                    hVar2.W = false;
                    hVar2.X = z10;
                    h hVar3 = this.f46693a;
                    CameraCaptureSession cameraCaptureSession2 = hVar3.f46763z;
                    CaptureRequest.Builder builder = hVar3.A;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), hVar3.S0, hVar3.f46740n);
                    }
                    l lVar = this.f46693a.f46733j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.f46693a.D);
                    sb2.append(", fpsRange=");
                    sb2.append(this.f46693a.H);
                    sb2.append(", elapsedMs=");
                    sb2.append(h.m(this.f46693a.f46730h0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(h.m(this.f46693a.f46727f0));
                    if (z10) {
                        str = ", switchElapsedMs=" + h.m(this.f46693a.f46732i0);
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    lVar.b(sb2.toString());
                    h hVar4 = this.f46693a;
                    hVar4.f46721c.post(new a(hVar4, 7));
                    h hVar5 = this.f46693a;
                    k2.g0 g0Var = hVar5.f46735k;
                    i0 i0Var = hVar5.D;
                    j0 j0Var = hVar5.F;
                    k0 k0Var = hVar5.G;
                    Size size = hVar5.f46746q;
                    Size size2 = hVar5.f46748r;
                    h hVar6 = this.f46693a;
                    ((p0) g0Var.f14467b).f46867j.post(new dm0(g0Var, new g(i0Var, j0Var, k0Var, size, size2, hVar6.L, hVar6.q()), z10, 14));
                    i0 i0Var2 = this.f46693a.C;
                    h hVar7 = this.f46693a;
                    if (i0Var2 != hVar7.D) {
                        hVar7.F(hVar7.C);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    h hVar8 = this.f46693a;
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

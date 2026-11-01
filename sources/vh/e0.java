package vh;

import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.r00;
import org.telegram.ui.x00;
public final class e0 implements eg.p, t61, x00, zf.l1 {
    public Object f51107a;

    public e0(Object obj) {
        this.f51107a = obj;
    }

    @Override
    public a0.h M() {
        return null;
    }

    @Override
    public boolean Y(int i10) {
        return true;
    }

    @Override
    public boolean b(r00 r00Var) {
        return false;
    }

    @Override
    public void c(kj kjVar) {
        yh.z zVar = (yh.z) this.f51107a;
        zVar.f54550q1.presentFragment(hn0.M(zVar.f21584a, kjVar));
        zVar.dismiss();
    }

    @Override
    public void c0(ArrayList arrayList) {
        zf.x0 x0Var = (zf.x0) this.f51107a;
        String str = x0Var.Z;
        if (str != null) {
            x0Var.U(str, x0Var.f55666c0, x0Var.f55667d0, x0Var.f55664b0, x0Var.f55663a0);
        }
    }

    @Override
    public void d() {
        ((g0) this.f51107a).e.invalidate();
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void i(int i10) {
        ((zf.x0) this.f51107a).f();
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        k4 k4Var = (k4) this.f51107a;
        i4 i4Var = k4Var.L;
        org.telegram.messenger.i0.r(i4Var);
        v61 v61Var = k4Var.D;
        if (v61Var != null && v61Var.d0()) {
            org.telegram.messenger.i0.g3(i4Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((k4) this.f51107a).i();
    }

    @Override
    public a0.h x() {
        return null;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    @Override
    public void g(boolean z10) {
    }

    @Override
    public void l(boolean z10) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void a() {
    }

    @Override
    public void n() {
    }

    @Override
    public void onError(v61 v61Var, Exception exc) {
    }

    @Override
    public void e(kj kjVar, View view, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}

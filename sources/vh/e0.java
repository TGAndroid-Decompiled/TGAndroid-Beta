package vh;

import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.s00;
import org.telegram.ui.y00;
public final class e0 implements eg.p, s61, y00, zf.l1 {
    public Object f51092a;

    public e0(Object obj) {
        this.f51092a = obj;
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
    public boolean b(s00 s00Var) {
        return false;
    }

    @Override
    public void c(jj jjVar) {
        yh.a0 a0Var = (yh.a0) this.f51092a;
        a0Var.f54448q1.presentFragment(gn0.M(a0Var.f21583a, jjVar));
        a0Var.dismiss();
    }

    @Override
    public void c0(ArrayList arrayList) {
        zf.x0 x0Var = (zf.x0) this.f51092a;
        String str = x0Var.Z;
        if (str != null) {
            x0Var.U(str, x0Var.f55648c0, x0Var.f55649d0, x0Var.f55646b0, x0Var.f55645a0);
        }
    }

    @Override
    public void d() {
        ((g0) this.f51092a).e.invalidate();
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void i(int i10) {
        ((zf.x0) this.f51092a).f();
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        k4 k4Var = (k4) this.f51092a;
        i4 i4Var = k4Var.L;
        org.telegram.messenger.i0.r(i4Var);
        u61 u61Var = k4Var.D;
        if (u61Var != null && u61Var.d0()) {
            org.telegram.messenger.i0.g3(i4Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((k4) this.f51092a).i();
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
    public void onError(u61 u61Var, Exception exc) {
    }

    @Override
    public void e(jj jjVar, View view, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}

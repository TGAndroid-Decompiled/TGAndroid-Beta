package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f45883a;
    public float f45884b;
    public float f45885c;
    public float d;
    public float f45886e;
    public float f45887f;
    public double f45888g;
    public int h;
    public int f45889i;
    public ByteBuffer f45890j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f45889i) || this.f45890j.position() == this.f45890j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f45890j.position(i10 * 20);
        }
        this.f45890j.putFloat(pointF.x);
        this.f45890j.putFloat(pointF.y);
        this.f45890j.putFloat(f7);
        this.f45890j.putFloat(f10);
        this.f45890j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f45889i || this.f45890j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f45890j != null) {
            return;
        }
        this.f45889i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f45890j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45890j.position(0);
    }

    public final void d() {
        if (this.f45890j != null) {
            this.f45890j = null;
        }
        int max = Math.max(this.f45889i * 2, 256);
        this.f45889i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f45890j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45890j.position(0);
    }
}

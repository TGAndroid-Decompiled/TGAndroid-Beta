package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class v0 {
    public float f41049a;
    public float f41050b;
    public float f41051c;
    public float d;
    public float e;
    public float f41052f;
    public double f41053g;
    public int h;
    public int f41054i;
    public ByteBuffer f41055j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f41054i) || this.f41055j.position() == this.f41055j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f41055j.position(i10 * 20);
        }
        this.f41055j.putFloat(pointF.x);
        this.f41055j.putFloat(pointF.y);
        this.f41055j.putFloat(f7);
        this.f41055j.putFloat(f10);
        this.f41055j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f41054i || this.f41055j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f41055j != null) {
            return;
        }
        this.f41054i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f41055j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41055j.position(0);
    }

    public final void d() {
        if (this.f41055j != null) {
            this.f41055j = null;
        }
        int max = Math.max(this.f41054i * 2, 256);
        this.f41054i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f41055j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41055j.position(0);
    }
}

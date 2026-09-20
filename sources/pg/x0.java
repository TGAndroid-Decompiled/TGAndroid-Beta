package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f41337a;
    public float f41338b;
    public float f41339c;
    public float d;
    public float e;
    public float f41340f;
    public double f41341g;
    public int h;
    public int f41342i;
    public ByteBuffer f41343j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f41342i) || this.f41343j.position() == this.f41343j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f41343j.position(i10 * 20);
        }
        this.f41343j.putFloat(pointF.x);
        this.f41343j.putFloat(pointF.y);
        this.f41343j.putFloat(f7);
        this.f41343j.putFloat(f10);
        this.f41343j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f41342i || this.f41343j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f41343j != null) {
            return;
        }
        this.f41342i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f41343j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41343j.position(0);
    }

    public final void d() {
        if (this.f41343j != null) {
            this.f41343j = null;
        }
        int max = Math.max(this.f41342i * 2, 256);
        this.f41342i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f41343j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41343j.position(0);
    }
}

package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class w0 {
    public float f40980a;
    public float f40981b;
    public float f40982c;
    public float d;
    public float e;
    public float f40983f;
    public double f40984g;
    public int h;
    public int f40985i;
    public ByteBuffer f40986j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f40985i) || this.f40986j.position() == this.f40986j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f40986j.position(i10 * 20);
        }
        this.f40986j.putFloat(pointF.x);
        this.f40986j.putFloat(pointF.y);
        this.f40986j.putFloat(f7);
        this.f40986j.putFloat(f10);
        this.f40986j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f40985i || this.f40986j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f40986j != null) {
            return;
        }
        this.f40985i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f40986j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f40986j.position(0);
    }

    public final void d() {
        if (this.f40986j != null) {
            this.f40986j = null;
        }
        int max = Math.max(this.f40985i * 2, 256);
        this.f40985i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f40986j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f40986j.position(0);
    }
}

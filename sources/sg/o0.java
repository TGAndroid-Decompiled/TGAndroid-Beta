package sg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class o0 {
    public float f55175a;
    public float f55176b;
    public float f55177c;
    public float d;
    public float f55178e;
    public float f55179f;
    public double f55180g;
    public int h;
    public int f55181i;
    public ByteBuffer f55182j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i7) {
        if ((i7 != -1 && i7 >= this.f55181i) || this.f55182j.position() == this.f55182j.limit()) {
            d();
            return false;
        }
        if (i7 != -1) {
            this.f55182j.position(i7 * 20);
        }
        this.f55182j.putFloat(pointF.x);
        this.f55182j.putFloat(pointF.y);
        this.f55182j.putFloat(f10);
        this.f55182j.putFloat(f11);
        this.f55182j.putFloat(f12);
        return true;
    }

    public final void b(int i7) {
        int i10 = this.h + i7;
        if (i10 > this.f55181i || this.f55182j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f55182j != null) {
            return;
        }
        this.f55181i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f55182j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f55182j.position(0);
    }

    public final void d() {
        if (this.f55182j != null) {
            this.f55182j = null;
        }
        int max = Math.max(this.f55181i * 2, 256);
        this.f55181i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f55182j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f55182j.position(0);
    }
}

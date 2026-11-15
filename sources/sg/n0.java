package sg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class n0 {
    public float f56719a;
    public float f56720b;
    public float f56721c;
    public float d;
    public float f56722e;
    public float f56723f;
    public double f56724g;
    public int h;
    public int f56725i;
    public ByteBuffer f56726j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i7) {
        if ((i7 != -1 && i7 >= this.f56725i) || this.f56726j.position() == this.f56726j.limit()) {
            d();
            return false;
        }
        if (i7 != -1) {
            this.f56726j.position(i7 * 20);
        }
        this.f56726j.putFloat(pointF.x);
        this.f56726j.putFloat(pointF.y);
        this.f56726j.putFloat(f10);
        this.f56726j.putFloat(f11);
        this.f56726j.putFloat(f12);
        return true;
    }

    public final void b(int i7) {
        int i10 = this.h + i7;
        if (i10 > this.f56725i || this.f56726j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f56726j != null) {
            return;
        }
        this.f56725i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f56726j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f56726j.position(0);
    }

    public final void d() {
        if (this.f56726j != null) {
            this.f56726j = null;
        }
        int max = Math.max(this.f56725i * 2, 256);
        this.f56725i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f56726j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f56726j.position(0);
    }
}

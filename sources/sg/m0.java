package sg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class m0 {
    public float f57405a;
    public float f57406b;
    public float f57407c;
    public float d;
    public float f57408e;
    public float f57409f;
    public double f57410g;
    public int h;
    public int f57411i;
    public ByteBuffer f57412j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i7) {
        if ((i7 != -1 && i7 >= this.f57411i) || this.f57412j.position() == this.f57412j.limit()) {
            d();
            return false;
        }
        if (i7 != -1) {
            this.f57412j.position(i7 * 20);
        }
        this.f57412j.putFloat(pointF.x);
        this.f57412j.putFloat(pointF.y);
        this.f57412j.putFloat(f10);
        this.f57412j.putFloat(f11);
        this.f57412j.putFloat(f12);
        return true;
    }

    public final void b(int i7) {
        int i10 = this.h + i7;
        if (i10 > this.f57411i || this.f57412j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f57412j != null) {
            return;
        }
        this.f57411i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f57412j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f57412j.position(0);
    }

    public final void d() {
        if (this.f57412j != null) {
            this.f57412j = null;
        }
        int max = Math.max(this.f57411i * 2, 256);
        this.f57411i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f57412j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f57412j.position(0);
    }
}

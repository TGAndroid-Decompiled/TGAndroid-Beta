package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f41409a;
    public float f41410b;
    public float f41411c;
    public float d;
    public float e;
    public float f41412f;
    public double f41413g;
    public int h;
    public int f41414i;
    public ByteBuffer f41415j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f41414i) || this.f41415j.position() == this.f41415j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f41415j.position(i10 * 20);
        }
        this.f41415j.putFloat(pointF.x);
        this.f41415j.putFloat(pointF.y);
        this.f41415j.putFloat(f7);
        this.f41415j.putFloat(f10);
        this.f41415j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f41414i || this.f41415j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f41415j != null) {
            return;
        }
        this.f41414i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f41415j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41415j.position(0);
    }

    public final void d() {
        if (this.f41415j != null) {
            this.f41415j = null;
        }
        int max = Math.max(this.f41414i * 2, 256);
        this.f41414i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f41415j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41415j.position(0);
    }
}

package sg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class o0 {
    public float f55049a;
    public float f55050b;
    public float f55051c;
    public float d;
    public float f55052e;
    public float f55053f;
    public double f55054g;
    public int h;
    public int f55055i;
    public ByteBuffer f55056j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i7) {
        if ((i7 != -1 && i7 >= this.f55055i) || this.f55056j.position() == this.f55056j.limit()) {
            d();
            return false;
        }
        if (i7 != -1) {
            this.f55056j.position(i7 * 20);
        }
        this.f55056j.putFloat(pointF.x);
        this.f55056j.putFloat(pointF.y);
        this.f55056j.putFloat(f10);
        this.f55056j.putFloat(f11);
        this.f55056j.putFloat(f12);
        return true;
    }

    public final void b(int i7) {
        int i10 = this.h + i7;
        if (i10 > this.f55055i || this.f55056j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f55056j != null) {
            return;
        }
        this.f55055i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f55056j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f55056j.position(0);
    }

    public final void d() {
        if (this.f55056j != null) {
            this.f55056j = null;
        }
        int max = Math.max(this.f55055i * 2, 256);
        this.f55055i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f55056j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f55056j.position(0);
    }
}

package sg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class n0 {
    public float f57334a;
    public float f57335b;
    public float f57336c;
    public float d;
    public float f57337e;
    public float f57338f;
    public double f57339g;
    public int h;
    public int f57340i;
    public ByteBuffer f57341j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i7) {
        if ((i7 != -1 && i7 >= this.f57340i) || this.f57341j.position() == this.f57341j.limit()) {
            d();
            return false;
        }
        if (i7 != -1) {
            this.f57341j.position(i7 * 20);
        }
        this.f57341j.putFloat(pointF.x);
        this.f57341j.putFloat(pointF.y);
        this.f57341j.putFloat(f10);
        this.f57341j.putFloat(f11);
        this.f57341j.putFloat(f12);
        return true;
    }

    public final void b(int i7) {
        int i10 = this.h + i7;
        if (i10 > this.f57340i || this.f57341j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f57341j != null) {
            return;
        }
        this.f57340i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f57341j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f57341j.position(0);
    }

    public final void d() {
        if (this.f57341j != null) {
            this.f57341j = null;
        }
        int max = Math.max(this.f57340i * 2, 256);
        this.f57340i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f57341j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f57341j.position(0);
    }
}

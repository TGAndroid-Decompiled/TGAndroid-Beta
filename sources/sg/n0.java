package sg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class n0 {
    public float f57303a;
    public float f57304b;
    public float f57305c;
    public float d;
    public float f57306e;
    public float f57307f;
    public double f57308g;
    public int h;
    public int f57309i;
    public ByteBuffer f57310j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i7) {
        if ((i7 != -1 && i7 >= this.f57309i) || this.f57310j.position() == this.f57310j.limit()) {
            d();
            return false;
        }
        if (i7 != -1) {
            this.f57310j.position(i7 * 20);
        }
        this.f57310j.putFloat(pointF.x);
        this.f57310j.putFloat(pointF.y);
        this.f57310j.putFloat(f10);
        this.f57310j.putFloat(f11);
        this.f57310j.putFloat(f12);
        return true;
    }

    public final void b(int i7) {
        int i10 = this.h + i7;
        if (i10 > this.f57309i || this.f57310j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f57310j != null) {
            return;
        }
        this.f57309i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f57310j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f57310j.position(0);
    }

    public final void d() {
        if (this.f57310j != null) {
            this.f57310j = null;
        }
        int max = Math.max(this.f57309i * 2, 256);
        this.f57309i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f57310j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f57310j.position(0);
    }
}

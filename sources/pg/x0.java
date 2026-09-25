package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f41311a;
    public float f41312b;
    public float f41313c;
    public float d;
    public float e;
    public float f41314f;
    public double f41315g;
    public int h;
    public int f41316i;
    public ByteBuffer f41317j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f41316i) || this.f41317j.position() == this.f41317j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f41317j.position(i10 * 20);
        }
        this.f41317j.putFloat(pointF.x);
        this.f41317j.putFloat(pointF.y);
        this.f41317j.putFloat(f7);
        this.f41317j.putFloat(f10);
        this.f41317j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f41316i || this.f41317j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f41317j != null) {
            return;
        }
        this.f41316i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f41317j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41317j.position(0);
    }

    public final void d() {
        if (this.f41317j != null) {
            this.f41317j = null;
        }
        int max = Math.max(this.f41316i * 2, 256);
        this.f41316i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f41317j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41317j.position(0);
    }
}

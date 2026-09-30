package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f41312a;
    public float f41313b;
    public float f41314c;
    public float d;
    public float e;
    public float f41315f;
    public double f41316g;
    public int h;
    public int f41317i;
    public ByteBuffer f41318j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f41317i) || this.f41318j.position() == this.f41318j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f41318j.position(i10 * 20);
        }
        this.f41318j.putFloat(pointF.x);
        this.f41318j.putFloat(pointF.y);
        this.f41318j.putFloat(f7);
        this.f41318j.putFloat(f10);
        this.f41318j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f41317i || this.f41318j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f41318j != null) {
            return;
        }
        this.f41317i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f41318j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41318j.position(0);
    }

    public final void d() {
        if (this.f41318j != null) {
            this.f41318j = null;
        }
        int max = Math.max(this.f41317i * 2, 256);
        this.f41317i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f41318j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41318j.position(0);
    }
}

package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f41309a;
    public float f41310b;
    public float f41311c;
    public float d;
    public float e;
    public float f41312f;
    public double f41313g;
    public int h;
    public int f41314i;
    public ByteBuffer f41315j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f41314i) || this.f41315j.position() == this.f41315j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f41315j.position(i10 * 20);
        }
        this.f41315j.putFloat(pointF.x);
        this.f41315j.putFloat(pointF.y);
        this.f41315j.putFloat(f7);
        this.f41315j.putFloat(f10);
        this.f41315j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f41314i || this.f41315j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f41315j != null) {
            return;
        }
        this.f41314i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f41315j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41315j.position(0);
    }

    public final void d() {
        if (this.f41315j != null) {
            this.f41315j = null;
        }
        int max = Math.max(this.f41314i * 2, 256);
        this.f41314i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f41315j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41315j.position(0);
    }
}

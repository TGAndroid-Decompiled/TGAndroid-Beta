package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f41359a;
    public float f41360b;
    public float f41361c;
    public float d;
    public float e;
    public float f41362f;
    public double f41363g;
    public int h;
    public int f41364i;
    public ByteBuffer f41365j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f41364i) || this.f41365j.position() == this.f41365j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f41365j.position(i10 * 20);
        }
        this.f41365j.putFloat(pointF.x);
        this.f41365j.putFloat(pointF.y);
        this.f41365j.putFloat(f7);
        this.f41365j.putFloat(f10);
        this.f41365j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f41364i || this.f41365j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f41365j != null) {
            return;
        }
        this.f41364i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f41365j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41365j.position(0);
    }

    public final void d() {
        if (this.f41365j != null) {
            this.f41365j = null;
        }
        int max = Math.max(this.f41364i * 2, 256);
        this.f41364i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f41365j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41365j.position(0);
    }
}

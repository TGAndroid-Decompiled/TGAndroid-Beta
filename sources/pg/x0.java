package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f44688a;
    public float f44689b;
    public float f44690c;
    public float d;
    public float f44691e;
    public float f44692f;
    public double f44693g;
    public int h;
    public int f44694i;
    public ByteBuffer f44695j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f44694i) || this.f44695j.position() == this.f44695j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f44695j.position(i10 * 20);
        }
        this.f44695j.putFloat(pointF.x);
        this.f44695j.putFloat(pointF.y);
        this.f44695j.putFloat(f7);
        this.f44695j.putFloat(f10);
        this.f44695j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f44694i || this.f44695j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f44695j != null) {
            return;
        }
        this.f44694i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f44695j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44695j.position(0);
    }

    public final void d() {
        if (this.f44695j != null) {
            this.f44695j = null;
        }
        int max = Math.max(this.f44694i * 2, 256);
        this.f44694i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f44695j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44695j.position(0);
    }
}

package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f41310a;
    public float f41311b;
    public float f41312c;
    public float d;
    public float e;
    public float f41313f;
    public double f41314g;
    public int h;
    public int f41315i;
    public ByteBuffer f41316j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f41315i) || this.f41316j.position() == this.f41316j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f41316j.position(i10 * 20);
        }
        this.f41316j.putFloat(pointF.x);
        this.f41316j.putFloat(pointF.y);
        this.f41316j.putFloat(f7);
        this.f41316j.putFloat(f10);
        this.f41316j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f41315i || this.f41316j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f41316j != null) {
            return;
        }
        this.f41315i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f41316j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41316j.position(0);
    }

    public final void d() {
        if (this.f41316j != null) {
            this.f41316j = null;
        }
        int max = Math.max(this.f41315i * 2, 256);
        this.f41315i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f41316j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41316j.position(0);
    }
}

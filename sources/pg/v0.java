package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class v0 {
    public float f41044a;
    public float f41045b;
    public float f41046c;
    public float d;
    public float e;
    public float f41047f;
    public double f41048g;
    public int h;
    public int f41049i;
    public ByteBuffer f41050j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f41049i) || this.f41050j.position() == this.f41050j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f41050j.position(i10 * 20);
        }
        this.f41050j.putFloat(pointF.x);
        this.f41050j.putFloat(pointF.y);
        this.f41050j.putFloat(f7);
        this.f41050j.putFloat(f10);
        this.f41050j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f41049i || this.f41050j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f41050j != null) {
            return;
        }
        this.f41049i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f41050j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41050j.position(0);
    }

    public final void d() {
        if (this.f41050j != null) {
            this.f41050j = null;
        }
        int max = Math.max(this.f41049i * 2, 256);
        this.f41049i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f41050j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41050j.position(0);
    }
}

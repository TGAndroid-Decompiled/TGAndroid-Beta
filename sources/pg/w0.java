package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class w0 {
    public float f45711a;
    public float f45712b;
    public float f45713c;
    public float d;
    public float f45714e;
    public float f45715f;
    public double f45716g;
    public int h;
    public int f45717i;
    public ByteBuffer f45718j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f45717i) || this.f45718j.position() == this.f45718j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f45718j.position(i10 * 20);
        }
        this.f45718j.putFloat(pointF.x);
        this.f45718j.putFloat(pointF.y);
        this.f45718j.putFloat(f7);
        this.f45718j.putFloat(f10);
        this.f45718j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f45717i || this.f45718j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f45718j != null) {
            return;
        }
        this.f45717i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f45718j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45718j.position(0);
    }

    public final void d() {
        if (this.f45718j != null) {
            this.f45718j = null;
        }
        int max = Math.max(this.f45717i * 2, 256);
        this.f45717i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f45718j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45718j.position(0);
    }
}

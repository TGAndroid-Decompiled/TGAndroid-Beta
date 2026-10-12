package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class w0 {
    public float f45716a;
    public float f45717b;
    public float f45718c;
    public float d;
    public float f45719e;
    public float f45720f;
    public double f45721g;
    public int h;
    public int f45722i;
    public ByteBuffer f45723j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f45722i) || this.f45723j.position() == this.f45723j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f45723j.position(i10 * 20);
        }
        this.f45723j.putFloat(pointF.x);
        this.f45723j.putFloat(pointF.y);
        this.f45723j.putFloat(f7);
        this.f45723j.putFloat(f10);
        this.f45723j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f45722i || this.f45723j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f45723j != null) {
            return;
        }
        this.f45722i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f45723j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45723j.position(0);
    }

    public final void d() {
        if (this.f45723j != null) {
            this.f45723j = null;
        }
        int max = Math.max(this.f45722i * 2, 256);
        this.f45722i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f45723j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45723j.position(0);
    }
}

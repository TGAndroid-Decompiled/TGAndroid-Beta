package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f41296a;
    public float f41297b;
    public float f41298c;
    public float d;
    public float e;
    public float f41299f;
    public double f41300g;
    public int h;
    public int f41301i;
    public ByteBuffer f41302j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f41301i) || this.f41302j.position() == this.f41302j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f41302j.position(i10 * 20);
        }
        this.f41302j.putFloat(pointF.x);
        this.f41302j.putFloat(pointF.y);
        this.f41302j.putFloat(f7);
        this.f41302j.putFloat(f10);
        this.f41302j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f41301i || this.f41302j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f41302j != null) {
            return;
        }
        this.f41301i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f41302j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41302j.position(0);
    }

    public final void d() {
        if (this.f41302j != null) {
            this.f41302j = null;
        }
        int max = Math.max(this.f41301i * 2, 256);
        this.f41301i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f41302j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f41302j.position(0);
    }
}

package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f45907a;
    public float f45908b;
    public float f45909c;
    public float d;
    public float f45910e;
    public float f45911f;
    public double f45912g;
    public int h;
    public int f45913i;
    public ByteBuffer f45914j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f45913i) || this.f45914j.position() == this.f45914j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f45914j.position(i10 * 20);
        }
        this.f45914j.putFloat(pointF.x);
        this.f45914j.putFloat(pointF.y);
        this.f45914j.putFloat(f7);
        this.f45914j.putFloat(f10);
        this.f45914j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f45913i || this.f45914j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f45914j != null) {
            return;
        }
        this.f45913i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f45914j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45914j.position(0);
    }

    public final void d() {
        if (this.f45914j != null) {
            this.f45914j = null;
        }
        int max = Math.max(this.f45913i * 2, 256);
        this.f45913i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f45914j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45914j.position(0);
    }
}

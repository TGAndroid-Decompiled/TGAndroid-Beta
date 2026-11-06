package sg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class o0 {
    public float f55074a;
    public float f55075b;
    public float f55076c;
    public float d;
    public float f55077e;
    public float f55078f;
    public double f55079g;
    public int h;
    public int f55080i;
    public ByteBuffer f55081j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i7) {
        if ((i7 != -1 && i7 >= this.f55080i) || this.f55081j.position() == this.f55081j.limit()) {
            d();
            return false;
        }
        if (i7 != -1) {
            this.f55081j.position(i7 * 20);
        }
        this.f55081j.putFloat(pointF.x);
        this.f55081j.putFloat(pointF.y);
        this.f55081j.putFloat(f10);
        this.f55081j.putFloat(f11);
        this.f55081j.putFloat(f12);
        return true;
    }

    public final void b(int i7) {
        int i10 = this.h + i7;
        if (i10 > this.f55080i || this.f55081j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f55081j != null) {
            return;
        }
        this.f55080i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f55081j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f55081j.position(0);
    }

    public final void d() {
        if (this.f55081j != null) {
            this.f55081j = null;
        }
        int max = Math.max(this.f55080i * 2, 256);
        this.f55080i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f55081j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f55081j.position(0);
    }
}

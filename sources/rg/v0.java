package rg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class v0 {
    public float f47609a;
    public float f47610b;
    public float f47611c;
    public float d;
    public float e;
    public float f47612f;
    public double f47613g;
    public int h;
    public int f47614i;
    public ByteBuffer f47615j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f47614i) || this.f47615j.position() == this.f47615j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f47615j.position(i10 * 20);
        }
        this.f47615j.putFloat(pointF.x);
        this.f47615j.putFloat(pointF.y);
        this.f47615j.putFloat(f7);
        this.f47615j.putFloat(f10);
        this.f47615j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f47614i || this.f47615j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f47615j != null) {
            return;
        }
        this.f47614i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f47615j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f47615j.position(0);
    }

    public final void d() {
        if (this.f47615j != null) {
            this.f47615j = null;
        }
        int max = Math.max(this.f47614i * 2, 256);
        this.f47614i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f47615j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f47615j.position(0);
    }
}

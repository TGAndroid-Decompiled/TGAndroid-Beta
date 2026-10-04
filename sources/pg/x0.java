package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f44680a;
    public float f44681b;
    public float f44682c;
    public float d;
    public float f44683e;
    public float f44684f;
    public double f44685g;
    public int h;
    public int f44686i;
    public ByteBuffer f44687j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f44686i) || this.f44687j.position() == this.f44687j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f44687j.position(i10 * 20);
        }
        this.f44687j.putFloat(pointF.x);
        this.f44687j.putFloat(pointF.y);
        this.f44687j.putFloat(f7);
        this.f44687j.putFloat(f10);
        this.f44687j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f44686i || this.f44687j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f44687j != null) {
            return;
        }
        this.f44686i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f44687j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44687j.position(0);
    }

    public final void d() {
        if (this.f44687j != null) {
            this.f44687j = null;
        }
        int max = Math.max(this.f44686i * 2, 256);
        this.f44686i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f44687j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44687j.position(0);
    }
}

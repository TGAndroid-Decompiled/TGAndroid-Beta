package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f44681a;
    public float f44682b;
    public float f44683c;
    public float d;
    public float f44684e;
    public float f44685f;
    public double f44686g;
    public int h;
    public int f44687i;
    public ByteBuffer f44688j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f44687i) || this.f44688j.position() == this.f44688j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f44688j.position(i10 * 20);
        }
        this.f44688j.putFloat(pointF.x);
        this.f44688j.putFloat(pointF.y);
        this.f44688j.putFloat(f7);
        this.f44688j.putFloat(f10);
        this.f44688j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f44687i || this.f44688j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f44688j != null) {
            return;
        }
        this.f44687i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f44688j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44688j.position(0);
    }

    public final void d() {
        if (this.f44688j != null) {
            this.f44688j = null;
        }
        int max = Math.max(this.f44687i * 2, 256);
        this.f44687i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f44688j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44688j.position(0);
    }
}

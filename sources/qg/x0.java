package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f44699a;
    public float f44700b;
    public float f44701c;
    public float d;
    public float e;
    public float f44702f;
    public double f44703g;
    public int h;
    public int f44704i;
    public ByteBuffer f44705j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f44704i) || this.f44705j.position() == this.f44705j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f44705j.position(i10 * 20);
        }
        this.f44705j.putFloat(pointF.x);
        this.f44705j.putFloat(pointF.y);
        this.f44705j.putFloat(f7);
        this.f44705j.putFloat(f10);
        this.f44705j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f44704i || this.f44705j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f44705j != null) {
            return;
        }
        this.f44704i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f44705j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44705j.position(0);
    }

    public final void d() {
        if (this.f44705j != null) {
            this.f44705j = null;
        }
        int max = Math.max(this.f44704i * 2, 256);
        this.f44704i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f44705j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44705j.position(0);
    }
}

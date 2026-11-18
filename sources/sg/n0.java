package sg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class n0 {
    public float f57293a;
    public float f57294b;
    public float f57295c;
    public float d;
    public float f57296e;
    public float f57297f;
    public double f57298g;
    public int h;
    public int f57299i;
    public ByteBuffer f57300j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i7) {
        if ((i7 != -1 && i7 >= this.f57299i) || this.f57300j.position() == this.f57300j.limit()) {
            d();
            return false;
        }
        if (i7 != -1) {
            this.f57300j.position(i7 * 20);
        }
        this.f57300j.putFloat(pointF.x);
        this.f57300j.putFloat(pointF.y);
        this.f57300j.putFloat(f10);
        this.f57300j.putFloat(f11);
        this.f57300j.putFloat(f12);
        return true;
    }

    public final void b(int i7) {
        int i10 = this.h + i7;
        if (i10 > this.f57299i || this.f57300j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f57300j != null) {
            return;
        }
        this.f57299i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f57300j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f57300j.position(0);
    }

    public final void d() {
        if (this.f57300j != null) {
            this.f57300j = null;
        }
        int max = Math.max(this.f57299i * 2, 256);
        this.f57299i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f57300j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f57300j.position(0);
    }
}

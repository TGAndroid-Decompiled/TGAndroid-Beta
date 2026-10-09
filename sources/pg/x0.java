package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f45839a;
    public float f45840b;
    public float f45841c;
    public float d;
    public float f45842e;
    public float f45843f;
    public double f45844g;
    public int h;
    public int f45845i;
    public ByteBuffer f45846j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f45845i) || this.f45846j.position() == this.f45846j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f45846j.position(i10 * 20);
        }
        this.f45846j.putFloat(pointF.x);
        this.f45846j.putFloat(pointF.y);
        this.f45846j.putFloat(f7);
        this.f45846j.putFloat(f10);
        this.f45846j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f45845i || this.f45846j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f45846j != null) {
            return;
        }
        this.f45845i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f45846j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45846j.position(0);
    }

    public final void d() {
        if (this.f45846j != null) {
            this.f45846j = null;
        }
        int max = Math.max(this.f45845i * 2, 256);
        this.f45845i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f45846j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45846j.position(0);
    }
}

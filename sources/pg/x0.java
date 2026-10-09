package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f45837a;
    public float f45838b;
    public float f45839c;
    public float d;
    public float f45840e;
    public float f45841f;
    public double f45842g;
    public int h;
    public int f45843i;
    public ByteBuffer f45844j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f45843i) || this.f45844j.position() == this.f45844j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f45844j.position(i10 * 20);
        }
        this.f45844j.putFloat(pointF.x);
        this.f45844j.putFloat(pointF.y);
        this.f45844j.putFloat(f7);
        this.f45844j.putFloat(f10);
        this.f45844j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f45843i || this.f45844j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f45844j != null) {
            return;
        }
        this.f45843i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f45844j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45844j.position(0);
    }

    public final void d() {
        if (this.f45844j != null) {
            this.f45844j = null;
        }
        int max = Math.max(this.f45843i * 2, 256);
        this.f45843i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f45844j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45844j.position(0);
    }
}

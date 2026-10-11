package pg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f45873a;
    public float f45874b;
    public float f45875c;
    public float d;
    public float f45876e;
    public float f45877f;
    public double f45878g;
    public int h;
    public int f45879i;
    public ByteBuffer f45880j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f45879i) || this.f45880j.position() == this.f45880j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f45880j.position(i10 * 20);
        }
        this.f45880j.putFloat(pointF.x);
        this.f45880j.putFloat(pointF.y);
        this.f45880j.putFloat(f7);
        this.f45880j.putFloat(f10);
        this.f45880j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f45879i || this.f45880j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f45880j != null) {
            return;
        }
        this.f45879i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f45880j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45880j.position(0);
    }

    public final void d() {
        if (this.f45880j != null) {
            this.f45880j = null;
        }
        int max = Math.max(this.f45879i * 2, 256);
        this.f45879i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f45880j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45880j.position(0);
    }
}

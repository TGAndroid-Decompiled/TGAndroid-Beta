package sg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class o0 {
    public float f55165a;
    public float f55166b;
    public float f55167c;
    public float d;
    public float f55168e;
    public float f55169f;
    public double f55170g;
    public int h;
    public int f55171i;
    public ByteBuffer f55172j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i7) {
        if ((i7 != -1 && i7 >= this.f55171i) || this.f55172j.position() == this.f55172j.limit()) {
            d();
            return false;
        }
        if (i7 != -1) {
            this.f55172j.position(i7 * 20);
        }
        this.f55172j.putFloat(pointF.x);
        this.f55172j.putFloat(pointF.y);
        this.f55172j.putFloat(f10);
        this.f55172j.putFloat(f11);
        this.f55172j.putFloat(f12);
        return true;
    }

    public final void b(int i7) {
        int i10 = this.h + i7;
        if (i10 > this.f55171i || this.f55172j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f55172j != null) {
            return;
        }
        this.f55171i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f55172j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f55172j.position(0);
    }

    public final void d() {
        if (this.f55172j != null) {
            this.f55172j = null;
        }
        int max = Math.max(this.f55171i * 2, 256);
        this.f55171i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f55172j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f55172j.position(0);
    }
}

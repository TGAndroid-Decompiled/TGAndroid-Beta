package sg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class n0 {
    public float f57338a;
    public float f57339b;
    public float f57340c;
    public float d;
    public float f57341e;
    public float f57342f;
    public double f57343g;
    public int h;
    public int f57344i;
    public ByteBuffer f57345j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i7) {
        if ((i7 != -1 && i7 >= this.f57344i) || this.f57345j.position() == this.f57345j.limit()) {
            d();
            return false;
        }
        if (i7 != -1) {
            this.f57345j.position(i7 * 20);
        }
        this.f57345j.putFloat(pointF.x);
        this.f57345j.putFloat(pointF.y);
        this.f57345j.putFloat(f10);
        this.f57345j.putFloat(f11);
        this.f57345j.putFloat(f12);
        return true;
    }

    public final void b(int i7) {
        int i10 = this.h + i7;
        if (i10 > this.f57344i || this.f57345j == null) {
            d();
        }
        this.h = i10;
    }

    public final void c() {
        this.h = 0;
        if (this.f57345j != null) {
            return;
        }
        this.f57344i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f57345j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f57345j.position(0);
    }

    public final void d() {
        if (this.f57345j != null) {
            this.f57345j = null;
        }
        int max = Math.max(this.f57344i * 2, 256);
        this.f57344i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f57345j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f57345j.position(0);
    }
}

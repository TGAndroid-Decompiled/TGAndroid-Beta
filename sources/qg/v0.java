package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class v0 {
    public float f44601a;
    public float f44602b;
    public float f44603c;
    public float d;
    public float f44604e;
    public float f44605f;
    public double f44606g;
    public int h;
    public int f44607i;
    public ByteBuffer f44608j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f44607i) || this.f44608j.position() == this.f44608j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f44608j.position(i10 * 20);
        }
        this.f44608j.putFloat(pointF.x);
        this.f44608j.putFloat(pointF.y);
        this.f44608j.putFloat(f7);
        this.f44608j.putFloat(f10);
        this.f44608j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f44607i || this.f44608j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f44608j != null) {
            return;
        }
        this.f44607i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f44608j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44608j.position(0);
    }

    public final void d() {
        if (this.f44608j != null) {
            this.f44608j = null;
        }
        int max = Math.max(this.f44607i * 2, 256);
        this.f44607i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f44608j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44608j.position(0);
    }
}

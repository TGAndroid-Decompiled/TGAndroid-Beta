package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f45119a;
    public float f45120b;
    public float f45121c;
    public float d;
    public float e;
    public float f45122f;
    public double f45123g;
    public int h;
    public int f45124i;
    public ByteBuffer f45125j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f45124i) || this.f45125j.position() == this.f45125j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f45125j.position(i10 * 20);
        }
        this.f45125j.putFloat(pointF.x);
        this.f45125j.putFloat(pointF.y);
        this.f45125j.putFloat(f7);
        this.f45125j.putFloat(f10);
        this.f45125j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f45124i || this.f45125j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f45125j != null) {
            return;
        }
        this.f45124i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f45125j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45125j.position(0);
    }

    public final void d() {
        if (this.f45125j != null) {
            this.f45125j = null;
        }
        int max = Math.max(this.f45124i * 2, 256);
        this.f45124i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f45125j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45125j.position(0);
    }
}

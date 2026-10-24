package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class x0 {
    public float f45118a;
    public float f45119b;
    public float f45120c;
    public float d;
    public float e;
    public float f45121f;
    public double f45122g;
    public int h;
    public int f45123i;
    public ByteBuffer f45124j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f45123i) || this.f45124j.position() == this.f45124j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f45124j.position(i10 * 20);
        }
        this.f45124j.putFloat(pointF.x);
        this.f45124j.putFloat(pointF.y);
        this.f45124j.putFloat(f7);
        this.f45124j.putFloat(f10);
        this.f45124j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f45123i || this.f45124j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f45124j != null) {
            return;
        }
        this.f45123i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f45124j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45124j.position(0);
    }

    public final void d() {
        if (this.f45124j != null) {
            this.f45124j = null;
        }
        int max = Math.max(this.f45123i * 2, 256);
        this.f45123i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f45124j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f45124j.position(0);
    }
}

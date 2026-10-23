package qg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class y0 {
    public float f44715a;
    public float f44716b;
    public float f44717c;
    public float d;
    public float e;
    public float f44718f;
    public double f44719g;
    public int h;
    public int f44720i;
    public ByteBuffer f44721j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f44720i) || this.f44721j.position() == this.f44721j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f44721j.position(i10 * 20);
        }
        this.f44721j.putFloat(pointF.x);
        this.f44721j.putFloat(pointF.y);
        this.f44721j.putFloat(f7);
        this.f44721j.putFloat(f10);
        this.f44721j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f44720i || this.f44721j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f44721j != null) {
            return;
        }
        this.f44720i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f44721j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44721j.position(0);
    }

    public final void d() {
        if (this.f44721j != null) {
            this.f44721j = null;
        }
        int max = Math.max(this.f44720i * 2, 256);
        this.f44720i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f44721j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f44721j.position(0);
    }
}

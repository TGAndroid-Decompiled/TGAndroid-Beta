package v2;

import b2.s;
import org.telegram.ui.ActionBar.b5;
public abstract class a extends k {
    public final long v;
    public final long f49029w;
    public b5 f49030x;
    public int[] f49031y;

    public a(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, long j3, long j10, long j11, long j12, long j13) {
        super(hVar, mVar, sVar, i10, obj, j3, j10, j13);
        this.v = j11;
        this.f49029w = j12;
    }

    public final int d(int i10) {
        int[] iArr = this.f49031y;
        e2.d.h(iArr);
        return iArr[i10];
    }
}

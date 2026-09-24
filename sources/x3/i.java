package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f45511b;
    public q f45512c;
    public g d;
    public long e;
    public long f45513f;
    public long f45514g;
    public int h;
    public int f45515i;
    public long f45517k;
    public boolean f45518l;
    public boolean f45519m;
    public final e f45510a = new e();
    public z0 f45516j = new z0(25);

    public void a(long j3) {
        this.f45514g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f45516j = new z0(25);
            this.f45513f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f45514g = 0L;
    }
}

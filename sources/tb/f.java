package tb;

import ab.m;
import l3.g0;
public final class f {
    public final rb.d f48206a;
    public final int f48207b;
    public final int f48208c;
    public final int d;
    public final g0 f48209e;

    public f(g0 g0Var, rb.d dVar, int i10, int i11, int i12) {
        this.f48209e = g0Var;
        this.f48206a = dVar;
        this.f48207b = i10;
        this.f48208c = i11;
        this.d = i12;
    }

    public final int a() {
        rb.d dVar = this.f48206a;
        rb.d dVar2 = rb.d.BYTE;
        int i10 = this.d;
        if (dVar == dVar2) {
            m mVar = (m) this.f48209e.d;
            int i11 = this.f48207b;
            return ((String) mVar.f325b).substring(i11, i10 + i11).getBytes(((nb.e) mVar.f326c).f17216a[this.f48208c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        m mVar = (m) this.f48209e.d;
        StringBuilder sb2 = new StringBuilder();
        rb.d dVar = this.f48206a;
        sb2.append(dVar);
        sb2.append('(');
        if (dVar == rb.d.ECI) {
            sb2.append(((nb.e) mVar.f326c).f17216a[this.f48208c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f48207b;
            String substring = ((String) mVar.f325b).substring(i11, i10 + i11);
            StringBuilder sb3 = new StringBuilder();
            for (int i12 = 0; i12 < substring.length(); i12++) {
                if (substring.charAt(i12) >= ' ' && substring.charAt(i12) <= '~') {
                    sb3.append(substring.charAt(i12));
                } else {
                    sb3.append('.');
                }
            }
            sb2.append(sb3.toString());
        }
        sb2.append(')');
        return sb2.toString();
    }
}

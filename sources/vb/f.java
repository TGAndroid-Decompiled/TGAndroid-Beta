package vb;

import s5.m;
public final class f {
    public final tb.d f45724a;
    public final int f45725b;
    public final int f45726c;
    public final int d;
    public final m e;

    public f(m mVar, tb.d dVar, int i10, int i11, int i12) {
        this.e = mVar;
        this.f45724a = dVar;
        this.f45725b = i10;
        this.f45726c = i11;
        this.d = i12;
    }

    public final int a() {
        tb.d dVar = this.f45724a;
        tb.d dVar2 = tb.d.BYTE;
        int i10 = this.d;
        if (dVar == dVar2) {
            cb.m mVar = (cb.m) this.e.d;
            int i11 = this.f45725b;
            return ((String) mVar.f2256b).substring(i11, i10 + i11).getBytes(((pb.e) mVar.f2257c).f41131a[this.f45726c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        cb.m mVar = (cb.m) this.e.d;
        StringBuilder sb = new StringBuilder();
        tb.d dVar = this.f45724a;
        sb.append(dVar);
        sb.append('(');
        if (dVar == tb.d.ECI) {
            sb.append(((pb.e) mVar.f2257c).f41131a[this.f45726c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f45725b;
            String substring = ((String) mVar.f2256b).substring(i11, i10 + i11);
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < substring.length(); i12++) {
                if (substring.charAt(i12) >= ' ' && substring.charAt(i12) <= '~') {
                    sb2.append(substring.charAt(i12));
                } else {
                    sb2.append('.');
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}

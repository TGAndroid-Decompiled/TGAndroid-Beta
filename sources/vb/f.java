package vb;

import s5.m;
public final class f {
    public final tb.d f48958a;
    public final int f48959b;
    public final int f48960c;
    public final int d;
    public final m f48961e;

    public f(m mVar, tb.d dVar, int i10, int i11, int i12) {
        this.f48961e = mVar;
        this.f48958a = dVar;
        this.f48959b = i10;
        this.f48960c = i11;
        this.d = i12;
    }

    public final int a() {
        tb.d dVar = this.f48958a;
        tb.d dVar2 = tb.d.BYTE;
        int i10 = this.d;
        if (dVar == dVar2) {
            cb.m mVar = (cb.m) this.f48961e.d;
            int i11 = this.f48959b;
            return ((String) mVar.f2425b).substring(i11, i10 + i11).getBytes(((pb.e) mVar.f2426c).f44269a[this.f48960c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        cb.m mVar = (cb.m) this.f48961e.d;
        StringBuilder sb = new StringBuilder();
        tb.d dVar = this.f48958a;
        sb.append(dVar);
        sb.append('(');
        if (dVar == tb.d.ECI) {
            sb.append(((pb.e) mVar.f2426c).f44269a[this.f48960c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f48959b;
            String substring = ((String) mVar.f2425b).substring(i11, i10 + i11);
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

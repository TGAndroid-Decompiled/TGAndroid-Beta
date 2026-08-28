package rb;

import com.google.firebase.messaging.l;
public final class f {
    public final pb.d f47123a;
    public final int f47124b;
    public final int f47125c;
    public final int d;
    public final j4.c f47126e;

    public f(j4.c cVar, pb.d dVar, int i9, int i10, int i11) {
        this.f47126e = cVar;
        this.f47123a = dVar;
        this.f47124b = i9;
        this.f47125c = i10;
        this.d = i11;
    }

    public final int a() {
        pb.d dVar = this.f47123a;
        pb.d dVar2 = pb.d.BYTE;
        int i9 = this.d;
        if (dVar == dVar2) {
            l lVar = (l) this.f47126e.d;
            int i10 = this.f47124b;
            return ((String) lVar.f4158b).substring(i10, i9 + i10).getBytes(((lb.e) lVar.f4159c).f16749a[this.f47125c].charset()).length;
        }
        return i9;
    }

    public final String toString() {
        l lVar = (l) this.f47126e.d;
        StringBuilder sb2 = new StringBuilder();
        pb.d dVar = this.f47123a;
        sb2.append(dVar);
        sb2.append('(');
        if (dVar == pb.d.ECI) {
            sb2.append(((lb.e) lVar.f4159c).f16749a[this.f47125c].charset().displayName());
        } else {
            int i9 = this.d;
            int i10 = this.f47124b;
            String substring = ((String) lVar.f4158b).substring(i10, i9 + i10);
            StringBuilder sb3 = new StringBuilder();
            for (int i11 = 0; i11 < substring.length(); i11++) {
                if (substring.charAt(i11) >= ' ' && substring.charAt(i11) <= '~') {
                    sb3.append(substring.charAt(i11));
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

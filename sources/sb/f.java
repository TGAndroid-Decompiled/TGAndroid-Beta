package sb;

import com.google.firebase.messaging.l;

public final class f {

    public final qb.d f47843a;

    public final int f47844b;

    public final int f47845c;
    public final int d;

    public final j9.a f47846e;

    public f(j9.a aVar, qb.d dVar, int i10, int i11, int i12) {
        this.f47846e = aVar;
        this.f47843a = dVar;
        this.f47844b = i10;
        this.f47845c = i11;
        this.d = i12;
    }

    public final int a() {
        qb.d dVar = this.f47843a;
        qb.d dVar2 = qb.d.BYTE;
        int i10 = this.d;
        if (dVar != dVar2) {
            return i10;
        }
        l lVar = (l) this.f47846e.d;
        mb.e eVar = (mb.e) lVar.f4601c;
        String str = (String) lVar.f4600b;
        int i11 = this.f47844b;
        return str.substring(i11, i10 + i11).getBytes(eVar.f17933a[this.f47845c].charset()).length;
    }

    public final String toString() {
        l lVar = (l) this.f47846e.d;
        StringBuilder sb2 = new StringBuilder();
        qb.d dVar = this.f47843a;
        sb2.append(dVar);
        sb2.append('(');
        if (dVar == qb.d.ECI) {
            mb.e eVar = (mb.e) lVar.f4601c;
            sb2.append(eVar.f17933a[this.f47845c].charset().displayName());
        } else {
            String str = (String) lVar.f4600b;
            int i10 = this.d;
            int i11 = this.f47844b;
            String strSubstring = str.substring(i11, i10 + i11);
            StringBuilder sb3 = new StringBuilder();
            for (int i12 = 0; i12 < strSubstring.length(); i12++) {
                if (strSubstring.charAt(i12) < ' ' || strSubstring.charAt(i12) > '~') {
                    sb3.append('.');
                } else {
                    sb3.append(strSubstring.charAt(i12));
                }
            }
            sb2.append(sb3.toString());
        }
        sb2.append(')');
        return sb2.toString();
    }
}

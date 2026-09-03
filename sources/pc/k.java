package pc;

import java.util.Arrays;
public final class k {
    public static final char[] f41193r;
    public static final int[] f41194s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f41195a;
    public final b f41196b;
    public n3.a d;
    public j f41200i;
    public final i f41201j;
    public final h f41202k;
    public final d f41203l;
    public final f f41204m;
    public final e f41205n;
    public String f41206o;
    public final int[] f41207p;
    public final int[] f41208q;
    public a2 f41197c = a2.f41150a;
    public boolean e = false;
    public String f41198f = null;
    public final StringBuilder f41199g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f41193r = cArr;
        Arrays.sort(cArr);
    }

    public k(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.v = new oc.b();
        this.f41201j = jVar;
        this.f41202k = new j(3);
        this.f41203l = new n3.a(5, 1);
        this.f41204m = new f();
        this.f41205n = new e();
        this.f41207p = new int[1];
        this.f41208q = new int[2];
        this.f41195a = aVar;
        this.f41196b = bVar;
    }

    public final void a(a2 a2Var) {
        this.f41195a.a();
        this.f41197c = a2Var;
    }

    public final void b(String str) {
        b bVar = this.f41196b;
        if (bVar.size() < 0) {
            a aVar = this.f41195a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Invalid character reference: %s", aVar.f41148f + aVar.e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: pc.k.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z4) {
        j jVar;
        if (z4) {
            jVar = this.f41201j;
            jVar.s();
        } else {
            jVar = this.f41202k;
            jVar.g();
        }
        this.f41200i = jVar;
        return jVar;
    }

    public final void e() {
        n3.a.i(this.h);
    }

    public final void f(char c3) {
        g(String.valueOf(c3));
    }

    public final void g(String str) {
        if (this.f41198f == null) {
            this.f41198f = str;
            return;
        }
        StringBuilder sb = this.f41199g;
        if (sb.length() == 0) {
            sb.append(this.f41198f);
        }
        sb.append(str);
    }

    public final void h(n3.a aVar) {
        if (!this.e) {
            this.d = aVar;
            this.e = true;
            int i10 = aVar.f14207b;
            if (i10 == 2) {
                this.f41206o = ((i) aVar).f41188c;
                return;
            } else if (i10 == 3 && ((h) aVar).v != null) {
                b bVar = this.f41196b;
                if (bVar.size() < 0) {
                    a aVar2 = this.f41195a;
                    com.google.android.gms.internal.clearcut.z0 z0Var = new com.google.android.gms.internal.clearcut.z0();
                    z0Var.f3421b = aVar2.f41148f + aVar2.e;
                    z0Var.f3422c = "Attributes incorrectly present on end tag";
                    bVar.add(z0Var);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("There is an unread token pending!");
    }

    public final void i() {
        h(this.f41205n);
    }

    public final void j() {
        h(this.f41204m);
    }

    public final void k() {
        j jVar = this.f41200i;
        if (jVar.e != null) {
            jVar.p();
        }
        h(this.f41200i);
    }

    public final void l(a2 a2Var) {
        b bVar = this.f41196b;
        if (bVar.size() < 0) {
            a aVar = this.f41195a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f41148f + aVar.e, new Object[]{a2Var}));
        }
    }

    public final void m(a2 a2Var) {
        b bVar = this.f41196b;
        if (bVar.size() < 0) {
            a aVar = this.f41195a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Unexpected character '%s' in input state [%s]", aVar.f41148f + aVar.e, new Object[]{Character.valueOf(aVar.i()), a2Var}));
        }
    }

    public final boolean n() {
        if (this.f41206o != null && this.f41200i.o().equalsIgnoreCase(this.f41206o)) {
            return true;
        }
        return false;
    }
}

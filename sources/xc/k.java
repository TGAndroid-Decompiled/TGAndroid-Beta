package xc;

import java.util.Arrays;
public final class k {
    public static final char[] f53660r;
    public static final int[] f53661s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f53662a;
    public final b f53663b;
    public f2.f d;
    public j f53667i;
    public final i f53668j;
    public final h f53669k;
    public final d f53670l;
    public final f f53671m;
    public final e f53672n;
    public String f53673o;
    public final int[] f53674p;
    public final int[] f53675q;
    public a2 f53664c = a2.f53616a;
    public boolean e = false;
    public String f53665f = null;
    public final StringBuilder f53666g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f53660r = cArr;
        Arrays.sort(cArr);
    }

    public k(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.f53659k = new wc.b();
        this.f53668j = jVar;
        this.f53669k = new j(3);
        this.f53670l = new f2.f(5, 1);
        this.f53671m = new f();
        this.f53672n = new e();
        this.f53674p = new int[1];
        this.f53675q = new int[2];
        this.f53662a = aVar;
        this.f53663b = bVar;
    }

    public final void a(a2 a2Var) {
        this.f53662a.a();
        this.f53664c = a2Var;
    }

    public final void b(String str) {
        b bVar = this.f53663b;
        if (bVar.size() < 0) {
            a aVar = this.f53662a;
            bVar.add(new ba.a(aVar.f53614f + aVar.e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: xc.k.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.f53668j;
            jVar.k();
        } else {
            jVar = this.f53669k;
            jVar.b();
        }
        this.f53667i = jVar;
        return jVar;
    }

    public final void e() {
        f2.f.c(this.h);
    }

    public final void f(char c10) {
        h(String.valueOf(c10));
    }

    public final void g(f2.f fVar) {
        if (!this.e) {
            this.d = fVar;
            this.e = true;
            int i10 = fVar.f6736b;
            if (i10 == 2) {
                this.f53673o = ((i) fVar).f53654c;
                return;
            } else if (i10 == 3 && ((h) fVar).f53659k != null) {
                b bVar = this.f53663b;
                if (bVar.size() < 0) {
                    a aVar = this.f53662a;
                    ba.a aVar2 = new ba.a(4);
                    aVar2.f2519c = aVar.f53614f + aVar.e;
                    aVar2.f2518b = "Attributes incorrectly present on end tag";
                    bVar.add(aVar2);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("There is an unread token pending!");
    }

    public final void h(String str) {
        if (this.f53665f == null) {
            this.f53665f = str;
            return;
        }
        StringBuilder sb2 = this.f53666g;
        if (sb2.length() == 0) {
            sb2.append(this.f53665f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f53672n);
    }

    public final void j() {
        g(this.f53671m);
    }

    public final void k() {
        j jVar = this.f53667i;
        if (jVar.e != null) {
            jVar.j();
        }
        g(this.f53667i);
    }

    public final void l(a2 a2Var) {
        b bVar = this.f53663b;
        if (bVar.size() < 0) {
            a aVar = this.f53662a;
            bVar.add(new ba.a(aVar.f53614f + aVar.e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{a2Var}));
        }
    }

    public final void m(a2 a2Var) {
        b bVar = this.f53663b;
        if (bVar.size() < 0) {
            a aVar = this.f53662a;
            bVar.add(new ba.a(aVar.f53614f + aVar.e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), a2Var}));
        }
    }

    public final boolean n() {
        if (this.f53673o != null && this.f53667i.i().equalsIgnoreCase(this.f53673o)) {
            return true;
        }
        return false;
    }
}

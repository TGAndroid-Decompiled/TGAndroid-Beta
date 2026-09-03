package pc;

import java.util.Arrays;
public final class k {
    public static final char[] f44367r;
    public static final int[] f44368s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f44369a;
    public final b f44370b;
    public n3.a d;
    public j f44375i;
    public final i f44376j;
    public final h f44377k;
    public final d f44378l;
    public final f f44379m;
    public final e f44380n;
    public String f44381o;
    public final int[] f44382p;
    public final int[] f44383q;
    public a2 f44371c = a2.f44321a;
    public boolean f44372e = false;
    public String f44373f = null;
    public final StringBuilder f44374g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f44367r = cArr;
        Arrays.sort(cArr);
    }

    public k(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.v = new oc.b();
        this.f44376j = jVar;
        this.f44377k = new j(3);
        this.f44378l = new n3.a(5, 1);
        this.f44379m = new f();
        this.f44380n = new e();
        this.f44382p = new int[1];
        this.f44383q = new int[2];
        this.f44369a = aVar;
        this.f44370b = bVar;
    }

    public final void a(a2 a2Var) {
        this.f44369a.a();
        this.f44371c = a2Var;
    }

    public final void b(String str) {
        b bVar = this.f44370b;
        if (bVar.size() < 0) {
            a aVar = this.f44369a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Invalid character reference: %s", aVar.f44319f + aVar.f44318e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: pc.k.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z4) {
        j jVar;
        if (z4) {
            jVar = this.f44376j;
            jVar.r();
        } else {
            jVar = this.f44377k;
            jVar.g();
        }
        this.f44375i = jVar;
        return jVar;
    }

    public final void e() {
        n3.a.h(this.h);
    }

    public final void f(char c3) {
        g(String.valueOf(c3));
    }

    public final void g(String str) {
        if (this.f44373f == null) {
            this.f44373f = str;
            return;
        }
        StringBuilder sb = this.f44374g;
        if (sb.length() == 0) {
            sb.append(this.f44373f);
        }
        sb.append(str);
    }

    public final void h(n3.a aVar) {
        if (!this.f44372e) {
            this.d = aVar;
            this.f44372e = true;
            int i10 = aVar.f15195b;
            if (i10 == 2) {
                this.f44381o = ((i) aVar).f44361c;
                return;
            } else if (i10 == 3 && ((h) aVar).v != null) {
                b bVar = this.f44370b;
                if (bVar.size() < 0) {
                    a aVar2 = this.f44369a;
                    com.google.android.gms.internal.clearcut.z0 z0Var = new com.google.android.gms.internal.clearcut.z0();
                    z0Var.f3430b = aVar2.f44319f + aVar2.f44318e;
                    z0Var.f3431c = "Attributes incorrectly present on end tag";
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
        h(this.f44380n);
    }

    public final void j() {
        h(this.f44379m);
    }

    public final void k() {
        j jVar = this.f44375i;
        if (jVar.f44362e != null) {
            jVar.p();
        }
        h(this.f44375i);
    }

    public final void l(a2 a2Var) {
        b bVar = this.f44370b;
        if (bVar.size() < 0) {
            a aVar = this.f44369a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f44319f + aVar.f44318e, new Object[]{a2Var}));
        }
    }

    public final void m(a2 a2Var) {
        b bVar = this.f44370b;
        if (bVar.size() < 0) {
            a aVar = this.f44369a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Unexpected character '%s' in input state [%s]", aVar.f44319f + aVar.f44318e, new Object[]{Character.valueOf(aVar.i()), a2Var}));
        }
    }

    public final boolean n() {
        if (this.f44381o != null && this.f44375i.o().equalsIgnoreCase(this.f44381o)) {
            return true;
        }
        return false;
    }
}

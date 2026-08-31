package pc;

import java.util.Arrays;
public final class k {
    public static final char[] f44336r;
    public static final int[] f44337s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a f44338a;
    public final b f44339b;
    public n3.a d;
    public j f44344i;
    public final i f44345j;
    public final h f44346k;
    public final d f44347l;
    public final f f44348m;
    public final e f44349n;
    public String f44350o;
    public final int[] f44351p;
    public final int[] f44352q;
    public a2 f44340c = a2.f44290a;
    public boolean f44341e = false;
    public String f44342f = null;
    public final StringBuilder f44343g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f44336r = cArr;
        Arrays.sort(cArr);
    }

    public k(a aVar, b bVar) {
        ?? jVar = new j(2);
        jVar.v = new oc.b();
        this.f44345j = jVar;
        this.f44346k = new j(3);
        this.f44347l = new n3.a(5, 1);
        this.f44348m = new f();
        this.f44349n = new e();
        this.f44351p = new int[1];
        this.f44352q = new int[2];
        this.f44338a = aVar;
        this.f44339b = bVar;
    }

    public final void a(a2 a2Var) {
        this.f44338a.a();
        this.f44340c = a2Var;
    }

    public final void b(String str) {
        b bVar = this.f44339b;
        if (bVar.size() < 0) {
            a aVar = this.f44338a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Invalid character reference: %s", aVar.f44288f + aVar.f44287e, new Object[]{str}));
        }
    }

    public final int[] c(java.lang.Character r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: pc.k.c(java.lang.Character, boolean):int[]");
    }

    public final j d(boolean z4) {
        j jVar;
        if (z4) {
            jVar = this.f44345j;
            jVar.r();
        } else {
            jVar = this.f44346k;
            jVar.g();
        }
        this.f44344i = jVar;
        return jVar;
    }

    public final void e() {
        n3.a.h(this.h);
    }

    public final void f(char c3) {
        g(String.valueOf(c3));
    }

    public final void g(String str) {
        if (this.f44342f == null) {
            this.f44342f = str;
            return;
        }
        StringBuilder sb = this.f44343g;
        if (sb.length() == 0) {
            sb.append(this.f44342f);
        }
        sb.append(str);
    }

    public final void h(n3.a aVar) {
        if (!this.f44341e) {
            this.d = aVar;
            this.f44341e = true;
            int i10 = aVar.f15193b;
            if (i10 == 2) {
                this.f44350o = ((i) aVar).f44330c;
                return;
            } else if (i10 == 3 && ((h) aVar).v != null) {
                b bVar = this.f44339b;
                if (bVar.size() < 0) {
                    a aVar2 = this.f44338a;
                    com.google.android.gms.internal.clearcut.z0 z0Var = new com.google.android.gms.internal.clearcut.z0();
                    z0Var.f3430b = aVar2.f44288f + aVar2.f44287e;
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
        h(this.f44349n);
    }

    public final void j() {
        h(this.f44348m);
    }

    public final void k() {
        j jVar = this.f44344i;
        if (jVar.f44331e != null) {
            jVar.p();
        }
        h(this.f44344i);
    }

    public final void l(a2 a2Var) {
        b bVar = this.f44339b;
        if (bVar.size() < 0) {
            a aVar = this.f44338a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f44288f + aVar.f44287e, new Object[]{a2Var}));
        }
    }

    public final void m(a2 a2Var) {
        b bVar = this.f44339b;
        if (bVar.size() < 0) {
            a aVar = this.f44338a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Unexpected character '%s' in input state [%s]", aVar.f44288f + aVar.f44287e, new Object[]{Character.valueOf(aVar.i()), a2Var}));
        }
    }

    public final boolean n() {
        if (this.f44350o != null && this.f44344i.o().equalsIgnoreCase(this.f44350o)) {
            return true;
        }
        return false;
    }
}

package qe;

import c8.j1;
public final class j {
    public static final j f54117c;
    public static final j d;
    public static final j f54118e;
    public static final j f54119f;
    public static final j[] h;
    public static final ld.b f54120n;
    public final char f54121a;
    public final char f54122b;

    static {
        j jVar = new j("OBJ", 0, '{', '}');
        f54117c = jVar;
        j jVar2 = new j("LIST", 1, '[', ']');
        d = jVar2;
        j jVar3 = new j("MAP", 2, '{', '}');
        f54118e = jVar3;
        j jVar4 = new j("POLY_OBJ", 3, '[', ']');
        f54119f = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        h = jVarArr;
        f54120n = j1.a(jVarArr);
    }

    public j(String str, int i7, char c10, char c11) {
        this.f54121a = c10;
        this.f54122b = c11;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) h.clone();
    }
}

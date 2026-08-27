package pd;

import h7.s7;

public final class b {

    public static final b f45704a;

    public static final b f45705b;

    public static final b f45706c;
    public static final b d;

    public static final b f45707e;

    public static final b[] f45708f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f45704a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f45705b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f45706c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f45707e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f45708f = bVarArr;
        s7.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f45708f.clone();
    }
}

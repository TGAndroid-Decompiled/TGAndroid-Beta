package qh;
public final class a {
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;
    public static final a N;
    public static final a O;
    public static final a P;
    public static final a Q;
    public static final a R;
    public static final a[] S;
    public static final a f54139f;
    public static final a h;
    public static final a f54140n;
    public static final a f54141r;
    public static final a f54142s;
    public static final a f54143w;
    public static final a f54144x;
    public static final a f54145y;
    public final int f54146a;
    public final int f54147b;
    public final int f54148c;
    public final int d;
    public final int f54149e;
    a EF7;
    a EF0;

    static {
        a aVar = new a("CONTACTS", 0, 2131624259);
        f54139f = aVar;
        a aVar2 = new a("CALLS", 1, 2131624253);
        h = aVar2;
        a aVar3 = new a("CHATS", 2, 2131624254);
        f54140n = aVar3;
        a aVar4 = new a("SETTINGS", 3, 2131624278);
        f54141r = aVar4;
        a aVar5 = new a(4, 2131624255, 2131624256, "CHECKLIST");
        f54142s = aVar5;
        a aVar6 = new a(5, 2131624257, 2131624258, "COLORS");
        f54143w = aVar6;
        a aVar7 = new a(6, 2131624262, 2131624263, "FILES");
        f54144x = aVar7;
        a aVar8 = new a(7, 2131624264, 2131624265, "GALLERY");
        f54145y = aVar8;
        a aVar9 = new a(8, 2131624266, 2131624267, "GIFT");
        a aVar10 = new a(9, 2131624268, 2131624269, "LOCATION");
        D = aVar10;
        a aVar11 = new a(10, 2131624279, 2131624280, "STICKER");
        E = aVar11;
        a aVar12 = new a(11, 2131624260, 2131624261, "EMOJI");
        F = aVar12;
        a aVar13 = new a(12, 2131624270, 2131624271, "MODELS");
        G = aVar13;
        a aVar14 = new a(13, 2131624272, 2131624273, "MUSIC");
        H = aVar14;
        a aVar15 = new a(14, 2131624274, 2131624275, "POLL");
        I = aVar15;
        a aVar16 = new a(15, 2131624281, 2131624282, "SYMBOLS");
        J = aVar16;
        a aVar17 = new a(16, 2131624276, 2131624277, "REPLIES");
        K = aVar17;
        a aVar18 = new a(17, 2131624283, 2131624284, "WALLET");
        a aVar19 = new a();
        L = aVar19;
        a aVar20 = new a(19, 2131624251, 2131624252, "ARTICLE");
        M = aVar20;
        a aVar21 = new a(20, 2131624040, 2131624041, "GRAM");
        N = aVar21;
        a aVar22 = new a("BOOSTS", 21, 2131623944, 25, 49);
        O = aVar22;
        a aVar23 = new a("MONETIZATION", 22, 2131624090, 19, 45);
        P = aVar23;
        a aVar24 = new a("STORIES_SAVED", 23, 2131624101, 20, 40);
        Q = aVar24;
        a aVar25 = new a("STORIES_ARCHIVE", 24, 2131624100);
        R = aVar25;
        S = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25};
    }

    public a(String str, int i7, int i10, int i11, int i12) {
        this.f54146a = i10;
        this.f54147b = i10;
        this.d = i11;
        this.f54149e = i12;
        this.f54148c = -1;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) S.clone();
    }

    public a() {
        this.f54148c = 2131232772;
        this.f54146a = -1;
        this.f54147b = -1;
        this.d = -1;
        this.f54149e = -1;
    }

    public a(String str, int i7, int i10) {
        this.f54146a = i10;
        this.f54147b = i10;
        this.d = -1;
        this.f54149e = -1;
        this.f54148c = -1;
    }

    public a(int i7, int i10, int i11, String str) {
        this.f54146a = i10;
        this.f54147b = i11;
        this.d = -1;
        this.f54149e = -1;
        this.f54148c = -1;
    }
}

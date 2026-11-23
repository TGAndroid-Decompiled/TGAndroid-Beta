package qh;
public final class a {
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
    public static final a S;
    public static final a[] T;
    public static final a f56268f;
    public static final a h;
    public static final a f56269n;
    public static final a f56270r;
    public static final a f56271s;
    public static final a f56272w;
    public static final a f56273x;
    public static final a f56274y;
    public final int f56275a;
    public final int f56276b;
    public final int f56277c;
    public final int d;
    public final int f56278e;
    a EF7;
    a EF0;

    static {
        a aVar = new a("CONTACTS", 0, 2131624260);
        f56268f = aVar;
        a aVar2 = new a("CALLS", 1, 2131624254);
        h = aVar2;
        a aVar3 = new a("CHATS", 2, 2131624255);
        f56269n = aVar3;
        a aVar4 = new a("SETTINGS", 3, 2131624279);
        f56270r = aVar4;
        a aVar5 = new a(4, 2131624256, 2131624257, "CHECKLIST");
        f56271s = aVar5;
        a aVar6 = new a(5, 2131624258, 2131624259, "COLORS");
        f56272w = aVar6;
        a aVar7 = new a(6, 2131624263, 2131624264, "FILES");
        f56273x = aVar7;
        a aVar8 = new a(7, 2131624265, 2131624266, "GALLERY");
        f56274y = aVar8;
        a aVar9 = new a(8, 2131624267, 2131624268, "GIFT");
        a aVar10 = new a(9, 2131624269, 2131624270, "LOCATION");
        E = aVar10;
        a aVar11 = new a(10, 2131624280, 2131624281, "STICKER");
        F = aVar11;
        a aVar12 = new a(11, 2131624261, 2131624262, "EMOJI");
        G = aVar12;
        a aVar13 = new a(12, 2131624271, 2131624272, "MODELS");
        H = aVar13;
        a aVar14 = new a(13, 2131624273, 2131624274, "MUSIC");
        I = aVar14;
        a aVar15 = new a(14, 2131624275, 2131624276, "POLL");
        J = aVar15;
        a aVar16 = new a(15, 2131624282, 2131624283, "SYMBOLS");
        K = aVar16;
        a aVar17 = new a(16, 2131624277, 2131624278, "REPLIES");
        L = aVar17;
        a aVar18 = new a(17, 2131624284, 2131624285, "WALLET");
        a aVar19 = new a();
        M = aVar19;
        a aVar20 = new a(19, 2131624252, 2131624253, "ARTICLE");
        N = aVar20;
        a aVar21 = new a(20, 2131624041, 2131624042, "GRAM");
        O = aVar21;
        a aVar22 = new a("BOOSTS", 21, 2131623944, 25, 49);
        P = aVar22;
        a aVar23 = new a("MONETIZATION", 22, 2131624091, 19, 45);
        Q = aVar23;
        a aVar24 = new a("STORIES_SAVED", 23, 2131624102, 20, 40);
        R = aVar24;
        a aVar25 = new a("STORIES_ARCHIVE", 24, 2131624101);
        S = aVar25;
        T = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25};
    }

    public a(String str, int i7, int i10, int i11, int i12) {
        this.f56275a = i10;
        this.f56276b = i10;
        this.d = i11;
        this.f56278e = i12;
        this.f56277c = -1;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) T.clone();
    }

    public a() {
        this.f56277c = 2131232777;
        this.f56275a = -1;
        this.f56276b = -1;
        this.d = -1;
        this.f56278e = -1;
    }

    public a(String str, int i7, int i10) {
        this.f56275a = i10;
        this.f56276b = i10;
        this.d = -1;
        this.f56278e = -1;
        this.f56277c = -1;
    }

    public a(int i7, int i10, int i11, String str) {
        this.f56275a = i10;
        this.f56276b = i11;
        this.d = -1;
        this.f56278e = -1;
        this.f56277c = -1;
    }
}

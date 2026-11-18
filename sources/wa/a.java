package wa;

import a8.p0;
public final class a {
    public String f59640a;
    public int f59641b;
    public String f59642c;
    public String d;
    public long f59643e;
    public long f59644f;
    public String f59645g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f59641b != 0) {
            return new b(this.f59640a, this.f59641b, this.f59642c, this.d, this.f59643e, this.f59644f, this.f59645g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f59641b == 0) {
            sb2.append(" registrationStatus");
        }
        if ((this.h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(p0.q("Missing required properties:", sb2));
    }
}

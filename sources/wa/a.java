package wa;

import a8.p0;
public final class a {
    public String f59678a;
    public int f59679b;
    public String f59680c;
    public String d;
    public long f59681e;
    public long f59682f;
    public String f59683g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f59679b != 0) {
            return new b(this.f59678a, this.f59679b, this.f59680c, this.d, this.f59681e, this.f59682f, this.f59683g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f59679b == 0) {
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

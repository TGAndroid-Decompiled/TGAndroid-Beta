package wa;

import a8.p0;
public final class a {
    public String f59639a;
    public int f59640b;
    public String f59641c;
    public String d;
    public long f59642e;
    public long f59643f;
    public String f59644g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f59640b != 0) {
            return new b(this.f59639a, this.f59640b, this.f59641c, this.d, this.f59642e, this.f59643f, this.f59644g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f59640b == 0) {
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

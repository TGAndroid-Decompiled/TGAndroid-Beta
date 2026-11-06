package wa;

import a8.p0;
public final class a {
    public String f57529a;
    public int f57530b;
    public String f57531c;
    public String d;
    public long f57532e;
    public long f57533f;
    public String f57534g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f57530b != 0) {
            return new b(this.f57529a, this.f57530b, this.f57531c, this.d, this.f57532e, this.f57533f, this.f57534g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f57530b == 0) {
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

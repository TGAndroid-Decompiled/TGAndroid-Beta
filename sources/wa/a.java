package wa;

import a8.p0;
public final class a {
    public String f59074a;
    public int f59075b;
    public String f59076c;
    public String d;
    public long f59077e;
    public long f59078f;
    public String f59079g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f59075b != 0) {
            return new b(this.f59074a, this.f59075b, this.f59076c, this.d, this.f59077e, this.f59078f, this.f59079g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f59075b == 0) {
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

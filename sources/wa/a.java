package wa;

import a8.p0;
public final class a {
    public String f59647a;
    public int f59648b;
    public String f59649c;
    public String d;
    public long f59650e;
    public long f59651f;
    public String f59652g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f59648b != 0) {
            return new b(this.f59647a, this.f59648b, this.f59649c, this.d, this.f59650e, this.f59651f, this.f59652g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f59648b == 0) {
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

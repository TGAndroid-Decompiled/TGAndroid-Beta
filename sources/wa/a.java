package wa;

import a8.p0;
public final class a {
    public String f57530a;
    public int f57531b;
    public String f57532c;
    public String d;
    public long f57533e;
    public long f57534f;
    public String f57535g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f57531b != 0) {
            return new b(this.f57530a, this.f57531b, this.f57532c, this.d, this.f57533e, this.f57534f, this.f57535g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f57531b == 0) {
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

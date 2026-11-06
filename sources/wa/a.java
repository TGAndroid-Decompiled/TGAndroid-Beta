package wa;

import a8.p0;
public final class a {
    public String f57505a;
    public int f57506b;
    public String f57507c;
    public String d;
    public long f57508e;
    public long f57509f;
    public String f57510g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f57506b != 0) {
            return new b(this.f57505a, this.f57506b, this.f57507c, this.d, this.f57508e, this.f57509f, this.f57510g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f57506b == 0) {
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

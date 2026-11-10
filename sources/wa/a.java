package wa;

import a8.p0;
public final class a {
    public String f57633a;
    public int f57634b;
    public String f57635c;
    public String d;
    public long f57636e;
    public long f57637f;
    public String f57638g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f57634b != 0) {
            return new b(this.f57633a, this.f57634b, this.f57635c, this.d, this.f57636e, this.f57637f, this.f57638g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f57634b == 0) {
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

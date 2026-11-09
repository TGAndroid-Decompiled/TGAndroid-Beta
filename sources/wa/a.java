package wa;

import a8.p0;
public final class a {
    public String f57634a;
    public int f57635b;
    public String f57636c;
    public String d;
    public long f57637e;
    public long f57638f;
    public String f57639g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f57635b != 0) {
            return new b(this.f57634a, this.f57635b, this.f57636c, this.d, this.f57637e, this.f57638f, this.f57639g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f57635b == 0) {
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

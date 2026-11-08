package wa;

import a8.p0;
public final class a {
    public String f57621a;
    public int f57622b;
    public String f57623c;
    public String d;
    public long f57624e;
    public long f57625f;
    public String f57626g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f57622b != 0) {
            return new b(this.f57621a, this.f57622b, this.f57623c, this.d, this.f57624e, this.f57625f, this.f57626g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f57622b == 0) {
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

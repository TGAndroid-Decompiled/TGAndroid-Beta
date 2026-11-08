package wa;

import a8.p0;
public final class a {
    public String f57622a;
    public int f57623b;
    public String f57624c;
    public String d;
    public long f57625e;
    public long f57626f;
    public String f57627g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f57623b != 0) {
            return new b(this.f57622a, this.f57623b, this.f57624c, this.d, this.f57625e, this.f57626f, this.f57627g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f57623b == 0) {
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

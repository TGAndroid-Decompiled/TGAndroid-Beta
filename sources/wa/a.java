package wa;

import a8.p0;
public final class a {
    public String f59767a;
    public int f59768b;
    public String f59769c;
    public String d;
    public long f59770e;
    public long f59771f;
    public String f59772g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f59768b != 0) {
            return new b(this.f59767a, this.f59768b, this.f59769c, this.d, this.f59770e, this.f59771f, this.f59772g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f59768b == 0) {
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

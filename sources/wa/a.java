package wa;

import a8.p0;
public final class a {
    public String f59682a;
    public int f59683b;
    public String f59684c;
    public String d;
    public long f59685e;
    public long f59686f;
    public String f59687g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f59683b != 0) {
            return new b(this.f59682a, this.f59683b, this.f59684c, this.d, this.f59685e, this.f59686f, this.f59687g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f59683b == 0) {
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

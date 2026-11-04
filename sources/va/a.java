package va;
public final class a {
    public String f56486a;
    public int f56487b;
    public String f56488c;
    public String d;
    public long f56489e;
    public long f56490f;
    public String f56491g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f56487b != 0) {
            return new b(this.f56486a, this.f56487b, this.f56488c, this.d, this.f56489e, this.f56490f, this.f56491g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f56487b == 0) {
            sb2.append(" registrationStatus");
        }
        if ((this.h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}

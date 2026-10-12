package sc;
public final class a {
    public final String f48127a;
    public final int f48128b;
    public transient String f48129c;

    public a(String str, int i10) {
        this.f48127a = str;
        this.f48128b = i10;
    }

    public final String toString() {
        if (this.f48129c == null) {
            this.f48129c = String.format("%s:%d", this.f48127a, Integer.valueOf(this.f48128b));
        }
        return this.f48129c;
    }
}

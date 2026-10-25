package uc;
public final class a {
    public final String f49639a;
    public final int f49640b;
    public transient String f49641c;

    public a(String str, int i10) {
        this.f49639a = str;
        this.f49640b = i10;
    }

    public final String toString() {
        if (this.f49641c == null) {
            this.f49641c = String.format("%s:%d", this.f49639a, Integer.valueOf(this.f49640b));
        }
        return this.f49641c;
    }
}

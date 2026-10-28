package uc;
public final class a {
    public final String f49677a;
    public final int f49678b;
    public transient String f49679c;

    public a(String str, int i10) {
        this.f49677a = str;
        this.f49678b = i10;
    }

    public final String toString() {
        if (this.f49679c == null) {
            this.f49679c = String.format("%s:%d", this.f49677a, Integer.valueOf(this.f49678b));
        }
        return this.f49679c;
    }
}

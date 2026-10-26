package uc;
public final class a {
    public final String f49642a;
    public final int f49643b;
    public transient String f49644c;

    public a(String str, int i10) {
        this.f49642a = str;
        this.f49643b = i10;
    }

    public final String toString() {
        if (this.f49644c == null) {
            this.f49644c = String.format("%s:%d", this.f49642a, Integer.valueOf(this.f49643b));
        }
        return this.f49644c;
    }
}

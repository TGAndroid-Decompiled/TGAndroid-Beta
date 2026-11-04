package wd;
public final class n0 implements x0 {
    public final boolean f57518a;

    public n0(boolean z10) {
        this.f57518a = z10;
    }

    @Override
    public final o1 b() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.f57518a;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f57518a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}

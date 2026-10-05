package zd;
public final class q0 implements a1 {
    public final boolean f53286a;

    public q0(boolean z10) {
        this.f53286a = z10;
    }

    @Override
    public final v1 c() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.f53286a;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f53286a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}

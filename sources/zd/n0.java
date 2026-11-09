package zd;
public final class n0 implements x0 {
    public final boolean f60108a;

    public n0(boolean z9) {
        this.f60108a = z9;
    }

    @Override
    public final o1 b() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.f60108a;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f60108a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}

package s8;
public final class t0 extends z {
    public final transient Object d;

    public t0(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final v i() {
        return v.x(this.d);
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        objArr[i10] = this.d;
        return i10 + 1;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        String obj = this.d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override
    public final u0 w() {
        return new b0(this.d);
    }
}

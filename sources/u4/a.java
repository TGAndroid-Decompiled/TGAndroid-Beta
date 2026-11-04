package u4;
public final class a {
    public int f55484a;
    public int f55485b;
    public Object f55486c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i3 = this.f55484a;
                if (i3 == aVar.f55484a) {
                    if (i3 != 8 || Math.abs(this.d - this.f55485b) != 1 || this.d != aVar.f55485b || this.f55485b != aVar.d) {
                        if (this.d == aVar.d && this.f55485b == aVar.f55485b) {
                            Object obj2 = this.f55486c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f55486c)) {
                                    return false;
                                }
                            } else if (aVar.f55486c != null) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f55484a * 31) + this.f55485b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i3 = this.f55484a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f55485b);
        sb2.append("c:");
        sb2.append(this.d);
        sb2.append(",p:");
        sb2.append(this.f55486c);
        sb2.append("]");
        return sb2.toString();
    }
}

package v4;
public final class a {
    public int f56992a;
    public int f56993b;
    public Object f56994c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i7 = this.f56992a;
                if (i7 == aVar.f56992a) {
                    if (i7 != 8 || Math.abs(this.d - this.f56993b) != 1 || this.d != aVar.f56993b || this.f56993b != aVar.d) {
                        if (this.d == aVar.d && this.f56993b == aVar.f56993b) {
                            Object obj2 = this.f56994c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f56994c)) {
                                    return false;
                                }
                            } else if (aVar.f56994c != null) {
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
        return (((this.f56992a * 31) + this.f56993b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i7 = this.f56992a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 8) {
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
        sb2.append(this.f56993b);
        sb2.append("c:");
        sb2.append(this.d);
        sb2.append(",p:");
        sb2.append(this.f56994c);
        sb2.append("]");
        return sb2.toString();
    }
}

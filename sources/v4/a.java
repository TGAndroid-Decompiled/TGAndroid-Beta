package v4;
public final class a {
    public int f57000a;
    public int f57001b;
    public Object f57002c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i7 = this.f57000a;
                if (i7 == aVar.f57000a) {
                    if (i7 != 8 || Math.abs(this.d - this.f57001b) != 1 || this.d != aVar.f57001b || this.f57001b != aVar.d) {
                        if (this.d == aVar.d && this.f57001b == aVar.f57001b) {
                            Object obj2 = this.f57002c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f57002c)) {
                                    return false;
                                }
                            } else if (aVar.f57002c != null) {
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
        return (((this.f57000a * 31) + this.f57001b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i7 = this.f57000a;
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
        sb2.append(this.f57001b);
        sb2.append("c:");
        sb2.append(this.d);
        sb2.append(",p:");
        sb2.append(this.f57002c);
        sb2.append("]");
        return sb2.toString();
    }
}

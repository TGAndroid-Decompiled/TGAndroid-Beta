package s4;
public final class a {
    public int f47668a;
    public int f47669b;
    public Object f47670c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i10 = this.f47668a;
                if (i10 == aVar.f47668a) {
                    if (i10 != 8 || Math.abs(this.d - this.f47669b) != 1 || this.d != aVar.f47669b || this.f47669b != aVar.d) {
                        if (this.d == aVar.d && this.f47669b == aVar.f47669b) {
                            Object obj2 = this.f47670c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f47670c)) {
                                    return false;
                                }
                            } else if (aVar.f47670c != null) {
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
        return (((this.f47668a * 31) + this.f47669b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.f47668a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
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
        sb2.append(this.f47669b);
        sb2.append("c:");
        sb2.append(this.d);
        sb2.append(",p:");
        sb2.append(this.f47670c);
        sb2.append("]");
        return sb2.toString();
    }
}

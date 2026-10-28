package s4;
public final class a {
    public int f47703a;
    public int f47704b;
    public Object f47705c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i10 = this.f47703a;
                if (i10 == aVar.f47703a) {
                    if (i10 != 8 || Math.abs(this.d - this.f47704b) != 1 || this.d != aVar.f47704b || this.f47704b != aVar.d) {
                        if (this.d == aVar.d && this.f47704b == aVar.f47704b) {
                            Object obj2 = this.f47705c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f47705c)) {
                                    return false;
                                }
                            } else if (aVar.f47705c != null) {
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
        return (((this.f47703a * 31) + this.f47704b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.f47703a;
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
        sb2.append(this.f47704b);
        sb2.append("c:");
        sb2.append(this.d);
        sb2.append(",p:");
        sb2.append(this.f47705c);
        sb2.append("]");
        return sb2.toString();
    }
}

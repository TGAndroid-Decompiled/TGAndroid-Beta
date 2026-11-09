package v4;
public final class a {
    public int f57004a;
    public int f57005b;
    public Object f57006c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i7 = this.f57004a;
                if (i7 == aVar.f57004a) {
                    if (i7 != 8 || Math.abs(this.d - this.f57005b) != 1 || this.d != aVar.f57005b || this.f57005b != aVar.d) {
                        if (this.d == aVar.d && this.f57005b == aVar.f57005b) {
                            Object obj2 = this.f57006c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f57006c)) {
                                    return false;
                                }
                            } else if (aVar.f57006c != null) {
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
        return (((this.f57004a * 31) + this.f57005b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i7 = this.f57004a;
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
        sb2.append(this.f57005b);
        sb2.append("c:");
        sb2.append(this.d);
        sb2.append(",p:");
        sb2.append(this.f57006c);
        sb2.append("]");
        return sb2.toString();
    }
}

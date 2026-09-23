package s4;
public final class a {
    public int f42591a;
    public int f42592b;
    public Object f42593c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i10 = this.f42591a;
                if (i10 == aVar.f42591a) {
                    if (i10 != 8 || Math.abs(this.d - this.f42592b) != 1 || this.d != aVar.f42592b || this.f42592b != aVar.d) {
                        if (this.d == aVar.d && this.f42592b == aVar.f42592b) {
                            Object obj2 = this.f42593c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f42593c)) {
                                    return false;
                                }
                            } else if (aVar.f42593c != null) {
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
        return (((this.f42591a * 31) + this.f42592b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.f42591a;
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
        sb2.append(this.f42592b);
        sb2.append("c:");
        sb2.append(this.d);
        sb2.append(",p:");
        sb2.append(this.f42593c);
        sb2.append("]");
        return sb2.toString();
    }
}

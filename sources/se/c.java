package se;
public final class c {
    public int f47292a;
    public int f47293b;
    public int f47294c;
    public int d;
    public String f47295e;

    public final String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(20);
        boolean z4 = false;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < this.f47295e.length(); i11++) {
            char charAt = this.f47295e.charAt(i11);
            if (charAt != '#') {
                if (charAt != '(') {
                    if (charAt != 'c') {
                        if (charAt == 'n') {
                            if (str3 != null) {
                                sb.append(str3);
                            }
                            z10 = true;
                        }
                    } else {
                        if (str2 != null) {
                            sb.append(str2);
                        }
                        z4 = true;
                    }
                } else if (i10 < str.length()) {
                    z11 = true;
                }
                if (charAt == ' ' && i11 > 0) {
                    int i12 = i11 - 1;
                    if (this.f47295e.charAt(i12) == 'n') {
                        if (str3 == null) {
                        }
                    }
                    if (this.f47295e.charAt(i12) == 'c' && str2 == null) {
                    }
                }
                if (i10 < str.length() || (z11 && charAt == ')')) {
                    sb.append(this.f47295e.substring(i11, i11 + 1));
                    if (charAt == ')') {
                        z11 = false;
                    }
                }
            } else if (i10 < str.length()) {
                int i13 = i10 + 1;
                sb.append(str.substring(i10, i13));
                i10 = i13;
            } else if (z11) {
                sb.append(" ");
            }
        }
        if (str2 != null && !z4) {
            sb.insert(0, str2.concat(" "));
        } else if (str3 != null && !z10) {
            sb.insert(0, str3);
        }
        return sb.toString();
    }
}

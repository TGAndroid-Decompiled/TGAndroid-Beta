package pf;
public final class c {
    public int f53497a;
    public int f53498b;
    public int f53499c;
    public int d;
    public String f53500e;

    public final String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(20);
        boolean z9 = false;
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < this.f53500e.length(); i10++) {
            char charAt = this.f53500e.charAt(i10);
            if (charAt != '#') {
                if (charAt != '(') {
                    if (charAt != 'c') {
                        if (charAt == 'n') {
                            if (str3 != null) {
                                sb2.append(str3);
                            }
                            z10 = true;
                        }
                    } else {
                        if (str2 != null) {
                            sb2.append(str2);
                        }
                        z9 = true;
                    }
                } else if (i7 < str.length()) {
                    z11 = true;
                }
                if (charAt == ' ' && i10 > 0) {
                    int i11 = i10 - 1;
                    if (this.f53500e.charAt(i11) == 'n') {
                        if (str3 == null) {
                        }
                    }
                    if (this.f53500e.charAt(i11) == 'c' && str2 == null) {
                    }
                }
                if (i7 < str.length() || (z11 && charAt == ')')) {
                    sb2.append(this.f53500e.substring(i10, i10 + 1));
                    if (charAt == ')') {
                        z11 = false;
                    }
                }
            } else if (i7 < str.length()) {
                int i12 = i7 + 1;
                sb2.append(str.substring(i7, i12));
                i7 = i12;
            } else if (z11) {
                sb2.append(" ");
            }
        }
        if (str2 != null && !z9) {
            sb2.insert(0, str2.concat(" "));
        } else if (str3 != null && !z10) {
            sb2.insert(0, str3);
        }
        return sb2.toString();
    }
}

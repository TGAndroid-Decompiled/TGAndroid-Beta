package qi;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import j$.util.Objects;
import java.net.IDN;
import java.util.Locale;
import java.util.regex.Pattern;
import k2.q0;
import m1.j;
public final class a {
    public static final Pattern f44738g = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_-]*(/[A-Za-z0-9][A-Za-z0-9_-]*)*");
    public static final Pattern h = Pattern.compile("[A-Za-z0-9_-]+");
    public static final a f44739i = a().b();
    public final int f44740a;
    public final String f44741b;
    public final int f44742c;
    public final String d;
    public final String e;
    public final String f44743f;

    public a(q0 q0Var) {
        int i10 = q0Var.f14780a;
        this.f44740a = i10;
        this.f44741b = (String) q0Var.f14782c;
        if (i10 == 3) {
            this.f44743f = (String) q0Var.f14783f;
            this.f44742c = 0;
            this.d = "";
            this.e = "";
        } else if (i10 == 2) {
            this.f44743f = (String) q0Var.f14783f;
            this.f44742c = q0Var.f14781b;
            this.d = "";
            this.e = "";
        } else if (i10 == 1) {
            this.f44743f = "";
            this.f44742c = q0Var.f14781b;
            this.d = (String) q0Var.d;
            this.e = (String) q0Var.e;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static q0 a() {
        ?? obj = new Object();
        obj.f14780a = 1;
        obj.f14782c = "";
        obj.d = "";
        obj.e = "";
        obj.f14783f = "";
        return obj;
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str) && h.matcher(str).matches()) {
            try {
                byte[] decode = Base64.decode(str, 11);
                if (decode.length >= 17 && (decode[0] & 255) == 112) {
                    char[] cArr = new char[(decode.length - 1) * 2];
                    char[] charArray = "0123456789abcdef".toCharArray();
                    for (int i10 = 1; i10 < decode.length; i10++) {
                        byte b10 = decode[i10];
                        int i11 = (i10 - 1) * 2;
                        cArr[i11] = charArray[(b10 & 255) >>> 4];
                        cArr[i11 + 1] = charArray[b10 & 15];
                    }
                    String str2 = new String(cArr);
                    if (!g(str2)) {
                        return null;
                    }
                    if (Base64.encodeToString(decode, 11).equals(str)) {
                        return str2;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static a c(SharedPreferences sharedPreferences) {
        int i10;
        String str = "";
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i11 = sharedPreferences.getInt("proxy_port", 1080);
        int i12 = 2;
        int i13 = 1;
        if (TextUtils.isEmpty(string4)) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        int c10 = j.c(i10);
        if (c10 != 1) {
            if (c10 != 2) {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        int e = e(sharedPreferences.getInt("proxy_type", i12));
        q0 a2 = a();
        if (string == null) {
            string = "";
        }
        a2.f14782c = string;
        if (string2 == null) {
            string2 = "";
        }
        a2.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a2.e = string3;
        if (string4 != null) {
            str = string4;
        }
        a2.f14783f = str;
        a2.f14781b = i11;
        if (e != 0) {
            i13 = e;
        }
        a2.f14780a = i13;
        return a2.b();
    }

    public static qi.a d(android.net.Uri r9) {
        throw new UnsupportedOperationException("Method not decompiled: qi.a.d(android.net.Uri):qi.a");
    }

    public static int e(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 3;
            }
        }
        return 1;
    }

    public static boolean g(String str) {
        if (str != null) {
            if (str.length() == 32) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    if (Character.digit(str.charAt(i10), 16) < 0) {
                        return false;
                    }
                }
                return true;
            } else if (str.length() == 34 && str.regionMatches(true, 0, "dd", 0, 2)) {
                for (int i11 = 2; i11 < str.length(); i11++) {
                    if (Character.digit(str.charAt(i11), 16) < 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f44742c == aVar.f44742c && this.f44740a == aVar.f44740a && Objects.equals(this.f44741b, aVar.f44741b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.e, aVar.e) && Objects.equals(this.f44743f, aVar.f44743f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        String str;
        String str2;
        boolean equals;
        String str3 = this.f44741b;
        if (!TextUtils.isEmpty(str3)) {
            if (this.f44740a == 3) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = str3.indexOf(47);
                    if (indexOf >= 0) {
                        str = str3.substring(0, indexOf);
                    } else {
                        str = str3;
                    }
                    if (indexOf >= 0) {
                        str2 = str3.substring(indexOf + 1);
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && f44738g.matcher(str2).matches()))) {
                        try {
                            equals = str.equals(IDN.toASCII(str, 3).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                        }
                        if (!equals && g(this.f44743f)) {
                            return true;
                        }
                    }
                }
                equals = false;
                return !equals ? false : false;
            } else if (this.f44742c > 0) {
                return true;
            }
        }
        return false;
    }

    public final void h(SharedPreferences.Editor editor) {
        int i10;
        int i11 = this.f44740a;
        int c10 = j.c(i11);
        if (c10 != 1) {
            if (c10 != 2) {
                i10 = 0;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 1;
        }
        editor.putInt("proxy_type", i10);
        editor.putString("proxy_ip", this.f44741b);
        int c11 = j.c(i11);
        int i12 = this.f44742c;
        if (c11 != 0) {
            String str = this.f44743f;
            if (c11 != 1) {
                if (c11 != 2) {
                    return;
                }
                editor.putString("proxy_secret", str);
                editor.remove("proxy_port");
                editor.remove("proxy_pass");
                editor.remove("proxy_user");
                return;
            }
            editor.putString("proxy_secret", str);
            editor.putInt("proxy_port", i12);
            editor.remove("proxy_pass");
            editor.remove("proxy_user");
            return;
        }
        editor.putInt("proxy_port", i12);
        editor.remove("proxy_secret");
        String str2 = this.e;
        if (TextUtils.isEmpty(str2)) {
            editor.remove("proxy_pass");
        } else {
            editor.putString("proxy_pass", str2);
        }
        String str3 = this.d;
        if (TextUtils.isEmpty(str3)) {
            editor.remove("proxy_user");
        } else {
            editor.putString("proxy_user", str3);
        }
    }

    public final int hashCode() {
        return Objects.hash(j.a(this.f44740a), this.f44741b, Integer.valueOf(this.f44742c), this.d, this.e, this.f44743f);
    }
}

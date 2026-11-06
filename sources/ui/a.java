package ui;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import j$.util.Objects;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.regex.Pattern;
import n2.n0;
public final class a {
    public static final Pattern f56822g = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_-]*(/[A-Za-z0-9][A-Za-z0-9_-]*)*");
    public static final Pattern h = Pattern.compile("[A-Za-z0-9_-]+");
    public static final a f56823i = a().d();
    public final int f56824a;
    public final String f56825b;
    public final int f56826c;
    public final String d;
    public final String f56827e;
    public final String f56828f;

    public a(n0 n0Var) {
        int i7 = n0Var.f20251a;
        this.f56824a = i7;
        this.f56825b = (String) n0Var.f20253c;
        if (i7 == 3) {
            this.f56828f = (String) n0Var.f20255f;
            this.f56826c = 0;
            this.d = "";
            this.f56827e = "";
        } else if (i7 == 2) {
            this.f56828f = (String) n0Var.f20255f;
            this.f56826c = n0Var.f20252b;
            this.d = "";
            this.f56827e = "";
        } else if (i7 == 1) {
            this.f56828f = "";
            this.f56826c = n0Var.f20252b;
            this.d = (String) n0Var.d;
            this.f56827e = (String) n0Var.f20254e;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static n0 a() {
        ?? obj = new Object();
        obj.f20251a = 1;
        obj.f20253c = "";
        obj.d = "";
        obj.f20254e = "";
        obj.f20255f = "";
        return obj;
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str) && h.matcher(str).matches()) {
            try {
                byte[] decode = Base64.decode(str, 11);
                if (decode.length >= 17 && (decode[0] & 255) == 112) {
                    char[] cArr = new char[(decode.length - 1) * 2];
                    char[] charArray = "0123456789abcdef".toCharArray();
                    for (int i7 = 1; i7 < decode.length; i7++) {
                        byte b10 = decode[i7];
                        int i10 = (i7 - 1) * 2;
                        cArr[i10] = charArray[(b10 & 255) >>> 4];
                        cArr[i10 + 1] = charArray[b10 & 15];
                    }
                    String str2 = new String(cArr);
                    if (!h(str2)) {
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
        int i7;
        String str = "";
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i10 = sharedPreferences.getInt("proxy_port", 1080);
        int i11 = 2;
        if (TextUtils.isEmpty(string4)) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        int c10 = p1.g.c(i7);
        if (c10 != 1) {
            if (c10 != 2) {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        int f10 = f(sharedPreferences.getInt("proxy_type", i11));
        n0 a10 = a();
        if (string == null) {
            string = "";
        }
        a10.f20253c = string;
        if (string2 == null) {
            string2 = "";
        }
        a10.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a10.f20254e = string3;
        if (string4 != null) {
            str = string4;
        }
        a10.f20255f = str;
        a10.f20252b = i10;
        a10.p(f10);
        return a10.d();
    }

    public static ui.a d(android.net.Uri r9) {
        throw new UnsupportedOperationException("Method not decompiled: ui.a.d(android.net.Uri):ui.a");
    }

    public static int f(int i7) {
        if (i7 != 0) {
            if (i7 == 1) {
                return 2;
            }
            if (i7 == 2) {
                return 3;
            }
        }
        return 1;
    }

    public static boolean h(String str) {
        if (str != null) {
            if (str.length() == 32) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    if (Character.digit(str.charAt(i7), 16) < 0) {
                        return false;
                    }
                }
                return true;
            } else if (str.length() == 34 && str.regionMatches(true, 0, "dd", 0, 2)) {
                for (int i10 = 2; i10 < str.length(); i10++) {
                    if (Character.digit(str.charAt(i10), 16) < 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String e() {
        StringBuilder sb2;
        boolean z9;
        String str = this.f56827e;
        String str2 = this.d;
        String str3 = this.f56825b;
        String str4 = this.f56828f;
        int i7 = this.f56824a;
        int c10 = p1.g.c(i7);
        if (c10 != 1) {
            if (c10 != 2) {
                sb2 = new StringBuilder("https://t.me/socks?");
            } else {
                sb2 = new StringBuilder("https://t.me/webproxy?");
            }
        } else {
            sb2 = new StringBuilder("https://t.me/proxy?");
        }
        try {
            sb2.append("server=");
            sb2.append(URLEncoder.encode(str3, "UTF-8"));
            if (i7 != 3) {
                sb2.append("&port=");
                sb2.append(this.f56826c);
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append("&user=");
                sb2.append(URLEncoder.encode(str2, "UTF-8"));
            }
            if (!TextUtils.isEmpty(str)) {
                sb2.append("&pass=");
                sb2.append(URLEncoder.encode(str, "UTF-8"));
            }
            if (!TextUtils.isEmpty(str4)) {
                if (i7 == 3) {
                    if (str3 != null && str3.indexOf(47) >= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9 && h(str4)) {
                        int length = str4.length() / 2;
                        byte[] bArr = new byte[length];
                        for (int i10 = 0; i10 < length; i10++) {
                            int i11 = i10 * 2;
                            bArr[i10] = (byte) (Character.digit(str4.charAt(i11 + 1), 16) | (Character.digit(str4.charAt(i11), 16) << 4));
                        }
                        byte[] bArr2 = new byte[length + 1];
                        bArr2[0] = 112;
                        System.arraycopy(bArr, 0, bArr2, 1, length);
                        str4 = Base64.encodeToString(bArr2, 11);
                    }
                }
                sb2.append("&secret=");
                sb2.append(URLEncoder.encode(str4, "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f56826c == aVar.f56826c && this.f56824a == aVar.f56824a && Objects.equals(this.f56825b, aVar.f56825b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f56827e, aVar.f56827e) && Objects.equals(this.f56828f, aVar.f56828f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean g() {
        String str;
        String str2;
        boolean equals;
        String str3 = this.f56825b;
        if (!TextUtils.isEmpty(str3)) {
            if (this.f56824a == 3) {
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
                    if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && f56822g.matcher(str2).matches()))) {
                        try {
                            equals = str.equals(IDN.toASCII(str, 3).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                        }
                        if (!equals && h(this.f56828f)) {
                            return true;
                        }
                    }
                }
                equals = false;
                return !equals ? false : false;
            } else if (this.f56826c > 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f56824a), this.f56825b, Integer.valueOf(this.f56826c), this.d, this.f56827e, this.f56828f);
    }

    public final void i(SharedPreferences.Editor editor) {
        int i7;
        int i10 = this.f56824a;
        int c10 = p1.g.c(i10);
        if (c10 != 1) {
            if (c10 != 2) {
                i7 = 0;
            } else {
                i7 = 2;
            }
        } else {
            i7 = 1;
        }
        editor.putInt("proxy_type", i7);
        editor.putString("proxy_ip", this.f56825b);
        int c11 = p1.g.c(i10);
        int i11 = this.f56826c;
        if (c11 != 0) {
            String str = this.f56828f;
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
            editor.putInt("proxy_port", i11);
            editor.remove("proxy_pass");
            editor.remove("proxy_user");
            return;
        }
        editor.putInt("proxy_port", i11);
        editor.remove("proxy_secret");
        String str2 = this.f56827e;
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
}

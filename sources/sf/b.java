package sf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.Objects;
public final class b {
    public static final b f47335g = new b(a());
    public final int f47336a;
    public final String f47337b;
    public final int f47338c;
    public final String d;
    public final String f47339e;
    public final String f47340f;

    public b(a aVar) {
        int i10 = aVar.f47330a;
        this.f47336a = i10;
        this.f47337b = aVar.f47331b;
        if (i10 == 3) {
            this.f47340f = aVar.f47334f;
            this.f47338c = 0;
            this.d = "";
            this.f47339e = "";
        } else if (i10 == 2) {
            this.f47340f = aVar.f47334f;
            this.f47338c = aVar.f47332c;
            this.d = "";
            this.f47339e = "";
        } else if (i10 == 1) {
            this.f47340f = "";
            this.f47338c = aVar.f47332c;
            this.d = aVar.d;
            this.f47339e = aVar.f47333e;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static a a() {
        ?? obj = new Object();
        obj.f47330a = 1;
        obj.f47331b = "";
        obj.d = "";
        obj.f47333e = "";
        obj.f47334f = "";
        return obj;
    }

    public static b b(SharedPreferences sharedPreferences) {
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
        int c3 = m1.j.c(i10);
        if (c3 != 1) {
            if (c3 != 2) {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        int d = d(sharedPreferences.getInt("proxy_type", i12));
        a a2 = a();
        if (string == null) {
            string = "";
        }
        a2.f47331b = string;
        if (string2 == null) {
            string2 = "";
        }
        a2.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a2.f47333e = string3;
        if (string4 != null) {
            str = string4;
        }
        a2.f47334f = str;
        a2.f47332c = i11;
        if (d != 0) {
            i13 = d;
        }
        a2.f47330a = i13;
        return new b(a2);
    }

    public static sf.b c(android.net.Uri r6) {
        throw new UnsupportedOperationException("Method not decompiled: sf.b.c(android.net.Uri):sf.b");
    }

    public static int d(int i10) {
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

    public final boolean e() {
        if (!TextUtils.isEmpty(this.f47337b)) {
            if (this.f47336a != 3 && this.f47338c <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f47338c == bVar.f47338c && this.f47336a == bVar.f47336a && Objects.equals(this.f47337b, bVar.f47337b) && Objects.equals(this.d, bVar.d) && Objects.equals(this.f47339e, bVar.f47339e) && Objects.equals(this.f47340f, bVar.f47340f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(SharedPreferences.Editor editor) {
        int i10;
        int i11 = this.f47336a;
        int c3 = m1.j.c(i11);
        if (c3 != 1) {
            if (c3 != 2) {
                i10 = 0;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 1;
        }
        editor.putInt("proxy_type", i10);
        editor.putString("proxy_ip", this.f47337b);
        int c10 = m1.j.c(i11);
        int i12 = this.f47338c;
        if (c10 != 0) {
            String str = this.f47340f;
            if (c10 != 1) {
                if (c10 != 2) {
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
        String str2 = this.f47339e;
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
        return Objects.hash(m1.j.a(this.f47336a), this.f47337b, Integer.valueOf(this.f47338c), this.d, this.f47339e, this.f47340f);
    }
}

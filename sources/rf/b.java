package rf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.Objects;
public final class b {
    public static final b f43475g = new b(a());
    public final int f43476a;
    public final String f43477b;
    public final int f43478c;
    public final String d;
    public final String e;
    public final String f43479f;

    public b(a aVar) {
        int i10 = aVar.f43471a;
        this.f43476a = i10;
        this.f43477b = aVar.f43472b;
        if (i10 == 3) {
            this.f43479f = aVar.f43474f;
            this.f43478c = 0;
            this.d = "";
            this.e = "";
        } else if (i10 == 2) {
            this.f43479f = aVar.f43474f;
            this.f43478c = aVar.f43473c;
            this.d = "";
            this.e = "";
        } else if (i10 == 1) {
            this.f43479f = "";
            this.f43478c = aVar.f43473c;
            this.d = aVar.d;
            this.e = aVar.e;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static a a() {
        ?? obj = new Object();
        obj.f43471a = 1;
        obj.f43472b = "";
        obj.d = "";
        obj.e = "";
        obj.f43474f = "";
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
        a2.f43472b = string;
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
        a2.f43474f = str;
        a2.f43473c = i11;
        if (d != 0) {
            i13 = d;
        }
        a2.f43471a = i13;
        return new b(a2);
    }

    public static rf.b c(android.net.Uri r6) {
        throw new UnsupportedOperationException("Method not decompiled: rf.b.c(android.net.Uri):rf.b");
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
        if (!TextUtils.isEmpty(this.f43477b)) {
            if (this.f43476a != 3 && this.f43478c <= 0) {
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
                if (this.f43478c == bVar.f43478c && this.f43476a == bVar.f43476a && Objects.equals(this.f43477b, bVar.f43477b) && Objects.equals(this.d, bVar.d) && Objects.equals(this.e, bVar.e) && Objects.equals(this.f43479f, bVar.f43479f)) {
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
        int i11 = this.f43476a;
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
        editor.putString("proxy_ip", this.f43477b);
        int c10 = m1.j.c(i11);
        int i12 = this.f43478c;
        if (c10 != 0) {
            String str = this.f43479f;
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
        return Objects.hash(m1.j.a(this.f43476a), this.f43477b, Integer.valueOf(this.f43478c), this.d, this.e, this.f43479f);
    }
}

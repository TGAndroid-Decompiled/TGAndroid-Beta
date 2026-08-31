package sf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.ui.Components.hj0;
public final class a {
    public static final a f47299g = new a(a());
    public final int f47300a;
    public final String f47301b;
    public final int f47302c;
    public final String d;
    public final String f47303e;
    public final String f47304f;

    public a(hj0 hj0Var) {
        int i10 = hj0Var.f27500a;
        this.f47300a = i10;
        this.f47301b = hj0Var.f27501b;
        if (i10 == 3) {
            this.f47304f = (String) hj0Var.f27504f;
            this.f47302c = 0;
            this.d = "";
            this.f47303e = "";
        } else if (i10 == 2) {
            this.f47304f = (String) hj0Var.f27504f;
            this.f47302c = hj0Var.f27502c;
            this.d = "";
            this.f47303e = "";
        } else if (i10 == 1) {
            this.f47304f = "";
            this.f47302c = hj0Var.f27502c;
            this.d = hj0Var.d;
            this.f47303e = (String) hj0Var.f27503e;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static hj0 a() {
        ?? obj = new Object();
        obj.f27500a = 1;
        obj.f27501b = "";
        obj.d = "";
        obj.f27503e = "";
        obj.f27504f = "";
        return obj;
    }

    public static a b(SharedPreferences sharedPreferences) {
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
        hj0 a2 = a();
        if (string == null) {
            string = "";
        }
        a2.f27501b = string;
        if (string2 == null) {
            string2 = "";
        }
        a2.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a2.f27503e = string3;
        if (string4 != null) {
            str = string4;
        }
        a2.f27504f = str;
        a2.f27502c = i11;
        if (d != 0) {
            i13 = d;
        }
        a2.f27500a = i13;
        return new a(a2);
    }

    public static sf.a c(android.net.Uri r6) {
        throw new UnsupportedOperationException("Method not decompiled: sf.a.c(android.net.Uri):sf.a");
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
        if (!TextUtils.isEmpty(this.f47301b)) {
            if (this.f47300a != 3 && this.f47302c <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f47302c == aVar.f47302c && this.f47300a == aVar.f47300a && Objects.equals(this.f47301b, aVar.f47301b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f47303e, aVar.f47303e) && Objects.equals(this.f47304f, aVar.f47304f)) {
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
        int i11 = this.f47300a;
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
        editor.putString("proxy_ip", this.f47301b);
        int c10 = m1.j.c(i11);
        int i12 = this.f47302c;
        if (c10 != 0) {
            String str = this.f47304f;
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
        String str2 = this.f47303e;
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
        return Objects.hash(m1.j.a(this.f47300a), this.f47301b, Integer.valueOf(this.f47302c), this.d, this.f47303e, this.f47304f);
    }
}

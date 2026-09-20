package v7;

import java.util.Arrays;
import java.util.HashMap;
public class s1 implements ja.a {
    public final int f44382a;
    public Object f44383b;
    public Object f44384c;
    public Object d;

    public s1(int i10, boolean z10) {
        this.f44382a = i10;
    }

    @Override
    public ja.a m(Class cls, ia.d dVar) {
        switch (this.f44382a) {
            case 4:
                ((HashMap) this.f44383b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
            case 5:
            default:
                ((HashMap) this.f44383b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
            case 6:
                ((HashMap) this.f44383b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
        }
    }

    public String toString() {
        String str = "";
        switch (this.f44382a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f44383b);
                sb2.append('{');
                s1 s1Var = (s1) ((s1) this.f44384c).f44384c;
                while (s1Var != null) {
                    Object obj = s1Var.d;
                    sb2.append(str);
                    String str2 = (String) s1Var.f44383b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    s1Var = (s1) s1Var.f44384c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f44383b);
                sb3.append('{');
                s1 s1Var2 = (s1) ((s1) this.d).f44384c;
                while (s1Var2 != null) {
                    Object obj2 = s1Var2.d;
                    sb3.append(str);
                    String str3 = (String) s1Var2.f44383b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    s1Var2 = (s1) s1Var2.f44384c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public s1(int i10) {
        this.f44382a = i10;
        switch (i10) {
            case 6:
                this.f44383b = new HashMap();
                this.d = new HashMap();
                this.f44384c = x7.d0.f45675c;
                return;
            case 12:
                this.f44383b = new HashMap();
                this.d = new HashMap();
                this.f44384c = z7.x.f48983c;
                return;
            default:
                this.f44383b = new HashMap();
                this.d = new HashMap();
                this.f44384c = w7.e.f44931c;
                return;
        }
    }

    public s1(String str, int i10) {
        this.f44382a = i10;
        switch (i10) {
            case 11:
                s1 s1Var = new s1(10, false);
                this.d = s1Var;
                this.f44384c = s1Var;
                this.f44383b = str;
                return;
            default:
                s1 s1Var2 = new s1(0, false);
                this.f44384c = s1Var2;
                this.d = s1Var2;
                this.f44383b = str;
                return;
        }
    }
}

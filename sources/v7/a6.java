package v7;

import java.util.Arrays;
import java.util.HashMap;
public class a6 implements ja.a {
    public final int f42933a;
    public Object f42934b;
    public Object f42935c;
    public Object d;

    public a6(int i10, boolean z10) {
        this.f42933a = i10;
    }

    @Override
    public ja.a m(Class cls, ia.d dVar) {
        switch (this.f42933a) {
            case 2:
                ((HashMap) this.f42934b).put(cls, dVar);
                ((HashMap) this.f42935c).remove(cls);
                return this;
            case 3:
            default:
                ((HashMap) this.f42934b).put(cls, dVar);
                ((HashMap) this.f42935c).remove(cls);
                return this;
            case 4:
                ((HashMap) this.f42934b).put(cls, dVar);
                ((HashMap) this.f42935c).remove(cls);
                return this;
        }
    }

    public String toString() {
        switch (this.f42933a) {
            case 9:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f42934b);
                sb2.append('{');
                a6 a6Var = (a6) ((a6) this.f42935c).d;
                String str = "";
                while (a6Var != null) {
                    Object obj = a6Var.f42935c;
                    sb2.append(str);
                    String str2 = (String) a6Var.f42934b;
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
                    a6Var = (a6) a6Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public a6(int i10) {
        this.f42933a = i10;
        switch (i10) {
            case 4:
                this.f42934b = new HashMap();
                this.f42935c = new HashMap();
                this.d = x7.d0.f44720c;
                return;
            case 10:
                this.f42934b = new HashMap();
                this.f42935c = new HashMap();
                this.d = z7.x.f47799c;
                return;
            default:
                this.f42934b = new HashMap();
                this.f42935c = new HashMap();
                this.d = w7.e.f43591c;
                return;
        }
    }

    public a6(String str) {
        this.f42933a = 9;
        a6 a6Var = new a6(8, false);
        this.f42935c = a6Var;
        this.d = a6Var;
        this.f42934b = str;
    }
}

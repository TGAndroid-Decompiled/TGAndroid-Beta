package v7;

import java.util.Arrays;
import java.util.HashMap;
public class a6 implements ja.a {
    public final int f47377a;
    public Object f47378b;
    public Object f47379c;
    public Object d;

    public a6(int i10, boolean z10) {
        this.f47377a = i10;
    }

    @Override
    public ja.a j(Class cls, ia.d dVar) {
        switch (this.f47377a) {
            case 2:
                ((HashMap) this.f47378b).put(cls, dVar);
                ((HashMap) this.f47379c).remove(cls);
                return this;
            case 3:
            default:
                ((HashMap) this.f47378b).put(cls, dVar);
                ((HashMap) this.f47379c).remove(cls);
                return this;
            case 4:
                ((HashMap) this.f47378b).put(cls, dVar);
                ((HashMap) this.f47379c).remove(cls);
                return this;
        }
    }

    public String toString() {
        switch (this.f47377a) {
            case 9:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f47378b);
                sb2.append('{');
                a6 a6Var = (a6) ((a6) this.f47379c).d;
                String str = "";
                while (a6Var != null) {
                    Object obj = a6Var.f47379c;
                    sb2.append(str);
                    String str2 = (String) a6Var.f47378b;
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
        this.f47377a = i10;
        switch (i10) {
            case 4:
                this.f47378b = new HashMap();
                this.f47379c = new HashMap();
                this.d = x7.d0.f48947c;
                return;
            case 10:
                this.f47378b = new HashMap();
                this.f47379c = new HashMap();
                this.d = z7.x.f51315c;
                return;
            default:
                this.f47378b = new HashMap();
                this.f47379c = new HashMap();
                this.d = w7.e.f48078c;
                return;
        }
    }

    public a6(String str) {
        this.f47377a = 9;
        a6 a6Var = new a6(8, false);
        this.f47379c = a6Var;
        this.d = a6Var;
        this.f47378b = str;
    }
}

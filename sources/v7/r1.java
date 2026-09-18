package v7;

import java.util.Arrays;
import java.util.HashMap;
public class r1 implements ja.a {
    public final int f44105a;
    public Object f44106b;
    public Object f44107c;
    public Object d;

    public r1(int i10, boolean z10) {
        this.f44105a = i10;
    }

    @Override
    public ja.a m(Class cls, ia.d dVar) {
        switch (this.f44105a) {
            case 4:
                ((HashMap) this.f44106b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
            case 5:
            default:
                ((HashMap) this.f44106b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
            case 6:
                ((HashMap) this.f44106b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
        }
    }

    public String toString() {
        String str = "";
        switch (this.f44105a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f44106b);
                sb2.append('{');
                r1 r1Var = (r1) ((r1) this.f44107c).f44107c;
                while (r1Var != null) {
                    Object obj = r1Var.d;
                    sb2.append(str);
                    String str2 = (String) r1Var.f44106b;
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
                    r1Var = (r1) r1Var.f44107c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f44106b);
                sb3.append('{');
                r1 r1Var2 = (r1) ((r1) this.d).f44107c;
                while (r1Var2 != null) {
                    Object obj2 = r1Var2.d;
                    sb3.append(str);
                    String str3 = (String) r1Var2.f44106b;
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
                    r1Var2 = (r1) r1Var2.f44107c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public r1(int i10) {
        this.f44105a = i10;
        switch (i10) {
            case 6:
                this.f44106b = new HashMap();
                this.d = new HashMap();
                this.f44107c = x7.d0.f45408c;
                return;
            case 12:
                this.f44106b = new HashMap();
                this.d = new HashMap();
                this.f44107c = z7.x.f48711c;
                return;
            default:
                this.f44106b = new HashMap();
                this.d = new HashMap();
                this.f44107c = w7.e.f44658c;
                return;
        }
    }

    public r1(String str, int i10) {
        this.f44105a = i10;
        switch (i10) {
            case 11:
                r1 r1Var = new r1(10, false);
                this.d = r1Var;
                this.f44107c = r1Var;
                this.f44106b = str;
                return;
            default:
                r1 r1Var2 = new r1(0, false);
                this.f44107c = r1Var2;
                this.d = r1Var2;
                this.f44106b = str;
                return;
        }
    }
}

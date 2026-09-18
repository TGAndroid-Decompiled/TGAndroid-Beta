package v7;

import java.util.Arrays;
import java.util.HashMap;
public class r1 implements ja.a {
    public final int f44331a;
    public Object f44332b;
    public Object f44333c;
    public Object d;

    public r1(int i10, boolean z10) {
        this.f44331a = i10;
    }

    @Override
    public ja.a m(Class cls, ia.d dVar) {
        switch (this.f44331a) {
            case 4:
                ((HashMap) this.f44332b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
            case 5:
            default:
                ((HashMap) this.f44332b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
            case 6:
                ((HashMap) this.f44332b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
        }
    }

    public String toString() {
        String str = "";
        switch (this.f44331a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f44332b);
                sb2.append('{');
                r1 r1Var = (r1) ((r1) this.f44333c).f44333c;
                while (r1Var != null) {
                    Object obj = r1Var.d;
                    sb2.append(str);
                    String str2 = (String) r1Var.f44332b;
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
                    r1Var = (r1) r1Var.f44333c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f44332b);
                sb3.append('{');
                r1 r1Var2 = (r1) ((r1) this.d).f44333c;
                while (r1Var2 != null) {
                    Object obj2 = r1Var2.d;
                    sb3.append(str);
                    String str3 = (String) r1Var2.f44332b;
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
                    r1Var2 = (r1) r1Var2.f44333c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public r1(int i10) {
        this.f44331a = i10;
        switch (i10) {
            case 6:
                this.f44332b = new HashMap();
                this.d = new HashMap();
                this.f44333c = x7.d0.f45631c;
                return;
            case 12:
                this.f44332b = new HashMap();
                this.d = new HashMap();
                this.f44333c = z7.x.f48937c;
                return;
            default:
                this.f44332b = new HashMap();
                this.d = new HashMap();
                this.f44333c = w7.e.f44887c;
                return;
        }
    }

    public r1(String str, int i10) {
        this.f44331a = i10;
        switch (i10) {
            case 11:
                r1 r1Var = new r1(10, false);
                this.d = r1Var;
                this.f44333c = r1Var;
                this.f44332b = str;
                return;
            default:
                r1 r1Var2 = new r1(0, false);
                this.f44333c = r1Var2;
                this.d = r1Var2;
                this.f44332b = str;
                return;
        }
    }
}

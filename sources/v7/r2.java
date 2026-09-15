package v7;

import java.util.Arrays;
import java.util.HashMap;
public class r2 implements ja.a {
    public final int f44078a;
    public Object f44079b;
    public Object f44080c;
    public Object d;

    public r2(int i10, boolean z10) {
        this.f44078a = i10;
    }

    @Override
    public ja.a m(Class cls, ia.d dVar) {
        switch (this.f44078a) {
            case 3:
                ((HashMap) this.f44079b).put(cls, dVar);
                ((HashMap) this.f44080c).remove(cls);
                return this;
            case 4:
            default:
                ((HashMap) this.f44079b).put(cls, dVar);
                ((HashMap) this.f44080c).remove(cls);
                return this;
            case 5:
                ((HashMap) this.f44079b).put(cls, dVar);
                ((HashMap) this.f44080c).remove(cls);
                return this;
        }
    }

    public String toString() {
        String str = "";
        switch (this.f44078a) {
            case 0:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f44079b);
                sb2.append('{');
                m.e3 e3Var = (m.e3) ((m.e3) this.f44080c).d;
                while (e3Var != null) {
                    Object obj = e3Var.f14166c;
                    sb2.append(str);
                    String str2 = (String) e3Var.f14165b;
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
                    e3Var = (m.e3) e3Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 10:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f44079b);
                sb3.append('{');
                r2 r2Var = (r2) ((r2) this.f44080c).d;
                while (r2Var != null) {
                    Object obj2 = r2Var.f44080c;
                    sb3.append(str);
                    String str3 = (String) r2Var.f44079b;
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
                    r2Var = (r2) r2Var.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public r2(int i10) {
        this.f44078a = i10;
        switch (i10) {
            case 5:
                this.f44079b = new HashMap();
                this.f44080c = new HashMap();
                this.d = x7.d0.f45380c;
                return;
            case 11:
                this.f44079b = new HashMap();
                this.f44080c = new HashMap();
                this.d = z7.x.f48683c;
                return;
            default:
                this.f44079b = new HashMap();
                this.f44080c = new HashMap();
                this.d = w7.e.f44630c;
                return;
        }
    }

    public r2(String str, int i10) {
        this.f44078a = i10;
        switch (i10) {
            case 10:
                r2 r2Var = new r2(9, false);
                this.f44080c = r2Var;
                this.d = r2Var;
                this.f44079b = str;
                return;
            default:
                m.e3 e3Var = new m.e3(29, false);
                this.f44080c = e3Var;
                this.d = e3Var;
                this.f44079b = str;
                return;
        }
    }
}

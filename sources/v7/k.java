package v7;

import java.util.Arrays;
import java.util.HashMap;
public class k implements ja.a {
    public final int f49366a;
    public Object f49367b;
    public Object f49368c;
    public Object d;

    public k(int i10, boolean z10) {
        this.f49366a = i10;
    }

    @Override
    public ja.a a(Class cls, ia.d dVar) {
        switch (this.f49366a) {
            case 0:
                ((HashMap) this.f49367b).put(cls, dVar);
                ((HashMap) this.f49368c).remove(cls);
                return this;
            case 6:
                ((HashMap) this.f49367b).put(cls, dVar);
                ((HashMap) this.f49368c).remove(cls);
                return this;
            case 8:
                ((HashMap) this.f49367b).put(cls, dVar);
                ((HashMap) this.f49368c).remove(cls);
                return this;
            default:
                ((HashMap) this.f49367b).put(cls, dVar);
                ((HashMap) this.f49368c).remove(cls);
                return this;
        }
    }

    public String toString() {
        String str = "";
        switch (this.f49366a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f49367b);
                sb2.append('{');
                k kVar = (k) ((k) this.f49368c).d;
                while (kVar != null) {
                    Object obj = kVar.f49368c;
                    sb2.append(str);
                    String str2 = (String) kVar.f49367b;
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
                    kVar = (k) kVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 13:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f49367b);
                sb3.append('{');
                k kVar2 = (k) ((k) this.f49368c).d;
                while (kVar2 != null) {
                    Object obj2 = kVar2.f49368c;
                    sb3.append(str);
                    String str3 = (String) kVar2.f49367b;
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
                    kVar2 = (k) kVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public k(int i10) {
        this.f49366a = i10;
        switch (i10) {
            case 6:
                this.f49367b = new HashMap();
                this.f49368c = new HashMap();
                this.d = w7.e.f50048c;
                return;
            case 8:
                this.f49367b = new HashMap();
                this.f49368c = new HashMap();
                this.d = x7.d0.f50842c;
                return;
            case 14:
                this.f49367b = new HashMap();
                this.f49368c = new HashMap();
                this.d = z7.x.f54228c;
                return;
            default:
                this.f49367b = new HashMap();
                this.f49368c = new HashMap();
                this.d = i.f49334c;
                return;
        }
    }

    public k(String str, int i10) {
        this.f49366a = i10;
        switch (i10) {
            case 13:
                k kVar = new k(12, false);
                this.f49368c = kVar;
                this.d = kVar;
                this.f49367b = str;
                return;
            default:
                k kVar2 = new k(1, false);
                this.f49368c = kVar2;
                this.d = kVar2;
                this.f49367b = str;
                return;
        }
    }

    public k(String str, Boolean bool, vc.a aVar, String str2) {
        this.f49366a = 5;
        this.f49367b = str;
        this.f49368c = str2;
        this.d = aVar;
    }
}

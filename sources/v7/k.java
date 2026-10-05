package v7;

import java.util.Arrays;
import java.util.HashMap;
public class k implements ja.a {
    public final int f47992a;
    public Object f47993b;
    public Object f47994c;
    public Object d;

    public k(int i10, boolean z10) {
        this.f47992a = i10;
    }

    @Override
    public ja.a a(Class cls, ia.d dVar) {
        switch (this.f47992a) {
            case 0:
                ((HashMap) this.f47993b).put(cls, dVar);
                ((HashMap) this.f47994c).remove(cls);
                return this;
            case 5:
                ((HashMap) this.f47993b).put(cls, dVar);
                ((HashMap) this.f47994c).remove(cls);
                return this;
            case 7:
                ((HashMap) this.f47993b).put(cls, dVar);
                ((HashMap) this.f47994c).remove(cls);
                return this;
            default:
                ((HashMap) this.f47993b).put(cls, dVar);
                ((HashMap) this.f47994c).remove(cls);
                return this;
        }
    }

    public String toString() {
        String str = "";
        switch (this.f47992a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f47993b);
                sb2.append('{');
                k kVar = (k) ((k) this.f47994c).d;
                while (kVar != null) {
                    Object obj = kVar.f47994c;
                    sb2.append(str);
                    String str2 = (String) kVar.f47993b;
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
            case 12:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f47993b);
                sb3.append('{');
                k kVar2 = (k) ((k) this.f47994c).d;
                while (kVar2 != null) {
                    Object obj2 = kVar2.f47994c;
                    sb3.append(str);
                    String str3 = (String) kVar2.f47993b;
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
        this.f47992a = i10;
        switch (i10) {
            case 5:
                this.f47993b = new HashMap();
                this.f47994c = new HashMap();
                this.d = w7.e.f48642c;
                return;
            case 7:
                this.f47993b = new HashMap();
                this.f47994c = new HashMap();
                this.d = x7.d0.f49444c;
                return;
            case 13:
                this.f47993b = new HashMap();
                this.f47994c = new HashMap();
                this.d = z7.x.f53014c;
                return;
            default:
                this.f47993b = new HashMap();
                this.f47994c = new HashMap();
                this.d = i.f47963c;
                return;
        }
    }

    public k(String str, int i10) {
        this.f47992a = i10;
        switch (i10) {
            case 12:
                k kVar = new k(11, false);
                this.f47994c = kVar;
                this.d = kVar;
                this.f47993b = str;
                return;
            default:
                k kVar2 = new k(1, false);
                this.f47994c = kVar2;
                this.d = kVar2;
                this.f47993b = str;
                return;
        }
    }
}

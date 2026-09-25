package v7;

import java.util.Arrays;
import java.util.HashMap;
public class l implements ja.a {
    public final int f44313a;
    public Object f44314b;
    public Object f44315c;
    public Object d;

    public l(int i10, boolean z10) {
        this.f44313a = i10;
    }

    @Override
    public ja.a a(Class cls, ia.d dVar) {
        switch (this.f44313a) {
            case 0:
                ((HashMap) this.f44314b).put(cls, dVar);
                ((HashMap) this.f44315c).remove(cls);
                return this;
            case 5:
                ((HashMap) this.f44314b).put(cls, dVar);
                ((HashMap) this.f44315c).remove(cls);
                return this;
            case 7:
                ((HashMap) this.f44314b).put(cls, dVar);
                ((HashMap) this.f44315c).remove(cls);
                return this;
            default:
                ((HashMap) this.f44314b).put(cls, dVar);
                ((HashMap) this.f44315c).remove(cls);
                return this;
        }
    }

    public String toString() {
        String str = "";
        switch (this.f44313a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f44314b);
                sb2.append('{');
                l lVar = (l) ((l) this.f44315c).d;
                while (lVar != null) {
                    Object obj = lVar.f44315c;
                    sb2.append(str);
                    String str2 = (String) lVar.f44314b;
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
                    lVar = (l) lVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f44314b);
                sb3.append('{');
                l lVar2 = (l) ((l) this.f44315c).d;
                while (lVar2 != null) {
                    Object obj2 = lVar2.f44315c;
                    sb3.append(str);
                    String str3 = (String) lVar2.f44314b;
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
                    lVar2 = (l) lVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public l(int i10) {
        this.f44313a = i10;
        switch (i10) {
            case 5:
                this.f44314b = new HashMap();
                this.f44315c = new HashMap();
                this.d = w7.e.f44915c;
                return;
            case 7:
                this.f44314b = new HashMap();
                this.f44315c = new HashMap();
                this.d = x7.d0.f45659c;
                return;
            case 13:
                this.f44314b = new HashMap();
                this.f44315c = new HashMap();
                this.d = z7.x.f48955c;
                return;
            default:
                this.f44314b = new HashMap();
                this.f44315c = new HashMap();
                this.d = i.f44279c;
                return;
        }
    }

    public l(String str, int i10) {
        this.f44313a = i10;
        switch (i10) {
            case 12:
                l lVar = new l(11, false);
                this.f44315c = lVar;
                this.d = lVar;
                this.f44314b = str;
                return;
            default:
                l lVar2 = new l(1, false);
                this.f44315c = lVar2;
                this.d = lVar2;
                this.f44314b = str;
                return;
        }
    }
}

package u2;

import java.util.Arrays;
import java.util.HashMap;
public class c implements ka.a {
    public final int f47271a;
    public Object f47272b;
    public Object f47273c;
    public Object d;

    public c(int i10, boolean z10) {
        this.f47271a = i10;
    }

    @Override
    public ka.a a(Class cls, ja.d dVar) {
        switch (this.f47271a) {
            case 1:
                ((HashMap) this.f47272b).put(cls, dVar);
                ((HashMap) this.f47273c).remove(cls);
                return this;
            case 6:
                ((HashMap) this.f47272b).put(cls, dVar);
                ((HashMap) this.f47273c).remove(cls);
                return this;
            case 9:
                ((HashMap) this.f47272b).put(cls, dVar);
                ((HashMap) this.f47273c).remove(cls);
                return this;
            default:
                ((HashMap) this.f47272b).put(cls, dVar);
                ((HashMap) this.f47273c).remove(cls);
                return this;
        }
    }

    public long b() {
        c3.l lVar = (c3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public void c(g2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, u2.x0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.c(g2.h, android.net.Uri, java.util.Map, long, long, u2.x0):void");
    }

    public String toString() {
        String str = "";
        switch (this.f47271a) {
            case 3:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f47272b);
                sb2.append('{');
                c cVar = (c) ((c) this.f47273c).d;
                while (cVar != null) {
                    Object obj = cVar.f47273c;
                    sb2.append(str);
                    String str2 = (String) cVar.f47272b;
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
                    cVar = (c) cVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 14:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f47272b);
                sb3.append('{');
                c cVar2 = (c) ((c) this.f47273c).d;
                while (cVar2 != null) {
                    Object obj2 = cVar2.f47273c;
                    sb3.append(str);
                    String str3 = (String) cVar2.f47272b;
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
                    cVar2 = (c) cVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public c(int i10) {
        this.f47271a = i10;
        switch (i10) {
            case 6:
                this.f47272b = new HashMap();
                this.f47273c = new HashMap();
                this.d = w7.e.f48632c;
                return;
            case 9:
                this.f47272b = new HashMap();
                this.f47273c = new HashMap();
                this.d = x7.d0.f49345c;
                return;
            case 15:
                this.f47272b = new HashMap();
                this.f47273c = new HashMap();
                this.d = z7.x.f51233c;
                return;
            default:
                this.f47272b = new HashMap();
                this.f47273c = new HashMap();
                this.d = v7.i.f48053c;
                return;
        }
    }

    public c(String str, int i10) {
        this.f47271a = i10;
        switch (i10) {
            case 14:
                c cVar = new c(13, false);
                this.f47273c = cVar;
                this.d = cVar;
                this.f47272b = str;
                return;
            default:
                c cVar2 = new c(2, false);
                this.f47273c = cVar2;
                this.d = cVar2;
                this.f47272b = str;
                return;
        }
    }

    public c(String str, Boolean bool, wc.a aVar, String str2) {
        this.f47271a = 8;
        this.f47272b = str;
        this.f47273c = str2;
        this.d = aVar;
    }

    public c(c3.r rVar) {
        this.f47271a = 0;
        this.f47272b = rVar;
    }
}

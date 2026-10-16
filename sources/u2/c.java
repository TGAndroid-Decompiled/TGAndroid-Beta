package u2;

import java.util.Arrays;
import java.util.HashMap;
public class c implements ka.a {
    public final int f45874a;
    public Object f45875b;
    public Object f45876c;
    public Object d;

    public c(int i10, boolean z10) {
        this.f45874a = i10;
    }

    @Override
    public ka.a a(Class cls, ja.d dVar) {
        switch (this.f45874a) {
            case 1:
                ((HashMap) this.f45875b).put(cls, dVar);
                ((HashMap) this.f45876c).remove(cls);
                return this;
            case 6:
                ((HashMap) this.f45875b).put(cls, dVar);
                ((HashMap) this.f45876c).remove(cls);
                return this;
            case 9:
                ((HashMap) this.f45875b).put(cls, dVar);
                ((HashMap) this.f45876c).remove(cls);
                return this;
            default:
                ((HashMap) this.f45875b).put(cls, dVar);
                ((HashMap) this.f45876c).remove(cls);
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

    public void c(g2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, u2.w0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.c(g2.h, android.net.Uri, java.util.Map, long, long, u2.w0):void");
    }

    public String toString() {
        String str = "";
        switch (this.f45874a) {
            case 3:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f45875b);
                sb2.append('{');
                c cVar = (c) ((c) this.f45876c).d;
                while (cVar != null) {
                    Object obj = cVar.f45876c;
                    sb2.append(str);
                    String str2 = (String) cVar.f45875b;
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
                sb3.append((String) this.f45875b);
                sb3.append('{');
                c cVar2 = (c) ((c) this.f45876c).d;
                while (cVar2 != null) {
                    Object obj2 = cVar2.f45876c;
                    sb3.append(str);
                    String str3 = (String) cVar2.f45875b;
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
        this.f45874a = i10;
        switch (i10) {
            case 6:
                this.f45875b = new HashMap();
                this.f45876c = new HashMap();
                this.d = w7.e.f47237c;
                return;
            case 9:
                this.f45875b = new HashMap();
                this.f45876c = new HashMap();
                this.d = x7.d0.f47949c;
                return;
            case 15:
                this.f45875b = new HashMap();
                this.f45876c = new HashMap();
                this.d = z7.x.f49855c;
                return;
            default:
                this.f45875b = new HashMap();
                this.f45876c = new HashMap();
                this.d = v7.i.f46658c;
                return;
        }
    }

    public c(String str, int i10) {
        this.f45874a = i10;
        switch (i10) {
            case 14:
                c cVar = new c(13, false);
                this.f45876c = cVar;
                this.d = cVar;
                this.f45875b = str;
                return;
            default:
                c cVar2 = new c(2, false);
                this.f45876c = cVar2;
                this.d = cVar2;
                this.f45875b = str;
                return;
        }
    }

    public c(String str, Boolean bool, wc.a aVar, String str2) {
        this.f45874a = 8;
        this.f45875b = str;
        this.f45876c = str2;
        this.d = aVar;
    }

    public c(c3.r rVar) {
        this.f45874a = 0;
        this.f45875b = rVar;
    }
}

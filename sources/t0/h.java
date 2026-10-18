package t0;

import android.content.ClipDescription;
import android.net.Uri;
import c3.l;
import c3.r;
import java.util.Arrays;
import java.util.HashMap;
import x7.d0;
import z7.x;
public class h implements i, ka.a {
    public final int f46910a;
    public Object f46911b;
    public Object f46912c;
    public Object d;

    public h(int i10, boolean z10) {
        this.f46910a = i10;
    }

    @Override
    public Uri a() {
        return (Uri) this.f46911b;
    }

    @Override
    public Uri c() {
        return (Uri) this.f46912c;
    }

    @Override
    public ka.a d(Class cls, ja.d dVar) {
        switch (this.f46910a) {
            case 2:
                ((HashMap) this.f46911b).put(cls, dVar);
                ((HashMap) this.f46912c).remove(cls);
                return this;
            case 7:
                ((HashMap) this.f46911b).put(cls, dVar);
                ((HashMap) this.f46912c).remove(cls);
                return this;
            case 10:
                ((HashMap) this.f46911b).put(cls, dVar);
                ((HashMap) this.f46912c).remove(cls);
                return this;
            default:
                ((HashMap) this.f46911b).put(cls, dVar);
                ((HashMap) this.f46912c).remove(cls);
                return this;
        }
    }

    @Override
    public Object e() {
        return null;
    }

    public long g() {
        l lVar = (l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.d;
    }

    public void h(g2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, u2.v0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: t0.h.h(g2.h, android.net.Uri, java.util.Map, long, long, u2.v0):void");
    }

    public String toString() {
        String str = "";
        switch (this.f46910a) {
            case 4:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f46911b);
                sb2.append('{');
                h hVar = (h) ((h) this.f46912c).d;
                while (hVar != null) {
                    Object obj = hVar.f46912c;
                    sb2.append(str);
                    String str2 = (String) hVar.f46911b;
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
                    hVar = (h) hVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 15:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f46911b);
                sb3.append('{');
                h hVar2 = (h) ((h) this.f46912c).d;
                while (hVar2 != null) {
                    Object obj2 = hVar2.f46912c;
                    sb3.append(str);
                    String str3 = (String) hVar2.f46911b;
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
                    hVar2 = (h) hVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public h(int i10) {
        this.f46910a = i10;
        switch (i10) {
            case 7:
                this.f46911b = new HashMap();
                this.f46912c = new HashMap();
                this.d = w7.e.f48667c;
                return;
            case 10:
                this.f46911b = new HashMap();
                this.f46912c = new HashMap();
                this.d = d0.f49383c;
                return;
            case 16:
                this.f46911b = new HashMap();
                this.f46912c = new HashMap();
                this.d = x.f51270c;
                return;
            default:
                this.f46911b = new HashMap();
                this.f46912c = new HashMap();
                this.d = v7.i.f48090c;
                return;
        }
    }

    public h(String str, int i10) {
        this.f46910a = i10;
        switch (i10) {
            case 15:
                h hVar = new h(14, false);
                this.f46912c = hVar;
                this.d = hVar;
                this.f46911b = str;
                return;
            default:
                h hVar2 = new h(3, false);
                this.f46912c = hVar2;
                this.d = hVar2;
                this.f46911b = str;
                return;
        }
    }

    public h(String str, Boolean bool, wc.a aVar, String str2) {
        this.f46910a = 9;
        this.f46911b = str;
        this.f46912c = str2;
        this.d = aVar;
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f46910a = 0;
        this.f46911b = uri;
        this.d = clipDescription;
        this.f46912c = uri2;
    }

    public h(r rVar) {
        this.f46910a = 1;
        this.f46911b = rVar;
    }

    @Override
    public void b() {
    }

    @Override
    public void f() {
    }
}

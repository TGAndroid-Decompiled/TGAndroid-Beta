package qi;

import ai.z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p4.r0;
import p4.z;
public final class p implements AutoCloseable {
    public final r0 f56245b;
    public final r0 f56246c;
    public long f56250r;
    public boolean f56251s;
    public a f56252w;
    public Throwable f56253x;
    public volatile Set f56254y;
    public final Object f56244a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f56249n = new HashMap();
    public final int f56247e = 256;
    public final long f56248f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new z0(8));

    public p(r0 r0Var, r0 r0Var2) {
        this.f56245b = r0Var;
        this.f56246c = r0Var2;
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case 3104:
                if (lowerCase.equals("c#")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3261:
                if (lowerCase.equals("fc")) {
                    c10 = 1;
                    break;
                }
                break;
            case 96515:
                if (lowerCase.equals("c++")) {
                    c10 = 2;
                    break;
                }
                break;
            case 101379:
                if (lowerCase.equals("fif")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3561037:
                if (lowerCase.equals("tl-b")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "csharp";
            case 1:
                return "func";
            case 2:
                return "cpp";
            case 3:
                return "fift";
            case 4:
                return "tlb";
            default:
                return lowerCase;
        }
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: qi.p.a():boolean");
    }

    public final void c(n nVar, ji.l lVar) {
        l lVar2 = new l(nVar, lVar);
        int i7 = this.f56247e;
        if (i7 != 0) {
            long j3 = lVar2.f56239b;
            long j10 = this.f56248f;
            if (j3 <= j10) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(nVar, lVar2);
                this.f56250r += j3;
                while (true) {
                    if (linkedHashMap.size() > i7 || this.f56250r > j10) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f56250r -= ((l) entry.getValue()).f56239b;
                        linkedHashMap.remove(entry.getKey());
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void close() {
        synchronized (this.f56244a) {
            try {
                if (this.f56251s) {
                    return;
                }
                this.f56251s = true;
                for (ArrayList arrayList : this.f56249n.values()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((o) obj).f56243a = null;
                    }
                }
                this.f56249n.clear();
                this.h.clear();
                this.f56250r = 0L;
                this.d.execute(new k(this, 0));
                this.d.shutdown();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final o d(String str, String str2, m mVar) {
        if (str != null) {
            n nVar = new n(str, b(str2));
            ?? obj = new Object();
            obj.f56243a = mVar;
            synchronized (this.f56244a) {
                try {
                    if (!this.f56251s) {
                        ArrayList arrayList = (ArrayList) this.f56249n.get(nVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f56249n.put(nVar, arrayList2);
                        this.d.execute(new z(6, this, nVar));
                        return obj;
                    }
                    throw new IllegalStateException("Service is closed");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw null;
    }
}

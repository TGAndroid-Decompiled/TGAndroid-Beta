package qi;

import ai.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.ui.web.t1;
import p4.r0;
public final class p implements AutoCloseable {
    public final r0 f56323b;
    public final r0 f56324c;
    public long f56328r;
    public boolean f56329s;
    public a f56330w;
    public Throwable f56331x;
    public volatile Set f56332y;
    public final Object f56322a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f56327n = new HashMap();
    public final int f56325e = 256;
    public final long f56326f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new v0(8));

    public p(r0 r0Var, r0 r0Var2) {
        this.f56323b = r0Var;
        this.f56324c = r0Var2;
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

    public final void c(n nVar, j6.k kVar) {
        l lVar = new l(nVar, kVar);
        int i7 = this.f56325e;
        if (i7 != 0) {
            long j3 = lVar.f56317b;
            long j10 = this.f56326f;
            if (j3 <= j10) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(nVar, lVar);
                this.f56328r += j3;
                while (true) {
                    if (linkedHashMap.size() > i7 || this.f56328r > j10) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f56328r -= ((l) entry.getValue()).f56317b;
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
        synchronized (this.f56322a) {
            try {
                if (this.f56329s) {
                    return;
                }
                this.f56329s = true;
                for (ArrayList arrayList : this.f56327n.values()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((o) obj).f56321a = null;
                    }
                }
                this.f56327n.clear();
                this.h.clear();
                this.f56328r = 0L;
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
            obj.f56321a = mVar;
            synchronized (this.f56322a) {
                try {
                    if (!this.f56329s) {
                        ArrayList arrayList = (ArrayList) this.f56327n.get(nVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f56327n.put(nVar, arrayList2);
                        this.d.execute(new t1(10, this, nVar));
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

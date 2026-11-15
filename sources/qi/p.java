package qi;

import ai.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.ui.web.e1;
import p4.q0;
public final class p implements AutoCloseable {
    public final q0 f55626b;
    public final q0 f55627c;
    public long f55631r;
    public boolean f55632s;
    public a f55633w;
    public Throwable f55634x;
    public volatile Set f55635y;
    public final Object f55625a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap f55630n = new HashMap();
    public final int f55628e = 256;
    public final long f55629f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new x0(8));

    public p(q0 q0Var, q0 q0Var2) {
        this.f55626b = q0Var;
        this.f55627c = q0Var2;
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

    public final void c(n nVar, ji.j jVar) {
        l lVar = new l(nVar, jVar);
        int i7 = this.f55628e;
        if (i7 != 0) {
            long j3 = lVar.f55620b;
            long j10 = this.f55629f;
            if (j3 <= j10) {
                LinkedHashMap linkedHashMap = this.h;
                linkedHashMap.put(nVar, lVar);
                this.f55631r += j3;
                while (true) {
                    if (linkedHashMap.size() > i7 || this.f55631r > j10) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        this.f55631r -= ((l) entry.getValue()).f55620b;
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
        synchronized (this.f55625a) {
            try {
                if (this.f55632s) {
                    return;
                }
                this.f55632s = true;
                for (ArrayList arrayList : this.f55630n.values()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((o) obj).f55624a = null;
                    }
                }
                this.f55630n.clear();
                this.h.clear();
                this.f55631r = 0L;
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
            obj.f55624a = mVar;
            synchronized (this.f55625a) {
                try {
                    if (!this.f55632s) {
                        ArrayList arrayList = (ArrayList) this.f55630n.get(nVar);
                        if (arrayList != null) {
                            arrayList.add(obj);
                            return obj;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(obj);
                        this.f55630n.put(nVar, arrayList2);
                        this.d.execute(new e1(12, this, nVar));
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

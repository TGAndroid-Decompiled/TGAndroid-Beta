package y4;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import c8.he;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
public final class a {
    public static volatile a d;
    public static final Object f58973e = new Object();
    public final Context f58976c;
    public final HashSet f58975b = new HashSet();
    public final HashMap f58974a = new HashMap();

    public a(Context context) {
        this.f58976c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (d == null) {
            synchronized (f58973e) {
                try {
                    if (d == null) {
                        d = new a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f58976c.getString(2131689503);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f58975b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f58974a;
        if (he.b()) {
            try {
                he.a(cls.getSimpleName());
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a10 = bVar.a();
                if (!a10.isEmpty()) {
                    for (Class cls2 : a10) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f58976c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}

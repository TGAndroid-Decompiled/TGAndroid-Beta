package q1;

import hd.r;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import org.telegram.ui.Components.qf;
public final class b {
    public final LinkedHashMap f55748a;
    public final qf f55749b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f55748a = linkedHashMap;
        this.f55749b = new qf(z10);
    }

    public final Map a() {
        gd.e eVar;
        Set<Map.Entry> entrySet = this.f55748a.entrySet();
        int b10 = r.b(hd.h.d(entrySet, 10));
        if (b10 < 16) {
            b10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                j.d(copyOf, "copyOf(this, size)");
                eVar = new gd.e(key, copyOf);
            } else {
                eVar = new gd.e(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(eVar.f13506a, eVar.f13507b);
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        j.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (!((AtomicBoolean) this.f55749b.f38896b).get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
    }

    public final void c(e key) {
        j.e(key, "key");
        b();
        this.f55748a.remove(key);
    }

    public final void d(e key, Object obj) {
        j.e(key, "key");
        e(key, obj);
    }

    public final void e(e key, Object obj) {
        j.e(key, "key");
        b();
        if (obj == null) {
            c(key);
            return;
        }
        boolean z10 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f55748a;
        if (z10) {
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(hd.f.o((Set) obj));
            j.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            j.d(copyOf, "copyOf(this, size)");
            linkedHashMap.put(key, copyOf);
        } else {
            linkedHashMap.put(key, obj);
        }
    }

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: q1.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        for (Map.Entry entry : this.f55748a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i7 += hashCode;
        }
        return i7;
    }

    public final String toString() {
        return hd.f.g(this.f55748a.entrySet(), ",\n", "{\n", "\n}", a.f55747b, 24);
    }

    public b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}

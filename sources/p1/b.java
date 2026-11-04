package p1;

import ed.i;
import ed.s;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import org.telegram.ui.Components.nh;
public final class b {
    public final LinkedHashMap f53059a;
    public final nh f53060b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f53059a = linkedHashMap;
        this.f53060b = new nh(z10);
    }

    public final Map a() {
        dd.e eVar;
        Set<Map.Entry> entrySet = this.f53059a.entrySet();
        int b10 = s.b(i.d(entrySet, 10));
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
                eVar = new dd.e(key, copyOf);
            } else {
                eVar = new dd.e(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(eVar.f8790a, eVar.f8791b);
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        j.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (!((AtomicBoolean) this.f53060b.f36540b).get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
    }

    public final void c(e key) {
        j.e(key, "key");
        b();
        this.f53059a.remove(key);
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
        LinkedHashMap linkedHashMap = this.f53059a;
        if (z10) {
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(ed.g.o((Set) obj));
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
        throw new UnsupportedOperationException("Method not decompiled: p1.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int i3 = 0;
        for (Map.Entry entry : this.f53059a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i3 += hashCode;
        }
        return i3;
    }

    public final String toString() {
        return ed.g.g(this.f53059a.entrySet(), ",\n", "{\n", "\n}", a.f53058b, 24);
    }

    public b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}

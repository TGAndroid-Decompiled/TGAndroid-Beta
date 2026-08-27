package p8;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class b0 implements Map, Serializable, j$.util.Map {

    public transient n0 f45527a;

    public transient o0 f45528b;

    public transient p0 f45529c;

    public static b0 a(Map map) {
        if ((map instanceof b0) && !(map instanceof SortedMap)) {
            return (b0) map;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z10 = setEntrySet != null;
        b6.a aVar = new b6.a(z10 ? setEntrySet.size() : 4, 21);
        if (z10) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) aVar.f2033b;
            if (size > objArr.length) {
                aVar.f2033b = Arrays.copyOf(objArr, w.d(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            aVar.j(entry.getKey(), entry.getValue());
        }
        return aVar.c();
    }

    @Override
    public final c0 entrySet() {
        n0 n0Var = this.f45527a;
        if (n0Var != null) {
            return n0Var;
        }
        q0 q0Var = (q0) this;
        n0 n0Var2 = new n0(q0Var, q0Var.f45578e, q0Var.f45579f);
        this.f45527a = n0Var2;
        return n0Var2;
    }

    @Override
    public final u values() {
        p0 p0Var = this.f45529c;
        if (p0Var != null) {
            return p0Var;
        }
        q0 q0Var = (q0) this;
        p0 p0Var2 = new p0(1, q0Var.f45579f, q0Var.f45578e);
        this.f45529c = p0Var2;
        return p0Var2;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object compute(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override
    public Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override
    public final boolean equals(Object obj) {
        return l.c(this, obj);
    }

    @Override
    public void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override
    public abstract Object get(Object obj);

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override
    public final int hashCode() {
        return l.h(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        return ((q0) this).size() == 0;
    }

    @Override
    public final Set keySet() {
        o0 o0Var = this.f45528b;
        if (o0Var != null) {
            return o0Var;
        }
        q0 q0Var = (q0) this;
        o0 o0Var2 = new o0(q0Var, new p0(0, q0Var.f45579f, q0Var.f45578e));
        this.f45528b = o0Var2;
        return o0Var2;
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object putIfAbsent(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override
    public Object replace(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int i10 = ((q0) this).f45579f;
        l.a(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
        sb2.append('{');
        x0 it = ((n0) entrySet()).iterator();
        boolean z10 = true;
        while (true) {
            x xVar = (x) it;
            if (!xVar.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) xVar.next();
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
    }

    @Override
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean replace(Object obj, Object obj2, Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}

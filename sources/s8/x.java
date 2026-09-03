package s8;

import j$.util.Map;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public abstract class x implements Map, Serializable, j$.util.Map {
    public transient k0 f47178a;
    public transient l0 f47179b;
    public transient m0 f47180c;

    public static x a(Map map) {
        boolean z4;
        int i10;
        if ((map instanceof x) && !(map instanceof SortedMap)) {
            return (x) map;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i10 = entrySet.size();
        } else {
            i10 = 4;
        }
        b4.e0 e0Var = new b4.e0(i10, 22);
        if (z4) {
            int size = entrySet.size() * 2;
            Object[] objArr = (Object[]) e0Var.f1475c;
            if (size > objArr.length) {
                e0Var.f1475c = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, size));
            }
        }
        for (Map.Entry entry : entrySet) {
            e0Var.x(entry.getKey(), entry.getValue());
        }
        return e0Var.d();
    }

    @Override
    public final z entrySet() {
        k0 k0Var = this.f47178a;
        if (k0Var == null) {
            n0 n0Var = (n0) this;
            k0 k0Var2 = new k0(n0Var, n0Var.f47151e, n0Var.f47152f);
            this.f47178a = k0Var2;
            return k0Var2;
        }
        return k0Var;
    }

    @Override
    public final q values() {
        m0 m0Var = this.f47180c;
        if (m0Var == null) {
            n0 n0Var = (n0) this;
            m0 m0Var2 = new m0(1, n0Var.f47152f, n0Var.f47151e);
            this.f47180c = m0Var2;
            return m0Var2;
        }
        return m0Var;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override
    public Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override
    public final boolean equals(Object obj) {
        return l.d(this, obj);
    }

    @Override
    public void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override
    public abstract Object get(Object obj);

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override
    public final int hashCode() {
        return l.i(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        if (((n0) this).size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        l0 l0Var = this.f47179b;
        if (l0Var == null) {
            n0 n0Var = (n0) this;
            l0 l0Var2 = new l0(n0Var, new m0(0, n0Var.f47152f, n0Var.f47151e));
            this.f47179b = l0Var2;
            return l0Var2;
        }
        return l0Var;
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override
    public Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int i10 = ((n0) this).f47152f;
        l.c(i10, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
        sb.append('{');
        u0 w10 = ((k0) entrySet()).w();
        boolean z4 = true;
        while (true) {
            t tVar = (t) w10;
            if (tVar.hasNext()) {
                Map.Entry entry = (Map.Entry) tVar.next();
                if (!z4) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z4 = false;
            } else {
                sb.append('}');
                return sb.toString();
            }
        }
    }

    @Override
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}

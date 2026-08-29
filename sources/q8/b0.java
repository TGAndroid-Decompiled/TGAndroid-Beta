package q8;

import ag.j2;
import j$.util.Map;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public abstract class b0 implements Map, Serializable, j$.util.Map {
    public transient n0 f46434a;
    public transient o0 f46435b;
    public transient p0 f46436c;

    public static b0 a(Map map) {
        boolean z10;
        int i10;
        if ((map instanceof b0) && !(map instanceof SortedMap)) {
            return (b0) map;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = entrySet.size();
        } else {
            i10 = 4;
        }
        j2 j2Var = new j2(i10, 21);
        if (z10) {
            int size = entrySet.size() * 2;
            Object[] objArr = (Object[]) j2Var.f559c;
            if (size > objArr.length) {
                j2Var.f559c = Arrays.copyOf(objArr, w.d(objArr.length, size));
            }
        }
        for (Map.Entry entry : entrySet) {
            j2Var.l(entry.getKey(), entry.getValue());
        }
        return j2Var.c();
    }

    @Override
    public final c0 entrySet() {
        n0 n0Var = this.f46434a;
        if (n0Var == null) {
            q0 q0Var = (q0) this;
            n0 n0Var2 = new n0(q0Var, q0Var.f46485e, q0Var.f46486f);
            this.f46434a = n0Var2;
            return n0Var2;
        }
        return n0Var;
    }

    @Override
    public final u values() {
        p0 p0Var = this.f46436c;
        if (p0Var == null) {
            q0 q0Var = (q0) this;
            p0 p0Var2 = new p0(1, q0Var.f46486f, q0Var.f46485e);
            this.f46436c = p0Var2;
            return p0Var2;
        }
        return p0Var;
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
        return l.c(this, obj);
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
        return l.h(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        if (((q0) this).size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        o0 o0Var = this.f46435b;
        if (o0Var == null) {
            q0 q0Var = (q0) this;
            o0 o0Var2 = new o0(q0Var, new p0(0, q0Var.f46486f, q0Var.f46485e));
            this.f46435b = o0Var2;
            return o0Var2;
        }
        return o0Var;
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
        int i10 = ((q0) this).f46486f;
        l.a(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
        sb2.append('{');
        x0 w10 = ((n0) entrySet()).w();
        boolean z10 = true;
        while (true) {
            x xVar = (x) w10;
            if (xVar.hasNext()) {
                Map.Entry entry = (Map.Entry) xVar.next();
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z10 = false;
            } else {
                sb2.append('}');
                return sb2.toString();
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

package tc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
public final class d implements Collection {
    public final Object[] f48058a;
    public final boolean f48059b;

    public d(Object[] values, boolean z4) {
        kotlin.jvm.internal.j.e(values, "values");
        this.f48058a = values;
        this.f48059b = z4;
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object obj) {
        return f.a(this.f48058a, obj);
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        Collection<Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!f.a(this.f48058a, obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f48058a.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        Object[] array = this.f48058a;
        kotlin.jvm.internal.j.e(array, "array");
        return new kotlin.jvm.internal.a(array);
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.f48058a.length;
    }

    @Override
    public final Object[] toArray() {
        Object[] objArr = this.f48058a;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (this.f48059b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        return kotlin.jvm.internal.j.j(this, array);
    }
}

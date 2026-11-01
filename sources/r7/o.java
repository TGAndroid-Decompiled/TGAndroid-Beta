package r7;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
public abstract class o extends AbstractCollection implements Serializable {
    public static final Object[] f46370a = new Object[0];

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract int l(Object[] objArr);

    public abstract int m();

    public abstract int n();

    public abstract boolean o();

    public abstract Object[] p();

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object[] toArray() {
        return toArray(f46370a);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] p5 = p();
            if (p5 == null) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            } else {
                return Arrays.copyOfRange(p5, n(), m(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        l(objArr);
        return objArr;
    }
}

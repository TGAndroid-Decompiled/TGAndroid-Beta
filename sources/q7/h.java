package q7;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
public abstract class h extends AbstractCollection implements Serializable, Collection {
    public static final Object[] f53977a = new Object[0];

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public int f(Object[] objArr) {
        d0 k10 = k();
        int i7 = 0;
        while (k10.hasNext()) {
            objArr[i7] = k10.next();
            i7++;
        }
        return i7;
    }

    @Override
    public void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public abstract d0 k();

    public Object[] l() {
        return null;
    }

    @Override
    public Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override
    public java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override
    public Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override
    public j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override
    public final j$.util.Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override
    public j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override
    public final Object[] toArray() {
        return toArray(f53977a);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] l10 = l();
            if (l10 == null) {
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(l10, j(), i(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        f(objArr);
        return objArr;
    }
}

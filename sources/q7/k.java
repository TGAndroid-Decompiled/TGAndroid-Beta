package q7;
public final class k extends m {
    public final transient m f53878c;

    public k(m mVar) {
        this.f53878c = mVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f53878c.contains(obj);
    }

    @Override
    public final Object get(int i7) {
        m mVar = this.f53878c;
        a.e(i7, mVar.size());
        return mVar.get((mVar.size() - 1) - i7);
    }

    @Override
    public final int indexOf(Object obj) {
        m mVar = this.f53878c;
        int lastIndexOf = mVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (mVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        m mVar = this.f53878c;
        int indexOf = mVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (mVar.size() - 1) - indexOf;
    }

    @Override
    public final m m() {
        return this.f53878c;
    }

    @Override
    public final m subList(int i7, int i10) {
        m mVar = this.f53878c;
        a.m(i7, i10, mVar.size());
        return mVar.subList(mVar.size() - i10, mVar.size() - i7).m();
    }

    @Override
    public final int size() {
        return this.f53878c.size();
    }
}

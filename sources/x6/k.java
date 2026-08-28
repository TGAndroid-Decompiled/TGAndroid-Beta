package x6;
public final class k extends m {
    public final transient m f49031c;

    public k(m mVar) {
        this.f49031c = mVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f49031c.contains(obj);
    }

    @Override
    public final Object get(int i9) {
        m mVar = this.f49031c;
        a.e(i9, mVar.size());
        return mVar.get((mVar.size() - 1) - i9);
    }

    @Override
    public final int indexOf(Object obj) {
        m mVar = this.f49031c;
        int lastIndexOf = mVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (mVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        m mVar = this.f49031c;
        int indexOf = mVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (mVar.size() - 1) - indexOf;
    }

    @Override
    public final m r() {
        return this.f49031c;
    }

    @Override
    public final m subList(int i9, int i10) {
        m mVar = this.f49031c;
        a.m(i9, i10, mVar.size());
        return mVar.subList(mVar.size() - i10, mVar.size() - i9).r();
    }

    @Override
    public final int size() {
        return this.f49031c.size();
    }
}

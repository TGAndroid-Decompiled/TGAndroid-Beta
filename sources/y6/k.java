package y6;

public final class k extends m {

    public final transient m f49748c;

    public k(m mVar) {
        this.f49748c = mVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f49748c.contains(obj);
    }

    @Override
    public final Object get(int i10) {
        m mVar = this.f49748c;
        a.e(i10, mVar.size());
        return mVar.get((mVar.size() - 1) - i10);
    }

    @Override
    public final int indexOf(Object obj) {
        m mVar = this.f49748c;
        int iLastIndexOf = mVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (mVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        m mVar = this.f49748c;
        int iIndexOf = mVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (mVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override
    public final m r() {
        return this.f49748c;
    }

    @Override
    public final m subList(int i10, int i11) {
        m mVar = this.f49748c;
        a.m(i10, i11, mVar.size());
        return mVar.subList(mVar.size() - i11, mVar.size() - i10).r();
    }

    @Override
    public final int size() {
        return this.f49748c.size();
    }
}

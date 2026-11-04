package p7;
public final class l extends n {
    public final transient n f53378c;

    public l(n nVar) {
        this.f53378c = nVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f53378c.contains(obj);
    }

    @Override
    public final Object get(int i3) {
        n nVar = this.f53378c;
        a.e(i3, nVar.size());
        return nVar.get((nVar.size() - 1) - i3);
    }

    @Override
    public final int indexOf(Object obj) {
        n nVar = this.f53378c;
        int lastIndexOf = nVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (nVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        n nVar = this.f53378c;
        int indexOf = nVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (nVar.size() - 1) - indexOf;
    }

    @Override
    public final n m() {
        return this.f53378c;
    }

    @Override
    public final n subList(int i3, int i10) {
        n nVar = this.f53378c;
        a.m(i3, i10, nVar.size());
        return nVar.subList(nVar.size() - i10, nVar.size() - i3).m();
    }

    @Override
    public final int size() {
        return this.f53378c.size();
    }
}

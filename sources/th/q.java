package th;
public abstract class q extends a6 {
    @Override
    public final void invalidate() {
        if (p.f49362c) {
            p.f49361b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (p.f49362c) {
            p.f49361b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}

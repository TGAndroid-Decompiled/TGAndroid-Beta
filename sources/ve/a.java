package ve;
public abstract class a extends df.c {
    @Override
    public final void e(df.c cVar) {
        if (cVar instanceof a) {
            this.f5877b = cVar;
            return;
        }
        throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
    }
}

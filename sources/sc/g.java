package sc;
public abstract class g extends a {
    public g(qc.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != qc.i.f46140a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final qc.h getContext() {
        return qc.i.f46140a;
    }
}

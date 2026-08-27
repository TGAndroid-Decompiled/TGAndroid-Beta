package tc;

public abstract class g extends a {
    public g(rc.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != rc.i.f46899a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final rc.h getContext() {
        return rc.i.f46899a;
    }
}

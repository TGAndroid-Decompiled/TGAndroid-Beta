package wc;
public abstract class g extends a {
    public g(uc.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != uc.i.f45219a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final uc.h getContext() {
        return uc.i.f45219a;
    }
}

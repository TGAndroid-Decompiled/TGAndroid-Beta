package uc;
public abstract class g extends a {
    public g(sc.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != sc.i.f47711a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final sc.h getContext() {
        return sc.i.f47711a;
    }
}

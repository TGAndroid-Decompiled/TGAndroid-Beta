package zi;
public final class c {
    public final int f61472a;
    public final u7.i f61473b;

    public c(u7.i iVar, int i7) {
        this.f61472a = i7;
        this.f61473b = iVar;
    }

    public void a(Exception exc) {
        switch (this.f61472a) {
            case 0:
                u7.i iVar = this.f61473b;
                ((v0) iVar.f57880a).f61752i.post(new k0(iVar, exc, 1));
                return;
            default:
                u7.i iVar2 = this.f61473b;
                ((v0) iVar2.f57880a).f61752i.post(new k0(iVar2, exc, 0));
                return;
        }
    }
}

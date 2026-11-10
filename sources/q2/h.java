package q2;
public final class h implements Runnable {
    public final int f53743a;
    public final j f53744b;
    public final Object f53745c;

    public h(j jVar, k kVar, int i7) {
        this.f53743a = i7;
        this.f53744b = jVar;
        this.f53745c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f53743a) {
            case 0:
                j jVar = this.f53744b;
                this.f53745c.z(jVar.f53748a, jVar.f53749b);
                return;
            default:
                j jVar2 = this.f53744b;
                this.f53745c.w(jVar2.f53748a, jVar2.f53749b);
                return;
        }
    }
}

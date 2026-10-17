package ri;
public final class a implements Runnable {
    public final int f45817a;
    public final org.telegram.utils.recorder.audio.b f45818b;

    public a(org.telegram.utils.recorder.audio.b bVar, int i10) {
        this.f45817a = i10;
        this.f45818b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f45817a) {
            case 0:
                this.f45818b.e();
                return;
            default:
                org.telegram.utils.recorder.audio.b.a(this.f45818b);
                return;
        }
    }
}

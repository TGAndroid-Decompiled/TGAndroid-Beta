package ri;
public final class a implements Runnable {
    public final int f45791a;
    public final org.telegram.utils.recorder.audio.b f45792b;

    public a(org.telegram.utils.recorder.audio.b bVar, int i10) {
        this.f45791a = i10;
        this.f45792b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f45791a) {
            case 0:
                this.f45792b.e();
                return;
            default:
                org.telegram.utils.recorder.audio.b.a(this.f45792b);
                return;
        }
    }
}

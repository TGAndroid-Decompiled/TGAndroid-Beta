package pi;
public final class a implements Runnable {
    public final int f45764a;
    public final org.telegram.utils.recorder.audio.b f45765b;

    public a(org.telegram.utils.recorder.audio.b bVar, int i10) {
        this.f45764a = i10;
        this.f45765b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f45764a) {
            case 0:
                this.f45765b.e();
                return;
            default:
                org.telegram.utils.recorder.audio.b.a(this.f45765b);
                return;
        }
    }
}

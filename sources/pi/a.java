package pi;
public final class a implements Runnable {
    public final int f45769a;
    public final org.telegram.utils.recorder.audio.b f45770b;

    public a(org.telegram.utils.recorder.audio.b bVar, int i10) {
        this.f45769a = i10;
        this.f45770b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f45769a) {
            case 0:
                this.f45770b.e();
                return;
            default:
                org.telegram.utils.recorder.audio.b.a(this.f45770b);
                return;
        }
    }
}

package ri;
public final class a implements Runnable {
    public final int f45837a;
    public final org.telegram.utils.recorder.audio.b f45838b;

    public a(org.telegram.utils.recorder.audio.b bVar, int i10) {
        this.f45837a = i10;
        this.f45838b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f45837a) {
            case 0:
                this.f45838b.e();
                return;
            default:
                org.telegram.utils.recorder.audio.b.a(this.f45838b);
                return;
        }
    }
}

package ri;
public final class a implements Runnable {
    public final int f44714a;
    public final org.telegram.utils.recorder.audio.b f44715b;

    public a(org.telegram.utils.recorder.audio.b bVar, int i10) {
        this.f44714a = i10;
        this.f44715b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f44714a) {
            case 0:
                this.f44715b.e();
                return;
            default:
                org.telegram.utils.recorder.audio.b.a(this.f44715b);
                return;
        }
    }
}

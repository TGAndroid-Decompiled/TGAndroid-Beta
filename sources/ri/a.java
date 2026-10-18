package ri;
public final class a implements Runnable {
    public final int f45789a;
    public final org.telegram.utils.recorder.audio.b f45790b;

    public a(org.telegram.utils.recorder.audio.b bVar, int i10) {
        this.f45789a = i10;
        this.f45790b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f45789a) {
            case 0:
                this.f45790b.e();
                return;
            default:
                org.telegram.utils.recorder.audio.b.a(this.f45790b);
                return;
        }
    }
}

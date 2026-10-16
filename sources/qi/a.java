package qi;
public final class a implements Runnable {
    public final int f43390a;
    public final org.telegram.utils.recorder.audio.b f43391b;

    public a(org.telegram.utils.recorder.audio.b bVar, int i10) {
        this.f43390a = i10;
        this.f43391b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f43390a) {
            case 0:
                this.f43391b.e();
                return;
            default:
                org.telegram.utils.recorder.audio.b.a(this.f43391b);
                return;
        }
    }
}

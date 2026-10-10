package pi;
public final class c {
    public volatile boolean f45933a;
    public volatile int f45934b;

    public final int a() {
        if (!this.f45933a) {
            synchronized (this) {
                try {
                    if (!this.f45933a) {
                        this.f45934b = d.f45935a.getInt("round_video_video_bitrate", 1200000);
                        this.f45933a = true;
                    }
                } finally {
                }
            }
        }
        return this.f45934b;
    }
}

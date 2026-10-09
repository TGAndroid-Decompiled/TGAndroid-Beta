package pi;
public final class c {
    public volatile boolean f45889a;
    public volatile int f45890b;

    public final int a() {
        if (!this.f45889a) {
            synchronized (this) {
                try {
                    if (!this.f45889a) {
                        this.f45890b = d.f45891a.getInt("round_video_video_bitrate", 1200000);
                        this.f45889a = true;
                    }
                } finally {
                }
            }
        }
        return this.f45890b;
    }
}

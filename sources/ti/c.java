package ti;
public final class c {
    public volatile boolean f47216a;
    public volatile int f47217b;

    public final int a() {
        if (!this.f47216a) {
            synchronized (this) {
                try {
                    if (!this.f47216a) {
                        this.f47217b = d.f47218a.getInt("round_video_video_bitrate", 1200000);
                        this.f47216a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47217b;
    }
}

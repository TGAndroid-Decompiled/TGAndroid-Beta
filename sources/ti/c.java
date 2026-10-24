package ti;
public final class c {
    public volatile boolean f47654a;
    public volatile int f47655b;

    public final int a() {
        if (!this.f47654a) {
            synchronized (this) {
                try {
                    if (!this.f47654a) {
                        this.f47655b = d.f47656a.getInt("round_video_video_bitrate", 1200000);
                        this.f47654a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47655b;
    }
}

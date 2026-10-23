package ti;
public final class c {
    public volatile boolean f47655a;
    public volatile int f47656b;

    public final int a() {
        if (!this.f47655a) {
            synchronized (this) {
                try {
                    if (!this.f47655a) {
                        this.f47656b = d.f47657a.getInt("round_video_video_bitrate", 1200000);
                        this.f47655a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47656b;
    }
}

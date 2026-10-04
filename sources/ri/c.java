package ri;
public final class c {
    public volatile boolean f46447a;
    public volatile int f46448b;

    public final int a() {
        if (!this.f46447a) {
            synchronized (this) {
                try {
                    if (!this.f46447a) {
                        this.f46448b = d.f46449a.getInt("round_video_video_bitrate", 1200000);
                        this.f46447a = true;
                    }
                } finally {
                }
            }
        }
        return this.f46448b;
    }
}

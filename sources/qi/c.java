package qi;
public final class c {
    public volatile boolean f46842a;
    public volatile int f46843b;

    public final int a() {
        if (!this.f46842a) {
            synchronized (this) {
                try {
                    if (!this.f46842a) {
                        this.f46843b = d.f46844a.getInt("round_video_video_bitrate", 1200000);
                        this.f46842a = true;
                    }
                } finally {
                }
            }
        }
        return this.f46843b;
    }
}

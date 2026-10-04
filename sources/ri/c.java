package ri;
public final class c {
    public volatile boolean f46440a;
    public volatile int f46441b;

    public final int a() {
        if (!this.f46440a) {
            synchronized (this) {
                try {
                    if (!this.f46440a) {
                        this.f46441b = d.f46442a.getInt("round_video_video_bitrate", 1200000);
                        this.f46440a = true;
                    }
                } finally {
                }
            }
        }
        return this.f46441b;
    }
}

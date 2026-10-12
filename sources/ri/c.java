package ri;
public final class c {
    public volatile boolean f47785a;
    public volatile int f47786b;

    public final int a() {
        if (!this.f47785a) {
            synchronized (this) {
                try {
                    if (!this.f47785a) {
                        this.f47786b = d.f47787a.getInt("round_video_video_bitrate", 1200000);
                        this.f47785a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47786b;
    }
}

package ri;
public final class c {
    public volatile boolean f46439a;
    public volatile int f46440b;

    public final int a() {
        if (!this.f46439a) {
            synchronized (this) {
                try {
                    if (!this.f46439a) {
                        this.f46440b = d.f46441a.getInt("round_video_video_bitrate", 1000000);
                        this.f46439a = true;
                    }
                } finally {
                }
            }
        }
        return this.f46440b;
    }
}

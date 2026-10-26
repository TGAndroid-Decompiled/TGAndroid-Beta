package wi;
public final class c {
    public volatile boolean f51273a;
    public volatile int f51274b;

    public final int a() {
        if (!this.f51273a) {
            synchronized (this) {
                try {
                    if (!this.f51273a) {
                        this.f51274b = d.f51275a.getInt("round_video_video_bitrate", 1200000);
                        this.f51273a = true;
                    }
                } finally {
                }
            }
        }
        return this.f51274b;
    }
}

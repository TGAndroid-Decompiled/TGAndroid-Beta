package ti;
public final class c {
    public volatile boolean f47211a;
    public volatile int f47212b;

    public final int a() {
        if (!this.f47211a) {
            synchronized (this) {
                try {
                    if (!this.f47211a) {
                        this.f47212b = d.f47213a.getInt("round_video_video_bitrate", 1200000);
                        this.f47211a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47212b;
    }
}

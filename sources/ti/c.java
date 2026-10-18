package ti;
public final class c {
    public volatile boolean f47207a;
    public volatile int f47208b;

    public final int a() {
        if (!this.f47207a) {
            synchronized (this) {
                try {
                    if (!this.f47207a) {
                        this.f47208b = d.f47209a.getInt("round_video_video_bitrate", 1200000);
                        this.f47207a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47208b;
    }
}

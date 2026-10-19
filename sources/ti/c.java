package ti;
public final class c {
    public volatile boolean f47209a;
    public volatile int f47210b;

    public final int a() {
        if (!this.f47209a) {
            synchronized (this) {
                try {
                    if (!this.f47209a) {
                        this.f47210b = d.f47211a.getInt("round_video_video_bitrate", 1200000);
                        this.f47209a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47210b;
    }
}

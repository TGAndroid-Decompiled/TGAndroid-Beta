package ti;
public final class c {
    public volatile boolean f47219a;
    public volatile int f47220b;

    public final int a() {
        if (!this.f47219a) {
            synchronized (this) {
                try {
                    if (!this.f47219a) {
                        this.f47220b = d.f47221a.getInt("round_video_video_bitrate", 1200000);
                        this.f47219a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47220b;
    }
}

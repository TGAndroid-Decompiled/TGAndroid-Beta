package ri;
public final class c {
    public volatile boolean f47793a;
    public volatile int f47794b;

    public final int a() {
        if (!this.f47793a) {
            synchronized (this) {
                try {
                    if (!this.f47793a) {
                        this.f47794b = d.f47795a.getInt("round_video_video_bitrate", 1200000);
                        this.f47793a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47794b;
    }
}

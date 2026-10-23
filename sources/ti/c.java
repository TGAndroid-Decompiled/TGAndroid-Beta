package ti;
public final class c {
    public volatile boolean f47220a;
    public volatile int f47221b;

    public final int a() {
        if (!this.f47220a) {
            synchronized (this) {
                try {
                    if (!this.f47220a) {
                        this.f47221b = d.f47222a.getInt("round_video_video_bitrate", 1200000);
                        this.f47220a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47221b;
    }
}

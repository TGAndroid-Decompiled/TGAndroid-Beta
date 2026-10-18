package ti;
public final class c {
    public volatile boolean f47257a;
    public volatile int f47258b;

    public final int a() {
        if (!this.f47257a) {
            synchronized (this) {
                try {
                    if (!this.f47257a) {
                        this.f47258b = d.f47259a.getInt("round_video_video_bitrate", 1200000);
                        this.f47257a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47258b;
    }
}

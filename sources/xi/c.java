package xi;
public final class c {
    public volatile boolean f58854a;
    public volatile int f58855b;

    public final int a() {
        if (!this.f58854a) {
            synchronized (this) {
                try {
                    if (!this.f58854a) {
                        this.f58855b = d.f58856a.getInt("round_video_video_bitrate", 1200000);
                        this.f58854a = true;
                    }
                } finally {
                }
            }
        }
        return this.f58855b;
    }
}

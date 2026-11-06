package xi;
public final class c {
    public volatile boolean f58734a;
    public volatile int f58735b;

    public final int a() {
        if (!this.f58734a) {
            synchronized (this) {
                try {
                    if (!this.f58734a) {
                        this.f58735b = d.f58736a.getInt("round_video_video_bitrate", 1200000);
                        this.f58734a = true;
                    }
                } finally {
                }
            }
        }
        return this.f58735b;
    }
}

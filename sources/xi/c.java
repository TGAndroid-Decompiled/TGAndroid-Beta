package xi;
public final class c {
    public volatile boolean f58758a;
    public volatile int f58759b;

    public final int a() {
        if (!this.f58758a) {
            synchronized (this) {
                try {
                    if (!this.f58758a) {
                        this.f58759b = d.f58760a.getInt("round_video_video_bitrate", 1200000);
                        this.f58758a = true;
                    }
                } finally {
                }
            }
        }
        return this.f58759b;
    }
}

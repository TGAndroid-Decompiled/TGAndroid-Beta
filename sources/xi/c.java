package xi;
public final class c {
    public volatile boolean f58764a;
    public volatile int f58765b;

    public final int a() {
        if (!this.f58764a) {
            synchronized (this) {
                try {
                    if (!this.f58764a) {
                        this.f58765b = d.f58766a.getInt("round_video_video_bitrate", 1200000);
                        this.f58764a = true;
                    }
                } finally {
                }
            }
        }
        return this.f58765b;
    }
}

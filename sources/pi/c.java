package pi;
public final class c {
    public volatile boolean f41354a;
    public volatile int f41355b;

    public final int a() {
        if (!this.f41354a) {
            synchronized (this) {
                try {
                    if (!this.f41354a) {
                        this.f41355b = d.f41356a.getInt("round_video_video_bitrate", 1000000);
                        this.f41354a = true;
                    }
                } finally {
                }
            }
        }
        return this.f41355b;
    }
}

package pi;
public final class c {
    public volatile boolean f41356a;
    public volatile int f41357b;

    public final int a() {
        if (!this.f41356a) {
            synchronized (this) {
                try {
                    if (!this.f41356a) {
                        this.f41357b = d.f41358a.getInt("round_video_video_bitrate", 1000000);
                        this.f41356a = true;
                    }
                } finally {
                }
            }
        }
        return this.f41357b;
    }
}

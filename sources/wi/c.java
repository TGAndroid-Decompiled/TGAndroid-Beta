package wi;
public final class c {
    public volatile boolean f51270a;
    public volatile int f51271b;

    public final int a() {
        if (!this.f51270a) {
            synchronized (this) {
                try {
                    if (!this.f51270a) {
                        this.f51271b = d.f51272a.getInt("round_video_video_bitrate", 1200000);
                        this.f51270a = true;
                    }
                } finally {
                }
            }
        }
        return this.f51271b;
    }
}

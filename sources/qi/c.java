package qi;
public final class c {
    public volatile boolean f42130a;
    public volatile int f42131b;

    public final int a() {
        if (!this.f42130a) {
            synchronized (this) {
                try {
                    if (!this.f42130a) {
                        this.f42131b = d.f42132a.getInt("round_video_video_bitrate", 1000000);
                        this.f42130a = true;
                    }
                } finally {
                }
            }
        }
        return this.f42131b;
    }
}

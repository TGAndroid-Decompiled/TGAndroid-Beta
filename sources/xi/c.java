package xi;
public final class c {
    public volatile boolean f58874a;
    public volatile int f58875b;

    public final int a() {
        if (!this.f58874a) {
            synchronized (this) {
                try {
                    if (!this.f58874a) {
                        this.f58875b = d.f58876a.getInt("round_video_video_bitrate", 1200000);
                        this.f58874a = true;
                    }
                } finally {
                }
            }
        }
        return this.f58875b;
    }
}

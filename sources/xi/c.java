package xi;
public final class c {
    public volatile boolean f58863a;
    public volatile int f58864b;

    public final int a() {
        if (!this.f58863a) {
            synchronized (this) {
                try {
                    if (!this.f58863a) {
                        this.f58864b = d.f58865a.getInt("round_video_video_bitrate", 1200000);
                        this.f58863a = true;
                    }
                } finally {
                }
            }
        }
        return this.f58864b;
    }
}

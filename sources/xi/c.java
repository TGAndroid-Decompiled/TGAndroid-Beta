package xi;
public final class c {
    public volatile boolean f58861a;
    public volatile int f58862b;

    public final int a() {
        if (!this.f58861a) {
            synchronized (this) {
                try {
                    if (!this.f58861a) {
                        this.f58862b = d.f58863a.getInt("round_video_video_bitrate", 1200000);
                        this.f58861a = true;
                    }
                } finally {
                }
            }
        }
        return this.f58862b;
    }
}

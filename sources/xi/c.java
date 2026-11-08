package xi;
public final class c {
    public volatile boolean f58853a;
    public volatile int f58854b;

    public final int a() {
        if (!this.f58853a) {
            synchronized (this) {
                try {
                    if (!this.f58853a) {
                        this.f58854b = d.f58855a.getInt("round_video_video_bitrate", 1200000);
                        this.f58853a = true;
                    }
                } finally {
                }
            }
        }
        return this.f58854b;
    }
}

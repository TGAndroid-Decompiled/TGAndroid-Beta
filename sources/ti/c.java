package ti;
public final class c {
    public volatile boolean f47232a;
    public volatile int f47233b;

    public final int a() {
        if (!this.f47232a) {
            synchronized (this) {
                try {
                    if (!this.f47232a) {
                        this.f47233b = d.f47234a.getInt("round_video_video_bitrate", 1200000);
                        this.f47232a = true;
                    }
                } finally {
                }
            }
        }
        return this.f47233b;
    }
}

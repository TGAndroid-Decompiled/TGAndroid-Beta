package ri;
public final class c {
    public volatile boolean f46454a;
    public volatile int f46455b;

    public final int a() {
        if (!this.f46454a) {
            synchronized (this) {
                try {
                    if (!this.f46454a) {
                        this.f46455b = d.f46456a.getInt("round_video_video_bitrate", 1200000);
                        this.f46454a = true;
                    }
                } finally {
                }
            }
        }
        return this.f46455b;
    }
}

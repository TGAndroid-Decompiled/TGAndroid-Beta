package xi;
public final class c {
    public volatile boolean f58759a;
    public volatile int f58760b;

    public final int a() {
        if (!this.f58759a) {
            synchronized (this) {
                try {
                    if (!this.f58759a) {
                        this.f58760b = d.f58761a.getInt("round_video_video_bitrate", 1200000);
                        this.f58759a = true;
                    }
                } finally {
                }
            }
        }
        return this.f58760b;
    }
}

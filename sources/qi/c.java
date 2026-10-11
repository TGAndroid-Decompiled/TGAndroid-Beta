package qi;
public final class c {
    public volatile boolean f46808a;
    public volatile int f46809b;

    public final int a() {
        if (!this.f46808a) {
            synchronized (this) {
                try {
                    if (!this.f46808a) {
                        this.f46809b = d.f46810a.getInt("round_video_video_bitrate", 1200000);
                        this.f46808a = true;
                    }
                } finally {
                }
            }
        }
        return this.f46809b;
    }
}

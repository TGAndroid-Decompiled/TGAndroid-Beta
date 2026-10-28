package wi;
public final class c {
    public volatile boolean f51331a;
    public volatile int f51332b;

    public final int a() {
        if (!this.f51331a) {
            synchronized (this) {
                try {
                    if (!this.f51331a) {
                        this.f51332b = d.f51333a.getInt("round_video_video_bitrate", 1200000);
                        this.f51331a = true;
                    }
                } finally {
                }
            }
        }
        return this.f51332b;
    }
}

package si;
public final class c {
    public volatile boolean f45481a;
    public volatile int f45482b;

    public final int a() {
        if (!this.f45481a) {
            synchronized (this) {
                try {
                    if (!this.f45481a) {
                        this.f45482b = d.f45483a.getInt("round_video_video_bitrate", 1200000);
                        this.f45481a = true;
                    }
                } finally {
                }
            }
        }
        return this.f45482b;
    }
}

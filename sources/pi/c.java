package pi;
public final class c {
    public volatile boolean f41355a;
    public volatile int f41356b;

    public final int a() {
        if (!this.f41355a) {
            synchronized (this) {
                try {
                    if (!this.f41355a) {
                        this.f41356b = d.f41357a.getInt("round_video_video_bitrate", 1000000);
                        this.f41355a = true;
                    }
                } finally {
                }
            }
        }
        return this.f41356b;
    }
}

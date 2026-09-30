package pi;
public final class c {
    public volatile boolean f41357a;
    public volatile int f41358b;

    public final int a() {
        if (!this.f41357a) {
            synchronized (this) {
                try {
                    if (!this.f41357a) {
                        this.f41358b = d.f41359a.getInt("round_video_video_bitrate", 1000000);
                        this.f41357a = true;
                    }
                } finally {
                }
            }
        }
        return this.f41358b;
    }
}

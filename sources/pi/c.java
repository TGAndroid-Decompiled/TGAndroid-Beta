package pi;
public final class c {
    public volatile boolean f41454a;
    public volatile int f41455b;

    public final int a() {
        if (!this.f41454a) {
            synchronized (this) {
                try {
                    if (!this.f41454a) {
                        this.f41455b = d.f41456a.getInt("round_video_video_bitrate", 1000000);
                        this.f41454a = true;
                    }
                } finally {
                }
            }
        }
        return this.f41455b;
    }
}

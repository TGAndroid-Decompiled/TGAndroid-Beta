package pi;
public final class c {
    public volatile boolean f41341a;
    public volatile int f41342b;

    public final int a() {
        if (!this.f41341a) {
            synchronized (this) {
                try {
                    if (!this.f41341a) {
                        this.f41342b = d.f41343a.getInt("round_video_video_bitrate", 1000000);
                        this.f41341a = true;
                    }
                } finally {
                }
            }
        }
        return this.f41342b;
    }
}

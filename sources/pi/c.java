package pi;
public final class c {
    public volatile boolean f45887a;
    public volatile int f45888b;

    public final int a() {
        if (!this.f45887a) {
            synchronized (this) {
                try {
                    if (!this.f45887a) {
                        this.f45888b = d.f45889a.getInt("round_video_video_bitrate", 1200000);
                        this.f45887a = true;
                    }
                } finally {
                }
            }
        }
        return this.f45888b;
    }
}

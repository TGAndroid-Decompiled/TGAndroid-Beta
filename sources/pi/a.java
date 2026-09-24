package pi;
public final class a {
    public final String f41335a;
    public volatile boolean f41336b;
    public volatile boolean f41337c;

    public a(String str) {
        this.f41335a = str;
    }

    public final boolean a() {
        if (!this.f41336b) {
            synchronized (this) {
                try {
                    if (!this.f41336b) {
                        this.f41337c = d.f41343a.getBoolean(this.f41335a, true);
                        this.f41336b = true;
                    }
                } finally {
                }
            }
        }
        return this.f41337c;
    }

    public final synchronized void b(boolean z10) {
        this.f41337c = z10;
        this.f41336b = true;
        d.f41343a.edit().putBoolean(this.f41335a, z10).apply();
    }
}

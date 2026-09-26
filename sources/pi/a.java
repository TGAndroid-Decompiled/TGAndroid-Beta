package pi;
public final class a {
    public final String f41348a;
    public volatile boolean f41349b;
    public volatile boolean f41350c;

    public a(String str) {
        this.f41348a = str;
    }

    public final boolean a() {
        if (!this.f41349b) {
            synchronized (this) {
                try {
                    if (!this.f41349b) {
                        this.f41350c = d.f41356a.getBoolean(this.f41348a, true);
                        this.f41349b = true;
                    }
                } finally {
                }
            }
        }
        return this.f41350c;
    }

    public final synchronized void b(boolean z10) {
        this.f41350c = z10;
        this.f41349b = true;
        d.f41356a.edit().putBoolean(this.f41348a, z10).apply();
    }
}

package pi;
public final class a {
    public final String f41349a;
    public volatile boolean f41350b;
    public volatile boolean f41351c;

    public a(String str) {
        this.f41349a = str;
    }

    public final boolean a() {
        if (!this.f41350b) {
            synchronized (this) {
                try {
                    if (!this.f41350b) {
                        this.f41351c = d.f41357a.getBoolean(this.f41349a, true);
                        this.f41350b = true;
                    }
                } finally {
                }
            }
        }
        return this.f41351c;
    }

    public final synchronized void b(boolean z10) {
        this.f41351c = z10;
        this.f41350b = true;
        d.f41357a.edit().putBoolean(this.f41349a, z10).apply();
    }
}

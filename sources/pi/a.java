package pi;
public final class a {
    public final String f41350a;
    public volatile boolean f41351b;
    public volatile boolean f41352c;

    public a(String str) {
        this.f41350a = str;
    }

    public final boolean a() {
        if (!this.f41351b) {
            synchronized (this) {
                try {
                    if (!this.f41351b) {
                        this.f41352c = d.f41358a.getBoolean(this.f41350a, true);
                        this.f41351b = true;
                    }
                } finally {
                }
            }
        }
        return this.f41352c;
    }

    public final synchronized void b(boolean z10) {
        this.f41352c = z10;
        this.f41351b = true;
        d.f41358a.edit().putBoolean(this.f41350a, z10).apply();
    }
}

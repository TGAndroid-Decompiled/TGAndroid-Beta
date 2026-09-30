package pi;
public final class a {
    public final String f41448a;
    public volatile boolean f41449b;
    public volatile boolean f41450c;

    public a(String str) {
        this.f41448a = str;
    }

    public final boolean a() {
        if (!this.f41449b) {
            synchronized (this) {
                try {
                    if (!this.f41449b) {
                        this.f41450c = d.f41456a.getBoolean(this.f41448a, true);
                        this.f41449b = true;
                    }
                } finally {
                }
            }
        }
        return this.f41450c;
    }

    public final synchronized void b(boolean z10) {
        this.f41450c = z10;
        this.f41449b = true;
        d.f41456a.edit().putBoolean(this.f41448a, z10).apply();
    }
}

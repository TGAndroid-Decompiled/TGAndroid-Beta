package pi;
public final class a {
    public final String f41351a;
    public volatile boolean f41352b;
    public volatile boolean f41353c;

    public a(String str) {
        this.f41351a = str;
    }

    public final boolean a() {
        if (!this.f41352b) {
            synchronized (this) {
                try {
                    if (!this.f41352b) {
                        this.f41353c = d.f41359a.getBoolean(this.f41351a, true);
                        this.f41352b = true;
                    }
                } finally {
                }
            }
        }
        return this.f41353c;
    }

    public final synchronized void b(boolean z10) {
        this.f41353c = z10;
        this.f41352b = true;
        d.f41359a.edit().putBoolean(this.f41351a, z10).apply();
    }
}

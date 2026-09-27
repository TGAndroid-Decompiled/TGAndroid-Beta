package qi;
public final class a {
    public final String f42124a;
    public volatile boolean f42125b;
    public volatile boolean f42126c;

    public a(String str) {
        this.f42124a = str;
    }

    public final boolean a() {
        if (!this.f42125b) {
            synchronized (this) {
                try {
                    if (!this.f42125b) {
                        this.f42126c = d.f42132a.getBoolean(this.f42124a, true);
                        this.f42125b = true;
                    }
                } finally {
                }
            }
        }
        return this.f42126c;
    }

    public final synchronized void b(boolean z10) {
        this.f42126c = z10;
        this.f42125b = true;
        d.f42132a.edit().putBoolean(this.f42124a, z10).apply();
    }
}

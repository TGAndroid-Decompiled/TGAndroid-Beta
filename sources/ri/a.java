package ri;
public final class a {
    public final String f46433a;
    public volatile boolean f46434b;
    public volatile boolean f46435c;

    public a(String str) {
        this.f46433a = str;
    }

    public final boolean a() {
        if (!this.f46434b) {
            synchronized (this) {
                try {
                    if (!this.f46434b) {
                        this.f46435c = d.f46441a.getBoolean(this.f46433a, true);
                        this.f46434b = true;
                    }
                } finally {
                }
            }
        }
        return this.f46435c;
    }

    public final synchronized void b(boolean z10) {
        this.f46435c = z10;
        this.f46434b = true;
        d.f46441a.edit().putBoolean(this.f46433a, z10).apply();
    }
}

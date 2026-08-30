package ra;
public final class h extends Number {
    public final String f43411a;

    public h(String str) {
        this.f43411a = str;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.f43411a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f43411a.equals(((h) obj).f43411a);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.f43411a);
    }

    public final int hashCode() {
        return this.f43411a.hashCode();
    }

    @Override
    public final int intValue() {
        String str = this.f43411a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return d.i(str).intValue();
        }
    }

    @Override
    public final long longValue() {
        String str = this.f43411a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f43411a;
    }
}

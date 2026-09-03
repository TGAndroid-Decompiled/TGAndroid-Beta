package ra;
public final class h extends Number {
    public final String f46794a;

    public h(String str) {
        this.f46794a = str;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.f46794a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f46794a.equals(((h) obj).f46794a);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.f46794a);
    }

    public final int hashCode() {
        return this.f46794a.hashCode();
    }

    @Override
    public final int intValue() {
        String str = this.f46794a;
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
        String str = this.f46794a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f46794a;
    }
}

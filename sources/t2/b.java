package t2;

public final class b {

    public final Integer f48010a;

    public b(Integer num) {
        this.f48010a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        Integer num = ((b) obj).f48010a;
        Integer num2 = this.f48010a;
        if (num2 == null) {
            return num == null;
        }
        return num2.equals(num);
    }

    public final int hashCode() {
        Integer num = this.f48010a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f48010a + "}";
    }
}

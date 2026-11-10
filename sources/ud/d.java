package ud;

import c8.t9;
import java.util.Iterator;
public class d implements Iterable {
    public final int f56530a;
    public final int f56531b;
    public final int f56532c;

    public d(int i7, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.f56530a = i7;
                this.f56531b = t9.a(i7, i10, i11);
                this.f56532c = i11;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f56530a == dVar.f56530a && this.f56531b == dVar.f56531b && this.f56532c == dVar.f56532c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f56530a * 31) + this.f56531b) * 31) + this.f56532c;
    }

    public boolean isEmpty() {
        int i7 = this.f56532c;
        int i10 = this.f56531b;
        int i11 = this.f56530a;
        if (i7 > 0) {
            if (i11 <= i10) {
                return false;
            }
            return true;
        } else if (i11 >= i10) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f56530a, this.f56531b, this.f56532c);
    }

    public String toString() {
        StringBuilder sb2;
        int i7 = this.f56531b;
        int i10 = this.f56530a;
        int i11 = this.f56532c;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i7);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i7);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}

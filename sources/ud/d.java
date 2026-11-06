package ud;

import c8.t9;
import java.util.Iterator;
public class d implements Iterable {
    public final int f56402a;
    public final int f56403b;
    public final int f56404c;

    public d(int i7, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.f56402a = i7;
                this.f56403b = t9.a(i7, i10, i11);
                this.f56404c = i11;
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
                if (this.f56402a == dVar.f56402a && this.f56403b == dVar.f56403b && this.f56404c == dVar.f56404c) {
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
        return (((this.f56402a * 31) + this.f56403b) * 31) + this.f56404c;
    }

    public boolean isEmpty() {
        int i7 = this.f56404c;
        int i10 = this.f56403b;
        int i11 = this.f56402a;
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
        return new b(this.f56402a, this.f56403b, this.f56404c);
    }

    public String toString() {
        StringBuilder sb2;
        int i7 = this.f56403b;
        int i10 = this.f56402a;
        int i11 = this.f56404c;
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

package ud;

import c8.v9;
import java.util.Iterator;
public class d implements Iterable {
    public final int f58602a;
    public final int f58603b;
    public final int f58604c;

    public d(int i7, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.f58602a = i7;
                this.f58603b = v9.a(i7, i10, i11);
                this.f58604c = i11;
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
                if (this.f58602a == dVar.f58602a && this.f58603b == dVar.f58603b && this.f58604c == dVar.f58604c) {
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
        return (((this.f58602a * 31) + this.f58603b) * 31) + this.f58604c;
    }

    public boolean isEmpty() {
        int i7 = this.f58604c;
        int i10 = this.f58603b;
        int i11 = this.f58602a;
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
        return new b(this.f58602a, this.f58603b, this.f58604c);
    }

    public String toString() {
        StringBuilder sb2;
        int i7 = this.f58603b;
        int i10 = this.f58602a;
        int i11 = this.f58604c;
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

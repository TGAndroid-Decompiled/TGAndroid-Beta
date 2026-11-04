package rd;

import b8.hd;
import java.util.Iterator;
public class d implements Iterable {
    public final int f54497a;
    public final int f54498b;
    public final int f54499c;

    public d(int i3, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.f54497a = i3;
                this.f54498b = hd.a(i3, i10, i11);
                this.f54499c = i11;
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
                if (this.f54497a == dVar.f54497a && this.f54498b == dVar.f54498b && this.f54499c == dVar.f54499c) {
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
        return (((this.f54497a * 31) + this.f54498b) * 31) + this.f54499c;
    }

    public boolean isEmpty() {
        int i3 = this.f54499c;
        int i10 = this.f54498b;
        int i11 = this.f54497a;
        if (i3 > 0) {
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
        return new b(this.f54497a, this.f54498b, this.f54499c);
    }

    public String toString() {
        StringBuilder sb2;
        int i3 = this.f54498b;
        int i10 = this.f54497a;
        int i11 = this.f54499c;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i3);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i3);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}

package p8;

import i7.wa;

public abstract class k {

    public transient c f45552a;

    public transient i7.m f45553b;

    public transient wa f45554c;

    public abstract wa a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return ((h0) this).a().equals(((h0) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f10875b.hashCode();
    }

    public final String toString() {
        return a().f10875b.toString();
    }
}

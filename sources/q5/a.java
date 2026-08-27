package q5;

import java.util.Arrays;

public final class a {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, 1, 0, 0, 0, Boolean.FALSE});
    }
}

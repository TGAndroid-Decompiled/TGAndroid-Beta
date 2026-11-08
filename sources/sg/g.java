package sg;

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.id;
public final class g extends h {
    public static final List f55051c = Arrays.asList(new g(2), new g(3), new g(4), new g(1), new g(0));
    public final int f55052b;

    public g(int i7) {
        this.f55052b = i7;
    }

    public static g p(int i7) {
        List list = f55051c;
        if (i7 >= 0 && i7 <= list.size()) {
            return (g) list.get(i7);
        }
        StringBuilder sb2 = new StringBuilder("Shape type must be in range from 0 to ");
        sb2.append(list.size() - 1);
        sb2.append(", but got ");
        sb2.append(i7);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override
    public final float a() {
        return 1.0f;
    }

    @Override
    public final int e() {
        switch (this.f55052b) {
            case 0:
                return 2131232519;
            case 1:
                return 2131232253;
            case 2:
                return 2131232520;
            case 3:
                return 2131232525;
            default:
                return 2131232527;
        }
    }

    @Override
    public final String i(int i7) {
        if (i7 != 0 && i7 != 1) {
            if (i7 != 2) {
                return null;
            }
            return "brush";
        }
        return "shape";
    }

    public final int m() {
        switch (this.f55052b) {
            case 0:
                return 2131232519;
            case 1:
                return 2131232254;
            case 2:
                return 2131232521;
            case 3:
                return 2131232526;
            default:
                return 2131232528;
        }
    }

    public final String n() {
        switch (this.f55052b) {
            case 0:
                return id.M0(2131747677, null);
            case 1:
                return id.M0(2131747675, null);
            case 2:
                return id.M0(2131747674, null);
            case 3:
                return id.M0(2131747663, null);
            default:
                return id.M0(2131747662, null);
        }
    }

    public final int o() {
        switch (this.f55052b) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 0;
            case 3:
                return 1;
            default:
                return 2;
        }
    }
}

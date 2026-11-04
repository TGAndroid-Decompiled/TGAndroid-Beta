package tg;

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.bd;
public final class g extends h {
    public static final List f55164c = Arrays.asList(new g(2), new g(3), new g(4), new g(1), new g(0));
    public final int f55165b;

    public g(int i3) {
        this.f55165b = i3;
    }

    public static g p(int i3) {
        List list = f55164c;
        if (i3 >= 0 && i3 <= list.size()) {
            return (g) list.get(i3);
        }
        StringBuilder sb2 = new StringBuilder("Shape type must be in range from 0 to ");
        sb2.append(list.size() - 1);
        sb2.append(", but got ");
        sb2.append(i3);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override
    public final float a() {
        return 1.0f;
    }

    @Override
    public final int e() {
        switch (this.f55165b) {
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
    public final String i(int i3) {
        if (i3 != 0 && i3 != 1) {
            if (i3 != 2) {
                return null;
            }
            return "brush";
        }
        return "shape";
    }

    public final int m() {
        switch (this.f55165b) {
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
        switch (this.f55165b) {
            case 0:
                return bd.M0(2131747684, null);
            case 1:
                return bd.M0(2131747682, null);
            case 2:
                return bd.M0(2131747681, null);
            case 3:
                return bd.M0(2131747670, null);
            default:
                return bd.M0(2131747669, null);
        }
    }

    public final int o() {
        switch (this.f55165b) {
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

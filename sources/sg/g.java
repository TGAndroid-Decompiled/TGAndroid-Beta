package sg;

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.hd;
public final class g extends h {
    public static final List f57241c = Arrays.asList(new g(2), new g(3), new g(4), new g(1), new g(0));
    public final int f57242b;

    public g(int i7) {
        this.f57242b = i7;
    }

    public static g p(int i7) {
        List list = f57241c;
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
        switch (this.f57242b) {
            case 0:
                return 2131232521;
            case 1:
                return 2131232255;
            case 2:
                return 2131232522;
            case 3:
                return 2131232527;
            default:
                return 2131232529;
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
        switch (this.f57242b) {
            case 0:
                return 2131232521;
            case 1:
                return 2131232256;
            case 2:
                return 2131232523;
            case 3:
                return 2131232528;
            default:
                return 2131232530;
        }
    }

    public final String n() {
        switch (this.f57242b) {
            case 0:
                return hd.N0(2131747482, null);
            case 1:
                return hd.N0(2131747480, null);
            case 2:
                return hd.N0(2131747479, null);
            case 3:
                return hd.N0(2131747468, null);
            default:
                return hd.N0(2131747467, null);
        }
    }

    public final int o() {
        switch (this.f57242b) {
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

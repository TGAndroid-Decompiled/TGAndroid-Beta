package zf;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
public final class q0 implements Comparator {
    public final ArrayList f55614a;
    public final ArrayList f55615b;

    public q0(ArrayList arrayList, ArrayList arrayList2) {
        this.f55614a = arrayList;
        this.f55615b = arrayList2;
    }

    public final int a(w0 w0Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f55614a;
            if (i11 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.f55615b;
                    if (i10 < Math.min(20, arrayList2.size())) {
                        if (((TLRPC.Document) arrayList2.get(i10)).f19799id == w0Var.f55643a.f19799id) {
                            return (arrayList2.size() - i10) + 1000000;
                        }
                        i10++;
                    } else {
                        return -1;
                    }
                }
            } else if (((TLRPC.Document) arrayList.get(i11)).f19799id == w0Var.f55643a.f19799id) {
                return i11 + 2000000;
            } else {
                i11++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        w0 w0Var2 = (w0) obj2;
        boolean K2 = jj.K2(w0Var.f55643a, true);
        if (K2 == jj.K2(w0Var2.f55643a, true)) {
            int a2 = a(w0Var);
            int a10 = a(w0Var2);
            if (a2 <= a10) {
                if (a2 >= a10) {
                    return 0;
                }
            } else {
                return -1;
            }
        } else if (K2) {
            return -1;
        }
        return 1;
    }
}

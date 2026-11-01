package zg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.kj;
import org.telegram.ui.vj;
public final class a {
    public RecyclerView f55734a;
    public int f55735b;
    public long f55736c;
    public int d;
    public boolean e;

    public final boolean a(kj kjVar) {
        if (kjVar != null) {
            if (kjVar.f1() != this.f55735b) {
                if (this.f55736c != 0 && kjVar.d1() == this.f55736c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c(int i10, long j10) {
        if (this.f55735b == i10 && this.f55736c == j10) {
            return false;
        }
        this.f55735b = i10;
        this.f55736c = j10;
        if (i10 == 0) {
            this.e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(vj vjVar) {
        this.f55734a = vjVar;
    }
}

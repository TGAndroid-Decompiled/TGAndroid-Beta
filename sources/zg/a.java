package zg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.jj;
import org.telegram.ui.vj;
public final class a {
    public RecyclerView f55716a;
    public int f55717b;
    public long f55718c;
    public int d;
    public boolean e;

    public final boolean a(jj jjVar) {
        if (jjVar != null) {
            if (jjVar.f1() != this.f55717b) {
                if (this.f55718c != 0 && jjVar.d1() == this.f55718c) {
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
        if (this.f55717b == i10 && this.f55718c == j10) {
            return false;
        }
        this.f55717b = i10;
        this.f55718c = j10;
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
        this.f55716a = vjVar;
    }
}

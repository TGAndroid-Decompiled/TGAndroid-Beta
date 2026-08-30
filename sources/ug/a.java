package ug;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.qj;
public final class a {
    public RecyclerView f45492a;
    public int f45493b;
    public long f45494c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f45493b) {
                if (this.f45494c != 0 && messageObject.getGroupId() == this.f45494c) {
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
        if (this.f45493b == i10 && this.f45494c == j10) {
            return false;
        }
        this.f45493b = i10;
        this.f45494c = j10;
        if (i10 == 0) {
            this.e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(qj qjVar) {
        this.f45492a = qjVar;
    }
}

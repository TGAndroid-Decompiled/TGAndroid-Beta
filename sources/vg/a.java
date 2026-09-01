package vg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.qj;
public final class a {
    public RecyclerView f49255a;
    public int f49256b;
    public long f49257c;
    public int d;
    public boolean f49258e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f49256b) {
                if (this.f49257c != 0 && messageObject.getGroupId() == this.f49257c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f49258e;
    }

    public final boolean c(int i10, long j10) {
        if (this.f49256b == i10 && this.f49257c == j10) {
            return false;
        }
        this.f49256b = i10;
        this.f49257c = j10;
        if (i10 == 0) {
            this.f49258e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(qj qjVar) {
        this.f49255a = qjVar;
    }
}

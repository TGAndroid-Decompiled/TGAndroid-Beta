package vg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.qj;
public final class a {
    public RecyclerView f49254a;
    public int f49255b;
    public long f49256c;
    public int d;
    public boolean f49257e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f49255b) {
                if (this.f49256c != 0 && messageObject.getGroupId() == this.f49256c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f49257e;
    }

    public final boolean c(int i10, long j10) {
        if (this.f49255b == i10 && this.f49256c == j10) {
            return false;
        }
        this.f49255b = i10;
        this.f49256c = j10;
        if (i10 == 0) {
            this.f49257e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(qj qjVar) {
        this.f49254a = qjVar;
    }
}

package sg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.lj;
public final class a {
    public RecyclerView f48019a;
    public int f48020b;
    public long f48021c;
    public int d;
    public boolean f48022e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f48020b) {
                if (this.f48021c != 0 && messageObject.getGroupId() == this.f48021c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f48022e;
    }

    public final boolean c(int i10, long j10) {
        if (this.f48020b == i10 && this.f48021c == j10) {
            return false;
        }
        this.f48020b = i10;
        this.f48021c = j10;
        if (i10 == 0) {
            this.f48022e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(lj ljVar) {
        this.f48019a = ljVar;
    }
}

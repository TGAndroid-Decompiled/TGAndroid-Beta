package vg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.qj;
public final class a {
    public RecyclerView f49291a;
    public int f49292b;
    public long f49293c;
    public int d;
    public boolean f49294e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f49292b) {
                if (this.f49293c != 0 && messageObject.getGroupId() == this.f49293c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f49294e;
    }

    public final boolean c(int i10, long j10) {
        if (this.f49292b == i10 && this.f49293c == j10) {
            return false;
        }
        this.f49292b = i10;
        this.f49293c = j10;
        if (i10 == 0) {
            this.f49294e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(qj qjVar) {
        this.f49291a = qjVar;
    }
}

package qg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.kj;

public final class a {

    public RecyclerView f46507a;

    public int f46508b;

    public long f46509c;
    public int d;

    public boolean f46510e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        if (messageObject.getId() != this.f46508b) {
            return this.f46509c != 0 && messageObject.getGroupId() == this.f46509c;
        }
        return true;
    }

    public final boolean b() {
        return this.f46510e;
    }

    public final boolean c(int i10, long j10) {
        if (this.f46508b == i10 && this.f46509c == j10) {
            return false;
        }
        this.f46508b = i10;
        this.f46509c = j10;
        if (i10 != 0) {
            return true;
        }
        this.f46510e = false;
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(kj kjVar) {
        this.f46507a = kjVar;
    }
}

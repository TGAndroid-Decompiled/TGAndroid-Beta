package pg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ij;
public final class a {
    public RecyclerView f45839a;
    public int f45840b;
    public long f45841c;
    public int d;
    public boolean f45842e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f45840b) {
                if (this.f45841c != 0 && messageObject.getGroupId() == this.f45841c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f45842e;
    }

    public final boolean c(int i9, long j10) {
        if (this.f45840b == i9 && this.f45841c == j10) {
            return false;
        }
        this.f45840b = i9;
        this.f45841c = j10;
        if (i9 == 0) {
            this.f45842e = false;
            return true;
        }
        return true;
    }

    public final void d(int i9) {
        this.d = i9;
    }

    public final void e(ij ijVar) {
        this.f45839a = ijVar;
    }
}

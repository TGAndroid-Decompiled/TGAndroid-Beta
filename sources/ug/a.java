package ug;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.sj;
public final class a {
    public RecyclerView f45556a;
    public int f45557b;
    public long f45558c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f45557b) {
                if (this.f45558c != 0 && messageObject.getGroupId() == this.f45558c) {
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
        if (this.f45557b == i10 && this.f45558c == j10) {
            return false;
        }
        this.f45557b = i10;
        this.f45558c = j10;
        if (i10 == 0) {
            this.e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(sj sjVar) {
        this.f45556a = sjVar;
    }
}

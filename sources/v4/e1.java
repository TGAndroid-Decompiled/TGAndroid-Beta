package v4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.r2;
public abstract class e1 {
    public static final List f58534u = Collections.EMPTY_LIST;
    public final View f58535a;
    public WeakReference f58536b;
    public int f58544l;
    public RecyclerView f58552t;
    public int f58537c = -1;
    public int d = -1;
    public long f58538e = -1;
    public int f58539f = -1;
    public int f58540g = -1;
    public int h = -1;
    public int f58541i = -1;
    public e1 f58542j = null;
    public e1 f58543k = null;
    public ArrayList f58545m = null;
    public List f58546n = null;
    public int f58547o = 0;
    public w0 f58548p = null;
    public boolean f58549q = false;
    public int f58550r = 0;
    public int f58551s = -1;

    public e1(View view) {
        if (view != null) {
            this.f58535a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i7) {
        this.f58544l = i7 | this.f58544l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f58552t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i7 = this.f58540g;
        if (i7 == -1) {
            return this.f58537c;
        }
        return i7;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f58544l & 1024) == 0 && (arrayList = this.f58545m) != null && arrayList.size() != 0) {
            return this.f58546n;
        }
        return f58534u;
    }

    public final boolean e(int i7) {
        if ((i7 & this.f58544l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f58535a;
        if (view.getParent() != null && view.getParent() != this.f58552t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f58544l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f58544l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f58544l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f55671a;
            if (!this.f58535a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f58544l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f58548p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f58544l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f58544l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i7, boolean z10) {
        if (this.d == -1) {
            this.d = this.f58537c;
        }
        if (this.f58540g == -1) {
            this.f58540g = this.f58537c;
        }
        if (z10) {
            this.f58540g += i7;
        }
        this.f58537c += i7;
        View view = this.f58535a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f58639c = true;
        }
    }

    public final void o() {
        this.f58544l = 0;
        int i7 = this.f58537c;
        if (i7 != -1) {
            this.h = i7;
        }
        this.f58537c = -1;
        this.d = -1;
        this.f58538e = -1L;
        this.f58540g = -1;
        this.f58547o = 0;
        this.f58542j = null;
        this.f58543k = null;
        ArrayList arrayList = this.f58545m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f58544l &= -1025;
        this.f58550r = 0;
        this.f58551s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i7, int i10) {
        this.f58544l = (i7 & i10) | (this.f58544l & (~i10));
    }

    public final void q(boolean z10) {
        int i7;
        int i10 = this.f58547o;
        if (z10) {
            i7 = i10 - 1;
        } else {
            i7 = i10 + 1;
        }
        this.f58547o = i7;
        if (i7 >= 0) {
            if (!z10 && i7 == 1) {
                this.f58544l |= 16;
                return;
            } else if (z10 && i7 == 0) {
                this.f58544l &= -17;
                return;
            } else {
                return;
            }
        }
        this.f58547o = 0;
        boolean z11 = r2.f26206a;
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }

    public final boolean r() {
        if ((this.f58544l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f58544l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f58537c + " id=" + this.f58538e + ", oldPos=" + this.d + ", pLpos:" + this.f58540g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f58549q) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb2.append(str);
        }
        if (h()) {
            sb2.append(" invalid");
        }
        if (!g()) {
            sb2.append(" unbound");
        }
        if ((this.f58544l & 2) != 0) {
            sb2.append(" update");
        }
        if (j()) {
            sb2.append(" removed");
        }
        if (r()) {
            sb2.append(" ignored");
        }
        if (l()) {
            sb2.append(" tmpDetached");
        }
        if (!i()) {
            sb2.append(" not recyclable(" + this.f58547o + ")");
        }
        if ((this.f58544l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f58535a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

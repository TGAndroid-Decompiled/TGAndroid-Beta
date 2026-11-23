package v4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.s2;
public abstract class f1 {
    public static final List f59244u = Collections.EMPTY_LIST;
    public final View f59245a;
    public WeakReference f59246b;
    public int f59254l;
    public RecyclerView f59262t;
    public int f59247c = -1;
    public int d = -1;
    public long f59248e = -1;
    public int f59249f = -1;
    public int f59250g = -1;
    public int h = -1;
    public int f59251i = -1;
    public f1 f59252j = null;
    public f1 f59253k = null;
    public ArrayList f59255m = null;
    public List f59256n = null;
    public int f59257o = 0;
    public x0 f59258p = null;
    public boolean f59259q = false;
    public int f59260r = 0;
    public int f59261s = -1;

    public f1(View view) {
        if (view != null) {
            this.f59245a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i7) {
        this.f59254l = i7 | this.f59254l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f59262t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i7 = this.f59250g;
        if (i7 == -1) {
            return this.f59247c;
        }
        return i7;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f59254l & 1024) == 0 && (arrayList = this.f59255m) != null && arrayList.size() != 0) {
            return this.f59256n;
        }
        return f59244u;
    }

    public final boolean e(int i7) {
        if ((i7 & this.f59254l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f59245a;
        if (view.getParent() != null && view.getParent() != this.f59262t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f59254l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f59254l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f59254l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f56367a;
            if (!this.f59245a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f59254l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f59258p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f59254l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f59254l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i7, boolean z10) {
        if (this.d == -1) {
            this.d = this.f59247c;
        }
        if (this.f59250g == -1) {
            this.f59250g = this.f59247c;
        }
        if (z10) {
            this.f59250g += i7;
        }
        this.f59247c += i7;
        View view = this.f59245a;
        if (view.getLayoutParams() != null) {
            ((q0) view.getLayoutParams()).f59349c = true;
        }
    }

    public final void o() {
        this.f59254l = 0;
        int i7 = this.f59247c;
        if (i7 != -1) {
            this.h = i7;
        }
        this.f59247c = -1;
        this.d = -1;
        this.f59248e = -1L;
        this.f59250g = -1;
        this.f59257o = 0;
        this.f59252j = null;
        this.f59253k = null;
        ArrayList arrayList = this.f59255m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f59254l &= -1025;
        this.f59260r = 0;
        this.f59261s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i7, int i10) {
        this.f59254l = (i7 & i10) | (this.f59254l & (~i10));
    }

    public final void q(boolean z10) {
        int i7;
        int i10 = this.f59257o;
        if (z10) {
            i7 = i10 - 1;
        } else {
            i7 = i10 + 1;
        }
        this.f59257o = i7;
        if (i7 >= 0) {
            if (!z10 && i7 == 1) {
                this.f59254l |= 16;
                return;
            } else if (z10 && i7 == 0) {
                this.f59254l &= -17;
                return;
            } else {
                return;
            }
        }
        this.f59257o = 0;
        boolean z11 = s2.f26829a;
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }

    public final boolean r() {
        if ((this.f59254l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f59254l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f59247c + " id=" + this.f59248e + ", oldPos=" + this.d + ", pLpos:" + this.f59250g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f59259q) {
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
        if ((this.f59254l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f59257o + ")");
        }
        if ((this.f59254l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f59245a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

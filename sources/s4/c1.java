package s4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.v2;
public abstract class c1 {
    public static final List f47897u = Collections.EMPTY_LIST;
    public final View f47898a;
    public WeakReference f47899b;
    public int f47906l;
    public RecyclerView f47914t;
    public int f47900c = -1;
    public int d = -1;
    public long e = -1;
    public int f47901f = -1;
    public int f47902g = -1;
    public int h = -1;
    public int f47903i = -1;
    public c1 f47904j = null;
    public c1 f47905k = null;
    public ArrayList f47907m = null;
    public List f47908n = null;
    public int f47909o = 0;
    public hf.e f47910p = null;
    public boolean f47911q = false;
    public int f47912r = 0;
    public int f47913s = -1;

    public c1(View view) {
        if (view != null) {
            this.f47898a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f47906l = i10 | this.f47906l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f47914t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f47902g;
        if (i10 == -1) {
            return this.f47900c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f47906l & 1024) == 0 && (arrayList = this.f47907m) != null && arrayList.size() != 0) {
            return this.f47908n;
        }
        return f47897u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f47906l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f47898a;
        if (view.getParent() != null && view.getParent() != this.f47914t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f47906l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f47906l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f47906l & 16) == 0) {
            WeakHashMap weakHashMap = r0.h0.f46123a;
            if (!this.f47898a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f47906l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f47910p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f47906l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f47906l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f47900c;
        }
        if (this.f47902g == -1) {
            this.f47902g = this.f47900c;
        }
        if (z10) {
            this.f47902g += i10;
        }
        this.f47900c += i10;
        View view = this.f47898a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).f47994c = true;
        }
    }

    public final void o() {
        this.f47906l = 0;
        int i10 = this.f47900c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f47900c = -1;
        this.d = -1;
        this.e = -1L;
        this.f47902g = -1;
        this.f47909o = 0;
        this.f47904j = null;
        this.f47905k = null;
        ArrayList arrayList = this.f47907m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f47906l &= -1025;
        this.f47912r = 0;
        this.f47913s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f47906l = (i10 & i11) | (this.f47906l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f47909o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f47909o = i10;
        if (i10 >= 0) {
            if (!z10 && i10 == 1) {
                this.f47906l |= 16;
                return;
            } else if (z10 && i10 == 0) {
                this.f47906l &= -17;
                return;
            } else {
                return;
            }
        }
        this.f47909o = 0;
        boolean z11 = v2.f18448a;
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }

    public final boolean r() {
        if ((this.f47906l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f47906l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f47900c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f47902g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f47911q) {
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
        if ((this.f47906l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f47909o + ")");
        }
        if ((this.f47906l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f47898a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

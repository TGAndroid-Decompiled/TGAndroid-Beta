package s4;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
public abstract class d1 {
    public static final List f47888u = Collections.EMPTY_LIST;
    public final View f47889a;
    public WeakReference f47890b;
    public int f47898l;
    public RecyclerView f47906t;
    public int f47891c = -1;
    public int d = -1;
    public long f47892e = -1;
    public int f47893f = -1;
    public int f47894g = -1;
    public int h = -1;
    public int f47895i = -1;
    public d1 f47896j = null;
    public d1 f47897k = null;
    public ArrayList f47899m = null;
    public List f47900n = null;
    public int f47901o = 0;
    public pf.e f47902p = null;
    public boolean f47903q = false;
    public int f47904r = 0;
    public int f47905s = -1;

    public d1(View view) {
        if (view != null) {
            this.f47889a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f47898l = i10 | this.f47898l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f47906t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f47894g;
        if (i10 == -1) {
            return this.f47891c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f47898l & 1024) == 0 && (arrayList = this.f47899m) != null && arrayList.size() != 0) {
            return this.f47900n;
        }
        return f47888u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f47898l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f47889a;
        if (view.getParent() != null && view.getParent() != this.f47906t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f47898l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f47898l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f47898l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f46981a;
            if (!this.f47889a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f47898l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f47902p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f47898l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f47898l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f47891c;
        }
        if (this.f47894g == -1) {
            this.f47894g = this.f47891c;
        }
        if (z10) {
            this.f47894g += i10;
        }
        this.f47891c += i10;
        View view = this.f47889a;
        if (view.getLayoutParams() != null) {
            ((q0) view.getLayoutParams()).f48013c = true;
        }
    }

    public final void o() {
        this.f47898l = 0;
        int i10 = this.f47891c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f47891c = -1;
        this.d = -1;
        this.f47892e = -1L;
        this.f47894g = -1;
        this.f47901o = 0;
        this.f47896j = null;
        this.f47897k = null;
        ArrayList arrayList = this.f47899m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f47898l &= -1025;
        this.f47904r = 0;
        this.f47905s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f47898l = (i10 & i11) | (this.f47898l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f47901o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f47901o = i10;
        if (i10 < 0) {
            this.f47901o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f47898l |= 16;
        } else if (z10 && i10 == 0) {
            this.f47898l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f47898l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f47898l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f47891c + " id=" + this.f47892e + ", oldPos=" + this.d + ", pLpos:" + this.f47894g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f47903q) {
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
        if ((this.f47898l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f47901o + ")");
        }
        if ((this.f47898l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f47889a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

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
    public static final List f47657u = Collections.EMPTY_LIST;
    public final View f47658a;
    public WeakReference f47659b;
    public int f47667l;
    public RecyclerView f47675t;
    public int f47660c = -1;
    public int d = -1;
    public long f47661e = -1;
    public int f47662f = -1;
    public int f47663g = -1;
    public int h = -1;
    public int f47664i = -1;
    public d1 f47665j = null;
    public d1 f47666k = null;
    public ArrayList f47668m = null;
    public List f47669n = null;
    public int f47670o = 0;
    public pf.e f47671p = null;
    public boolean f47672q = false;
    public int f47673r = 0;
    public int f47674s = -1;

    public d1(View view) {
        if (view != null) {
            this.f47658a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f47667l = i10 | this.f47667l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f47675t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f47663g;
        if (i10 == -1) {
            return this.f47660c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f47667l & 1024) == 0 && (arrayList = this.f47668m) != null && arrayList.size() != 0) {
            return this.f47669n;
        }
        return f47657u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f47667l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f47658a;
        if (view.getParent() != null && view.getParent() != this.f47675t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f47667l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f47667l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f47667l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f46766a;
            if (!this.f47658a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f47667l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f47671p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f47667l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f47667l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f47660c;
        }
        if (this.f47663g == -1) {
            this.f47663g = this.f47660c;
        }
        if (z10) {
            this.f47663g += i10;
        }
        this.f47660c += i10;
        View view = this.f47658a;
        if (view.getLayoutParams() != null) {
            ((q0) view.getLayoutParams()).f47782c = true;
        }
    }

    public final void o() {
        this.f47667l = 0;
        int i10 = this.f47660c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f47660c = -1;
        this.d = -1;
        this.f47661e = -1L;
        this.f47663g = -1;
        this.f47670o = 0;
        this.f47665j = null;
        this.f47666k = null;
        ArrayList arrayList = this.f47668m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f47667l &= -1025;
        this.f47673r = 0;
        this.f47674s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f47667l = (i10 & i11) | (this.f47667l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f47670o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f47670o = i10;
        if (i10 < 0) {
            this.f47670o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f47667l |= 16;
        } else if (z10 && i10 == 0) {
            this.f47667l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f47667l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f47667l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f47660c + " id=" + this.f47661e + ", oldPos=" + this.d + ", pLpos:" + this.f47663g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f47672q) {
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
        if ((this.f47667l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f47670o + ")");
        }
        if ((this.f47667l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f47658a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

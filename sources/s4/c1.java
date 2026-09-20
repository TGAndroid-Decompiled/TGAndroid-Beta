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
public abstract class c1 {
    public static final List f42973u = Collections.EMPTY_LIST;
    public final View f42974a;
    public WeakReference f42975b;
    public int f42982l;
    public RecyclerView f42990t;
    public int f42976c = -1;
    public int d = -1;
    public long e = -1;
    public int f42977f = -1;
    public int f42978g = -1;
    public int h = -1;
    public int f42979i = -1;
    public c1 f42980j = null;
    public c1 f42981k = null;
    public ArrayList f42983m = null;
    public List f42984n = null;
    public int f42985o = 0;
    public of.e f42986p = null;
    public boolean f42987q = false;
    public int f42988r = 0;
    public int f42989s = -1;

    public c1(View view) {
        if (view != null) {
            this.f42974a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f42982l = i10 | this.f42982l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f42990t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.O(this);
    }

    public final int c() {
        int i10 = this.f42978g;
        if (i10 == -1) {
            return this.f42976c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f42982l & 1024) == 0 && (arrayList = this.f42983m) != null && arrayList.size() != 0) {
            return this.f42984n;
        }
        return f42973u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f42982l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f42974a;
        if (view.getParent() != null && view.getParent() != this.f42990t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f42982l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f42982l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f42982l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f42142a;
            if (!this.f42974a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f42982l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f42986p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f42982l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f42982l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f42976c;
        }
        if (this.f42978g == -1) {
            this.f42978g = this.f42976c;
        }
        if (z10) {
            this.f42978g += i10;
        }
        this.f42976c += i10;
        View view = this.f42974a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f43082c = true;
        }
    }

    public final void o() {
        this.f42982l = 0;
        int i10 = this.f42976c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f42976c = -1;
        this.d = -1;
        this.e = -1L;
        this.f42978g = -1;
        this.f42985o = 0;
        this.f42980j = null;
        this.f42981k = null;
        ArrayList arrayList = this.f42983m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f42982l &= -1025;
        this.f42988r = 0;
        this.f42989s = -1;
        RecyclerView.n(this);
    }

    public final void p(int i10, int i11) {
        this.f42982l = (i10 & i11) | (this.f42982l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f42985o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f42985o = i10;
        if (i10 < 0) {
            this.f42985o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f42982l |= 16;
        } else if (z10 && i10 == 0) {
            this.f42982l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f42982l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f42982l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f42976c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f42978g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f42987q) {
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
        if ((this.f42982l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f42985o + ")");
        }
        if ((this.f42982l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f42974a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

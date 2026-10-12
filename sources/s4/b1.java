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
public abstract class b1 {
    public static final List f44837u = Collections.EMPTY_LIST;
    public final View f44838a;
    public WeakReference f44839b;
    public int f44846l;
    public RecyclerView f44854t;
    public int f44840c = -1;
    public int d = -1;
    public long e = -1;
    public int f44841f = -1;
    public int f44842g = -1;
    public int h = -1;
    public int f44843i = -1;
    public b1 f44844j = null;
    public b1 f44845k = null;
    public ArrayList f44847m = null;
    public List f44848n = null;
    public int f44849o = 0;
    public qf.e f44850p = null;
    public boolean f44851q = false;
    public int f44852r = 0;
    public int f44853s = -1;

    public b1(View view) {
        if (view != null) {
            this.f44838a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f44846l = i10 | this.f44846l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f44854t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f44842g;
        if (i10 == -1) {
            return this.f44840c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f44846l & 1024) == 0 && (arrayList = this.f44847m) != null && arrayList.size() != 0) {
            return this.f44848n;
        }
        return f44837u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f44846l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f44838a;
        if (view.getParent() != null && view.getParent() != this.f44854t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f44846l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f44846l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f44846l & 16) == 0) {
            WeakHashMap weakHashMap = r0.j0.f43732a;
            if (!this.f44838a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f44846l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f44850p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f44846l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f44846l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f44840c;
        }
        if (this.f44842g == -1) {
            this.f44842g = this.f44840c;
        }
        if (z10) {
            this.f44842g += i10;
        }
        this.f44840c += i10;
        View view = this.f44838a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).f44944c = true;
        }
    }

    public final void o() {
        this.f44846l = 0;
        int i10 = this.f44840c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f44840c = -1;
        this.d = -1;
        this.e = -1L;
        this.f44842g = -1;
        this.f44849o = 0;
        this.f44844j = null;
        this.f44845k = null;
        ArrayList arrayList = this.f44847m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f44846l &= -1025;
        this.f44852r = 0;
        this.f44853s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f44846l = (i10 & i11) | (this.f44846l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f44849o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f44849o = i10;
        if (i10 < 0) {
            this.f44849o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f44846l |= 16;
        } else if (z10 && i10 == 0) {
            this.f44846l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f44846l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f44846l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f44840c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f44842g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f44851q) {
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
        if ((this.f44846l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f44849o + ")");
        }
        if ((this.f44846l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f44838a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

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
    public static final List f42928u = Collections.EMPTY_LIST;
    public final View f42929a;
    public WeakReference f42930b;
    public int f42937l;
    public RecyclerView f42945t;
    public int f42931c = -1;
    public int d = -1;
    public long e = -1;
    public int f42932f = -1;
    public int f42933g = -1;
    public int h = -1;
    public int f42934i = -1;
    public c1 f42935j = null;
    public c1 f42936k = null;
    public ArrayList f42938m = null;
    public List f42939n = null;
    public int f42940o = 0;
    public of.e f42941p = null;
    public boolean f42942q = false;
    public int f42943r = 0;
    public int f42944s = -1;

    public c1(View view) {
        if (view != null) {
            this.f42929a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f42937l = i10 | this.f42937l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f42945t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.O(this);
    }

    public final int c() {
        int i10 = this.f42933g;
        if (i10 == -1) {
            return this.f42931c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f42937l & 1024) == 0 && (arrayList = this.f42938m) != null && arrayList.size() != 0) {
            return this.f42939n;
        }
        return f42928u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f42937l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f42929a;
        if (view.getParent() != null && view.getParent() != this.f42945t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f42937l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f42937l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f42937l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f42096a;
            if (!this.f42929a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f42937l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f42941p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f42937l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f42937l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f42931c;
        }
        if (this.f42933g == -1) {
            this.f42933g = this.f42931c;
        }
        if (z10) {
            this.f42933g += i10;
        }
        this.f42931c += i10;
        View view = this.f42929a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f43037c = true;
        }
    }

    public final void o() {
        this.f42937l = 0;
        int i10 = this.f42931c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f42931c = -1;
        this.d = -1;
        this.e = -1L;
        this.f42933g = -1;
        this.f42940o = 0;
        this.f42935j = null;
        this.f42936k = null;
        ArrayList arrayList = this.f42938m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f42937l &= -1025;
        this.f42943r = 0;
        this.f42944s = -1;
        RecyclerView.n(this);
    }

    public final void p(int i10, int i11) {
        this.f42937l = (i10 & i11) | (this.f42937l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f42940o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f42940o = i10;
        if (i10 < 0) {
            this.f42940o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f42937l |= 16;
        } else if (z10 && i10 == 0) {
            this.f42937l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f42937l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f42937l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f42931c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f42933g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f42942q) {
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
        if ((this.f42937l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f42940o + ")");
        }
        if ((this.f42937l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f42929a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

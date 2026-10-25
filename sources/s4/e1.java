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
public abstract class e1 {
    public static final List f47734u = Collections.EMPTY_LIST;
    public final View f47735a;
    public WeakReference f47736b;
    public int f47743l;
    public RecyclerView f47751t;
    public int f47737c = -1;
    public int d = -1;
    public long e = -1;
    public int f47738f = -1;
    public int f47739g = -1;
    public int h = -1;
    public int f47740i = -1;
    public e1 f47741j = null;
    public e1 f47742k = null;
    public ArrayList f47744m = null;
    public List f47745n = null;
    public int f47746o = 0;
    public rf.e f47747p = null;
    public boolean f47748q = false;
    public int f47749r = 0;
    public int f47750s = -1;

    public e1(View view) {
        if (view != null) {
            this.f47735a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f47743l = i10 | this.f47743l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f47751t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f47739g;
        if (i10 == -1) {
            return this.f47737c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f47743l & 1024) == 0 && (arrayList = this.f47744m) != null && arrayList.size() != 0) {
            return this.f47745n;
        }
        return f47734u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f47743l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f47735a;
        if (view.getParent() != null && view.getParent() != this.f47751t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f47743l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f47743l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f47743l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f47105a;
            if (!this.f47735a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f47743l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f47747p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f47743l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f47743l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f47737c;
        }
        if (this.f47739g == -1) {
            this.f47739g = this.f47737c;
        }
        if (z10) {
            this.f47739g += i10;
        }
        this.f47737c += i10;
        View view = this.f47735a;
        if (view.getLayoutParams() != null) {
            ((q0) view.getLayoutParams()).f47831c = true;
        }
    }

    public final void o() {
        this.f47743l = 0;
        int i10 = this.f47737c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f47737c = -1;
        this.d = -1;
        this.e = -1L;
        this.f47739g = -1;
        this.f47746o = 0;
        this.f47741j = null;
        this.f47742k = null;
        ArrayList arrayList = this.f47744m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f47743l &= -1025;
        this.f47749r = 0;
        this.f47750s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f47743l = (i10 & i11) | (this.f47743l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f47746o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f47746o = i10;
        if (i10 < 0) {
            this.f47746o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f47743l |= 16;
        } else if (z10 && i10 == 0) {
            this.f47743l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f47743l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f47743l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f47737c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f47739g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f47748q) {
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
        if ((this.f47743l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f47746o + ")");
        }
        if ((this.f47743l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f47735a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

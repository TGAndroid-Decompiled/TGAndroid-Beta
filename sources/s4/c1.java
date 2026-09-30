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
    public static final List f43067u = Collections.EMPTY_LIST;
    public final View f43068a;
    public WeakReference f43069b;
    public int f43076l;
    public RecyclerView f43084t;
    public int f43070c = -1;
    public int d = -1;
    public long e = -1;
    public int f43071f = -1;
    public int f43072g = -1;
    public int h = -1;
    public int f43073i = -1;
    public c1 f43074j = null;
    public c1 f43075k = null;
    public ArrayList f43077m = null;
    public List f43078n = null;
    public int f43079o = 0;
    public of.e f43080p = null;
    public boolean f43081q = false;
    public int f43082r = 0;
    public int f43083s = -1;

    public c1(View view) {
        if (view != null) {
            this.f43068a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f43076l = i10 | this.f43076l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f43084t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f43072g;
        if (i10 == -1) {
            return this.f43070c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f43076l & 1024) == 0 && (arrayList = this.f43077m) != null && arrayList.size() != 0) {
            return this.f43078n;
        }
        return f43067u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f43076l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f43068a;
        if (view.getParent() != null && view.getParent() != this.f43084t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f43076l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f43076l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f43076l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f42233a;
            if (!this.f43068a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f43076l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f43080p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f43076l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f43076l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f43070c;
        }
        if (this.f43072g == -1) {
            this.f43072g = this.f43070c;
        }
        if (z10) {
            this.f43072g += i10;
        }
        this.f43070c += i10;
        View view = this.f43068a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f43176c = true;
        }
    }

    public final void o() {
        this.f43076l = 0;
        int i10 = this.f43070c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f43070c = -1;
        this.d = -1;
        this.e = -1L;
        this.f43072g = -1;
        this.f43079o = 0;
        this.f43074j = null;
        this.f43075k = null;
        ArrayList arrayList = this.f43077m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f43076l &= -1025;
        this.f43082r = 0;
        this.f43083s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f43076l = (i10 & i11) | (this.f43076l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f43079o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f43079o = i10;
        if (i10 < 0) {
            this.f43079o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f43076l |= 16;
        } else if (z10 && i10 == 0) {
            this.f43076l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f43076l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f43076l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f43070c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f43072g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f43081q) {
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
        if ((this.f43076l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f43079o + ")");
        }
        if ((this.f43076l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f43068a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

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
    public static final List f42994u = Collections.EMPTY_LIST;
    public final View f42995a;
    public WeakReference f42996b;
    public int f43003l;
    public RecyclerView f43011t;
    public int f42997c = -1;
    public int d = -1;
    public long e = -1;
    public int f42998f = -1;
    public int f42999g = -1;
    public int h = -1;
    public int f43000i = -1;
    public c1 f43001j = null;
    public c1 f43002k = null;
    public ArrayList f43004m = null;
    public List f43005n = null;
    public int f43006o = 0;
    public of.e f43007p = null;
    public boolean f43008q = false;
    public int f43009r = 0;
    public int f43010s = -1;

    public c1(View view) {
        if (view != null) {
            this.f42995a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f43003l = i10 | this.f43003l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f43011t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.O(this);
    }

    public final int c() {
        int i10 = this.f42999g;
        if (i10 == -1) {
            return this.f42997c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f43003l & 1024) == 0 && (arrayList = this.f43004m) != null && arrayList.size() != 0) {
            return this.f43005n;
        }
        return f42994u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f43003l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f42995a;
        if (view.getParent() != null && view.getParent() != this.f43011t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f43003l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f43003l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f43003l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f42163a;
            if (!this.f42995a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f43003l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f43007p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f43003l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f43003l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f42997c;
        }
        if (this.f42999g == -1) {
            this.f42999g = this.f42997c;
        }
        if (z10) {
            this.f42999g += i10;
        }
        this.f42997c += i10;
        View view = this.f42995a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f43103c = true;
        }
    }

    public final void o() {
        this.f43003l = 0;
        int i10 = this.f42997c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f42997c = -1;
        this.d = -1;
        this.e = -1L;
        this.f42999g = -1;
        this.f43006o = 0;
        this.f43001j = null;
        this.f43002k = null;
        ArrayList arrayList = this.f43004m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f43003l &= -1025;
        this.f43009r = 0;
        this.f43010s = -1;
        RecyclerView.n(this);
    }

    public final void p(int i10, int i11) {
        this.f43003l = (i10 & i11) | (this.f43003l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f43006o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f43006o = i10;
        if (i10 < 0) {
            this.f43006o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f43003l |= 16;
        } else if (z10 && i10 == 0) {
            this.f43003l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f43003l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f43003l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f42997c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f42999g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f43008q) {
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
        if ((this.f43003l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f43006o + ")");
        }
        if ((this.f43003l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f42995a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

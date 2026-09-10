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
    public static final List f41609u = Collections.EMPTY_LIST;
    public final View f41610a;
    public WeakReference f41611b;
    public int f41618l;
    public RecyclerView f41626t;
    public int f41612c = -1;
    public int d = -1;
    public long e = -1;
    public int f41613f = -1;
    public int f41614g = -1;
    public int h = -1;
    public int f41615i = -1;
    public c1 f41616j = null;
    public c1 f41617k = null;
    public ArrayList f41619m = null;
    public List f41620n = null;
    public int f41621o = 0;
    public of.e f41622p = null;
    public boolean f41623q = false;
    public int f41624r = 0;
    public int f41625s = -1;

    public c1(View view) {
        if (view != null) {
            this.f41610a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f41618l = i10 | this.f41618l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f41626t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f41614g;
        if (i10 == -1) {
            return this.f41612c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f41618l & 1024) == 0 && (arrayList = this.f41619m) != null && arrayList.size() != 0) {
            return this.f41620n;
        }
        return f41609u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f41618l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f41610a;
        if (view.getParent() != null && view.getParent() != this.f41626t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f41618l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f41618l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f41618l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f41062a;
            if (!this.f41610a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f41618l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f41622p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f41618l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f41618l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f41612c;
        }
        if (this.f41614g == -1) {
            this.f41614g = this.f41612c;
        }
        if (z10) {
            this.f41614g += i10;
        }
        this.f41612c += i10;
        View view = this.f41610a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f41718c = true;
        }
    }

    public final void o() {
        this.f41618l = 0;
        int i10 = this.f41612c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f41612c = -1;
        this.d = -1;
        this.e = -1L;
        this.f41614g = -1;
        this.f41621o = 0;
        this.f41616j = null;
        this.f41617k = null;
        ArrayList arrayList = this.f41619m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f41618l &= -1025;
        this.f41624r = 0;
        this.f41625s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f41618l = (i10 & i11) | (this.f41618l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f41621o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f41621o = i10;
        if (i10 < 0) {
            this.f41621o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f41618l |= 16;
        } else if (z10 && i10 == 0) {
            this.f41618l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f41618l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f41618l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f41612c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f41614g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f41623q) {
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
        if ((this.f41618l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f41621o + ")");
        }
        if ((this.f41618l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f41610a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

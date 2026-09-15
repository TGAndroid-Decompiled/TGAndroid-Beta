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
    public static final List f42674u = Collections.EMPTY_LIST;
    public final View f42675a;
    public WeakReference f42676b;
    public int f42683l;
    public RecyclerView f42691t;
    public int f42677c = -1;
    public int d = -1;
    public long e = -1;
    public int f42678f = -1;
    public int f42679g = -1;
    public int h = -1;
    public int f42680i = -1;
    public c1 f42681j = null;
    public c1 f42682k = null;
    public ArrayList f42684m = null;
    public List f42685n = null;
    public int f42686o = 0;
    public of.e f42687p = null;
    public boolean f42688q = false;
    public int f42689r = 0;
    public int f42690s = -1;

    public c1(View view) {
        if (view != null) {
            this.f42675a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f42683l = i10 | this.f42683l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f42691t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f42679g;
        if (i10 == -1) {
            return this.f42677c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f42683l & 1024) == 0 && (arrayList = this.f42684m) != null && arrayList.size() != 0) {
            return this.f42685n;
        }
        return f42674u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f42683l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f42675a;
        if (view.getParent() != null && view.getParent() != this.f42691t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f42683l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f42683l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f42683l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f41843a;
            if (!this.f42675a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f42683l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f42687p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f42683l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f42683l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f42677c;
        }
        if (this.f42679g == -1) {
            this.f42679g = this.f42677c;
        }
        if (z10) {
            this.f42679g += i10;
        }
        this.f42677c += i10;
        View view = this.f42675a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f42783c = true;
        }
    }

    public final void o() {
        this.f42683l = 0;
        int i10 = this.f42677c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f42677c = -1;
        this.d = -1;
        this.e = -1L;
        this.f42679g = -1;
        this.f42686o = 0;
        this.f42681j = null;
        this.f42682k = null;
        ArrayList arrayList = this.f42684m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f42683l &= -1025;
        this.f42689r = 0;
        this.f42690s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f42683l = (i10 & i11) | (this.f42683l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f42686o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f42686o = i10;
        if (i10 < 0) {
            this.f42686o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f42683l |= 16;
        } else if (z10 && i10 == 0) {
            this.f42683l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f42683l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f42683l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f42677c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f42679g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f42688q) {
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
        if ((this.f42683l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f42686o + ")");
        }
        if ((this.f42683l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f42675a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

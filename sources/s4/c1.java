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
    public static final List f42670u = Collections.EMPTY_LIST;
    public final View f42671a;
    public WeakReference f42672b;
    public int f42679l;
    public RecyclerView f42687t;
    public int f42673c = -1;
    public int d = -1;
    public long e = -1;
    public int f42674f = -1;
    public int f42675g = -1;
    public int h = -1;
    public int f42676i = -1;
    public c1 f42677j = null;
    public c1 f42678k = null;
    public ArrayList f42680m = null;
    public List f42681n = null;
    public int f42682o = 0;
    public of.e f42683p = null;
    public boolean f42684q = false;
    public int f42685r = 0;
    public int f42686s = -1;

    public c1(View view) {
        if (view != null) {
            this.f42671a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f42679l = i10 | this.f42679l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f42687t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f42675g;
        if (i10 == -1) {
            return this.f42673c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f42679l & 1024) == 0 && (arrayList = this.f42680m) != null && arrayList.size() != 0) {
            return this.f42681n;
        }
        return f42670u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f42679l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f42671a;
        if (view.getParent() != null && view.getParent() != this.f42687t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f42679l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f42679l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f42679l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f41839a;
            if (!this.f42671a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f42679l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f42683p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f42679l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f42679l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f42673c;
        }
        if (this.f42675g == -1) {
            this.f42675g = this.f42673c;
        }
        if (z10) {
            this.f42675g += i10;
        }
        this.f42673c += i10;
        View view = this.f42671a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f42779c = true;
        }
    }

    public final void o() {
        this.f42679l = 0;
        int i10 = this.f42673c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f42673c = -1;
        this.d = -1;
        this.e = -1L;
        this.f42675g = -1;
        this.f42682o = 0;
        this.f42677j = null;
        this.f42678k = null;
        ArrayList arrayList = this.f42680m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f42679l &= -1025;
        this.f42685r = 0;
        this.f42686s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f42679l = (i10 & i11) | (this.f42679l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f42682o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f42682o = i10;
        if (i10 < 0) {
            this.f42682o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f42679l |= 16;
        } else if (z10 && i10 == 0) {
            this.f42679l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f42679l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f42679l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f42673c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f42675g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f42684q) {
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
        if ((this.f42679l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f42682o + ")");
        }
        if ((this.f42679l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f42671a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

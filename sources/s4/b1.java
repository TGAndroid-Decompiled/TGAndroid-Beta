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
    public static final List f45919u = Collections.EMPTY_LIST;
    public final View f45920a;
    public WeakReference f45921b;
    public int f45928l;
    public RecyclerView f45936t;
    public int f45922c = -1;
    public int d = -1;
    public long e = -1;
    public int f45923f = -1;
    public int f45924g = -1;
    public int h = -1;
    public int f45925i = -1;
    public b1 f45926j = null;
    public b1 f45927k = null;
    public ArrayList f45929m = null;
    public List f45930n = null;
    public int f45931o = 0;
    public qf.e f45932p = null;
    public boolean f45933q = false;
    public int f45934r = 0;
    public int f45935s = -1;

    public b1(View view) {
        if (view != null) {
            this.f45920a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f45928l = i10 | this.f45928l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f45936t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f45924g;
        if (i10 == -1) {
            return this.f45922c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f45928l & 1024) == 0 && (arrayList = this.f45929m) != null && arrayList.size() != 0) {
            return this.f45930n;
        }
        return f45919u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f45928l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f45920a;
        if (view.getParent() != null && view.getParent() != this.f45936t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f45928l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f45928l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f45928l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f44829a;
            if (!this.f45920a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f45928l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f45932p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f45928l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f45928l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f45922c;
        }
        if (this.f45924g == -1) {
            this.f45924g = this.f45922c;
        }
        if (z10) {
            this.f45924g += i10;
        }
        this.f45922c += i10;
        View view = this.f45920a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).f46026c = true;
        }
    }

    public final void o() {
        this.f45928l = 0;
        int i10 = this.f45922c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f45922c = -1;
        this.d = -1;
        this.e = -1L;
        this.f45924g = -1;
        this.f45931o = 0;
        this.f45926j = null;
        this.f45927k = null;
        ArrayList arrayList = this.f45929m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f45928l &= -1025;
        this.f45934r = 0;
        this.f45935s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f45928l = (i10 & i11) | (this.f45928l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f45931o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f45931o = i10;
        if (i10 < 0) {
            this.f45931o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f45928l |= 16;
        } else if (z10 && i10 == 0) {
            this.f45928l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f45928l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f45928l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f45922c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f45924g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f45933q) {
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
        if ((this.f45928l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f45931o + ")");
        }
        if ((this.f45928l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f45920a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

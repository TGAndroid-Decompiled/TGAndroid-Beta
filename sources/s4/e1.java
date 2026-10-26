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
    public static final List f47737u = Collections.EMPTY_LIST;
    public final View f47738a;
    public WeakReference f47739b;
    public int f47746l;
    public RecyclerView f47754t;
    public int f47740c = -1;
    public int d = -1;
    public long e = -1;
    public int f47741f = -1;
    public int f47742g = -1;
    public int h = -1;
    public int f47743i = -1;
    public e1 f47744j = null;
    public e1 f47745k = null;
    public ArrayList f47747m = null;
    public List f47748n = null;
    public int f47749o = 0;
    public rf.e f47750p = null;
    public boolean f47751q = false;
    public int f47752r = 0;
    public int f47753s = -1;

    public e1(View view) {
        if (view != null) {
            this.f47738a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f47746l = i10 | this.f47746l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f47754t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f47742g;
        if (i10 == -1) {
            return this.f47740c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f47746l & 1024) == 0 && (arrayList = this.f47747m) != null && arrayList.size() != 0) {
            return this.f47748n;
        }
        return f47737u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f47746l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f47738a;
        if (view.getParent() != null && view.getParent() != this.f47754t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f47746l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f47746l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f47746l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f47108a;
            if (!this.f47738a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f47746l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f47750p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f47746l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f47746l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f47740c;
        }
        if (this.f47742g == -1) {
            this.f47742g = this.f47740c;
        }
        if (z10) {
            this.f47742g += i10;
        }
        this.f47740c += i10;
        View view = this.f47738a;
        if (view.getLayoutParams() != null) {
            ((q0) view.getLayoutParams()).f47834c = true;
        }
    }

    public final void o() {
        this.f47746l = 0;
        int i10 = this.f47740c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f47740c = -1;
        this.d = -1;
        this.e = -1L;
        this.f47742g = -1;
        this.f47749o = 0;
        this.f47744j = null;
        this.f47745k = null;
        ArrayList arrayList = this.f47747m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f47746l &= -1025;
        this.f47752r = 0;
        this.f47753s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f47746l = (i10 & i11) | (this.f47746l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f47749o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f47749o = i10;
        if (i10 < 0) {
            this.f47749o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f47746l |= 16;
        } else if (z10 && i10 == 0) {
            this.f47746l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f47746l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f47746l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f47740c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f47742g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f47751q) {
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
        if ((this.f47746l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f47749o + ")");
        }
        if ((this.f47746l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f47738a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

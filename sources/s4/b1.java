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
    public static final List f46341u = Collections.EMPTY_LIST;
    public final View f46342a;
    public WeakReference f46343b;
    public int f46350l;
    public RecyclerView f46358t;
    public int f46344c = -1;
    public int d = -1;
    public long e = -1;
    public int f46345f = -1;
    public int f46346g = -1;
    public int h = -1;
    public int f46347i = -1;
    public b1 f46348j = null;
    public b1 f46349k = null;
    public ArrayList f46351m = null;
    public List f46352n = null;
    public int f46353o = 0;
    public qf.e f46354p = null;
    public boolean f46355q = false;
    public int f46356r = 0;
    public int f46357s = -1;

    public b1(View view) {
        if (view != null) {
            this.f46342a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f46350l = i10 | this.f46350l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f46358t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f46346g;
        if (i10 == -1) {
            return this.f46344c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f46350l & 1024) == 0 && (arrayList = this.f46351m) != null && arrayList.size() != 0) {
            return this.f46352n;
        }
        return f46341u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f46350l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f46342a;
        if (view.getParent() != null && view.getParent() != this.f46358t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f46350l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f46350l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f46350l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f45241a;
            if (!this.f46342a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f46350l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f46354p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f46350l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f46350l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f46344c;
        }
        if (this.f46346g == -1) {
            this.f46346g = this.f46344c;
        }
        if (z10) {
            this.f46346g += i10;
        }
        this.f46344c += i10;
        View view = this.f46342a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).f46448c = true;
        }
    }

    public final void o() {
        this.f46350l = 0;
        int i10 = this.f46344c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f46344c = -1;
        this.d = -1;
        this.e = -1L;
        this.f46346g = -1;
        this.f46353o = 0;
        this.f46348j = null;
        this.f46349k = null;
        ArrayList arrayList = this.f46351m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f46350l &= -1025;
        this.f46356r = 0;
        this.f46357s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f46350l = (i10 & i11) | (this.f46350l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f46353o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f46353o = i10;
        if (i10 < 0) {
            this.f46353o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f46350l |= 16;
        } else if (z10 && i10 == 0) {
            this.f46350l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f46350l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f46350l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f46344c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f46346g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f46355q) {
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
        if ((this.f46350l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f46353o + ")");
        }
        if ((this.f46350l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f46342a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

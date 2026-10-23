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
    public static final List f46342u = Collections.EMPTY_LIST;
    public final View f46343a;
    public WeakReference f46344b;
    public int f46351l;
    public RecyclerView f46359t;
    public int f46345c = -1;
    public int d = -1;
    public long e = -1;
    public int f46346f = -1;
    public int f46347g = -1;
    public int h = -1;
    public int f46348i = -1;
    public b1 f46349j = null;
    public b1 f46350k = null;
    public ArrayList f46352m = null;
    public List f46353n = null;
    public int f46354o = 0;
    public qf.e f46355p = null;
    public boolean f46356q = false;
    public int f46357r = 0;
    public int f46358s = -1;

    public b1(View view) {
        if (view != null) {
            this.f46343a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f46351l = i10 | this.f46351l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f46359t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f46347g;
        if (i10 == -1) {
            return this.f46345c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f46351l & 1024) == 0 && (arrayList = this.f46352m) != null && arrayList.size() != 0) {
            return this.f46353n;
        }
        return f46342u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f46351l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f46343a;
        if (view.getParent() != null && view.getParent() != this.f46359t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f46351l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f46351l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f46351l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f45242a;
            if (!this.f46343a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f46351l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f46355p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f46351l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f46351l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f46345c;
        }
        if (this.f46347g == -1) {
            this.f46347g = this.f46345c;
        }
        if (z10) {
            this.f46347g += i10;
        }
        this.f46345c += i10;
        View view = this.f46343a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).f46449c = true;
        }
    }

    public final void o() {
        this.f46351l = 0;
        int i10 = this.f46345c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f46345c = -1;
        this.d = -1;
        this.e = -1L;
        this.f46347g = -1;
        this.f46354o = 0;
        this.f46349j = null;
        this.f46350k = null;
        ArrayList arrayList = this.f46352m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f46351l &= -1025;
        this.f46357r = 0;
        this.f46358s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f46351l = (i10 & i11) | (this.f46351l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f46354o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f46354o = i10;
        if (i10 < 0) {
            this.f46354o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f46351l |= 16;
        } else if (z10 && i10 == 0) {
            this.f46351l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f46351l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f46351l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f46345c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f46347g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f46356q) {
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
        if ((this.f46351l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f46354o + ")");
        }
        if ((this.f46351l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f46343a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

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
    public static final List f45737u = Collections.EMPTY_LIST;
    public final View f45738a;
    public WeakReference f45739b;
    public int f45747l;
    public RecyclerView f45755t;
    public int f45740c = -1;
    public int d = -1;
    public long f45741e = -1;
    public int f45742f = -1;
    public int f45743g = -1;
    public int h = -1;
    public int f45744i = -1;
    public c1 f45745j = null;
    public c1 f45746k = null;
    public ArrayList f45748m = null;
    public List f45749n = null;
    public int f45750o = 0;
    public pf.e f45751p = null;
    public boolean f45752q = false;
    public int f45753r = 0;
    public int f45754s = -1;

    public c1(View view) {
        if (view != null) {
            this.f45738a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f45747l = i10 | this.f45747l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f45755t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f45743g;
        if (i10 == -1) {
            return this.f45740c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f45747l & 1024) == 0 && (arrayList = this.f45748m) != null && arrayList.size() != 0) {
            return this.f45749n;
        }
        return f45737u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f45747l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f45738a;
        if (view.getParent() != null && view.getParent() != this.f45755t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f45747l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f45747l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f45747l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f44697a;
            if (!this.f45738a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f45747l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f45751p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f45747l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f45747l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f45740c;
        }
        if (this.f45743g == -1) {
            this.f45743g = this.f45740c;
        }
        if (z10) {
            this.f45743g += i10;
        }
        this.f45740c += i10;
        View view = this.f45738a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f45859c = true;
        }
    }

    public final void o() {
        this.f45747l = 0;
        int i10 = this.f45740c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f45740c = -1;
        this.d = -1;
        this.f45741e = -1L;
        this.f45743g = -1;
        this.f45750o = 0;
        this.f45745j = null;
        this.f45746k = null;
        ArrayList arrayList = this.f45748m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f45747l &= -1025;
        this.f45753r = 0;
        this.f45754s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f45747l = (i10 & i11) | (this.f45747l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f45750o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f45750o = i10;
        if (i10 < 0) {
            this.f45750o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f45747l |= 16;
        } else if (z10 && i10 == 0) {
            this.f45747l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f45747l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f45747l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f45740c + " id=" + this.f45741e + ", oldPos=" + this.d + ", pLpos:" + this.f45743g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f45752q) {
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
        if ((this.f45747l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f45750o + ")");
        }
        if ((this.f45747l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f45738a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

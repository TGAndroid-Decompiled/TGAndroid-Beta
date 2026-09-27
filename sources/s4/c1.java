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
    public static final List f43004u = Collections.EMPTY_LIST;
    public final View f43005a;
    public WeakReference f43006b;
    public int f43013l;
    public RecyclerView f43021t;
    public int f43007c = -1;
    public int d = -1;
    public long e = -1;
    public int f43008f = -1;
    public int f43009g = -1;
    public int h = -1;
    public int f43010i = -1;
    public c1 f43011j = null;
    public c1 f43012k = null;
    public ArrayList f43014m = null;
    public List f43015n = null;
    public int f43016o = 0;
    public of.e f43017p = null;
    public boolean f43018q = false;
    public int f43019r = 0;
    public int f43020s = -1;

    public c1(View view) {
        if (view != null) {
            this.f43005a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f43013l = i10 | this.f43013l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f43021t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.O(this);
    }

    public final int c() {
        int i10 = this.f43009g;
        if (i10 == -1) {
            return this.f43007c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f43013l & 1024) == 0 && (arrayList = this.f43014m) != null && arrayList.size() != 0) {
            return this.f43015n;
        }
        return f43004u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f43013l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f43005a;
        if (view.getParent() != null && view.getParent() != this.f43021t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f43013l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f43013l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f43013l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f42173a;
            if (!this.f43005a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f43013l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f43017p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f43013l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f43013l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f43007c;
        }
        if (this.f43009g == -1) {
            this.f43009g = this.f43007c;
        }
        if (z10) {
            this.f43009g += i10;
        }
        this.f43007c += i10;
        View view = this.f43005a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f43113c = true;
        }
    }

    public final void o() {
        this.f43013l = 0;
        int i10 = this.f43007c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f43007c = -1;
        this.d = -1;
        this.e = -1L;
        this.f43009g = -1;
        this.f43016o = 0;
        this.f43011j = null;
        this.f43012k = null;
        ArrayList arrayList = this.f43014m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f43013l &= -1025;
        this.f43019r = 0;
        this.f43020s = -1;
        RecyclerView.n(this);
    }

    public final void p(int i10, int i11) {
        this.f43013l = (i10 & i11) | (this.f43013l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f43016o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f43016o = i10;
        if (i10 < 0) {
            this.f43016o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f43013l |= 16;
        } else if (z10 && i10 == 0) {
            this.f43013l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f43013l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f43013l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f43007c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f43009g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f43018q) {
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
        if ((this.f43013l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f43016o + ")");
        }
        if ((this.f43013l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f43005a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

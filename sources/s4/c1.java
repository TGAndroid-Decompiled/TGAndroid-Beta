package s4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.v2;
public abstract class c1 {
    public static final List f47908u = Collections.EMPTY_LIST;
    public final View f47909a;
    public WeakReference f47910b;
    public int f47917l;
    public RecyclerView f47925t;
    public int f47911c = -1;
    public int d = -1;
    public long e = -1;
    public int f47912f = -1;
    public int f47913g = -1;
    public int h = -1;
    public int f47914i = -1;
    public c1 f47915j = null;
    public c1 f47916k = null;
    public ArrayList f47918m = null;
    public List f47919n = null;
    public int f47920o = 0;
    public hf.e f47921p = null;
    public boolean f47922q = false;
    public int f47923r = 0;
    public int f47924s = -1;

    public c1(View view) {
        if (view != null) {
            this.f47909a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f47917l = i10 | this.f47917l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f47925t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f47913g;
        if (i10 == -1) {
            return this.f47911c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f47917l & 1024) == 0 && (arrayList = this.f47918m) != null && arrayList.size() != 0) {
            return this.f47919n;
        }
        return f47908u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f47917l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f47909a;
        if (view.getParent() != null && view.getParent() != this.f47925t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f47917l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f47917l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f47917l & 16) == 0) {
            WeakHashMap weakHashMap = r0.h0.f46134a;
            if (!this.f47909a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f47917l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f47921p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f47917l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f47917l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f47911c;
        }
        if (this.f47913g == -1) {
            this.f47913g = this.f47911c;
        }
        if (z10) {
            this.f47913g += i10;
        }
        this.f47911c += i10;
        View view = this.f47909a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).f48005c = true;
        }
    }

    public final void o() {
        this.f47917l = 0;
        int i10 = this.f47911c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f47911c = -1;
        this.d = -1;
        this.e = -1L;
        this.f47913g = -1;
        this.f47920o = 0;
        this.f47915j = null;
        this.f47916k = null;
        ArrayList arrayList = this.f47918m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f47917l &= -1025;
        this.f47923r = 0;
        this.f47924s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f47917l = (i10 & i11) | (this.f47917l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f47920o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f47920o = i10;
        if (i10 >= 0) {
            if (!z10 && i10 == 1) {
                this.f47917l |= 16;
                return;
            } else if (z10 && i10 == 0) {
                this.f47917l &= -17;
                return;
            } else {
                return;
            }
        }
        this.f47920o = 0;
        boolean z11 = v2.f18578a;
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }

    public final boolean r() {
        if ((this.f47917l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f47917l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f47911c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f47913g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f47922q) {
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
        if ((this.f47917l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f47920o + ")");
        }
        if ((this.f47917l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f47909a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
